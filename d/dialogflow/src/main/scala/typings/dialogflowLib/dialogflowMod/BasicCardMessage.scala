package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicCardMessage
  extends MessageBase
     with Message {
  var basicCard: BasicCard
  @JSName("message")
  var message_BasicCardMessage: dialogflowLib.dialogflowLibStrings.basicCard
}

object BasicCardMessage {
  @scala.inline
  def apply(
    basicCard: BasicCard,
    message: dialogflowLib.dialogflowLibStrings.basicCard,
    platform: Platform = null
  ): BasicCardMessage = {
    val __obj = js.Dynamic.literal(basicCard = basicCard, message = message)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[BasicCardMessage]
  }
}

