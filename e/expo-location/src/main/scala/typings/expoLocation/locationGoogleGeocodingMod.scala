package typings.expoLocation

import typings.expoLocation.anon.Latitude
import typings.expoLocation.locationTypesMod.LocationGeocodedAddress
import typings.expoLocation.locationTypesMod.LocationGeocodedLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location/build/LocationGoogleGeocoding", JSImport.Namespace)
@js.native
object locationGoogleGeocodingMod extends js.Object {
  
  def googleGeocodeAsync(address: String): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  
  def googleReverseGeocodeAsync(options: Latitude): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  
  def setGoogleApiKey(apiKey: String): Unit = js.native
}
