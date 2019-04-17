package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectIntentResponse extends js.Object {
  var alternativeQueryResults: js.Array[QueryResult]
  var outputAudio: java.lang.String
  var outputAudioConfig: OutputAudioConfig
  var queryResult: QueryResult
  var responseId: java.lang.String
  var webhookStatus: Status
}

object DetectIntentResponse {
  @scala.inline
  def apply(
    alternativeQueryResults: js.Array[QueryResult],
    outputAudio: java.lang.String,
    outputAudioConfig: OutputAudioConfig,
    queryResult: QueryResult,
    responseId: java.lang.String,
    webhookStatus: Status
  ): DetectIntentResponse = {
    val __obj = js.Dynamic.literal(alternativeQueryResults = alternativeQueryResults, outputAudio = outputAudio, outputAudioConfig = outputAudioConfig, queryResult = queryResult, responseId = responseId, webhookStatus = webhookStatus)
  
    __obj.asInstanceOf[DetectIntentResponse]
  }
}

