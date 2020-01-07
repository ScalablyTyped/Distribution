package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a banded range.
  */
@js.native
trait Schema$AddBandingResponse extends js.Object {
  /**
    * The banded range that was added.
    */
  var bandedRange: js.UndefOr[Schema$BandedRange] = js.native
}

object Schema$AddBandingResponse {
  @scala.inline
  def apply(bandedRange: Schema$BandedRange = null): Schema$AddBandingResponse = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddBandingResponse]
  }
}

