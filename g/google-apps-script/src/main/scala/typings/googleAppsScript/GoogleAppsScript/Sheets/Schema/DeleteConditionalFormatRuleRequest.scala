package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConditionalFormatRuleRequest extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
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

