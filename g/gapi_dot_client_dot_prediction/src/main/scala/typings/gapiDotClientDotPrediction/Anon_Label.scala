package typings.gapiDotClientDotPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  /** The class label. */
  var label: js.UndefOr[String] = js.undefined
  /** The probability of the class label. */
  var score: js.UndefOr[String] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: String = null, score: String = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (score != null) __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[Anon_Label]
  }
}

