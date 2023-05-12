package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.std.IDBKeyRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A persisted implementation of IndexManager.
  *
  * PORTING NOTE: Unlike iOS and Android, the Web SDK does not memoize index
  * data as it supports multi-tab access.
  */
trait Jr extends StObject {
  
  /**
    * Updates the index entries for the provided document by deleting entries
    * that are no longer referenced in `newEntries` and adding all newly added
    * entries.
    */ def An(t: Any, e: Any, n: Any, s: Any, i: Any): vt
  
  /** Creates the index entries for the given document. */ def En(t: Any, e: Any): Ee
  
  def In(t: Any): Any
  
  def Pn(t: Any, e: Any): Boolean
  
  def Rn(t: Any, e: Any, n: Any, s: Any): Any
  
  def Tn(t: Any, e: Any, n: Any): Any
  
  /** Generates the upper bound for `arrayValue` and `directionalValue`. */ def _n(t: Any, e: Any, n: Any, s: Any): kr
  
  def addFieldIndex(t: Any, e: Any): Any
  
  /**
    * Adds a new entry to the collection parent index.
    *
    * Repeated calls for the same collectionPath should be avoided within a
    * transaction as IndexedDbIndexManager only caches writes once a transaction
    * has been committed.
    */ def addToCollectionParentIndex(t: Any, e: Any): Any
  
  /**
    * Encodes the given bounds according to the specification in `target`. For IN
    * queries, a list of possible values is returned.
    */ def an(t: Any, e: Any, n: Any): js.Array[Any]
  
  def cn(t: Any, e: Any): Any
  
  /**
    * Returns a new set of IDB ranges that splits the existing range and excludes
    * any values that match the `notInValue` from these ranges. As an example,
    * '[foo > 2 && foo != 3]` becomes  `[foo > 2 && < 3, foo > 3]`.
    */ def createRange(t: Any, e: Any, n: Any): js.Array[IDBKeyRange]
  
  var databaseId: Any
  
  def deleteFieldIndex(t: Any, e: Any): Any
  
  /** Generates the lower bound for `arrayValue` and `directionalValue`. */ def dn(t: Any, e: Any, n: Any, s: Any): kr
  
  /** Encodes a single value to the ascending index format. */ def fn(t: Any): js.typedarray.Uint8Array
  
  def getCollectionParents(t: Any, e: Any): Any
  
  def getDocumentsMatchingTarget(t: Any, e: Any): vt
  
  def getFieldIndexes(t: Any, e: Any): Any
  
  def getIndexType(t: Any, e: Any): vt
  
  def getMinOffset(t: Any, e: Any): vt
  
  def getMinOffsetFromCollectionGroup(t: Any, e: Any): Any
  
  def getNextCollectionGroupToUpdate(t: Any): Any
  
  def gn(t: Any, e: Any): Boolean
  
  /**
    * Encodes the given field values according to the specification in `target`.
    * For IN queries, a list of possible values is returned.
    */ def hn(t: Any, e: Any, n: Any): js.Array[Any]
  
  /**
    * Constructs a key range query on `DbIndexEntryStore` that unions all
    * bounds.
    */ def ln(t: Any, e: Any, n: Any, s: Any, i: Any, r: Any, o: Any): js.Array[IDBKeyRange]
  
  /**
    * Returns an encoded form of the document key that sorts based on the key
    * ordering of the field index.
    */ def mn(t: Any, e: Any): js.typedarray.Uint8Array
  
  /**
    * Maps from a target to its equivalent list of sub-targets. Each sub-target
    * contains only one term from the target's disjunctive normal form (DNF).
    */
  var on: os
  
  /** Returns the byte representation for the provided encoders. */ def pn(t: Any): js.Array[Any]
  
  /**
    * An in-memory copy of the index entries we've already written since the SDK
    * launched. Used to avoid re-writing the same entry repeatedly.
    *
    * This is *NOT* a complete cache of what's in persistence and so can never be
    * used to satisfy reads.
    */
  var rn: Wr
  
  var uid: Any
  
  def un(t: Any): Any
  
  def updateCollectionGroup(t: Any, e: Any, n: Any): Any
  
  def updateIndexEntries(t: Any, e: Any): vt
  
  var user: Any
  
  def vn(t: Any, e: Any, n: Any, s: Any): Any
  
  /**
    * Returns the byte encoded form of the directional values in the field index.
    * Returns `null` if the document does not have all fields specified in the
    * index.
    */ def wn(t: Any, e: Any): js.typedarray.Uint8Array | Null
  
