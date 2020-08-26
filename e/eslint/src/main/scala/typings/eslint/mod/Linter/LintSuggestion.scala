package typings.eslint.mod.Linter

import typings.eslint.mod.Rule.Fix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintSuggestion extends js.Object {
  var desc: String = js.native
  var fix: Fix = js.native
  var messageId: js.UndefOr[String] = js.native
}

object LintSuggestion {
  @scala.inline
  def apply(desc: String, fix: Fix): LintSuggestion = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintSuggestion]
  }
  @scala.inline
  implicit class LintSuggestionOps[Self <: LintSuggestion] (val x: Self) extends AnyVal {
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def setFix(value: Fix): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
  
}

