package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetMaxCallStackSizeToCaptureRequest extends js.Object {
  
  var size: integer = js.native
}
object SetMaxCallStackSizeToCaptureRequest {
  
  @scala.inline
  def apply(size: integer): SetMaxCallStackSizeToCaptureRequest = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMaxCallStackSizeToCaptureRequest]
  }
  
  @scala.inline
  implicit class SetMaxCallStackSizeToCaptureRequestOps[Self <: SetMaxCallStackSizeToCaptureRequest] (val x: Self) extends AnyVal {
    
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
    def setSize(value: integer): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
