package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetFiltersRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var filter_id: js.UndefOr[Ids] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object MlGetFiltersRequest {
  
  inline def apply(): MlGetFiltersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetFiltersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetFiltersRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter_id(value: Ids): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
    
    inline def setFilter_idUndefined: Self = StObject.set(x, "filter_id", js.undefined)
    
    inline def setFilter_idVarargs(value: Id*): Self = StObject.set(x, "filter_id", js.Array(value*))
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
