package typings.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.AnonDesc
  - typings.eslint.AnonMessageId
*/
trait SuggestionDescriptorMessage extends js.Object

object SuggestionDescriptorMessage {
  @scala.inline
  def AnonDesc(desc: String): SuggestionDescriptorMessage = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionDescriptorMessage]
  }
  @scala.inline
  def AnonMessageId(messageId: String): SuggestionDescriptorMessage = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionDescriptorMessage]
  }
}

