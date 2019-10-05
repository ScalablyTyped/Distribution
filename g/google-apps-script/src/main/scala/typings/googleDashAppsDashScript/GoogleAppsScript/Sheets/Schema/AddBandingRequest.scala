package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddBandingRequest extends js.Object {
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

