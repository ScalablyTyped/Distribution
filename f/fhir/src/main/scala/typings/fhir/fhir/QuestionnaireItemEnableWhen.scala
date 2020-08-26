package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class QuestionnaireItemEnableWhenOps[Self <: QuestionnaireItemEnableWhen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    @scala.inline
    def set_answerBoolean(value: Element): Self = this.set("_answerBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_answerBoolean: Self = this.set("_answerBoolean", js.undefined)
    @scala.inline
    def set_answerDate(value: Element): Self = this.set("_answerDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_answerDate: Self = this.set("_answerDate", js.undefined)
    @scala.inline
    def set_answerDateTime(value: Element): Self = this.set("_answerDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_answerDateTime: Self = this.set("_answerDateTime", js.undefined)
    @scala.inline
    def set_answerDecimal(value: Element): Self = this.set("_answerDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_answerDecimal: Self = this.set("_answerDecimal", js.undefined)
    @scala.inline
    def set_answerInteger(value: Element): Self = this.set("_answerInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_answerInteger: Self = this.set("_answerInteger", js.undefined)
    @scala.inline
    def set_answerString(value: Element): Self = this.set("_answerString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_answerString: Self = this.set("_answerString", js.undefined)
    @scala.inline
    def set_answerTime(value: Element): Self = this.set("_answerTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_answerTime: Self = this.set("_answerTime", js.undefined)
    @scala.inline
    def set_answerUri(value: Element): Self = this.set("_answerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_answerUri: Self = this.set("_answerUri", js.undefined)
    @scala.inline
    def set_hasAnswer(value: Element): Self = this.set("_hasAnswer", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_hasAnswer: Self = this.set("_hasAnswer", js.undefined)
    @scala.inline
    def set_question(value: Element): Self = this.set("_question", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_question: Self = this.set("_question", js.undefined)
    @scala.inline
    def setAnswerAttachment(value: Attachment): Self = this.set("answerAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerAttachment: Self = this.set("answerAttachment", js.undefined)
    @scala.inline
    def setAnswerBoolean(value: Boolean): Self = this.set("answerBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerBoolean: Self = this.set("answerBoolean", js.undefined)
    @scala.inline
    def setAnswerCoding(value: Coding): Self = this.set("answerCoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerCoding: Self = this.set("answerCoding", js.undefined)
    @scala.inline
    def setAnswerDate(value: date): Self = this.set("answerDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerDate: Self = this.set("answerDate", js.undefined)
    @scala.inline
    def setAnswerDateTime(value: dateTime): Self = this.set("answerDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerDateTime: Self = this.set("answerDateTime", js.undefined)
    @scala.inline
    def setAnswerDecimal(value: decimal): Self = this.set("answerDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerDecimal: Self = this.set("answerDecimal", js.undefined)
    @scala.inline
    def setAnswerInteger(value: integer): Self = this.set("answerInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerInteger: Self = this.set("answerInteger", js.undefined)
    @scala.inline
    def setAnswerQuantity(value: Quantity): Self = this.set("answerQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerQuantity: Self = this.set("answerQuantity", js.undefined)
    @scala.inline
    def setAnswerReference(value: Reference): Self = this.set("answerReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerReference: Self = this.set("answerReference", js.undefined)
    @scala.inline
    def setAnswerString(value: String): Self = this.set("answerString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerString: Self = this.set("answerString", js.undefined)
    @scala.inline
    def setAnswerTime(value: time): Self = this.set("answerTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerTime: Self = this.set("answerTime", js.undefined)
    @scala.inline
    def setAnswerUri(value: uri): Self = this.set("answerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerUri: Self = this.set("answerUri", js.undefined)
    @scala.inline
    def setHasAnswer(value: Boolean): Self = this.set("hasAnswer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAnswer: Self = this.set("hasAnswer", js.undefined)
  }
  
}

