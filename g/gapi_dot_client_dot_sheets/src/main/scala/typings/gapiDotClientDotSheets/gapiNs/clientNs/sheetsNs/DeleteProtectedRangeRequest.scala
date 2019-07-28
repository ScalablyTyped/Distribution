package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProtectedRangeRequest extends js.Object {
  /** The ID of the protected range to delete. */
  var protectedRangeId: js.UndefOr[Double] = js.undefined
}

object DeleteProtectedRangeRequest {
  @scala.inline
  def apply(protectedRangeId: Int | Double = null): DeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (protectedRangeId != null) __obj.updateDynamic("protectedRangeId")(protectedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectedRangeRequest]
  }
}

