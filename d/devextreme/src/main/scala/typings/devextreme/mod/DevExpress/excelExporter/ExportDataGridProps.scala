package typings.devextreme.mod.DevExpress.excelExporter

import typings.devextreme.anon.ExcelCell
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDataGridProps extends js.Object {
  /** @name ExportDataGridProps.autoFilterEnabled */
  var autoFilterEnabled: js.UndefOr[Boolean] = js.native
  /** @name ExportDataGridProps.component */
  var component: js.UndefOr[dxDataGrid] = js.native
  /** @name ExportDataGridProps.customizeCell */
  var customizeCell: js.UndefOr[js.Function1[/* options */ ExcelCell, _]] = js.native
  /** @name ExportDataGridProps.keepColumnWidths */
  var keepColumnWidths: js.UndefOr[Boolean] = js.native
  /** @name ExportDataGridProps.loadPanel */
  var loadPanel: js.UndefOr[ExportLoadPanel] = js.native
  /** @name ExportDataGridProps.selectedRowsOnly */
  var selectedRowsOnly: js.UndefOr[Boolean] = js.native
  /** @name ExportDataGridProps.topLeftCell */
  var topLeftCell: js.UndefOr[CellAddress | String] = js.native
  /** @name ExportDataGridProps.worksheet */
  var worksheet: js.UndefOr[js.Any] = js.native
}

object ExportDataGridProps {
  @scala.inline
  def apply(): ExportDataGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDataGridProps]
  }
  @scala.inline
  implicit class ExportDataGridPropsOps[Self <: ExportDataGridProps] (val x: Self) extends AnyVal {
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
    def setAutoFilterEnabled(value: Boolean): Self = this.set("autoFilterEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFilterEnabled: Self = this.set("autoFilterEnabled", js.undefined)
    @scala.inline
    def setComponent(value: dxDataGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setCustomizeCell(value: /* options */ ExcelCell => _): Self = this.set("customizeCell", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeCell: Self = this.set("customizeCell", js.undefined)
    @scala.inline
    def setKeepColumnWidths(value: Boolean): Self = this.set("keepColumnWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepColumnWidths: Self = this.set("keepColumnWidths", js.undefined)
    @scala.inline
    def setLoadPanel(value: ExportLoadPanel): Self = this.set("loadPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadPanel: Self = this.set("loadPanel", js.undefined)
    @scala.inline
    def setSelectedRowsOnly(value: Boolean): Self = this.set("selectedRowsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRowsOnly: Self = this.set("selectedRowsOnly", js.undefined)
    @scala.inline
    def setTopLeftCell(value: CellAddress | String): Self = this.set("topLeftCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLeftCell: Self = this.set("topLeftCell", js.undefined)
    @scala.inline
    def setWorksheet(value: js.Any): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

