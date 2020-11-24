package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentSettings extends js.Object {
  
  /** Binds the name of allDay field in dataSource. It indicates whether the appointment is an all-day appointment or not.
    * @Default {null}
    */
  var allDay: js.UndefOr[String] = js.native
  
  /** When set to false, doesn't consider the time difference offset calculation on appointment time.
    * @Default {true}
    */
  var applyTimeOffset: js.UndefOr[Boolean] = js.native
  
  /** Binds the name of categorize field in dataSource. It indicates the categorize value, red categorize, green, yellow and so on applied to the appointments.
    * @Default {null}
    */
  var categorize: js.UndefOr[String] = js.native
  
  /** The dataSource option accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule appointments.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  
  /** Binds the description field name in dataSource. It indicates the appointment description.
    * @Default {null}
    */
  var description: js.UndefOr[String] = js.native
  
  /** When set to true, introduces a new option to edit only the future occurrences of the appointments in a recurrence series from the currently selected appointment's date.
    * @Default {false}
    */
  var editFutureEventsOnly: js.UndefOr[Boolean] = js.native
  
  /** Binds the name of endTime field in dataSource with the end time of Schedule appointments. It indicates the date and time when Schedule appointment actually ends.
    * @Default {null}
    */
  var endTime: js.UndefOr[String] = js.native
  
  /** Binds the name of end timezone field in dataSource. It indicates the timezone of appointment end date. When the endTimeZone field is not mentioned, the appointment uses the
    * Schedule timeZone or System timeZone.
    * @Default {null}
    */
  var endTimeZone: js.UndefOr[String] = js.native
  
  /** Binds the id field name in dataSource to the id of Schedule appointments. It denotes the unique id assigned to appointments.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  
  /** Binds the name of location field in dataSource. It indicates the appointment location.
    * @Default {null}
    */
  var location: js.UndefOr[String] = js.native
  
  /** Binds the name of the priority field in dataSource. It indicates the priority, high, low, medium and none of the appointments.
    * @Default {null}
    */
  var priority: js.UndefOr[String] = js.native
  
  /** It holds either the ej.Query() object or simply the query string that retrieves the specified records from the table.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  
  /** Binds the name of recurrence field in dataSource. It indicates whether the appointment is a recurrence appointment or not.
    * @Default {null}
    */
  var recurrence: js.UndefOr[String] = js.native
  
  /** Binds the name of recurrenceRule field in dataSource. It indicates the recurrence pattern associated with appointments.
    * @Default {null}
    */
  var recurrenceRule: js.UndefOr[String] = js.native
  
  /** Binds one or more fields in resource collection dataSource. It maps the resource field names with appointments denoting the resource of appointments actually belongs.
    * @Default {null}
    */
  var resourceFields: js.UndefOr[String] = js.native
  
  /** Binds the name of startTime field in the dataSource with start time of the Schedule appointments. It indicates the date and Time when Schedule appointment actually starts.
    * @Default {null}
    */
  var startTime: js.UndefOr[String] = js.native
  
  /** Binds the name of start timezone field in dataSource. It indicates the timezone of appointment start date. When startTimeZone field is not mentioned, the appointment uses the
    * Schedule timeZone or System timeZone.
    * @Default {null}
    */
  var startTimeZone: js.UndefOr[String] = js.native
  
  /** Binds the name of subject field in the dataSource to appointment Subject. Indicates the Subject or title that gets displayed on Schedule appointments.
    * @Default {null}
    */
  var subject: js.UndefOr[String] = js.native
  
  /** Assign the table name from where the records are to be fetched for the Schedule.
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.native
}
object AppointmentSettings {
  
  @scala.inline
  def apply(): AppointmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentSettings]
  }
  
  @scala.inline
  implicit class AppointmentSettingsOps[Self <: AppointmentSettings] (val x: Self) extends AnyVal {
    
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
    def setAllDay(value: String): Self = this.set("allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDay: Self = this.set("allDay", js.undefined)
    
    @scala.inline
    def setApplyTimeOffset(value: Boolean): Self = this.set("applyTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyTimeOffset: Self = this.set("applyTimeOffset", js.undefined)
    
    @scala.inline
    def setCategorize(value: String): Self = this.set("categorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategorize: Self = this.set("categorize", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Any | js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEditFutureEventsOnly(value: Boolean): Self = this.set("editFutureEventsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditFutureEventsOnly: Self = this.set("editFutureEventsOnly", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEndTimeZone(value: String): Self = this.set("endTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeZone: Self = this.set("endTimeZone", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRecurrence(value: String): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    
    @scala.inline
    def setRecurrenceRule(value: String): Self = this.set("recurrenceRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceRule: Self = this.set("recurrenceRule", js.undefined)
    
    @scala.inline
    def setResourceFields(value: String): Self = this.set("resourceFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceFields: Self = this.set("resourceFields", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStartTimeZone(value: String): Self = this.set("startTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeZone: Self = this.set("startTimeZone", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
}
