package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FreeBusyResponse extends js.Object {
  /**
    * List of free/busy information for calendars.
    */
  var calendars: js.UndefOr[StringDictionary[Schema$FreeBusyCalendar]] = js.native
  /**
    * Expansion of groups.
    */
  var groups: js.UndefOr[StringDictionary[Schema$FreeBusyGroup]] = js.native
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

object Schema$FreeBusyResponse {
  @scala.inline
  def apply(
    calendars: StringDictionary[Schema$FreeBusyCalendar] = null,
    groups: StringDictionary[Schema$FreeBusyGroup] = null,
    kind: String = null,
    timeMax: String = null,
    timeMin: String = null
  ): Schema$FreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FreeBusyResponse]
  }
}

