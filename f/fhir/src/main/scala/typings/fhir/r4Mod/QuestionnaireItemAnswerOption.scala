package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireItemAnswerOption
  extends StObject
     with BackboneElement {
  
  var _initialSelected: js.UndefOr[Element] = js.undefined
  
  var _valueDate: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Use this instead of initial[v] if answerValueSet is present.
    */
  var initialSelected: js.UndefOr[Boolean] = js.undefined
  
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
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The data type of the value must agree with the item.type.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * The data type of the value must agree with the item.type.
    */
  var valueTime: js.UndefOr[String] = js.undefined
}
object QuestionnaireItemAnswerOption {
  
  inline def apply(): QuestionnaireItemAnswerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireItemAnswerOption]
  }
  
  extension [Self <: QuestionnaireItemAnswerOption](x: Self) {
    
    inline def setInitialSelected(value: Boolean): Self = StObject.set(x, "initialSelected", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedUndefined: Self = StObject.set(x, "initialSelected", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueDate(value: String): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    inline def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: String): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def set_initialSelected(value: Element): Self = StObject.set(x, "_initialSelected", value.asInstanceOf[js.Any])
    
    inline def set_initialSelectedUndefined: Self = StObject.set(x, "_initialSelected", js.undefined)
    
    inline def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    inline def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
  }
}
