package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteFilterRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var filter_id: Id
}
object MlDeleteFilterRequest {
  
  inline def apply(filter_id: Id): MlDeleteFilterRequest = {
    val __obj = js.Dynamic.literal(filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDeleteFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter_id(value: Id): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
  }
}
