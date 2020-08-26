package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Icon
import typings.devextreme.anon.`2`
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.dropDown
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.useButtons
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownEditorOptions[T] extends dxTextBoxOptions[T] {
  /** @name dxDropDownEditor.Options.acceptCustomValue */
  var acceptCustomValue: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownEditor.Options.applyValueMode */
  var applyValueMode: js.UndefOr[instantly | useButtons] = js.native
  /** @name dxDropDownEditor.Options.buttons */
  @JSName("buttons")
  var buttons_dxDropDownEditorOptions: js.UndefOr[js.Array[clear | dropDown | dxTextEditorButton]] = js.native
  /** @name dxDropDownEditor.Options.deferRendering */
  var deferRendering: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownEditor.Options.dropDownButtonTemplate */
  var dropDownButtonTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ Icon, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** @name dxDropDownEditor.Options.dropDownOptions */
  var dropDownOptions: js.UndefOr[dxPopupOptions[dxPopup]] = js.native
  /** @name dxDropDownEditor.Options.onClosed */
  var onClosed: js.UndefOr[js.Function1[/* e */ `2`[T], _]] = js.native
  /** @name dxDropDownEditor.Options.onOpened */
  var onOpened: js.UndefOr[js.Function1[/* e */ `2`[T], _]] = js.native
  /** @name dxDropDownEditor.Options.openOnFieldClick */
  var openOnFieldClick: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownEditor.Options.opened */
  var opened: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownEditor.Options.showDropDownButton */
  var showDropDownButton: js.UndefOr[Boolean] = js.native
}

object dxDropDownEditorOptions {
  @scala.inline
  def apply[T](): dxDropDownEditorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownEditorOptions[T]]
  }
  @scala.inline
  implicit class dxDropDownEditorOptionsOps[Self <: dxDropDownEditorOptions[_], T] (val x: Self with dxDropDownEditorOptions[T]) extends AnyVal {
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
    def setAcceptCustomValue(value: Boolean): Self = this.set("acceptCustomValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptCustomValue: Self = this.set("acceptCustomValue", js.undefined)
    @scala.inline
    def setApplyValueMode(value: instantly | useButtons): Self = this.set("applyValueMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyValueMode: Self = this.set("applyValueMode", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: (clear | dropDown | dxTextEditorButton)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[clear | dropDown | dxTextEditorButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setDeferRendering(value: Boolean): Self = this.set("deferRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferRendering: Self = this.set("deferRendering", js.undefined)
    @scala.inline
    def setDropDownButtonTemplateFunction2(value: (/* buttonData */ Icon, /* contentElement */ dxElement) => String | Element | JQuery): Self = this.set("dropDownButtonTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setDropDownButtonTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ Icon, /* contentElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("dropDownButtonTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownButtonTemplate: Self = this.set("dropDownButtonTemplate", js.undefined)
    @scala.inline
    def setDropDownOptions(value: dxPopupOptions[dxPopup]): Self = this.set("dropDownOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownOptions: Self = this.set("dropDownOptions", js.undefined)
    @scala.inline
    def setOnClosed(value: /* e */ `2`[T] => _): Self = this.set("onClosed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    @scala.inline
    def setOnOpened(value: /* e */ `2`[T] => _): Self = this.set("onOpened", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpened: Self = this.set("onOpened", js.undefined)
    @scala.inline
    def setOpenOnFieldClick(value: Boolean): Self = this.set("openOnFieldClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOnFieldClick: Self = this.set("openOnFieldClick", js.undefined)
    @scala.inline
    def setOpened(value: Boolean): Self = this.set("opened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    @scala.inline
    def setShowDropDownButton(value: Boolean): Self = this.set("showDropDownButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDropDownButton: Self = this.set("showDropDownButton", js.undefined)
  }
  
}

