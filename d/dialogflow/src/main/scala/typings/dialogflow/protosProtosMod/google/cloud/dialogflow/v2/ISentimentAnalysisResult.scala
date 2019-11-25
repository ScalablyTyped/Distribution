package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

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
  def apply(queryTextSentiment: ISentiment = null): ISentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    if (queryTextSentiment != null) __obj.updateDynamic("queryTextSentiment")(queryTextSentiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISentimentAnalysisResult]
  }
}

