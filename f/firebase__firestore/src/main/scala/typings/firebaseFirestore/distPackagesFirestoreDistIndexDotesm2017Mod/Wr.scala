package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal implementation of the collection-parent index exposed by MemoryIndexManager.
  * Also used for in-memory caching by IndexedDbIndexManager and initial index population
  * in indexeddb_schema.ts
  */ trait Wr extends StObject {
  
  def add(t: Any): Boolean
  
  def getEntries(t: Any): Any
  
  def has(t: Any): Any
}
object Wr {
  
  inline def apply(add: Any => Boolean, getEntries: Any => Any, has: Any => Any): Wr = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getEntries = js.Any.fromFunction1(getEntries), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Wr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Wr] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Any => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setGetEntries(value: Any => Any): Self = StObject.set(x, "getEntries", js.Any.fromFunction1(value))
    
    inline def setHas(value: Any => Any): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
