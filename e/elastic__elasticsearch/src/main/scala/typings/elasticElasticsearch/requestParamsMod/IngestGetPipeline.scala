package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGetPipeline
  extends StObject
     with Generic {
  
  var id: js.UndefOr[String] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
}
object IngestGetPipeline {
  
  inline def apply(): IngestGetPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestGetPipeline]
  }
  
  extension [Self <: IngestGetPipeline](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
  }
}
