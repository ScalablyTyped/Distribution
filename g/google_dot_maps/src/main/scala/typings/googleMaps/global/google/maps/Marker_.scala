package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.MarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.Marker")
@js.native
/**
  * Access by calling `const {Marker} = await
  * google.maps.importLibrary("marker")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  * @param opts Named optional arguments
  */
open class Marker_ ()
  extends StObject
     with typings.googleMaps.google.maps.Marker_ {
  def this(opts: MarkerOptions) = this()
}
/* static members */
object Marker_ {
  
  /**
    * The maximum default z-index that the API will assign to a marker. You may
    * set a higher z-index to bring a marker to the front.
    */
  @JSGlobal("google.maps.Marker.MAX_ZINDEX")
  @js.native
  val MAX_ZINDEX: Double = js.native
}
