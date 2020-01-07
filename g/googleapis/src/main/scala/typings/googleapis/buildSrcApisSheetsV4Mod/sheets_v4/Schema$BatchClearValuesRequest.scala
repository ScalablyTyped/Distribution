package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for clearing more than one range of values in a spreadsheet.
  */
@js.native
trait Schema$BatchClearValuesRequest extends js.Object {
  /**
    * The ranges to clear, in A1 notation.
    */
  var ranges: js.UndefOr[js.Array[String]] = js.native
}

object Schema$BatchClearValuesRequest {
  @scala.inline
  def apply(ranges: js.Array[String] = null): Schema$BatchClearValuesRequest = {
    val __obj = js.Dynamic.literal()
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchClearValuesRequest]
  }
}

