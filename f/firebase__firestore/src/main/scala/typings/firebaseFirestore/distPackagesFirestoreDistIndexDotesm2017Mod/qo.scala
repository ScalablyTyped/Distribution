package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new memory-only RemoteDocumentCache.
  *
  * @param sizer - Used to assess the size of a document. For eager GC, this is
  * expected to just return 0 to avoid unnecessarily doing the work of
  * calculating the size.
  */
/**
  * Handles the details of adding and updating documents in the MemoryRemoteDocumentCache.
  */
trait qo
  extends StObject
     with vo {
  
  def applyChanges(t: Any): Rt_
  
  def getAllFromCache(t: Any, e: Any): Any
  
  def getFromCache(t: Any, e: Any): Any
  
  var os: Any
}
object qo {
  
  inline def apply(
    addEntry: Any => Unit,
    apply: Any => Any,
    applyChanges: Any => Rt_,
    assertNotApplied: () => Unit,
    changes: os,
    changesApplied: Boolean,
    getAllFromCache: (Any, Any) => Any,
    getEntries: (Any, Any) => Any,
    getEntry: (Any, Any) => Any,
    getFromCache: (Any, Any) => Any,
    os: Any,
    removeEntry: (Any, Any) => Unit
  ): qo = {
    val __obj = js.Dynamic.literal(addEntry = js.Any.fromFunction1(addEntry), apply = js.Any.fromFunction1(apply), applyChanges = js.Any.fromFunction1(applyChanges), assertNotApplied = js.Any.fromFunction0(assertNotApplied), changes = changes.asInstanceOf[js.Any], changesApplied = changesApplied.asInstanceOf[js.Any], getAllFromCache = js.Any.fromFunction2(getAllFromCache), getEntries = js.Any.fromFunction2(getEntries), getEntry = js.Any.fromFunction2(getEntry), getFromCache = js.Any.fromFunction2(getFromCache), os = os.asInstanceOf[js.Any], removeEntry = js.Any.fromFunction2(removeEntry))
    __obj.asInstanceOf[qo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: qo] (val x: Self) extends AnyVal {
    
    inline def setApplyChanges(value: Any => Rt_): Self = StObject.set(x, "applyChanges", js.Any.fromFunction1(value))
    
    inline def setGetAllFromCache(value: (Any, Any) => Any): Self = StObject.set(x, "getAllFromCache", js.Any.fromFunction2(value))
    
    inline def setGetFromCache(value: (Any, Any) => Any): Self = StObject.set(x, "getFromCache", js.Any.fromFunction2(value))
    
    inline def setOs(value: Any): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
