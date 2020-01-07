package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a new conditional format rule at the given index. All subsequent
  * rules&#39; indexes are incremented.
  */
@js.native
trait Schema$AddConditionalFormatRuleRequest extends js.Object {
  /**
    * The zero-based index where the rule should be inserted.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The rule to add.
    */
  var rule: js.UndefOr[Schema$ConditionalFormatRule] = js.native
}

object Schema$AddConditionalFormatRuleRequest {
  @scala.inline
  def apply(index: Int | Double = null, rule: Schema$ConditionalFormatRule = null): Schema$AddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddConditionalFormatRuleRequest]
  }
}

