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

