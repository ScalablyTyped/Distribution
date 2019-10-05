package typings.gapiDotClientDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  /** Description of the calendar. Optional. */
  var description: js.UndefOr[String] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Identifier of the calendar. To retrieve IDs call the calendarList.list() method. */
  var id: js.UndefOr[String] = js.undefined
  /** Type of the resource ("calendar#calendar"). */
  var kind: js.UndefOr[String] = js.undefined
  /** Geographic location of the calendar as free-form text. Optional. */
  var location: js.UndefOr[String] = js.undefined
  /** Title of the calendar. */
  var summary: js.UndefOr[String] = js.undefined
  /** The time zone of the calendar. (Formatted as an IANA Time Zone Database name, e.g. "Europe/Zurich".) Optional. */
  var timeZone: js.UndefOr[String] = js.undefined
}

object Calendar {
  @scala.inline
  def apply(
    description: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    location: String = null,
    summary: String = null,
    timeZone: String = null
  ): Calendar = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Calendar]
  }
}

