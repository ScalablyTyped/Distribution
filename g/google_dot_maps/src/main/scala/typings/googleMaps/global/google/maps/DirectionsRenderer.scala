package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.DirectionsRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.DirectionsRenderer")
@js.native
/**
  * Renders directions obtained from the <code><a
  * href="#DirectionsService">DirectionsService</a></code>.
  *
  * Access by calling `const {DirectionsRenderer} = await
  * google.maps.importLibrary("routes")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class DirectionsRenderer ()
  extends StObject
     with typings.googleMaps.google.maps.DirectionsRenderer {
  def this(opts: DirectionsRendererOptions) = this()
}
