package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotOptions extends js.Object {
  /** Pass the column object to create pivot table
    */
  var columns: js.UndefOr[js.Any] = js.native
  /** Pass the filter object to create pivot table
    */
  var filter: js.UndefOr[js.Any] = js.native
  /** Pass the rows object to create pivot table
    */
  var rows: js.UndefOr[js.Any] = js.native
  /** Pass the values to create pivot table
    */
  var values: js.UndefOr[js.Any] = js.native
}

object PivotOptions {
  @scala.inline
  def apply(): PivotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotOptions]
  }
  @scala.inline
  implicit class PivotOptionsOps[Self <: PivotOptions] (val x: Self) extends AnyVal {
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
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setRows(value: js.Any): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

