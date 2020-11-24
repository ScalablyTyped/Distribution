package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeResponseBodyForInterceptionAsStreamRequest extends js.Object {
  
  var interceptionId: InterceptionId = js.native
}
object TakeResponseBodyForInterceptionAsStreamRequest {
  
  @scala.inline
  def apply(interceptionId: InterceptionId): TakeResponseBodyForInterceptionAsStreamRequest = {
    val __obj = js.Dynamic.literal(interceptionId = interceptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyForInterceptionAsStreamRequest]
  }
  
  @scala.inline
  implicit class TakeResponseBodyForInterceptionAsStreamRequestOps[Self <: TakeResponseBodyForInterceptionAsStreamRequest] (val x: Self) extends AnyVal {
    
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
    def setInterceptionId(value: InterceptionId): Self = this.set("interceptionId", value.asInstanceOf[js.Any])
  }
}
