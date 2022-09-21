package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options expected for 'browser' mode application return */
trait BrowserApplicationOpts extends StObject {
  
  var proxy: js.UndefOr[String] = js.undefined
  
  var url: String
}
object BrowserApplicationOpts {
  
  inline def apply(url: String): BrowserApplicationOpts = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserApplicationOpts]
  }
  
  extension [Self <: BrowserApplicationOpts](x: Self) {
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
