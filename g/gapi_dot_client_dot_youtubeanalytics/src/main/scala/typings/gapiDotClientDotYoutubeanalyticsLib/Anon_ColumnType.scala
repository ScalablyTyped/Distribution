package typings
package gapiDotClientDotYoutubeanalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnType extends js.Object {
  /** The type of the column (DIMENSION or METRIC). */
  var columnType: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the data in the column (STRING, INTEGER, FLOAT, etc.). */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the dimension or metric. */
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

