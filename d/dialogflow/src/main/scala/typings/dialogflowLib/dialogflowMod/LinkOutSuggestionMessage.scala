package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOutSuggestionMessage
  extends MessageBase
     with Message {
  var linkOutSuggestion: LinkOutSuggestion
  @JSName("message")
  var message_LinkOutSuggestionMessage: dialogflowLib.dialogflowLibStrings.linkOutSuggestion
}

object LinkOutSuggestionMessage {
  @scala.inline
  def apply(
    linkOutSuggestion: LinkOutSuggestion,
    message: dialogflowLib.dialogflowLibStrings.linkOutSuggestion,
    platform: Platform = null
  ): LinkOutSuggestionMessage = {
    val __obj = js.Dynamic.literal(linkOutSuggestion = linkOutSuggestion, message = message)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[LinkOutSuggestionMessage]
  }
}

