package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLCFormat extends js.Object {
  /** This method is used to clear the applied conditional formatting rules in the Spreadsheet.
               * @param {any[]|string} Optional. If range is specified, it will clear rules for the specified range else it will use the current selected range.
               * @returns {void}
               */
  def clearCF(range: java.lang.String): scala.Unit = js.native
  /** This method is used to clear the applied conditional formatting rules in the Spreadsheet.
               * @param {any[]|string} Optional. If range is specified, it will clear rules for the specified range else it will use the current selected range.
               * @returns {void}
               */
  def clearCF(range: js.Array[_]): scala.Unit = js.native
  /** This method is used to get the applied conditional formatting rules as array of objects based on the specified row Index and column Index in the Spreadsheet.
               * @param {number} Pass the row index.
               * @param {number} Pass the column index.
               * @returns {any[]}
               */
  def getCFRule(rowIdx: scala.Double, colIdx: scala.Double): js.Array[_] = js.native
  /** This method is used to set the conditional formatting rule in the Spreadsheet.
               * @param {any} Pass the rule to set.
               * @returns {void}
               */
  def setCFRule(rule: js.Any): scala.Unit = js.native
}

