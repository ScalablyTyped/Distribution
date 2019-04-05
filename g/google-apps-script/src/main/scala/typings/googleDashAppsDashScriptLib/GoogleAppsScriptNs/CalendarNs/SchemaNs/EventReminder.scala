package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventReminder extends js.Object {
  var method: js.UndefOr[java.lang.String] = js.undefined
  var minutes: js.UndefOr[scala.Double] = js.undefined
}

object EventReminder {
  @scala.inline
  def apply(method: java.lang.String = null, minutes: scala.Int | scala.Double = null): EventReminder = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventReminder]
  }
}

