package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphExploreResponse extends StObject {
  
  var connections: js.Array[GraphConnection]
  
  var failures: js.Array[ShardFailure]
  
  var timed_out: Boolean
  
  var took: long
  
  var vertices: js.Array[GraphVertex]
}
object GraphExploreResponse {
  
  inline def apply(
    connections: js.Array[GraphConnection],
    failures: js.Array[ShardFailure],
    timed_out: Boolean,
    took: long,
    vertices: js.Array[GraphVertex]
  ): GraphExploreResponse = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphExploreResponse]
  }
  
  extension [Self <: GraphExploreResponse](x: Self) {
    
    inline def setConnections(value: js.Array[GraphConnection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsVarargs(value: GraphConnection*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setFailures(value: js.Array[ShardFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresVarargs(value: ShardFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[GraphVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: GraphVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
