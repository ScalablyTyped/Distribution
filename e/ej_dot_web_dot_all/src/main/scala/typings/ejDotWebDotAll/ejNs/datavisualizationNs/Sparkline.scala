package typings.ejDotWebDotAll.ejNs.datavisualizationNs

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ejNs.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Sparkline")
@js.native
class Sparkline protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.SparklineNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.SparklineNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.SparklineNs.Model = js.native
  @JSName("model")
  var model_Sparkline: typings.ejDotWebDotAll.ejNs.SparklineNs.Model = js.native
  /** Redraws the entire sparkline. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.Sparkline")
@js.native
object Sparkline extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejDotWebDotAll.ejNs.datavisualizationNs.Sparkline = js.native
}

