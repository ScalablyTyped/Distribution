package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphSampleDiversity extends StObject {
  
  var field: Field
  
  var max_docs_per_value: integer
}
object GraphSampleDiversity {
  
  inline def apply(field: Field, max_docs_per_value: integer): GraphSampleDiversity = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], max_docs_per_value = max_docs_per_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphSampleDiversity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphSampleDiversity] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setMax_docs_per_value(value: integer): Self = StObject.set(x, "max_docs_per_value", value.asInstanceOf[js.Any])
  }
}
