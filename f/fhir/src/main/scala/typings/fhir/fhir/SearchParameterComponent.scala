package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For Composite resources to define the parts
  */
trait SearchParameterComponent
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  
  /**
    * Defines how the part works
    */
  var definition: Reference
  
  /**
    * Subexpression relative to main expression
    */
  var expression: String
}
object SearchParameterComponent {
  
  @scala.inline
  def apply(definition: Reference, expression: String): SearchParameterComponent = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameterComponent]
  }
  
  @scala.inline
  implicit class SearchParameterComponentMutableBuilder[Self <: SearchParameterComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
  }
}
