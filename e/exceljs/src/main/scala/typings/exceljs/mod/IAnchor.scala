package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnchor extends js.Object {
  var col: Double
  var nativeCol: Double
  var nativeColOff: Double
  var nativeRow: Double
  var nativeRowOff: Double
  var row: Double
}

object IAnchor {
  @scala.inline
  def apply(
    col: Double,
    nativeCol: Double,
    nativeColOff: Double,
    nativeRow: Double,
    nativeRowOff: Double,
    row: Double
  ): IAnchor = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], nativeCol = nativeCol.asInstanceOf[js.Any], nativeColOff = nativeColOff.asInstanceOf[js.Any], nativeRow = nativeRow.asInstanceOf[js.Any], nativeRowOff = nativeRowOff.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAnchor]
  }
}

