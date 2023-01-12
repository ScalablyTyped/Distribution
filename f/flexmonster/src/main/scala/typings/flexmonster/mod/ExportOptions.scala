package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportOptions extends StObject {
  
  var destinationType: js.UndefOr[String] = js.undefined
  
  var excelExportAll: js.UndefOr[Boolean] = js.undefined
  
  var excelSheetName: js.UndefOr[String] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var fontUrl: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
  
  var pageOrientation: js.UndefOr[String] = js.undefined
  
  var requestHeaders: js.UndefOr[js.Object] = js.undefined
  
  var showFilters: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var useCustomizeCellForData: js.UndefOr[Boolean] = js.undefined
  
  var useOlapFormattingInExcel: js.UndefOr[Boolean] = js.undefined
}
object ExportOptions {
  
  inline def apply(): ExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportOptions] (val x: Self) extends AnyVal {
    
    inline def setDestinationType(value: String): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
    
    inline def setExcelExportAll(value: Boolean): Self = StObject.set(x, "excelExportAll", value.asInstanceOf[js.Any])
    
    inline def setExcelExportAllUndefined: Self = StObject.set(x, "excelExportAll", js.undefined)
    
    inline def setExcelSheetName(value: String): Self = StObject.set(x, "excelSheetName", value.asInstanceOf[js.Any])
    
    inline def setExcelSheetNameUndefined: Self = StObject.set(x, "excelSheetName", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFontUrl(value: String): Self = StObject.set(x, "fontUrl", value.asInstanceOf[js.Any])
    
    inline def setFontUrlUndefined: Self = StObject.set(x, "fontUrl", js.undefined)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPageOrientation(value: String): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    inline def setRequestHeaders(value: js.Object): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setShowFilters(value: Boolean): Self = StObject.set(x, "showFilters", value.asInstanceOf[js.Any])
    
    inline def setShowFiltersUndefined: Self = StObject.set(x, "showFilters", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseCustomizeCellForData(value: Boolean): Self = StObject.set(x, "useCustomizeCellForData", value.asInstanceOf[js.Any])
    
    inline def setUseCustomizeCellForDataUndefined: Self = StObject.set(x, "useCustomizeCellForData", js.undefined)
    
    inline def setUseOlapFormattingInExcel(value: Boolean): Self = StObject.set(x, "useOlapFormattingInExcel", value.asInstanceOf[js.Any])
    
    inline def setUseOlapFormattingInExcelUndefined: Self = StObject.set(x, "useOlapFormattingInExcel", js.undefined)
  }
}
