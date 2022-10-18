package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulatePipelineSimulation extends StObject {
  
  var doc: js.UndefOr[IngestSimulateDocumentSimulation] = js.undefined
  
  var processor_results: js.UndefOr[js.Array[IngestSimulatePipelineSimulation]] = js.undefined
  
  var processor_type: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[WatcherActionStatusOptions] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object IngestSimulatePipelineSimulation {
  
  inline def apply(): IngestSimulatePipelineSimulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestSimulatePipelineSimulation]
  }
  
  extension [Self <: IngestSimulatePipelineSimulation](x: Self) {
    
    inline def setDoc(value: IngestSimulateDocumentSimulation): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setProcessor_results(value: js.Array[IngestSimulatePipelineSimulation]): Self = StObject.set(x, "processor_results", value.asInstanceOf[js.Any])
    
    inline def setProcessor_resultsUndefined: Self = StObject.set(x, "processor_results", js.undefined)
    
    inline def setProcessor_resultsVarargs(value: IngestSimulatePipelineSimulation*): Self = StObject.set(x, "processor_results", js.Array(value*))
    
    inline def setProcessor_type(value: String): Self = StObject.set(x, "processor_type", value.asInstanceOf[js.Any])
    
    inline def setProcessor_typeUndefined: Self = StObject.set(x, "processor_type", js.undefined)
    
    inline def setStatus(value: WatcherActionStatusOptions): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
