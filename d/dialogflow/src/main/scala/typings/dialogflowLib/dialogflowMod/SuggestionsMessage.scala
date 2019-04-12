package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsMessage
  extends MessageBase
     with Message {
  @JSName("message")
  var message_SuggestionsMessage: dialogflowLib.dialogflowLibStrings.suggestions
  var suggestions: Suggestions
}

object SuggestionsMessage {
  @scala.inline
  def apply(
    message: dialogflowLib.dialogflowLibStrings.suggestions,
    suggestions: Suggestions,
    platform: Platform = null
  ): SuggestionsMessage = {
    val __obj = js.Dynamic.literal(message = message, suggestions = suggestions)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[SuggestionsMessage]
  }
}

