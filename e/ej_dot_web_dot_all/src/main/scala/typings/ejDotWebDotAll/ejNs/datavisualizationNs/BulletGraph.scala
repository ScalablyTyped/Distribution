package typings.ejDotWebDotAll.ejNs.datavisualizationNs

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ejNs.Model
import typings.ejDotWebDotAll.ejNs.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
class BulletGraph protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_BulletGraph: Model = js.native
  /** To redraw the bullet graph
    * @returns {void}
    */
  def redraw(): Unit = js.native
  /** To set the value for comparative measure in bullet graph.
    * @param {number} value for the graph
    * @param {number} value for the graph
    * @returns {void}
    */
  def setComparativeMeasureSymbol(index: Double, measure: Double): Unit = js.native
  /** To set the value for feature measure bar.
    * @param {number} value for the graph
    * @param {number} value for the graph
    * @returns {void}
    */
  def setFeatureMeasureBarValue(index: Double, measure: Double): Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
object BulletGraph extends js.Object {
  var Locale: js.Any = js.native
  var fn: BulletGraph = js.native
}

