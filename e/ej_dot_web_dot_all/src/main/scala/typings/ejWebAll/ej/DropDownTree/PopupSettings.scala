package typings.ejWebAll.ej.DropDownTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupSettings extends js.Object {
  /** Defines the height of the popup wrapper in the DropDownTree control.
    */
  var height: js.UndefOr[String | Double] = js.native
  /** The DropDownTree control is displayed with the popup.
    */
  var showPopupOnLoad: js.UndefOr[Boolean] = js.native
  /** Defines the width of the popup wrapper in the DropDownTree control.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object PopupSettings {
  @scala.inline
  def apply(): PopupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupSettings]
  }
  @scala.inline
  implicit class PopupSettingsOps[Self <: PopupSettings] (val x: Self) extends AnyVal {
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setShowPopupOnLoad(value: Boolean): Self = this.set("showPopupOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPopupOnLoad: Self = this.set("showPopupOnLoad", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

