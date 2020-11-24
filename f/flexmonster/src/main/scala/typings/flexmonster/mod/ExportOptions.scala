package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportOptions extends js.Object {
  
  var destinationType: js.UndefOr[String] = js.native
  
  var excelExportAll: js.UndefOr[Boolean] = js.native
  
  var excelSheetName: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var fontUrl: js.UndefOr[String] = js.native
  
  var footer: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  var pageOrientation: js.UndefOr[String] = js.native
  
  var requestHeaders: js.UndefOr[js.Object] = js.native
  
  var showFilters: js.UndefOr[Boolean] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var useCustomizeCellForData: js.UndefOr[Boolean] = js.native
  
  var useOlapFormattingInExcel: js.UndefOr[Boolean] = js.native
}
object ExportOptions {
  
  @scala.inline
  def apply(): ExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOptions]
  }
  
  @scala.inline
  implicit class ExportOptionsOps[Self <: ExportOptions] (val x: Self) extends AnyVal {
    
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
    def setDestinationType(value: String): Self = this.set("destinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationType: Self = this.set("destinationType", js.undefined)
    
    @scala.inline
    def setExcelExportAll(value: Boolean): Self = this.set("excelExportAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcelExportAll: Self = this.set("excelExportAll", js.undefined)
    
    @scala.inline
    def setExcelSheetName(value: String): Self = this.set("excelSheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcelSheetName: Self = this.set("excelSheetName", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFontUrl(value: String): Self = this.set("fontUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontUrl: Self = this.set("fontUrl", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setPageOrientation(value: String): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: js.Object): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    
    @scala.inline
    def setShowFilters(value: Boolean): Self = this.set("showFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilters: Self = this.set("showFilters", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseCustomizeCellForData(value: Boolean): Self = this.set("useCustomizeCellForData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCustomizeCellForData: Self = this.set("useCustomizeCellForData", js.undefined)
    
    @scala.inline
    def setUseOlapFormattingInExcel(value: Boolean): Self = this.set("useOlapFormattingInExcel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOlapFormattingInExcel: Self = this.set("useOlapFormattingInExcel", js.undefined)
  }
}
