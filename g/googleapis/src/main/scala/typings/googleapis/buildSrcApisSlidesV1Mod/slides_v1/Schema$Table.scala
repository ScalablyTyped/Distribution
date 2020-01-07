package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a table.
  */
@js.native
trait Schema$Table extends js.Object {
  /**
    * Number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * Properties of horizontal cell borders.  A table&#39;s horizontal cell
    * borders are represented as a grid. The grid has one more row than the
    * number of rows in the table and the same number of columns as the table.
    * For example, if the table is 3 x 3, its horizontal borders will be
    * represented as a grid with 4 rows and 3 columns.
    */
  var horizontalBorderRows: js.UndefOr[js.Array[Schema$TableBorderRow]] = js.native
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * Properties of each column.
    */
  var tableColumns: js.UndefOr[js.Array[Schema$TableColumnProperties]] = js.native
  /**
    * Properties and contents of each row.  Cells that span multiple rows are
    * contained in only one of these rows and have a row_span greater than 1.
    */
  var tableRows: js.UndefOr[js.Array[Schema$TableRow]] = js.native
  /**
    * Properties of vertical cell borders.  A table&#39;s vertical cell borders
    * are represented as a grid. The grid has the same number of rows as the
    * table and one more column than the number of columns in the table. For
    * example, if the table is 3 x 3, its vertical borders will be represented
    * as a grid with 3 rows and 4 columns.
    */
  var verticalBorderRows: js.UndefOr[js.Array[Schema$TableBorderRow]] = js.native
}

object Schema$Table {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    horizontalBorderRows: js.Array[Schema$TableBorderRow] = null,
    rows: Int | Double = null,
    tableColumns: js.Array[Schema$TableColumnProperties] = null,
    tableRows: js.Array[Schema$TableRow] = null,
    verticalBorderRows: js.Array[Schema$TableBorderRow] = null
  ): Schema$Table = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (horizontalBorderRows != null) __obj.updateDynamic("horizontalBorderRows")(horizontalBorderRows.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (tableColumns != null) __obj.updateDynamic("tableColumns")(tableColumns.asInstanceOf[js.Any])
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows.asInstanceOf[js.Any])
    if (verticalBorderRows != null) __obj.updateDynamic("verticalBorderRows")(verticalBorderRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Table]
  }
}

