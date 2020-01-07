package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a new banded range to the spreadsheet.
  */
@js.native
trait Schema$AddBandingRequest extends js.Object {
  /**
    * The banded range to add. The bandedRangeId field is optional; if one is
    * not set, an id will be randomly generated. (It is an error to specify the
    * ID of a range that already exists.)
    */
  var bandedRange: js.UndefOr[Schema$BandedRange] = js.native
}

object Schema$AddBandingRequest {
  @scala.inline
  def apply(bandedRange: Schema$BandedRange = null): Schema$AddBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddBandingRequest]
  }
}

