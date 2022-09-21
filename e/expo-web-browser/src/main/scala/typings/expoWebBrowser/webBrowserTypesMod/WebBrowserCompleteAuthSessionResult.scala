package typings.expoWebBrowser.webBrowserTypesMod

import typings.expoWebBrowser.expoWebBrowserStrings.failed
import typings.expoWebBrowser.expoWebBrowserStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebBrowserCompleteAuthSessionResult extends StObject {
  
  /**
    * Additional description or reasoning of the result.
    */
  var message: String
  
  /**
    * Type of the result.
    */
  var `type`: success | failed
}
object WebBrowserCompleteAuthSessionResult {
  
  inline def apply(message: String, `type`: success | failed): WebBrowserCompleteAuthSessionResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserCompleteAuthSessionResult]
  }
  
  extension [Self <: WebBrowserCompleteAuthSessionResult](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: success | failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
