package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSwitchOptions extends EditorOptions[dxSwitch] {
  /** @name dxSwitch.Options.name */
  var name: js.UndefOr[String] = js.native
  /** @deprecated */
  /** @name dxSwitch.Options.offText */
  var offText: js.UndefOr[String] = js.native
  /** @deprecated */
  /** @name dxSwitch.Options.onText */
  var onText: js.UndefOr[String] = js.native
  /** @name dxSwitch.Options.switchedOffText */
  var switchedOffText: js.UndefOr[String] = js.native
  /** @name dxSwitch.Options.switchedOnText */
  var switchedOnText: js.UndefOr[String] = js.native
  /** @name dxSwitch.Options.value */
  @JSName("value")
  var value_dxSwitchOptions: js.UndefOr[Boolean] = js.native
}

object dxSwitchOptions {
  @scala.inline
  def apply(): dxSwitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSwitchOptions]
  }
  @scala.inline
  implicit class dxSwitchOptionsOps[Self <: dxSwitchOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOffText(value: String): Self = this.set("offText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffText: Self = this.set("offText", js.undefined)
    @scala.inline
    def setOnText(value: String): Self = this.set("onText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnText: Self = this.set("onText", js.undefined)
    @scala.inline
    def setSwitchedOffText(value: String): Self = this.set("switchedOffText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchedOffText: Self = this.set("switchedOffText", js.undefined)
    @scala.inline
    def setSwitchedOnText(value: String): Self = this.set("switchedOnText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchedOnText: Self = this.set("switchedOnText", js.undefined)
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

