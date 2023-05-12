package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLOverlayView
  extends StObject
     with MVCObject {
  
  def getMap(): js.UndefOr[Map | Null] = js.native
  
  /**
    * Implement this method to fetch or create intermediate data structures
    * before the overlay is drawn that don’t require immediate access to the
    * WebGL rendering context. This method must be implemented to render.
    */
  def onAdd(): Unit = js.native
  
  /**
    * This method is called when the rendering context is lost for any reason,
    * and is where you should clean up any pre-existing GL state, since it is
    * no longer needed.
    */
  def onContextLost(): Unit = js.native
  
  /**
    * This method is called once the rendering context is available. Use it to
    * initialize or bind any WebGL state such as shaders or buffer objects.
    * @param options that allow developers to restore the GL context.
    */
  def onContextRestored(options: WebGLStateOptions): Unit = js.native
  
  /**
    * Implement this method to draw WebGL content directly on the map. Note
    * that if the overlay needs a new frame drawn then call {@link
    * google.maps.WebGLOverlayView.requestRedraw}.
    * @param options that allow developers to render content to an associated
    *     Google basemap.
    */
  def onDraw(options: WebGLDrawOptions): Unit = js.native
  
  /**
    * This method is called when the overlay is removed from the map with
    * <code>WebGLOverlayView.setMap(null)</code>, and is where you should
    * remove all intermediate objects. This method must be implemented to
    * render.
    */
  def onRemove(): Unit = js.native
  
  /**
    * Implement this method to handle any GL state updates outside of the
    * render animation frame.
    * @param options that allow developerse to restore the GL context.
    */
  def onStateUpdate(options: WebGLStateOptions): Unit = js.native
  
  /**
    * Triggers the map to redraw a frame.
    */
  def requestRedraw(): Unit = js.native
  
  /**
    * Triggers the map to update GL state.
    */
  def requestStateUpdate(): Unit = js.native
  
  /**
    * Adds the overlay to the map.
    * @param map The map to access the div, model and view state.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
}
