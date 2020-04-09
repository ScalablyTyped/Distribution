package typings.firebaseFirestore.memoryPersistenceMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.indexManagerMod.IndexManager
import typings.firebaseFirestore.mutationQueueMod.MutationQueue
import typings.firebaseFirestore.persistenceMod.Persistence
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistenceMod.PersistenceTransactionMode
import typings.firebaseFirestore.persistenceMod.PrimaryStateListener
import typings.firebaseFirestore.persistenceMod.ReferenceDelegate
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.remoteDocumentCacheMod.RemoteDocumentCache
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.targetCacheMod.TargetCache
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/memory_persistence", "MemoryPersistence")
@js.native
class MemoryPersistence protected () extends Persistence {
  /**
    * The constructor accepts a factory for creating a reference delegate. This
    * allows both the delegate and this instance to have strong references to
    * each other without having nullable fields that would then need to be
    * checked or asserted on every access.
    */
  def this(
    clientId: ClientId,
    referenceDelegateFactory: js.Function1[/* p */ MemoryPersistence, MemoryReferenceDelegate]
  ) = this()
  var _started: js.Any = js.native
  val clientId: js.Any = js.native
  /**
    * Note that these are retained here to make it easier to write tests
    * affecting both the in-memory and IndexedDB-backed persistence layers. Tests
    * can create a new LocalStore wrapping this Persistence instance and this
    * will make the in-memory persistence layer behave as if it were actually
    * persisting values.
    */
  val indexManager: js.Any = js.native
  val listenSequence: js.Any = js.native
  var mutationQueues: js.Any = js.native
  /* CompleteClass */
  override val referenceDelegate: ReferenceDelegate = js.native
  @JSName("referenceDelegate")
  val referenceDelegate_MemoryPersistence: MemoryReferenceDelegate = js.native
  val remoteDocumentCache: js.Any = js.native
  /**
    * Whether or not this persistence instance has been started.
    */
  /* CompleteClass */
  override val started: Boolean = js.native
  val targetCache: js.Any = js.native
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
  def mutationQueuesContainKey(transaction: PersistenceTransaction, key: DocumentKey): PersistencePromise[Boolean] = js.native
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
  def setDatabaseDeletedListener(): Unit = js.native
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
  def started_MMemoryPersistence(): Boolean = js.native
}

