package typings.gapiClientSheets.gapi.client.sheets

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
  def apply(index: js.UndefOr[Double] = js.undefined, sheetId: js.UndefOr[Double] = js.undefined): DeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConditionalFormatRuleRequest]
  }
}

