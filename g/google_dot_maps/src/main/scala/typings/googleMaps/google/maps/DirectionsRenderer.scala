package typings.googleMaps.google.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders directions obtained from the <code><a
  * href="#DirectionsService">DirectionsService</a></code>.
  */
@js.native
trait DirectionsRenderer
  extends StObject
     with MVCObject {
  
  /**
    * Returns the renderer&#39;s current set of directions.
    */
  def getDirections(): DirectionsResult | Null = js.native
  
  /**
    * Returns the map on which the <code>DirectionsResult</code> is rendered.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Returns the panel <code>&lt;div&gt;</code> in which the
    * <code>DirectionsResult</code> is rendered.
    */
  def getPanel(): HTMLElement | Null = js.native
  
  /**
    * Returns the current (zero-based) route index in use by this
    * <code>DirectionsRenderer</code> object.
    */
  def getRouteIndex(): Double = js.native
  
  /**
    * Set the renderer to use the result from the
    * <code>DirectionsService</code>. Setting a valid set of directions in this
    * manner will display the directions on the renderer&#39;s designated map
    * and panel.
    */
  def setDirections(): Unit = js.native
  def setDirections(directions: DirectionsResult): Unit = js.native
  
  /**
    * This method specifies the map on which directions will be rendered. Pass
    * <code>null</code> to remove the directions from the map.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * Change the options settings of this <code>DirectionsRenderer</code> after
    * initialization.
    */
  def setOptions(): Unit = js.native
  def setOptions(options: DirectionsRendererOptions): Unit = js.native
  
  /**
    * This method renders the directions in a <code>&lt;div&gt;</code>. Pass
    * <code>null</code> to remove the content from the panel.
    */
  def setPanel(): Unit = js.native
  def setPanel(panel: HTMLElement): Unit = js.native
  
  /**
    * Set the (zero-based) index of the route in the
    * <code>DirectionsResult</code> object to render. By default, the first
    * route in the array will be rendered.
    */
  def setRouteIndex(routeIndex: Double): Unit = js.native
}
