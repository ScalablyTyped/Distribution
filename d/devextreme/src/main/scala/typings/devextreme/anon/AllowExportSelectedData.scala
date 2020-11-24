package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowExportSelectedData extends js.Object {
  
  var allowExportSelectedData: js.UndefOr[Boolean] = js.native
  
  var customizeExcelCell: js.UndefOr[js.Function1[/* options */ FillPatternColor, _]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var excelFilterEnabled: js.UndefOr[Boolean] = js.native
  
  var excelWrapTextEnabled: js.UndefOr[Boolean] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.native
  
  var proxyUrl: js.UndefOr[String] = js.native
  
  var texts: js.UndefOr[ExportAll] = js.native
}
object AllowExportSelectedData {
  
  @scala.inline
  def apply(): AllowExportSelectedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowExportSelectedData]
  }
  
  @scala.inline
  implicit class AllowExportSelectedDataOps[Self <: AllowExportSelectedData] (val x: Self) extends AnyVal {
    
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
    def setAllowExportSelectedData(value: Boolean): Self = this.set("allowExportSelectedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExportSelectedData: Self = this.set("allowExportSelectedData", js.undefined)
    
    @scala.inline
    def setCustomizeExcelCell(value: /* options */ FillPatternColor => _): Self = this.set("customizeExcelCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeExcelCell: Self = this.set("customizeExcelCell", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExcelFilterEnabled(value: Boolean): Self = this.set("excelFilterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcelFilterEnabled: Self = this.set("excelFilterEnabled", js.undefined)
    
    @scala.inline
    def setExcelWrapTextEnabled(value: Boolean): Self = this.set("excelWrapTextEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcelWrapTextEnabled: Self = this.set("excelWrapTextEnabled", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setIgnoreExcelErrors(value: Boolean): Self = this.set("ignoreExcelErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreExcelErrors: Self = this.set("ignoreExcelErrors", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    
    @scala.inline
    def setTexts(value: ExportAll): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
  }
}
