package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProperties extends js.Object {
  /** The number of columns in the grid. */
  var columnCount: js.UndefOr[Double] = js.native
  /** True if the column grouping control toggle is shown after the group. */
  var columnGroupControlAfter: js.UndefOr[Boolean] = js.native
  /** The number of columns that are frozen in the grid. */
  var frozenColumnCount: js.UndefOr[Double] = js.native
  /** The number of rows that are frozen in the grid. */
  var frozenRowCount: js.UndefOr[Double] = js.native
  /** True if the grid isn't showing gridlines in the UI. */
  var hideGridlines: js.UndefOr[Boolean] = js.native
  /** The number of rows in the grid. */
  var rowCount: js.UndefOr[Double] = js.native
  /** True if the row grouping control toggle is shown after the group. */
  var rowGroupControlAfter: js.UndefOr[Boolean] = js.native
}

object GridProperties {
  @scala.inline
  def apply(): GridProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProperties]
  }
  @scala.inline
  implicit class GridPropertiesOps[Self <: GridProperties] (val x: Self) extends AnyVal {
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
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setColumnGroupControlAfter(value: Boolean): Self = this.set("columnGroupControlAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnGroupControlAfter: Self = this.set("columnGroupControlAfter", js.undefined)
    @scala.inline
    def setFrozenColumnCount(value: Double): Self = this.set("frozenColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenColumnCount: Self = this.set("frozenColumnCount", js.undefined)
    @scala.inline
    def setFrozenRowCount(value: Double): Self = this.set("frozenRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenRowCount: Self = this.set("frozenRowCount", js.undefined)
    @scala.inline
    def setHideGridlines(value: Boolean): Self = this.set("hideGridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideGridlines: Self = this.set("hideGridlines", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setRowGroupControlAfter(value: Boolean): Self = this.set("rowGroupControlAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowGroupControlAfter: Self = this.set("rowGroupControlAfter", js.undefined)
  }
  
}

