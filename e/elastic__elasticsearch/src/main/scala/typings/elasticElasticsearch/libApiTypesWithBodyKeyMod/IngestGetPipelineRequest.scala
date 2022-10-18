package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGetPipelineRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: js.UndefOr[Id] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var summary: js.UndefOr[Boolean] = js.undefined
}
object IngestGetPipelineRequest {
  
  inline def apply(): IngestGetPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestGetPipelineRequest]
  }
  
  extension [Self <: IngestGetPipelineRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setSummary(value: Boolean): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
