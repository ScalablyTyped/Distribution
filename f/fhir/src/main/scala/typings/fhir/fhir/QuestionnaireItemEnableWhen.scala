package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Only allow data when
  */
@js.native
trait QuestionnaireItemEnableWhen extends BackboneElement {
  
  /**
    * Contains extended information for property 'answerBoolean'.
    */
  var _answerBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'answerDate'.
    */
  var _answerDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'answerDateTime'.
    */
  var _answerDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'answerDecimal'.
    */
  var _answerDecimal: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'answerInteger'.
    */
  var _answerInteger: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'answerString'.
    */
  var _answerString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'answerTime'.
    */
  var _answerTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'answerUri'.
    */
  var _answerUri: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'hasAnswer'.
    */
  var _hasAnswer: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'question'.
    */
  var _question: js.UndefOr[Element] = js.native
  
  /**
    * Value question must have
    */
  var answerAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Value question must have
    */
  var answerBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Value question must have
    */
  var answerCoding: js.UndefOr[Coding] = js.native
  
  /**
    * Value question must have
    */
  var answerDate: js.UndefOr[date] = js.native
  
  /**
    * Value question must have
    */
  var answerDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Value question must have
    */
  var answerDecimal: js.UndefOr[decimal] = js.native
  
  /**
    * Value question must have
    */
  var answerInteger: js.UndefOr[integer] = js.native
  
  /**
    * Value question must have
    */
  var answerQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Value question must have
    */
  var answerReference: js.UndefOr[Reference] = js.native
  
  /**
    * Value question must have
    */
  var answerString: js.UndefOr[String] = js.native
  
  /**
    * Value question must have
    */
  var answerTime: js.UndefOr[time] = js.native
  
  /**
    * Value question must have
    */
  var answerUri: js.UndefOr[uri] = js.native
  
  /**
    * Enable when answered or not
    */
  var hasAnswer: js.UndefOr[Boolean] = js.native
  
  /**
    * Question that determines whether item is enabled
    */
  var question: String = js.native
}
object QuestionnaireItemEnableWhen {
  
  @scala.inline
  def apply(question: String): QuestionnaireItemEnableWhen = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItemEnableWhen]
  }
  
  @scala.inline
  implicit class QuestionnaireItemEnableWhenMutableBuilder[Self <: QuestionnaireItemEnableWhen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswerAttachment(value: Attachment): Self = StObject.set(x, "answerAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerAttachmentUndefined: Self = StObject.set(x, "answerAttachment", js.undefined)
    
    @scala.inline
    def setAnswerBoolean(value: Boolean): Self = StObject.set(x, "answerBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerBooleanUndefined: Self = StObject.set(x, "answerBoolean", js.undefined)
    
    @scala.inline
    def setAnswerCoding(value: Coding): Self = StObject.set(x, "answerCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerCodingUndefined: Self = StObject.set(x, "answerCoding", js.undefined)
    
    @scala.inline
    def setAnswerDate(value: date): Self = StObject.set(x, "answerDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerDateTime(value: dateTime): Self = StObject.set(x, "answerDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerDateTimeUndefined: Self = StObject.set(x, "answerDateTime", js.undefined)
    
    @scala.inline
    def setAnswerDateUndefined: Self = StObject.set(x, "answerDate", js.undefined)
    
    @scala.inline
    def setAnswerDecimal(value: decimal): Self = StObject.set(x, "answerDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerDecimalUndefined: Self = StObject.set(x, "answerDecimal", js.undefined)
    
    @scala.inline
    def setAnswerInteger(value: integer): Self = StObject.set(x, "answerInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerIntegerUndefined: Self = StObject.set(x, "answerInteger", js.undefined)
    
    @scala.inline
    def setAnswerQuantity(value: Quantity): Self = StObject.set(x, "answerQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerQuantityUndefined: Self = StObject.set(x, "answerQuantity", js.undefined)
    
    @scala.inline
    def setAnswerReference(value: Reference): Self = StObject.set(x, "answerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerReferenceUndefined: Self = StObject.set(x, "answerReference", js.undefined)
    
    @scala.inline
    def setAnswerString(value: String): Self = StObject.set(x, "answerString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerStringUndefined: Self = StObject.set(x, "answerString", js.undefined)
    
    @scala.inline
    def setAnswerTime(value: time): Self = StObject.set(x, "answerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerTimeUndefined: Self = StObject.set(x, "answerTime", js.undefined)
    
    @scala.inline
    def setAnswerUri(value: uri): Self = StObject.set(x, "answerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerUriUndefined: Self = StObject.set(x, "answerUri", js.undefined)
    
    @scala.inline
    def setHasAnswer(value: Boolean): Self = StObject.set(x, "hasAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAnswerUndefined: Self = StObject.set(x, "hasAnswer", js.undefined)
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerBoolean(value: Element): Self = StObject.set(x, "_answerBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerBooleanUndefined: Self = StObject.set(x, "_answerBoolean", js.undefined)
    
    @scala.inline
    def set_answerDate(value: Element): Self = StObject.set(x, "_answerDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerDateTime(value: Element): Self = StObject.set(x, "_answerDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerDateTimeUndefined: Self = StObject.set(x, "_answerDateTime", js.undefined)
    
    @scala.inline
    def set_answerDateUndefined: Self = StObject.set(x, "_answerDate", js.undefined)
    
    @scala.inline
    def set_answerDecimal(value: Element): Self = StObject.set(x, "_answerDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerDecimalUndefined: Self = StObject.set(x, "_answerDecimal", js.undefined)
    
    @scala.inline
    def set_answerInteger(value: Element): Self = StObject.set(x, "_answerInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerIntegerUndefined: Self = StObject.set(x, "_answerInteger", js.undefined)
    
    @scala.inline
    def set_answerString(value: Element): Self = StObject.set(x, "_answerString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerStringUndefined: Self = StObject.set(x, "_answerString", js.undefined)
    
    @scala.inline
    def set_answerTime(value: Element): Self = StObject.set(x, "_answerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerTimeUndefined: Self = StObject.set(x, "_answerTime", js.undefined)
    
    @scala.inline
    def set_answerUri(value: Element): Self = StObject.set(x, "_answerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerUriUndefined: Self = StObject.set(x, "_answerUri", js.undefined)
    
    @scala.inline
    def set_hasAnswer(value: Element): Self = StObject.set(x, "_hasAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hasAnswerUndefined: Self = StObject.set(x, "_hasAnswer", js.undefined)
    
    @scala.inline
    def set_question(value: Element): Self = StObject.set(x, "_question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_questionUndefined: Self = StObject.set(x, "_question", js.undefined)
  }
}
