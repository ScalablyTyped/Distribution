package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of deleting a conditional format rule.
  */
@js.native
trait Schema$DeleteConditionalFormatRuleResponse extends js.Object {
  /**
    * The rule that was deleted.
    */
  var rule: js.UndefOr[Schema$ConditionalFormatRule] = js.native
}

object Schema$DeleteConditionalFormatRuleResponse {
  @scala.inline
  def apply(rule: Schema$ConditionalFormatRule = null): Schema$DeleteConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteConditionalFormatRuleResponse]
  }
}

