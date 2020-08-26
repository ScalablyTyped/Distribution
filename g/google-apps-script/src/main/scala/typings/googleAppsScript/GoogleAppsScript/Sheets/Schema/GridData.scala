package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridData extends js.Object {
  var columnMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.native
  var rowData: js.UndefOr[js.Array[RowData]] = js.native
  var rowMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.native
  var startColumn: js.UndefOr[Double] = js.native
  var startRow: js.UndefOr[Double] = js.native
}

object GridData {
  @scala.inline
  def apply(): GridData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridData]
  }
  @scala.inline
  implicit class GridDataOps[Self <: GridData] (val x: Self) extends AnyVal {
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
    def setColumnMetadataVarargs(value: DimensionProperties*): Self = this.set("columnMetadata", js.Array(value :_*))
    @scala.inline
    def setColumnMetadata(value: js.Array[DimensionProperties]): Self = this.set("columnMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnMetadata: Self = this.set("columnMetadata", js.undefined)
    @scala.inline
    def setRowDataVarargs(value: RowData*): Self = this.set("rowData", js.Array(value :_*))
    @scala.inline
    def setRowData(value: js.Array[RowData]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    @scala.inline
    def setRowMetadataVarargs(value: DimensionProperties*): Self = this.set("rowMetadata", js.Array(value :_*))
    @scala.inline
    def setRowMetadata(value: js.Array[DimensionProperties]): Self = this.set("rowMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowMetadata: Self = this.set("rowMetadata", js.undefined)
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartColumn: Self = this.set("startColumn", js.undefined)
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
  }
  
}

