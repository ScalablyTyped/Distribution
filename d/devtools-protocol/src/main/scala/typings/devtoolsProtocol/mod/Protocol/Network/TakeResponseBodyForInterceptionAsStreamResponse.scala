package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeResponseBodyForInterceptionAsStreamResponse extends StObject {
  
  var stream: StreamHandle
}
object TakeResponseBodyForInterceptionAsStreamResponse {
  
  @scala.inline
  def apply(stream: StreamHandle): TakeResponseBodyForInterceptionAsStreamResponse = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyForInterceptionAsStreamResponse]
  }
  
  @scala.inline
  implicit class TakeResponseBodyForInterceptionAsStreamResponseMutableBuilder[Self <: TakeResponseBodyForInterceptionAsStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: StreamHandle): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
