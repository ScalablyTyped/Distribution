package typings
package gapiDotClientDotSqladminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  /** The columns to which CSV data is imported. If not specified, all columns of the database table are loaded with CSV data. */
  var columns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The table to which CSV data is imported. */
  var table: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Columns {
  @scala.inline
  def apply(columns: js.Array[java.lang.String] = null, table: java.lang.String = null): Anon_Columns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[Anon_Columns]
  }
}

