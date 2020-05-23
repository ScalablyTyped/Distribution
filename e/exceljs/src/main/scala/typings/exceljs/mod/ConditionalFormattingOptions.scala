package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalFormattingOptions extends js.Object {
  var ref: String
  var rules: js.Array[ConditionalFormattingRule]
}

object ConditionalFormattingOptions {
  @scala.inline
  def apply(ref: String, rules: js.Array[ConditionalFormattingRule]): ConditionalFormattingOptions = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingOptions]
  }
}

