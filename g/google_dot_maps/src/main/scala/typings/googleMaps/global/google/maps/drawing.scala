package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.drawing.DrawingManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @JSGlobal("google.maps.drawing.DrawingManager")
  @js.native
  /**
    * Allows users to draw markers, polygons, polylines, rectangles, and
    * circles on the map. The <code>DrawingManager</code>&#39;s drawing mode
    * defines the type of overlay that will be created by the user. Adds a
    * control to the map, allowing the user to switch drawing mode.
    *
    * Access by calling `const {DrawingManager} = await
    * google.maps.importLibrary("drawing")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    */
  open class DrawingManager ()
    extends StObject
       with typings.googleMaps.google.maps.drawing.DrawingManager {
    def this(options: DrawingManagerOptions) = this()
  }
  
  @JSGlobal("google.maps.drawing.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.drawing.OverlayType & String] = js.native
    
    /* "circle" */ val CIRCLE: typings.googleMaps.google.maps.drawing.OverlayType.CIRCLE & String = js.native
    
    /* "marker" */ val MARKER: typings.googleMaps.google.maps.drawing.OverlayType.MARKER & String = js.native
    
    /* "polygon" */ val POLYGON: typings.googleMaps.google.maps.drawing.OverlayType.POLYGON & String = js.native
    
    /* "polyline" */ val POLYLINE: typings.googleMaps.google.maps.drawing.OverlayType.POLYLINE & String = js.native
    
    /* "rectangle" */ val RECTANGLE: typings.googleMaps.google.maps.drawing.OverlayType.RECTANGLE & String = js.native
  }
}
