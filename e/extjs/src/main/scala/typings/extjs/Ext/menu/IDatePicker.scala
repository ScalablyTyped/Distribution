package typings.extjs.Ext.menu

import typings.extjs.Ext.picker.IDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker extends IMenu {
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.picker.Date) */
  var picker: js.UndefOr[IDate] = js.undefined
  /** [Config Option] (String) */
  var pickerId: js.UndefOr[String] = js.undefined
}

object IDatePicker {
  @scala.inline
  def apply(
    IMenu: IMenu = null,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    picker: IDate = null,
    pickerId: String = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    if (IMenu != null) js.Dynamic.global.Object.assign(__obj, IMenu)
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (pickerId != null) __obj.updateDynamic("pickerId")(pickerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePicker]
  }
}

