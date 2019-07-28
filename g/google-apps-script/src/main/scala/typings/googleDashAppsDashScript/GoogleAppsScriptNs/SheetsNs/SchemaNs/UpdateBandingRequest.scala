package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBandingRequest extends js.Object {
  var bandedRange: js.UndefOr[BandedRange] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
}

object UpdateBandingRequest {
  @scala.inline
  def apply(bandedRange: BandedRange = null, fields: String = null): UpdateBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[UpdateBandingRequest]
  }
}

