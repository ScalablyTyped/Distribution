package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnBaseColumn extends js.Object {
  var columnId: js.UndefOr[Double] = js.undefined
  var tableIndex: js.UndefOr[Double] = js.undefined
}

object ColumnBaseColumn {
  @scala.inline
  def apply(columnId: Int | Double = null, tableIndex: Int | Double = null): ColumnBaseColumn = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (tableIndex != null) __obj.updateDynamic("tableIndex")(tableIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnBaseColumn]
  }
}

