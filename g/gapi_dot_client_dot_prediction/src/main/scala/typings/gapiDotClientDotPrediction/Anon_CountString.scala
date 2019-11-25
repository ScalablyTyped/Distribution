package typings.gapiDotClientDotPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountString extends js.Object {
  /** Number of multiple-word text values for this feature. */
  var count: js.UndefOr[String] = js.undefined
}

object Anon_CountString {
  @scala.inline
  def apply(count: String = null): Anon_CountString = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountString]
  }
}

