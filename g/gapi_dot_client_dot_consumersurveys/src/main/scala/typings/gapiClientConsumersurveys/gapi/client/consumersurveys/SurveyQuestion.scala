package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyQuestion extends js.Object {
  var answerOrder: js.UndefOr[String] = js.undefined
  var answers: js.UndefOr[js.Array[String]] = js.undefined
  var hasOther: js.UndefOr[Boolean] = js.undefined
  var highValueLabel: js.UndefOr[String] = js.undefined
  var images: js.UndefOr[js.Array[SurveyQuestionImage]] = js.undefined
  var lastAnswerPositionPinned: js.UndefOr[Boolean] = js.undefined
  var lowValueLabel: js.UndefOr[String] = js.undefined
  var mustPickSuggestion: js.UndefOr[Boolean] = js.undefined
  var numStars: js.UndefOr[String] = js.undefined
  var openTextPlaceholder: js.UndefOr[String] = js.undefined
  var openTextSuggestions: js.UndefOr[js.Array[String]] = js.undefined
  var question: js.UndefOr[String] = js.undefined
  var sentimentText: js.UndefOr[String] = js.undefined
  var singleLineResponse: js.UndefOr[Boolean] = js.undefined
  var thresholdAnswers: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var unitOfMeasurementLabel: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object SurveyQuestion {
  @scala.inline
  def apply(
    answerOrder: String = null,
    answers: js.Array[String] = null,
    hasOther: js.UndefOr[Boolean] = js.undefined,
    highValueLabel: String = null,
    images: js.Array[SurveyQuestionImage] = null,
    lastAnswerPositionPinned: js.UndefOr[Boolean] = js.undefined,
    lowValueLabel: String = null,
    mustPickSuggestion: js.UndefOr[Boolean] = js.undefined,
    numStars: String = null,
    openTextPlaceholder: String = null,
    openTextSuggestions: js.Array[String] = null,
    question: String = null,
    sentimentText: String = null,
    singleLineResponse: js.UndefOr[Boolean] = js.undefined,
    thresholdAnswers: js.Array[String] = null,
    `type`: String = null,
    unitOfMeasurementLabel: String = null,
    videoId: String = null
  ): SurveyQuestion = {
    val __obj = js.Dynamic.literal()
    if (answerOrder != null) __obj.updateDynamic("answerOrder")(answerOrder.asInstanceOf[js.Any])
    if (answers != null) __obj.updateDynamic("answers")(answers.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOther)) __obj.updateDynamic("hasOther")(hasOther.get.asInstanceOf[js.Any])
    if (highValueLabel != null) __obj.updateDynamic("highValueLabel")(highValueLabel.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (!js.isUndefined(lastAnswerPositionPinned)) __obj.updateDynamic("lastAnswerPositionPinned")(lastAnswerPositionPinned.get.asInstanceOf[js.Any])
    if (lowValueLabel != null) __obj.updateDynamic("lowValueLabel")(lowValueLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(mustPickSuggestion)) __obj.updateDynamic("mustPickSuggestion")(mustPickSuggestion.get.asInstanceOf[js.Any])
    if (numStars != null) __obj.updateDynamic("numStars")(numStars.asInstanceOf[js.Any])
    if (openTextPlaceholder != null) __obj.updateDynamic("openTextPlaceholder")(openTextPlaceholder.asInstanceOf[js.Any])
    if (openTextSuggestions != null) __obj.updateDynamic("openTextSuggestions")(openTextSuggestions.asInstanceOf[js.Any])
    if (question != null) __obj.updateDynamic("question")(question.asInstanceOf[js.Any])
    if (sentimentText != null) __obj.updateDynamic("sentimentText")(sentimentText.asInstanceOf[js.Any])
    if (!js.isUndefined(singleLineResponse)) __obj.updateDynamic("singleLineResponse")(singleLineResponse.get.asInstanceOf[js.Any])
    if (thresholdAnswers != null) __obj.updateDynamic("thresholdAnswers")(thresholdAnswers.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unitOfMeasurementLabel != null) __obj.updateDynamic("unitOfMeasurementLabel")(unitOfMeasurementLabel.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveyQuestion]
  }
}

