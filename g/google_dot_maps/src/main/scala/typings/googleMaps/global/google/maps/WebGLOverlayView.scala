package typings.googleMaps.global.google.maps

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
@JSGlobal("google.maps.WebGLOverlayView")
@js.native
open class WebGLOverlayView ()
  extends StObject
     with typings.googleMaps.google.maps.WebGLOverlayView
