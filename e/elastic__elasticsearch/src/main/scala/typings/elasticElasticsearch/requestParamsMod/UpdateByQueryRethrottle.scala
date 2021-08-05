package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateByQueryRethrottle
  extends StObject
     with Generic {
  
  var requests_per_second: Double
  
  var task_id: String
}
object UpdateByQueryRethrottle {
  
  inline def apply(requests_per_second: Double, task_id: String): UpdateByQueryRethrottle = {
    val __obj = js.Dynamic.literal(requests_per_second = requests_per_second.asInstanceOf[js.Any], task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByQueryRethrottle]
  }
  
  extension [Self <: UpdateByQueryRethrottle](x: Self) {
    
    inline def setRequests_per_second(value: Double): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setTask_id(value: String): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
  }
}
