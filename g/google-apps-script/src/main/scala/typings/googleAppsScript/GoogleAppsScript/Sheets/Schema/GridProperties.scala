package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProperties extends js.Object {
  var columnCount: js.UndefOr[Double] = js.undefined
  var columnGroupControlAfter: js.UndefOr[Boolean] = js.undefined
  var frozenColumnCount: js.UndefOr[Double] = js.undefined
  var frozenRowCount: js.UndefOr[Double] = js.undefined
  var hideGridlines: js.UndefOr[Boolean] = js.undefined
  var rowCount: js.UndefOr[Double] = js.undefined
  var rowGroupControlAfter: js.UndefOr[Boolean] = js.undefined
}

object GridProperties {
  @scala.inline
  def apply(
    columnCount: js.UndefOr[Double] = js.undefined,
    columnGroupControlAfter: js.UndefOr[Boolean] = js.undefined,
    frozenColumnCount: js.UndefOr[Double] = js.undefined,
    frozenRowCount: js.UndefOr[Double] = js.undefined,
    hideGridlines: js.UndefOr[Boolean] = js.undefined,
    rowCount: js.UndefOr[Double] = js.undefined,
    rowGroupControlAfter: js.UndefOr[Boolean] = js.undefined
  ): GridProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnGroupControlAfter)) __obj.updateDynamic("columnGroupControlAfter")(columnGroupControlAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frozenColumnCount)) __obj.updateDynamic("frozenColumnCount")(frozenColumnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frozenRowCount)) __obj.updateDynamic("frozenRowCount")(frozenRowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideGridlines)) __obj.updateDynamic("hideGridlines")(hideGridlines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroupControlAfter)) __obj.updateDynamic("rowGroupControlAfter")(rowGroupControlAfter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProperties]
  }
}

