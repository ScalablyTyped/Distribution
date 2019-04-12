package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMessage
  extends MessageBase
     with Message {
  @JSName("message")
  var message_TextMessage: dialogflowLib.dialogflowLibStrings.text
  var text: Text
}

object TextMessage {
  @scala.inline
  def apply(message: dialogflowLib.dialogflowLibStrings.text, text: Text, platform: Platform = null): TextMessage = {
    val __obj = js.Dynamic.literal(message = message, text = text)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[TextMessage]
  }
}

