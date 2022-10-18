package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLiteFirestoreSrcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.distLiteFirestoreSrcUtilSortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalLruGarbageCollectorMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "GC_DID_NOT_RUN")
  @js.native
  val GC_DID_NOT_RUN: LruResults = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "LRU_COLLECTION_DISABLED")
  @js.native
  val LRU_COLLECTION_DISABLED: /* -1 */ Double = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "LRU_DEFAULT_CACHE_SIZE_BYTES")
  @js.native
  val LRU_DEFAULT_CACHE_SIZE_BYTES: Double = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "LruParams")
  @js.native
  open class LruParams protected () extends StObject {
    def this(
      cacheSizeCollectionThreshold: Double,
      percentileToCollect: Double,
      maximumSequenceNumbersToCollect: Double
    ) = this()
    
    val cacheSizeCollectionThreshold: Double = js.native
    
    val maximumSequenceNumbersToCollect: Double = js.native
    
    val percentileToCollect: Double = js.native
  }
  /* static members */
  object LruParams {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "LruParams")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "LruParams.DEFAULT")
    @js.native
    val DEFAULT: LruParams = js.native
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "LruParams.DEFAULT_COLLECTION_PERCENTILE")
    @js.native
    val DEFAULT_COLLECTION_PERCENTILE: Any = js.native
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "LruParams.DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT")
    @js.native
    val DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT: Any = js.native
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector", "LruParams.DISABLED")
    @js.native
    val DISABLED: LruParams = js.native
    
    inline def withCacheSize(cacheSize: Double): LruParams = ^.asInstanceOf[js.Dynamic].applyDynamic("withCacheSize")(cacheSize.asInstanceOf[js.Any]).asInstanceOf[LruParams]
  }
  
  type ActiveTargets = SortedMap[TargetId, Any]
  
  trait LruDelegate extends StObject {
    
    /**
      * Enumerates sequence numbers for documents not associated with a target.
      * Note that this may include duplicate sequence numbers.
      */
    def forEachOrphanedDocumentSequenceNumber(txn: PersistenceTransaction, f: js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]): PersistencePromise[Unit]
    
    /** Enumerates all the targets in the TargetCache. */
    def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* target */ TargetData, Unit]): PersistencePromise[Unit]
    
    val garbageCollector: LruGarbageCollector
    
    def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double]
    
    def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double]
    
    /**
      * Removes all unreferenced documents from the cache that have a sequence
      * number less than or equal to the given `upperBound`.
      *
      * @returns the number of documents removed.
      */
    def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double]
    
    /**
      * Removes all targets that have a sequence number less than or equal to
      * `upperBound`, and are not present in the `activeTargetIds` set.
      *
      * @returns the number of targets removed.
      */
    def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double]
  }
  object LruDelegate {
    
    inline def apply(
      forEachOrphanedDocumentSequenceNumber: (PersistenceTransaction, js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) => PersistencePromise[Unit],
      forEachTarget: (PersistenceTransaction, js.Function1[/* target */ TargetData, Unit]) => PersistencePromise[Unit],
      garbageCollector: LruGarbageCollector,
      getCacheSize: PersistenceTransaction => PersistencePromise[Double],
      getSequenceNumberCount: PersistenceTransaction => PersistencePromise[Double],
      removeOrphanedDocuments: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double],
      removeTargets: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double]
    ): LruDelegate = {
      val __obj = js.Dynamic.literal(forEachOrphanedDocumentSequenceNumber = js.Any.fromFunction2(forEachOrphanedDocumentSequenceNumber), forEachTarget = js.Any.fromFunction2(forEachTarget), garbageCollector = garbageCollector.asInstanceOf[js.Any], getCacheSize = js.Any.fromFunction1(getCacheSize), getSequenceNumberCount = js.Any.fromFunction1(getSequenceNumberCount), removeOrphanedDocuments = js.Any.fromFunction2(removeOrphanedDocuments), removeTargets = js.Any.fromFunction3(removeTargets))
      __obj.asInstanceOf[LruDelegate]
    }
    
    extension [Self <: LruDelegate](x: Self) {
      
      inline def setForEachOrphanedDocumentSequenceNumber(
        value: (PersistenceTransaction, js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) => PersistencePromise[Unit]
      ): Self = StObject.set(x, "forEachOrphanedDocumentSequenceNumber", js.Any.fromFunction2(value))
      
      inline def setForEachTarget(
        value: (PersistenceTransaction, js.Function1[/* target */ TargetData, Unit]) => PersistencePromise[Unit]
      ): Self = StObject.set(x, "forEachTarget", js.Any.fromFunction2(value))
      
      inline def setGarbageCollector(value: LruGarbageCollector): Self = StObject.set(x, "garbageCollector", value.asInstanceOf[js.Any])
      
      inline def setGetCacheSize(value: PersistenceTransaction => PersistencePromise[Double]): Self = StObject.set(x, "getCacheSize", js.Any.fromFunction1(value))
      
      inline def setGetSequenceNumberCount(value: PersistenceTransaction => PersistencePromise[Double]): Self = StObject.set(x, "getSequenceNumberCount", js.Any.fromFunction1(value))
      
      inline def setRemoveOrphanedDocuments(value: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double]): Self = StObject.set(x, "removeOrphanedDocuments", js.Any.fromFunction2(value))
      
      inline def setRemoveTargets(value: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double]): Self = StObject.set(x, "removeTargets", js.Any.fromFunction3(value))
    }
  }
  
  trait LruGarbageCollector extends StObject {
    
    /** Given a percentile of target to collect, returns the number of targets to collect. */
    def calculateTargetCount(txn: PersistenceTransaction, percentile: Double): PersistencePromise[Double]
    
    def collect(txn: PersistenceTransaction, activeTargetIds: ActiveTargets): PersistencePromise[LruResults]
    
    def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double]
    
    /** Returns the nth sequence number, counting in order from the smallest. */
    def nthSequenceNumber(txn: PersistenceTransaction, n: Double): PersistencePromise[Double]
    
    val params: LruParams
    
    /**
      * Removes documents that have a sequence number equal to or less than the
      * upper bound and are not otherwise pinned.
      */
    def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double]
    
    /**
      * Removes targets with a sequence number equal to or less than the given
      * upper bound, and removes document associations with those targets.
      */
    def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double]
  }
  object LruGarbageCollector {
    
    inline def apply(
      calculateTargetCount: (PersistenceTransaction, Double) => PersistencePromise[Double],
      collect: (PersistenceTransaction, ActiveTargets) => PersistencePromise[LruResults],
      getCacheSize: PersistenceTransaction => PersistencePromise[Double],
      nthSequenceNumber: (PersistenceTransaction, Double) => PersistencePromise[Double],
      params: LruParams,
      removeOrphanedDocuments: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double],
      removeTargets: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double]
    ): LruGarbageCollector = {
      val __obj = js.Dynamic.literal(calculateTargetCount = js.Any.fromFunction2(calculateTargetCount), collect = js.Any.fromFunction2(collect), getCacheSize = js.Any.fromFunction1(getCacheSize), nthSequenceNumber = js.Any.fromFunction2(nthSequenceNumber), params = params.asInstanceOf[js.Any], removeOrphanedDocuments = js.Any.fromFunction2(removeOrphanedDocuments), removeTargets = js.Any.fromFunction3(removeTargets))
      __obj.asInstanceOf[LruGarbageCollector]
    }
    
    extension [Self <: LruGarbageCollector](x: Self) {
      
      inline def setCalculateTargetCount(value: (PersistenceTransaction, Double) => PersistencePromise[Double]): Self = StObject.set(x, "calculateTargetCount", js.Any.fromFunction2(value))
      
      inline def setCollect(value: (PersistenceTransaction, ActiveTargets) => PersistencePromise[LruResults]): Self = StObject.set(x, "collect", js.Any.fromFunction2(value))
      
      inline def setGetCacheSize(value: PersistenceTransaction => PersistencePromise[Double]): Self = StObject.set(x, "getCacheSize", js.Any.fromFunction1(value))
      
      inline def setNthSequenceNumber(value: (PersistenceTransaction, Double) => PersistencePromise[Double]): Self = StObject.set(x, "nthSequenceNumber", js.Any.fromFunction2(value))
      
      inline def setParams(value: LruParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setRemoveOrphanedDocuments(value: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double]): Self = StObject.set(x, "removeOrphanedDocuments", js.Any.fromFunction2(value))
      
      inline def setRemoveTargets(value: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double]): Self = StObject.set(x, "removeTargets", js.Any.fromFunction3(value))
    }
  }
  
  trait LruResults extends StObject {
    
    val didRun: Boolean
    
    val documentsRemoved: Double
    
    val sequenceNumbersCollected: Double
    
    val targetsRemoved: Double
  }
  object LruResults {
    
    inline def apply(
      didRun: Boolean,
      documentsRemoved: Double,
      sequenceNumbersCollected: Double,
      targetsRemoved: Double
    ): LruResults = {
      val __obj = js.Dynamic.literal(didRun = didRun.asInstanceOf[js.Any], documentsRemoved = documentsRemoved.asInstanceOf[js.Any], sequenceNumbersCollected = sequenceNumbersCollected.asInstanceOf[js.Any], targetsRemoved = targetsRemoved.asInstanceOf[js.Any])
      __obj.asInstanceOf[LruResults]
    }
    
    extension [Self <: LruResults](x: Self) {
      
      inline def setDidRun(value: Boolean): Self = StObject.set(x, "didRun", value.asInstanceOf[js.Any])
      
      inline def setDocumentsRemoved(value: Double): Self = StObject.set(x, "documentsRemoved", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumbersCollected(value: Double): Self = StObject.set(x, "sequenceNumbersCollected", value.asInstanceOf[js.Any])
      
      inline def setTargetsRemoved(value: Double): Self = StObject.set(x, "targetsRemoved", value.asInstanceOf[js.Any])
    }
  }
}
