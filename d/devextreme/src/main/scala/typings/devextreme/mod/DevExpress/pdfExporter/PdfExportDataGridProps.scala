package typings.devextreme.mod.DevExpress.pdfExporter

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdfExportDataGridProps extends js.Object {
  
  /**
    * [descr:PdfExportDataGridProps.autoTableOptions]
    */
  var autoTableOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:PdfExportDataGridProps.component]
    */
  var component: js.UndefOr[dxDataGrid] = js.native
  
  /**
    * [descr:PdfExportDataGridProps.jsPDFDocument]
    */
  var jsPDFDocument: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:PdfExportDataGridProps.keepColumnWidths]
    */
  var keepColumnWidths: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PdfExportDataGridProps.selectedRowsOnly]
    */
  var selectedRowsOnly: js.UndefOr[Boolean] = js.native
}
object PdfExportDataGridProps {
  
  @scala.inline
  def apply(): PdfExportDataGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfExportDataGridProps]
  }
  
  @scala.inline
  implicit class PdfExportDataGridPropsOps[Self <: PdfExportDataGridProps] (val x: Self) extends AnyVal {
    
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
    def setAutoTableOptions(value: js.Any): Self = this.set("autoTableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoTableOptions: Self = this.set("autoTableOptions", js.undefined)
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setJsPDFDocument(value: js.Any): Self = this.set("jsPDFDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsPDFDocument: Self = this.set("jsPDFDocument", js.undefined)
    
    @scala.inline
    def setKeepColumnWidths(value: Boolean): Self = this.set("keepColumnWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepColumnWidths: Self = this.set("keepColumnWidths", js.undefined)
    
    @scala.inline
    def setSelectedRowsOnly(value: Boolean): Self = this.set("selectedRowsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRowsOnly: Self = this.set("selectedRowsOnly", js.undefined)
  }
}
