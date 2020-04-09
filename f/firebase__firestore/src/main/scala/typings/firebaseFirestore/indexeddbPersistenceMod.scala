package typings.firebaseFirestore

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.firestoreClientMod.PersistenceSettings
import typings.firebaseFirestore.indexManagerMod.IndexManager
import typings.firebaseFirestore.lruGarbageCollectorMod.ActiveTargets
import typings.firebaseFirestore.lruGarbageCollectorMod.LruDelegate
import typings.firebaseFirestore.lruGarbageCollectorMod.LruGarbageCollector
import typings.firebaseFirestore.lruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.mutationQueueMod.MutationQueue
import typings.firebaseFirestore.persistenceMod.GarbageCollectionScheduler
import typings.firebaseFirestore.persistenceMod.Persistence
import typings.firebaseFirestore.persistenceMod.PersistenceProvider
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistenceMod.PersistenceTransactionMode
import typings.firebaseFirestore.persistenceMod.PrimaryStateListener
import typings.firebaseFirestore.persistenceMod.ReferenceDelegate
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.platformMod.Platform
import typings.firebaseFirestore.referenceSetMod.ReferenceSet
import typings.firebaseFirestore.remoteDocumentCacheMod.RemoteDocumentCache
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.sharedClientStateMod.SharedClientState
import typings.firebaseFirestore.simpleDbMod.SimpleDbStore
import typings.firebaseFirestore.simpleDbMod.SimpleDbTransaction
import typings.firebaseFirestore.targetCacheMod.TargetCache
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.typesMod.ListenSequenceNumber
import typings.firebaseFirestore.userMod.User
import typings.std.IDBValidKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_persistence", JSImport.Namespace)
@js.native
object indexeddbPersistenceMod extends js.Object {
  @js.native
  class IndexedDbLruDelegate protected ()
    extends ReferenceDelegate
       with LruDelegate {
    def this(db: IndexedDbPersistence, params: LruParams) = this()
    val db: js.Any = js.native
    /**
      * Call provided function for each document in the cache that is 'orphaned'. Orphaned
      * means not a part of any target, so the only entry in the target-document index for
      * that document will be the sentinel row (targetId 0), which will also have the sequence
      * number for the last time the document was accessed.
      */
    var forEachOrphanedDocument: js.Any = js.native
    /* CompleteClass */
    override val garbageCollector: LruGarbageCollector = js.native
    var inMemoryPins: js.Any = js.native
    /**
      * Returns true if anything would prevent this document from being garbage
      * collected, given that the document in question is not present in any
      * targets and has a sequence number less than or equal to the upper bound for
      * the collection run.
      */
    var isPinned: js.Any = js.native
    var orphanedDocmentCount: js.Any = js.native
    /** Notify the delegate that the given document was added to a target. */
    /* CompleteClass */
    override def addReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
    /**
      * Enumerates sequence numbers for documents not associated with a target.
      * Note that this may include duplicate sequence numbers.
      */
    /* CompleteClass */
    override def forEachOrphanedDocumentSequenceNumber(txn: PersistenceTransaction, f: js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]): PersistencePromise[Unit] = js.native
    /** Enumerates all the targets in the TargetCache. */
    /* CompleteClass */
    override def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* target */ TargetData, Unit]): PersistencePromise[Unit] = js.native
    /* CompleteClass */
    override def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
    /* CompleteClass */
    override def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
    /** Notify the delegate that a document is no longer being mutated by the user. */
    /* CompleteClass */
    override def removeMutationReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
    /**
      * Removes all unreferenced documents from the cache that have a sequence number less than or
      * equal to the given `upperBound`.
      *
      * @return the number of documents removed.
      */
    /* CompleteClass */
    override def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double] = js.native
    /** Notify the delegate that the given document was removed from a target. */
    /* CompleteClass */
    override def removeReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
    /**
      * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
      * actually delete the target and associated data.
      */
    /* CompleteClass */
    override def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
    /**
      * Removes all targets that have a sequence number less than or equal to `upperBound`, and are not
      * present in the `activeTargetIds` set.
      *
      * @return the number of targets removed.
      */
    /* CompleteClass */
    override def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
    /**
      * Registers a ReferenceSet of documents that should be considered 'referenced' and not eligible
      * for removal during garbage collection.
      */
    /* CompleteClass */
    override def setInMemoryPins(pins: ReferenceSet): Unit = js.native
    /** Notify the delegate that a limbo document was updated. */
    /* CompleteClass */
    override def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  }
  
  @js.native
  class IndexedDbPersistence protected () extends Persistence {
    var _started: js.Any = js.native
    /**
      * Obtains or extends the new primary lease for the local client. This
      * method does not verify that the client is eligible for this lease.
      */
    var acquireOrExtendPrimaryLease: js.Any = js.native
    val allowTabSynchronization: js.Any = js.native
    var attachVisibilityHandler: js.Any = js.native
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
    var attachWindowUnloadHook: js.Any = js.native
    /**
      * Evaluate the state of all active clients and determine whether the local
      * client is or can act as the holder of the primary lease. Returns whether
      * the client is eligible for the lease, but does not actually acquire it.
      * May return 'false' even if there is no active leaseholder and another
      * (foreground) client should become leaseholder instead.
      */
    var canActAsPrimary: js.Any = js.native
    val clientId: js.Any = js.native
    /** The client metadata refresh task. */
    var clientMetadataRefresher: js.Any = js.native
    var dbName: js.Any = js.native
    var detachVisibilityHandler: js.Any = js.native
    var detachWindowUnloadHook: js.Any = js.native
    val document: js.Any = js.native
    /** Our 'visibilitychange' listener if registered. */
    var documentVisibilityHandler: js.Any = js.native
    /**
      * Returns clients that are not zombied and have an updateTime within the
      * provided threshold.
      */
    var filterActiveClients: js.Any = js.native
    var inForeground: js.Any = js.native
    val indexManager: js.Any = js.native
    /**
      * Returns whether a client is "zombied" based on its LocalStorage entry.
      * Clients become zombied when their tab closes without running all of the
      * cleanup logic in `shutdown()`.
      */
    var isClientZombied: js.Any = js.native
    /** Checks whether `client` is the local client. */
    var isLocalClient: js.Any = js.native
    var isPrimary: js.Any = js.native
    /** Verifies that `updateTimeMs` is within `maxAgeMs`. */
    var isWithinAge: js.Any = js.native
    /** The last time we garbage collected the client metadata object store. */
    var lastGarbageCollectionTime: js.Any = js.native
    var listenSequence: js.Any = js.native
    /**
      * Record client as zombied (a client that had its tab closed). Zombied
      * clients are ignored during primary tab selection.
      */
    var markClientZombied: js.Any = js.native
    /**
      * If the garbage collection threshold has passed, prunes the
      * RemoteDocumentChanges and the ClientMetadata store based on the last update
      * time of all clients.
      */
    var maybeGarbageCollectMultiClientState: js.Any = js.native
    var networkEnabled: js.Any = js.native
    val persistenceKey: js.Any = js.native
    /** A listener to notify on primary state changes. */
    var primaryStateListener: js.Any = js.native
    val queue: js.Any = js.native
    /* CompleteClass */
    override val referenceDelegate: ReferenceDelegate = js.native
    @JSName("referenceDelegate")
    val referenceDelegate_IndexedDbPersistence: IndexedDbLruDelegate = js.native
    /** Checks the primary lease and removes it if we are the current primary. */
    var releasePrimaryLeaseIfHeld: js.Any = js.native
    val remoteDocumentCache: js.Any = js.native
    var removeClientMetadata: js.Any = js.native
    /** Removes the zombied client entry if it exists. */
    var removeClientZombiedEntry: js.Any = js.native
    /**
      * Schedules a recurring timer to update the client metadata and to either
      * extend or acquire the primary lease if the client is eligible.
      */
    var scheduleClientMetadataAndPrimaryLeaseRefreshes: js.Any = js.native
    val sequenceNumberSyncer: js.Any = js.native
    var serializer: js.Any = js.native
    var simpleDb: js.Any = js.native
    /**
      * Attempt to start IndexedDb persistence.
      *
      * @return {Promise<void>} Whether persistence was enabled.
      */
    var start: js.Any = js.native
    /**
      * Whether or not this persistence instance has been started.
      */
    /* CompleteClass */
    override val started: Boolean = js.native
    val targetCache: js.Any = js.native
    /**
      * Updates the client metadata in IndexedDb and attempts to either obtain or
      * extend the primary lease for the local client. Asynchronously notifies the
      * primary state listener if the client either newly obtained or released its
      * primary lease.
      */
    var updateClientMetadataAndTryBecomePrimary: js.Any = js.native
    /**
      * Verifies that the current tab is the primary leaseholder or alternatively
      * that the leaseholder has opted into multi-tab synchronization.
      */
    var verifyAllowTabSynchronization: js.Any = js.native
    var verifyPrimaryLease: js.Any = js.native
    val webStorage: js.Any = js.native
    val window: js.Any = js.native
    /** Our window.unload handler, if registered. */
    var windowUnloadHandler: js.Any = js.native
    var zombiedClientLocalStorageKey: js.Any = js.native
    /**
      * Returns the IDs of the clients that are currently active. If multi-tab
      * is not supported, returns an array that only contains the local client's
      * ID.
      *
      * PORTING NOTE: This is only used for Web multi-tab.
      */
    /* CompleteClass */
    override def getActiveClients(): js.Promise[js.Array[ClientId]] = js.native
    /**
      * Returns an IndexManager instance that manages our persisted query indexes.
      *
      * Note: The implementation is free to return the same instance every time
      * this is called. In particular, the memory-backed implementation does this
      * to emulate the persisted implementation to the extent possible.
      */
    /* CompleteClass */
    override def getIndexManager(): IndexManager = js.native
    /**
      * Returns a MutationQueue representing the persisted mutations for the
      * given user.
      *
      * Note: The implementation is free to return the same instance every time
      * this is called for a given user. In particular, the memory-backed
      * implementation does this to emulate the persisted implementation to the
      * extent possible (e.g. in the case of uid switching from
      * sally=>jack=>sally, sally's mutation queue will be preserved).
      */
    /* CompleteClass */
    override def getMutationQueue(user: User): MutationQueue = js.native
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
      * @param action A description of the action performed by this transaction,
      * used for logging.
      * @param mode The underlying mode of the IndexedDb transaction. Can be
      * 'readonly`, 'readwrite' or 'readwrite-primary'. Transactions marked
      * 'readwrite-primary' can only be executed by the primary client. In this
      * mode, the transactionOperation will not be run if the primary lease cannot
      * be acquired and the returned promise will be rejected with a
      * FAILED_PRECONDITION error.
      * @param transactionOperation The operation to run inside a transaction.
      * @return A promise that is resolved once the transaction completes.
      */
    /* CompleteClass */
    override def runTransaction[T](
      action: String,
      mode: PersistenceTransactionMode,
      transactionOperation: js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[T]]
    ): js.Promise[T] = js.native
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
    /* CompleteClass */
    override def setPrimaryStateListener(primaryStateListener: PrimaryStateListener): js.Promise[Unit] = js.native
    /**
      * Releases any resources held during eager shutdown.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
    @JSName("started")
    def started_MIndexedDbPersistence(): Boolean = js.native
  }
  
  @js.native
  class IndexedDbPersistenceProvider () extends PersistenceProvider {
    var gcScheduler: js.UndefOr[js.Any] = js.native
    var persistence: js.UndefOr[js.Any] = js.native
    var sharedClientState: js.UndefOr[js.Any] = js.native
    /* CompleteClass */
    override def clearPersistence(databaseId: DatabaseInfo): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def getGarbageCollectionScheduler(): GarbageCollectionScheduler = js.native
    /* CompleteClass */
    override def getPersistence(): Persistence = js.native
    /* CompleteClass */
    override def getSharedClientState(): SharedClientState = js.native
    /* CompleteClass */
    override def initialize(
      asyncQueue: AsyncQueue,
      databaseInfo: DatabaseInfo,
      platform: Platform,
      clientId: ClientId,
      initialUser: User,
      settings: PersistenceSettings
    ): js.Promise[Unit] = js.native
  }
  
  @js.native
  class IndexedDbTransaction protected () extends PersistenceTransaction {
    def this(simpleDbTransaction: SimpleDbTransaction, currentSequenceNumber: ListenSequenceNumber) = this()
    val simpleDbTransaction: SimpleDbTransaction = js.native
  }
  
  /* static members */
  @js.native
  object IndexedDbPersistence extends js.Object {
    /**
      * The name of the main (and currently only) IndexedDB database. this name is
      * appended to the prefix provided to the IndexedDbPersistence constructor.
      */
    var MAIN_DATABASE: String = js.native
    /**
      * Generates a string used as a prefix when storing data in IndexedDB and
      * LocalStorage.
      */
    def buildStoragePrefix(databaseInfo: DatabaseInfo): String = js.native
    def clearPersistence(persistenceKey: String): js.Promise[Unit] = js.native
    def createIndexedDbPersistence(options: AnonAllowTabSynchronization): js.Promise[IndexedDbPersistence] = js.native
    def getStore[Key /* <: IDBValidKey */, Value](txn: PersistenceTransaction, store: String): SimpleDbStore[Key, Value] = js.native
    def isAvailable(): Boolean = js.native
  }
  
}

