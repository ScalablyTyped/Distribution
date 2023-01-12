package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlJobBlocked extends StObject {
  
  var reason: MlJobBlockedReason
  
  var task_id: js.UndefOr[TaskId] = js.undefined
}
object MlJobBlocked {
  
  inline def apply(reason: MlJobBlockedReason): MlJobBlocked = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlJobBlocked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlJobBlocked] (val x: Self) extends AnyVal {
    
    inline def setReason(value: MlJobBlockedReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTask_id(value: TaskId): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
    
    inline def setTask_idUndefined: Self = StObject.set(x, "task_id", js.undefined)
  }
}
