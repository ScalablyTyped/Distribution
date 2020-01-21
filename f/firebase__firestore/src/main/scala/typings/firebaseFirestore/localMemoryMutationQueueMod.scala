package typings.firebaseFirestore

import typings.firebaseFirestore.apiTimestampMod.Timestamp
import typings.firebaseFirestore.coreQueryMod.Query
import typings.firebaseFirestore.coreTypesMod.BatchId
import typings.firebaseFirestore.coreTypesMod.ProtoByteString
import typings.firebaseFirestore.localIndexManagerMod.IndexManager
import typings.firebaseFirestore.localMutationQueueMod.MutationQueue
import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typings.firebaseFirestore.localPersistenceMod.ReferenceDelegate
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelMutationBatchMod.MutationBatch
import typings.firebaseFirestore.modelMutationMod.Mutation
import typings.firebaseFirestore.utilSortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_mutation_queue", JSImport.Namespace)
@js.native
object localMemoryMutationQueueMod extends js.Object {
  @js.native
  class MemoryMutationQueue protected () extends MutationQueue {
    def this(indexManager: IndexManager, referenceDelegate: ReferenceDelegate) = this()
    /** An ordered mapping between documents and the mutations batch IDs. */
    var batchesByDocumentKey: js.Any = js.native
    /**
      * A version of lookupMutationBatch that doesn't return a promise, this makes
      * other functions that uses this code easier to read and more efficent.
      */
    var findMutationBatch: js.Any = js.native
    var findMutationBatches: js.Any = js.native
    val indexManager: js.Any = js.native
    /**
      * Finds the index of the given batchId in the mutation queue. This operation
      * is O(1).
      *
      * @return The computed index of the batch with the given batchId, based on
      * the state of the queue. Note this index can be negative if the requested
      * batchId has already been remvoed from the queue or past the end of the
      * queue if the batchId is larger than the last added batch.
      */
    var indexOfBatchId: js.Any = js.native
    /**
      * Finds the index of the given batchId in the mutation queue and asserts that
      * the resulting index is within the bounds of the queue.
      *
      * @param batchId The batchId to search for
      * @param action A description of what the caller is doing, phrased in passive
      * form (e.g. "acknowledged" in a routine that acknowledges batches).
      */
    var indexOfExistingBatchId: js.Any = js.native
    /** The last received stream token from the server, used to acknowledge which
      * responses the client has processed. Stream tokens are opaque checkpoint
      * markers whose only real value is their inclusion in the next request.
      */
    var lastStreamToken: js.Any = js.native
    /**
      * The set of all mutations that have been sent but not yet been applied to
      * the backend.
      */
    var mutationQueue: js.Any = js.native
    /** Next value to use when assigning sequential IDs to each mutation batch. */
    var nextBatchId: js.Any = js.native
    val referenceDelegate: js.Any = js.native
    /**
      * Acknowledges the given batch.
      */
    /* CompleteClass */
    override def acknowledgeBatch(transaction: PersistenceTransaction, batch: MutationBatch, streamToken: ProtoByteString): PersistencePromise[Unit] = js.native
    /**
      * Creates a new mutation batch and adds it to this mutation queue.
      *
      * @param transaction The transaction this operation is scoped to.
      * @param localWriteTime The original write time of this mutation.
      * @param baseMutations Mutations that are used to populate the base values
      * when this mutation is applied locally. These mutations are used to locally
      * overwrite values that are persisted in the remote document cache.
      * @param mutations The user-provided mutations in this mutation batch.
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
    override def getAllMutationBatchesAffectingDocumentKeys(transaction: PersistenceTransaction, documentKeys: SortedMap[DocumentKey, _]): PersistencePromise[js.Array[MutationBatch]] = js.native
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
      * Gets the largest (latest) batch id in mutation queue for the current user that is pending
      * server response, returns `BATCHID_UNKNOWN` if the queue is empty.
      *
      * @return the largest batch id in the mutation queue that is not acknowledged.
      */
    /* CompleteClass */
    override def getHighestUnacknowledgedBatchId(transaction: PersistenceTransaction): PersistencePromise[BatchId] = js.native
    /** Returns the current stream token for this mutation queue. */
    /* CompleteClass */
    override def getLastStreamToken(transaction: PersistenceTransaction): PersistencePromise[ProtoByteString] = js.native
    /**
      * Gets the first unacknowledged mutation batch after the passed in batchId
      * in the mutation queue or null if empty.
      *
      * @param batchId The batch to search after, or BATCHID_UNKNOWN for the first
      * mutation in the queue.
      *
      * @return the next mutation or null if there wasn't one.
      */
    /* CompleteClass */
    override def getNextMutationBatchAfterBatchId(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null] = js.native
    /**
      * Loads the mutation batch with the given batchId.
      */
    /* CompleteClass */
    override def lookupMutationBatch(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null] = js.native
    /**
      * Returns the document keys for the mutation batch with the given batchId.
      * For primary clients, this method returns `null` after
      * `removeMutationBatches()` has been called. Secondary clients return a
      * cached result until `removeCachedMutationKeys()` is invoked.
      */
    /* CompleteClass */
    override def lookupMutationKeys(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[DocumentKeySet_ | Null] = js.native
    /**
      * Performs a consistency check, examining the mutation queue for any
      * leaks, if possible.
      */
    /* CompleteClass */
    override def performConsistencyCheck(transaction: PersistenceTransaction): PersistencePromise[Unit] = js.native
    /**
      * Clears the cached keys for a mutation batch. This method should be
      * called by secondary clients after they process mutation updates.
      *
      * Note that this method does not have to be called from primary clients as
      * the corresponding cache entries are cleared when an acknowledged or
      * rejected batch is removed from the mutation queue.
      */
    /* CompleteClass */
    override def removeCachedMutationKeys(batchId: BatchId): Unit = js.native
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
    /** Sets the stream token for this mutation queue. */
    /* CompleteClass */
    override def setLastStreamToken(transaction: PersistenceTransaction, streamToken: ProtoByteString): PersistencePromise[Unit] = js.native
  }
  
}

