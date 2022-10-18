package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearScrollRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var scroll_id: js.UndefOr[ScrollIds] = js.undefined
}
object ClearScrollRequest {
  
  inline def apply(): ClearScrollRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearScrollRequest]
  }
  
  extension [Self <: ClearScrollRequest](x: Self) {
    
    inline def setScroll_id(value: ScrollIds): Self = StObject.set(x, "scroll_id", value.asInstanceOf[js.Any])
    
    inline def setScroll_idUndefined: Self = StObject.set(x, "scroll_id", js.undefined)
    
    inline def setScroll_idVarargs(value: ScrollId*): Self = StObject.set(x, "scroll_id", js.Array(value*))
  }
}
