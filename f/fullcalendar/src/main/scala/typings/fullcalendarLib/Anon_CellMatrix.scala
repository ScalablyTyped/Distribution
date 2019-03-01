package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellMatrix extends js.Object {
  var cellMatrix: js.Array[_]
  var row: js.Any
  var segLevels: js.Array[_]
  var segMatrix: js.Array[_]
  var segs: js.Any
  var tbodyEl: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery
}

object Anon_CellMatrix {
  @scala.inline
  def apply(
    cellMatrix: js.Array[_],
    row: js.Any,
    segLevels: js.Array[_],
    segMatrix: js.Array[_],
    segs: js.Any,
    tbodyEl: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery
  ): Anon_CellMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellMatrix")(cellMatrix)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("segLevels")(segLevels)
    __obj.updateDynamic("segMatrix")(segMatrix)
    __obj.updateDynamic("segs")(segs)
    __obj.updateDynamic("tbodyEl")(tbodyEl)
    __obj.asInstanceOf[Anon_CellMatrix]
  }
}

