package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesHotThreadsHotThread extends StObject {
  
  var hosts: js.Array[Host]
  
  var node_id: Id
  
  var node_name: Name
  
  var threads: js.Array[String]
}
object NodesHotThreadsHotThread {
  
  inline def apply(hosts: js.Array[Host], node_id: Id, node_name: Name, threads: js.Array[String]): NodesHotThreadsHotThread = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], node_name = node_name.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreadsHotThread]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesHotThreadsHotThread] (val x: Self) extends AnyVal {
    
    inline def setHosts(value: js.Array[Host]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsVarargs(value: Host*): Self = StObject.set(x, "hosts", js.Array(value*))
    
    inline def setNode_id(value: Id): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_name(value: Name): Self = StObject.set(x, "node_name", value.asInstanceOf[js.Any])
    
    inline def setThreads(value: js.Array[String]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsVarargs(value: String*): Self = StObject.set(x, "threads", js.Array(value*))
  }
}
