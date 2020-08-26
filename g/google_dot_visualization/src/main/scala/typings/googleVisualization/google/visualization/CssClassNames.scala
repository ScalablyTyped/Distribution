package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssClassNames extends js.Object {
  var headerCell: js.UndefOr[String] = js.native
  var headerRow: js.UndefOr[String] = js.native
  var hoverTableRow: js.UndefOr[String] = js.native
  var oddTableRow: js.UndefOr[String] = js.native
  var rowNumberCell: js.UndefOr[String] = js.native
  var selectedTableRow: js.UndefOr[String] = js.native
  var tableCell: js.UndefOr[String] = js.native
  var tableRow: js.UndefOr[String] = js.native
}

object CssClassNames {
  @scala.inline
  def apply(): CssClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssClassNames]
  }
  @scala.inline
  implicit class CssClassNamesOps[Self <: CssClassNames] (val x: Self) extends AnyVal {
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
    def setHeaderCell(value: String): Self = this.set("headerCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCell: Self = this.set("headerCell", js.undefined)
    @scala.inline
    def setHeaderRow(value: String): Self = this.set("headerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRow: Self = this.set("headerRow", js.undefined)
    @scala.inline
    def setHoverTableRow(value: String): Self = this.set("hoverTableRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverTableRow: Self = this.set("hoverTableRow", js.undefined)
    @scala.inline
    def setOddTableRow(value: String): Self = this.set("oddTableRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOddTableRow: Self = this.set("oddTableRow", js.undefined)
    @scala.inline
    def setRowNumberCell(value: String): Self = this.set("rowNumberCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNumberCell: Self = this.set("rowNumberCell", js.undefined)
    @scala.inline
    def setSelectedTableRow(value: String): Self = this.set("selectedTableRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTableRow: Self = this.set("selectedTableRow", js.undefined)
    @scala.inline
    def setTableCell(value: String): Self = this.set("tableCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCell: Self = this.set("tableCell", js.undefined)
    @scala.inline
    def setTableRow(value: String): Self = this.set("tableRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRow: Self = this.set("tableRow", js.undefined)
  }
  
}

