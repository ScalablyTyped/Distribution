package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategorizeSettings extends js.Object {
  /** When set to true, enables the multiple selection of categories to be applied for the appointments.
    * @Default {false}
    */
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  /** Binds color field name in the dataSource to category color.
    * @Default {color}
    */
  var color: js.UndefOr[String] = js.undefined
  /** The dataSource option accepts either the JSON object collection or DataManager [ej.DataManager] instance that contains the categorize data.
    */
  var dataSource: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  /** When set to true, enables the categories option to be applied for the appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Binds fontColor field name in the dataSource to category font.
    * @Default {fontColor}
    */
  var fontColor: js.UndefOr[String] = js.undefined
  /** Binds id field name in the dataSource to id of category data.
    * @Default {id}
    */
  var id: js.UndefOr[String] = js.undefined
  /** Binds text field name in the dataSource to category text.
    * @Default {text}
    */
  var text: js.UndefOr[String] = js.undefined
}

object CategorizeSettings {
  @scala.inline
  def apply(
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dataSource: js.Array[_] | js.Any = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    fontColor: String = null,
    id: String = null,
    text: String = null
  ): CategorizeSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (color != null) __obj.updateDynamic("color")(color)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor)
    if (id != null) __obj.updateDynamic("id")(id)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CategorizeSettings]
  }
}

