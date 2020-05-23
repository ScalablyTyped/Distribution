package typings.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.anon.Desc
  - typings.eslint.anon.MessageId
*/
trait SuggestionDescriptorMessage extends js.Object

object SuggestionDescriptorMessage {
  @scala.inline
  def Desc(desc: String): SuggestionDescriptorMessage = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionDescriptorMessage]
  }
  @scala.inline
  def MessageId(messageId: String): SuggestionDescriptorMessage = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionDescriptorMessage]
  }
}

