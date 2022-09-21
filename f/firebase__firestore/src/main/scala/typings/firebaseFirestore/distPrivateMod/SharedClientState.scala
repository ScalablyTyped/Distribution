package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.acknowledged
import typings.firebaseFirestore.firebaseFirestoreStrings.rejected
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `SharedClientState` keeps track of the global state of the mutations
  * and query targets for all active clients with the same persistence key (i.e.
  * project ID and FirebaseApp name). It relays local changes to other clients
  * and updates its local state as new state is observed.
  *
  * `SharedClientState` is primarily used for synchronization in Multi-Tab
  * environments. Each tab is responsible for registering its active query
  * targets and mutations. `SharedClientState` will then notify the listener
  * assigned to `.syncEngine` for updates to mutations and queries that
  * originated in other clients.
  *
  * To receive notifications, `.syncEngine` and `.onlineStateHandler` has to be
  * assigned before calling `start()`.
  */
@js.native
trait SharedClientState extends StObject {
  
  /**
    * Associates a new Query Target ID with the local Firestore client. Returns
    * the new query state for the query (which can be 'current' if the query is
    * already associated with another tab).
    *
    * If the target id is already associated with local client, the method simply
    * returns its `QueryTargetState`.
    */
  def addLocalQueryTarget(targetId: TargetId): QueryTargetState = js.native
  
  /** Registers the Mutation Batch ID of a newly pending mutation. */
  def addPendingMutation(batchId: BatchId): Unit = js.native
  
  /**
    * Removes the target's metadata entry.
    *
    * Called by the primary client when all clients stopped listening to a query
    * target.
    */
  def clearQueryState(targetId: TargetId): Unit = js.native
  
  /**
    * Gets the active Query Targets IDs for all active clients.
    *
    * The implementation for this may require O(n) runtime, where 'n' is the size
    * of the result set.
    */
  def getAllActiveQueryTargets(): SortedSet[TargetId] = js.native
  
  /**
    * Changes the active user and removes all existing user-specific data. The
    * user change does not call back into SyncEngine (for example, no mutations
    * will be marked as removed).
    */
  def handleUserChange(user: User, removedBatchIds: js.Array[BatchId], addedBatchIds: js.Array[BatchId]): Unit = js.native
  
  /**
    * Checks whether the provided target ID is currently being listened to by
    * any of the active clients.
    *
    * The implementation may require O(n*log m) runtime, where 'n' is the number
    * of clients and 'm' the number of targets.
    */
  def isActiveQueryTarget(targetId: TargetId): Boolean = js.native
  
  /** Checks whether the target is associated with the local client. */
  def isLocalQueryTarget(targetId: TargetId): Boolean = js.native
  
  /**
    * Notifies other clients when remote documents have changed due to loading
    * a bundle.
    *
    * @param collectionGroups The collection groups affected by this bundle.
    */
  def notifyBundleLoaded(collectionGroups: Set[String]): Unit = js.native
  
  var onlineStateHandler: (js.Function1[/* onlineState */ OnlineState, Unit]) | Null = js.native
  
  /** Removes the Query Target ID association from the local client. */
  def removeLocalQueryTarget(targetId: TargetId): Unit = js.native
  
  var sequenceNumberHandler: (js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) | Null = js.native
  
  /** Changes the shared online state of all clients. */
  def setOnlineState(onlineState: OnlineState): Unit = js.native
  
  /** Shuts down the `SharedClientState` and its listeners. */
  def shutdown(): Unit = js.native
  
  /**
    * Starts the SharedClientState, reads existing client data and registers
    * listeners for updates to new and existing clients.
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Records that a pending mutation has been acknowledged or rejected.
    * Called by the primary client to notify secondary clients of mutation
    * results as they come back from the backend.
    */
  def updateMutationState(batchId: BatchId, state: acknowledged | rejected): Unit = js.native
  def updateMutationState(batchId: BatchId, state: acknowledged | rejected, error: FirestoreError): Unit = js.native
  
  /**
    * Processes an update to a query target.
    *
    * Called by the primary client to notify secondary clients of document
    * changes or state transitions that affect the provided query target.
    */
  def updateQueryState(targetId: TargetId, state: QueryTargetState): Unit = js.native
  def updateQueryState(targetId: TargetId, state: QueryTargetState, error: FirestoreError): Unit = js.native
  
  def writeSequenceNumber(sequenceNumber: ListenSequenceNumber): Unit = js.native
}
