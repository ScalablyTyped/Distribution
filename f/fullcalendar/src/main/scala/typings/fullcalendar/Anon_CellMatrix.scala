package typings.fullcalendar

import typings.fullcalendar.srcTypesJqueryDashHooksMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellMatrix extends js.Object {
  var cellMatrix: js.Array[_]
  var row: js.Any
  var segLevels: js.Array[_]
  var segMatrix: js.Array[_]
  var segs: js.Any
  var tbodyEl: JQuery
}

object Anon_CellMatrix {
  @scala.inline
  def apply(
    cellMatrix: js.Array[_],
    row: js.Any,
    segLevels: js.Array[_],
    segMatrix: js.Array[_],
    segs: js.Any,
    tbodyEl: JQuery
  ): Anon_CellMatrix = {
    val __obj = js.Dynamic.literal(cellMatrix = cellMatrix, row = row, segLevels = segLevels, segMatrix = segMatrix, segs = segs, tbodyEl = tbodyEl)
  
    __obj.asInstanceOf[Anon_CellMatrix]
  }
}

