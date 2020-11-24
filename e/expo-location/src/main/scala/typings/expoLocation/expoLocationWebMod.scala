package typings.expoLocation

import typings.expoLocation.anon.LocationServicesEnabled
import typings.expoLocation.locationTypesMod.LocationLastKnownOptions
import typings.expoLocation.locationTypesMod.LocationObject
import typings.expoLocation.locationTypesMod.LocationOptions
import typings.unimodulesPermissionsInterface.mod.PermissionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location/build/ExpoLocation.web", JSImport.Namespace)
@js.native
object expoLocationWebMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def geocodeAsync(): js.Promise[js.Array[_]] = js.native
    
    def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationObject] = js.native
    
    def getLastKnownPositionAsync(): js.Promise[LocationObject | Null] = js.native
    def getLastKnownPositionAsync(options: LocationLastKnownOptions): js.Promise[LocationObject | Null] = js.native
    
    var getPermissionsAsync: js.Function0[js.Promise[PermissionResponse]] = js.native
    
    def getProviderStatusAsync(): js.Promise[LocationServicesEnabled] = js.native
    
    def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
    
    val name: String = js.native
    
    def removeWatchAsync(watchId: js.Any): js.Promise[Unit] = js.native
    
    def requestPermissionsAsync(): js.Promise[PermissionResponse] = js.native
    
    def reverseGeocodeAsync(): js.Promise[js.Array[_]] = js.native
    
    def startObserving(): Unit = js.native
    
    def stopObserving(): Unit = js.native
    
    def watchDeviceHeading(headingId: js.Any): js.Promise[Unit] = js.native
    
    def watchPositionImplAsync(watchId: String, options: LocationOptions): js.Promise[String] = js.native
  }
}
