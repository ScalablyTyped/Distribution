package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRange extends js.Object {
  var endColumnIndex: js.UndefOr[Double] = js.native
  var endRowIndex: js.UndefOr[Double] = js.native
  var sheetId: js.UndefOr[Double] = js.native
  var startColumnIndex: js.UndefOr[Double] = js.native
  var startRowIndex: js.UndefOr[Double] = js.native
}

object GridRange {
  @scala.inline
  def apply(): GridRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRange]
  }
  @scala.inline
  implicit class GridRangeOps[Self <: GridRange] (val x: Self) extends AnyVal {
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
    def deleteEndColumnIndex: Self = this.set("endColumnIndex", js.undefined)
    @scala.inline
    def setEndRowIndex(value: Double): Self = this.set("endRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndRowIndex: Self = this.set("endRowIndex", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    @scala.inline
    def setStartColumnIndex(value: Double): Self = this.set("startColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartColumnIndex: Self = this.set("startColumnIndex", js.undefined)
    @scala.inline
    def setStartRowIndex(value: Double): Self = this.set("startRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRowIndex: Self = this.set("startRowIndex", js.undefined)
  }
  
}

