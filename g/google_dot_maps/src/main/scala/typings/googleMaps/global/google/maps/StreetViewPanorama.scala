package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.StreetViewPanoramaOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.StreetViewPanorama")
@js.native
open class StreetViewPanorama protected ()
  extends StObject
     with typings.googleMaps.google.maps.StreetViewPanorama {
  /**
    * Displays the panorama for a given <code>LatLng</code> or panorama ID. A
    * <code>StreetViewPanorama</code> object provides a Street View
    * &quot;viewer&quot; which can be stand-alone within a separate
    * <code>&lt;div&gt;</code> or bound to a <code>Map</code>.
    *
    * Access by calling `const {StreetViewPanorama} = await
    * google.maps.importLibrary("streetView")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    */
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, opts: StreetViewPanoramaOptions) = this()
}
