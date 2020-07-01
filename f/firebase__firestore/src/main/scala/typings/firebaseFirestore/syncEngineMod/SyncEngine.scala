package typings.firebaseFirestore.syncEngineMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typings.firebaseFirestore.coreTransactionMod.Transaction
import typings.firebaseFirestore.datastoreMod.Datastore
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.localStoreMod.LocalStore
import typings.firebaseFirestore.mutationBatchMod.MutationBatchResult
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.objMapMod.ObjectMap
import typings.firebaseFirestore.promiseMod.Deferred
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.referenceSetMod.ReferenceSet
import typings.firebaseFirestore.remoteEventMod.RemoteEvent
import typings.firebaseFirestore.remoteStoreMod.RemoteStore
import typings.firebaseFirestore.remoteSyncerMod.RemoteSyncer
import typings.firebaseFirestore.sharedClientStateMod.SharedClientState
import typings.firebaseFirestore.sortedMapMod.SortedMap
import typings.firebaseFirestore.typesMod.BatchId
import typings.firebaseFirestore.typesMod.OnlineState
import typings.firebaseFirestore.typesMod.OnlineStateSource
import typings.firebaseFirestore.typesMod.TargetId
import typings.firebaseFirestore.userMod.User
import typings.firebaseFirestore.viewMod.LimboDocumentChange
import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import typings.std.Error
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/sync_engine", "SyncEngine")
@js.native
class SyncEngine protected () extends RemoteSyncer {
  def this(
    localStore: LocalStore,
    remoteStore: RemoteStore,
    datastore: Datastore,
    sharedClientState: SharedClientState,
    currentUser: User,
    maxConcurrentLimboResolutions: Double
  ) = this()
  /**
    * Keeps track of the information about an active limbo resolution for each
    * active target ID that was started for the purpose of limbo resolution.
    */
  var activeLimboResolutionsByTarget: Map[Double, LimboResolution] = js.native
  /**
    * Keeps track of the target ID for each document that is in limbo with an
    * active target.
    */
  var activeLimboTargetsByKey: SortedMap[DocumentKey, Double] = js.native
  var addMutationCallback: js.Any = js.native
  var currentUser: js.Any = js.native
  var datastore: Datastore = js.native
  /**
    * The keys of documents that are in limbo for which we haven't yet started a
    * limbo resolution query.
    */
  var enqueuedLimboResolutions: js.Any = js.native
  var limboDocumentRefs: ReferenceSet = js.native
  var limboTargetIdGenerator: js.Any = js.native
  var localStore: LocalStore = js.native
  var maxConcurrentLimboResolutions: js.Any = js.native
  /** Stores user completion handlers, indexed by User and BatchId. */
  var mutationUserCallbacks: js.Any = js.native
  var onlineState: js.Any = js.native
  /** Stores user callbacks waiting for all pending writes to be acknowledged. */
  var pendingWritesCallbacks: js.Any = js.native
  /**
    * Starts listens for documents in limbo that are enqueued for resolution,
    * subject to a maximum number of concurrent resolutions.
    *
    * Without bounding the number of concurrent resolutions, the server can fail
    * with "resource exhausted" errors which can lead to pathological client
    * behavior as seen in https://github.com/firebase/firebase-js-sdk/issues/2683.
    */
  var pumpEnqueuedLimboResolutions: js.Any = js.native
  var queriesByTarget: Map[Double, js.Array[Query]] = js.native
  var queryViewsByQuery: ObjectMap[Query, QueryView] = js.native
  /** Reject all outstanding callbacks waiting for pending writes to complete. */
  var rejectOutstandingPendingWritesCallbacks: js.Any = js.native
  var remoteStore: RemoteStore = js.native
  var removeLimboTarget: js.Any = js.native
  var sharedClientState: SharedClientState = js.native
  var syncEngineListener: SyncEngineListener | Null = js.native
  var trackLimboChange: js.Any = js.native
  /**
    * Triggers the callbacks that are waiting for this batch id to get acknowledged by server,
    * if there are any.
    */
  var triggerPendingWritesCallbacks: js.Any = js.native
  def activeLimboDocumentResolutions(): SortedMap[DocumentKey, TargetId] = js.native
  /**
    * Applies an OnlineState change to the sync engine and notifies any views of
    * the change.
    */
  def applyOnlineStateChange(onlineState: OnlineState, source: OnlineStateSource): Unit = js.native
  /**
    * Applies one remote event to the sync engine, notifying any views of the
    * changes, and releasing any pending mutation batches that would become
    * visible because of the snapshot version the remote event contains.
    */
  /* CompleteClass */
  override def applyRemoteEvent(remoteEvent: RemoteEvent): js.Promise[Unit] = js.native
  /**
    * Applies the result of a successful write of a mutation batch to the sync
    * engine, emitting snapshots in any views that the mutation applies to, and
    * removing the batch from the mutation queue.
    */
  /* CompleteClass */
  override def applySuccessfulWrite(result: MutationBatchResult): js.Promise[Unit] = js.native
  /* protected */ def assertSubscribed(fnName: String): Unit = js.native
  def disableNetwork(): js.Promise[Unit] = js.native
  /* protected */ def emitNewSnapsAndNotifyLocalStore(changes: MaybeDocumentMap_): js.Promise[Unit] = js.native
  /* protected */ def emitNewSnapsAndNotifyLocalStore(changes: MaybeDocumentMap_, remoteEvent: RemoteEvent): js.Promise[Unit] = js.native
  def enableNetwork(): js.Promise[Unit] = js.native
  def enqueuedLimboDocumentResolutions(): js.Array[DocumentKey] = js.native
  /**
    * Returns the set of remote document keys for the given target ID. This list
    * includes the documents that were assigned to the target when we received
    * the last snapshot.
    */
  /* CompleteClass */
  override def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_ = js.native
  /**
    * Updates all local state to match the pending mutations for the given user.
    * May be called repeatedly for the same user.
    */
  /* CompleteClass */
  override def handleCredentialChange(user: User): js.Promise[Unit] = js.native
  /**
    * Registers a view for a previously unknown query and computes its initial
    * snapshot.
    */
  /* protected */ def initializeViewAndComputeSnapshot(query: Query, targetId: TargetId, current: Boolean): js.Promise[ViewSnapshot] = js.native
  def isPrimaryClient: Boolean = js.native
  /**
    * Initiates the new listen, resolves promise when listen enqueued to the
    * server. All the subsequent view snapshots or errors are sent to the
    * subscribed handlers. Returns the initial snapshot.
    */
  def listen(query: Query): js.Promise[ViewSnapshot] = js.native
  /* protected */ def processUserCallback(batchId: BatchId): Unit = js.native
  /**
    * Resolves or rejects the user callback for the given batch and then discards
    * it.
    */
  /* protected */ def processUserCallback(batchId: BatchId, error: Error): Unit = js.native
  /**
    * Registers a user callback that resolves when all pending mutations at the moment of calling
    * are acknowledged .
    */
  def registerPendingWritesCallback(callback: Deferred[Unit]): js.Promise[Unit] = js.native
  /**
    * Rejects the batch, removing the batch from the mutation queue, recomputing
    * the local view of any documents affected by the batch and then, emitting
    * snapshots with the reverted value.
    */
  /* CompleteClass */
  override def rejectFailedWrite(batchId: BatchId, error: FirestoreError): js.Promise[Unit] = js.native
  /**
    * Rejects the listen for the given targetID. This can be triggered by the
    * backend for any active target.
    *
    * @param targetId The targetID corresponds to one previously initiated by the
    * user as part of TargetData passed to listen() on RemoteStore.
    * @param error A description of the condition that has forced the rejection.
    * Nearly always this will be an indication that the user is no longer
    * authorized to see the data matching the target.
    */
  /* CompleteClass */
  override def rejectListen(targetId: TargetId, error: FirestoreError): js.Promise[Unit] = js.native
  /* protected */ def removeAndCleanupTarget(targetId: Double): Unit = js.native
  /* protected */ def removeAndCleanupTarget(targetId: Double, error: Error): Unit = js.native
  /**
    * Takes an updateFunction in which a set of reads and writes can be performed
    * atomically. In the updateFunction, the client can read and write values
    * using the supplied transaction object. After the updateFunction, all
    * changes will be committed. If a retryable error occurs (ex: some other
    * client has changed any of the data referenced), then the updateFunction
    * will be called again after a backoff. If the updateFunction still fails
    * after all retries, then the transaction will be rejected.
    *
    * The transaction object passed to the updateFunction contains methods for
    * accessing documents and collections. Unlike other datastore access, data
    * accessed with the transaction will not reflect local changes that have not
    * been committed. For this reason, it is required that all reads are
    * performed before any writes. Transactions must be performed while online.
    *
    * The Deferred input is resolved when the transaction is fully committed.
    */
  def runTransaction[T](
    asyncQueue: AsyncQueue,
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    deferred: Deferred[T]
  ): Unit = js.native
  /** Subscribes to SyncEngine notifications. Has to be called exactly once. */
  def subscribe(syncEngineListener: SyncEngineListener): Unit = js.native
  /** Stops listening to the query. */
  def unlisten(query: Query): js.Promise[Unit] = js.native
  /* protected */ def updateTrackedLimbos(targetId: TargetId, limboChanges: js.Array[LimboDocumentChange]): Unit = js.native
  /**
    * Initiates the write of local mutation batch which involves adding the
    * writes to the mutation queue, notifying the remote store about new
    * mutations and raising events for any changes this write caused.
    *
    * The promise returned by this call is resolved when the above steps
    * have completed, *not* when the write was acked by the backend. The
    * userCallback is resolved once the write was acked/rejected by the
    * backend (or failed locally for any other reason).
    */
  def write(batch: js.Array[Mutation], userCallback: Deferred[Unit]): js.Promise[Unit] = js.native
}

