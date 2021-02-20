package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResponseBodyForInterceptionRequest extends StObject {
  
  /**
    * Identifier for the intercepted request to get body for.
    */
  var interceptionId: InterceptionId = js.native
}
object GetResponseBodyForInterceptionRequest {
  
  @scala.inline
  def apply(interceptionId: InterceptionId): GetResponseBodyForInterceptionRequest = {
    val __obj = js.Dynamic.literal(interceptionId = interceptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseBodyForInterceptionRequest]
  }
  
  @scala.inline
  implicit class GetResponseBodyForInterceptionRequestMutableBuilder[Self <: GetResponseBodyForInterceptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterceptionId(value: InterceptionId): Self = StObject.set(x, "interceptionId", value.asInstanceOf[js.Any])
  }
}
