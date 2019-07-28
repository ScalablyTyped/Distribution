package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomizeRangeRequest extends js.Object {
  /** The range to randomize. */
  var range: js.UndefOr[GridRange] = js.undefined
}

object RandomizeRangeRequest {
  @scala.inline
  def apply(range: GridRange = null): RandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[RandomizeRangeRequest]
  }
}

