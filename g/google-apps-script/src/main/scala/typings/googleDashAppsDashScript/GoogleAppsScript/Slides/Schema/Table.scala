package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var horizontalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var tableColumns: js.UndefOr[js.Array[TableColumnProperties]] = js.undefined
  var tableRows: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.TableRow]
  ] = js.undefined
  var verticalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    horizontalBorderRows: js.Array[TableBorderRow] = null,
    rows: Int | Double = null,
    tableColumns: js.Array[TableColumnProperties] = null,
    tableRows: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.TableRow] = null,
    verticalBorderRows: js.Array[TableBorderRow] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (horizontalBorderRows != null) __obj.updateDynamic("horizontalBorderRows")(horizontalBorderRows)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (tableColumns != null) __obj.updateDynamic("tableColumns")(tableColumns)
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows)
    if (verticalBorderRows != null) __obj.updateDynamic("verticalBorderRows")(verticalBorderRows)
    __obj.asInstanceOf[Table]
  }
}

