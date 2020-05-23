package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SentimentAnalysisResult. */
trait ISentimentAnalysisResult extends js.Object {
  /** SentimentAnalysisResult queryTextSentiment */
  var queryTextSentiment: js.UndefOr[ISentiment | Null] = js.undefined
}

object ISentimentAnalysisResult {
  @scala.inline
  def apply(queryTextSentiment: js.UndefOr[Null | ISentiment] = js.undefined): ISentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(queryTextSentiment)) __obj.updateDynamic("queryTextSentiment")(queryTextSentiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISentimentAnalysisResult]
  }
}

