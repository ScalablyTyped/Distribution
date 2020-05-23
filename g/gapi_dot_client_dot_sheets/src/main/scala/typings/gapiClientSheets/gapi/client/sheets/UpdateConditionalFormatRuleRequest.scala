package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConditionalFormatRuleRequest extends js.Object {
  /** The zero-based index of the rule that should be replaced or moved. */
  var index: js.UndefOr[Double] = js.undefined
  /** The zero-based new index the rule should end up at. */
  var newIndex: js.UndefOr[Double] = js.undefined
  /** The rule that should replace the rule at the given index. */
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
  /**
    * The sheet of the rule to move.  Required if new_index is set,
    * unused otherwise.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
}

object UpdateConditionalFormatRuleRequest {
  @scala.inline
  def apply(
    index: js.UndefOr[Double] = js.undefined,
    newIndex: js.UndefOr[Double] = js.undefined,
    rule: ConditionalFormatRule = null,
    sheetId: js.UndefOr[Double] = js.undefined
  ): UpdateConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newIndex)) __obj.updateDynamic("newIndex")(newIndex.get.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConditionalFormatRuleRequest]
  }
}

