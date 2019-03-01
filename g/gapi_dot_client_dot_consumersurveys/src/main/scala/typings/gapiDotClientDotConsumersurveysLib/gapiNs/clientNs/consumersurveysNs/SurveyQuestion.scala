package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyQuestion extends js.Object {
  var answerOrder: js.UndefOr[java.lang.String] = js.undefined
  var answers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hasOther: js.UndefOr[scala.Boolean] = js.undefined
  var highValueLabel: js.UndefOr[java.lang.String] = js.undefined
  var images: js.UndefOr[js.Array[SurveyQuestionImage]] = js.undefined
  var lastAnswerPositionPinned: js.UndefOr[scala.Boolean] = js.undefined
  var lowValueLabel: js.UndefOr[java.lang.String] = js.undefined
  var mustPickSuggestion: js.UndefOr[scala.Boolean] = js.undefined
  var numStars: js.UndefOr[java.lang.String] = js.undefined
  var openTextPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var openTextSuggestions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var question: js.UndefOr[java.lang.String] = js.undefined
  var sentimentText: js.UndefOr[java.lang.String] = js.undefined
  var singleLineResponse: js.UndefOr[scala.Boolean] = js.undefined
  var thresholdAnswers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var unitOfMeasurementLabel: js.UndefOr[java.lang.String] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object SurveyQuestion {
  @scala.inline
  def apply(
    answerOrder: java.lang.String = null,
    answers: js.Array[java.lang.String] = null,
    hasOther: js.UndefOr[scala.Boolean] = js.undefined,
    highValueLabel: java.lang.String = null,
    images: js.Array[SurveyQuestionImage] = null,
    lastAnswerPositionPinned: js.UndefOr[scala.Boolean] = js.undefined,
    lowValueLabel: java.lang.String = null,
    mustPickSuggestion: js.UndefOr[scala.Boolean] = js.undefined,
    numStars: java.lang.String = null,
    openTextPlaceholder: java.lang.String = null,
    openTextSuggestions: js.Array[java.lang.String] = null,
    question: java.lang.String = null,
    sentimentText: java.lang.String = null,
    singleLineResponse: js.UndefOr[scala.Boolean] = js.undefined,
    thresholdAnswers: js.Array[java.lang.String] = null,
    `type`: java.lang.String = null,
    unitOfMeasurementLabel: java.lang.String = null,
    videoId: java.lang.String = null
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

