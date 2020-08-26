package typings.extjs.Ext.menu

import typings.extjs.Ext.picker.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPicker extends IMenu {
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.picker.Color) */
  var picker: js.UndefOr[IColor] = js.native
  /** [Config Option] (String) */
  var pickerId: js.UndefOr[String] = js.native
}

object IColorPicker {
  @scala.inline
  def apply(): IColorPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPicker]
  }
  @scala.inline
  implicit class IColorPickerOps[Self <: IColorPicker] (val x: Self) extends AnyVal {
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
    def setHideOnClick(value: Boolean): Self = this.set("hideOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnClick: Self = this.set("hideOnClick", js.undefined)
    @scala.inline
    def setPicker(value: IColor): Self = this.set("picker", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    @scala.inline
    def setPickerId(value: String): Self = this.set("pickerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerId: Self = this.set("pickerId", js.undefined)
  }
  
}

