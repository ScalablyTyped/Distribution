package typings.firebaseFirestore

import typings.firebaseFirestore.apiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.coreEventManagerMod.ListenOptions
import typings.firebaseFirestore.coreEventManagerMod.Observer
import typings.firebaseFirestore.coreEventManagerMod.QueryListener
import typings.firebaseFirestore.coreQueryMod.Query
import typings.firebaseFirestore.coreTransactionMod.Transaction
import typings.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.localPersistenceMod.PersistenceProvider
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.modelMutationMod.Mutation
import typings.firebaseFirestore.platformPlatformMod.Platform
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/firestore_client", JSImport.Namespace)
@js.native
object coreFirestoreClientMod extends js.Object {
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
    var gcScheduler: js.Any = js.native
    var handleCredentialChange: js.Any = js.native
    /**
      * Initializes persistent storage, attempting to use IndexedDB if
      * usePersistence is true or memory-only if false.
      *
      * If IndexedDB fails because it's already open in another tab or because the
      * platform can't possibly support our implementation then this method rejects
      * the persistenceResult and falls back on memory-only persistence.
      *
      * @param persistenceProvider The provider that provides either IndexedDb or
      *     memory-backed persistence
      * @param persistenceSettings Settings object to configure offline persistence
      * @param user The initial user
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
    var persistence: js.Any = js.native
    var platform: js.Any = js.native
    var remoteStore: js.Any = js.native
    var sharedClientState: js.Any = js.native
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
      * @param persistenceProvider Provider that returns the persistence
      *    implementation.
      * @param persistenceSettings Settings object to configure offline
      *     persistence.
      * @returns A deferred result indicating the user-visible result of enabling
      *     offline persistence. This method will reject this if IndexedDB fails to
      *     start for any reason. If usePersistence is false this is
      *     unconditionally resolved.
      */
    def start(persistenceProvider: PersistenceProvider, persistenceSettings: PersistenceSettings): js.Promise[Unit] = js.native
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.AnonDurable
    - typings.firebaseFirestore.AnonCacheSizeBytes
  */
  trait PersistenceSettings extends js.Object
  
}

