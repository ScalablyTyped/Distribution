package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchParameterComponent
  extends StObject
     with BackboneElement {
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  /**
    * The definition of the search parameter that describes this part.
    */
  var definition: Reference
  
  /**
    * This expression overrides the expression in the definition, and extracts the index values from the outcome of the composite expression.
    */
  var expression: String
}
object SearchParameterComponent {
  
  inline def apply(definition: Reference, expression: String): SearchParameterComponent = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameterComponent]
  }
  
  extension [Self <: SearchParameterComponent](x: Self) {
    
    inline def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
  }
}
