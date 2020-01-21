package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateFilterViewRequest extends js.Object {
  var filterId: js.UndefOr[Double] = js.undefined
}

object DuplicateFilterViewRequest {
  @scala.inline
  def apply(filterId: Int | Double = null): DuplicateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateFilterViewRequest]
  }
}

