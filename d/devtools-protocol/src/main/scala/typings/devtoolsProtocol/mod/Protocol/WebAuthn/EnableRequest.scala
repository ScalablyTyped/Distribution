package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableRequest extends StObject {
  
  /**
    * Whether to enable the WebAuthn user interface. Enabling the UI is
    * recommended for debugging and demo purposes, as it is closer to the real
    * experience. Disabling the UI is recommended for automated testing.
    * Supported at the embedder's discretion if UI is available.
    * Defaults to false.
    */
  var enableUI: js.UndefOr[Boolean] = js.undefined
}
object EnableRequest {
  
  inline def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableRequest] (val x: Self) extends AnyVal {
    
    inline def setEnableUI(value: Boolean): Self = StObject.set(x, "enableUI", value.asInstanceOf[js.Any])
    
    inline def setEnableUIUndefined: Self = StObject.set(x, "enableUI", js.undefined)
  }
}
