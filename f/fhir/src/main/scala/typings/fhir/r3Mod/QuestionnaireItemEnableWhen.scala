package typings.fhir.r3Mod

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
  
  var _answerUri: js.UndefOr[Element] = js.undefined
  
  var _hasAnswer: js.UndefOr[Element] = js.undefined
  
  var _question: js.UndefOr[Element] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerDate: js.UndefOr[String] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerString: js.UndefOr[String] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerTime: js.UndefOr[String] = js.undefined
  
  /**
    * Multiple answers are treated as "or".  E.g. Enable if question 1 = A, C or E.
    * Components not specified in the answer do not need to match.  For example, if enableWhen specifies code + system for a Coding, it is ok if the answer has a "display" element.  I.e. treat the answer as a 'pattern'.
    * The dataType of this element must be the same as the data type of the question being referenced.
    */
  var answerUri: js.UndefOr[String] = js.undefined
  
  /**
    * If answered=false and answer values are also provided, then they are treated as "or".  I.e. "Enable if the question is unanswered or the answer is one of the specified values".  If answered=true and answers are present, one of the specified answers must be met. (So there's little reason to specify answered=true if answers are present.).
    */
  var hasAnswer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If multiple question occurrences are present for the same question (same linkId), then this refers to the nearest question occurrence reachable by tracing first the "ancestor" axis and then the "preceding" axis and then the "following" axis.
    */
  var question: String
}
object QuestionnaireItemEnableWhen {
  
  inline def apply(question: String): QuestionnaireItemEnableWhen = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItemEnableWhen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuestionnaireItemEnableWhen] (val x: Self) extends AnyVal {
    
    inline def setAnswerAttachment(value: Attachment): Self = StObject.set(x, "answerAttachment", value.asInstanceOf[js.Any])
    
    inline def setAnswerAttachmentUndefined: Self = StObject.set(x, "answerAttachment", js.undefined)
    
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
    
    inline def setAnswerUri(value: String): Self = StObject.set(x, "answerUri", value.asInstanceOf[js.Any])
    
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
