package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProperties extends js.Object {
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  var columnGroupControlAfter: js.UndefOr[scala.Boolean] = js.undefined
  var frozenColumnCount: js.UndefOr[scala.Double] = js.undefined
  var frozenRowCount: js.UndefOr[scala.Double] = js.undefined
  var hideGridlines: js.UndefOr[scala.Boolean] = js.undefined
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  var rowGroupControlAfter: js.UndefOr[scala.Boolean] = js.undefined
}

object GridProperties {
  @scala.inline
  def apply(
    columnCount: scala.Int | scala.Double = null,
    columnGroupControlAfter: js.UndefOr[scala.Boolean] = js.undefined,
    frozenColumnCount: scala.Int | scala.Double = null,
    frozenRowCount: scala.Int | scala.Double = null,
    hideGridlines: js.UndefOr[scala.Boolean] = js.undefined,
    rowCount: scala.Int | scala.Double = null,
    rowGroupControlAfter: js.UndefOr[scala.Boolean] = js.undefined
  ): GridProperties = {
    val __obj = js.Dynamic.literal()
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (!js.isUndefined(columnGroupControlAfter)) __obj.updateDynamic("columnGroupControlAfter")(columnGroupControlAfter)
    if (frozenColumnCount != null) __obj.updateDynamic("frozenColumnCount")(frozenColumnCount.asInstanceOf[js.Any])
    if (frozenRowCount != null) __obj.updateDynamic("frozenRowCount")(frozenRowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(hideGridlines)) __obj.updateDynamic("hideGridlines")(hideGridlines)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroupControlAfter)) __obj.updateDynamic("rowGroupControlAfter")(rowGroupControlAfter)
    __obj.asInstanceOf[GridProperties]
  }
}

