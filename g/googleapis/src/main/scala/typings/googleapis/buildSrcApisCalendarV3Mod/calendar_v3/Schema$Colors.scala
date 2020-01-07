package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Colors extends js.Object {
  /**
    * A global palette of calendar colors, mapping from the color ID to its
    * definition. A calendarListEntry resource refers to one of these color IDs
    * in its color field. Read-only.
    */
  var calendar: js.UndefOr[StringDictionary[Schema$ColorDefinition]] = js.native
  /**
    * A global palette of event colors, mapping from the color ID to its
    * definition. An event resource may refer to one of these color IDs in its
    * color field. Read-only.
    */
  var event: js.UndefOr[StringDictionary[Schema$ColorDefinition]] = js.native
  /**
    * Type of the resource (&quot;calendar#colors&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Last modification time of the color palette (as a RFC3339 timestamp).
    * Read-only.
    */
  var updated: js.UndefOr[String] = js.native
}

object Schema$Colors {
  @scala.inline
  def apply(
    calendar: StringDictionary[Schema$ColorDefinition] = null,
    event: StringDictionary[Schema$ColorDefinition] = null,
    kind: String = null,
    updated: String = null
  ): Schema$Colors = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Colors]
  }
}

