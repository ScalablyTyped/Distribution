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
  
  extension [Self <: ReindexRethrottleResponse](x: Self) {
    
    inline def setNodes(value: Record[String, ReindexRethrottleReindexNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
