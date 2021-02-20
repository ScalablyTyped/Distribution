package typings.expoLocation

import typings.expoLocation.anon.Latitude
import typings.expoLocation.locationTypesMod.LocationGeocodedAddress
import typings.expoLocation.locationTypesMod.LocationGeocodedLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationGoogleGeocodingMod {
  
  @JSImport("expo-location/build/LocationGoogleGeocoding", "googleGeocodeAsync")
  @js.native
  def googleGeocodeAsync(address: String): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  
  @JSImport("expo-location/build/LocationGoogleGeocoding", "googleReverseGeocodeAsync")
  @js.native
  def googleReverseGeocodeAsync(options: Latitude): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  
  @JSImport("expo-location/build/LocationGoogleGeocoding", "setGoogleApiKey")
  @js.native
  def setGoogleApiKey(apiKey: String): Unit = js.native
}
