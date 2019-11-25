package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventReminders extends js.Object {
  var overrides: js.UndefOr[js.Array[EventReminder]] = js.undefined
  var useDefault: js.UndefOr[Boolean] = js.undefined
}

object EventReminders {
  @scala.inline
  def apply(overrides: js.Array[EventReminder] = null, useDefault: js.UndefOr[Boolean] = js.undefined): EventReminders = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefault)) __obj.updateDynamic("useDefault")(useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventReminders]
  }
}

