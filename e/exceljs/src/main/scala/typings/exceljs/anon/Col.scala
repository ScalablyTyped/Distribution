package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Col extends js.Object {
  var col: Double
  var row: Double
}

object Col {
  @scala.inline
  def apply(col: Double, row: Double): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
}

