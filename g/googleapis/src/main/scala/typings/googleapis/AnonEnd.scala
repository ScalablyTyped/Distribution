package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnd extends js.Object {
  var end: js.UndefOr[String] = js.native
  var interval: js.UndefOr[String] = js.native
  var start: js.UndefOr[String] = js.native
}

object AnonEnd {
  @scala.inline
  def apply(end: String = null, interval: String = null, start: String = null): AnonEnd = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

