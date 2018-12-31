package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLExport extends js.Object {
  /** This method is used to save the sheet data as Excel ,CSV or PDF document (.xls, .xlsx .csv, .pdf) in Spreadsheet.
    * @param {string} Pass the export type that you want.
    * @param {string} Pass the export filename that you want.
    * @returns {void}
    */
  def export(`type`: java.lang.String, fileName: java.lang.String): scala.Unit
  /** This method is used to get the export properties in the Spreadsheet.
    * @returns {any}
    */
  def getExportProps(): js.Any
}

