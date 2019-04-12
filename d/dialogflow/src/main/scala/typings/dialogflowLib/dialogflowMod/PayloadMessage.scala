package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadMessage
  extends MessageBase
     with Message {
  @JSName("message")
  var message_PayloadMessage: dialogflowLib.dialogflowLibStrings.payload
  var payload: js.Any
}

object PayloadMessage {
  @scala.inline
  def apply(message: dialogflowLib.dialogflowLibStrings.payload, payload: js.Any, platform: Platform = null): PayloadMessage = {
    val __obj = js.Dynamic.literal(message = message, payload = payload)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[PayloadMessage]
  }
}

