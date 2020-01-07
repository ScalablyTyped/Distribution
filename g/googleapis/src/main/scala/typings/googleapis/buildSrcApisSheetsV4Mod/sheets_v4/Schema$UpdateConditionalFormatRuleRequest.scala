package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates a conditional format rule at the given index, or moves a
  * conditional format rule to another index.
  */
@js.native
trait Schema$UpdateConditionalFormatRuleRequest extends js.Object {
  /**
    * The zero-based index of the rule that should be replaced or moved.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The zero-based new index the rule should end up at.
    */
  var newIndex: js.UndefOr[Double] = js.native
  /**
    * The rule that should replace the rule at the given index.
    */
  var rule: js.UndefOr[Schema$ConditionalFormatRule] = js.native
  /**
    * The sheet of the rule to move.  Required if new_index is set, unused
    * otherwise.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object Schema$UpdateConditionalFormatRuleRequest {
  @scala.inline
  def apply(
    index: Int | Double = null,
    newIndex: Int | Double = null,
    rule: Schema$ConditionalFormatRule = null,
    sheetId: Int | Double = null
  ): Schema$UpdateConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateConditionalFormatRuleRequest]
  }
}

