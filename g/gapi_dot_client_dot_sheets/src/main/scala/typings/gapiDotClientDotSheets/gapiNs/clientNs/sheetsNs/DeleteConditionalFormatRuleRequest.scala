package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConditionalFormatRuleRequest extends js.Object {
  /** The zero-based index of the rule to be deleted. */
  var index: js.UndefOr[Double] = js.undefined
  /** The sheet the rule is being deleted from. */
  var sheetId: js.UndefOr[Double] = js.undefined
}

object DeleteConditionalFormatRuleRequest {
  @scala.inline
  def apply(index: Int | Double = null, sheetId: Int | Double = null): DeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConditionalFormatRuleRequest]
  }
}

