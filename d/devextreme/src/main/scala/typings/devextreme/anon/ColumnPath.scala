package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnPath extends js.Object {
  var columnPath: js.UndefOr[js.Array[String | Double | typings.std.Date]] = js.undefined
  var customColumns: js.UndefOr[js.Array[String]] = js.undefined
  var dataIndex: js.UndefOr[Double] = js.undefined
  var maxRowCount: js.UndefOr[Double] = js.undefined
  var rowPath: js.UndefOr[js.Array[String | Double | typings.std.Date]] = js.undefined
}

object ColumnPath {
  @scala.inline
  def apply(
    columnPath: js.Array[String | Double | typings.std.Date] = null,
    customColumns: js.Array[String] = null,
    dataIndex: js.UndefOr[Double] = js.undefined,
    maxRowCount: js.UndefOr[Double] = js.undefined,
    rowPath: js.Array[String | Double | typings.std.Date] = null
  ): ColumnPath = {
    val __obj = js.Dynamic.literal()
    if (columnPath != null) __obj.updateDynamic("columnPath")(columnPath.asInstanceOf[js.Any])
    if (customColumns != null) __obj.updateDynamic("customColumns")(customColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(dataIndex)) __obj.updateDynamic("dataIndex")(dataIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRowCount)) __obj.updateDynamic("maxRowCount")(maxRowCount.get.asInstanceOf[js.Any])
    if (rowPath != null) __obj.updateDynamic("rowPath")(rowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnPath]
  }
}

