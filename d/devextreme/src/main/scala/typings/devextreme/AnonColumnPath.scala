package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnPath extends js.Object {
  var columnPath: js.UndefOr[js.Array[String | Double | Date]] = js.undefined
  var customColumns: js.UndefOr[js.Array[String]] = js.undefined
  var dataIndex: js.UndefOr[Double] = js.undefined
  var maxRowCount: js.UndefOr[Double] = js.undefined
  var rowPath: js.UndefOr[js.Array[String | Double | Date]] = js.undefined
}

object AnonColumnPath {
  @scala.inline
  def apply(
    columnPath: js.Array[String | Double | Date] = null,
    customColumns: js.Array[String] = null,
    dataIndex: Int | Double = null,
    maxRowCount: Int | Double = null,
    rowPath: js.Array[String | Double | Date] = null
  ): AnonColumnPath = {
    val __obj = js.Dynamic.literal()
    if (columnPath != null) __obj.updateDynamic("columnPath")(columnPath.asInstanceOf[js.Any])
    if (customColumns != null) __obj.updateDynamic("customColumns")(customColumns.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (maxRowCount != null) __obj.updateDynamic("maxRowCount")(maxRowCount.asInstanceOf[js.Any])
    if (rowPath != null) __obj.updateDynamic("rowPath")(rowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnPath]
  }
}

