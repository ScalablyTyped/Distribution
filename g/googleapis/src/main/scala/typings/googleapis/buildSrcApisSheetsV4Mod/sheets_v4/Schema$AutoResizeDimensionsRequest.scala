package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Automatically resizes one or more dimensions based on the contents of the
  * cells in that dimension.
  */
@js.native
trait Schema$AutoResizeDimensionsRequest extends js.Object {
  /**
    * The dimensions to automatically resize.
    */
  var dimensions: js.UndefOr[Schema$DimensionRange] = js.native
}

object Schema$AutoResizeDimensionsRequest {
  @scala.inline
  def apply(dimensions: Schema$DimensionRange = null): Schema$AutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoResizeDimensionsRequest]
  }
}

