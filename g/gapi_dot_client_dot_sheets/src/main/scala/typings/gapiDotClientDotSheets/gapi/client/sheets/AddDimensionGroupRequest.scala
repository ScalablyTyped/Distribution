package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDimensionGroupRequest extends js.Object {
  /** The range over which to create a group. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object AddDimensionGroupRequest {
  @scala.inline
  def apply(range: DimensionRange = null): AddDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AddDimensionGroupRequest]
  }
}

