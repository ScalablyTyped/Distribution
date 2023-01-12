package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateByQueryRethrottleResponse extends StObject {
  
  var nodes: Record[String, UpdateByQueryRethrottleUpdateByQueryRethrottleNode]
}
object UpdateByQueryRethrottleResponse {
  
  inline def apply(nodes: Record[String, UpdateByQueryRethrottleUpdateByQueryRethrottleNode]): UpdateByQueryRethrottleResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByQueryRethrottleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateByQueryRethrottleResponse] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: Record[String, UpdateByQueryRethrottleUpdateByQueryRethrottleNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
