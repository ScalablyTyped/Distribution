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
    val __obj = js.Dynamic.literal(action = action, allRequiredParamsSent = allRequiredParamsSent, diagnosticInfo = diagnosticInfo, fulfillmentMessages = fulfillmentMessages, fulfillmentText = fulfillmentText, intent = intent, intentDetectionConfidence = intentDetectionConfidence, languageCode = languageCode, outputContexts = outputContexts, parameters = parameters, queryText = queryText, speechRecognitionConfidence = speechRecognitionConfidence, webhookPayload = webhookPayload, webhookSource = webhookSource)
    if (sentimentAnalysisResult != null) __obj.updateDynamic("sentimentAnalysisResult")(sentimentAnalysisResult)
    __obj.asInstanceOf[QueryResult]
  }
}

