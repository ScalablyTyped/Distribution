package typings.ejDotWebDotAll.ej.Schedule

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
  var id: js.UndefOr[String] = js.undefined
  /** Binds text field name in the dataSource to timeZoneCollection text. These text gets listed out in the timezone fields of the appointment window.
    * @Default {text}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Binds value field name in the dataSource to timeZoneCollection value.
    * @Default {value}
    */
  var value: js.UndefOr[String] = js.undefined
}

object TimeZoneCollection {
  @scala.inline
  def apply(dataSource: js.Any = null, id: String = null, text: String = null, value: String = null): TimeZoneCollection = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (id != null) __obj.updateDynamic("id")(id)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimeZoneCollection]
  }
}

