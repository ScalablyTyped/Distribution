package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogstashPutPipelineRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, use 'pipeline' instead. */
  var body: js.UndefOr[LogstashPipeline] = js.undefined
  
  var id: Id
}
object LogstashPutPipelineRequest {
  
  inline def apply(id: Id): LogstashPutPipelineRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogstashPutPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogstashPutPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: LogstashPipeline): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
