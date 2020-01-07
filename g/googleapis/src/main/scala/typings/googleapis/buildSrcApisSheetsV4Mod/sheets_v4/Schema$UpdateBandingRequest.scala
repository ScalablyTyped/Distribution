package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of the supplied banded range.
  */
@js.native
trait Schema$UpdateBandingRequest extends js.Object {
  /**
    * The banded range to update with the new properties.
    */
  var bandedRange: js.UndefOr[Schema$BandedRange] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `bandedRange` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object Schema$UpdateBandingRequest {
  @scala.inline
  def apply(bandedRange: Schema$BandedRange = null, fields: String = null): Schema$UpdateBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateBandingRequest]
  }
}

