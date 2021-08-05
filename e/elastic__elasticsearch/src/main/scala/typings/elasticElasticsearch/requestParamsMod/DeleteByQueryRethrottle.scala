package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteByQueryRethrottle
  extends StObject
     with Generic {
  
  var requests_per_second: Double
  
  var task_id: String
}
object DeleteByQueryRethrottle {
  
  inline def apply(requests_per_second: Double, task_id: String): DeleteByQueryRethrottle = {
    val __obj = js.Dynamic.literal(requests_per_second = requests_per_second.asInstanceOf[js.Any], task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteByQueryRethrottle]
  }
  
  extension [Self <: DeleteByQueryRethrottle](x: Self) {
    
    inline def setRequests_per_second(value: Double): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setTask_id(value: String): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
  }
}
