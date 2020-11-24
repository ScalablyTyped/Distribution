package typings.devextreme.mod.DevExpress.excelExporter

import typings.devextreme.anon.ExcelCell
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelExportDataGridProps extends ExcelExportBaseProps {
  
  /**
    * [descr:ExcelExportDataGridProps.autoFilterEnabled]
    */
  var autoFilterEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ExcelExportDataGridProps.component]
    */
  var component: js.UndefOr[dxDataGrid] = js.native
  
  /**
    * [descr:ExcelExportDataGridProps.customizeCell]
    */
  var customizeCell: js.UndefOr[js.Function1[/* options */ ExcelCell, _]] = js.native
  
  /**
    * [descr:ExcelExportDataGridProps.selectedRowsOnly]
    */
  var selectedRowsOnly: js.UndefOr[Boolean] = js.native
}
object ExcelExportDataGridProps {
  
  @scala.inline
  def apply(): ExcelExportDataGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelExportDataGridProps]
  }
  
  @scala.inline
  implicit class ExcelExportDataGridPropsOps[Self <: ExcelExportDataGridProps] (val x: Self) extends AnyVal {
    
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
    def setSelectedRowsOnly(value: Boolean): Self = this.set("selectedRowsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRowsOnly: Self = this.set("selectedRowsOnly", js.undefined)
  }
}
