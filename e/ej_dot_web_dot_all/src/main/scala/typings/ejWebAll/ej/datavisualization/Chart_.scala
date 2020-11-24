package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart_ extends Widget_ {
  
  /** Animates the series and/or indicators in Chart. When parameter is not passed to this method, then all the series and indicators present in Chart are animated.
    * @param {any} If an array collection is passed as parameter, series and indicator objects passed in array collection are animated.ExampleIf a series or indicator object is passed
    * to this method, then the specific series or indicator is animated.Example,
    * @returns {void}
    */
  def animate(options: js.Any): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Exports chart as an image or to an excel file. Chart can be exported as an image only when exportCanvasRendering option is set to true.
    * @param {string} Type of the export operation to be performed. Following are the two export types that are supported now,1. 'image'2. 'excel'Example
    * @param {string} URL of the service, where the chart will be exported to excel.Example,
    * @param {boolean} When this parameter is true, all the chart objects initialized to the same document are exported to a single excel file. This is an optional parameter. By
    * default, it is false.Example,
    * @returns {any}
    */
  def export(`type`: String, URL: String, exportMultipleChart: Boolean): js.Any = js.native
  
  @JSName("model")
  var model_Chart_ : Model = js.native
  
  /** Prints the rendered chart.
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** Redraws the entire chart. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}
