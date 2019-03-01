package typings
package exceljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Col extends js.Object {
  var col: scala.Double
  var row: scala.Double
}

object Anon_Col {
  @scala.inline
  def apply(col: scala.Double, row: scala.Double): Anon_Col = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[Anon_Col]
  }
}

