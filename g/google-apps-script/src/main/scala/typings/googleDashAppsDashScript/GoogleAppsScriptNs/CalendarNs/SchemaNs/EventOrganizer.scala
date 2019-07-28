package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOrganizer extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var self: js.UndefOr[Boolean] = js.undefined
}

object EventOrganizer {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    id: String = null,
    self: js.UndefOr[Boolean] = js.undefined
  ): EventOrganizer = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[EventOrganizer]
  }
}

