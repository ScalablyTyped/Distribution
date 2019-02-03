package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Map")
@js.native
class Map protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.Model = js.native
  @JSName("model")
  var model_Map: ejDotWebDotAllLib.ejNs.Model = js.native
  /** Add markers dynamically based on layer and sublayer index value.
    * @returns {void}
    */
  def addMarkers(): scala.Unit = js.native
  /** Method for navigating to specific shape based on latitude, longitude and zoom level.
    * @param {number} Pass the latitude value for map
    * @param {number} Pass the longitude value for map
    * @param {number} Pass the zoom level for map
    * @returns {void}
    */
  def navigateTo(latitude: scala.Double, longitude: scala.Double, level: scala.Double): scala.Unit = js.native
  /** Method to perform map panning
    * @param {string} Pass the direction in which map should be panned
    * @returns {void}
    */
  def pan(direction: java.lang.String): scala.Unit = js.native
  /** Method to reload the map.
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  /** Method to reload the specified layer based on layer and sublayer index value.
    * @returns {void}
    */
  def refreshLayer(): scala.Unit = js.native
  /** Method to reload the shapeLayers with updated values
    * @returns {void}
    */
  def refreshLayers(): scala.Unit = js.native
  /** Method to reload the navigation control with updated values.
    * @param {any} Pass the navigation control instance
    * @returns {void}
    */
  def refreshNavigationControl(navigation: js.Any): scala.Unit = js.native
  /** Method to perform map zooming.
    * @param {number} Pass the zoom level for map to be zoomed
    * @param {boolean} Pass the boolean value to enable or disable animation while zooming
    * @returns {void}
    */
  def zoom(level: scala.Double, isAnimate: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.Map")
@js.native
object Map extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.Map = js.native
}

