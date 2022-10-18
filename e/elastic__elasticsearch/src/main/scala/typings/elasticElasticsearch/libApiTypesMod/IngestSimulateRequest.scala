package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var docs: js.UndefOr[js.Array[IngestSimulateDocument]] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var pipeline: js.UndefOr[IngestPipeline] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object IngestSimulateRequest {
  
  inline def apply(): IngestSimulateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestSimulateRequest]
  }
  
  extension [Self <: IngestSimulateRequest](x: Self) {
    
    inline def setDocs(value: js.Array[IngestSimulateDocument]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: IngestSimulateDocument*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPipeline(value: IngestPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
