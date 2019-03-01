package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnType extends js.Object {
  /** Column Type. Either DIMENSION or METRIC. */
  var columnType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data type. Dimension column headers have only STRING as the data type. Metric column headers have data types for metric values such as INTEGER, DOUBLE,
    * CURRENCY etc.
    */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /** Column name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColumnType {
  @scala.inline
  def apply(
    columnType: java.lang.String = null,
    dataType: java.lang.String = null,
    name: java.lang.String = null
  ): Anon_ColumnType = {
    val __obj = js.Dynamic.literal()
    if (columnType != null) __obj.updateDynamic("columnType")(columnType)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_ColumnType]
  }
}

