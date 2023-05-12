package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.InfoWindowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.InfoWindow")
@js.native
/**
  * An overlay that looks like a bubble and is often connected to a marker.
  *
  * Access by calling `const {InfoWindow} = await
  * google.maps.importLibrary("maps")` or `const {InfoWindow} = await
  * google.maps.importLibrary("streetView")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class InfoWindow ()
  extends StObject
     with typings.googleMaps.google.maps.InfoWindow {
  def this(opts: InfoWindowOptions) = this()
}
