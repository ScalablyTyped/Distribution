package typings.firebaseDatabase

import typings.firebaseDatabase.filterNodeFilterMod.NodeFilter
import typings.firebaseDatabase.indexesIndexMod.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterIndexedFilterMod {
  
  @JSImport("@firebase/database/dist/src/core/view/filter/IndexedFilter", "IndexedFilter")
  @js.native
  open class IndexedFilter protected ()
    extends StObject
       with NodeFilter {
    def this(index_ : Index) = this()
    
    /* private */ val index_ : Any = js.native
  }
}
