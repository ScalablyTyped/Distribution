package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.DigitalGauge")
@js.native
class DigitalGauge protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.Model = js.native
  @JSName("model")
  var model_DigitalGauge: ejDotWebDotAllLib.ejNs.Model = js.native
  /** To export Digital Gauge as Image
    * @param {string} fileName for the Image
    * @param {string} fileType for the Image
    * @returns {boolean}
    */
  def exportImage(fileName: java.lang.String, fileType: java.lang.String): scala.Boolean = js.native
  /** Gets the location of an item that is displayed on the gauge.
    * @param {number} Position value of an item that is displayed on the gauge.
    * @returns {any}
    */
  def getPosition(itemIndex: scala.Double): js.Any = js.native
  /** ClientSideMethod getValue Gets the value of an item that is displayed on the gauge
    * @param {number} Index value of an item that displayed on the gauge
    * @returns {any}
    */
  def getValue(itemIndex: scala.Double): js.Any = js.native
  /** Refresh the digital gauge widget
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  /** ClientSideMethod Set Position Sets the location of an item to be displayed in the gauge
    * @param {number} Index value of the digital gauge item
    * @param {any} Location value of the digital gauge
    * @returns {void}
    */
  def setPosition(itemIndex: scala.Double, value: js.Any): scala.Unit = js.native
  /** ClientSideMethod SetValue Sets the value of an item to be displayed in the gauge.
    * @param {number} Index value of the digital gauge item
    * @param {string} Text value to be displayed in the gaugeS
    * @returns {void}
    */
  def setValue(itemIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("ej.datavisualization.DigitalGauge")
@js.native
object DigitalGauge extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGauge = js.native
}

