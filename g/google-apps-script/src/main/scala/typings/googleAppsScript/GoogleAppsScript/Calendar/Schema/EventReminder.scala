package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventReminder extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
}

object EventReminder {
  @scala.inline
  def apply(method: String = null, minutes: js.UndefOr[Double] = js.undefined): EventReminder = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventReminder]
  }
}

