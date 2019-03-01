package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLSparkline extends js.Object {
  /** This method used to change the sparkline color and marker point color in the spreadsheet.
    * @param {string} Pass the sparkline ID
    * @param {any} Pass the sparkline options
    * @param {number} Optional. Pass the sheet index
    * @returns {void}
    */
  def changePointColor(sparklineId: java.lang.String, option: js.Any, sheetIdx: scala.Double): scala.Unit
  /** This method used to change the sparkline type in the spreadsheet.
    * @param {string} Pass the sparkline ID
    * @param {string} Pass the sparkline type
    * @param {number} Optional. Pass the sheet index
    * @returns {void}
    */
  def changeType(sparklineId: java.lang.String, `type`: java.lang.String, sheetIdx: scala.Double): scala.Unit
  /** This method used for creating the sparkline chart for specified range in spreadsheet.
    * @param {string} Pass the data range
    * @param {string} Pass the location range
    * @param {string} Pass the sparkline chart type
    * @param {any} Pass the sparkline chart options
    * @param {number} Pass the sheetIndex
    * @returns {void}
    */
  def createSparkline(
    dataRange: java.lang.String,
    locationRange: java.lang.String,
    `type`: java.lang.String,
    options: js.Any,
    sheetIndex: scala.Double
  ): scala.Unit
}

object XLSparkline {
  @scala.inline
  def apply(
    changePointColor: js.Function3[java.lang.String, js.Any, scala.Double, scala.Unit],
    changeType: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit],
    createSparkline: js.Function5[java.lang.String, java.lang.String, java.lang.String, js.Any, scala.Double, scala.Unit]
  ): XLSparkline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changePointColor")(changePointColor)
    __obj.updateDynamic("changeType")(changeType)
    __obj.updateDynamic("createSparkline")(createSparkline)
    __obj.asInstanceOf[XLSparkline]
  }
}

