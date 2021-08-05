package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response(s) to the question
  */
trait QuestionnaireResponseItemAnswer
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Nested groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueDate: js.UndefOr[date] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueTime: js.UndefOr[time] = js.undefined
  
  /**
    * Single-valued answer to the question
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}
object QuestionnaireResponseItemAnswer {
  
  inline def apply(): QuestionnaireResponseItemAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireResponseItemAnswer]
  }
  
  extension [Self <: QuestionnaireResponseItemAnswer](x: Self) {
    
    inline def setItem(value: js.Array[QuestionnaireResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: QuestionnaireResponseItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueDate(value: date): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    inline def setValueDateTime(value: dateTime): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    inline def setValueDecimal(value: decimal): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    inline def setValueInteger(value: integer): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: time): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def setValueUri(value: uri): Self = StObject.set(x, "valueUri", value.asInstanceOf[js.Any])
    
    inline def setValueUriUndefined: Self = StObject.set(x, "valueUri", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    inline def set_valueDecimal(value: Element): Self = StObject.set(x, "_valueDecimal", value.asInstanceOf[js.Any])
    
    inline def set_valueDecimalUndefined: Self = StObject.set(x, "_valueDecimal", js.undefined)
    
    inline def set_valueInteger(value: Element): Self = StObject.set(x, "_valueInteger", value.asInstanceOf[js.Any])
    
    inline def set_valueIntegerUndefined: Self = StObject.set(x, "_valueInteger", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
    
    inline def set_valueUri(value: Element): Self = StObject.set(x, "_valueUri", value.asInstanceOf[js.Any])
    
    inline def set_valueUriUndefined: Self = StObject.set(x, "_valueUri", js.undefined)
  }
}
