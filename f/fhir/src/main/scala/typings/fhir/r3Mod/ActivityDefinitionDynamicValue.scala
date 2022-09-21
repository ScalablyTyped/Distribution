package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityDefinitionDynamicValue
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  var _language: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * A brief, natural language description of the intended semantics of the dynamic value.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The expression may be inlined, or may be a reference to a named expression within a logic library referenced by the library element.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * The media type of the language for the expression.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the element to be customized. This is the path on the resource that will hold the result of the calculation defined by the expression.
    */
  var path: js.UndefOr[String] = js.undefined
}
object ActivityDefinitionDynamicValue {
  
  inline def apply(): ActivityDefinitionDynamicValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityDefinitionDynamicValue]
  }
  
  extension [Self <: ActivityDefinitionDynamicValue](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
  }
}
