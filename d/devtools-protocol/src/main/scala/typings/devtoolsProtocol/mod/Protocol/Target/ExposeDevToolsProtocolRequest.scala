package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExposeDevToolsProtocolRequest extends StObject {
  
  /**
    * Binding name, 'cdp' if not specified.
    */
  var bindingName: js.UndefOr[String] = js.native
  
  var targetId: TargetID = js.native
}
object ExposeDevToolsProtocolRequest {
  
  @scala.inline
  def apply(targetId: TargetID): ExposeDevToolsProtocolRequest = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposeDevToolsProtocolRequest]
  }
  
  @scala.inline
  implicit class ExposeDevToolsProtocolRequestMutableBuilder[Self <: ExposeDevToolsProtocolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingName(value: String): Self = StObject.set(x, "bindingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingNameUndefined: Self = StObject.set(x, "bindingName", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
