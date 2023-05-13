package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait oo extends StObject {
  
  /**
    * Clears the cached keys for a mutation batch. This method should be
    * called by secondary clients after they process mutation updates.
    *
    * Note that this method does not have to be called from primary clients as
    * the corresponding cache entries are cleared when an acknowledged or
    * rejected batch is removed from the mutation queue.
    */
  def Cn(t: Any): Unit
  
  def Dn(t: Any, e: Any): Rt_
  
  /**
    * Returns the document keys for the mutation batch with the given batchId.
    * For primary clients, this method returns `null` after
    * `removeMutationBatches()` has been called. Secondary clients return a
    * cached result until `removeCachedMutationKeys()` is invoked.
    */
  def Sn(t: Any, e: Any): Any
  
  def addMutationBatch(t: Any, e: Any, n: Any, s: Any): Any
  
  def checkEmpty(t: Any): Any
  
  def containsKey(t: Any, e: Any): Any
  
  def getAllMutationBatches(t: Any): Any
  
  def getAllMutationBatchesAffectingDocumentKey(t: Any, e: Any): Any
  
  def getAllMutationBatchesAffectingDocumentKeys(t: Any, e: Any): Rt_
  
  def getAllMutationBatchesAffectingQuery(t: Any, e: Any): Any
  
  def getHighestUnacknowledgedBatchId(t: Any): Any
  
  def getNextMutationBatchAfterBatchId(t: Any, e: Any): Any
  
  var indexManager: Any
  
  def lookupMutationBatch(t: Any, e: Any): Any
  
  def performConsistencyCheck(t: Any): Any
  
  var referenceDelegate: Any
  
  def removeMutationBatch(t: Any, e: Any): Rt_
  
  var serializer: Any
  
  var userId: Any
  
  /** Returns the mutation queue's metadata from IndexedDb. */
  def xn(t: Any): Any
}
object oo {
  
  inline def apply(
    Cn: Any => Unit,
    Dn: (Any, Any) => Rt_,
    Sn: (Any, Any) => Any,
    addMutationBatch: (Any, Any, Any, Any) => Any,
    checkEmpty: Any => Any,
    containsKey: (Any, Any) => Any,
    getAllMutationBatches: Any => Any,
    getAllMutationBatchesAffectingDocumentKey: (Any, Any) => Any,
    getAllMutationBatchesAffectingDocumentKeys: (Any, Any) => Rt_,
    getAllMutationBatchesAffectingQuery: (Any, Any) => Any,
    getHighestUnacknowledgedBatchId: Any => Any,
    getNextMutationBatchAfterBatchId: (Any, Any) => Any,
    indexManager: Any,
    lookupMutationBatch: (Any, Any) => Any,
    performConsistencyCheck: Any => Any,
    referenceDelegate: Any,
    removeMutationBatch: (Any, Any) => Rt_,
    serializer: Any,
    userId: Any,
    xn: Any => Any
  ): oo = {
    val __obj = js.Dynamic.literal(Cn = js.Any.fromFunction1(Cn), Dn = js.Any.fromFunction2(Dn), Sn = js.Any.fromFunction2(Sn), addMutationBatch = js.Any.fromFunction4(addMutationBatch), checkEmpty = js.Any.fromFunction1(checkEmpty), containsKey = js.Any.fromFunction2(containsKey), getAllMutationBatches = js.Any.fromFunction1(getAllMutationBatches), getAllMutationBatchesAffectingDocumentKey = js.Any.fromFunction2(getAllMutationBatchesAffectingDocumentKey), getAllMutationBatchesAffectingDocumentKeys = js.Any.fromFunction2(getAllMutationBatchesAffectingDocumentKeys), getAllMutationBatchesAffectingQuery = js.Any.fromFunction2(getAllMutationBatchesAffectingQuery), getHighestUnacknowledgedBatchId = js.Any.fromFunction1(getHighestUnacknowledgedBatchId), getNextMutationBatchAfterBatchId = js.Any.fromFunction2(getNextMutationBatchAfterBatchId), indexManager = indexManager.asInstanceOf[js.Any], lookupMutationBatch = js.Any.fromFunction2(lookupMutationBatch), performConsistencyCheck = js.Any.fromFunction1(performConsistencyCheck), referenceDelegate = referenceDelegate.asInstanceOf[js.Any], removeMutationBatch = js.Any.fromFunction2(removeMutationBatch), serializer = serializer.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], xn = js.Any.fromFunction1(xn))
    __obj.asInstanceOf[oo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: oo] (val x: Self) extends AnyVal {
    
    inline def setAddMutationBatch(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "addMutationBatch", js.Any.fromFunction4(value))
    
    inline def setCheckEmpty(value: Any => Any): Self = StObject.set(x, "checkEmpty", js.Any.fromFunction1(value))
    
    inline def setCn(value: Any => Unit): Self = StObject.set(x, "Cn", js.Any.fromFunction1(value))
    
    inline def setContainsKey(value: (Any, Any) => Any): Self = StObject.set(x, "containsKey", js.Any.fromFunction2(value))
    
    inline def setDn(value: (Any, Any) => Rt_): Self = StObject.set(x, "Dn", js.Any.fromFunction2(value))
    
    inline def setGetAllMutationBatches(value: Any => Any): Self = StObject.set(x, "getAllMutationBatches", js.Any.fromFunction1(value))
    
    inline def setGetAllMutationBatchesAffectingDocumentKey(value: (Any, Any) => Any): Self = StObject.set(x, "getAllMutationBatchesAffectingDocumentKey", js.Any.fromFunction2(value))
    
    inline def setGetAllMutationBatchesAffectingDocumentKeys(value: (Any, Any) => Rt_): Self = StObject.set(x, "getAllMutationBatchesAffectingDocumentKeys", js.Any.fromFunction2(value))
    
    inline def setGetAllMutationBatchesAffectingQuery(value: (Any, Any) => Any): Self = StObject.set(x, "getAllMutationBatchesAffectingQuery", js.Any.fromFunction2(value))
    
    inline def setGetHighestUnacknowledgedBatchId(value: Any => Any): Self = StObject.set(x, "getHighestUnacknowledgedBatchId", js.Any.fromFunction1(value))
    
    inline def setGetNextMutationBatchAfterBatchId(value: (Any, Any) => Any): Self = StObject.set(x, "getNextMutationBatchAfterBatchId", js.Any.fromFunction2(value))
    
    inline def setIndexManager(value: Any): Self = StObject.set(x, "indexManager", value.asInstanceOf[js.Any])
    
    inline def setLookupMutationBatch(value: (Any, Any) => Any): Self = StObject.set(x, "lookupMutationBatch", js.Any.fromFunction2(value))
    
    inline def setPerformConsistencyCheck(value: Any => Any): Self = StObject.set(x, "performConsistencyCheck", js.Any.fromFunction1(value))
    
    inline def setReferenceDelegate(value: Any): Self = StObject.set(x, "referenceDelegate", value.asInstanceOf[js.Any])
    
    inline def setRemoveMutationBatch(value: (Any, Any) => Rt_): Self = StObject.set(x, "removeMutationBatch", js.Any.fromFunction2(value))
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setSn(value: (Any, Any) => Any): Self = StObject.set(x, "Sn", js.Any.fromFunction2(value))
    
    inline def setUserId(value: Any): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setXn(value: Any => Any): Self = StObject.set(x, "xn", js.Any.fromFunction1(value))
  }
}
