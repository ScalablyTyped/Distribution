package typings
package eslintLib.eslintMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixReport extends js.Object {
  var fixed: scala.Boolean
  var messages: js.Array[LintMessage]
  var output: java.lang.String
}

object FixReport {
  @scala.inline
  def apply(fixed: scala.Boolean, messages: js.Array[LintMessage], output: java.lang.String): FixReport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fixed")(fixed)
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[FixReport]
  }
}

