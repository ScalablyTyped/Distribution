package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBandingRequest extends js.Object {
  /** The ID of the banded range to delete. */
  var bandedRangeId: js.UndefOr[Double] = js.undefined
}

object DeleteBandingRequest {
  @scala.inline
  def apply(bandedRangeId: js.UndefOr[Double] = js.undefined): DeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bandedRangeId)) __obj.updateDynamic("bandedRangeId")(bandedRangeId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBandingRequest]
  }
}

