package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteExpiredDataRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var job_id: js.UndefOr[Id] = js.undefined
  
  var requests_per_second: js.UndefOr[float] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlDeleteExpiredDataRequest {
  
  inline def apply(): MlDeleteExpiredDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDeleteExpiredDataRequest]
  }
  
  extension [Self <: MlDeleteExpiredDataRequest](x: Self) {
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setRequests_per_second(value: float): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setRequests_per_secondUndefined: Self = StObject.set(x, "requests_per_second", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
