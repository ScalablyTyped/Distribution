package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the dimensions from the sheet.
  */
@js.native
trait Schema$DeleteDimensionRequest extends js.Object {
  /**
    * The dimensions to delete from the sheet.
    */
  var range: js.UndefOr[Schema$DimensionRange] = js.native
}

object Schema$DeleteDimensionRequest {
  @scala.inline
  def apply(range: Schema$DimensionRange = null): Schema$DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteDimensionRequest]
  }
}

