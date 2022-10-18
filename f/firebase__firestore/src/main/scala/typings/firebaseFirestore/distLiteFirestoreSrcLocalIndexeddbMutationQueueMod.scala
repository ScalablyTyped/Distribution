package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLocalSerializerMod.LocalSerializer
import typings.firebaseFirestore.distLiteFirestoreSrcLocalMutationQueueMod.MutationQueue
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceMod.ReferenceDelegate
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationBatchMod.MutationBatch
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distLiteFirestoreSrcUtilSortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalIndexeddbMutationQueueMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/indexeddb_mutation_queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/indexeddb_mutation_queue", "IndexedDbMutationQueue")
  @js.native
  open class IndexedDbMutationQueue protected ()
    extends StObject
       with MutationQueue {
    def this(
      /**
      * The normalized userId (e.g. null UID => "" userId) used to store /
      * retrieve mutations.
      */
    userId: String,
      serializer: LocalSerializer,
      indexManager: IndexManager,
      referenceDelegate: ReferenceDelegate
    ) = this()
    
    /**
      * Creates a new mutation batch and adds it to this mutation queue.
      *
      * @param transaction - The transaction this operation is scoped to.
      * @param localWriteTime - The original write time of this mutation.
      * @param baseMutations - Mutations that are used to populate the base values
      * when this mutation is applied locally. These mutations are used to locally
      * overwrite values that are persisted in the remote document cache.
      * @param mutations - The user-provided mutations in this mutation batch.
      */
    /* CompleteClass */
    override def addMutationBatch(
      transaction: PersistenceTransaction,
      localWriteTime: Timestamp,
      baseMutations: js.Array[Mutation],
      mutations: js.Array[Mutation]
    ): PersistencePromise[MutationBatch] = js.native
    
    /** Returns true if this queue contains no mutation batches. */
    /* CompleteClass */
    override def checkEmpty(transaction: PersistenceTransaction): PersistencePromise[Boolean] = js.native
    
    def containsKey(txn: PersistenceTransaction, key: DocumentKey): PersistencePromise[Boolean] = js.native
    
    /**
      * Caches the document keys for pending mutation batches. If the mutation
      * has been removed from IndexedDb, the cached value may continue to
      * be used to retrieve the batch's document keys. To remove a cached value
      * locally, `removeCachedMutationKeys()` should be invoked either directly
      * or through `removeMutationBatches()`.
      *
      * With multi-tab, when the primary client acknowledges or rejects a mutation,
      * this cache is used by secondary clients to invalidate the local
      * view of the documents that were previously affected by the mutation.
      */
    /* private */ var documentKeysByBatchId: Any = js.native
    
    /** Gets all mutation batches in the mutation queue. */
    /* CompleteClass */
    override def getAllMutationBatches(transaction: PersistenceTransaction): PersistencePromise[js.Array[MutationBatch]] = js.native
    
    /**
      * Finds all mutation batches that could possibly affect the given
      * document key. Not all mutations in a batch will necessarily affect the
      * document key, so when looping through the batch you'll need to check that
      * the mutation itself matches the key.
      *
      * Batches are guaranteed to be in sorted order.
      *
      * Note that because of this requirement implementations are free to return
      * mutation batches that don't contain the document key at all if it's
      * convenient.
      */
    /* CompleteClass */
    override def getAllMutationBatchesAffectingDocumentKey(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[js.Array[MutationBatch]] = js.native
    
    /**
      * Finds all mutation batches that could possibly affect the given set of
      * document keys. Not all mutations in a batch will necessarily affect each
      * key, so when looping through the batch you'll need to check that the
      * mutation itself matches the key.
      *
      * Batches are guaranteed to be in sorted order.
      *
      * Note that because of this requirement implementations are free to return
      * mutation batches that don't contain any of the document keys at all if it's
      * convenient.
      */
    /* CompleteClass */
    override def getAllMutationBatchesAffectingDocumentKeys(transaction: PersistenceTransaction, documentKeys: SortedMap[DocumentKey, Any]): PersistencePromise[js.Array[MutationBatch]] = js.native
    
    /**
      * Finds all mutation batches that could affect the results for the given
      * query. Not all mutations in a batch will necessarily affect the query, so
      * when looping through the batch you'll need to check that the mutation
      * itself matches the query.
      *
      * Batches are guaranteed to be in sorted order.
      *
      * Note that because of this requirement implementations are free to return
      * mutation batches that don't match the query at all if it's convenient.
      *
      * NOTE: A PatchMutation does not need to include all fields in the query
      * filter criteria in order to be a match (but any fields it does contain do
      * need to match).
      */
    /* CompleteClass */
    override def getAllMutationBatchesAffectingQuery(transaction: PersistenceTransaction, query: Query): PersistencePromise[js.Array[MutationBatch]] = js.native
    
    /**
      * Gets the largest (latest) batch id in mutation queue for the current user
      * that is pending server response, returns `BATCHID_UNKNOWN` if the queue is
      * empty.
      *
      * @returns the largest batch id in the mutation queue that is not
      * acknowledged.
      */
    /* CompleteClass */
    override def getHighestUnacknowledgedBatchId(transaction: PersistenceTransaction): PersistencePromise[BatchId] = js.native
    
    /** Returns the mutation queue's metadata from IndexedDb. */
    /* private */ var getMutationQueueMetadata: Any = js.native
    
    /**
      * Gets the first unacknowledged mutation batch after the passed in batchId
      * in the mutation queue or null if empty.
      *
      * @param batchId - The batch to search after, or BATCHID_UNKNOWN for the
      * first mutation in the queue.
      *
      * @returns the next mutation or null if there wasn't one.
      */
    /* CompleteClass */
    override def getNextMutationBatchAfterBatchId(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null] = js.native
    
    /* private */ val indexManager: Any = js.native
    
    /**
      * Loads the mutation batch with the given batchId.
      */
    /* CompleteClass */
    override def lookupMutationBatch(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null] = js.native
    
    /* private */ var lookupMutationBatches: Any = js.native
    
    /**
      * Returns the document keys for the mutation batch with the given batchId.
      * For primary clients, this method returns `null` after
      * `removeMutationBatches()` has been called. Secondary clients return a
      * cached result until `removeCachedMutationKeys()` is invoked.
      */
    def lookupMutationKeys(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[DocumentKeySet_ | Null] = js.native
    
    /**
      * Performs a consistency check, examining the mutation queue for any
      * leaks, if possible.
      */
    /* CompleteClass */
    override def performConsistencyCheck(transaction: PersistenceTransaction): PersistencePromise[Unit] = js.native
    
    /* private */ val referenceDelegate: Any = js.native
    
    /**
      * Clears the cached keys for a mutation batch. This method should be
      * called by secondary clients after they process mutation updates.
      *
      * Note that this method does not have to be called from primary clients as
      * the corresponding cache entries are cleared when an acknowledged or
      * rejected batch is removed from the mutation queue.
      */
    def removeCachedMutationKeys(batchId: BatchId): Unit = js.native
    
    /**
      * Removes the given mutation batch from the queue. This is useful in two
      * circumstances:
      *
      * + Removing an applied mutation from the head of the queue
      * + Removing a rejected mutation from anywhere in the queue
      *
      * Multi-Tab Note: This operation should only be called by the primary client.
      */
    /* CompleteClass */
    override def removeMutationBatch(transaction: PersistenceTransaction, batch: MutationBatch): PersistencePromise[Unit] = js.native
    
    /* private */ val serializer: Any = js.native
    
    /**
      * The normalized userId (e.g. null UID => "" userId) used to store /
      * retrieve mutations.
      */
    /* private */ var userId: Any = js.native
  }
  /* static members */
  object IndexedDbMutationQueue {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/indexeddb_mutation_queue", "IndexedDbMutationQueue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new mutation queue for the given user.
      * @param user - The user for which to create a mutation queue.
      * @param serializer - The serializer to use when persisting to IndexedDb.
      */
    inline def forUser(
      user: User,
      serializer: LocalSerializer,
      indexManager: IndexManager,
      referenceDelegate: ReferenceDelegate
    ): IndexedDbMutationQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("forUser")(user.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indexManager.asInstanceOf[js.Any], referenceDelegate.asInstanceOf[js.Any])).asInstanceOf[IndexedDbMutationQueue]
  }
  
  inline def mutationQueuesContainKey(txn: PersistenceTransaction, docKey: DocumentKey): PersistencePromise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("mutationQueuesContainKey")(txn.asInstanceOf[js.Any], docKey.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[Boolean]]
}
