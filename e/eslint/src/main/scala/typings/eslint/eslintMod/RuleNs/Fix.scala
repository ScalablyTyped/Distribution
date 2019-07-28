package typings.eslint.eslintMod.RuleNs

import typings.eslint.eslintMod.ASTNs.Range
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
    val __obj = js.Dynamic.literal(range = range, text = text)
  
    __obj.asInstanceOf[Fix]
  }
}

