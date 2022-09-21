package typings.fhir.r5Mod

import typings.fhir.fhirStrings.first
import typings.fhir.fhirStrings.last
import typings.fhir.fhirStrings.not_first
import typings.fhir.fhirStrings.not_last
import typings.fhir.fhirStrings.only_one
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMapGroupRuleSource
  extends StObject
     with BackboneElement {
  
  var _check: js.UndefOr[Element] = js.undefined
  
  var _condition: js.UndefOr[Element] = js.undefined
  
  var _context: js.UndefOr[Element] = js.undefined
  
  var _defaultValue: js.UndefOr[Element] = js.undefined
  
  var _element: js.UndefOr[Element] = js.undefined
  
  var _listMode: js.UndefOr[Element] = js.undefined
  
  var _logMessage: js.UndefOr[Element] = js.undefined
  
  var _max: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _variable: js.UndefOr[Element] = js.undefined
  
  /**
    * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing.
    */
  var check: js.UndefOr[String] = js.undefined
  
  /**
    * FHIRPath expression  - must be true or the rule does not apply.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * Type or variable this rule applies to.
    */
  var context: String
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field for this source.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * How to handle the list mode for this element.
    */
  var listMode: js.UndefOr[first | not_first | last | not_last | only_one] = js.undefined
  
  /**
    * This is typically used for recording that something Is not transformed to the target for some reason.
    */
  var logMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specified maximum cardinality for the element - a number or a "*". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value).
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Specified type for the element. This works as a condition on the mapping - use for polymorphic elements.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Named context for field, if a field is specified.
    */
  var variable: js.UndefOr[String] = js.undefined
}
object StructureMapGroupRuleSource {
  
  inline def apply(context: String): StructureMapGroupRuleSource = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleSource]
  }
  
  extension [Self <: StructureMapGroupRuleSource](x: Self) {
    
    inline def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setListMode(value: first | not_first | last | not_last | only_one): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    inline def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    inline def setLogMessage(value: String): Self = StObject.set(x, "logMessage", value.asInstanceOf[js.Any])
    
    inline def setLogMessageUndefined: Self = StObject.set(x, "logMessage", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def set_check(value: Element): Self = StObject.set(x, "_check", value.asInstanceOf[js.Any])
    
    inline def set_checkUndefined: Self = StObject.set(x, "_check", js.undefined)
    
    inline def set_condition(value: Element): Self = StObject.set(x, "_condition", value.asInstanceOf[js.Any])
    
    inline def set_conditionUndefined: Self = StObject.set(x, "_condition", js.undefined)
    
    inline def set_context(value: Element): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
    
    inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
    
    inline def set_defaultValue(value: Element): Self = StObject.set(x, "_defaultValue", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueUndefined: Self = StObject.set(x, "_defaultValue", js.undefined)
    
    inline def set_element(value: Element): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    inline def set_elementUndefined: Self = StObject.set(x, "_element", js.undefined)
    
    inline def set_listMode(value: Element): Self = StObject.set(x, "_listMode", value.asInstanceOf[js.Any])
    
    inline def set_listModeUndefined: Self = StObject.set(x, "_listMode", js.undefined)
    
    inline def set_logMessage(value: Element): Self = StObject.set(x, "_logMessage", value.asInstanceOf[js.Any])
    
    inline def set_logMessageUndefined: Self = StObject.set(x, "_logMessage", js.undefined)
    
    inline def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    inline def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_variable(value: Element): Self = StObject.set(x, "_variable", value.asInstanceOf[js.Any])
    
    inline def set_variableUndefined: Self = StObject.set(x, "_variable", js.undefined)
  }
}
