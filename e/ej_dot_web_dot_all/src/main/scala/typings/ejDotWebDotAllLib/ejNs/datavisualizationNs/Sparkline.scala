package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Sparkline")
@js.native
class Sparkline protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.SparklineNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.SparklineNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.SparklineNs.Model = js.native
  @JSName("model")
  var model_Sparkline: ejDotWebDotAllLib.ejNs.SparklineNs.Model = js.native
  /** Redraws the entire sparkline. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
           * @returns {void}
           */
  def redraw(): scala.Unit = js.native
}

@JSGlobal("ej.datavisualization.Sparkline")
@js.native
object Sparkline extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.Sparkline = js.native
}

