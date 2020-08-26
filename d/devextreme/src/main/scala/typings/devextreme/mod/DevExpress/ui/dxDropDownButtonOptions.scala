package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ItemElementModel
import typings.devextreme.anon.PreviousItem
import typings.devextreme.anon.SelectedItem
import typings.devextreme.devextremeStrings.contained
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.text
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownButtonOptions extends WidgetOptions[dxDropDownButton] {
  /** @name dxDropDownButton.Options.dataSource */
  var dataSource: js.UndefOr[String | (js.Array[dxDropDownButtonItem | _]) | DataSource | DataSourceOptions] = js.native
  /** @name dxDropDownButton.Options.deferRendering */
  var deferRendering: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownButton.Options.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* itemData */ js.Any, String])] = js.native
  /** @name dxDropDownButton.Options.dropDownContentTemplate */
  var dropDownContentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ (js.Array[String | Double | _]) | DataSource, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name dxDropDownButton.Options.dropDownOptions */
  var dropDownOptions: js.UndefOr[dxPopupOptions[dxPopup]] = js.native
  /** @name dxDropDownButton.Options.icon */
  var icon: js.UndefOr[String] = js.native
  /** @name dxDropDownButton.Options.itemTemplate */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name dxDropDownButton.Options.items */
  var items: js.UndefOr[js.Array[dxDropDownButtonItem | _]] = js.native
  /** @name dxDropDownButton.Options.keyExpr */
  var keyExpr: js.UndefOr[String] = js.native
  /** @name dxDropDownButton.Options.noDataText */
  var noDataText: js.UndefOr[String] = js.native
  /** @name dxDropDownButton.Options.onButtonClick */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ SelectedItem, _]) | String] = js.native
  /** @name dxDropDownButton.Options.onItemClick */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ ItemElementModel, _]) | String] = js.native
  /** @name dxDropDownButton.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[(js.Function1[/* e */ PreviousItem, _]) | String] = js.native
  /** @name dxDropDownButton.Options.opened */
  var opened: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownButton.Options.selectedItem */
  var selectedItem: js.UndefOr[String | Double | js.Any] = js.native
  /** @name dxDropDownButton.Options.selectedItemKey */
  var selectedItemKey: js.UndefOr[String | Double] = js.native
  /** @name dxDropDownButton.Options.showArrowIcon */
  var showArrowIcon: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownButton.Options.splitButton */
  var splitButton: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownButton.Options.stylingMode */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.native
  /** @name dxDropDownButton.Options.text */
  var text: js.UndefOr[String] = js.native
  /** @name dxDropDownButton.Options.useSelectMode */
  var useSelectMode: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownButton.Options.wrapItemText */
  var wrapItemText: js.UndefOr[Boolean] = js.native
}

object dxDropDownButtonOptions {
  @scala.inline
  def apply(): dxDropDownButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownButtonOptions]
  }
  @scala.inline
  implicit class dxDropDownButtonOptionsOps[Self <: dxDropDownButtonOptions] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: (dxDropDownButtonItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: String | (js.Array[dxDropDownButtonItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDeferRendering(value: Boolean): Self = this.set("deferRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferRendering: Self = this.set("deferRendering", js.undefined)
    @scala.inline
    def setDisplayExprFunction1(value: /* itemData */ js.Any => String): Self = this.set("displayExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* itemData */ js.Any, String])): Self = this.set("displayExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayExpr: Self = this.set("displayExpr", js.undefined)
    @scala.inline
    def setDropDownContentTemplateFunction2(
      value: (/* data */ (js.Array[String | Double | _]) | DataSource, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("dropDownContentTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setDropDownContentTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* data */ (js.Array[String | Double | _]) | DataSource, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("dropDownContentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownContentTemplate: Self = this.set("dropDownContentTemplate", js.undefined)
    @scala.inline
    def setDropDownOptions(value: dxPopupOptions[dxPopup]): Self = this.set("dropDownOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownOptions: Self = this.set("dropDownOptions", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("itemTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setItemTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setItemsVarargs(value: (dxDropDownButtonItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[dxDropDownButtonItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKeyExpr(value: String): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    @scala.inline
    def setNoDataText(value: String): Self = this.set("noDataText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDataText: Self = this.set("noDataText", js.undefined)
    @scala.inline
    def setOnButtonClickFunction1(value: /* e */ SelectedItem => _): Self = this.set("onButtonClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnButtonClick(value: (js.Function1[/* e */ SelectedItem, _]) | String): Self = this.set("onButtonClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnButtonClick: Self = this.set("onButtonClick", js.undefined)
    @scala.inline
    def setOnItemClickFunction1(value: /* e */ ItemElementModel => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnItemClick(value: (js.Function1[/* e */ ItemElementModel, _]) | String): Self = this.set("onItemClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnSelectionChangedFunction1(value: /* e */ PreviousItem => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSelectionChanged(value: (js.Function1[/* e */ PreviousItem, _]) | String): Self = this.set("onSelectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    @scala.inline
    def setOpened(value: Boolean): Self = this.set("opened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    @scala.inline
    def setSelectedItem(value: String | Double | js.Any): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    @scala.inline
    def setSelectedItemKey(value: String | Double): Self = this.set("selectedItemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemKey: Self = this.set("selectedItemKey", js.undefined)
    @scala.inline
    def setShowArrowIcon(value: Boolean): Self = this.set("showArrowIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrowIcon: Self = this.set("showArrowIcon", js.undefined)
    @scala.inline
    def setSplitButton(value: Boolean): Self = this.set("splitButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButton: Self = this.set("splitButton", js.undefined)
    @scala.inline
    def setStylingMode(value: text | outlined | contained): Self = this.set("stylingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylingMode: Self = this.set("stylingMode", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUseSelectMode(value: Boolean): Self = this.set("useSelectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSelectMode: Self = this.set("useSelectMode", js.undefined)
    @scala.inline
    def setWrapItemText(value: Boolean): Self = this.set("wrapItemText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapItemText: Self = this.set("wrapItemText", js.undefined)
  }
  
}

