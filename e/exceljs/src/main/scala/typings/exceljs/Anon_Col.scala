package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Col extends js.Object {
  var col: Double
  var row: Double
}

object Anon_Col {
  @scala.inline
  def apply(col: Double, row: Double): Anon_Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Col]
  }
}

