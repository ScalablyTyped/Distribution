package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var scroll: js.UndefOr[Duration] = js.undefined
  
  var scroll_id: js.UndefOr[ScrollId] = js.undefined
}
object ScrollRequest {
  
  inline def apply(): ScrollRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollRequest] (val x: Self) extends AnyVal {
    
    inline def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    inline def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    inline def setScroll(value: Duration): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setScroll_id(value: ScrollId): Self = StObject.set(x, "scroll_id", value.asInstanceOf[js.Any])
    
    inline def setScroll_idUndefined: Self = StObject.set(x, "scroll_id", js.undefined)
  }
}
