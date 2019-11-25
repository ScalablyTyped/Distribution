package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.dialogflow.protosProtosMod.google.protobuf.IStruct
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
    action: String = null,
    allRequiredParamsPresent: js.UndefOr[Boolean] = js.undefined,
    diagnosticInfo: IStruct = null,
    fulfillmentMessages: js.Array[IMessage] = null,
    fulfillmentText: String = null,
    intent: IIntent = null,
    intentDetectionConfidence: Int | Double = null,
    languageCode: String = null,
    outputContexts: js.Array[IContext] = null,
    parameters: IStruct = null,
    queryText: String = null,
    sentimentAnalysisResult: ISentimentAnalysisResult = null,
    speechRecognitionConfidence: Int | Double = null,
    webhookPayload: IStruct = null,
    webhookSource: String = null
  ): IQueryResult = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allRequiredParamsPresent)) __obj.updateDynamic("allRequiredParamsPresent")(allRequiredParamsPresent.asInstanceOf[js.Any])
    if (diagnosticInfo != null) __obj.updateDynamic("diagnosticInfo")(diagnosticInfo.asInstanceOf[js.Any])
    if (fulfillmentMessages != null) __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages.asInstanceOf[js.Any])
    if (fulfillmentText != null) __obj.updateDynamic("fulfillmentText")(fulfillmentText.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (intentDetectionConfidence != null) __obj.updateDynamic("intentDetectionConfidence")(intentDetectionConfidence.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (queryText != null) __obj.updateDynamic("queryText")(queryText.asInstanceOf[js.Any])
    if (sentimentAnalysisResult != null) __obj.updateDynamic("sentimentAnalysisResult")(sentimentAnalysisResult.asInstanceOf[js.Any])
    if (speechRecognitionConfidence != null) __obj.updateDynamic("speechRecognitionConfidence")(speechRecognitionConfidence.asInstanceOf[js.Any])
    if (webhookPayload != null) __obj.updateDynamic("webhookPayload")(webhookPayload.asInstanceOf[js.Any])
    if (webhookSource != null) __obj.updateDynamic("webhookSource")(webhookSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryResult]
  }
}

