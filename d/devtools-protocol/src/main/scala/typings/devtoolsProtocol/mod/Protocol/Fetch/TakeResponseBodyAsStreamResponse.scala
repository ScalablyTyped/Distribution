package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeResponseBodyAsStreamResponse extends StObject {
  
  var stream: StreamHandle
}
object TakeResponseBodyAsStreamResponse {
  
  inline def apply(stream: StreamHandle): TakeResponseBodyAsStreamResponse = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyAsStreamResponse]
  }
  
  extension [Self <: TakeResponseBodyAsStreamResponse](x: Self) {
    
    inline def setStream(value: StreamHandle): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
