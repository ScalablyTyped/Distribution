package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  /**
    * Enables client-side exporting.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a default name for the file to which grid data is exported.
    * @deprecated Since v20.2, we recommend ExcelJS-based export which does not use this property.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether Excel should hide warnings if there are errors in the exported document.
    * @deprecated Since v20.2, we recommend ExcelJS-based export which does not use this property.
    */
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the URL of the server-side proxy that streams the resulting file to the end user to enable exporting in the Safari browser.
    * @deprecated Since v10, Safari browser supports API for saving files, and this property is no longer required.
    */
  var proxyUrl: js.UndefOr[String] = js.undefined
}
object Enabled {
  
  inline def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setIgnoreExcelErrors(value: Boolean): Self = StObject.set(x, "ignoreExcelErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreExcelErrorsUndefined: Self = StObject.set(x, "ignoreExcelErrors", js.undefined)
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
  }
}
