package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Only allow data when
  */
trait QuestionnaireItemEnableWhen
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'answerBoolean'.
    */
  var _answerBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'answerDate'.
    */
  var _answerDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'answerDateTime'.
    */
  var _answerDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'answerDecimal'.
    */
  var _answerDecimal: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'answerInteger'.
    */
  var _answerInteger: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'answerString'.
    */
  var _answerString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'answerTime'.
    */
  var _answerTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'answerUri'.
    */
  var _answerUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'hasAnswer'.
    */
  var _hasAnswer: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'question'.
    */
  var _question: js.UndefOr[Element] = js.undefined
  
  /**
    * Value question must have
    */
  var answerAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Value question must have
    */
  var answerBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value question must have
    */
  var answerCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Value question must have
    */
  var answerDate: js.UndefOr[date] = js.undefined
  
  /**
    * Value question must have
    */
  var answerDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Value question must have
    */
  var answerDecimal: js.UndefOr[decimal] = js.undefined
  
  /**
    * Value question must have
    */
  var answerInteger: js.UndefOr[integer] = js.undefined
  
  /**
    * Value question must have
    */
  var answerQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Value question must have
    */
  var answerReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Value question must have
    */
  var answerString: js.UndefOr[String] = js.undefined
  
  /**
    * Value question must have
    */
  var answerTime: js.UndefOr[time] = js.undefined
  
  /**
    * Value question must have
    */
  var answerUri: js.UndefOr[uri] = js.undefined
  
  /**
    * Enable when answered or not
    */
  var hasAnswer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Question that determines whether item is enabled
    */
  var question: String
}
object QuestionnaireItemEnableWhen {
  
  inline def apply(question: String): QuestionnaireItemEnableWhen = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItemEnableWhen]
  }
  
  extension [Self <: QuestionnaireItemEnableWhen](x: Self) {
    
    inline def setAnswerAttachment(value: Attachment): Self = StObject.set(x, "answerAttachment", value.asInstanceOf[js.Any])
    
    inline def setAnswerAttachmentUndefined: Self = StObject.set(x, "answerAttachment", js.undefined)
    
    inline def setAnswerBoolean(value: Boolean): Self = StObject.set(x, "answerBoolean", value.asInstanceOf[js.Any])
    
    inline def setAnswerBooleanUndefined: Self = StObject.set(x, "answerBoolean", js.undefined)
    
    inline def setAnswerCoding(value: Coding): Self = StObject.set(x, "answerCoding", value.asInstanceOf[js.Any])
    
    inline def setAnswerCodingUndefined: Self = StObject.set(x, "answerCoding", js.undefined)
    
    inline def setAnswerDate(value: date): Self = StObject.set(x, "answerDate", value.asInstanceOf[js.Any])
    
    inline def setAnswerDateTime(value: dateTime): Self = StObject.set(x, "answerDateTime", value.asInstanceOf[js.Any])
    
    inline def setAnswerDateTimeUndefined: Self = StObject.set(x, "answerDateTime", js.undefined)
    
    inline def setAnswerDateUndefined: Self = StObject.set(x, "answerDate", js.undefined)
    
    inline def setAnswerDecimal(value: decimal): Self = StObject.set(x, "answerDecimal", value.asInstanceOf[js.Any])
    
    inline def setAnswerDecimalUndefined: Self = StObject.set(x, "answerDecimal", js.undefined)
    
    inline def setAnswerInteger(value: integer): Self = StObject.set(x, "answerInteger", value.asInstanceOf[js.Any])
    
    inline def setAnswerIntegerUndefined: Self = StObject.set(x, "answerInteger", js.undefined)
    
    inline def setAnswerQuantity(value: Quantity): Self = StObject.set(x, "answerQuantity", value.asInstanceOf[js.Any])
    
    inline def setAnswerQuantityUndefined: Self = StObject.set(x, "answerQuantity", js.undefined)
    
    inline def setAnswerReference(value: Reference): Self = StObject.set(x, "answerReference", value.asInstanceOf[js.Any])
    
    inline def setAnswerReferenceUndefined: Self = StObject.set(x, "answerReference", js.undefined)
    
    inline def setAnswerString(value: String): Self = StObject.set(x, "answerString", value.asInstanceOf[js.Any])
    
    inline def setAnswerStringUndefined: Self = StObject.set(x, "answerString", js.undefined)
    
    inline def setAnswerTime(value: time): Self = StObject.set(x, "answerTime", value.asInstanceOf[js.Any])
    
    inline def setAnswerTimeUndefined: Self = StObject.set(x, "answerTime", js.undefined)
    
    inline def setAnswerUri(value: uri): Self = StObject.set(x, "answerUri", value.asInstanceOf[js.Any])
    
    inline def setAnswerUriUndefined: Self = StObject.set(x, "answerUri", js.undefined)
    
    inline def setHasAnswer(value: Boolean): Self = StObject.set(x, "hasAnswer", value.asInstanceOf[js.Any])
    
    inline def setHasAnswerUndefined: Self = StObject.set(x, "hasAnswer", js.undefined)
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def set_answerBoolean(value: Element): Self = StObject.set(x, "_answerBoolean", value.asInstanceOf[js.Any])
    
    inline def set_answerBooleanUndefined: Self = StObject.set(x, "_answerBoolean", js.undefined)
    
    inline def set_answerDate(value: Element): Self = StObject.set(x, "_answerDate", value.asInstanceOf[js.Any])
    
    inline def set_answerDateTime(value: Element): Self = StObject.set(x, "_answerDateTime", value.asInstanceOf[js.Any])
    
    inline def set_answerDateTimeUndefined: Self = StObject.set(x, "_answerDateTime", js.undefined)
    
    inline def set_answerDateUndefined: Self = StObject.set(x, "_answerDate", js.undefined)
    
    inline def set_answerDecimal(value: Element): Self = StObject.set(x, "_answerDecimal", value.asInstanceOf[js.Any])
    
    inline def set_answerDecimalUndefined: Self = StObject.set(x, "_answerDecimal", js.undefined)
    
    inline def set_answerInteger(value: Element): Self = StObject.set(x, "_answerInteger", value.asInstanceOf[js.Any])
    
    inline def set_answerIntegerUndefined: Self = StObject.set(x, "_answerInteger", js.undefined)
    
    inline def set_answerString(value: Element): Self = StObject.set(x, "_answerString", value.asInstanceOf[js.Any])
    
    inline def set_answerStringUndefined: Self = StObject.set(x, "_answerString", js.undefined)
    
    inline def set_answerTime(value: Element): Self = StObject.set(x, "_answerTime", value.asInstanceOf[js.Any])
    
    inline def set_answerTimeUndefined: Self = StObject.set(x, "_answerTime", js.undefined)
    
    inline def set_answerUri(value: Element): Self = StObject.set(x, "_answerUri", value.asInstanceOf[js.Any])
    
    inline def set_answerUriUndefined: Self = StObject.set(x, "_answerUri", js.undefined)
    
    inline def set_hasAnswer(value: Element): Self = StObject.set(x, "_hasAnswer", value.asInstanceOf[js.Any])
    
    inline def set_hasAnswerUndefined: Self = StObject.set(x, "_hasAnswer", js.undefined)
    
    inline def set_question(value: Element): Self = StObject.set(x, "_question", value.asInstanceOf[js.Any])
    
    inline def set_questionUndefined: Self = StObject.set(x, "_question", js.undefined)
  }
}
