package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`extension`
import typings.fhir.fhirStrings.element
import typings.fhir.fhirStrings.fhirpath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureDefinitionContext
  extends StObject
     with BackboneElement {
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * An expression that defines where an extension can be used in resources.
    */
  var expression: String
  
  /**
    * Defines how to interpret the expression that defines what the context of the extension is.
    */
  var `type`: fhirpath | element | `extension`
}
object StructureDefinitionContext {
  
  inline def apply(expression: String, `type`: fhirpath | element | `extension`): StructureDefinitionContext = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructureDefinitionContext] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: fhirpath | element | `extension`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
