package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulletGraph_ extends Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_BulletGraph_ : Model = js.native
  
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
