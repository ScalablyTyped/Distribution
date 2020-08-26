package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.after
import typings.devextreme.devextremeStrings.before
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPopupToolbarItem extends js.Object {
  /** @name dxPopup.Options.toolbarItems.disabled */
  var disabled: js.UndefOr[Boolean] = js.native
  /** @name dxPopup.Options.toolbarItems.html */
  var html: js.UndefOr[String] = js.native
  /** @name dxPopup.Options.toolbarItems.location */
  var location: js.UndefOr[after | before | center] = js.native
  /** @name dxPopup.Options.toolbarItems.options */
  var options: js.UndefOr[js.Any] = js.native
  /** @name dxPopup.Options.toolbarItems.template */
  var template: js.UndefOr[typings.devextreme.mod.DevExpress.core.template] = js.native
  /** @name dxPopup.Options.toolbarItems.text */
  var text: js.UndefOr[String] = js.native
  /** @name dxPopup.Options.toolbarItems.toolbar */
  var toolbar: js.UndefOr[bottom | top] = js.native
  /** @name dxPopup.Options.toolbarItems.visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** @name dxPopup.Options.toolbarItems.widget */
  var widget: js.UndefOr[
    typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxButton | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxMenu | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxTabs | typings.devextreme.devextremeStrings.dxTextBox | typings.devextreme.devextremeStrings.dxButtonGroup | typings.devextreme.devextremeStrings.dxDropDownButton
  ] = js.native
}

object dxPopupToolbarItem {
  @scala.inline
  def apply(): dxPopupToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopupToolbarItem]
  }
  @scala.inline
  implicit class dxPopupToolbarItemOps[Self <: dxPopupToolbarItem] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setLocation(value: after | before | center): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setTemplate(value: typings.devextreme.mod.DevExpress.core.template): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setToolbar(value: bottom | top): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidget(
      value: typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxButton | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxMenu | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxTabs | typings.devextreme.devextremeStrings.dxTextBox | typings.devextreme.devextremeStrings.dxButtonGroup | typings.devextreme.devextremeStrings.dxDropDownButton
    ): Self = this.set("widget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
  }
  
}

