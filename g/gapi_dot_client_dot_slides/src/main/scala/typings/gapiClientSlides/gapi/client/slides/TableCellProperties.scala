package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellProperties extends js.Object {
  /**
    * The background fill of the table cell. The default fill matches the fill
    * for newly created table cells in the Slides editor.
    */
  var tableCellBackgroundFill: js.UndefOr[TableCellBackgroundFill] = js.native
}

object TableCellProperties {
  @scala.inline
  def apply(): TableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellProperties]
  }
  @scala.inline
  implicit class TableCellPropertiesOps[Self <: TableCellProperties] (val x: Self) extends AnyVal {
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
    def setTableCellBackgroundFill(value: TableCellBackgroundFill): Self = this.set("tableCellBackgroundFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellBackgroundFill: Self = this.set("tableCellBackgroundFill", js.undefined)
  }
  
}

