package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichStatsExecutingPolicy extends StObject {
  
  var name: Name
  
  var task: TasksTaskInfo
}
object EnrichStatsExecutingPolicy {
  
  inline def apply(name: Name, task: TasksTaskInfo): EnrichStatsExecutingPolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichStatsExecutingPolicy]
  }
  
  extension [Self <: EnrichStatsExecutingPolicy](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTask(value: TasksTaskInfo): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
