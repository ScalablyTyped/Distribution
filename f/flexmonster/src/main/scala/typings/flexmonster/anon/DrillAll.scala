package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillAll extends js.Object {
  var columns: js.UndefOr[js.Array[Measure]] = js.native
  var drillAll: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[js.Array[Measure]] = js.native
}

object DrillAll {
  @scala.inline
  def apply(): DrillAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillAll]
  }
  @scala.inline
  implicit class DrillAllOps[Self <: DrillAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: Measure*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Measure]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDrillAll(value: Boolean): Self = this.set("drillAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillAll: Self = this.set("drillAll", js.undefined)
    @scala.inline
    def setRowsVarargs(value: Measure*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[Measure]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

