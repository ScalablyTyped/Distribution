package typings.extjs.ExtNs.menuNs

import typings.extjs.ExtNs.pickerNs.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPicker extends IMenu {
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.picker.Color) */
  var picker: js.UndefOr[IColor] = js.undefined
  /** [Config Option] (String) */
  var pickerId: js.UndefOr[java.lang.String] = js.undefined
}

object IColorPicker {
  @scala.inline
  def apply(
    IMenu: IMenu = null,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    picker: IColor = null,
    pickerId: java.lang.String = null
  ): IColorPicker = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMenu)
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (pickerId != null) __obj.updateDynamic("pickerId")(pickerId)
    __obj.asInstanceOf[IColorPicker]
  }
}

