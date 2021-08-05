package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowExportSelectedData extends StObject {
  
  var allowExportSelectedData: js.UndefOr[Boolean] = js.undefined
  
  var customizeExcelCell: js.UndefOr[js.Function1[/* options */ FillPatternColor, js.Any]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var excelFilterEnabled: js.UndefOr[Boolean] = js.undefined
  
  var excelWrapTextEnabled: js.UndefOr[Boolean] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined
  
  var proxyUrl: js.UndefOr[String] = js.undefined
  
  var texts: js.UndefOr[ExportAll] = js.undefined
}
object AllowExportSelectedData {
  
  inline def apply(): AllowExportSelectedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowExportSelectedData]
  }
  
  extension [Self <: AllowExportSelectedData](x: Self) {
    
    inline def setAllowExportSelectedData(value: Boolean): Self = StObject.set(x, "allowExportSelectedData", value.asInstanceOf[js.Any])
    
    inline def setAllowExportSelectedDataUndefined: Self = StObject.set(x, "allowExportSelectedData", js.undefined)
    
    inline def setCustomizeExcelCell(value: /* options */ FillPatternColor => js.Any): Self = StObject.set(x, "customizeExcelCell", js.Any.fromFunction1(value))
    
    inline def setCustomizeExcelCellUndefined: Self = StObject.set(x, "customizeExcelCell", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExcelFilterEnabled(value: Boolean): Self = StObject.set(x, "excelFilterEnabled", value.asInstanceOf[js.Any])
    
    inline def setExcelFilterEnabledUndefined: Self = StObject.set(x, "excelFilterEnabled", js.undefined)
    
    inline def setExcelWrapTextEnabled(value: Boolean): Self = StObject.set(x, "excelWrapTextEnabled", value.asInstanceOf[js.Any])
    
    inline def setExcelWrapTextEnabledUndefined: Self = StObject.set(x, "excelWrapTextEnabled", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setIgnoreExcelErrors(value: Boolean): Self = StObject.set(x, "ignoreExcelErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreExcelErrorsUndefined: Self = StObject.set(x, "ignoreExcelErrors", js.undefined)
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    inline def setTexts(value: ExportAll): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
  }
}
