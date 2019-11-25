package typings.gapiDotClientDotCalendar.gapi.client.calendar

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  /**
    * A global palette of calendar colors, mapping from the color ID to its definition. A calendarListEntry resource refers to one of these color IDs in its
    * color field. Read-only.
    */
  var calendar: js.UndefOr[Record[String, ColorDefinition]] = js.undefined
  /**
    * A global palette of event colors, mapping from the color ID to its definition. An event resource may refer to one of these color IDs in its color
    * field. Read-only.
    */
  var event: js.UndefOr[Record[String, ColorDefinition]] = js.undefined
  /** Type of the resource ("calendar#colors"). */
  var kind: js.UndefOr[String] = js.undefined
  /** Last modification time of the color palette (as a RFC3339 timestamp). Read-only. */
  var updated: js.UndefOr[String] = js.undefined
}

object Colors {
  @scala.inline
  def apply(
    calendar: Record[String, ColorDefinition] = null,
    event: Record[String, ColorDefinition] = null,
    kind: String = null,
    updated: String = null
  ): Colors = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

