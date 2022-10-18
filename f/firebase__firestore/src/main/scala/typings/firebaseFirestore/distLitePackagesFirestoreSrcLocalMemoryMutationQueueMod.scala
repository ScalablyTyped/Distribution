package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiTimestampMod.Timestamp
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalMutationQueueMod.MutationQueue
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceMod.ReferenceDelegate
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelMutationBatchMod.MutationBatch
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilSortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLocalMemoryMutationQueueMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/memory_mutation_queue", "MemoryMutationQueue")
  @js.native
  open class MemoryMutationQueue protected ()
    extends StObject
       with MutationQueue {
    def this(indexManager: IndexManager, referenceDelegate: ReferenceDelegate) = this()
    
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
    
    /** An ordered mapping between documents and the mutations batch IDs. */
    /* private */ var batchesByDocumentKey: Any = js.native
    
    /** Returns true if this queue contains no mutation batches. */
    /* CompleteClass */
    override def checkEmpty(transaction: PersistenceTransaction): PersistencePromise[Boolean] = js.native
    
    def containsKey(txn: PersistenceTransaction, key: DocumentKey): PersistencePromise[Boolean] = js.native
    
    /**
      * A version of lookupMutationBatch that doesn't return a promise, this makes
      * other functions that uses this code easier to read and more efficent.
      */
    /* private */ var findMutationBatch: Any = js.native
    
    /* private */ var findMutationBatches: Any = js.native
    
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
    
    def getHighestUnacknowledgedBatchId(): PersistencePromise[BatchId] = js.native
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
      * Finds the index of the given batchId in the mutation queue. This operation
      * is O(1).
      *
      * @returns The computed index of the batch with the given batchId, based on
      * the state of the queue. Note this index can be negative if the requested
      * batchId has already been remvoed from the queue or past the end of the
      * queue if the batchId is larger than the last added batch.
      */
    /* private */ var indexOfBatchId: Any = js.native
    
    /**
      * Finds the index of the given batchId in the mutation queue and asserts that
      * the resulting index is within the bounds of the queue.
      *
      * @param batchId - The batchId to search for
      * @param action - A description of what the caller is doing, phrased in passive
      * form (e.g. "acknowledged" in a routine that acknowledges batches).
      */
    /* private */ var indexOfExistingBatchId: Any = js.native
    
    /**
      * Loads the mutation batch with the given batchId.
      */
    /* CompleteClass */
    override def lookupMutationBatch(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null] = js.native
    
    /**
      * The set of all mutations that have been sent but not yet been applied to
      * the backend.
      */
    /* private */ var mutationQueue: Any = js.native
    
    /** Next value to use when assigning sequential IDs to each mutation batch. */
    /* private */ var nextBatchId: Any = js.native
    
    /**
      * Performs a consistency check, examining the mutation queue for any
      * leaks, if possible.
      */
    /* CompleteClass */
    override def performConsistencyCheck(transaction: PersistenceTransaction): PersistencePromise[Unit] = js.native
    
    /* private */ val referenceDelegate: Any = js.native
    
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
  }
}
