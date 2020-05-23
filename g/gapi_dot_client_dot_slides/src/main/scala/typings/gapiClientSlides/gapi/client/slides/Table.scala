package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /** Number of columns in the table. */
  var columns: js.UndefOr[Double] = js.undefined
  /** Number of rows in the table. */
  var rows: js.UndefOr[Double] = js.undefined
  /** Properties of each column. */
  var tableColumns: js.UndefOr[js.Array[TableColumnProperties]] = js.undefined
  /**
    * Properties and contents of each row.
    *
    * Cells that span multiple rows are contained in only one of these rows and
    * have a row_span greater
    * than 1.
    */
  var tableRows: js.UndefOr[js.Array[TableRow]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    columns: js.UndefOr[Double] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    tableColumns: js.Array[TableColumnProperties] = null,
    tableRows: js.Array[TableRow] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (tableColumns != null) __obj.updateDynamic("tableColumns")(tableColumns.asInstanceOf[js.Any])
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

