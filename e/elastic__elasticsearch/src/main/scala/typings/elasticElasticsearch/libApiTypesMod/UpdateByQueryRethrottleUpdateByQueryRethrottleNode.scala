package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateByQueryRethrottleUpdateByQueryRethrottleNode
  extends StObject
     with SpecUtilsBaseNode {
  
  var tasks: Record[TaskId, TasksTaskInfo]
}
object UpdateByQueryRethrottleUpdateByQueryRethrottleNode {
  
  inline def apply(
    attributes: Record[String, String],
    host: Host,
    ip: Ip,
    name: Name,
    tasks: Record[TaskId, TasksTaskInfo],
    transport_address: TransportAddress
  ): UpdateByQueryRethrottleUpdateByQueryRethrottleNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByQueryRethrottleUpdateByQueryRethrottleNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateByQueryRethrottleUpdateByQueryRethrottleNode] (val x: Self) extends AnyVal {
    
    inline def setTasks(value: Record[TaskId, TasksTaskInfo]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
  }
}
