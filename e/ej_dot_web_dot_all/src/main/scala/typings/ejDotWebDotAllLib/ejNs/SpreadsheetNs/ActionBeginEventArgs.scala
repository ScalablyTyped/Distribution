package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  var colSelected: js.UndefOr[scala.Double] = js.undefined
  /** Return column name while sorting.
               */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns goto index while paging.
               */
  var gotoIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns boolean value. If create new sheet it returns true.
               */
  var newSheet: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cell range.
               */
  var range: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the action format.
               */
  var reqType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the sheet index.
               */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns sort direction while sort action begins.
               */
  var sortDirection: js.UndefOr[java.lang.String] = js.undefined
}

