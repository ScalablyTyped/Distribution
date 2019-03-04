package typings
package firstDashMateLib.firstDashMateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarRule extends js.Object {
  var contentScopeName: java.lang.String
  // https://github.com/atom/first-mate/blob/v7.0.7/src/rule.coffee
  // This is private. Don't go down the rabbit hole.
  var rule: js.Object
  var scopeName: java.lang.String
}

object GrammarRule {
  @scala.inline
  def apply(contentScopeName: java.lang.String, rule: js.Object, scopeName: java.lang.String): GrammarRule = {
    val __obj = js.Dynamic.literal(contentScopeName = contentScopeName, rule = rule, scopeName = scopeName)
  
    __obj.asInstanceOf[GrammarRule]
  }
}

