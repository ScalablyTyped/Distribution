package typings.expoLocation

import typings.expoLocation.anon.LocationServicesEnabled
import typings.expoLocation.locationTypesMod.LocationLastKnownOptions
import typings.expoLocation.locationTypesMod.LocationObject
import typings.expoLocation.locationTypesMod.LocationOptions
import typings.unimodulesPermissionsInterface.mod.PermissionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoLocationWebMod {
  
  object default {
    
    @JSImport("expo-location/build/ExpoLocation.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def geocodeAsync(): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeAsync")().asInstanceOf[js.Promise[js.Array[js.Any]]]
    
    @scala.inline
    def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPositionAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationObject]]
    
    @scala.inline
    def getLastKnownPositionAsync(): js.Promise[LocationObject | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastKnownPositionAsync")().asInstanceOf[js.Promise[LocationObject | Null]]
    @scala.inline
    def getLastKnownPositionAsync(options: LocationLastKnownOptions): js.Promise[LocationObject | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastKnownPositionAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationObject | Null]]
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.getPermissionsAsync")
    @js.native
    def getPermissionsAsync: js.Function0[js.Promise[PermissionResponse]] = js.native
    @scala.inline
    def getPermissionsAsync_=(x: js.Function0[js.Promise[PermissionResponse]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPermissionsAsync")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getProviderStatusAsync(): js.Promise[LocationServicesEnabled] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProviderStatusAsync")().asInstanceOf[js.Promise[LocationServicesEnabled]]
    
    @scala.inline
    def hasServicesEnabledAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasServicesEnabledAsync")().asInstanceOf[js.Promise[Boolean]]
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.name")
    @js.native
    val name: String = js.native
    
    @scala.inline
    def removeWatchAsync(watchId: js.Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWatchAsync")(watchId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def requestPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
    
    @scala.inline
    def reverseGeocodeAsync(): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocodeAsync")().asInstanceOf[js.Promise[js.Array[js.Any]]]
    
    @scala.inline
    def startObserving(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startObserving")().asInstanceOf[Unit]
    
    @scala.inline
    def stopObserving(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopObserving")().asInstanceOf[Unit]
    
    @scala.inline
    def watchDeviceHeading(headingId: js.Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchDeviceHeading")(headingId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def watchPositionImplAsync(watchId: String, options: LocationOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchPositionImplAsync")(watchId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  }
}
