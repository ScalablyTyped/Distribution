package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyResponse extends js.Object {
  var calendars: js.UndefOr[js.Object] = js.undefined
  var groups: js.UndefOr[js.Object] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var timeMax: js.UndefOr[String] = js.undefined
  var timeMin: js.UndefOr[String] = js.undefined
}

object FreeBusyResponse {
  @scala.inline
  def apply(
    calendars: js.Object = null,
    groups: js.Object = null,
    kind: String = null,
    timeMax: String = null,
    timeMin: String = null
  ): FreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyResponse]
  }
}

