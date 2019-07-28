package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesResourceSettings extends js.Object {
  /** Binds appointmentClass field name in the dataSource. It applies custom CSS class name to appointments depicting to the resource it belongs.
    * @Default {null}
    */
  var appointmentClass: js.UndefOr[String] = js.undefined
  /** Binds color field name in the dataSource to resourceSettings color. The color specified here gets applied to the Schedule appointments denoting to the resource it belongs.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** The dataSource option accepts either JSON object collection or DataManager (ejDataManager) instance that contains the resources related data.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** Binds the end work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the end work hour for specific resources.
    * @Default {null}
    */
  var end: js.UndefOr[String] = js.undefined
  /** Binds groupId field name in the dataSource to resourceSettings groupId.
    * @Default {null}
    */
  var groupId: js.UndefOr[String] = js.undefined
  /** Binds id field name in the dataSource to resourceSettings id.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.undefined
  /** Binds the starting work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the starting work hour for specific resources.
    * @Default {null}
    */
  var start: js.UndefOr[String] = js.undefined
  /** Binds text field name in the dataSource to resourceSettings text. These text gets listed out in resources field of the appointment window.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Binds the resources working days field name in the dataSource. It's optional, and accepts the array of strings (week day names). When provided with specific collection of days
    * (array of day names), only those days will render for the specific resources.
    * @Default {null}
    */
  var workWeek: js.UndefOr[String] = js.undefined
}

object ResourcesResourceSettings {
  @scala.inline
  def apply(
    appointmentClass: String = null,
    color: String = null,
    dataSource: js.Any | js.Array[_] = null,
    end: String = null,
    groupId: String = null,
    id: String = null,
    start: String = null,
    text: String = null,
    workWeek: String = null
  ): ResourcesResourceSettings = {
    val __obj = js.Dynamic.literal()
    if (appointmentClass != null) __obj.updateDynamic("appointmentClass")(appointmentClass)
    if (color != null) __obj.updateDynamic("color")(color)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (start != null) __obj.updateDynamic("start")(start)
    if (text != null) __obj.updateDynamic("text")(text)
    if (workWeek != null) __obj.updateDynamic("workWeek")(workWeek)
    __obj.asInstanceOf[ResourcesResourceSettings]
  }
}

