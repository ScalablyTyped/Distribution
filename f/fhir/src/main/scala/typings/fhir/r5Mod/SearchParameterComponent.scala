package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchParameterComponent
  extends StObject
     with BackboneElement {
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  /**
    * The definition of the search parameter that describes this part.
    */
  var definition: String
  
  /**
    * This expression overrides the expression in the definition and extracts the index values from the outcome of the composite expression.
    */
  var expression: String
}
object SearchParameterComponent {
  
  inline def apply(definition: String, expression: String): SearchParameterComponent = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameterComponent]
  }
  
  extension [Self <: SearchParameterComponent](x: Self) {
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
  }
}
