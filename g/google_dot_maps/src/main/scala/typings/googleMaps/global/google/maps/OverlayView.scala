package typings.googleMaps.global.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.OverlayView")
@js.native
open class OverlayView ()
  extends StObject
     with typings.googleMaps.google.maps.OverlayView
/* static members */
object OverlayView {
  
  @JSGlobal("google.maps.OverlayView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Stops click, tap, drag, and wheel events on the element from bubbling up
    * to the map. Use this to prevent map dragging and zooming, as well as map
    * &quot;click&quot; events.
    */
  inline def preventMapHitsAndGesturesFrom(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventMapHitsAndGesturesFrom")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Stops click or tap on the element from bubbling up to the map. Use this
    * to prevent the map from triggering &quot;click&quot; events.
    */
  inline def preventMapHitsFrom(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventMapHitsFrom")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
