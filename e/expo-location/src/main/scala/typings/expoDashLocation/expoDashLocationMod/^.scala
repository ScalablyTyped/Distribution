package typings.expoDashLocation.expoDashLocationMod

import typings.expoDashLocation.Anon_Latitude
import typings.expoDashLocation.Anon_Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-location", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EventEmitter: typings.atUnimodulesCore.atUnimodulesCoreMod.EventEmitter = js.native
  def _getCurrentWatchId(): Double = js.native
  def enableNetworkProviderAsync(): js.Promise[Unit] = js.native
  def geocodeAsync(address: String): js.Promise[js.Array[GeocodedLocation]] = js.native
  def getCurrentPositionAsync(): js.Promise[LocationData] = js.native
  def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationData] = js.native
  def getHeadingAsync(): js.Promise[HeadingData] = js.native
  def getProviderStatusAsync(): js.Promise[ProviderStatus] = js.native
  def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
  def hasStartedGeofencingAsync(taskName: String): js.Promise[Boolean] = js.native
  def hasStartedLocationUpdatesAsync(taskName: String): js.Promise[Boolean] = js.native
  def installWebGeolocationPolyfill(): Unit = js.native
  def isBackgroundLocationAvailableAsync(): js.Promise[Boolean] = js.native
  def requestPermissionsAsync(): js.Promise[Unit] = js.native
  def reverseGeocodeAsync(location: Anon_Latitude): js.Promise[js.Array[Address]] = js.native
  def setApiKey(apiKey: String): Unit = js.native
  def startGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  def startGeofencingAsync(taskName: String, regions: js.Array[Region]): js.Promise[Unit] = js.native
  def startLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  def startLocationUpdatesAsync(taskName: String, options: LocationTaskOptions): js.Promise[Unit] = js.native
  def stopGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  def stopLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  def watchHeadingAsync(callback: HeadingCallback): js.Promise[Anon_Remove] = js.native
  def watchPositionAsync(options: LocationOptions, callback: LocationCallback): js.Promise[Anon_Remove] = js.native
}

