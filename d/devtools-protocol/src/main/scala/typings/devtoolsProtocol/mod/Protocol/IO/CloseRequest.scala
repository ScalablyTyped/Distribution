package typings.devtoolsProtocol.mod.Protocol.IO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseRequest extends js.Object {
  
  /**
    * Handle of the stream to close.
    */
  var handle: StreamHandle = js.native
}
object CloseRequest {
  
  @scala.inline
  def apply(handle: StreamHandle): CloseRequest = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseRequest]
  }
  
  @scala.inline
  implicit class CloseRequestOps[Self <: CloseRequest] (val x: Self) extends AnyVal {
    
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
    def setHandle(value: StreamHandle): Self = this.set("handle", value.asInstanceOf[js.Any])
  }
}
