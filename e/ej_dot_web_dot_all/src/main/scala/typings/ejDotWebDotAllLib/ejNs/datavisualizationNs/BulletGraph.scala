package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
class BulletGraph protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.Model = js.native
  @JSName("model")
  var model_BulletGraph: ejDotWebDotAllLib.ejNs.Model = js.native
  /** To redraw the bullet graph
    * @returns {void}
    */
  def redraw(): scala.Unit = js.native
  /** To set the value for comparative measure in bullet graph.
    * @param {number} value for the graph
    * @param {number} value for the graph
    * @returns {void}
    */
  def setComparativeMeasureSymbol(index: scala.Double, measure: scala.Double): scala.Unit = js.native
  /** To set the value for feature measure bar.
    * @param {number} value for the graph
    * @param {number} value for the graph
    * @returns {void}
    */
  def setFeatureMeasureBarValue(index: scala.Double, measure: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
object BulletGraph extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraph = js.native
}

