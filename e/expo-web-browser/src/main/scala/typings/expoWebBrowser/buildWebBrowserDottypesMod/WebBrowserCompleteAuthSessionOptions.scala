package typings.expoWebBrowser.buildWebBrowserDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebBrowserCompleteAuthSessionOptions extends StObject {
  
  /**
    * Attempt to close the window without checking to see if the auth redirect matches the cached redirect URL.
    */
  var skipRedirectCheck: js.UndefOr[Boolean] = js.undefined
}
object WebBrowserCompleteAuthSessionOptions {
  
  inline def apply(): WebBrowserCompleteAuthSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebBrowserCompleteAuthSessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebBrowserCompleteAuthSessionOptions] (val x: Self) extends AnyVal {
    
    inline def setSkipRedirectCheck(value: Boolean): Self = StObject.set(x, "skipRedirectCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipRedirectCheckUndefined: Self = StObject.set(x, "skipRedirectCheck", js.undefined)
  }
}
