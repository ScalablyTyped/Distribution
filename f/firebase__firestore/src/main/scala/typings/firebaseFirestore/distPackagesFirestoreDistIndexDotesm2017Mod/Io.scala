package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements the steps for LRU garbage collection.
  */ trait Io extends StObject {
  
  var Qn: Any
  
  def Wn(t: Any, e: Any): Any
  
  def calculateTargetCount(t: Any, e: Any): Any
  
  def collect(t: Any, e: Any): Any
  
  def getCacheSize(t: Any): Any
  
  def nthSequenceNumber(t: Any, e: Any): Any
  
  var params: Any
  
  def removeOrphanedDocuments(t: Any, e: Any): Any
  
  def removeTargets(t: Any, e: Any, n: Any): Any
}
object Io {
  
  inline def apply(
    Qn: Any,
    Wn: (Any, Any) => Any,
    calculateTargetCount: (Any, Any) => Any,
    collect: (Any, Any) => Any,
    getCacheSize: Any => Any,
    nthSequenceNumber: (Any, Any) => Any,
    params: Any,
    removeOrphanedDocuments: (Any, Any) => Any,
    removeTargets: (Any, Any, Any) => Any
  ): Io = {
    val __obj = js.Dynamic.literal(Qn = Qn.asInstanceOf[js.Any], Wn = js.Any.fromFunction2(Wn), calculateTargetCount = js.Any.fromFunction2(calculateTargetCount), collect = js.Any.fromFunction2(collect), getCacheSize = js.Any.fromFunction1(getCacheSize), nthSequenceNumber = js.Any.fromFunction2(nthSequenceNumber), params = params.asInstanceOf[js.Any], removeOrphanedDocuments = js.Any.fromFunction2(removeOrphanedDocuments), removeTargets = js.Any.fromFunction3(removeTargets))
    __obj.asInstanceOf[Io]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Io] (val x: Self) extends AnyVal {
    
    inline def setCalculateTargetCount(value: (Any, Any) => Any): Self = StObject.set(x, "calculateTargetCount", js.Any.fromFunction2(value))
    
    inline def setCollect(value: (Any, Any) => Any): Self = StObject.set(x, "collect", js.Any.fromFunction2(value))
    
    inline def setGetCacheSize(value: Any => Any): Self = StObject.set(x, "getCacheSize", js.Any.fromFunction1(value))
    
    inline def setNthSequenceNumber(value: (Any, Any) => Any): Self = StObject.set(x, "nthSequenceNumber", js.Any.fromFunction2(value))
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setQn(value: Any): Self = StObject.set(x, "Qn", value.asInstanceOf[js.Any])
    
    inline def setRemoveOrphanedDocuments(value: (Any, Any) => Any): Self = StObject.set(x, "removeOrphanedDocuments", js.Any.fromFunction2(value))
    
    inline def setRemoveTargets(value: (Any, Any, Any) => Any): Self = StObject.set(x, "removeTargets", js.Any.fromFunction3(value))
    
    inline def setWn(value: (Any, Any) => Any): Self = StObject.set(x, "Wn", js.Any.fromFunction2(value))
  }
}
