package typings.eslint.mod.Linter

import typings.eslint.mod.Rule.Fix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintSuggestion extends js.Object {
  var desc: String
  var fix: Fix
  var messageId: js.UndefOr[String] = js.undefined
}

object LintSuggestion {
  @scala.inline
  def apply(desc: String, fix: Fix, messageId: String = null): LintSuggestion = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintSuggestion]
  }
}

