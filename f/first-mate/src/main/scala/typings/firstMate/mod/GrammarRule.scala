package typings.firstMate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrammarRule extends js.Object {
  var contentScopeName: String = js.native
  // https://github.com/atom/first-mate/blob/v7.0.7/src/rule.coffee
  // This is private. Don't go down the rabbit hole.
  var rule: js.Object = js.native
  var scopeName: String = js.native
}

object GrammarRule {
  @scala.inline
  def apply(contentScopeName: String, rule: js.Object, scopeName: String): GrammarRule = {
    val __obj = js.Dynamic.literal(contentScopeName = contentScopeName.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarRule]
  }
  @scala.inline
  implicit class GrammarRuleOps[Self <: GrammarRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentScopeName(value: String): Self = this.set("contentScopeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: js.Object): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeName(value: String): Self = this.set("scopeName", value.asInstanceOf[js.Any])
  }
  
}

