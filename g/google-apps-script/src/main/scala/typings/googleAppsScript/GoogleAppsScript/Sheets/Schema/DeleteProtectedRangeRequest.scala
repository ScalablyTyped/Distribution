package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProtectedRangeRequest extends js.Object {
  var protectedRangeId: js.UndefOr[Double] = js.undefined
}

object DeleteProtectedRangeRequest {
  @scala.inline
  def apply(protectedRangeId: js.UndefOr[Double] = js.undefined): DeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(protectedRangeId)) __obj.updateDynamic("protectedRangeId")(protectedRangeId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectedRangeRequest]
  }
}

