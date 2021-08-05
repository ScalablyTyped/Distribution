package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeFilterMod.NodeFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedFilterMod {
  
  @JSImport("@firebase/database/dist/src/core/view/filter/IndexedFilter", "IndexedFilter")
  @js.native
  class IndexedFilter protected ()
    extends StObject
       with NodeFilter {
    def this(index_ : Index) = this()
    
    /* private */ val index_ : js.Any = js.native
  }
}
