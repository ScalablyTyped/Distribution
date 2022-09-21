package typings.googleMaps.global.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * You can implement this class if you want to display custom types of overlay
  * objects on the map. <br><br>Inherit from this class by setting your
  * overlay&#39;s prototype: <code>MyOverlay.prototype = new
  * google.maps.OverlayView();</code>. The <code>OverlayView</code> constructor
  * is guaranteed to be an empty function. <br><br>You must implement three
  * methods: <code>onAdd()</code>, <code>draw()</code>, and
  * <code>onRemove()</code>. <ul> <li>In the <code>onAdd()</code> method, you
  * should create DOM objects and append them as children of the panes.</li>
  * <li>In the <code>draw()</code> method, you should position these
  * elements.</li> <li>In the <code>onRemove()</code> method, you should remove
  * the objects from the DOM.</li> </ul> You must call <code>setMap()</code>
  * with a valid <code>Map</code> object to trigger the call to the
  * <code>onAdd()</code> method and <code>setMap(null)</code> in order to
  * trigger the <code>onRemove()</code> method. The <code>setMap()</code>
  * method can be called at the time of construction or at any point afterward
  * when the overlay should be re-shown after removing. The <code>draw()</code>
  * method will then be called whenever a map property changes that could
  * change the position of the element, such as zoom, center, or map type.
  */
@JSGlobal("google.maps.OverlayView")
@js.native
open class OverlayView ()
  extends StObject
     with typings.googleMaps.google.maps.OverlayView
object OverlayView {
  
  @JSGlobal("google.maps.OverlayView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Stops click, tap, drag, and wheel events on the element from bubbling up
    * to the map. Use this to prevent map dragging and zooming, as well as map
    * &quot;click&quot; events.
    */
  /* static member */
  inline def preventMapHitsAndGesturesFrom(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventMapHitsAndGesturesFrom")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Stops click or tap on the element from bubbling up to the map. Use this
    * to prevent the map from triggering &quot;click&quot; events.
    */
  /* static member */
  inline def preventMapHitsFrom(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventMapHitsFrom")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
