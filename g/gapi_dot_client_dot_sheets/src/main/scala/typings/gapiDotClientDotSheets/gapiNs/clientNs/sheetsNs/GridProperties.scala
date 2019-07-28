package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProperties extends js.Object {
  /** The number of columns in the grid. */
  var columnCount: js.UndefOr[Double] = js.undefined
  /** The number of columns that are frozen in the grid. */
  var frozenColumnCount: js.UndefOr[Double] = js.undefined
  /** The number of rows that are frozen in the grid. */
  var frozenRowCount: js.UndefOr[Double] = js.undefined
  /** True if the grid isn't showing gridlines in the UI. */
  var hideGridlines: js.UndefOr[Boolean] = js.undefined
  /** The number of rows in the grid. */
  var rowCount: js.UndefOr[Double] = js.undefined
}

object GridProperties {
  @scala.inline
  def apply(
    columnCount: Int | Double = null,
    frozenColumnCount: Int | Double = null,
    frozenRowCount: Int | Double = null,
    hideGridlines: js.UndefOr[Boolean] = js.undefined,
    rowCount: Int | Double = null
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

