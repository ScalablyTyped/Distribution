package typings.dojo.dojox.geo.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/charting/MouseInteractionSupport.html
  *
  * class to handle mouse interactions on a dojox.geo.charting.Map widget
  *
  * @param map the Map widget this class provides touch navigation for.
  * @param options       OptionalAn object defining additional configuration properties.
  */
@JSGlobal("dojox.geo.charting.MouseInteractionSupport")
@js.native
class MouseInteractionSupport protected () extends js.Object {
  def this(map: Map) = this()
  def this(map: Map, options: js.Object) = this()
  /**
    *
    */
  var mouseClickThreshold: Double = js.native
  /**
    * connects this mouse support class to the Map component
    *
    */
  def connect(): Unit = js.native
  /**
    * disconnects any installed listeners
    *
    */
  def disconnect(): Unit = js.native
  /**
    * enables mouse panning on the map
    *
    * @param enable Indicates whether mouse zoom is enabled.
    */
  def setEnablePan(enable: Boolean): Unit = js.native
  /**
    * enables mouse zoom on the map
    *
    * @param enable Indicates whether mouse zoom is enabled.
    */
  def setEnableZoom(enable: Boolean): Unit = js.native
}

