package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneCollection extends js.Object {
  /** Sets the collection of timezone items to the dataSource that accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule timezones.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Binds id field name in the dataSource to timeZoneCollection id.
    * @Default {id}
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Binds text field name in the dataSource to timeZoneCollection text. These text gets listed out in the timezone fields of the appointment window.
    * @Default {text}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Binds value field name in the dataSource to timeZoneCollection value.
    * @Default {value}
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

