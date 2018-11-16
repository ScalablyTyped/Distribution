package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.SunburstChart")
@js.native
class SunburstChart protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.SunburstChartNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.SunburstChartNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.SunburstChartNs.Model = js.native
  @JSName("model")
  var model_SunburstChart: ejDotWebDotAllLib.ejNs.SunburstChartNs.Model = js.native
  /** Redraws the entire sunburst. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
           * @returns {void}
           */
  def redraw(): scala.Unit = js.native
}

@JSGlobal("ej.SunburstChart")
@js.native
object SunburstChart extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.SunburstChart = js.native
}

