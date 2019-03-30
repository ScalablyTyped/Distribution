package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var columns: js.UndefOr[scala.Double] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tableRows: js.UndefOr[js.Array[TableRow]] = js.undefined
  var tableStyle: js.UndefOr[TableStyle] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    columns: scala.Int | scala.Double = null,
    rows: scala.Int | scala.Double = null,
    suggestedDeletionIds: js.Array[java.lang.String] = null,
    suggestedInsertionIds: js.Array[java.lang.String] = null,
    tableRows: js.Array[TableRow] = null,
    tableStyle: TableStyle = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows)
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle)
    __obj.asInstanceOf[Table]
  }
}

