package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllFields
import typings.devextreme.anon.AreaComponent
import typings.devextreme.anon.SearchTimeout
import typings.devextreme.devextremeNumbers.`0`
import typings.devextreme.devextremeNumbers.`1`
import typings.devextreme.devextremeNumbers.`2`
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.onDemand
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridFieldChooserOptions extends WidgetOptions[dxPivotGridFieldChooser] {
  /** @name dxPivotGridFieldChooser.Options.allowSearch */
  var allowSearch: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGridFieldChooser.Options.applyChangesMode */
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.native
  /** @name dxPivotGridFieldChooser.Options.dataSource */
  var dataSource: js.UndefOr[PivotGridDataSource] = js.native
  /** @name dxPivotGridFieldChooser.Options.headerFilter */
  var headerFilter: js.UndefOr[SearchTimeout] = js.native
  /** @name dxPivotGridFieldChooser.Options.layout */
  var layout: js.UndefOr[`0` | `1` | `2`] = js.native
  /** @name dxPivotGridFieldChooser.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AreaComponent, _]] = js.native
  /** @name dxPivotGridFieldChooser.Options.searchTimeout */
  var searchTimeout: js.UndefOr[Double] = js.native
  /** @name dxPivotGridFieldChooser.Options.state */
  var state: js.UndefOr[js.Any] = js.native
  /** @name dxPivotGridFieldChooser.Options.texts */
  var texts: js.UndefOr[AllFields] = js.native
}

object dxPivotGridFieldChooserOptions {
  @scala.inline
  def apply(): dxPivotGridFieldChooserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridFieldChooserOptions]
  }
  @scala.inline
  implicit class dxPivotGridFieldChooserOptionsOps[Self <: dxPivotGridFieldChooserOptions] (val x: Self) extends AnyVal {
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
    def setAllowSearch(value: Boolean): Self = this.set("allowSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSearch: Self = this.set("allowSearch", js.undefined)
    @scala.inline
    def setApplyChangesMode(value: instantly | onDemand): Self = this.set("applyChangesMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyChangesMode: Self = this.set("applyChangesMode", js.undefined)
    @scala.inline
    def setDataSource(value: PivotGridDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setHeaderFilter(value: SearchTimeout): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    @scala.inline
    def setLayout(value: `0` | `1` | `2`): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setOnContextMenuPreparing(value: /* e */ AreaComponent => _): Self = this.set("onContextMenuPreparing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenuPreparing: Self = this.set("onContextMenuPreparing", js.undefined)
    @scala.inline
    def setSearchTimeout(value: Double): Self = this.set("searchTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchTimeout: Self = this.set("searchTimeout", js.undefined)
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTexts(value: AllFields): Self = this.set("texts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
  }
  
}

