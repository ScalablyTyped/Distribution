package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColRow extends js.Object {
  var col: Double
  var row: Double
  var sheetName: String
}

object Anon_ColRow {
  @scala.inline
  def apply(col: Double, row: Double, sheetName: String): Anon_ColRow = {
    val __obj = js.Dynamic.literal(col = col, row = row, sheetName = sheetName)
  
    __obj.asInstanceOf[Anon_ColRow]
  }
}

