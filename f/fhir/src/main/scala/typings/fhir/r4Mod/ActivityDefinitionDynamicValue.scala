package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityDefinitionDynamicValue
  extends StObject
     with BackboneElement {
  
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * The expression may be inlined, or may be a reference to a named expression within a logic library referenced by the library element.
    */
  var expression: Expression
  
  /**
    * The path attribute contains a [Simple FHIRPath Subset](fhirpath.html#simple) that allows path traversal, but not calculation.
    */
  var path: String
}
object ActivityDefinitionDynamicValue {
  
  inline def apply(expression: Expression, path: String): ActivityDefinitionDynamicValue = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDefinitionDynamicValue]
  }
  
  extension [Self <: ActivityDefinitionDynamicValue](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
  }
}
