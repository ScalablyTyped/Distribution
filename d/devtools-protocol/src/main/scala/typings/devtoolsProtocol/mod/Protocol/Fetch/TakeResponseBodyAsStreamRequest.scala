package typings.devtoolsProtocol.mod.Protocol.Fetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeResponseBodyAsStreamRequest extends StObject {
  
  var requestId: RequestId
}
object TakeResponseBodyAsStreamRequest {
  
  inline def apply(requestId: RequestId): TakeResponseBodyAsStreamRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyAsStreamRequest]
  }
  
  extension [Self <: TakeResponseBodyAsStreamRequest](x: Self) {
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
