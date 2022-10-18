package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestPipeline extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var on_failure: js.UndefOr[js.Array[IngestProcessorContainer]] = js.undefined
  
  var processors: js.UndefOr[js.Array[IngestProcessorContainer]] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object IngestPipeline {
  
  inline def apply(): IngestPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestPipeline]
  }
  
  extension [Self <: IngestPipeline](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOn_failure(value: js.Array[IngestProcessorContainer]): Self = StObject.set(x, "on_failure", value.asInstanceOf[js.Any])
    
    inline def setOn_failureUndefined: Self = StObject.set(x, "on_failure", js.undefined)
    
    inline def setOn_failureVarargs(value: IngestProcessorContainer*): Self = StObject.set(x, "on_failure", js.Array(value*))
    
    inline def setProcessors(value: js.Array[IngestProcessorContainer]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    inline def setProcessorsVarargs(value: IngestProcessorContainer*): Self = StObject.set(x, "processors", js.Array(value*))
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
