package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTileViewOptions extends CollectionWidgetOptions[dxTileView] {
  /** @name dxTileView.Options.baseItemHeight */
  var baseItemHeight: js.UndefOr[Double] = js.native
  /** @name dxTileView.Options.baseItemWidth */
  var baseItemWidth: js.UndefOr[Double] = js.native
  /** @name dxTileView.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxTileViewOptions: js.UndefOr[
    String | (js.Array[String | dxTileViewItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** @name dxTileView.Options.direction */
  var direction: js.UndefOr[horizontal | vertical] = js.native
  /** @name dxTileView.Options.itemMargin */
  var itemMargin: js.UndefOr[Double] = js.native
  /** @name dxTileView.Options.items */
  @JSName("items")
  var items_dxTileViewOptions: js.UndefOr[js.Array[String | dxTileViewItem | _]] = js.native
  /** @name dxTileView.Options.showScrollbar */
  var showScrollbar: js.UndefOr[Boolean] = js.native
}

object dxTileViewOptions {
  @scala.inline
  def apply(): dxTileViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTileViewOptions]
  }
  @scala.inline
  implicit class dxTileViewOptionsOps[Self <: dxTileViewOptions] (val x: Self) extends AnyVal {
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
    def setBaseItemHeight(value: Double): Self = this.set("baseItemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseItemHeight: Self = this.set("baseItemHeight", js.undefined)
    @scala.inline
    def setBaseItemWidth(value: Double): Self = this.set("baseItemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseItemWidth: Self = this.set("baseItemWidth", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: (String | dxTileViewItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxTileViewItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setItemMargin(value: Double): Self = this.set("itemMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemMargin: Self = this.set("itemMargin", js.undefined)
    @scala.inline
    def setItemsVarargs(value: (String | dxTileViewItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[String | dxTileViewItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setShowScrollbar(value: Boolean): Self = this.set("showScrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowScrollbar: Self = this.set("showScrollbar", js.undefined)
  }
  
}

