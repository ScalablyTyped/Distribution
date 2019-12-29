package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcApiCredentialsMod.CredentialsProvider
import typings.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseId
import typings.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseInfo
import typings.atFirebaseFirestore.distSrcCoreEventUnderscoreManagerMod.ListenOptions
import typings.atFirebaseFirestore.distSrcCoreEventUnderscoreManagerMod.Observer
import typings.atFirebaseFirestore.distSrcCoreEventUnderscoreManagerMod.QueryListener
import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typings.atFirebaseFirestore.distSrcCoreTransactionMod.Transaction
import typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import typings.atFirebaseFirestore.distSrcLocalLruUnderscoreGarbageUnderscoreCollectorMod.LruParams
import typings.atFirebaseFirestore.distSrcModelDocumentMod.Document
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typings.atFirebaseFirestore.distSrcModelMutationMod.Mutation
import typings.atFirebaseFirestore.distSrcPlatformPlatformMod.Platform
import typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/firestore_client", JSImport.Namespace)
@js.native
object distSrcCoreFirestoreUnderscoreClientMod extends js.Object {
  @js.native
  class FirestoreClient protected () extends js.Object {
    def this(
      platform: Platform,
      databaseInfo: DatabaseInfo,
      credentials: CredentialsProvider,
      /**
      * Asynchronous queue responsible for all of our internal processing. When
      * we get incoming work from the user (via public API) or the network
      * (incoming GRPC messages), we should always schedule onto this queue.
      * This ensures all of our work is properly serialized (e.g. we don't
      * start processing a new operation while the previous one is waiting for
      * an async I/O to complete).
      */
    asyncQueue: AsyncQueue
    ) = this()
    /**
      * Asynchronous queue responsible for all of our internal processing. When
      * we get incoming work from the user (via public API) or the network
      * (incoming GRPC messages), we should always schedule onto this queue.
      * This ensures all of our work is properly serialized (e.g. we don't
      * start processing a new operation while the previous one is waiting for
      * an async I/O to complete).
      */
    var asyncQueue: js.Any = js.native
    /**
      * Decides whether the provided error allows us to gracefully disable
      * persistence (as opposed to crashing the client).
      */
    var canFallback: js.Any = js.native
    val clientId: js.Any = js.native
    var credentials: js.Any = js.native
    var databaseInfo: js.Any = js.native
    var eventMgr: js.Any = js.native
    var handleCredentialChange: js.Any = js.native
    /**
      * Initializes persistent storage, attempting to use IndexedDB if
      * usePersistence is true or memory-only if false.
      *
      * If IndexedDB fails because it's already open in another tab or because the
      * platform can't possibly support our implementation then this method rejects
      * the persistenceResult and falls back on memory-only persistence.
      *
      * @param persistenceSettings Settings object to configure offline persistence
      * @param persistenceResult A deferred result indicating the user-visible
      *     result of enabling offline persistence. This method will reject this if
      *     IndexedDB fails to start for any reason. If usePersistence is false
      *     this is unconditionally resolved.
      * @returns a Promise indicating whether or not initialization should
      *     continue, i.e. that one of the persistence implementations actually
      *     succeeded.
      */
    var initializePersistence: js.Any = js.native
    /**
      * Initializes the rest of the FirestoreClient, assuming the initial user
      * has been obtained from the credential provider and some persistence
      * implementation is available in this.persistence.
      */
    var initializeRest: js.Any = js.native
    var localStore: js.Any = js.native
    var lruScheduler: js.UndefOr[js.Any] = js.native
    var persistence: js.Any = js.native
    var platform: js.Any = js.native
    var remoteStore: js.Any = js.native
    var sharedClientState: js.Any = js.native
    /**
      * Starts IndexedDB-based persistence.
      *
      * @returns A promise indicating success or failure.
      */
    var startIndexedDbPersistence: js.Any = js.native
    /**
      * Starts Memory-backed persistence. In practice this cannot fail.
      *
      * @returns A promise that will successfully resolve.
      */
    var startMemoryPersistence: js.Any = js.native
    var syncEngine: js.Any = js.native
    /**
      * Checks that the client has not been terminated. Ensures that other methods on
      * this class cannot be called after the client is terminated.
      */
    var verifyNotTerminated: js.Any = js.native
    def addSnapshotsInSyncListener(observer: Observer[Unit]): Unit = js.native
    def clientTerminated(): Boolean = js.native
    def databaseId(): DatabaseId = js.native
    /** Disables the network connection. Pending operations will not complete. */
    def disableNetwork(): js.Promise[Unit] = js.native
    /** Enables the network connection and requeues all pending operations. */
    def enableNetwork(): js.Promise[Unit] = js.native
    def getDocumentFromLocalCache(docKey: DocumentKey): js.Promise[Document | Null] = js.native
    def getDocumentsFromLocalCache(query: Query): js.Promise[ViewSnapshot] = js.native
    def listen(query: Query, observer: Observer[ViewSnapshot], options: ListenOptions): QueryListener = js.native
    def removeSnapshotsInSyncListener(observer: Observer[Unit]): Unit = js.native
    /**
      * Starts up the FirestoreClient, returning only whether or not enabling
      * persistence succeeded.
      *
      * The intent here is to "do the right thing" as far as users are concerned.
      * Namely, in cases where offline persistence is requested and possible,
      * enable it, but otherwise fall back to persistence disabled. For the most
      * part we expect this to succeed one way or the other so we don't expect our
      * users to actually wait on the firestore.enablePersistence Promise since
      * they generally won't care.
      *
      * Of course some users actually do care about whether or not persistence
      * was successfully enabled, so the Promise returned from this method
      * indicates this outcome.
      *
      * This presents a problem though: even before enablePersistence resolves or
      * rejects, users may have made calls to e.g. firestore.collection() which
      * means that the FirestoreClient in there will be available and will be
      * enqueuing actions on the async queue.
      *
      * Meanwhile any failure of an operation on the async queue causes it to
      * panic and reject any further work, on the premise that unhandled errors
      * are fatal.
      *
      * Consequently the fallback is handled internally here in start, and if the
      * fallback succeeds we signal success to the async queue even though the
      * start() itself signals failure.
      *
      * @param persistenceSettings Settings object to configure offline
      *     persistence.
      * @returns A deferred result indicating the user-visible result of enabling
      *     offline persistence. This method will reject this if IndexedDB fails to
      *     start for any reason. If usePersistence is false this is
      *     unconditionally resolved.
      */
    def start(persistenceSettings: InternalPersistenceSettings): js.Promise[Unit] = js.native
    def terminate(): js.Promise[Unit] = js.native
    def transaction[T](updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = js.native
    def unlisten(listener: QueryListener): Unit = js.native
    /**
      * Returns a Promise that resolves when all writes that were pending at the time this
      * method was called received server acknowledgement. An acknowledgement can be either acceptance
      * or rejection.
      */
    def waitForPendingWrites(): js.Promise[Unit] = js.native
    def write(mutations: js.Array[Mutation]): js.Promise[Unit] = js.native
  }
  
  @js.native
  class IndexedDbPersistenceSettings protected () extends InternalPersistenceSettings {
    def this(cacheSizeBytes: Double, synchronizeTabs: Boolean) = this()
    val cacheSizeBytes: Double = js.native
    val synchronizeTabs: Boolean = js.native
    def lruParams(): LruParams = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atFirebaseFirestore.distSrcCoreFirestoreUnderscoreClientMod.IndexedDbPersistenceSettings
    - typings.atFirebaseFirestore.distSrcCoreFirestoreUnderscoreClientMod.MemoryPersistenceSettings
  */
  trait InternalPersistenceSettings extends js.Object
  
  @js.native
  class MemoryPersistenceSettings () extends InternalPersistenceSettings
  
}

