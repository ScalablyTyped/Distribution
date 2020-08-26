package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLSparkline extends js.Object {
  /** This method used to change the sparkline color and marker point color in the spreadsheet.
    * @param {string} Pass the sparkline ID
    * @param {any}  pass the high point color as object.
    * @param {number} Optional. Pass the sheet index
    * @returns {void}
    */
  def changePointColor(sparklineId: String, option: js.Any, sheetIdx: Double): Unit = js.native
  /** This method used to change the sparkline type in the spreadsheet.
    * @param {string} Pass the sparkline ID
    * @param {string} Pass the sparkline type
    * @param {number} Optional. Pass the sheet index
    * @returns {void}
    */
  def changeType(sparklineId: String, `type`: String, sheetIdx: Double): Unit = js.native
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
  ): Unit = js.native
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
  @scala.inline
  implicit class XLSparklineOps[Self <: XLSparkline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangePointColor(value: (String, js.Any, Double) => Unit): Self = this.set("changePointColor", js.Any.fromFunction3(value))
    @scala.inline
    def setChangeType(value: (String, String, Double) => Unit): Self = this.set("changeType", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateSparkline(value: (String, String, String, SparklineOptions, Double) => Unit): Self = this.set("createSparkline", js.Any.fromFunction5(value))
  }
  
}

