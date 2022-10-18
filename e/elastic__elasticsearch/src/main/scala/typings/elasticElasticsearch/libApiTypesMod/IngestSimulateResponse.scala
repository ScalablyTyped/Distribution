package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulateResponse extends StObject {
  
  var docs: js.Array[IngestSimulatePipelineSimulation]
}
object IngestSimulateResponse {
  
  inline def apply(docs: js.Array[IngestSimulatePipelineSimulation]): IngestSimulateResponse = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSimulateResponse]
  }
  
  extension [Self <: IngestSimulateResponse](x: Self) {
    
    inline def setDocs(value: js.Array[IngestSimulatePipelineSimulation]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: IngestSimulatePipelineSimulation*): Self = StObject.set(x, "docs", js.Array(value*))
  }
}
