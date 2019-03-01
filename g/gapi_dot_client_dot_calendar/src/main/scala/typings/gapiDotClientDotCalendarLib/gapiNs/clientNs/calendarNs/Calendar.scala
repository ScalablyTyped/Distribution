package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  /** Description of the calendar. Optional. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier of the calendar. To retrieve IDs call the calendarList.list() method. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource ("calendar#calendar"). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Geographic location of the calendar as free-form text. Optional. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the calendar. */
  var summary: js.UndefOr[java.lang.String] = js.undefined
  /** The time zone of the calendar. (Formatted as an IANA Time Zone Database name, e.g. "Europe/Zurich".) Optional. */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object Calendar {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    location: java.lang.String = null,
    summary: java.lang.String = null,
    timeZone: java.lang.String = null
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

