package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionActionDynamicValue
  extends StObject
     with BackboneElement {
  
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * The expression may be inlined or may be a reference to a named expression within a logic library referenced by the library element.
    */
  var expression: js.UndefOr[Expression] = js.undefined
  
  /**
    * To specify the path to the current action being realized, the %action environment variable is available in this path. For example, to specify the description element of the target action, the path would be %action.description. The path attribute contains a [Simple FHIRPath Subset](fhirpath.html#simple) that allows path traversal, but not calculation.
    */
  var path: js.UndefOr[String] = js.undefined
}
object PlanDefinitionActionDynamicValue {
  
  inline def apply(): PlanDefinitionActionDynamicValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionActionDynamicValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanDefinitionActionDynamicValue] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
  }
}
