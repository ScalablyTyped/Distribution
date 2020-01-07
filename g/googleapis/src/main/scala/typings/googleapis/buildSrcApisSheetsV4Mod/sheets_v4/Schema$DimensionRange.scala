package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range along a single dimension on a sheet. All indexes are zero-based.
  * Indexes are half open: the start index is inclusive and the end index is
  * exclusive. Missing indexes indicate the range is unbounded on that side.
  */
@js.native
trait Schema$DimensionRange extends js.Object {
  /**
    * The dimension of the span.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The end (exclusive) of the span, or not set if unbounded.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The sheet this span is on.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * The start (inclusive) of the span, or not set if unbounded.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object Schema$DimensionRange {
  @scala.inline
  def apply(
    dimension: String = null,
    endIndex: Int | Double = null,
    sheetId: Int | Double = null,
    startIndex: Int | Double = null
  ): Schema$DimensionRange = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DimensionRange]
  }
}

