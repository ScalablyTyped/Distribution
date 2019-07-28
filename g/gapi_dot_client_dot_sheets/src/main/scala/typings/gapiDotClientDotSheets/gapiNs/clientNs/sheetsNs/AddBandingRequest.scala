package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddBandingRequest extends js.Object {
  /**
    * The banded range to add. The bandedRangeId
    * field is optional; if one is not set, an id will be randomly generated. (It
    * is an error to specify the ID of a range that already exists.)
    */
  var bandedRange: js.UndefOr[BandedRange] = js.undefined
}

object AddBandingRequest {
  @scala.inline
  def apply(bandedRange: BandedRange = null): AddBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange)
    __obj.asInstanceOf[AddBandingRequest]
  }
}

