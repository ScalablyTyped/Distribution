package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /** The class label. */
  var label: js.UndefOr[String] = js.undefined
  /** The probability of the class label. */
  var score: js.UndefOr[String] = js.undefined
}

object Label {
  @scala.inline
  def apply(label: String = null, score: String = null): Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

