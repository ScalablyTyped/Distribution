package typings.fsTreeDiff

import typings.fsTreeDiff.entryMod.BaseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Entries[T /* <: BaseEntry */] extends StObject {
    
    var entries: js.UndefOr[js.Array[T]] = js.undefined
    
    var sortAndExpand: js.UndefOr[Boolean] = js.undefined
  }
  object Entries {
    
    inline def apply[T /* <: BaseEntry */](): Entries[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Entries[T]]
    }
    
    extension [Self <: Entries[?], T /* <: BaseEntry */](x: Self & Entries[T]) {
      
      inline def setEntries(value: js.Array[T]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVarargs(value: T*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setSortAndExpand(value: Boolean): Self = StObject.set(x, "sortAndExpand", value.asInstanceOf[js.Any])
      
      inline def setSortAndExpandUndefined: Self = StObject.set(x, "sortAndExpand", js.undefined)
    }
  }
}
