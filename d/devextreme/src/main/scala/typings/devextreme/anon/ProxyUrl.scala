package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyUrl extends StObject {
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var proxyUrl: js.UndefOr[String] = js.undefined
}
object ProxyUrl {
  
  inline def apply(): ProxyUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyUrl]
  }
  
  extension [Self <: ProxyUrl](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
  }
}
