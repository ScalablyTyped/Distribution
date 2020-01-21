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
    columns: Int | Double = null,
    rows: Int | Double = null,
    tableColumns: js.Array[TableColumnProperties] = null,
    tableRows: js.Array[TableRow] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (tableColumns != null) __obj.updateDynamic("tableColumns")(tableColumns.asInstanceOf[js.Any])
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

