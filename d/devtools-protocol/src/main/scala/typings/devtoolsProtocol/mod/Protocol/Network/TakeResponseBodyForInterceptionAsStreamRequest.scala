package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeResponseBodyForInterceptionAsStreamRequest extends StObject {
  
  var interceptionId: InterceptionId = js.native
}
object TakeResponseBodyForInterceptionAsStreamRequest {
  
  @scala.inline
  def apply(interceptionId: InterceptionId): TakeResponseBodyForInterceptionAsStreamRequest = {
    val __obj = js.Dynamic.literal(interceptionId = interceptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyForInterceptionAsStreamRequest]
  }
  
  @scala.inline
  implicit class TakeResponseBodyForInterceptionAsStreamRequestMutableBuilder[Self <: TakeResponseBodyForInterceptionAsStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterceptionId(value: InterceptionId): Self = StObject.set(x, "interceptionId", value.asInstanceOf[js.Any])
  }
}
