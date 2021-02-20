package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportOptions extends StObject {
  
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
  implicit class ExportOptionsMutableBuilder[Self <: ExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationType(value: String): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
    
    @scala.inline
    def setExcelExportAll(value: Boolean): Self = StObject.set(x, "excelExportAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelExportAllUndefined: Self = StObject.set(x, "excelExportAll", js.undefined)
    
    @scala.inline
    def setExcelSheetName(value: String): Self = StObject.set(x, "excelSheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelSheetNameUndefined: Self = StObject.set(x, "excelSheetName", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setFontUrl(value: String): Self = StObject.set(x, "fontUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUrlUndefined: Self = StObject.set(x, "fontUrl", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setPageOrientation(value: String): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: js.Object): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    @scala.inline
    def setShowFilters(value: Boolean): Self = StObject.set(x, "showFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFiltersUndefined: Self = StObject.set(x, "showFilters", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseCustomizeCellForData(value: Boolean): Self = StObject.set(x, "useCustomizeCellForData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomizeCellForDataUndefined: Self = StObject.set(x, "useCustomizeCellForData", js.undefined)
    
    @scala.inline
    def setUseOlapFormattingInExcel(value: Boolean): Self = StObject.set(x, "useOlapFormattingInExcel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOlapFormattingInExcelUndefined: Self = StObject.set(x, "useOlapFormattingInExcel", js.undefined)
  }
}
