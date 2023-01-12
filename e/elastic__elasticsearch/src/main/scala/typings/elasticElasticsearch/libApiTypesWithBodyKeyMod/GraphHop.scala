package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphHop extends StObject {
  
  var connections: js.UndefOr[GraphHop] = js.undefined
  
  var query: QueryDslQueryContainer
  
  var vertices: js.Array[GraphVertexDefinition]
}
object GraphHop {
  
  inline def apply(query: QueryDslQueryContainer, vertices: js.Array[GraphVertexDefinition]): GraphHop = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphHop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphHop] (val x: Self) extends AnyVal {
    
    inline def setConnections(value: GraphHop): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[GraphVertexDefinition]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: GraphVertexDefinition*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
