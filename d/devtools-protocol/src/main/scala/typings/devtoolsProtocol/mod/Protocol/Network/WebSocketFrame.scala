package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketFrame extends js.Object {
  
  /**
    * WebSocket message mask.
    */
  var mask: Boolean = js.native
  
  /**
    * WebSocket message opcode.
    */
  var opcode: Double = js.native
  
  /**
    * WebSocket message payload data.
    * If the opcode is 1, this is a text message and payloadData is a UTF-8 string.
    * If the opcode isn't 1, then payloadData is a base64 encoded string representing binary data.
    */
  var payloadData: String = js.native
}
object WebSocketFrame {
  
  @scala.inline
  def apply(mask: Boolean, opcode: Double, payloadData: String): WebSocketFrame = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], payloadData = payloadData.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketFrame]
  }
  
  @scala.inline
  implicit class WebSocketFrameOps[Self <: WebSocketFrame] (val x: Self) extends AnyVal {
    
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
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpcode(value: Double): Self = this.set("opcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadData(value: String): Self = this.set("payloadData", value.asInstanceOf[js.Any])
  }
}
