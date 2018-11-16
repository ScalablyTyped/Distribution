package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResourcesResourceSettings extends js.Object {
  /** Binds appointmentClass field name in the dataSource. It applies custom CSS class name to appointments depicting to the resource it belongs.
               * @Default {null}
               */
  var appointmentClass: js.UndefOr[java.lang.String] = js.undefined
  /** Binds color field name in the dataSource to resourceSettings color. The color specified here gets applied to the Schedule appointments denoting to the resource it belongs.
               * @Default {null}
               */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** The dataSource option accepts either JSON object collection or DataManager (ejDataManager) instance that contains the resources related data.
               * @Default {[]}
               */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** Binds the end work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the end work hour for specific resources.
               * @Default {null}
               */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /** Binds groupId field name in the dataSource to resourceSettings groupId.
               * @Default {null}
               */
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  /** Binds id field name in the dataSource to resourceSettings id.
               * @Default {null}
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the starting work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the starting work hour for specific resources.
               * @Default {null}
               */
  var start: js.UndefOr[java.lang.String] = js.undefined
  /** Binds text field name in the dataSource to resourceSettings text. These text gets listed out in resources field of the appointment window.
               * @Default {null}
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the resources working days field name in the dataSource. It's optional, and accepts the array of strings (week day names). When provided with specific collection of days
               * (array of day names), only those days will render for the specific resources.
               * @Default {null}
               */
  var workWeek: js.UndefOr[java.lang.String] = js.undefined
}

