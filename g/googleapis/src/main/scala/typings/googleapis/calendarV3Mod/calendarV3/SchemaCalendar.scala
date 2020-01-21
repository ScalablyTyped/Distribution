package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCalendar extends js.Object {
  /**
    * Conferencing properties for this calendar, for example what types of
    * conferences are allowed.
    */
  var conferenceProperties: js.UndefOr[SchemaConferenceProperties] = js.native
  /**
    * Description of the calendar. Optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifier of the calendar. To retrieve IDs call the calendarList.list()
    * method.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource (&quot;calendar#calendar&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Geographic location of the calendar as free-form text. Optional.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Title of the calendar.
    */
  var summary: js.UndefOr[String] = js.native
  /**
    * The time zone of the calendar. (Formatted as an IANA Time Zone Database
    * name, e.g. &quot;Europe/Zurich&quot;.) Optional.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaCalendar {
  @scala.inline
  def apply(
    conferenceProperties: SchemaConferenceProperties = null,
    description: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    location: String = null,
    summary: String = null,
    timeZone: String = null
  ): SchemaCalendar = {
    val __obj = js.Dynamic.literal()
    if (conferenceProperties != null) __obj.updateDynamic("conferenceProperties")(conferenceProperties.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCalendar]
  }
}

