package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestPutPipelineRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var id: Id
  
  var if_version: js.UndefOr[VersionNumber] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var on_failure: js.UndefOr[js.Array[IngestProcessorContainer]] = js.undefined
  
  var processors: js.UndefOr[js.Array[IngestProcessorContainer]] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object IngestPutPipelineRequest {
  
  inline def apply(id: Id): IngestPutPipelineRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestPutPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestPutPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIf_version(value: VersionNumber): Self = StObject.set(x, "if_version", value.asInstanceOf[js.Any])
    
    inline def setIf_versionUndefined: Self = StObject.set(x, "if_version", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setOn_failure(value: js.Array[IngestProcessorContainer]): Self = StObject.set(x, "on_failure", value.asInstanceOf[js.Any])
    
    inline def setOn_failureUndefined: Self = StObject.set(x, "on_failure", js.undefined)
    
    inline def setOn_failureVarargs(value: IngestProcessorContainer*): Self = StObject.set(x, "on_failure", js.Array(value*))
    
    inline def setProcessors(value: js.Array[IngestProcessorContainer]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    inline def setProcessorsVarargs(value: IngestProcessorContainer*): Self = StObject.set(x, "processors", js.Array(value*))
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
