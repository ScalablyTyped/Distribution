package typings.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountString extends js.Object {
  /** Number of multiple-word text values for this feature. */
  var count: js.UndefOr[String] = js.undefined
}

object AnonCountString {
  @scala.inline
  def apply(count: String = null): AnonCountString = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountString]
  }
}

