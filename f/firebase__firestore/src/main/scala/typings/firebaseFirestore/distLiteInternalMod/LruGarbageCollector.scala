package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LruGarbageCollector] (val x: Self) extends AnyVal {
    
    inline def setCalculateTargetCount(value: (PersistenceTransaction, Double) => PersistencePromise[Double]): Self = StObject.set(x, "calculateTargetCount", js.Any.fromFunction2(value))
    
    inline def setCollect(value: (PersistenceTransaction, ActiveTargets) => PersistencePromise[LruResults]): Self = StObject.set(x, "collect", js.Any.fromFunction2(value))
    
    inline def setGetCacheSize(value: PersistenceTransaction => PersistencePromise[Double]): Self = StObject.set(x, "getCacheSize", js.Any.fromFunction1(value))
    
    inline def setNthSequenceNumber(value: (PersistenceTransaction, Double) => PersistencePromise[Double]): Self = StObject.set(x, "nthSequenceNumber", js.Any.fromFunction2(value))
    
    inline def setParams(value: LruParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setRemoveOrphanedDocuments(value: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double]): Self = StObject.set(x, "removeOrphanedDocuments", js.Any.fromFunction2(value))
    
    inline def setRemoveTargets(value: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double]): Self = StObject.set(x, "removeTargets", js.Any.fromFunction3(value))
  }
}
