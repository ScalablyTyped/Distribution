package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Sentiment. */
trait ISentiment extends js.Object {
  /** Sentiment magnitude */
  var magnitude: js.UndefOr[Double | Null] = js.undefined
  /** Sentiment score */
  var score: js.UndefOr[Double | Null] = js.undefined
}

object ISentiment {
  @scala.inline
  def apply(
    magnitude: js.UndefOr[Null | Double] = js.undefined,
    score: js.UndefOr[Null | Double] = js.undefined
  ): ISentiment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(magnitude)) __obj.updateDynamic("magnitude")(magnitude.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISentiment]
  }
}

