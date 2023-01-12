package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupDeleteJobResponse extends StObject {
  
  var acknowledged: Boolean
  
  var task_failures: js.UndefOr[js.Array[TaskFailure]] = js.undefined
}
object RollupDeleteJobResponse {
  
  inline def apply(acknowledged: Boolean): RollupDeleteJobResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupDeleteJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupDeleteJobResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setTask_failures(value: js.Array[TaskFailure]): Self = StObject.set(x, "task_failures", value.asInstanceOf[js.Any])
    
    inline def setTask_failuresUndefined: Self = StObject.set(x, "task_failures", js.undefined)
    
    inline def setTask_failuresVarargs(value: TaskFailure*): Self = StObject.set(x, "task_failures", js.Array(value*))
  }
}
