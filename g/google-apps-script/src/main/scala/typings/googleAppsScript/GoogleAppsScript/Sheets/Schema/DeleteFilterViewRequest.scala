package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFilterViewRequest extends js.Object {
  var filterId: js.UndefOr[Double] = js.undefined
}

object DeleteFilterViewRequest {
  @scala.inline
  def apply(filterId: js.UndefOr[Double] = js.undefined): DeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterId)) __obj.updateDynamic("filterId")(filterId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterViewRequest]
  }
}

