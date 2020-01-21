package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColRow extends js.Object {
  var col: Double
  var row: Double
  var sheetName: String
}

object AnonColRow {
  @scala.inline
  def apply(col: Double, row: Double, sheetName: String): AnonColRow = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColRow]
  }
}

