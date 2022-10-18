package typings.expoWebBrowser.buildWebBrowserDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserRedirectResult
  - typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResult
*/
trait WebBrowserAuthSessionResult extends StObject
object WebBrowserAuthSessionResult {
  
  inline def WebBrowserRedirectResult(url: String): typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserRedirectResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserRedirectResult]
  }
  
  inline def WebBrowserResult(`type`: WebBrowserResultType): typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResult]
  }
}
