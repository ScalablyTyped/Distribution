package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyQuestion extends js.Object {
  var answerOrder: js.UndefOr[String] = js.native
  var answers: js.UndefOr[js.Array[String]] = js.native
  var hasOther: js.UndefOr[Boolean] = js.native
  var highValueLabel: js.UndefOr[String] = js.native
  var images: js.UndefOr[js.Array[SurveyQuestionImage]] = js.native
  var lastAnswerPositionPinned: js.UndefOr[Boolean] = js.native
  var lowValueLabel: js.UndefOr[String] = js.native
  var mustPickSuggestion: js.UndefOr[Boolean] = js.native
  var numStars: js.UndefOr[String] = js.native
  var openTextPlaceholder: js.UndefOr[String] = js.native
  var openTextSuggestions: js.UndefOr[js.Array[String]] = js.native
  var question: js.UndefOr[String] = js.native
  var sentimentText: js.UndefOr[String] = js.native
  var singleLineResponse: js.UndefOr[Boolean] = js.native
  var thresholdAnswers: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var unitOfMeasurementLabel: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object SurveyQuestion {
  @scala.inline
  def apply(): SurveyQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyQuestion]
  }
  @scala.inline
  implicit class SurveyQuestionOps[Self <: SurveyQuestion] (val x: Self) extends AnyVal {
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
    def setAnswerOrder(value: String): Self = this.set("answerOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerOrder: Self = this.set("answerOrder", js.undefined)
    @scala.inline
    def setAnswersVarargs(value: String*): Self = this.set("answers", js.Array(value :_*))
    @scala.inline
    def setAnswers(value: js.Array[String]): Self = this.set("answers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswers: Self = this.set("answers", js.undefined)
    @scala.inline
    def setHasOther(value: Boolean): Self = this.set("hasOther", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasOther: Self = this.set("hasOther", js.undefined)
    @scala.inline
    def setHighValueLabel(value: String): Self = this.set("highValueLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighValueLabel: Self = this.set("highValueLabel", js.undefined)
    @scala.inline
    def setImagesVarargs(value: SurveyQuestionImage*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[SurveyQuestionImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setLastAnswerPositionPinned(value: Boolean): Self = this.set("lastAnswerPositionPinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAnswerPositionPinned: Self = this.set("lastAnswerPositionPinned", js.undefined)
    @scala.inline
    def setLowValueLabel(value: String): Self = this.set("lowValueLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowValueLabel: Self = this.set("lowValueLabel", js.undefined)
    @scala.inline
    def setMustPickSuggestion(value: Boolean): Self = this.set("mustPickSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMustPickSuggestion: Self = this.set("mustPickSuggestion", js.undefined)
    @scala.inline
    def setNumStars(value: String): Self = this.set("numStars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumStars: Self = this.set("numStars", js.undefined)
    @scala.inline
    def setOpenTextPlaceholder(value: String): Self = this.set("openTextPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenTextPlaceholder: Self = this.set("openTextPlaceholder", js.undefined)
    @scala.inline
    def setOpenTextSuggestionsVarargs(value: String*): Self = this.set("openTextSuggestions", js.Array(value :_*))
    @scala.inline
    def setOpenTextSuggestions(value: js.Array[String]): Self = this.set("openTextSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenTextSuggestions: Self = this.set("openTextSuggestions", js.undefined)
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuestion: Self = this.set("question", js.undefined)
    @scala.inline
    def setSentimentText(value: String): Self = this.set("sentimentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentimentText: Self = this.set("sentimentText", js.undefined)
    @scala.inline
    def setSingleLineResponse(value: Boolean): Self = this.set("singleLineResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleLineResponse: Self = this.set("singleLineResponse", js.undefined)
    @scala.inline
    def setThresholdAnswersVarargs(value: String*): Self = this.set("thresholdAnswers", js.Array(value :_*))
    @scala.inline
    def setThresholdAnswers(value: js.Array[String]): Self = this.set("thresholdAnswers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdAnswers: Self = this.set("thresholdAnswers", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnitOfMeasurementLabel(value: String): Self = this.set("unitOfMeasurementLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitOfMeasurementLabel: Self = this.set("unitOfMeasurementLabel", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

