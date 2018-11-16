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

