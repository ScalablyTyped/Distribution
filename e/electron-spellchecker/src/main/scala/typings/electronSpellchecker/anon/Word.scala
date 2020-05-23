package typings.electronSpellchecker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Word extends js.Object {
  var word: String
}

object Word {
  @scala.inline
  def apply(word: String): Word = {
    val __obj = js.Dynamic.literal(word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Word]
  }
}

