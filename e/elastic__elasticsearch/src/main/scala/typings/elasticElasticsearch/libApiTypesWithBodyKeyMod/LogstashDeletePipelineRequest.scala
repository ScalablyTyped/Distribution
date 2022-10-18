package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogstashDeletePipelineRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object LogstashDeletePipelineRequest {
  
  inline def apply(id: Id): LogstashDeletePipelineRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogstashDeletePipelineRequest]
  }
  
  extension [Self <: LogstashDeletePipelineRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
