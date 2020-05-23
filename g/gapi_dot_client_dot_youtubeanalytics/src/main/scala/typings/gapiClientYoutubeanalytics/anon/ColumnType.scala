package typings.gapiClientYoutubeanalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnType extends js.Object {
  /** The type of the column (DIMENSION or METRIC). */
  var columnType: js.UndefOr[String] = js.undefined
  /** The type of the data in the column (STRING, INTEGER, FLOAT, etc.). */
  var dataType: js.UndefOr[String] = js.undefined
  /** The name of the dimension or metric. */
  var name: js.UndefOr[String] = js.undefined
}

object ColumnType {
  @scala.inline
  def apply(columnType: String = null, dataType: String = null, name: String = null): ColumnType = {
    val __obj = js.Dynamic.literal()
    if (columnType != null) __obj.updateDynamic("columnType")(columnType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnType]
  }
}

