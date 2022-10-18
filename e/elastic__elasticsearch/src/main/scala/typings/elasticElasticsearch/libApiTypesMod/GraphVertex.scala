package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphVertex extends StObject {
  
  var depth: long
  
  var field: Field
  
  var term: String
  
  var weight: double
}
object GraphVertex {
  
  inline def apply(depth: long, field: Field, term: String, weight: double): GraphVertex = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphVertex]
  }
  
  extension [Self <: GraphVertex](x: Self) {
    
    inline def setDepth(value: long): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
