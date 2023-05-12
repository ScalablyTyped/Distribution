package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetExpansionContainsProperty
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueCode: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that is a reference to ValueSet.expansion.property.code.
    */
  var code: String
  
  /**
    * A subproperty value for this concept.
    */
  var subProperty: js.UndefOr[js.Array[ValueSetExpansionContainsPropertySubProperty]] = js.undefined
  
  /**
    * The value of this property.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of this property.
    */
  var valueCode: js.UndefOr[String] = js.undefined
  
  /**
    * The value of this property.
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * The value of this property.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The value of this property.
    */
  var valueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of this property.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of this property.
    */
  var valueString: js.UndefOr[String] = js.undefined
}
object ValueSetExpansionContainsProperty {
  
  inline def apply(code: String): ValueSetExpansionContainsProperty = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansionContainsProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSetExpansionContainsProperty] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setSubProperty(value: js.Array[ValueSetExpansionContainsPropertySubProperty]): Self = StObject.set(x, "subProperty", value.asInstanceOf[js.Any])
    
    inline def setSubPropertyUndefined: Self = StObject.set(x, "subProperty", js.undefined)
    
    inline def setSubPropertyVarargs(value: ValueSetExpansionContainsPropertySubProperty*): Self = StObject.set(x, "subProperty", js.Array(value*))
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCode(value: String): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    inline def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueDecimal(value: Double): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueCode(value: Element): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    inline def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
