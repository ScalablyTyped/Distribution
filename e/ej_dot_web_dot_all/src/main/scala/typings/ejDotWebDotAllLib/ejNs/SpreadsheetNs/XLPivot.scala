package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLPivot extends js.Object {
  /** This property is used to clear the pivot table list in Spreadsheet.
    * @param {string} Pass the name of the pivot table.
    * @returns {void}
    */
  def clearPivotFieldList(pivotName: java.lang.String): scala.Unit
  /** This method is used to create pivot table.
    * @param {string} It specifies the range for which the pivot table is created.
    * @param {string} It specifies the location in which the pivot table is created.
    * @param {string} It specifies the name of the pivot table.
    * @param {any} Pass the pivot table settings.
    * @param {any} Pass the pivot range, sheet index, address and data source .
    * @returns {string}
    */
  def createPivotTable(
    range: java.lang.String,
    location: java.lang.String,
    name: java.lang.String,
    settings: js.Any,
    pvt: js.Any
  ): java.lang.String
  /** This method is used to delete the pivot table which is selected.
    * @param {string} Pass the name of the pivot table.
    * @returns {void}
    */
  def deletePivotTable(pivotName: java.lang.String): scala.Unit
  /** This method is used to refresh data in pivot table.
    * @param {string} Optional. Pass the name of the pivot table.
    * @param {number} Optional. Pass the index of the sheet.
    * @returns {void}
    */
  def refreshDataSource(name: java.lang.String, sheetIdx: scala.Double): scala.Unit
}

