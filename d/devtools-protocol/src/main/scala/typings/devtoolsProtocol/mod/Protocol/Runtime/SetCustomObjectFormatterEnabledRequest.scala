package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetCustomObjectFormatterEnabledRequest extends StObject {
  
  var enabled: Boolean = js.native
}
object SetCustomObjectFormatterEnabledRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetCustomObjectFormatterEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCustomObjectFormatterEnabledRequest]
  }
  
  @scala.inline
  implicit class SetCustomObjectFormatterEnabledRequestMutableBuilder[Self <: SetCustomObjectFormatterEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
