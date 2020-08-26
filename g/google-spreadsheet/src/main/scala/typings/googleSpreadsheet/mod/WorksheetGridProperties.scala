package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetGridProperties extends js.Object {
  var columnCount: Double = js.native
  var columnGroupControlAfter: Boolean = js.native
  var frozenColumnCount: Double = js.native
  var frozenRowCount: Double = js.native
  var hideGridlines: Boolean = js.native
  var rowCount: Double = js.native
  var rowGroupControlAfter: Boolean = js.native
}

object WorksheetGridProperties {
  @scala.inline
  def apply(
    columnCount: Double,
    columnGroupControlAfter: Boolean,
    frozenColumnCount: Double,
    frozenRowCount: Double,
    hideGridlines: Boolean,
    rowCount: Double,
    rowGroupControlAfter: Boolean
  ): WorksheetGridProperties = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnGroupControlAfter = columnGroupControlAfter.asInstanceOf[js.Any], frozenColumnCount = frozenColumnCount.asInstanceOf[js.Any], frozenRowCount = frozenRowCount.asInstanceOf[js.Any], hideGridlines = hideGridlines.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowGroupControlAfter = rowGroupControlAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetGridProperties]
  }
  @scala.inline
  implicit class WorksheetGridPropertiesOps[Self <: WorksheetGridProperties] (val x: Self) extends AnyVal {
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
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnGroupControlAfter(value: Boolean): Self = this.set("columnGroupControlAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrozenColumnCount(value: Double): Self = this.set("frozenColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrozenRowCount(value: Double): Self = this.set("frozenRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideGridlines(value: Boolean): Self = this.set("hideGridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowGroupControlAfter(value: Boolean): Self = this.set("rowGroupControlAfter", value.asInstanceOf[js.Any])
  }
  
}

