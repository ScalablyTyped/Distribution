package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableRequest extends js.Object {
  
  /**
    * Longest post body size (in bytes) that would be included in requestWillBeSent notification
    */
  var maxPostDataSize: js.UndefOr[integer] = js.native
  
  /**
    * Per-resource buffer size in bytes to use when preserving network payloads (XHRs, etc).
    */
  var maxResourceBufferSize: js.UndefOr[integer] = js.native
  
  /**
    * Buffer size in bytes to use when preserving network payloads (XHRs, etc).
    */
  var maxTotalBufferSize: js.UndefOr[integer] = js.native
}
object EnableRequest {
  
  @scala.inline
  def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  
  @scala.inline
  implicit class EnableRequestOps[Self <: EnableRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxPostDataSize(value: integer): Self = this.set("maxPostDataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPostDataSize: Self = this.set("maxPostDataSize", js.undefined)
    
    @scala.inline
    def setMaxResourceBufferSize(value: integer): Self = this.set("maxResourceBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResourceBufferSize: Self = this.set("maxResourceBufferSize", js.undefined)
    
    @scala.inline
    def setMaxTotalBufferSize(value: integer): Self = this.set("maxTotalBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTotalBufferSize: Self = this.set("maxTotalBufferSize", js.undefined)
  }
}
