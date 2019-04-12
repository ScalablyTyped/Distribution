package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSelectMessage
  extends MessageBase
     with Message {
  var listSelect: ListSelect
  @JSName("message")
  var message_ListSelectMessage: dialogflowLib.dialogflowLibStrings.listSelect
}

object ListSelectMessage {
  @scala.inline
  def apply(
    listSelect: ListSelect,
    message: dialogflowLib.dialogflowLibStrings.listSelect,
    platform: Platform = null
  ): ListSelectMessage = {
    val __obj = js.Dynamic.literal(listSelect = listSelect, message = message)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[ListSelectMessage]
  }
}

