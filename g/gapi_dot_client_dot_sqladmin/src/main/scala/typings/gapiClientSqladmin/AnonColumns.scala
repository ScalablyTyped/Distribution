package typings.gapiClientSqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns extends js.Object {
  /** The columns to which CSV data is imported. If not specified, all columns of the database table are loaded with CSV data. */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  /** The table to which CSV data is imported. */
  var table: js.UndefOr[String] = js.undefined
}

object AnonColumns {
  @scala.inline
  def apply(columns: js.Array[String] = null, table: String = null): AnonColumns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns]
  }
}

