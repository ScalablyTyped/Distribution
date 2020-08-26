package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.DelayName
import typings.devextreme.anon.ModelRootItem
import typings.devextreme.anon.RootItem
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.leftOrTop
import typings.devextreme.devextremeStrings.onClick
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.rightOrBottom
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxMenuOptions extends dxMenuBaseOptions[dxMenu] {
  /** @name dxMenu.Options.adaptivityEnabled */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.native
  /** @name dxMenu.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxMenuOptions: js.UndefOr[String | js.Array[dxMenuItem] | DataSource | DataSourceOptions] = js.native
  /** @name dxMenu.Options.hideSubmenuOnMouseLeave */
  var hideSubmenuOnMouseLeave: js.UndefOr[Boolean] = js.native
  /** @name dxMenu.Options.items */
  @JSName("items")
  var items_dxMenuOptions: js.UndefOr[js.Array[dxMenuItem]] = js.native
  /** @name dxMenu.Options.onSubmenuHidden */
  var onSubmenuHidden: js.UndefOr[js.Function1[/* e */ RootItem, _]] = js.native
  /** @name dxMenu.Options.onSubmenuHiding */
  var onSubmenuHiding: js.UndefOr[js.Function1[/* e */ ModelRootItem, _]] = js.native
  /** @name dxMenu.Options.onSubmenuShowing */
  var onSubmenuShowing: js.UndefOr[js.Function1[/* e */ RootItem, _]] = js.native
  /** @name dxMenu.Options.onSubmenuShown */
  var onSubmenuShown: js.UndefOr[js.Function1[/* e */ RootItem, _]] = js.native
  /** @name dxMenu.Options.orientation */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  /** @name dxMenu.Options.showFirstSubmenuMode */
  var showFirstSubmenuMode: js.UndefOr[DelayName | onClick | onHover] = js.native
  /** @name dxMenu.Options.submenuDirection */
  var submenuDirection: js.UndefOr[auto | leftOrTop | rightOrBottom] = js.native
}

object dxMenuOptions {
  @scala.inline
  def apply(): dxMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMenuOptions]
  }
  @scala.inline
  implicit class dxMenuOptionsOps[Self <: dxMenuOptions] (val x: Self) extends AnyVal {
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
    def setAdaptivityEnabled(value: Boolean): Self = this.set("adaptivityEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptivityEnabled: Self = this.set("adaptivityEnabled", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: dxMenuItem*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: String | js.Array[dxMenuItem] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setHideSubmenuOnMouseLeave(value: Boolean): Self = this.set("hideSubmenuOnMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSubmenuOnMouseLeave: Self = this.set("hideSubmenuOnMouseLeave", js.undefined)
    @scala.inline
    def setItemsVarargs(value: dxMenuItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[dxMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOnSubmenuHidden(value: /* e */ RootItem => _): Self = this.set("onSubmenuHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmenuHidden: Self = this.set("onSubmenuHidden", js.undefined)
    @scala.inline
    def setOnSubmenuHiding(value: /* e */ ModelRootItem => _): Self = this.set("onSubmenuHiding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmenuHiding: Self = this.set("onSubmenuHiding", js.undefined)
    @scala.inline
    def setOnSubmenuShowing(value: /* e */ RootItem => _): Self = this.set("onSubmenuShowing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmenuShowing: Self = this.set("onSubmenuShowing", js.undefined)
    @scala.inline
    def setOnSubmenuShown(value: /* e */ RootItem => _): Self = this.set("onSubmenuShown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmenuShown: Self = this.set("onSubmenuShown", js.undefined)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setShowFirstSubmenuMode(value: DelayName | onClick | onHover): Self = this.set("showFirstSubmenuMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFirstSubmenuMode: Self = this.set("showFirstSubmenuMode", js.undefined)
    @scala.inline
    def setSubmenuDirection(value: auto | leftOrTop | rightOrBottom): Self = this.set("submenuDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenuDirection: Self = this.set("submenuDirection", js.undefined)
  }
  
}

