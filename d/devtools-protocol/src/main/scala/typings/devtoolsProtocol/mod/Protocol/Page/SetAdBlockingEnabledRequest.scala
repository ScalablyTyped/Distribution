package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAdBlockingEnabledRequest extends StObject {
  
  /**
    * Whether to block ads.
    */
  var enabled: Boolean = js.native
}
object SetAdBlockingEnabledRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetAdBlockingEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAdBlockingEnabledRequest]
  }
  
  @scala.inline
  implicit class SetAdBlockingEnabledRequestMutableBuilder[Self <: SetAdBlockingEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
