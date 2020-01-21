package typings.firebaseFirestore.sharedClientStateMod

import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.firebaseFirestoreStrings.acknowledged
import typings.firebaseFirestore.firebaseFirestoreStrings.rejected
import typings.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
import typings.firebaseFirestore.sharedClientStateSyncerMod.SharedClientStateSyncer
import typings.firebaseFirestore.sortedSetMod.SortedSet
import typings.firebaseFirestore.typesMod.BatchId
import typings.firebaseFirestore.typesMod.ListenSequenceNumber
import typings.firebaseFirestore.typesMod.OnlineState
import typings.firebaseFirestore.typesMod.TargetId
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedClientState extends js.Object {
  var onlineStateHandler: (js.Function1[/* onlineState */ OnlineState, Unit]) | Null = js.native
  var sequenceNumberHandler: (js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) | Null = js.native
  var syncEngine: SharedClientStateSyncer | Null = js.native
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
  /** Removes the Query Target ID association from the local client. */
  def removeLocalQueryTarget(targetId: TargetId): Unit = js.native
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
  @JSName("updateMutationState")
  def updateMutationState_acknowledged(batchId: BatchId, state: acknowledged): Unit = js.native
  @JSName("updateMutationState")
  def updateMutationState_acknowledged(batchId: BatchId, state: acknowledged, error: FirestoreError): Unit = js.native
  @JSName("updateMutationState")
  def updateMutationState_rejected(batchId: BatchId, state: rejected): Unit = js.native
  @JSName("updateMutationState")
  def updateMutationState_rejected(batchId: BatchId, state: rejected, error: FirestoreError): Unit = js.native
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

