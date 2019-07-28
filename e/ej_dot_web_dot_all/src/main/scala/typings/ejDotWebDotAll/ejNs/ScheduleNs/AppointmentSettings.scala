package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentSettings extends js.Object {
  /** Binds the name of allDay field in dataSource. It indicates whether the appointment is an all-day appointment or not.
    * @Default {null}
    */
  var allDay: js.UndefOr[String] = js.undefined
  /** When set to false, doesn't consider the time difference offset calculation on appointment time.
    * @Default {true}
    */
  var applyTimeOffset: js.UndefOr[Boolean] = js.undefined
  /** Binds the name of categorize field in dataSource. It indicates the categorize value, red categorize, green, yellow and so on applied to the appointments.
    * @Default {null}
    */
  var categorize: js.UndefOr[String] = js.undefined
  /** The dataSource option accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule appointments.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** Binds the description field name in dataSource. It indicates the appointment description.
    * @Default {null}
    */
  var description: js.UndefOr[String] = js.undefined
  /** When set to true, introduces a new option to edit only the future occurrences of the appointments in a recurrence series from the currently selected appointment's date.
    * @Default {false}
    */
  var editFutureEventsOnly: js.UndefOr[Boolean] = js.undefined
  /** Binds the name of endTime field in dataSource with the end time of Schedule appointments. It indicates the date and time when Schedule appointment actually ends.
    * @Default {null}
    */
  var endTime: js.UndefOr[String] = js.undefined
  /** Binds the name of end timezone field in dataSource. It indicates the timezone of appointment end date. When the endTimeZone field is not mentioned, the appointment uses the
    * Schedule timeZone or System timeZone.
    * @Default {null}
    */
  var endTimeZone: js.UndefOr[String] = js.undefined
  /** Binds the id field name in dataSource to the id of Schedule appointments. It denotes the unique id assigned to appointments.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.undefined
  /** Binds the name of location field in dataSource. It indicates the appointment location.
    * @Default {null}
    */
  var location: js.UndefOr[String] = js.undefined
  /** Binds the name of the priority field in dataSource. It indicates the priority, high, low, medium and none of the appointments.
    * @Default {null}
    */
  var priority: js.UndefOr[String] = js.undefined
  /** It holds either the ej.Query() object or simply the query string that retrieves the specified records from the table.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.undefined
  /** Binds the name of recurrence field in dataSource. It indicates whether the appointment is a recurrence appointment or not.
    * @Default {null}
    */
  var recurrence: js.UndefOr[String] = js.undefined
  /** Binds the name of recurrenceRule field in dataSource. It indicates the recurrence pattern associated with appointments.
    * @Default {null}
    */
  var recurrenceRule: js.UndefOr[String] = js.undefined
  /** Binds one or more fields in resource collection dataSource. It maps the resource field names with appointments denoting the resource of appointments actually belongs.
    * @Default {null}
    */
  var resourceFields: js.UndefOr[String] = js.undefined
  /** Binds the name of startTime field in the dataSource with start time of the Schedule appointments. It indicates the date and Time when Schedule appointment actually starts.
    * @Default {null}
    */
  var startTime: js.UndefOr[String] = js.undefined
  /** Binds the name of start timezone field in dataSource. It indicates the timezone of appointment start date. When startTimeZone field is not mentioned, the appointment uses the
    * Schedule timeZone or System timeZone.
    * @Default {null}
    */
  var startTimeZone: js.UndefOr[String] = js.undefined
  /** Binds the name of subject field in the dataSource to appointment Subject. Indicates the Subject or title that gets displayed on Schedule appointments.
    * @Default {null}
    */
  var subject: js.UndefOr[String] = js.undefined
  /** Assign the table name from where the records are to be fetched for the Schedule.
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.undefined
}

object AppointmentSettings {
  @scala.inline
  def apply(
    allDay: String = null,
    applyTimeOffset: js.UndefOr[Boolean] = js.undefined,
    categorize: String = null,
    dataSource: js.Any | js.Array[_] = null,
    description: String = null,
    editFutureEventsOnly: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    endTimeZone: String = null,
    id: String = null,
    location: String = null,
    priority: String = null,
    query: String = null,
    recurrence: String = null,
    recurrenceRule: String = null,
    resourceFields: String = null,
    startTime: String = null,
    startTimeZone: String = null,
    subject: String = null,
    tableName: String = null
  ): AppointmentSettings = {
    val __obj = js.Dynamic.literal()
    if (allDay != null) __obj.updateDynamic("allDay")(allDay)
    if (!js.isUndefined(applyTimeOffset)) __obj.updateDynamic("applyTimeOffset")(applyTimeOffset)
    if (categorize != null) __obj.updateDynamic("categorize")(categorize)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(editFutureEventsOnly)) __obj.updateDynamic("editFutureEventsOnly")(editFutureEventsOnly)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (endTimeZone != null) __obj.updateDynamic("endTimeZone")(endTimeZone)
    if (id != null) __obj.updateDynamic("id")(id)
    if (location != null) __obj.updateDynamic("location")(location)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (query != null) __obj.updateDynamic("query")(query)
    if (recurrence != null) __obj.updateDynamic("recurrence")(recurrence)
    if (recurrenceRule != null) __obj.updateDynamic("recurrenceRule")(recurrenceRule)
    if (resourceFields != null) __obj.updateDynamic("resourceFields")(resourceFields)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (startTimeZone != null) __obj.updateDynamic("startTimeZone")(startTimeZone)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[AppointmentSettings]
  }
}

