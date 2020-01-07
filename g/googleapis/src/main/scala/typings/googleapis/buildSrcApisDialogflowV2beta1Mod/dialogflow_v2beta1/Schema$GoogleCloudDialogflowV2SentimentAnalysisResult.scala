package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of sentiment analysis as configured by
  * `sentiment_analysis_request_config`.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2SentimentAnalysisResult extends js.Object {
  /**
    * The sentiment analysis result for `query_text`.
    */
  var queryTextSentiment: js.UndefOr[Schema$GoogleCloudDialogflowV2Sentiment] = js.native
}

object Schema$GoogleCloudDialogflowV2SentimentAnalysisResult {
  @scala.inline
  def apply(queryTextSentiment: Schema$GoogleCloudDialogflowV2Sentiment = null): Schema$GoogleCloudDialogflowV2SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    if (queryTextSentiment != null) __obj.updateDynamic("queryTextSentiment")(queryTextSentiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2SentimentAnalysisResult]
  }
}

