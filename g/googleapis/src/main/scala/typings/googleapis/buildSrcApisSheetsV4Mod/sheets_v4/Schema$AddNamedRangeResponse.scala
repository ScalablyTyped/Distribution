package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a named range.
  */
@js.native
trait Schema$AddNamedRangeResponse extends js.Object {
  /**
    * The named range to add.
    */
  var namedRange: js.UndefOr[Schema$NamedRange] = js.native
}

object Schema$AddNamedRangeResponse {
  @scala.inline
  def apply(namedRange: Schema$NamedRange = null): Schema$AddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (namedRange != null) __obj.updateDynamic("namedRange")(namedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddNamedRangeResponse]
  }
}

