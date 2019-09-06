package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLSparkline extends js.Object {
  /** This method used to change the sparkline color and marker point color in the spreadsheet.
    * @param {string} Pass the sparkline ID
    * @param {any}  pass the high point color as object.
    * @param {number} Optional. Pass the sheet index
    * @returns {void}
    */
  def changePointColor(sparklineId: String, option: js.Any, sheetIdx: Double): Unit
  /** This method used to change the sparkline type in the spreadsheet.
    * @param {string} Pass the sparkline ID
    * @param {string} Pass the sparkline type
    * @param {number} Optional. Pass the sheet index
    * @returns {void}
    */
  def changeType(sparklineId: String, `type`: String, sheetIdx: Double): Unit
  /** This method used for creating the sparkline chart for specified range in spreadsheet.
    * @param {string} Pass the data range
    * @param {string} Pass the location range
    * @param {string} Pass the sparkline chart type
    * @param {Spreadsheet.SparklineOptions} Pass Object SparklineOptions.
    * @param {number} Pass the sheetIndex
    * @returns {void}
    */
  def createSparkline(
    dataRange: String,
    locationRange: String,
    `type`: String,
    options: SparklineOptions,
    sheetIndex: Double
  ): Unit
}

object XLSparkline {
  @scala.inline
  def apply(
    changePointColor: (String, js.Any, Double) => Unit,
    changeType: (String, String, Double) => Unit,
    createSparkline: (String, String, String, SparklineOptions, Double) => Unit
  ): XLSparkline = {
    val __obj = js.Dynamic.literal(changePointColor = js.Any.fromFunction3(changePointColor), changeType = js.Any.fromFunction3(changeType), createSparkline = js.Any.fromFunction5(createSparkline))
  
    __obj.asInstanceOf[XLSparkline]
  }
}

