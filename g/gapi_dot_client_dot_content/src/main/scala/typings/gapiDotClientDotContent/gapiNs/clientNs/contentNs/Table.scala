package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /** Headers of the table's columns. Optional: if not set then the table has only one dimension. */
  var columnHeaders: js.UndefOr[Headers] = js.undefined
  /** Name of the table. Required for subtables, ignored for the main table. */
  var name: js.UndefOr[String] = js.undefined
  /** Headers of the table's rows. Required. */
  var rowHeaders: js.UndefOr[Headers] = js.undefined
  /** The list of rows that constitute the table. Must have the same length as rowHeaders. Required. */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    columnHeaders: Headers = null,
    name: String = null,
    rowHeaders: Headers = null,
    rows: js.Array[Row] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rowHeaders != null) __obj.updateDynamic("rowHeaders")(rowHeaders)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Table]
  }
}

