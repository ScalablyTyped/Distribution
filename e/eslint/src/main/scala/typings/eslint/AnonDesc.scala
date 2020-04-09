package typings.eslint

import typings.eslint.mod.Rule.SuggestionDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDesc extends SuggestionDescriptorMessage {
  var desc: String
}

object AnonDesc {
  @scala.inline
  def apply(desc: String): AnonDesc = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDesc]
  }
}

