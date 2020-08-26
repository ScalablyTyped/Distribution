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
  def apply(): SchemaCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendar]
  }
  @scala.inline
  implicit class SchemaCalendarOps[Self <: SchemaCalendar] (val x: Self) extends AnyVal {
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
    def setConferenceProperties(value: SchemaConferenceProperties): Self = this.set("conferenceProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConferenceProperties: Self = this.set("conferenceProperties", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

