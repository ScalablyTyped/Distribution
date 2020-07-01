package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellStats extends js.Object {
  var loaded: Double
  var nonEmpty: Double
  var total: Double
}

object CellStats {
  @scala.inline
  def apply(loaded: Double, nonEmpty: Double, total: Double): CellStats = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellStats]
  }
}

