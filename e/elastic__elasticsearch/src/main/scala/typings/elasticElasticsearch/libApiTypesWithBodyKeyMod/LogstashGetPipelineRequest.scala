package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogstashGetPipelineRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Ids
}
object LogstashGetPipelineRequest {
  
  inline def apply(id: Ids): LogstashGetPipelineRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogstashGetPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogstashGetPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Ids): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: Id*): Self = StObject.set(x, "id", js.Array(value*))
  }
}
