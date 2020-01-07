package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Appends rows or columns to the end of a sheet.
  */
@js.native
trait Schema$AppendDimensionRequest extends js.Object {
  /**
    * Whether rows or columns should be appended.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The number of rows or columns to append.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The sheet to append rows or columns to.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object Schema$AppendDimensionRequest {
  @scala.inline
  def apply(dimension: String = null, length: Int | Double = null, sheetId: Int | Double = null): Schema$AppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppendDimensionRequest]
  }
}

