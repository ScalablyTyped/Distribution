package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property value for the concept
  */
trait CodeSystemConceptProperty
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * Reference to CodeSystem.property.code
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Value of the property for this concept
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value of the property for this concept
    */
  var valueCode: js.UndefOr[code] = js.undefined
  
  /**
    * Value of the property for this concept
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Value of the property for this concept
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Value of the property for this concept
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  
  /**
    * Value of the property for this concept
    */
  var valueString: js.UndefOr[String] = js.undefined
}
object CodeSystemConceptProperty {
  
  inline def apply(code: code): CodeSystemConceptProperty = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConceptProperty]
  }
  
  extension [Self <: CodeSystemConceptProperty](x: Self) {
    
    inline def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCode(value: code): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    inline def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueDateTime(value: dateTime): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueInteger(value: integer): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
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
    
    inline def set_valueInteger(value: Element): Self = StObject.set(x, "_valueInteger", value.asInstanceOf[js.Any])
    
    inline def set_valueIntegerUndefined: Self = StObject.set(x, "_valueInteger", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
