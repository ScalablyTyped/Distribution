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
  def apply(): SchemaColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColors]
  }
  @scala.inline
  implicit class SchemaColorsOps[Self <: SchemaColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalendar(value: StringDictionary[SchemaColorDefinition]): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setEvent(value: StringDictionary[SchemaColorDefinition]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

