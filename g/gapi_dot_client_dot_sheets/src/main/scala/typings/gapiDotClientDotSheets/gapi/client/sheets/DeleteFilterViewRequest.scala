package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFilterViewRequest extends js.Object {
  /** The ID of the filter to delete. */
  var filterId: js.UndefOr[Double] = js.undefined
}

object DeleteFilterViewRequest {
  @scala.inline
  def apply(filterId: Int | Double = null): DeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterViewRequest]
  }
}

