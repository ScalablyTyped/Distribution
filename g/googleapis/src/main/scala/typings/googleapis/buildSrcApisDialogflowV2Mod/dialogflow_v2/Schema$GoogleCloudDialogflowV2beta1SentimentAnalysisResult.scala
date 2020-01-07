package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of sentiment analysis as configured by
  * `sentiment_analysis_request_config`.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisResult extends js.Object {
  /**
    * The sentiment analysis result for `query_text`.
    */
  var queryTextSentiment: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1Sentiment] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisResult {
  @scala.inline
  def apply(queryTextSentiment: Schema$GoogleCloudDialogflowV2beta1Sentiment = null): Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    if (queryTextSentiment != null) __obj.updateDynamic("queryTextSentiment")(queryTextSentiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisResult]
  }
}

