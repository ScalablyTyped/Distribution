package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Table extends js.Object {
  /**
    * Headers of the table&#39;s columns. Optional: if not set then the table
    * has only one dimension.
    */
  var columnHeaders: js.UndefOr[Schema$Headers] = js.native
  /**
    * Name of the table. Required for subtables, ignored for the main table.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Headers of the table&#39;s rows. Required.
    */
  var rowHeaders: js.UndefOr[Schema$Headers] = js.native
  /**
    * The list of rows that constitute the table. Must have the same length as
    * rowHeaders. Required.
    */
  var rows: js.UndefOr[js.Array[Schema$Row]] = js.native
}

object Schema$Table {
  @scala.inline
  def apply(
    columnHeaders: Schema$Headers = null,
    name: String = null,
    rowHeaders: Schema$Headers = null,
    rows: js.Array[Schema$Row] = null
  ): Schema$Table = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rowHeaders != null) __obj.updateDynamic("rowHeaders")(rowHeaders.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Table]
  }
}

