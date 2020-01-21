package typings.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixReport extends js.Object {
  var fixed: Boolean
  var messages: js.Array[LintMessage]
  var output: String
}

object FixReport {
  @scala.inline
  def apply(fixed: Boolean, messages: js.Array[LintMessage], output: String): FixReport = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FixReport]
  }
}

