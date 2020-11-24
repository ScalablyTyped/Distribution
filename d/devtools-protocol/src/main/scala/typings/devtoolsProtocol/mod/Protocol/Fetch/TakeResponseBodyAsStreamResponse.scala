package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeResponseBodyAsStreamResponse extends js.Object {
  
  var stream: StreamHandle = js.native
}
object TakeResponseBodyAsStreamResponse {
  
  @scala.inline
  def apply(stream: StreamHandle): TakeResponseBodyAsStreamResponse = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyAsStreamResponse]
  }
  
  @scala.inline
  implicit class TakeResponseBodyAsStreamResponseOps[Self <: TakeResponseBodyAsStreamResponse] (val x: Self) extends AnyVal {
    
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
