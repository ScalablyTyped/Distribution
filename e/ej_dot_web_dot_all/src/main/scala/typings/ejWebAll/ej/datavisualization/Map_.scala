package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map_ extends Widget_ {
  var defaults: Model = js.native
  @JSName("model")
  var model_Map_ : Model = js.native
  /** Add markers dynamically based on layer and sublayer index value.
    * @returns {void}
    */
  def addMarkers(): Unit = js.native
  /** Method for navigating to specific shape based on latitude, longitude and zoom level.
    * @param {number} Pass the latitude value for map
    * @param {number} Pass the longitude value for map
    * @param {number} Pass the zoom level for map
    * @returns {void}
    */
  def navigateTo(latitude: Double, longitude: Double, level: Double): Unit = js.native
  /** Method to perform map panning
    * @param {string} Pass the direction in which map should be panned
    * @returns {void}
    */
  def pan(direction: String): Unit = js.native
  /** Method to reload the map.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** Method to reload the specified layer based on layer and sublayer index value.
    * @returns {void}
    */
  def refreshLayer(): Unit = js.native
  /** Method to reload the shapeLayers with updated values
    * @returns {void}
    */
  def refreshLayers(): Unit = js.native
  /** Method to reload the navigation control with updated values.
    * @param {any} Pass the navigation control instance
    * @returns {void}
    */
  def refreshNavigationControl(navigation: js.Any): Unit = js.native
  /** Method to perform map zooming.
    * @param {number} Pass the zoom level for map to be zoomed
    * @param {boolean} Pass the boolean value to enable or disable animation while zooming
    * @returns {void}
    */
  def zoom(level: Double, isAnimate: Boolean): Unit = js.native
}

