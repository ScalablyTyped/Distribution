package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.EventJQueryEvent
import typings.devextreme.anon.ItemIndexModel
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownMenuOptions extends WidgetOptions[dxDropDownMenu] {
  /** @name dxDropDownMenu.Options.buttonIcon */
  var buttonIcon: js.UndefOr[String] = js.native
  /** @name dxDropDownMenu.Options.buttonText */
  var buttonText: js.UndefOr[String] = js.native
  /** @name dxDropDownMenu.Options.dataSource */
  var dataSource: js.UndefOr[String | js.Array[_] | DataSource | DataSourceOptions] = js.native
  /** @name dxDropDownMenu.Options.itemTemplate */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name dxDropDownMenu.Options.items */
  var items: js.UndefOr[js.Array[_]] = js.native
  /** @name dxDropDownMenu.Options.onButtonClick */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ EventJQueryEvent, _]) | String] = js.native
  /** @name dxDropDownMenu.Options.onItemClick */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ ItemIndexModel, _]) | String] = js.native
  /** @name dxDropDownMenu.Options.opened */
  var opened: js.UndefOr[Boolean] = js.native
  /** @name dxDropDownMenu.Options.popupHeight */
  var popupHeight: js.UndefOr[Double | String | js.Function] = js.native
  /** @name dxDropDownMenu.Options.popupWidth */
  var popupWidth: js.UndefOr[Double | String | js.Function] = js.native
  /** @name dxDropDownMenu.Options.usePopover */
  var usePopover: js.UndefOr[Boolean] = js.native
}

object dxDropDownMenuOptions {
  @scala.inline
  def apply(): dxDropDownMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownMenuOptions]
  }
  @scala.inline
  implicit class dxDropDownMenuOptionsOps[Self <: dxDropDownMenuOptions] (val x: Self) extends AnyVal {
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
    def setButtonIcon(value: String): Self = this.set("buttonIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonIcon: Self = this.set("buttonIcon", js.undefined)
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: String | js.Array[_] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
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
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOnButtonClickFunction1(value: /* e */ EventJQueryEvent => _): Self = this.set("onButtonClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnButtonClick(value: (js.Function1[/* e */ EventJQueryEvent, _]) | String): Self = this.set("onButtonClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnButtonClick: Self = this.set("onButtonClick", js.undefined)
    @scala.inline
    def setOnItemClickFunction1(value: /* e */ ItemIndexModel => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnItemClick(value: (js.Function1[/* e */ ItemIndexModel, _]) | String): Self = this.set("onItemClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOpened(value: Boolean): Self = this.set("opened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    @scala.inline
    def setPopupHeight(value: Double | String | js.Function): Self = this.set("popupHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupHeight: Self = this.set("popupHeight", js.undefined)
    @scala.inline
    def setPopupWidth(value: Double | String | js.Function): Self = this.set("popupWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupWidth: Self = this.set("popupWidth", js.undefined)
    @scala.inline
    def setUsePopover(value: Boolean): Self = this.set("usePopover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePopover: Self = this.set("usePopover", js.undefined)
  }
  
}

