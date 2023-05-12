package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.MapOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.Map")
@js.native
open class Map protected ()
  extends StObject
     with typings.googleMaps.google.maps.Map {
  /**
    * Access by calling `const {Map} = await
    * google.maps.importLibrary("maps")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    * @param mapDiv The map will render to fill this element.
    * @param opts Options
    */
  def this(mapDiv: HTMLElement) = this()
  def this(mapDiv: HTMLElement, opts: MapOptions) = this()
}
/* static members */
object Map {
  
  /**
    * Map ID which can be used for code samples which require a Map ID. This
    * Map ID is not intended for use in production applications and cannot be
    * used for features which require cloud configuration (such as Cloud
    * Styling).
    */
  @JSGlobal("google.maps.Map.DEMO_MAP_ID")
  @js.native
  val DEMO_MAP_ID: String = js.native
}
