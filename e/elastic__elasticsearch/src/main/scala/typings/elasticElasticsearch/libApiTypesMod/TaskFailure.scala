package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskFailure extends StObject {
  
  var node_id: NodeId
  
  var reason: ErrorCause
  
  var status: String
  
  var task_id: long
}
object TaskFailure {
  
  inline def apply(node_id: NodeId, reason: ErrorCause, status: String, task_id: long): TaskFailure = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskFailure]
  }
  
  extension [Self <: TaskFailure](x: Self) {
    
    inline def setNode_id(value: NodeId): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setReason(value: ErrorCause): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTask_id(value: long): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
  }
}
