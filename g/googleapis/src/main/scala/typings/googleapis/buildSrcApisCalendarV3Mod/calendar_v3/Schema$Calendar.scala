package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Calendar extends js.Object {
  /**
    * Conferencing properties for this calendar, for example what types of
    * conferences are allowed.
    */
  var conferenceProperties: js.UndefOr[Schema$ConferenceProperties] = js.native
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

object Schema$Calendar {
  @scala.inline
  def apply(
    conferenceProperties: Schema$ConferenceProperties = null,
    description: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    location: String = null,
    summary: String = null,
    timeZone: String = null
  ): Schema$Calendar = {
    val __obj = js.Dynamic.literal()
    if (conferenceProperties != null) __obj.updateDynamic("conferenceProperties")(conferenceProperties.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Calendar]
  }
}

