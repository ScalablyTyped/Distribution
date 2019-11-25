package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SentimentAnalysisRequestConfig. */
trait ISentimentAnalysisRequestConfig extends js.Object {
  /** SentimentAnalysisRequestConfig analyzeQueryTextSentiment */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean | Null] = js.undefined
}

object ISentimentAnalysisRequestConfig {
  @scala.inline
  def apply(analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.undefined): ISentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analyzeQueryTextSentiment)) __obj.updateDynamic("analyzeQueryTextSentiment")(analyzeQueryTextSentiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISentimentAnalysisRequestConfig]
  }
}

