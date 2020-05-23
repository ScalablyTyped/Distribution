package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountString extends js.Object {
  /** Number of multiple-word text values for this feature. */
  var count: js.UndefOr[String] = js.undefined
}

object CountString {
  @scala.inline
  def apply(count: String = null): CountString = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountString]
  }
}

