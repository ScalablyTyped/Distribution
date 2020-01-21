package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
  def apply(magnitude: Int | Double = null, score: Int | Double = null): ISentiment = {
    val __obj = js.Dynamic.literal()
    if (magnitude != null) __obj.updateDynamic("magnitude")(magnitude.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISentiment]
  }
}

