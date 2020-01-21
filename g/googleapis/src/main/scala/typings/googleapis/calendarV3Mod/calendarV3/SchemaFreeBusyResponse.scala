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
  def apply(
    calendars: StringDictionary[SchemaFreeBusyCalendar] = null,
    groups: StringDictionary[SchemaFreeBusyGroup] = null,
    kind: String = null,
    timeMax: String = null,
    timeMin: String = null
  ): SchemaFreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFreeBusyResponse]
  }
}

