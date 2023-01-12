package typings.fhir.r4Mod

import typings.fhir.fhirStrings.Equalssign
import typings.fhir.fhirStrings.ExclamationmarkEqualssign
import typings.fhir.fhirStrings.Greaterthansign
import typings.fhir.fhirStrings.GreaterthansignEqualssign
import typings.fhir.fhirStrings.Lessthansign
import typings.fhir.fhirStrings.LessthansignEqualssign
import typings.fhir.fhirStrings.exists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireItemEnableWhen
  extends StObject
     with BackboneElement {
  
  var _answerBoolean: js.UndefOr[Element] = js.undefined
  
  var _answerDate: js.UndefOr[Element] = js.undefined
  
  var _answerDateTime: js.UndefOr[Element] = js.undefined
  
  var _answerString: js.UndefOr[Element] = js.undefined
  
  var _answerTime: js.UndefOr[Element] = js.undefined
  
  var _operator: js.UndefOr[Element] = js.undefined
  
  var _question: js.UndefOr[Element] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerDate: js.UndefOr[String] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerString: js.UndefOr[String] = js.undefined
  
  /**
    * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
    */
  var answerTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the criteria by which the question is enabled.
    */
  var operator: exists | Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
  
  /**
    * If multiple question occurrences are present for the same question (same linkId), then this refers to the nearest question occurrence reachable by tracing first the "ancestor" axis and then the "preceding" axis and then the "following" axis.
    */
  var question: String
}
object QuestionnaireItemEnableWhen {
  
  inline def apply(
    operator: exists | Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    question: String
  ): QuestionnaireItemEnableWhen = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItemEnableWhen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuestionnaireItemEnableWhen] (val x: Self) extends AnyVal {
    
    inline def setAnswerBoolean(value: Boolean): Self = StObject.set(x, "answerBoolean", value.asInstanceOf[js.Any])
    
    inline def setAnswerBooleanUndefined: Self = StObject.set(x, "answerBoolean", js.undefined)
    
    inline def setAnswerCoding(value: Coding): Self = StObject.set(x, "answerCoding", value.asInstanceOf[js.Any])
    
    inline def setAnswerCodingUndefined: Self = StObject.set(x, "answerCoding", js.undefined)
    
    inline def setAnswerDate(value: String): Self = StObject.set(x, "answerDate", value.asInstanceOf[js.Any])
    
    inline def setAnswerDateTime(value: String): Self = StObject.set(x, "answerDateTime", value.asInstanceOf[js.Any])
    
    inline def setAnswerDateTimeUndefined: Self = StObject.set(x, "answerDateTime", js.undefined)
    
    inline def setAnswerDateUndefined: Self = StObject.set(x, "answerDate", js.undefined)
    
    inline def setAnswerDecimal(value: Double): Self = StObject.set(x, "answerDecimal", value.asInstanceOf[js.Any])
    
    inline def setAnswerDecimalUndefined: Self = StObject.set(x, "answerDecimal", js.undefined)
    
    inline def setAnswerInteger(value: Double): Self = StObject.set(x, "answerInteger", value.asInstanceOf[js.Any])
    
    inline def setAnswerIntegerUndefined: Self = StObject.set(x, "answerInteger", js.undefined)
    
    inline def setAnswerQuantity(value: Quantity): Self = StObject.set(x, "answerQuantity", value.asInstanceOf[js.Any])
    
    inline def setAnswerQuantityUndefined: Self = StObject.set(x, "answerQuantity", js.undefined)
    
    inline def setAnswerReference(value: Reference): Self = StObject.set(x, "answerReference", value.asInstanceOf[js.Any])
    
    inline def setAnswerReferenceUndefined: Self = StObject.set(x, "answerReference", js.undefined)
    
    inline def setAnswerString(value: String): Self = StObject.set(x, "answerString", value.asInstanceOf[js.Any])
    
    inline def setAnswerStringUndefined: Self = StObject.set(x, "answerString", js.undefined)
    
    inline def setAnswerTime(value: String): Self = StObject.set(x, "answerTime", value.asInstanceOf[js.Any])
    
    inline def setAnswerTimeUndefined: Self = StObject.set(x, "answerTime", js.undefined)
    
    inline def setOperator(
      value: exists | Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def set_answerBoolean(value: Element): Self = StObject.set(x, "_answerBoolean", value.asInstanceOf[js.Any])
    
    inline def set_answerBooleanUndefined: Self = StObject.set(x, "_answerBoolean", js.undefined)
    
    inline def set_answerDate(value: Element): Self = StObject.set(x, "_answerDate", value.asInstanceOf[js.Any])
    
    inline def set_answerDateTime(value: Element): Self = StObject.set(x, "_answerDateTime", value.asInstanceOf[js.Any])
    
    inline def set_answerDateTimeUndefined: Self = StObject.set(x, "_answerDateTime", js.undefined)
    
    inline def set_answerDateUndefined: Self = StObject.set(x, "_answerDate", js.undefined)
    
    inline def set_answerString(value: Element): Self = StObject.set(x, "_answerString", value.asInstanceOf[js.Any])
    
    inline def set_answerStringUndefined: Self = StObject.set(x, "_answerString", js.undefined)
    
    inline def set_answerTime(value: Element): Self = StObject.set(x, "_answerTime", value.asInstanceOf[js.Any])
    
    inline def set_answerTimeUndefined: Self = StObject.set(x, "_answerTime", js.undefined)
    
    inline def set_operator(value: Element): Self = StObject.set(x, "_operator", value.asInstanceOf[js.Any])
    
    inline def set_operatorUndefined: Self = StObject.set(x, "_operator", js.undefined)
    
    inline def set_question(value: Element): Self = StObject.set(x, "_question", value.asInstanceOf[js.Any])
    
    inline def set_questionUndefined: Self = StObject.set(x, "_question", js.undefined)
  }
}
