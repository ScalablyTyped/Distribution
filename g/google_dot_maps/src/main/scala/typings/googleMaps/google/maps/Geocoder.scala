package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geocoder extends StObject {
  
  /**
    * Geocode a request.
    */
  def geocode(request: GeocoderRequest): js.Promise[GeocoderResponse] = js.native
  def geocode(
    request: GeocoderRequest,
    callback: js.Function2[/* a */ Null | js.Array[GeocoderResult], /* b */ GeocoderStatus, Unit]
  ): js.Promise[GeocoderResponse] = js.native
}
