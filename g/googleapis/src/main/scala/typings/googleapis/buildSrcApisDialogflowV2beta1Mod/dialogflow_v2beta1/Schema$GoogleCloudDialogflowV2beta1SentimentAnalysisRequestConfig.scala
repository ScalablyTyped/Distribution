package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the types of sentiment analysis to perform.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig extends js.Object {
  /**
    * Optional. Instructs the service to perform sentiment analysis on
    * `query_text`. If not provided, sentiment analysis is not performed on
    * `query_text`.
    */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig {
  @scala.inline
  def apply(analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.undefined): Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analyzeQueryTextSentiment)) __obj.updateDynamic("analyzeQueryTextSentiment")(analyzeQueryTextSentiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig]
  }
}

