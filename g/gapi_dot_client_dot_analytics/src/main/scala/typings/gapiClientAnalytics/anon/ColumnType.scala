package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnType extends js.Object {
  /** Column Type. Either DIMENSION or METRIC. */
  var columnType: js.UndefOr[String] = js.undefined
  /**
    * Data type. Dimension column headers have only STRING as the data type. Metric column headers have data types for metric values such as INTEGER, DOUBLE,
    * CURRENCY etc.
    */
  var dataType: js.UndefOr[String] = js.undefined
  /** Column name. */
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

