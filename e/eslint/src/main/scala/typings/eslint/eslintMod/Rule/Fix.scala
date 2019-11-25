package typings.eslint.eslintMod.Rule

import typings.eslint.eslintMod.AST.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fix extends js.Object {
  var range: Range
  var text: String
}

object Fix {
  @scala.inline
  def apply(range: Range, text: String): Fix = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Fix]
  }
}