  /**
    * Creates a separate encoder for each element of an array.
    *
    * The method appends each value to all existing encoders (e.g. filter("a",
    * "==", "a1").filter("b", "in", ["b1", "b2"]) becomes ["a1,b1", "a1,b2"]). A
    * list of new encoders is returned.
    */ def yn(t: Any, e: Any, n: Any): js.Array[Nr]
}
object Jr {
  
  inline def apply(
    An: (Any, Any, Any, Any, Any) => vt,
    En: (Any, Any) => Ee,
    In: Any => Any,
    Pn: (Any, Any) => Boolean,
    Rn: (Any, Any, Any, Any) => Any,
    Tn: (Any, Any, Any) => Any,
    _n: (Any, Any, Any, Any) => kr,
    addFieldIndex: (Any, Any) => Any,
    addToCollectionParentIndex: (Any, Any) => Any,
    an: (Any, Any, Any) => js.Array[Any],
    cn: (Any, Any) => Any,
    createRange: (Any, Any, Any) => js.Array[IDBKeyRange],
    databaseId: Any,
    deleteFieldIndex: (Any, Any) => Any,
    dn: (Any, Any, Any, Any) => kr,
    fn: Any => js.typedarray.Uint8Array,
    getCollectionParents: (Any, Any) => Any,
    getDocumentsMatchingTarget: (Any, Any) => vt,
    getFieldIndexes: (Any, Any) => Any,
    getIndexType: (Any, Any) => vt,
    getMinOffset: (Any, Any) => vt,
    getMinOffsetFromCollectionGroup: (Any, Any) => Any,
    getNextCollectionGroupToUpdate: Any => Any,
    gn: (Any, Any) => Boolean,
    hn: (Any, Any, Any) => js.Array[Any],
    ln: (Any, Any, Any, Any, Any, Any, Any) => js.Array[IDBKeyRange],
    mn: (Any, Any) => js.typedarray.Uint8Array,
    on: os,
    pn: Any => js.Array[Any],
    rn: Wr,
    uid: Any,
    un: Any => Any,
    updateCollectionGroup: (Any, Any, Any) => Any,
    updateIndexEntries: (Any, Any) => vt,
    user: Any,
    vn: (Any, Any, Any, Any) => Any,
    wn: (Any, Any) => js.typedarray.Uint8Array | Null,
    yn: (Any, Any, Any) => js.Array[Nr]
  ): Jr = {
    val __obj = js.Dynamic.literal(An = js.Any.fromFunction5(An), En = js.Any.fromFunction2(En), In = js.Any.fromFunction1(In), Pn = js.Any.fromFunction2(Pn), Rn = js.Any.fromFunction4(Rn), Tn = js.Any.fromFunction3(Tn), _n = js.Any.fromFunction4(_n), addFieldIndex = js.Any.fromFunction2(addFieldIndex), addToCollectionParentIndex = js.Any.fromFunction2(addToCollectionParentIndex), an = js.Any.fromFunction3(an), cn = js.Any.fromFunction2(cn), createRange = js.Any.fromFunction3(createRange), databaseId = databaseId.asInstanceOf[js.Any], deleteFieldIndex = js.Any.fromFunction2(deleteFieldIndex), dn = js.Any.fromFunction4(dn), fn = js.Any.fromFunction1(fn), getCollectionParents = js.Any.fromFunction2(getCollectionParents), getDocumentsMatchingTarget = js.Any.fromFunction2(getDocumentsMatchingTarget), getFieldIndexes = js.Any.fromFunction2(getFieldIndexes), getIndexType = js.Any.fromFunction2(getIndexType), getMinOffset = js.Any.fromFunction2(getMinOffset), getMinOffsetFromCollectionGroup = js.Any.fromFunction2(getMinOffsetFromCollectionGroup), getNextCollectionGroupToUpdate = js.Any.fromFunction1(getNextCollectionGroupToUpdate), gn = js.Any.fromFunction2(gn), hn = js.Any.fromFunction3(hn), ln = js.Any.fromFunction7(ln), mn = js.Any.fromFunction2(mn), on = on.asInstanceOf[js.Any], pn = js.Any.fromFunction1(pn), rn = rn.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], un = js.Any.fromFunction1(un), updateCollectionGroup = js.Any.fromFunction3(updateCollectionGroup), updateIndexEntries = js.Any.fromFunction2(updateIndexEntries), user = user.asInstanceOf[js.Any], vn = js.Any.fromFunction4(vn), wn = js.Any.fromFunction2(wn), yn = js.Any.fromFunction3(yn))
    __obj.asInstanceOf[Jr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jr] (val x: Self) extends AnyVal {
    
    inline def setAddFieldIndex(value: (Any, Any) => Any): Self = StObject.set(x, "addFieldIndex", js.Any.fromFunction2(value))
    
    inline def setAddToCollectionParentIndex(value: (Any, Any) => Any): Self = StObject.set(x, "addToCollectionParentIndex", js.Any.fromFunction2(value))
    
    inline def setAn(value: (Any, Any, Any, Any, Any) => vt): Self = StObject.set(x, "An", js.Any.fromFunction5(value))
    
    inline def setCn(value: (Any, Any) => Any): Self = StObject.set(x, "cn", js.Any.fromFunction2(value))
    
    inline def setCreateRange(value: (Any, Any, Any) => js.Array[IDBKeyRange]): Self = StObject.set(x, "createRange", js.Any.fromFunction3(value))
    
    inline def setDatabaseId(value: Any): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDeleteFieldIndex(value: (Any, Any) => Any): Self = StObject.set(x, "deleteFieldIndex", js.Any.fromFunction2(value))
    
    inline def setDn(value: (Any, Any, Any, Any) => kr): Self = StObject.set(x, "dn", js.Any.fromFunction4(value))
    
    inline def setEn(value: (Any, Any) => Ee): Self = StObject.set(x, "En", js.Any.fromFunction2(value))
    
    inline def setFn(value: Any => js.typedarray.Uint8Array): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setGetCollectionParents(value: (Any, Any) => Any): Self = StObject.set(x, "getCollectionParents", js.Any.fromFunction2(value))
    
    inline def setGetDocumentsMatchingTarget(value: (Any, Any) => vt): Self = StObject.set(x, "getDocumentsMatchingTarget", js.Any.fromFunction2(value))
    
    inline def setGetFieldIndexes(value: (Any, Any) => Any): Self = StObject.set(x, "getFieldIndexes", js.Any.fromFunction2(value))
    
    inline def setGetIndexType(value: (Any, Any) => vt): Self = StObject.set(x, "getIndexType", js.Any.fromFunction2(value))
    
    inline def setGetMinOffset(value: (Any, Any) => vt): Self = StObject.set(x, "getMinOffset", js.Any.fromFunction2(value))
    
    inline def setGetMinOffsetFromCollectionGroup(value: (Any, Any) => Any): Self = StObject.set(x, "getMinOffsetFromCollectionGroup", js.Any.fromFunction2(value))
    
    inline def setGetNextCollectionGroupToUpdate(value: Any => Any): Self = StObject.set(x, "getNextCollectionGroupToUpdate", js.Any.fromFunction1(value))
    
    inline def setGn(value: (Any, Any) => Boolean): Self = StObject.set(x, "gn", js.Any.fromFunction2(value))
    
    inline def setHn(value: (Any, Any, Any) => js.Array[Any]): Self = StObject.set(x, "hn", js.Any.fromFunction3(value))
    
    inline def setIn(value: Any => Any): Self = StObject.set(x, "In", js.Any.fromFunction1(value))
    
    inline def setLn(value: (Any, Any, Any, Any, Any, Any, Any) => js.Array[IDBKeyRange]): Self = StObject.set(x, "ln", js.Any.fromFunction7(value))
    
    inline def setMn(value: (Any, Any) => js.typedarray.Uint8Array): Self = StObject.set(x, "mn", js.Any.fromFunction2(value))
    
    inline def setOn(value: os): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setPn(value: (Any, Any) => Boolean): Self = StObject.set(x, "Pn", js.Any.fromFunction2(value))
    
    inline def setRn(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "Rn", js.Any.fromFunction4(value))
    
    inline def setTn(value: (Any, Any, Any) => Any): Self = StObject.set(x, "Tn", js.Any.fromFunction3(value))
    
    inline def setUid(value: Any): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUn(value: Any => Any): Self = StObject.set(x, "un", js.Any.fromFunction1(value))
    
    inline def setUpdateCollectionGroup(value: (Any, Any, Any) => Any): Self = StObject.set(x, "updateCollectionGroup", js.Any.fromFunction3(value))
    
    inline def setUpdateIndexEntries(value: (Any, Any) => vt): Self = StObject.set(x, "updateIndexEntries", js.Any.fromFunction2(value))
    
    inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setVn(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "vn", js.Any.fromFunction4(value))
    
    inline def setWn(value: (Any, Any) => js.typedarray.Uint8Array | Null): Self = StObject.set(x, "wn", js.Any.fromFunction2(value))
    
    inline def setYn(value: (Any, Any, Any) => js.Array[Nr]): Self = StObject.set(x, "yn", js.Any.fromFunction3(value))
    
    inline def set_n(value: (Any, Any, Any, Any) => kr): Self = StObject.set(x, "_n", js.Any.fromFunction4(value))
  }
}
