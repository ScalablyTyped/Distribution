package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphExploreRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var connections: js.UndefOr[GraphHop] = js.undefined
  
  var controls: js.UndefOr[GraphExploreControls] = js.undefined
  
  var index: Indices
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var vertices: js.UndefOr[js.Array[GraphVertexDefinition]] = js.undefined
}
object GraphExploreRequest {
  
  inline def apply(index: Indices): GraphExploreRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphExploreRequest]
  }
  
  extension [Self <: GraphExploreRequest](x: Self) {
    
    inline def setConnections(value: GraphHop): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setControls(value: GraphExploreControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVertices(value: js.Array[GraphVertexDefinition]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: GraphVertexDefinition*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
