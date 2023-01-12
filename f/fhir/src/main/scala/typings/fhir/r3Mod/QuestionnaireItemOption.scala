package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireItemOption
  extends StObject
     with BackboneElement {
  
  var _valueDate: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * The data type of the value must agree with the item.type.
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * The data type of the value must agree with the item.type.
    */
  var valueDate: js.UndefOr[String] = js.undefined
  
  /**
    * The data type of the value must agree with the item.type.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * The data type of the value must agree with the item.type.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * The data type of the value must agree with the item.type.
    */
  var valueTime: js.UndefOr[String] = js.undefined
}
object QuestionnaireItemOption {
  
  inline def apply(): QuestionnaireItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireItemOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuestionnaireItemOption] (val x: Self) extends AnyVal {
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueDate(value: String): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    inline def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: String): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    inline def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
  }
}
