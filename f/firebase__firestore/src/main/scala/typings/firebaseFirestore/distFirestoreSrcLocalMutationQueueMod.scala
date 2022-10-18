package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distFirestoreSrcLiteApiTimestampMod.Timestamp
import typings.firebaseFirestore.distFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distFirestoreSrcModelMutationBatchMod.MutationBatch
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distFirestoreSrcUtilSortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLocalMutationQueueMod {
  
  trait MutationQueue extends StObject {
    
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
    def addMutationBatch(
      transaction: PersistenceTransaction,
      localWriteTime: Timestamp,
      baseMutations: js.Array[Mutation],
      mutations: js.Array[Mutation]
    ): PersistencePromise[MutationBatch]
    
    /** Returns true if this queue contains no mutation batches. */
    def checkEmpty(transaction: PersistenceTransaction): PersistencePromise[Boolean]
    
    /** Gets all mutation batches in the mutation queue. */
    def getAllMutationBatches(transaction: PersistenceTransaction): PersistencePromise[js.Array[MutationBatch]]
    
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
    def getAllMutationBatchesAffectingDocumentKey(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[js.Array[MutationBatch]]
    
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
    def getAllMutationBatchesAffectingDocumentKeys(transaction: PersistenceTransaction, documentKeys: SortedMap[DocumentKey, Any]): PersistencePromise[js.Array[MutationBatch]]
    
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
    def getAllMutationBatchesAffectingQuery(transaction: PersistenceTransaction, query: Query): PersistencePromise[js.Array[MutationBatch]]
    
    /**
      * Gets the largest (latest) batch id in mutation queue for the current user
      * that is pending server response, returns `BATCHID_UNKNOWN` if the queue is
      * empty.
      *
      * @returns the largest batch id in the mutation queue that is not
      * acknowledged.
      */
    def getHighestUnacknowledgedBatchId(transaction: PersistenceTransaction): PersistencePromise[BatchId]
    
    /**
      * Gets the first unacknowledged mutation batch after the passed in batchId
      * in the mutation queue or null if empty.
      *
      * @param batchId - The batch to search after, or BATCHID_UNKNOWN for the
      * first mutation in the queue.
      *
      * @returns the next mutation or null if there wasn't one.
      */
    def getNextMutationBatchAfterBatchId(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null]
    
    /**
      * Loads the mutation batch with the given batchId.
      */
    def lookupMutationBatch(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null]
    
    /**
      * Performs a consistency check, examining the mutation queue for any
      * leaks, if possible.
      */
    def performConsistencyCheck(transaction: PersistenceTransaction): PersistencePromise[Unit]
    
    /**
      * Removes the given mutation batch from the queue. This is useful in two
      * circumstances:
      *
      * + Removing an applied mutation from the head of the queue
      * + Removing a rejected mutation from anywhere in the queue
      *
      * Multi-Tab Note: This operation should only be called by the primary client.
      */
    def removeMutationBatch(transaction: PersistenceTransaction, batch: MutationBatch): PersistencePromise[Unit]
  }
  object MutationQueue {
    
    inline def apply(
      addMutationBatch: (PersistenceTransaction, Timestamp, js.Array[Mutation], js.Array[Mutation]) => PersistencePromise[MutationBatch],
      checkEmpty: PersistenceTransaction => PersistencePromise[Boolean],
      getAllMutationBatches: PersistenceTransaction => PersistencePromise[js.Array[MutationBatch]],
      getAllMutationBatchesAffectingDocumentKey: (PersistenceTransaction, DocumentKey) => PersistencePromise[js.Array[MutationBatch]],
      getAllMutationBatchesAffectingDocumentKeys: (PersistenceTransaction, SortedMap[DocumentKey, Any]) => PersistencePromise[js.Array[MutationBatch]],
      getAllMutationBatchesAffectingQuery: (PersistenceTransaction, Query) => PersistencePromise[js.Array[MutationBatch]],
      getHighestUnacknowledgedBatchId: PersistenceTransaction => PersistencePromise[BatchId],
      getNextMutationBatchAfterBatchId: (PersistenceTransaction, BatchId) => PersistencePromise[MutationBatch | Null],
      lookupMutationBatch: (PersistenceTransaction, BatchId) => PersistencePromise[MutationBatch | Null],
      performConsistencyCheck: PersistenceTransaction => PersistencePromise[Unit],
      removeMutationBatch: (PersistenceTransaction, MutationBatch) => PersistencePromise[Unit]
    ): MutationQueue = {
      val __obj = js.Dynamic.literal(addMutationBatch = js.Any.fromFunction4(addMutationBatch), checkEmpty = js.Any.fromFunction1(checkEmpty), getAllMutationBatches = js.Any.fromFunction1(getAllMutationBatches), getAllMutationBatchesAffectingDocumentKey = js.Any.fromFunction2(getAllMutationBatchesAffectingDocumentKey), getAllMutationBatchesAffectingDocumentKeys = js.Any.fromFunction2(getAllMutationBatchesAffectingDocumentKeys), getAllMutationBatchesAffectingQuery = js.Any.fromFunction2(getAllMutationBatchesAffectingQuery), getHighestUnacknowledgedBatchId = js.Any.fromFunction1(getHighestUnacknowledgedBatchId), getNextMutationBatchAfterBatchId = js.Any.fromFunction2(getNextMutationBatchAfterBatchId), lookupMutationBatch = js.Any.fromFunction2(lookupMutationBatch), performConsistencyCheck = js.Any.fromFunction1(performConsistencyCheck), removeMutationBatch = js.Any.fromFunction2(removeMutationBatch))
      __obj.asInstanceOf[MutationQueue]
    }
    
    extension [Self <: MutationQueue](x: Self) {
      
      inline def setAddMutationBatch(
        value: (PersistenceTransaction, Timestamp, js.Array[Mutation], js.Array[Mutation]) => PersistencePromise[MutationBatch]
      ): Self = StObject.set(x, "addMutationBatch", js.Any.fromFunction4(value))
      
      inline def setCheckEmpty(value: PersistenceTransaction => PersistencePromise[Boolean]): Self = StObject.set(x, "checkEmpty", js.Any.fromFunction1(value))
      
      inline def setGetAllMutationBatches(value: PersistenceTransaction => PersistencePromise[js.Array[MutationBatch]]): Self = StObject.set(x, "getAllMutationBatches", js.Any.fromFunction1(value))
      
      inline def setGetAllMutationBatchesAffectingDocumentKey(value: (PersistenceTransaction, DocumentKey) => PersistencePromise[js.Array[MutationBatch]]): Self = StObject.set(x, "getAllMutationBatchesAffectingDocumentKey", js.Any.fromFunction2(value))
      
      inline def setGetAllMutationBatchesAffectingDocumentKeys(
        value: (PersistenceTransaction, SortedMap[DocumentKey, Any]) => PersistencePromise[js.Array[MutationBatch]]
      ): Self = StObject.set(x, "getAllMutationBatchesAffectingDocumentKeys", js.Any.fromFunction2(value))
      
      inline def setGetAllMutationBatchesAffectingQuery(value: (PersistenceTransaction, Query) => PersistencePromise[js.Array[MutationBatch]]): Self = StObject.set(x, "getAllMutationBatchesAffectingQuery", js.Any.fromFunction2(value))
      
      inline def setGetHighestUnacknowledgedBatchId(value: PersistenceTransaction => PersistencePromise[BatchId]): Self = StObject.set(x, "getHighestUnacknowledgedBatchId", js.Any.fromFunction1(value))
      
      inline def setGetNextMutationBatchAfterBatchId(value: (PersistenceTransaction, BatchId) => PersistencePromise[MutationBatch | Null]): Self = StObject.set(x, "getNextMutationBatchAfterBatchId", js.Any.fromFunction2(value))
      
      inline def setLookupMutationBatch(value: (PersistenceTransaction, BatchId) => PersistencePromise[MutationBatch | Null]): Self = StObject.set(x, "lookupMutationBatch", js.Any.fromFunction2(value))
      
      inline def setPerformConsistencyCheck(value: PersistenceTransaction => PersistencePromise[Unit]): Self = StObject.set(x, "performConsistencyCheck", js.Any.fromFunction1(value))
      
      inline def setRemoveMutationBatch(value: (PersistenceTransaction, MutationBatch) => PersistencePromise[Unit]): Self = StObject.set(x, "removeMutationBatch", js.Any.fromFunction2(value))
    }
  }
}
