package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Widget_
import typings.ejWebAll.ej.datavisualization.SunburstChart.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SunburstChart_ extends Widget_ {
  var defaults: Model = js.native
  @JSName("model")
  var model_SunburstChart_ : Model = js.native
  /** Redraws the entire sunburst. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}

