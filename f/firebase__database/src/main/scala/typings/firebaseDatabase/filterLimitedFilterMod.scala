package typings.firebaseDatabase

import typings.firebaseDatabase.filterNodeFilterMod.NodeFilter
import typings.firebaseDatabase.viewQueryParamsMod.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterLimitedFilterMod {
  
  @JSImport("@firebase/database/dist/src/core/view/filter/LimitedFilter", "LimitedFilter")
  @js.native
  open class LimitedFilter protected ()
    extends StObject
       with NodeFilter {
    def this(params: QueryParams) = this()
    
    /* private */ var fullLimitUpdateChild_ : Any = js.native
    
    /* private */ val index_ : Any = js.native
    
    /* private */ val limit_ : Any = js.native
    
    /* private */ val rangedFilter_ : Any = js.native
    
    /* private */ val reverse_ : Any = js.native
  }
}
