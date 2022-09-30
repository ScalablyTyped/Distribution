package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackResponse extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The original request is prevented from being sent or completed and is instead
    * redirected to the given URL.
    */
  var redirectURL: js.UndefOr[String] = js.undefined
}
object CallbackResponse {
  
  inline def apply(): CallbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackResponse]
  }
  
  extension [Self <: CallbackResponse](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLUndefined: Self = StObject.set(x, "redirectURL", js.undefined)
  }
}
