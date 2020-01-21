package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddNamedRangeRequest extends js.Object {
  /**
    * The named range to add. The namedRangeId
    * field is optional; if one is not set, an id will be randomly generated. (It
    * is an error to specify the ID of a range that already exists.)
    */
  var namedRange: js.UndefOr[NamedRange] = js.undefined
}

object AddNamedRangeRequest {
  @scala.inline
  def apply(namedRange: NamedRange = null): AddNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (namedRange != null) __obj.updateDynamic("namedRange")(namedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNamedRangeRequest]
  }
}

