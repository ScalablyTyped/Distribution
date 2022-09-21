package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireResponseGroupQuestionAnswer
  extends StObject
     with BackboneElement {
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueDate: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueInstant: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  var _valueUri: js.UndefOr[Element] = js.undefined
  
  /**
    * It is useful to have "sub-questions", questions which normally appear when certain answers are given and which collect additional details.
    */
  var group: js.UndefOr[js.Array[QuestionnaireResponseGroup]] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueInstant: js.UndefOr[String] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueTime: js.UndefOr[String] = js.undefined
  
  /**
    * Ability to retain a single-valued answer to a question.
    */
  var valueUri: js.UndefOr[String] = js.undefined
}
object QuestionnaireResponseGroupQuestionAnswer {
  
  inline def apply(): QuestionnaireResponseGroupQuestionAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireResponseGroupQuestionAnswer]
  }
  
  extension [Self <: QuestionnaireResponseGroupQuestionAnswer](x: Self) {
    
    inline def setGroup(value: js.Array[QuestionnaireResponseGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: QuestionnaireResponseGroup*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueDate(value: String): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    inline def setValueDecimal(value: Double): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    inline def setValueInstant(value: String): Self = StObject.set(x, "valueInstant", value.asInstanceOf[js.Any])
    
    inline def setValueInstantUndefined: Self = StObject.set(x, "valueInstant", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: String): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def setValueUri(value: String): Self = StObject.set(x, "valueUri", value.asInstanceOf[js.Any])
    
    inline def setValueUriUndefined: Self = StObject.set(x, "valueUri", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    inline def set_valueInstant(value: Element): Self = StObject.set(x, "_valueInstant", value.asInstanceOf[js.Any])
    
    inline def set_valueInstantUndefined: Self = StObject.set(x, "_valueInstant", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
    
    inline def set_valueUri(value: Element): Self = StObject.set(x, "_valueUri", value.asInstanceOf[js.Any])
    
    inline def set_valueUriUndefined: Self = StObject.set(x, "_valueUri", js.undefined)
  }
}
