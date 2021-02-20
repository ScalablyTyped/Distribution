package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDocumentCookieDisabledRequest extends StObject {
  
  /**
    * Whether document.coookie API should be disabled.
    */
  var disabled: Boolean = js.native
}
object SetDocumentCookieDisabledRequest {
  
  @scala.inline
  def apply(disabled: Boolean): SetDocumentCookieDisabledRequest = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDocumentCookieDisabledRequest]
  }
  
  @scala.inline
  implicit class SetDocumentCookieDisabledRequestMutableBuilder[Self <: SetDocumentCookieDisabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
  }
}
