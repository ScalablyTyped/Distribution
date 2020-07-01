package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTime extends js.Object {
  var activeTime: js.UndefOr[Double] = js.native
  var date: js.UndefOr[String] = js.native
}

object ActiveTime {
  @scala.inline
  def apply(activeTime: js.UndefOr[Double] = js.undefined, date: String = null): ActiveTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeTime)) __obj.updateDynamic("activeTime")(activeTime.get.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTime]
  }
}

