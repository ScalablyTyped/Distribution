package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBandingRequest extends js.Object {
  /** The ID of the banded range to delete. */
  var bandedRangeId: js.UndefOr[Double] = js.undefined
}

object DeleteBandingRequest {
  @scala.inline
  def apply(bandedRangeId: Int | Double = null): DeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (bandedRangeId != null) __obj.updateDynamic("bandedRangeId")(bandedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBandingRequest]
  }
}

