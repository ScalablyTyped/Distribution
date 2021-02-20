package typings.expoLocation

import typings.expoLocation.anon.LocationServicesEnabled
import typings.expoLocation.locationTypesMod.LocationLastKnownOptions
import typings.expoLocation.locationTypesMod.LocationObject
import typings.expoLocation.locationTypesMod.LocationOptions
import typings.unimodulesPermissionsInterface.mod.PermissionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoLocationWebMod {
  
  object default {
    
    @JSImport("expo-location/build/ExpoLocation.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.geocodeAsync")
    @js.native
    def geocodeAsync(): js.Promise[js.Array[_]] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.getCurrentPositionAsync")
    @js.native
    def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationObject] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.getLastKnownPositionAsync")
    @js.native
    def getLastKnownPositionAsync(): js.Promise[LocationObject | Null] = js.native
    @JSImport("expo-location/build/ExpoLocation.web", "default.getLastKnownPositionAsync")
    @js.native
    def getLastKnownPositionAsync(options: LocationLastKnownOptions): js.Promise[LocationObject | Null] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.getPermissionsAsync")
    @js.native
    def getPermissionsAsync: js.Function0[js.Promise[PermissionResponse]] = js.native
    @scala.inline
    def getPermissionsAsync_=(x: js.Function0[js.Promise[PermissionResponse]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPermissionsAsync")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.getProviderStatusAsync")
    @js.native
    def getProviderStatusAsync(): js.Promise[LocationServicesEnabled] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.hasServicesEnabledAsync")
    @js.native
    def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.name")
    @js.native
    val name: String = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.removeWatchAsync")
    @js.native
    def removeWatchAsync(watchId: js.Any): js.Promise[Unit] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.requestPermissionsAsync")
    @js.native
    def requestPermissionsAsync(): js.Promise[PermissionResponse] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.reverseGeocodeAsync")
    @js.native
    def reverseGeocodeAsync(): js.Promise[js.Array[_]] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.startObserving")
    @js.native
    def startObserving(): Unit = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.stopObserving")
    @js.native
    def stopObserving(): Unit = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.watchDeviceHeading")
    @js.native
    def watchDeviceHeading(headingId: js.Any): js.Promise[Unit] = js.native
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.watchPositionImplAsync")
    @js.native
    def watchPositionImplAsync(watchId: String, options: LocationOptions): js.Promise[String] = js.native
  }
}
