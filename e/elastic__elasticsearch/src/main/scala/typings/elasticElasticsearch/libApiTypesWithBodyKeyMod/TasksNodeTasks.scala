package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksNodeTasks extends StObject {
  
  var attributes: js.UndefOr[Record[String, String]] = js.undefined
  
  var host: js.UndefOr[Host] = js.undefined
  
  var ip: js.UndefOr[Ip] = js.undefined
  
  var name: js.UndefOr[NodeId] = js.undefined
  
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  var tasks: Record[TaskId, TasksTaskInfo]
  
  var transport_address: js.UndefOr[TransportAddress] = js.undefined
}
object TasksNodeTasks {
  
  inline def apply(tasks: Record[TaskId, TasksTaskInfo]): TasksNodeTasks = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksNodeTasks]
  }
  
  extension [Self <: TasksNodeTasks](x: Self) {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIp(value: Ip): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setName(value: NodeId): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setTasks(value: Record[TaskId, TasksTaskInfo]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
    
    inline def setTransport_addressUndefined: Self = StObject.set(x, "transport_address", js.undefined)
  }
}
