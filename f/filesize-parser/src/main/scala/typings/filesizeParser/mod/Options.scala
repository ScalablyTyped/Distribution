package typings.filesizeParser.mod

import typings.filesizeParser.filesizeParserNumbers.`10`
import typings.filesizeParser.filesizeParserNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var base: `2` | `10`
}

object Options {
  @scala.inline
  def apply(base: `2` | `10`): Options = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

