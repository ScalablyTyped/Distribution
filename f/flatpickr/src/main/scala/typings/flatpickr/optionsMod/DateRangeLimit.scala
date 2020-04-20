package typings.flatpickr.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeLimit[D] extends js.Object {
  var from: D
  var to: D
}

object DateRangeLimit {
  @scala.inline
  def apply[D](from: D, to: D): DateRangeLimit[D] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangeLimit[D]]
  }
}

