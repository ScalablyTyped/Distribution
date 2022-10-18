package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSimulateTemplateOverlapping extends StObject {
  
  var index_patterns: js.Array[String]
  
  var name: Name
}
object IndicesSimulateTemplateOverlapping {
  
  inline def apply(index_patterns: js.Array[String], name: Name): IndicesSimulateTemplateOverlapping = {
    val __obj = js.Dynamic.literal(index_patterns = index_patterns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSimulateTemplateOverlapping]
  }
  
  extension [Self <: IndicesSimulateTemplateOverlapping](x: Self) {
    
    inline def setIndex_patterns(value: js.Array[String]): Self = StObject.set(x, "index_patterns", value.asInstanceOf[js.Any])
    
    inline def setIndex_patternsVarargs(value: String*): Self = StObject.set(x, "index_patterns", js.Array(value*))
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
