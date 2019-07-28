package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBandingRequest extends js.Object {
  /** The banded range to update with the new properties. */
  var bandedRange: js.UndefOr[BandedRange] = js.undefined
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `bandedRange` is implied and should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
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

