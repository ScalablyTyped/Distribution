package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventReminder extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
}

object EventReminder {
  @scala.inline
  def apply(method: String = null, minutes: Int | Double = null): EventReminder = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventReminder]
  }
}

