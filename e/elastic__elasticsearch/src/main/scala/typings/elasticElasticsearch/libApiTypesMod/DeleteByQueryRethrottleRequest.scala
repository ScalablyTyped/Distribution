package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteByQueryRethrottleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var requests_per_second: js.UndefOr[float] = js.undefined
  
  var task_id: Id
}
object DeleteByQueryRethrottleRequest {
  
  inline def apply(task_id: Id): DeleteByQueryRethrottleRequest = {
    val __obj = js.Dynamic.literal(task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteByQueryRethrottleRequest]
  }
  
  extension [Self <: DeleteByQueryRethrottleRequest](x: Self) {
    
    inline def setRequests_per_second(value: float): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setRequests_per_secondUndefined: Self = StObject.set(x, "requests_per_second", js.undefined)
    
    inline def setTask_id(value: Id): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
  }
}
