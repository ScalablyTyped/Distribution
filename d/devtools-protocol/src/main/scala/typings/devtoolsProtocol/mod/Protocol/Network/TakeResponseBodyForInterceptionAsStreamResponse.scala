package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeResponseBodyForInterceptionAsStreamResponse extends js.Object {
  
  var stream: StreamHandle = js.native
}
object TakeResponseBodyForInterceptionAsStreamResponse {
  
  @scala.inline
  def apply(stream: StreamHandle): TakeResponseBodyForInterceptionAsStreamResponse = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyForInterceptionAsStreamResponse]
  }
  
  @scala.inline
  implicit class TakeResponseBodyForInterceptionAsStreamResponseOps[Self <: TakeResponseBodyForInterceptionAsStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStream(value: StreamHandle): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
}
