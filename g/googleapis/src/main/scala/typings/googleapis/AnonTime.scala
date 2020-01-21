package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTime extends js.Object {
  var time: js.UndefOr[String] = js.native
}

object AnonTime {
  @scala.inline
  def apply(time: String = null): AnonTime = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTime]
  }
}

