package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcAuthUserMod.User
import typings.firebaseFirestore.firestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.firestoreSrcCoreListenSequenceMod.SequenceNumberSyncer
import typings.firebaseFirestore.firestoreSrcLocalBundleCacheMod.BundleCache
import typings.firebaseFirestore.firestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typings.firebaseFirestore.firestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.firestoreSrcLocalIndexeddbLruDelegateImplMod.IndexedDbLruDelegateImpl
import typings.firebaseFirestore.firestoreSrcLocalLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.firestoreSrcLocalMutationQueueMod.MutationQueue
import typings.firebaseFirestore.firestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.firestoreSrcLocalPersistenceMod.PrimaryStateListener
import typings.firebaseFirestore.firestoreSrcLocalPersistenceMod.ReferenceDelegate
import typings.firebaseFirestore.firestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.firestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.firestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
import typings.firebaseFirestore.firestoreSrcLocalRemoteDocumentCacheMod.RemoteDocumentCache
import typings.firebaseFirestore.firestoreSrcLocalSharedClientStateMod.ClientId
import typings.firebaseFirestore.firestoreSrcLocalTargetCacheMod.TargetCache
import typings.firebaseFirestore.firestoreSrcUtilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestore.packagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.packagesFirestoreSrcUtilTypesMod.DocumentLike
import typings.firebaseFirestore.packagesFirestoreSrcUtilTypesMod.WindowLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcLocalIndexeddbPersistenceMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_persistence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_persistence", "IndexedDbPersistence")
  @js.native
  open class IndexedDbPersistence protected ()
    extends StObject
       with Persistence {
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: Null,
      document: Null,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: Null,
      document: DocumentLike,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: WindowLike,
      document: Null,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: WindowLike,
      document: DocumentLike,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: Null,
      document: Null,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean,
      schemaVersion: Double
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: Null,
      document: DocumentLike,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean,
      schemaVersion: Double
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: WindowLike,
      document: Null,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean,
      schemaVersion: Double
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: WindowLike,
      document: DocumentLike,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean,
      schemaVersion: Double
    ) = this()
    
    /* private */ var _started: Any = js.native
    
    /**
      * Obtains or extends the new primary lease for the local client. This
      * method does not verify that the client is eligible for this lease.
      */
    /* private */ var acquireOrExtendPrimaryLease: Any = js.native
    
    /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    /* private */ val allowTabSynchronization: Any = js.native
    
    /* private */ var attachVisibilityHandler: Any = js.native
    
    /**
      * Attaches a window.unload handler that will synchronously write our
      * clientId to a "zombie client id" location in LocalStorage. This can be used
      * by tabs trying to acquire the primary lease to determine that the lease
      * is no longer valid even if the timestamp is recent. This is particularly
      * important for the refresh case (so the tab correctly re-acquires the
      * primary lease). LocalStorage is used for this rather than IndexedDb because
      * it is a synchronous API and so can be used reliably from  an unload
      * handler.
      */
    /* private */ var attachWindowUnloadHook: Any = js.native
    
    /* private */ val bundleCache: Any = js.native
    
    /**
      * Evaluate the state of all active clients and determine whether the local
      * client is or can act as the holder of the primary lease. Returns whether
      * the client is eligible for the lease, but does not actually acquire it.
      * May return 'false' even if there is no active leaseholder and another
      * (foreground) client should become leaseholder instead.
      */
    /* private */ var canActAsPrimary: Any = js.native
    
    /* private */ val clientId: Any = js.native
    
    /** The client metadata refresh task. */
    /* private */ var clientMetadataRefresher: Any = js.native
    
    /* private */ var dbName: Any = js.native
    
    /* private */ var detachVisibilityHandler: Any = js.native
    
    /* private */ var detachWindowUnloadHook: Any = js.native
    
    /* private */ val document: Any = js.native
    
    /** Our 'visibilitychange' listener if registered. */
    /* private */ var documentVisibilityHandler: Any = js.native
    
    /**
      * Returns clients that are not zombied and have an updateTime within the
      * provided threshold.
      */
    /* private */ var filterActiveClients: Any = js.native
    
    /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    /* private */ val forceOwningTab: Any = js.native
    
    /**
      * Returns the IDs of the clients that are currently active. If multi-tab
      * is not supported, returns an array that only contains the local client's
      * ID.
      *
      * PORTING NOTE: This is only used for Web multi-tab.
      */
    def getActiveClients(): js.Promise[js.Array[ClientId]] = js.native
    
    /**
      * Returns a BundleCache representing the persisted cache of loaded bundles.
      *
      * Note: The implementation is free to return the same instance every time
      * this is called. In particular, the memory-backed implementation does this
      * to emulate the persisted implementation to the extent possible.
      */
    /* CompleteClass */
    override def getBundleCache(): BundleCache = js.native
    
    /**
      * Returns a DocumentOverlayCache representing the documents that are mutated
      * locally.
      */
    /* CompleteClass */
    override def getDocumentOverlayCache(user: User): DocumentOverlayCache = js.native
    
    /**
      * Returns an IndexManager instance that manages our persisted query indexes.
      *
      * Note: The implementation is free to return the same instance every time
      * this is called. In particular, the memory-backed implementation does this
      * to emulate the persisted implementation to the extent possible.
      */
    /* CompleteClass */
    override def getIndexManager(user: User): IndexManager = js.native
    
    /**
      * Returns a MutationQueue representing the persisted mutations for the
      * given user.
      *
      * Note: The implementation is free to return the same instance every time
      * this is called for a given user. In particular, the memory-backed
      * implementation does this to emulate the persisted implementation to the
      * extent possible (e.g. in the case of uid switching from
      * sally=&gt;jack=&gt;sally, sally's mutation queue will be preserved).
      */
    /* CompleteClass */
    override def getMutationQueue(user: User, indexManager: IndexManager): MutationQueue = js.native
    
    /**
      * Returns a RemoteDocumentCache representing the persisted cache of remote
      * documents.
      *
      * Note: The implementation is free to return the same instance every time
      * this is called. In particular, the memory-backed implementation does this
      * to emulate the persisted implementation to the extent possible.
      */
    /* CompleteClass */
    override def getRemoteDocumentCache(): RemoteDocumentCache = js.native
    
    /**
      * Returns a TargetCache representing the persisted cache of targets.
      *
      * Note: The implementation is free to return the same instance every time
      * this is called. In particular, the memory-backed implementation does this
      * to emulate the persisted implementation to the extent possible.
      */
    /* CompleteClass */
    override def getTargetCache(): TargetCache = js.native
    
    /* private */ var inForeground: Any = js.native
    
    /**
      * Returns whether a client is "zombied" based on its LocalStorage entry.
      * Clients become zombied when their tab closes without running all of the
      * cleanup logic in `shutdown()`.
      */
    /* private */ var isClientZombied: Any = js.native
    
    /** Checks whether `client` is the local client. */
    /* private */ var isLocalClient: Any = js.native
    
    /* private */ var isPrimary: Any = js.native
    
    /** Verifies that `updateTimeMs` is within `maxAgeMs`. */
    /* private */ var isWithinAge: Any = js.native
    
    /** The last time we garbage collected the client metadata object store. */
    /* private */ var lastGarbageCollectionTime: Any = js.native
    
    /* private */ var listenSequence: Any = js.native
    
    /**
      * Record client as zombied (a client that had its tab closed). Zombied
      * clients are ignored during primary tab selection.
      */
    /* private */ var markClientZombied: Any = js.native
    
    /**
      * If the garbage collection threshold has passed, prunes the
      * RemoteDocumentChanges and the ClientMetadata store based on the last update
      * time of all clients.
      */
    /* private */ var maybeGarbageCollectMultiClientState: Any = js.native
    
    /* private */ var networkEnabled: Any = js.native
    
    /* private */ val persistenceKey: Any = js.native
    
    /** A listener to notify on primary state changes. */
    /* private */ var primaryStateListener: Any = js.native
    
    /* private */ val queue: Any = js.native
    
    /* CompleteClass */
    override val referenceDelegate: ReferenceDelegate = js.native
    @JSName("referenceDelegate")
    val referenceDelegate_IndexedDbPersistence: IndexedDbLruDelegateImpl = js.native
    
    /** Checks the primary lease and removes it if we are the current primary. */
    /* private */ var releasePrimaryLeaseIfHeld: Any = js.native
    
    /* private */ val remoteDocumentCache: Any = js.native
    
    /* private */ var removeClientMetadata: Any = js.native
    
    /** Removes the zombied client entry if it exists. */
    /* private */ var removeClientZombiedEntry: Any = js.native
    
    /**
      * Performs an operation inside a persistence transaction. Any reads or writes
      * against persistence must be performed within a transaction. Writes will be
      * committed atomically once the transaction completes.
      *
      * Persistence operations are asynchronous and therefore the provided
      * transactionOperation must return a PersistencePromise. When it is resolved,
      * the transaction will be committed and the Promise returned by this method
      * will resolve.
      *
      * @param action - A description of the action performed by this transaction,
      * used for logging.
      * @param mode - The underlying mode of the IndexedDb transaction. Can be
      * 'readonly', 'readwrite' or 'readwrite-primary'. Transactions marked
      * 'readwrite-primary' can only be executed by the primary client. In this
      * mode, the transactionOperation will not be run if the primary lease cannot
      * be acquired and the returned promise will be rejected with a
      * FAILED_PRECONDITION error.
      * @param transactionOperation - The operation to run inside a transaction.
      * @returns A `Promise` that is resolved once the transaction completes.
      */
    /* CompleteClass */
    override def runTransaction[T](
      action: String,
      mode: PersistenceTransactionMode,
      transactionOperation: js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[T]]
    ): js.Promise[T] = js.native
    
    /**
      * Schedules a recurring timer to update the client metadata and to either
      * extend or acquire the primary lease if the client is eligible.
      */
    /* private */ var scheduleClientMetadataAndPrimaryLeaseRefreshes: Any = js.native
    
    /* private */ val schemaVersion: Any = js.native
    
    /* private */ val sequenceNumberSyncer: Any = js.native
    
    /* private */ var serializer: Any = js.native
    
    /**
      * Registers a listener that gets called when the database receives a
      * version change event indicating that it has deleted.
      *
      * PORTING NOTE: This is only used for Web multi-tab.
      */
    /* CompleteClass */
    override def setDatabaseDeletedListener(databaseDeletedListener: js.Function0[js.Promise[Unit]]): Unit = js.native
    
    /**
      * Adjusts the current network state in the client's metadata, potentially
      * affecting the primary lease.
      *
      * PORTING NOTE: This is only used for Web multi-tab.
      */
    /* CompleteClass */
    override def setNetworkEnabled(networkEnabled: Boolean): Unit = js.native
    
    /**
      * Registers a listener that gets called when the primary state of the
      * instance changes. Upon registering, this listener is invoked immediately
      * with the current primary state.
      *
      * PORTING NOTE: This is only used for Web multi-tab.
      */
    def setPrimaryStateListener(primaryStateListener: PrimaryStateListener): js.Promise[Unit] = js.native
    
    /**
      * Releases any resources held during eager shutdown.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
    
    /* private */ var simpleDb: Any = js.native
    
    /** Starts persistence. */
    /* CompleteClass */
    override def start(): js.Promise[Unit] = js.native
    
    /**
      * Whether or not this persistence instance has been started.
      */
    /* CompleteClass */
    override val started: Boolean = js.native
    @JSName("started")
    def started_MIndexedDbPersistence: Boolean = js.native
    
    /* private */ val targetCache: Any = js.native
    
    /**
      * Updates the client metadata in IndexedDb and attempts to either obtain or
      * extend the primary lease for the local client. Asynchronously notifies the
      * primary state listener if the client either newly obtained or released its
      * primary lease.
      */
    /* private */ var updateClientMetadataAndTryBecomePrimary: Any = js.native
    
    /**
      * Verifies that the current tab is the primary leaseholder or alternatively
      * that the leaseholder has opted into multi-tab synchronization.
      */
    /* private */ var verifyAllowTabSynchronization: Any = js.native
    
    /* private */ var verifyPrimaryLease: Any = js.native
    
    /* private */ val webStorage: Any = js.native
    
    /* private */ val window: Any = js.native
    
    /** Our window.unload handler, if registered. */
    /* private */ var windowUnloadHandler: Any = js.native
    
    /* private */ var zombiedClientLocalStorageKey: Any = js.native
  }
  /* static members */
  object IndexedDbPersistence {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_persistence", "IndexedDbPersistence")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_persistence", "MAIN_DATABASE")
  @js.native
  val MAIN_DATABASE: /* "main" */ String = js.native
  
  inline def indexedDbClearPersistence(persistenceKey: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexedDbClearPersistence")(persistenceKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def indexedDbStoragePrefix(databaseId: DatabaseId, persistenceKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indexedDbStoragePrefix")(databaseId.asInstanceOf[js.Any], persistenceKey.asInstanceOf[js.Any])).asInstanceOf[String]
}
