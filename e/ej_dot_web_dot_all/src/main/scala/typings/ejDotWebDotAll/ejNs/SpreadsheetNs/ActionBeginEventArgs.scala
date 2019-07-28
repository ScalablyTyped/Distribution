package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBeginEventArgs extends js.Object {
  /** Returns the applied style format object.
    */
  var afterFormat: js.UndefOr[js.Any] = js.undefined
  /** Returns the applied style format object.
    */
  var beforeFormat: js.UndefOr[js.Any] = js.undefined
  /** Returns selected columns while sorting or filtering begins.
    */
  var colSelected: js.UndefOr[Double] = js.undefined
  /** Return column name while sorting.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns goto index while paging.
    */
  var gotoIdx: js.UndefOr[Double] = js.undefined
  /** Returns boolean value. If create new sheet it returns true.
    */
  var newSheet: js.UndefOr[Boolean] = js.undefined
  /** Returns the cell range.
    */
  var range: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the action format.
    */
  var reqType: js.UndefOr[String] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.undefined
  /** Returns sort direction while sort action begins.
    */
  var sortDirection: js.UndefOr[String] = js.undefined
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(
    afterFormat: js.Any = null,
    beforeFormat: js.Any = null,
    colSelected: Int | Double = null,
    columnName: String = null,
    gotoIdx: Int | Double = null,
    newSheet: js.UndefOr[Boolean] = js.undefined,
    range: js.Array[_] = null,
    reqType: String = null,
    sheetIdx: Int | Double = null,
    sortDirection: String = null
  ): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    if (afterFormat != null) __obj.updateDynamic("afterFormat")(afterFormat)
    if (beforeFormat != null) __obj.updateDynamic("beforeFormat")(beforeFormat)
    if (colSelected != null) __obj.updateDynamic("colSelected")(colSelected.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (gotoIdx != null) __obj.updateDynamic("gotoIdx")(gotoIdx.asInstanceOf[js.Any])
    if (!js.isUndefined(newSheet)) __obj.updateDynamic("newSheet")(newSheet)
    if (range != null) __obj.updateDynamic("range")(range)
    if (reqType != null) __obj.updateDynamic("reqType")(reqType)
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
}

