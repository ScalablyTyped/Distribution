package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphVertexInclude extends StObject {
  
  var boost: double
  
  var term: String
}
object GraphVertexInclude {
  
  inline def apply(boost: double, term: String): GraphVertexInclude = {
    val __obj = js.Dynamic.literal(boost = boost.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphVertexInclude]
  }
  
  extension [Self <: GraphVertexInclude](x: Self) {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
