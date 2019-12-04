package typings.expoDashLocation.buildExpoLocationDotWebMod

import typings.expoDashLocation.Anon_LocationServicesEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-location/build/ExpoLocation.web", JSImport.Default)
@js.native
object default extends js.Object {
  val name: String = js.native
  def geocodeAsync(): js.Promise[js.Array[_]] = js.native
  def getCurrentPositionAsync(options: js.Object): js.Promise[Position | Null] = js.native
  def getProviderStatusAsync(): js.Promise[Anon_LocationServicesEnabled] = js.native
  def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
  def removeWatchAsync(watchId: js.Any): js.Promise[Unit] = js.native
  def requestPermissionsAsync(): js.Promise[PermissionResult] = js.native
  def reverseGeocodeAsync(): js.Promise[js.Array[_]] = js.native
  def watchDeviceHeading(headingId: js.Any): js.Promise[Unit] = js.native
  def watchPositionImplAsync(watchId: String, options: js.Object): js.Promise[String] = js.native
}

