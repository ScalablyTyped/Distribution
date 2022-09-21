package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The WebGL Overlay View provides direct access to the same WebGL rendering
  * context Google Maps Platform uses to render the vector basemap. This use of
  * a shared rendering context provides benefits such as depth occlusion with
  * 3D building geometry, and the ability to sync 2D/3D content with basemap
  * rendering. <br><br>With WebGL Overlay View you can add content to your maps
  * using WebGL directly, or popular Graphics libraries like Three.js or
  * deck.gl. To use the overlay, you can extend
  * <code>google.maps.WebGLOverlayView</code> and provide an implementation for
  * each of the following lifecycle hooks: {@link
  * google.maps.WebGLOverlayView.onAdd}, {@link
  * google.maps.WebGLOverlayView.onContextRestored}, {@link
  * google.maps.WebGLOverlayView.onDraw}, {@link
  * google.maps.WebGLOverlayView.onContextLost} and {@link
  * google.maps.WebGLOverlayView.onRemove}. <br><br>You must call {@link
  * google.maps.WebGLOverlayView.setMap} with a valid {@link google.maps.Map}
  * object to trigger the call to the <code>onAdd()</code> method and
  * <code>setMap(null)</code> in order to trigger the <code>onRemove()</code>
  * method. The <code>setMap()</code> method can be called at the time of
  * construction or at any point afterward when the overlay should be re-shown
  * after removing. The <code>onDraw()</code> method will then be called
  * whenever a map property changes that could change the position of the
  * element, such as zoom, center, or map type. WebGLOverlayView may only be
  * added to a vector map having a {@link google.maps.MapOptions.mapId}.
  */
@js.native
trait WebGLOverlayView
  extends StObject
     with MVCObject {
  
  def getMap(): js.UndefOr[Map | Null] = js.native
  
  /**
    * Implement this method to fetch or create intermediate data structures
    * before the overlay is drawn that don’t require immediate access to the
    * WebGL rendering context.
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
    * remove all intermediate objects.
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
