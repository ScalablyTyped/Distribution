package typings.eslint.anon

import typings.eslint.mod.Rule.SuggestionDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Desc extends SuggestionDescriptorMessage {
  var desc: String
}

object Desc {
  @scala.inline
  def apply(desc: String): Desc = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desc]
  }
}

