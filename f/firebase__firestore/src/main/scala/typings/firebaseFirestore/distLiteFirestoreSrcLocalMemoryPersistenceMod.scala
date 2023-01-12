package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distLiteFirestoreSrcLocalBundleCacheMod.BundleCache
import typings.firebaseFirestore.distLiteFirestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLruGarbageCollectorMod.ActiveTargets
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLruGarbageCollectorMod.LruDelegate
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLruGarbageCollectorMod.LruGarbageCollector
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.distLiteFirestoreSrcLocalMutationQueueMod.MutationQueue
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceMod.ReferenceDelegate
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
import typings.firebaseFirestore.distLiteFirestoreSrcLocalRemoteDocumentCacheMod.RemoteDocumentCache
import typings.firebaseFirestore.distLiteFirestoreSrcLocalTargetCacheMod.TargetCache
import typings.firebaseFirestore.distLiteFirestoreSrcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalMemoryPersistenceMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/memory_persistence", "MemoryEagerDelegate")
  @js.native
  /* private */ open class MemoryEagerDelegate ()
    extends StObject
       with MemoryReferenceDelegate {
    
    /** The list of documents that are potentially GCed after each transaction. */
    /* private */ var _orphanedDocuments: Any = js.native
    
    /** Notify the delegate that the given document was added to a target. */
    /* CompleteClass */
    override def addReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    /* CompleteClass */
    override def documentSize(doc: Document): Double = js.native
    
    /* private */ var isReferenced: Any = js.native
    
    /** Tracks all documents that are active in Query views. */
    /* private */ var localViewReferences: Any = js.native
    
    /**
      * Notify the delegate that a document may no longer be part of any views or
      * have any mutations associated.
      */
    /* CompleteClass */
    override def markPotentiallyOrphaned(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    /* CompleteClass */
    override def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit] = js.native
    
    /* CompleteClass */
    override def onTransactionStarted(): Unit = js.native
    
    /* private */ def orphanedDocuments: Any = js.native
    
    /* private */ val persistence: Any = js.native
    
    /** Notify the delegate that the given document was removed from a target. */
    /* CompleteClass */
    override def removeReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    /**
      * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
      * actually delete the target and associated data.
      */
    /* CompleteClass */
    override def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
    
    /** Notify the delegate that a limbo document was updated. */
    /* CompleteClass */
    override def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  }
  /* static members */
  object MemoryEagerDelegate {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/memory_persistence", "MemoryEagerDelegate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def factory(persistence: MemoryPersistence): MemoryEagerDelegate = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(persistence.asInstanceOf[js.Any]).asInstanceOf[MemoryEagerDelegate]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/memory_persistence", "MemoryLruDelegate")
  @js.native
  open class MemoryLruDelegate protected ()
    extends StObject
       with ReferenceDelegate
       with LruDelegate {
    def this(persistence: MemoryPersistence, lruParams: LruParams) = this()
    
    /** Notify the delegate that the given document was added to a target. */
    /* CompleteClass */
    override def addReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    def documentSize(document: Document): Double = js.native
    
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
    override val garbageCollector: LruGarbageCollector = js.native
    
    /* CompleteClass */
    override def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
    
    /* CompleteClass */
    override def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
    
    /* private */ var isPinned: Any = js.native
    
    /**
      * Notify the delegate that a document may no longer be part of any views or
      * have any mutations associated.
      */
    /* CompleteClass */
    override def markPotentiallyOrphaned(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit] = js.native
    
    def onTransactionStarted(): Unit = js.native
    
    /* private */ var orphanedDocumentCount: Any = js.native
    
    /* private */ var orphanedSequenceNumbers: Any = js.native
    
    /* private */ val persistence: Any = js.native
    
    /**
      * Removes all unreferenced documents from the cache that have a sequence
      * number less than or equal to the given `upperBound`.
      *
      * @returns the number of documents removed.
      */
    /* CompleteClass */
    override def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double] = js.native
    
    /** Notify the delegate that the given document was removed from a target. */
    /* CompleteClass */
    override def removeReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    /**
      * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
      * actually delete the target and associated data.
      */
    /* CompleteClass */
    override def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
    
    /**
      * Removes all targets that have a sequence number less than or equal to
      * `upperBound`, and are not present in the `activeTargetIds` set.
      *
      * @returns the number of targets removed.
      */
    /* CompleteClass */
    override def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
    
    /** Notify the delegate that a limbo document was updated. */
    /* CompleteClass */
    override def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/memory_persistence", "MemoryPersistence")
  @js.native
  open class MemoryPersistence protected ()
    extends StObject
       with Persistence {
    /**
      * The constructor accepts a factory for creating a reference delegate. This
      * allows both the delegate and this instance to have strong references to
      * each other without having nullable fields that would then need to be
      * checked or asserted on every access.
      */
    def this(
      referenceDelegateFactory: js.Function1[/* p */ MemoryPersistence, MemoryReferenceDelegate],
      serializer: JsonProtoSerializer
    ) = this()
    
    /* private */ var _started: Any = js.native
    
    /* private */ val bundleCache: Any = js.native
    
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
    
    /**
      * Note that these are retained here to make it easier to write tests
      * affecting both the in-memory and IndexedDB-backed persistence layers. Tests
      * can create a new LocalStore wrapping this Persistence instance and this
      * will make the in-memory persistence layer behave as if it were actually
      * persisting values.
      */
    /* private */ val indexManager: Any = js.native
    
    /* private */ val listenSequence: Any = js.native
    
    /* private */ var mutationQueues: Any = js.native
    
    def mutationQueuesContainKey(transaction: PersistenceTransaction, key: DocumentKey): PersistencePromise[Boolean] = js.native
    
    /* private */ var overlays: Any = js.native
    
    /* CompleteClass */
    override val referenceDelegate: ReferenceDelegate = js.native
    @JSName("referenceDelegate")
    val referenceDelegate_MemoryPersistence: MemoryReferenceDelegate = js.native
    
    /* private */ val remoteDocumentCache: Any = js.native
    
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
    
    /* private */ var serializer: Any = js.native
    
    def setDatabaseDeletedListener(): Unit = js.native
    /**
      * Registers a listener that gets called when the database receives a
      * version change event indicating that it has deleted.
      *
      * PORTING NOTE: This is only used for Web multi-tab.
      */
    /* CompleteClass */
    override def setDatabaseDeletedListener(databaseDeletedListener: js.Function0[js.Promise[Unit]]): Unit = js.native
    
    def setNetworkEnabled(): Unit = js.native
    /**
      * Adjusts the current network state in the client's metadata, potentially
      * affecting the primary lease.
      *
      * PORTING NOTE: This is only used for Web multi-tab.
      */
    /* CompleteClass */
    override def setNetworkEnabled(networkEnabled: Boolean): Unit = js.native
    
    /**
      * Releases any resources held during eager shutdown.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
    
    /** Starts persistence. */
    /* CompleteClass */
    override def start(): js.Promise[Unit] = js.native
    
    /**
      * Whether or not this persistence instance has been started.
      */
    /* CompleteClass */
    override val started: Boolean = js.native
    @JSName("started")
    def started_MMemoryPersistence: Boolean = js.native
    
    /* private */ val targetCache: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/memory_persistence", "MemoryTransaction")
  @js.native
  open class MemoryTransaction protected () extends PersistenceTransaction {
    def this(currentSequenceNumber: ListenSequenceNumber) = this()
  }
  
  trait MemoryReferenceDelegate
    extends StObject
       with ReferenceDelegate {
    
    def documentSize(doc: Document): Double
    
    def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit]
    
    def onTransactionStarted(): Unit
  }
  object MemoryReferenceDelegate {
    
    inline def apply(
      addReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
      documentSize: Document => Double,
      markPotentiallyOrphaned: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
      onTransactionCommitted: PersistenceTransaction => PersistencePromise[Unit],
      onTransactionStarted: () => Unit,
      removeReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
      removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
      updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
    ): MemoryReferenceDelegate = {
      val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction3(addReference), documentSize = js.Any.fromFunction1(documentSize), markPotentiallyOrphaned = js.Any.fromFunction2(markPotentiallyOrphaned), onTransactionCommitted = js.Any.fromFunction1(onTransactionCommitted), onTransactionStarted = js.Any.fromFunction0(onTransactionStarted), removeReference = js.Any.fromFunction3(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
      __obj.asInstanceOf[MemoryReferenceDelegate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryReferenceDelegate] (val x: Self) extends AnyVal {
      
      inline def setDocumentSize(value: Document => Double): Self = StObject.set(x, "documentSize", js.Any.fromFunction1(value))
      
      inline def setOnTransactionCommitted(value: PersistenceTransaction => PersistencePromise[Unit]): Self = StObject.set(x, "onTransactionCommitted", js.Any.fromFunction1(value))
      
      inline def setOnTransactionStarted(value: () => Unit): Self = StObject.set(x, "onTransactionStarted", js.Any.fromFunction0(value))
    }
  }
}
