package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketFrame extends StObject {
  
  /**
    * WebSocket message mask.
    */
  var mask: Boolean
  
  /**
    * WebSocket message opcode.
    */
  var opcode: Double
  
  /**
    * WebSocket message payload data.
    * If the opcode is 1, this is a text message and payloadData is a UTF-8 string.
    * If the opcode isn't 1, then payloadData is a base64 encoded string representing binary data.
    */
  var payloadData: String
}
object WebSocketFrame {
  
  @scala.inline
  def apply(mask: Boolean, opcode: Double, payloadData: String): WebSocketFrame = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], payloadData = payloadData.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketFrame]
  }
  
  @scala.inline
  implicit class WebSocketFrameMutableBuilder[Self <: WebSocketFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpcode(value: Double): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadData(value: String): Self = StObject.set(x, "payloadData", value.asInstanceOf[js.Any])
  }
}
