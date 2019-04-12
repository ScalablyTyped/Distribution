package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickRepliesMessage
  extends MessageBase
     with Message {
  @JSName("message")
  var message_QuickRepliesMessage: dialogflowLib.dialogflowLibStrings.quickReplies
  var quickReplies: QuickReplies
}

object QuickRepliesMessage {
  @scala.inline
  def apply(
    message: dialogflowLib.dialogflowLibStrings.quickReplies,
    quickReplies: QuickReplies,
    platform: Platform = null
  ): QuickRepliesMessage = {
    val __obj = js.Dynamic.literal(message = message, quickReplies = quickReplies)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[QuickRepliesMessage]
  }
}

