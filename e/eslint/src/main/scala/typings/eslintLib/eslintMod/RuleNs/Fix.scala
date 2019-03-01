package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fix extends js.Object {
  var range: eslintLib.eslintMod.ASTNs.Range
  var text: java.lang.String
}

object Fix {
  @scala.inline
  def apply(range: eslintLib.eslintMod.ASTNs.Range, text: java.lang.String): Fix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Fix]
  }
}

