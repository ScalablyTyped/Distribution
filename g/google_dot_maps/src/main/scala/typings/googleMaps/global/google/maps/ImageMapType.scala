package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.ImageMapTypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.ImageMapType")
@js.native
/**
  * This class implements the MapType interface and is provided for rendering
  * image tiles.
  *
  * Access by calling `const {ImageMapType} = await
  * google.maps.importLibrary("maps")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class ImageMapType ()
  extends StObject
     with typings.googleMaps.google.maps.ImageMapType {
  def this(opts: ImageMapTypeOptions) = this()
}
