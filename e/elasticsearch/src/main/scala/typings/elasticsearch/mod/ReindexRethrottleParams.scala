package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexRethrottleParams
  extends StObject
     with GenericParams {
  
  var requestsPerSecond: Double
  
  var taskId: String
}
object ReindexRethrottleParams {
  
  inline def apply(requestsPerSecond: Double, taskId: String): ReindexRethrottleParams = {
    val __obj = js.Dynamic.literal(requestsPerSecond = requestsPerSecond.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRethrottleParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReindexRethrottleParams] (val x: Self) extends AnyVal {
    
    inline def setRequestsPerSecond(value: Double): Self = StObject.set(x, "requestsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
