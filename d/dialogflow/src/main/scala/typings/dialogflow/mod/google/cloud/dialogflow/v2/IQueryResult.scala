package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QueryResult. */
trait IQueryResult extends js.Object {
  /** QueryResult action */
  var action: js.UndefOr[String | Null] = js.undefined
  /** QueryResult allRequiredParamsPresent */
  var allRequiredParamsPresent: js.UndefOr[Boolean | Null] = js.undefined
  /** QueryResult diagnosticInfo */
  var diagnosticInfo: js.UndefOr[IStruct | Null] = js.undefined
  /** QueryResult fulfillmentMessages */
  var fulfillmentMessages: js.UndefOr[js.Array[IMessage] | Null] = js.undefined
  /** QueryResult fulfillmentText */
  var fulfillmentText: js.UndefOr[String | Null] = js.undefined
  /** QueryResult intent */
  var intent: js.UndefOr[IIntent | Null] = js.undefined
  /** QueryResult intentDetectionConfidence */
  var intentDetectionConfidence: js.UndefOr[Double | Null] = js.undefined
  /** QueryResult languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** QueryResult outputContexts */
  var outputContexts: js.UndefOr[js.Array[IContext] | Null] = js.undefined
  /** QueryResult parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.undefined
  /** QueryResult queryText */
  var queryText: js.UndefOr[String | Null] = js.undefined
  /** QueryResult sentimentAnalysisResult */
  var sentimentAnalysisResult: js.UndefOr[ISentimentAnalysisResult | Null] = js.undefined
  /** QueryResult speechRecognitionConfidence */
  var speechRecognitionConfidence: js.UndefOr[Double | Null] = js.undefined
  /** QueryResult webhookPayload */
  var webhookPayload: js.UndefOr[IStruct | Null] = js.undefined
  /** QueryResult webhookSource */
  var webhookSource: js.UndefOr[String | Null] = js.undefined
}

object IQueryResult {
  @scala.inline
  def apply(
    action: js.UndefOr[Null | String] = js.undefined,
    allRequiredParamsPresent: js.UndefOr[Null | Boolean] = js.undefined,
    diagnosticInfo: js.UndefOr[Null | IStruct] = js.undefined,
    fulfillmentMessages: js.UndefOr[Null | js.Array[IMessage]] = js.undefined,
    fulfillmentText: js.UndefOr[Null | String] = js.undefined,
    intent: js.UndefOr[Null | IIntent] = js.undefined,
    intentDetectionConfidence: js.UndefOr[Null | Double] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    outputContexts: js.UndefOr[Null | js.Array[IContext]] = js.undefined,
    parameters: js.UndefOr[Null | IStruct] = js.undefined,
    queryText: js.UndefOr[Null | String] = js.undefined,
    sentimentAnalysisResult: js.UndefOr[Null | ISentimentAnalysisResult] = js.undefined,
    speechRecognitionConfidence: js.UndefOr[Null | Double] = js.undefined,
    webhookPayload: js.UndefOr[Null | IStruct] = js.undefined,
    webhookSource: js.UndefOr[Null | String] = js.undefined
  ): IQueryResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allRequiredParamsPresent)) __obj.updateDynamic("allRequiredParamsPresent")(allRequiredParamsPresent.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnosticInfo)) __obj.updateDynamic("diagnosticInfo")(diagnosticInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(fulfillmentMessages)) __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(fulfillmentText)) __obj.updateDynamic("fulfillmentText")(fulfillmentText.asInstanceOf[js.Any])
    if (!js.isUndefined(intent)) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(intentDetectionConfidence)) __obj.updateDynamic("intentDetectionConfidence")(intentDetectionConfidence.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(outputContexts)) __obj.updateDynamic("outputContexts")(outputContexts.asInstanceOf[js.Any])
    if (!js.isUndefined(parameters)) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(queryText)) __obj.updateDynamic("queryText")(queryText.asInstanceOf[js.Any])
    if (!js.isUndefined(sentimentAnalysisResult)) __obj.updateDynamic("sentimentAnalysisResult")(sentimentAnalysisResult.asInstanceOf[js.Any])
    if (!js.isUndefined(speechRecognitionConfidence)) __obj.updateDynamic("speechRecognitionConfidence")(speechRecognitionConfidence.asInstanceOf[js.Any])
    if (!js.isUndefined(webhookPayload)) __obj.updateDynamic("webhookPayload")(webhookPayload.asInstanceOf[js.Any])
    if (!js.isUndefined(webhookSource)) __obj.updateDynamic("webhookSource")(webhookSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryResult]
  }
}

