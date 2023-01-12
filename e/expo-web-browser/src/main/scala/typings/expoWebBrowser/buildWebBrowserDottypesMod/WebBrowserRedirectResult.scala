package typings.expoWebBrowser.buildWebBrowserDottypesMod

import typings.expoWebBrowser.expoWebBrowserStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebBrowserRedirectResult
  extends StObject
     with WebBrowserAuthSessionResult {
  
  /**
    * Type of the result.
    */
  var `type`: success
  
  var url: String
}
object WebBrowserRedirectResult {
  
  inline def apply(url: String): WebBrowserRedirectResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[WebBrowserRedirectResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebBrowserRedirectResult] (val x: Self) extends AnyVal {
    
    inline def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
