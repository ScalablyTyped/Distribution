package typings.electronSpellchecker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWord extends js.Object {
  var word: String
}

object AnonWord {
  @scala.inline
  def apply(word: String): AnonWord = {
    val __obj = js.Dynamic.literal(word = word.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWord]
  }
}

