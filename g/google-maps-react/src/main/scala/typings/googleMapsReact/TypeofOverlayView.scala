package typings.googleMapsReact

import org.scalablytyped.runtime.Instantiable0
import typings.googlemaps.google.maps.OverlayView
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofOverlayView extends Instantiable0[OverlayView] {
  /**
    * Stops click, tap, drag, and wheel events on the element from bubbling up to the map. Use this to prevent map dragging and zooming, as well as map "click" events.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#OverlayView.preventMapHitsAndGesturesFrom Maps JavaScript API}
    */
  def preventMapHitsAndGesturesFrom(element: Element): Unit = js.native
  /**
    * Stops click or tap on the element from bubbling up to the map. Use this to prevent the map from triggering "click" events.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#OverlayView.preventMapHitsFrom Maps JavaScript API}
    */
  def preventMapHitsFrom(element: Element): Unit = js.native
}

