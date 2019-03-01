package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var action: java.lang.String
  var allRequiredParamsSent: scala.Boolean
  var diagnosticInfo: js.Any
  var fulfillmentMessages: js.Array[Message]
  var fulfillmentText: java.lang.String
  var intent: Intent
  var intentDetectionConfidence: scala.Double
  var languageCode: java.lang.String
  var outputContexts: js.Array[Context[java.lang.String, _]]
  var parameters: js.Any
  var queryText: java.lang.String
  var sentimentAnalysisResult: js.UndefOr[dialogflowLib.Anon_QueryTextSentiment] = js.undefined
  var speechRecognitionConfidence: scala.Double
  var webhookPayload: js.Any
  var webhookSource: java.lang.String
}

object QueryResult {
  @scala.inline
  def apply(
    action: java.lang.String,
    allRequiredParamsSent: scala.Boolean,
    diagnosticInfo: js.Any,
    fulfillmentMessages: js.Array[Message],
    fulfillmentText: java.lang.String,
    intent: Intent,
    intentDetectionConfidence: scala.Double,
    languageCode: java.lang.String,
    outputContexts: js.Array[Context[java.lang.String, _]],
    parameters: js.Any,
    queryText: java.lang.String,
    speechRecognitionConfidence: scala.Double,
    webhookPayload: js.Any,
    webhookSource: java.lang.String,
    sentimentAnalysisResult: dialogflowLib.Anon_QueryTextSentiment = null
  ): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("allRequiredParamsSent")(allRequiredParamsSent)
    __obj.updateDynamic("diagnosticInfo")(diagnosticInfo)
    __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages)
    __obj.updateDynamic("fulfillmentText")(fulfillmentText)
    __obj.updateDynamic("intent")(intent)
    __obj.updateDynamic("intentDetectionConfidence")(intentDetectionConfidence)
    __obj.updateDynamic("languageCode")(languageCode)
    __obj.updateDynamic("outputContexts")(outputContexts)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("queryText")(queryText)
    __obj.updateDynamic("speechRecognitionConfidence")(speechRecognitionConfidence)
    __obj.updateDynamic("webhookPayload")(webhookPayload)
    __obj.updateDynamic("webhookSource")(webhookSource)
    if (sentimentAnalysisResult != null) __obj.updateDynamic("sentimentAnalysisResult")(sentimentAnalysisResult)
    __obj.asInstanceOf[QueryResult]
  }
}

