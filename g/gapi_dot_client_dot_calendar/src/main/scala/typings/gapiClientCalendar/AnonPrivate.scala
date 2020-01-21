package typings.gapiClientCalendar

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivate extends js.Object {
  /** Properties that are private to the copy of the event that appears on this calendar. */
  var `private`: js.UndefOr[Record[String, String]] = js.undefined
  /** Properties that are shared between copies of the event on other attendees' calendars. */
  var shared: js.UndefOr[Record[String, String]] = js.undefined
}

object AnonPrivate {
  @scala.inline
  def apply(`private`: Record[String, String] = null, shared: Record[String, String] = null): AnonPrivate = {
    val __obj = js.Dynamic.literal()
    if (`private` != null) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (shared != null) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivate]
  }
}

