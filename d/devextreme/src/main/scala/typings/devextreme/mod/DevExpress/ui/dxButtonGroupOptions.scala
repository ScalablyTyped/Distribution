package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.EventItemData
import typings.devextreme.anon.RemovedItems
import typings.devextreme.devextremeStrings.contained
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.text
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxButtonGroupOptions extends WidgetOptions[dxButtonGroup] {
  /** @name dxButtonGroup.Options.buttonTemplate */
  var buttonTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ js.Any, /* buttonContent */ dxElement, String | Element | JQuery])
  ] = js.native
  /** @deprecated */
  /** @name dxButtonGroup.Options.itemTemplate */
  var itemTemplate: js.UndefOr[typings.devextreme.mod.DevExpress.core.template | js.Function] = js.native
  /** @name dxButtonGroup.Options.items */
  var items: js.UndefOr[js.Array[dxButtonGroupItem]] = js.native
  /** @name dxButtonGroup.Options.keyExpr */
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  /** @name dxButtonGroup.Options.onItemClick */
  var onItemClick: js.UndefOr[js.Function1[/* e */ EventItemData, _]] = js.native
  /** @name dxButtonGroup.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ RemovedItems, _]] = js.native
  /** @name dxButtonGroup.Options.selectedItemKeys */
  var selectedItemKeys: js.UndefOr[js.Array[_]] = js.native
  /** @name dxButtonGroup.Options.selectedItems */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
  /** @name dxButtonGroup.Options.selectionMode */
  var selectionMode: js.UndefOr[multiple | single_] = js.native
  /** @name dxButtonGroup.Options.stylingMode */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.native
}

object dxButtonGroupOptions {
  @scala.inline
  def apply(): dxButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonGroupOptions]
  }
  @scala.inline
  implicit class dxButtonGroupOptionsOps[Self <: dxButtonGroupOptions] (val x: Self) extends AnyVal {
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
    def setButtonTemplateFunction2(value: (/* buttonData */ js.Any, /* buttonContent */ dxElement) => String | Element | JQuery): Self = this.set("buttonTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setButtonTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ js.Any, /* buttonContent */ dxElement, String | Element | JQuery])
    ): Self = this.set("buttonTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonTemplate: Self = this.set("buttonTemplate", js.undefined)
    @scala.inline
    def setItemTemplate(value: typings.devextreme.mod.DevExpress.core.template | js.Function): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setItemsVarargs(value: dxButtonGroupItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[dxButtonGroupItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    @scala.inline
    def setOnItemClick(value: /* e */ EventItemData => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* e */ RemovedItems => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    @scala.inline
    def setSelectedItemKeysVarargs(value: js.Any*): Self = this.set("selectedItemKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedItemKeys(value: js.Array[_]): Self = this.set("selectedItemKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemKeys: Self = this.set("selectedItemKeys", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    @scala.inline
    def setSelectionMode(value: multiple | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setStylingMode(value: text | outlined | contained): Self = this.set("stylingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylingMode: Self = this.set("stylingMode", js.undefined)
  }
  
}

