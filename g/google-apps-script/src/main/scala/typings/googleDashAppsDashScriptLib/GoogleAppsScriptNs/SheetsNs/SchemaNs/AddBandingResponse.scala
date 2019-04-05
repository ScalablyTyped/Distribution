package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddBandingResponse extends js.Object {
  var bandedRange: js.UndefOr[BandedRange] = js.undefined
}

object AddBandingResponse {
  @scala.inline
  def apply(bandedRange: BandedRange = null): AddBandingResponse = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange)
    __obj.asInstanceOf[AddBandingResponse]
  }
}

