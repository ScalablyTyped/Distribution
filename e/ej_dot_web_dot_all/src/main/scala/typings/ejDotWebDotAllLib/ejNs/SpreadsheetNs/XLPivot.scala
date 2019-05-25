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
    * @param {Spreadsheet.PivotOptions} Pass Object PivotOptions.
    * @param {any} Pass the pivot range, sheet index, address and data source .
    * @returns {string}
    */
  def createPivotTable(
    range: java.lang.String,
    location: java.lang.String,
    name: java.lang.String,
    settings: PivotOptions,
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

object XLPivot {
  @scala.inline
  def apply(
    clearPivotFieldList: java.lang.String => scala.Unit,
    createPivotTable: (java.lang.String, java.lang.String, java.lang.String, PivotOptions, js.Any) => java.lang.String,
    deletePivotTable: java.lang.String => scala.Unit,
    refreshDataSource: (java.lang.String, scala.Double) => scala.Unit
  ): XLPivot = {
    val __obj = js.Dynamic.literal(clearPivotFieldList = js.Any.fromFunction1(clearPivotFieldList), createPivotTable = js.Any.fromFunction5(createPivotTable), deletePivotTable = js.Any.fromFunction1(deletePivotTable), refreshDataSource = js.Any.fromFunction2(refreshDataSource))
  
    __obj.asInstanceOf[XLPivot]
  }
}

