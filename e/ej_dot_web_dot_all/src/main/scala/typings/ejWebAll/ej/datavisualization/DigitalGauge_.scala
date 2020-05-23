package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DigitalGauge_ extends Widget_ {
  var defaults: Model = js.native
  @JSName("model")
  var model_DigitalGauge_ : Model = js.native
  /** To export Digital Gauge as Image
    * @param {string} fileName for the Image
    * @param {string} fileType for the Image
    * @returns {boolean}
    */
  def exportImage(fileName: String, fileType: String): Boolean = js.native
  /** Gets the location of an item that is displayed on the gauge.
    * @param {number} Position value of an item that is displayed on the gauge.
    * @returns {any}
    */
  def getPosition(itemIndex: Double): js.Any = js.native
  /** ClientSideMethod getValue Gets the value of an item that is displayed on the gauge
    * @param {number} Index value of an item that displayed on the gauge
    * @returns {any}
    */
  def getValue(itemIndex: Double): js.Any = js.native
  /** Refresh the digital gauge widget
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** ClientSideMethod Set Position Sets the location of an item to be displayed in the gauge
    * @param {number} Index value of the digital gauge item
    * @param {any} Location value of the digital gauge
    * @returns {void}
    */
  def setPosition(itemIndex: Double, value: js.Any): Unit = js.native
  /** ClientSideMethod SetValue Sets the value of an item to be displayed in the gauge.
    * @param {number} Index value of the digital gauge item
    * @param {string} Text value to be displayed in the gaugeS
    * @returns {void}
    */
  def setValue(itemIndex: Double, value: String): Unit = js.native
}

