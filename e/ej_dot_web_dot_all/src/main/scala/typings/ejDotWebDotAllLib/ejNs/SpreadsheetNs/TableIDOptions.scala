package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableIDOptions extends js.Object {
  /** Pass the sheet index
    */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Pass the table id
    */
  var tableId: js.UndefOr[scala.Double] = js.undefined
}

object TableIDOptions {
  @scala.inline
  def apply(sheetIdx: scala.Int | scala.Double = null, tableId: scala.Int | scala.Double = null): TableIDOptions = {
    val __obj = js.Dynamic.literal()
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableIDOptions]
  }
}

