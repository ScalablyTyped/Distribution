package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProperties extends js.Object {
  /**
  	 * Column definitions
  	 */
  var columns: js.Array[TableColumnProperties]
  /**
  	 * The display name of the table
  	 */
  var displayName: js.UndefOr[String] = js.undefined
  /**
  	 * Show headers at top of table
  	 * @default true
  	 */
  var headerRow: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The name of the table
  	 */
  var name: String
  /**
  	 * Top left cell of the table
  	 */
  var ref: String
  /**
  	 * Rows of data
  	 */
  var rows: js.Array[js.Array[_]]
  /**
  	 * Extra style properties
  	 * @default {}
  	 */
  var style: js.UndefOr[TableStyleProperties] = js.undefined
  /**
  	 * Show totals at bottom of table
  	 * @default false
  	 */
  var totalsRow: js.UndefOr[Boolean] = js.undefined
}

object TableProperties {
  @scala.inline
  def apply(
    columns: js.Array[TableColumnProperties],
    name: String,
    ref: String,
    rows: js.Array[js.Array[_]],
    displayName: String = null,
    headerRow: js.UndefOr[Boolean] = js.undefined,
    style: TableStyleProperties = null,
    totalsRow: js.UndefOr[Boolean] = js.undefined
  ): TableProperties = {
    val __obj = js.Dynamic.literal(columns = columns, name = name, ref = ref, rows = rows)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(headerRow)) __obj.updateDynamic("headerRow")(headerRow)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(totalsRow)) __obj.updateDynamic("totalsRow")(totalsRow)
    __obj.asInstanceOf[TableProperties]
  }
}

