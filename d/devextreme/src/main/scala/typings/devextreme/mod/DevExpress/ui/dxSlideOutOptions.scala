package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.`10`
import typings.devextreme.devextremeStrings.inverted
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSlideOutOptions extends CollectionWidgetOptions[dxSlideOut] {
  /** @name dxSlideOut.Options.contentTemplate */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* container */ dxElement, String | Element | JQuery])
  ] = js.native
  /** @name dxSlideOut.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxSlideOutOptions: js.UndefOr[
    String | (js.Array[String | dxSlideOutItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** @name dxSlideOut.Options.items */
  @JSName("items")
  var items_dxSlideOutOptions: js.UndefOr[js.Array[String | dxSlideOutItem | _]] = js.native
  /** @name dxSlideOut.Options.menuGroupTemplate */
  var menuGroupTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ js.Any, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name dxSlideOut.Options.menuGrouped */
  var menuGrouped: js.UndefOr[Boolean] = js.native
  /** @name dxSlideOut.Options.menuItemTemplate */
  var menuItemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name dxSlideOut.Options.menuPosition */
  var menuPosition: js.UndefOr[inverted | normal] = js.native
  /** @name dxSlideOut.Options.menuVisible */
  var menuVisible: js.UndefOr[Boolean] = js.native
  /** @name dxSlideOut.Options.onMenuGroupRendered */
  var onMenuGroupRendered: js.UndefOr[js.Function1[/* e */ `10`, _]] = js.native
  /** @name dxSlideOut.Options.onMenuItemRendered */
  var onMenuItemRendered: js.UndefOr[js.Function1[/* e */ `10`, _]] = js.native
  /** @name dxSlideOut.Options.swipeEnabled */
  var swipeEnabled: js.UndefOr[Boolean] = js.native
}

object dxSlideOutOptions {
  @scala.inline
  def apply(): dxSlideOutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutOptions]
  }
  @scala.inline
  implicit class dxSlideOutOptionsOps[Self <: dxSlideOutOptions] (val x: Self) extends AnyVal {
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
    def setContentTemplateFunction1(value: /* container */ dxElement => String | Element | JQuery): Self = this.set("contentTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setContentTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* container */ dxElement, String | Element | JQuery])
    ): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: (String | dxSlideOutItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxSlideOutItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setItemsVarargs(value: (String | dxSlideOutItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[String | dxSlideOutItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMenuGroupTemplateFunction3(
      value: (/* groupData */ js.Any, /* groupIndex */ Double, /* groupElement */ js.Any) => String | Element | JQuery
    ): Self = this.set("menuGroupTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setMenuGroupTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* groupData */ js.Any, 
          /* groupIndex */ Double, 
          /* groupElement */ js.Any, 
          String | Element | JQuery
        ])
    ): Self = this.set("menuGroupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuGroupTemplate: Self = this.set("menuGroupTemplate", js.undefined)
    @scala.inline
    def setMenuGrouped(value: Boolean): Self = this.set("menuGrouped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuGrouped: Self = this.set("menuGrouped", js.undefined)
    @scala.inline
    def setMenuItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("menuItemTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setMenuItemTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("menuItemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemTemplate: Self = this.set("menuItemTemplate", js.undefined)
    @scala.inline
    def setMenuPosition(value: inverted | normal): Self = this.set("menuPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuPosition: Self = this.set("menuPosition", js.undefined)
    @scala.inline
    def setMenuVisible(value: Boolean): Self = this.set("menuVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuVisible: Self = this.set("menuVisible", js.undefined)
    @scala.inline
    def setOnMenuGroupRendered(value: /* e */ `10` => _): Self = this.set("onMenuGroupRendered", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMenuGroupRendered: Self = this.set("onMenuGroupRendered", js.undefined)
    @scala.inline
    def setOnMenuItemRendered(value: /* e */ `10` => _): Self = this.set("onMenuItemRendered", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMenuItemRendered: Self = this.set("onMenuItemRendered", js.undefined)
    @scala.inline
    def setSwipeEnabled(value: Boolean): Self = this.set("swipeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeEnabled: Self = this.set("swipeEnabled", js.undefined)
  }
  
}

