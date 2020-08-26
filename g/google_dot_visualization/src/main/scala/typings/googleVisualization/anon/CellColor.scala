package typings.googleVisualization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellColor extends js.Object {
  var cellColor: js.Object = js.native
  var cellSize: Double = js.native
  var dayOfWeekLabel: js.Object = js.native
  var dayOfWeekRightSpace: Double = js.native
  var daysOfWeek: String = js.native
  var focusedCellColor: js.Object = js.native
  var monthLabel: js.Object = js.native
  var monthOutlineColor: js.Object = js.native
  var underMonthSpace: Double = js.native
  var underYearSpace: Double = js.native
  var unusedMonthOutlineColor: js.Object = js.native
}

object CellColor {
  @scala.inline
  def apply(
    cellColor: js.Object,
    cellSize: Double,
    dayOfWeekLabel: js.Object,
    dayOfWeekRightSpace: Double,
    daysOfWeek: String,
    focusedCellColor: js.Object,
    monthLabel: js.Object,
    monthOutlineColor: js.Object,
    underMonthSpace: Double,
    underYearSpace: Double,
    unusedMonthOutlineColor: js.Object
  ): CellColor = {
    val __obj = js.Dynamic.literal(cellColor = cellColor.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any], dayOfWeekLabel = dayOfWeekLabel.asInstanceOf[js.Any], dayOfWeekRightSpace = dayOfWeekRightSpace.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], focusedCellColor = focusedCellColor.asInstanceOf[js.Any], monthLabel = monthLabel.asInstanceOf[js.Any], monthOutlineColor = monthOutlineColor.asInstanceOf[js.Any], underMonthSpace = underMonthSpace.asInstanceOf[js.Any], underYearSpace = underYearSpace.asInstanceOf[js.Any], unusedMonthOutlineColor = unusedMonthOutlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellColor]
  }
  @scala.inline
  implicit class CellColorOps[Self <: CellColor] (val x: Self) extends AnyVal {
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
    def setCellColor(value: js.Object): Self = this.set("cellColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellSize(value: Double): Self = this.set("cellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayOfWeekLabel(value: js.Object): Self = this.set("dayOfWeekLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayOfWeekRightSpace(value: Double): Self = this.set("dayOfWeekRightSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaysOfWeek(value: String): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedCellColor(value: js.Object): Self = this.set("focusedCellColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthLabel(value: js.Object): Self = this.set("monthLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthOutlineColor(value: js.Object): Self = this.set("monthOutlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderMonthSpace(value: Double): Self = this.set("underMonthSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderYearSpace(value: Double): Self = this.set("underYearSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnusedMonthOutlineColor(value: js.Object): Self = this.set("unusedMonthOutlineColor", value.asInstanceOf[js.Any])
  }
  
}

