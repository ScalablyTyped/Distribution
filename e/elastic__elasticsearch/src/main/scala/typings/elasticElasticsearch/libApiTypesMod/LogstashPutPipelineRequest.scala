package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogstashPutPipelineRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
  
  var pipeline: js.UndefOr[LogstashPipeline] = js.undefined
}
object LogstashPutPipelineRequest {
  
  inline def apply(id: Id): LogstashPutPipelineRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogstashPutPipelineRequest]
  }
  
  extension [Self <: LogstashPutPipelineRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: LogstashPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}
