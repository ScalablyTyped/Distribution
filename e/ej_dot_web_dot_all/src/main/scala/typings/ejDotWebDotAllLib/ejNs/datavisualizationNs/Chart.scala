package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Chart")
@js.native
class Chart protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.Model = js.native
  @JSName("model")
  var model_Chart: ejDotWebDotAllLib.ejNs.Model = js.native
  /** Animates the series and/or indicators in Chart. When parameter is not passed to this method, then all the series and indicators present in Chart are animated.
    * @param {any} If an array collection is passed as parameter, series and indicator objects passed in array collection are animated.ExampleIf a series or indicator object is passed
    * to this method, then the specific series or indicator is animated.Example,
    * @returns {void}
    */
  def animate(options: js.Any): scala.Unit = js.native
  /** Exports chart as an image or to an excel file. Chart can be exported as an image only when exportCanvasRendering option is set to true.
    * @param {string} Type of the export operation to be performed. Following are the two export types that are supported now,1. 'image'2. 'excel'Example
    * @param {string} URL of the service, where the chart will be exported to excel.Example,
    * @param {boolean} When this parameter is true, all the chart objects initialized to the same document are exported to a single excel file. This is an optional parameter. By
    * default, it is false.Example,
    * @returns {any}
    */
  def export(`type`: java.lang.String, URL: java.lang.String, exportMultipleChart: scala.Boolean): js.Any = js.native
  /** Prints the rendered chart.
    * @returns {void}
    */
  def print(): scala.Unit = js.native
  /** Redraws the entire chart. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.Chart")
@js.native
object Chart extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.Chart = js.native
}

