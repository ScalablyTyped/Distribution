package typings.expoLocation

import typings.expoLocation.anon.Latitude
import typings.expoLocation.locationTypesMod.LocationGeocodedAddress
import typings.expoLocation.locationTypesMod.LocationGeocodedLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationGoogleGeocodingMod {
  
  @JSImport("expo-location/build/LocationGoogleGeocoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def googleGeocodeAsync(address: String): js.Promise[js.Array[LocationGeocodedLocation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("googleGeocodeAsync")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LocationGeocodedLocation]]]
  
  @scala.inline
  def googleReverseGeocodeAsync(options: Latitude): js.Promise[js.Array[LocationGeocodedAddress]] = ^.asInstanceOf[js.Dynamic].applyDynamic("googleReverseGeocodeAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LocationGeocodedAddress]]]
  
  @scala.inline
  def setGoogleApiKey(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
