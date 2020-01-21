package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaColors extends js.Object {
  /**
    * A global palette of calendar colors, mapping from the color ID to its
    * definition. A calendarListEntry resource refers to one of these color IDs
    * in its color field. Read-only.
    */
  var calendar: js.UndefOr[StringDictionary[SchemaColorDefinition]] = js.native
  /**
    * A global palette of event colors, mapping from the color ID to its
    * definition. An event resource may refer to one of these color IDs in its
    * color field. Read-only.
    */
  var event: js.UndefOr[StringDictionary[SchemaColorDefinition]] = js.native
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

object SchemaColors {
  @scala.inline
  def apply(
    calendar: StringDictionary[SchemaColorDefinition] = null,
    event: StringDictionary[SchemaColorDefinition] = null,
    kind: String = null,
    updated: String = null
  ): SchemaColors = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaColors]
  }
}

