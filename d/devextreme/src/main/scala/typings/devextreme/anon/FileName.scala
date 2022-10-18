package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileName extends StObject {
  
  /**
    * Specifies the name of the file to which the diagram is exported.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the URL of the server-side proxy that streams the resulting file and enables export in Safari.
    * @deprecated Since v10, Safari browser supports API for saving files, and this property is no longer required.
    */
  var proxyUrl: js.UndefOr[String] = js.undefined
}
object FileName {
  
  inline def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  
  extension [Self <: FileName](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
  }
}
