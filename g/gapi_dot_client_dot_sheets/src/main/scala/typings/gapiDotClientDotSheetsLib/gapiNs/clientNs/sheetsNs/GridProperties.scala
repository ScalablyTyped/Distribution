package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProperties extends js.Object {
  /** The number of columns in the grid. */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /** The number of columns that are frozen in the grid. */
  var frozenColumnCount: js.UndefOr[scala.Double] = js.undefined
  /** The number of rows that are frozen in the grid. */
  var frozenRowCount: js.UndefOr[scala.Double] = js.undefined
  /** True if the grid isn't showing gridlines in the UI. */
  var hideGridlines: js.UndefOr[scala.Boolean] = js.undefined
  /** The number of rows in the grid. */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
}

object GridProperties {
  @scala.inline
  def apply(
    columnCount: scala.Int | scala.Double = null,
    frozenColumnCount: scala.Int | scala.Double = null,
    frozenRowCount: scala.Int | scala.Double = null,
    hideGridlines: js.UndefOr[scala.Boolean] = js.undefined,
    rowCount: scala.Int | scala.Double = null
  ): GridProperties = {
    val __obj = js.Dynamic.literal()
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (frozenColumnCount != null) __obj.updateDynamic("frozenColumnCount")(frozenColumnCount.asInstanceOf[js.Any])
    if (frozenRowCount != null) __obj.updateDynamic("frozenRowCount")(frozenRowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(hideGridlines)) __obj.updateDynamic("hideGridlines")(hideGridlines)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProperties]
  }
}

