package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyGroup extends js.Object {
  var calendars: js.UndefOr[js.Array[String]] = js.undefined
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}

object FreeBusyGroup {
  @scala.inline
  def apply(calendars: js.Array[String] = null, errors: js.Array[Error] = null): FreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyGroup]
  }
}

