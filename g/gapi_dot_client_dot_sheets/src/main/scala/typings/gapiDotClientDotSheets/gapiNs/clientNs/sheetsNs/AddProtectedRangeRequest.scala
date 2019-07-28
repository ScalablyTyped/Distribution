package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddProtectedRangeRequest extends js.Object {
  /**
    * The protected range to be added. The
    * protectedRangeId field is optional; if
    * one is not set, an id will be randomly generated. (It is an error to
    * specify the ID of a range that already exists.)
    */
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}

object AddProtectedRangeRequest {
  @scala.inline
  def apply(protectedRange: ProtectedRange = null): AddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange)
    __obj.asInstanceOf[AddProtectedRangeRequest]
  }
}

