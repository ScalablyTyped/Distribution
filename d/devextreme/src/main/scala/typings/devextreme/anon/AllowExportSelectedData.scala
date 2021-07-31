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
  
  @scala.inline
  def apply(): AllowExportSelectedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowExportSelectedData]
  }
  
  @scala.inline
  implicit class AllowExportSelectedDataMutableBuilder[Self <: AllowExportSelectedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowExportSelectedData(value: Boolean): Self = StObject.set(x, "allowExportSelectedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowExportSelectedDataUndefined: Self = StObject.set(x, "allowExportSelectedData", js.undefined)
    
    @scala.inline
    def setCustomizeExcelCell(value: /* options */ FillPatternColor => js.Any): Self = StObject.set(x, "customizeExcelCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeExcelCellUndefined: Self = StObject.set(x, "customizeExcelCell", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExcelFilterEnabled(value: Boolean): Self = StObject.set(x, "excelFilterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelFilterEnabledUndefined: Self = StObject.set(x, "excelFilterEnabled", js.undefined)
    
    @scala.inline
    def setExcelWrapTextEnabled(value: Boolean): Self = StObject.set(x, "excelWrapTextEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelWrapTextEnabledUndefined: Self = StObject.set(x, "excelWrapTextEnabled", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setIgnoreExcelErrors(value: Boolean): Self = StObject.set(x, "ignoreExcelErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreExcelErrorsUndefined: Self = StObject.set(x, "ignoreExcelErrors", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    @scala.inline
    def setTexts(value: ExportAll): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
  }
}
