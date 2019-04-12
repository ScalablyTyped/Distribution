package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleResponsesMessage
  extends MessageBase
     with Message {
  @JSName("message")
  var message_SimpleResponsesMessage: dialogflowLib.dialogflowLibStrings.simpleResponses
  var simpleResponses: SimpleResponses
}

object SimpleResponsesMessage {
  @scala.inline
  def apply(
    message: dialogflowLib.dialogflowLibStrings.simpleResponses,
    simpleResponses: SimpleResponses,
    platform: Platform = null
  ): SimpleResponsesMessage = {
    val __obj = js.Dynamic.literal(message = message, simpleResponses = simpleResponses)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[SimpleResponsesMessage]
  }
}

