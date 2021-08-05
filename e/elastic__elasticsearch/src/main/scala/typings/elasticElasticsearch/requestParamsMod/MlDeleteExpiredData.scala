package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteExpiredData[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var job_id: js.UndefOr[String] = js.undefined
  
  var requests_per_second: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object MlDeleteExpiredData {
  
  inline def apply[T](): MlDeleteExpiredData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDeleteExpiredData[T]]
  }
  
  extension [Self <: MlDeleteExpiredData[?], T](x: Self & MlDeleteExpiredData[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setRequests_per_second(value: Double): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setRequests_per_secondUndefined: Self = StObject.set(x, "requests_per_second", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
