package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexRethrottleReindexNode
  extends StObject
     with SpecUtilsBaseNode {
  
  var tasks: Record[TaskId, ReindexRethrottleReindexTask]
}
object ReindexRethrottleReindexNode {
  
  inline def apply(
    attributes: Record[String, String],
    host: Host,
    ip: Ip,
    name: Name,
    tasks: Record[TaskId, ReindexRethrottleReindexTask],
    transport_address: TransportAddress
  ): ReindexRethrottleReindexNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRethrottleReindexNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReindexRethrottleReindexNode] (val x: Self) extends AnyVal {
    
    inline def setTasks(value: Record[TaskId, ReindexRethrottleReindexTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
  }
}
