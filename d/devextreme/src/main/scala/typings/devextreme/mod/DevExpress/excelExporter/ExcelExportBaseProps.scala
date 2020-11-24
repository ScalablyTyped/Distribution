package typings.devextreme.mod.DevExpress.excelExporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelExportBaseProps extends js.Object {
  
  /**
    * [descr:ExcelExportBaseProps.keepColumnWidths]
    */
  var keepColumnWidths: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ExcelExportBaseProps.loadPanel]
    */
  var loadPanel: js.UndefOr[ExportLoadPanel] = js.native
  
  /**
    * [descr:ExcelExportBaseProps.topLeftCell]
    */
  var topLeftCell: js.UndefOr[CellAddress | String] = js.native
  
  /**
    * [descr:ExcelExportBaseProps.worksheet]
    */
  var worksheet: js.UndefOr[js.Any] = js.native
}
object ExcelExportBaseProps {
  
  @scala.inline
  def apply(): ExcelExportBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelExportBaseProps]
  }
  
  @scala.inline
  implicit class ExcelExportBasePropsOps[Self <: ExcelExportBaseProps] (val x: Self) extends AnyVal {
    
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
    def setKeepColumnWidths(value: Boolean): Self = this.set("keepColumnWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepColumnWidths: Self = this.set("keepColumnWidths", js.undefined)
    
    @scala.inline
    def setLoadPanel(value: ExportLoadPanel): Self = this.set("loadPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadPanel: Self = this.set("loadPanel", js.undefined)
    
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
