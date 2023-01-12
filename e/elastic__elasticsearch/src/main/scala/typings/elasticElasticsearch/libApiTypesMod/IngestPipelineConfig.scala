package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestPipelineConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var processors: js.Array[IngestProcessorContainer]
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object IngestPipelineConfig {
  
  inline def apply(processors: js.Array[IngestProcessorContainer]): IngestPipelineConfig = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestPipelineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestPipelineConfig] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setProcessors(value: js.Array[IngestProcessorContainer]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsVarargs(value: IngestProcessorContainer*): Self = StObject.set(x, "processors", js.Array(value*))
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
