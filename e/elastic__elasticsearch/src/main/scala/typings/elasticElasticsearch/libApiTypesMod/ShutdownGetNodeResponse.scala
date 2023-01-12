package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownGetNodeResponse extends StObject {
  
  var nodes: js.Array[ShutdownGetNodeNodeShutdownStatus]
}
object ShutdownGetNodeResponse {
  
  inline def apply(nodes: js.Array[ShutdownGetNodeNodeShutdownStatus]): ShutdownGetNodeResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownGetNodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShutdownGetNodeResponse] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[ShutdownGetNodeNodeShutdownStatus]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: ShutdownGetNodeNodeShutdownStatus*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
