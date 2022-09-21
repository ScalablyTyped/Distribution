package typings.expoWebBrowser.webBrowserTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.expoWebBrowser.webBrowserTypesMod.WebBrowserRedirectResult
  - typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
*/
trait WebBrowserAuthSessionResult extends StObject
object WebBrowserAuthSessionResult {
  
  inline def WebBrowserRedirectResult(url: String): typings.expoWebBrowser.webBrowserTypesMod.WebBrowserRedirectResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[typings.expoWebBrowser.webBrowserTypesMod.WebBrowserRedirectResult]
  }
  
  inline def WebBrowserResult(`type`: WebBrowserResultType): typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult]
  }
}
