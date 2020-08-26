package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSelectionEventArgs extends js.Object {
  /** returns the JSON records of the selected range of cells.
    */
  var JSONRecords: js.UndefOr[js.Any] = js.native
  /** Returns the column headers corresponding to the selected value cells.
    */
  var columnheader: js.UndefOr[js.Any] = js.native
  /** Returns the information about the measure associated with the selected cell.
    */
  var measureCount: js.UndefOr[String] = js.native
  /** Returns the row headers corresponding to the selected value cells.
    */
  var rowheader: js.UndefOr[js.Any] = js.native
}

object CellSelectionEventArgs {
  @scala.inline
  def apply(): CellSelectionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionEventArgs]
  }
  @scala.inline
  implicit class CellSelectionEventArgsOps[Self <: CellSelectionEventArgs] (val x: Self) extends AnyVal {
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
    def setJSONRecords(value: js.Any): Self = this.set("JSONRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSONRecords: Self = this.set("JSONRecords", js.undefined)
    @scala.inline
    def setColumnheader(value: js.Any): Self = this.set("columnheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnheader: Self = this.set("columnheader", js.undefined)
    @scala.inline
    def setMeasureCount(value: String): Self = this.set("measureCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureCount: Self = this.set("measureCount", js.undefined)
    @scala.inline
    def setRowheader(value: js.Any): Self = this.set("rowheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowheader: Self = this.set("rowheader", js.undefined)
  }
  
}

