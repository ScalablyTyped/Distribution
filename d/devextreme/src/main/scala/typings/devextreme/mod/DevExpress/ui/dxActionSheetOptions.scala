package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ElementModel
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxActionSheetOptions extends CollectionWidgetOptions[dxActionSheet] {
  /** @name dxActionSheet.Options.cancelText */
  var cancelText: js.UndefOr[String] = js.native
  /** @name dxActionSheet.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxActionSheetOptions: js.UndefOr[
    String | (js.Array[String | dxActionSheetItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** @name dxActionSheet.Options.items */
  @JSName("items")
  var items_dxActionSheetOptions: js.UndefOr[js.Array[String | dxActionSheetItem | _]] = js.native
  /** @name dxActionSheet.Options.onCancelClick */
  var onCancelClick: js.UndefOr[(js.Function1[/* e */ ElementModel, _]) | String] = js.native
  /** @name dxActionSheet.Options.showCancelButton */
  var showCancelButton: js.UndefOr[Boolean] = js.native
  /** @name dxActionSheet.Options.showTitle */
  var showTitle: js.UndefOr[Boolean] = js.native
  /** @name dxActionSheet.Options.target */
  var target: js.UndefOr[String | Element | JQuery] = js.native
  /** @name dxActionSheet.Options.title */
  var title: js.UndefOr[String] = js.native
  /** @name dxActionSheet.Options.usePopover */
  var usePopover: js.UndefOr[Boolean] = js.native
}

object dxActionSheetOptions {
  @scala.inline
  def apply(): dxActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxActionSheetOptions]
  }
  @scala.inline
  implicit class dxActionSheetOptionsOps[Self <: dxActionSheetOptions] (val x: Self) extends AnyVal {
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
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: (String | dxActionSheetItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxActionSheetItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setItemsVarargs(value: (String | dxActionSheetItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[String | dxActionSheetItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOnCancelClickFunction1(value: /* e */ ElementModel => _): Self = this.set("onCancelClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnCancelClick(value: (js.Function1[/* e */ ElementModel, _]) | String): Self = this.set("onCancelClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCancelClick: Self = this.set("onCancelClick", js.undefined)
    @scala.inline
    def setShowCancelButton(value: Boolean): Self = this.set("showCancelButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCancelButton: Self = this.set("showCancelButton", js.undefined)
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    @scala.inline
    def setTarget(value: String | Element | JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUsePopover(value: Boolean): Self = this.set("usePopover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePopover: Self = this.set("usePopover", js.undefined)
  }
  
}

