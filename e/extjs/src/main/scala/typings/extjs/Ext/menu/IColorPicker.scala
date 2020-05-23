package typings.extjs.Ext.menu

import typings.extjs.Ext.picker.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPicker extends IMenu {
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.picker.Color) */
  var picker: js.UndefOr[IColor] = js.undefined
  /** [Config Option] (String) */
  var pickerId: js.UndefOr[String] = js.undefined
}

object IColorPicker {
  @scala.inline
  def apply(
    IMenu: IMenu = null,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    picker: IColor = null,
    pickerId: String = null
  ): IColorPicker = {
    val __obj = js.Dynamic.literal()
    if (IMenu != null) js.Dynamic.global.Object.assign(__obj, IMenu)
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick.get.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (pickerId != null) __obj.updateDynamic("pickerId")(pickerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPicker]
  }
}

