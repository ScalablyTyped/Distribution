package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellLocation extends js.Object {
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object TableCellLocation {
  @scala.inline
  def apply(columnIndex: scala.Int | scala.Double = null, rowIndex: scala.Int | scala.Double = null): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellLocation]
  }
}

