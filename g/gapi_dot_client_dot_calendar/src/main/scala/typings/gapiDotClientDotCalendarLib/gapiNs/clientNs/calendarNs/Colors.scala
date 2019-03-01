package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  /**
    * A global palette of calendar colors, mapping from the color ID to its definition. A calendarListEntry resource refers to one of these color IDs in its
    * color field. Read-only.
    */
  var calendar: js.UndefOr[stdLib.Record[java.lang.String, ColorDefinition]] = js.undefined
  /**
    * A global palette of event colors, mapping from the color ID to its definition. An event resource may refer to one of these color IDs in its color
    * field. Read-only.
    */
  var event: js.UndefOr[stdLib.Record[java.lang.String, ColorDefinition]] = js.undefined
  /** Type of the resource ("calendar#colors"). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Last modification time of the color palette (as a RFC3339 timestamp). Read-only. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Colors {
  @scala.inline
  def apply(
    calendar: stdLib.Record[java.lang.String, ColorDefinition] = null,
    event: stdLib.Record[java.lang.String, ColorDefinition] = null,
    kind: java.lang.String = null,
    updated: java.lang.String = null
  ): Colors = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar)
    if (event != null) __obj.updateDynamic("event")(event)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Colors]
  }
}

