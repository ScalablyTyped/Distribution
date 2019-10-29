package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowBreak extends js.Object {
  var id: Double
  var man: Double
  var max: Double
  var min: Double
}

object RowBreak {
  @scala.inline
  def apply(id: Double, man: Double, max: Double, min: Double): RowBreak = {
    val __obj = js.Dynamic.literal(id = id, man = man, max = max, min = min)
  
    __obj.asInstanceOf[RowBreak]
  }
}

