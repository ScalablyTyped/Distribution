package typings.exceljs.mod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], man = man.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowBreak]
  }
}

