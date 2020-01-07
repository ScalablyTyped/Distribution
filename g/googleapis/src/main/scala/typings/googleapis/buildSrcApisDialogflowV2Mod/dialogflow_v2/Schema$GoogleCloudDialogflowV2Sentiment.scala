package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sentiment, such as positive/negative feeling or association, for a unit
  * of analysis, such as the query text.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2Sentiment extends js.Object {
  /**
    * A non-negative number in the [0, +inf) range, which represents the
    * absolute magnitude of sentiment, regardless of score (positive or
    * negative).
    */
  var magnitude: js.UndefOr[Double] = js.native
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
    * sentiment).
    */
  var score: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudDialogflowV2Sentiment {
  @scala.inline
  def apply(magnitude: Int | Double = null, score: Int | Double = null): Schema$GoogleCloudDialogflowV2Sentiment = {
    val __obj = js.Dynamic.literal()
    if (magnitude != null) __obj.updateDynamic("magnitude")(magnitude.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2Sentiment]
  }
}

