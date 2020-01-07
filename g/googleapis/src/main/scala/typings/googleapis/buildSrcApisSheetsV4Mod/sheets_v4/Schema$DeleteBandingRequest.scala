package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes the banded range with the given ID from the spreadsheet.
  */
@js.native
trait Schema$DeleteBandingRequest extends js.Object {
  /**
    * The ID of the banded range to delete.
    */
  var bandedRangeId: js.UndefOr[Double] = js.native
}

object Schema$DeleteBandingRequest {
  @scala.inline
  def apply(bandedRangeId: Int | Double = null): Schema$DeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (bandedRangeId != null) __obj.updateDynamic("bandedRangeId")(bandedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteBandingRequest]
  }
}

