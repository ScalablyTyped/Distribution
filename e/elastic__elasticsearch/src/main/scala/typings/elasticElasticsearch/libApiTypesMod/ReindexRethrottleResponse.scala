package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexRethrottleResponse extends StObject {
  
  var nodes: Record[String, ReindexRethrottleReindexNode]
}
object ReindexRethrottleResponse {
  
  inline def apply(nodes: Record[String, ReindexRethrottleReindexNode]): ReindexRethrottleResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRethrottleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReindexRethrottleResponse] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: Record[String, ReindexRethrottleReindexNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
