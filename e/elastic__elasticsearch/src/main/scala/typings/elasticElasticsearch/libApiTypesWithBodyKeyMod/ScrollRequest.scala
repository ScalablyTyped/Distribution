package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Scroll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Scroll] = js.undefined
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var scroll_id: js.UndefOr[ScrollId] = js.undefined
}
object ScrollRequest {
  
  inline def apply(): ScrollRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Scroll): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    inline def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    inline def setScroll_id(value: ScrollId): Self = StObject.set(x, "scroll_id", value.asInstanceOf[js.Any])
    
    inline def setScroll_idUndefined: Self = StObject.set(x, "scroll_id", js.undefined)
  }
}
