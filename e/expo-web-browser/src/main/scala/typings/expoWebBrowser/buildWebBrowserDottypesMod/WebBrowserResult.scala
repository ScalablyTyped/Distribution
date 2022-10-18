package typings.expoWebBrowser.buildWebBrowserDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebBrowserResult
  extends StObject
     with WebBrowserAuthSessionResult {
  
  /**
    * Type of the result.
    */
  var `type`: WebBrowserResultType
}
object WebBrowserResult {
  
  inline def apply(`type`: WebBrowserResultType): WebBrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserResult]
  }
  
  extension [Self <: WebBrowserResult](x: Self) {
    
    inline def setType(value: WebBrowserResultType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
