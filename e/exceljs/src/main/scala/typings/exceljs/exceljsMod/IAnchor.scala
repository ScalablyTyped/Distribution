package typings.exceljs.exceljsMod

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
    val __obj = js.Dynamic.literal(col = col, nativeCol = nativeCol, nativeColOff = nativeColOff, nativeRow = nativeRow, nativeRowOff = nativeRowOff, row = row)
  
    __obj.asInstanceOf[IAnchor]
  }
}

