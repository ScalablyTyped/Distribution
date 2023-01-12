package typings.elasticElasticsearch.libApiTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogstashDeletePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
