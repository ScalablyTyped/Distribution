package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateFilterViewRequest extends js.Object {
  /** The ID of the filter being duplicated. */
  var filterId: js.UndefOr[Double] = js.undefined
}

object DuplicateFilterViewRequest {
  @scala.inline
  def apply(filterId: js.UndefOr[Double] = js.undefined): DuplicateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterId)) __obj.updateDynamic("filterId")(filterId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateFilterViewRequest]
  }
}

