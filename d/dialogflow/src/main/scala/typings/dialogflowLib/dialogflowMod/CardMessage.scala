package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMessage
  extends MessageBase
     with Message {
  var card: Card
  @JSName("message")
  var message_CardMessage: dialogflowLib.dialogflowLibStrings.card
}

object CardMessage {
  @scala.inline
  def apply(card: Card, message: dialogflowLib.dialogflowLibStrings.card, platform: Platform = null): CardMessage = {
    val __obj = js.Dynamic.literal(card = card, message = message)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[CardMessage]
  }
}

