package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SunburstChart_ extends Widget_ {
  
  var defaults: typings.ejWebAll.ej.SunburstChart.Model = js.native
  
  @JSName("model")
  var model_SunburstChart_ : typings.ejWebAll.ej.SunburstChart.Model = js.native
  
  /** Redraws the entire sunburst. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}
