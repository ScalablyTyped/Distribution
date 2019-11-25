package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddBandingResponse extends js.Object {
  /** The banded range that was added. */
  var bandedRange: js.UndefOr[BandedRange] = js.undefined
}

object AddBandingResponse {
  @scala.inline
  def apply(bandedRange: BandedRange = null): AddBandingResponse = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddBandingResponse]
  }
}

