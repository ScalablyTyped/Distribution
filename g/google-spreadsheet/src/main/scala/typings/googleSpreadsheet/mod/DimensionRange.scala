package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionRange extends js.Object {
  var dimension: Dimension
  var endIndex: Double
  var sheetId: Double
  var startIndex: Double
}

object DimensionRange {
  @scala.inline
  def apply(dimension: Dimension, endIndex: Double, sheetId: Double, startIndex: Double): DimensionRange = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], endIndex = endIndex.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionRange]
  }
}

