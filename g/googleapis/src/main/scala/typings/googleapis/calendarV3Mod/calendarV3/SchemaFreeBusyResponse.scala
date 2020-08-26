package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFreeBusyResponse extends js.Object {
  /**
    * List of free/busy information for calendars.
    */
  var calendars: js.UndefOr[StringDictionary[SchemaFreeBusyCalendar]] = js.native
  /**
    * Expansion of groups.
    */
  var groups: js.UndefOr[StringDictionary[SchemaFreeBusyGroup]] = js.native
  /**
    * Type of the resource (&quot;calendar#freeBusy&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The end of the interval.
    */
  var timeMax: js.UndefOr[String] = js.native
  /**
    * The start of the interval.
    */
  var timeMin: js.UndefOr[String] = js.native
}

object SchemaFreeBusyResponse {
  @scala.inline
  def apply(): SchemaFreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyResponse]
  }
  @scala.inline
  implicit class SchemaFreeBusyResponseOps[Self <: SchemaFreeBusyResponse] (val x: Self) extends AnyVal {
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
    def setCalendars(value: StringDictionary[SchemaFreeBusyCalendar]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    @scala.inline
    def setGroups(value: StringDictionary[SchemaFreeBusyGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTimeMax(value: String): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMax: Self = this.set("timeMax", js.undefined)
    @scala.inline
    def setTimeMin(value: String): Self = this.set("timeMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMin: Self = this.set("timeMin", js.undefined)
  }
  
}

