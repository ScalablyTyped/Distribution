package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Whether or not the action is applicable
  */
trait PlanDefinitionActionCondition
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  
  /**
    * Natural language description of the condition
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean-valued expression
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * applicability | start | stop
    */
  var kind: code
  
  /**
    * Language of the expression
    */
  var language: js.UndefOr[String] = js.undefined
}
object PlanDefinitionActionCondition {
  
  inline def apply(kind: code): PlanDefinitionActionCondition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionActionCondition]
  }
  
  extension [Self <: PlanDefinitionActionCondition](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setKind(value: code): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    inline def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
  }
}
