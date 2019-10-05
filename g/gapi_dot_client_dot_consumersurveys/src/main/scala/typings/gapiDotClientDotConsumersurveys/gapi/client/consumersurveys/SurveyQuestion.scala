package typings.gapiDotClientDotConsumersurveys.gapi.client.consumersurveys

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
    if (answerOrder != null) __obj.updateDynamic("answerOrder")(answerOrder)
    if (answers != null) __obj.updateDynamic("answers")(answers)
    if (!js.isUndefined(hasOther)) __obj.updateDynamic("hasOther")(hasOther)
    if (highValueLabel != null) __obj.updateDynamic("highValueLabel")(highValueLabel)
    if (images != null) __obj.updateDynamic("images")(images)
    if (!js.isUndefined(lastAnswerPositionPinned)) __obj.updateDynamic("lastAnswerPositionPinned")(lastAnswerPositionPinned)
    if (lowValueLabel != null) __obj.updateDynamic("lowValueLabel")(lowValueLabel)
    if (!js.isUndefined(mustPickSuggestion)) __obj.updateDynamic("mustPickSuggestion")(mustPickSuggestion)
    if (numStars != null) __obj.updateDynamic("numStars")(numStars)
    if (openTextPlaceholder != null) __obj.updateDynamic("openTextPlaceholder")(openTextPlaceholder)
    if (openTextSuggestions != null) __obj.updateDynamic("openTextSuggestions")(openTextSuggestions)
    if (question != null) __obj.updateDynamic("question")(question)
    if (sentimentText != null) __obj.updateDynamic("sentimentText")(sentimentText)
    if (!js.isUndefined(singleLineResponse)) __obj.updateDynamic("singleLineResponse")(singleLineResponse)
    if (thresholdAnswers != null) __obj.updateDynamic("thresholdAnswers")(thresholdAnswers)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unitOfMeasurementLabel != null) __obj.updateDynamic("unitOfMeasurementLabel")(unitOfMeasurementLabel)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[SurveyQuestion]
  }
}

