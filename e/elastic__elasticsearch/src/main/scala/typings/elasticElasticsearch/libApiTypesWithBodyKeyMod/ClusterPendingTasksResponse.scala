package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPendingTasksResponse extends StObject {
  
  var tasks: js.Array[ClusterPendingTasksPendingTask]
}
object ClusterPendingTasksResponse {
  
  inline def apply(tasks: js.Array[ClusterPendingTasksPendingTask]): ClusterPendingTasksResponse = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterPendingTasksResponse]
  }
  
  extension [Self <: ClusterPendingTasksResponse](x: Self) {
    
    inline def setTasks(value: js.Array[ClusterPendingTasksPendingTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: ClusterPendingTasksPendingTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
