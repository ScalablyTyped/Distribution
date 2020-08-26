package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetGridRange extends js.Object {
  var endColumnIndex: Double = js.native
  var endRowIndex: Double = js.native
  var startColumnIndex: Double = js.native
  var startRowIndex: Double = js.native
}

object WorksheetGridRange {
  @scala.inline
  def apply(endColumnIndex: Double, endRowIndex: Double, startColumnIndex: Double, startRowIndex: Double): WorksheetGridRange = {
    val __obj = js.Dynamic.literal(endColumnIndex = endColumnIndex.asInstanceOf[js.Any], endRowIndex = endRowIndex.asInstanceOf[js.Any], startColumnIndex = startColumnIndex.asInstanceOf[js.Any], startRowIndex = startRowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetGridRange]
  }
  @scala.inline
  implicit class WorksheetGridRangeOps[Self <: WorksheetGridRange] (val x: Self) extends AnyVal {
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
    def setEndColumnIndex(value: Double): Self = this.set("endColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndRowIndex(value: Double): Self = this.set("endRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartColumnIndex(value: Double): Self = this.set("startColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartRowIndex(value: Double): Self = this.set("startRowIndex", value.asInstanceOf[js.Any])
  }
  
}

