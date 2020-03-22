package typings.firebaseFirestore.localStoreMod

import typings.firebaseFirestore.byteStringMod.ByteString
import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.localViewChangesMod.LocalViewChanges
import typings.firebaseFirestore.lruGarbageCollectorMod.LruGarbageCollector
import typings.firebaseFirestore.lruGarbageCollectorMod.LruResults
import typings.firebaseFirestore.mutationBatchMod.MutationBatch
import typings.firebaseFirestore.mutationBatchMod.MutationBatchResult
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.persistenceMod.Persistence
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.queryEngineMod.QueryEngine
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.remoteEventMod.RemoteEvent
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.targetMod.Target
import typings.firebaseFirestore.typesMod.BatchId
import typings.firebaseFirestore.typesMod.TargetId
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/local_store", "LocalStore")
@js.native
class LocalStore protected () extends js.Object {
  def this(
    /** Manages our in-memory or durable persistence. */
  persistence: Persistence,
    queryEngine: QueryEngine,
    initialUser: User
  ) = this()
  var applyWriteToRemoteDocuments: js.Any = js.native
  /**
    * The read time of the last entry processed by `getNewDocumentChanges()`.
    *
    * PORTING NOTE: This is only used for multi-tab synchronization.
    */
  var lastDocumentChangeReadTime: js.Any = js.native
  /**
    * The "local" view of all documents (layering mutationQueue on top of
    * remoteDocumentCache).
    */
  var localDocuments: js.Any = js.native
  /**
    * The set of document references maintained by any local views.
    */
  var localViewReferences: js.Any = js.native
  /**
    * The set of all mutations that have been sent but not yet been applied to
    * the backend.
    */
  var mutationQueue: js.Any = js.native
  /** Manages our in-memory or durable persistence. */
  var persistence: js.Any = js.native
  var queryEngine: js.Any = js.native
  /** The set of all cached remote documents. */
  var remoteDocuments: js.Any = js.native
  /** Maps a target to its `TargetData`. */
  var targetCache: js.Any = js.native
  /**
    * Maps a targetID to data about its target.
    *
    * PORTING NOTE: We are using an immutable data structure on Web to make re-runs
    * of `applyRemoteEvent()` idempotent.
    */
  var targetDataByTarget: js.Any = js.native
  /** Maps a target to its targetID. */
  var targetIdByTarget: js.Any = js.native
  /**
    * Acknowledge the given batch.
    *
    * On the happy path when a batch is acknowledged, the local store will
    *
    *  + remove the batch from the mutation queue;
    *  + apply the changes to the remote document cache;
    *  + recalculate the latency compensated view implied by those changes (there
    *    may be mutations in the queue that affect the documents but haven't been
    *    acknowledged yet); and
    *  + give the changed documents back the sync engine
    *
    * @returns The resulting (modified) documents.
    */
  def acknowledgeBatch(batchResult: MutationBatchResult): js.Promise[MaybeDocumentMap_] = js.native
  /**
    * Assigns the given target an internal ID so that its results can be pinned so
    * they don't get GC'd. A target must be allocated in the local store before
    * the store can be used to manage its view.
    *
    * Allocating an already allocated `Target` will return the existing `TargetData`
    * for that `Target`.
    */
  def allocateTarget(target: Target): js.Promise[TargetData] = js.native
  /**
    * Update the "ground-state" (remote) documents. We assume that the remote
    * event reflects any write batches that have been acknowledged or rejected
    * (i.e. we do not re-apply local mutations to updates from this event).
    *
    * LocalDocuments are re-calculated if there are remaining mutations in the
    * queue.
    */
  def applyRemoteEvent(remoteEvent: RemoteEvent): js.Promise[MaybeDocumentMap_] = js.native
  def collectGarbage(garbageCollector: LruGarbageCollector): js.Promise[LruResults] = js.native
  /**
    * Runs the specified query against the local store and returns the results,
    * potentially taking advantage of query data from previous executions (such
    * as the set of remote keys).
    *
    * @param usePreviousResults Whether results from previous executions can
    * be used to optimize this query execution.
    */
  def executeQuery(query: Query, usePreviousResults: Boolean): js.Promise[QueryResult] = js.native
  def getActiveClients(): js.Promise[js.Array[ClientId]] = js.native
  /**
    * Returns the largest (latest) batch id in mutation queue that is pending server response.
    * Returns `BATCHID_UNKNOWN` if the queue is empty.
    */
  def getHighestUnacknowledgedBatchId(): js.Promise[BatchId] = js.native
  /**
    * Returns the last consistent snapshot processed (used by the RemoteStore to
    * determine whether to buffer incoming snapshots from the backend).
    */
  def getLastRemoteSnapshotVersion(): js.Promise[SnapshotVersion] = js.native
  /** Returns the last recorded stream token for the current user. */
  def getLastStreamToken(): js.Promise[ByteString] = js.native
  /**
    * Returns the set of documents that have been updated since the last call.
    * If this is the first call, returns the set of changes since client
    * initialization. Further invocations will return document changes since
    * the point of rejection.
    */
  def getNewDocumentChanges(): js.Promise[MaybeDocumentMap_] = js.native
  def getTarget(targetId: TargetId): js.Promise[Target | Null] = js.native
  /**
    * Returns the TargetData as seen by the LocalStore, including updates that may
    * have not yet been persisted to the TargetCache.
    */
  def getTargetData(transaction: PersistenceTransaction, target: Target): PersistencePromise[TargetData | Null] = js.native
  /**
    * Tells the LocalStore that the currently authenticated user has changed.
    *
    * In response the local store switches the mutation queue to the new user and
    * returns any resulting document changes.
    */
  def handleUserChange(user: User): js.Promise[UserChangeResult] = js.native
  def localWrite(mutations: js.Array[Mutation]): js.Promise[LocalWriteResult] = js.native
  /** Returns the local view of the documents affected by a mutation batch. */
  def lookupMutationDocuments(batchId: BatchId): js.Promise[MaybeDocumentMap_ | Null] = js.native
  /**
    * Gets the mutation batch after the passed in batchId in the mutation queue
    * or null if empty.
    * @param afterBatchId If provided, the batch to search after.
    * @returns The next mutation or null if there wasn't one.
    */
  def nextMutationBatch(): js.Promise[MutationBatch | Null] = js.native
  def nextMutationBatch(afterBatchId: BatchId): js.Promise[MutationBatch | Null] = js.native
  /**
    * Notify local store of the changed views to locally pin documents.
    */
  def notifyLocalViewChanges(viewChanges: js.Array[LocalViewChanges]): js.Promise[Unit] = js.native
  /**
    * Read the current value of a Document with a given key or null if not
    * found - used for testing.
    */
  def readDocument(key: DocumentKey): js.Promise[MaybeDocument | Null] = js.native
  /**
    * Remove mutations from the MutationQueue for the specified batch;
    * LocalDocuments will be recalculated.
    *
    * @returns The resulting modified documents.
    */
  def rejectBatch(batchId: BatchId): js.Promise[MaybeDocumentMap_] = js.native
  /**
    * Unpin all the documents associated with the given target. If
    * `keepPersistedTargetData` is set to false and Eager GC enabled, the method
    * directly removes the associated target data from the target cache.
    *
    * Releasing a non-existing `Target` is a no-op.
    */
  def releaseTarget(targetId: Double, keepPersistedTargetData: Boolean): js.Promise[Unit] = js.native
  /**
    * Returns the keys of the documents that are associated with the given
    * target id in the remote table.
    */
  def remoteDocumentKeys(targetId: TargetId): js.Promise[DocumentKeySet_] = js.native
  def removeCachedMutationBatchMetadata(batchId: BatchId): Unit = js.native
  /**
    * Sets the stream token for the current user without acknowledging any
    * mutation batch. This is usually only useful after a stream handshake or in
    * response to an error that requires clearing the stream token.
    */
  def setLastStreamToken(streamToken: ByteString): js.Promise[Unit] = js.native
  def setNetworkEnabled(networkEnabled: Boolean): Unit = js.native
  /** Starts the LocalStore. */
  def start(): js.Promise[Unit] = js.native
  /**
    * Reads the newest document change from persistence and forwards the internal
    * synchronization marker so that calls to `getNewDocumentChanges()`
    * only return changes that happened after client initialization.
    */
  def synchronizeLastDocumentChangeReadTime(): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/local/local_store", "LocalStore")
@js.native
object LocalStore extends js.Object {
  /**
    * The maximum time to leave a resume token buffered without writing it out.
    * This value is arbitrary: it's long enough to avoid several writes
    * (possibly indefinitely if updates come more frequently than this) but
    * short enough that restarting after crashing will still have a pretty
    * recent resume token.
    */
  val RESUME_TOKEN_MAX_AGE_MICROS: js.Any = js.native
  /**
    * Returns true if the newTargetData should be persisted during an update of
    * an active target. TargetData should always be persisted when a target is
    * being released and should not call this function.
    *
    * While the target is active, TargetData updates can be omitted when nothing
    * about the target has changed except metadata like the resume token or
    * snapshot version. Occasionally it's worth the extra write to prevent these
    * values from getting too stale after a crash, but this doesn't have to be
    * too frequent.
    */
  var shouldPersistTargetData: js.Any = js.native
}

