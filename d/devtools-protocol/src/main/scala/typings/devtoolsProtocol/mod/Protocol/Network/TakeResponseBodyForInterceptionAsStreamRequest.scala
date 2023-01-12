package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeResponseBodyForInterceptionAsStreamRequest extends StObject {
  
  var interceptionId: InterceptionId
}
object TakeResponseBodyForInterceptionAsStreamRequest {
  
  inline def apply(interceptionId: InterceptionId): TakeResponseBodyForInterceptionAsStreamRequest = {
    val __obj = js.Dynamic.literal(interceptionId = interceptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyForInterceptionAsStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TakeResponseBodyForInterceptionAsStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setInterceptionId(value: InterceptionId): Self = StObject.set(x, "interceptionId", value.asInstanceOf[js.Any])
  }
}
