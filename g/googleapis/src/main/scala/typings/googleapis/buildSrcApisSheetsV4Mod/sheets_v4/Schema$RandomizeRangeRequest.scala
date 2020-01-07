package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Randomizes the order of the rows in a range.
  */
@js.native
trait Schema$RandomizeRangeRequest extends js.Object {
  /**
    * The range to randomize.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
}

object Schema$RandomizeRangeRequest {
  @scala.inline
  def apply(range: Schema$GridRange = null): Schema$RandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RandomizeRangeRequest]
  }
}

