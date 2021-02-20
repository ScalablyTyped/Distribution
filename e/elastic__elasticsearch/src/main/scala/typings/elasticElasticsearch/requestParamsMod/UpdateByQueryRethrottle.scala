package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateByQueryRethrottle extends Generic {
  
  var requests_per_second: Double = js.native
  
  var task_id: String = js.native
}
object UpdateByQueryRethrottle {
  
  @scala.inline
  def apply(requests_per_second: Double, task_id: String): UpdateByQueryRethrottle = {
    val __obj = js.Dynamic.literal(requests_per_second = requests_per_second.asInstanceOf[js.Any], task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByQueryRethrottle]
  }
  
  @scala.inline
  implicit class UpdateByQueryRethrottleMutableBuilder[Self <: UpdateByQueryRethrottle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests_per_second(value: Double): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask_id(value: String): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
  }
}
