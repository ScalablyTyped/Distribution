package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCell extends js.Object {
  /** Column span of the cell. */
  var columnSpan: js.UndefOr[Double] = js.native
  /** The location of the cell within the table. */
  var location: js.UndefOr[TableCellLocation] = js.native
  /** Row span of the cell. */
  var rowSpan: js.UndefOr[Double] = js.native
  /** The properties of the table cell. */
  var tableCellProperties: js.UndefOr[TableCellProperties] = js.native
  /** The text content of the cell. */
  var text: js.UndefOr[TextContent] = js.native
}

object TableCell {
  @scala.inline
  def apply(): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCell]
  }
  @scala.inline
  implicit class TableCellOps[Self <: TableCell] (val x: Self) extends AnyVal {
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
    def setColumnSpan(value: Double): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSpan: Self = this.set("columnSpan", js.undefined)
    @scala.inline
    def setLocation(value: TableCellLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setTableCellProperties(value: TableCellProperties): Self = this.set("tableCellProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellProperties: Self = this.set("tableCellProperties", js.undefined)
    @scala.inline
    def setText(value: TextContent): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

