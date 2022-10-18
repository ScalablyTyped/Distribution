package typings.expoLocation

import typings.expoLocation.anon.LocationServicesEnabled
import typings.expoLocation.buildLocationDottypesMod.LocationLastKnownOptions
import typings.expoLocation.buildLocationDottypesMod.LocationObject
import typings.expoLocation.buildLocationDottypesMod.LocationOptions
import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExpoLocationDotwebMod {
  
  object default {
    
    @JSImport("expo-location/build/ExpoLocation.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def geocodeAsync(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeAsync")().asInstanceOf[js.Promise[js.Array[Any]]]
    
    inline def getBackgroundPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
    
    inline def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPositionAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationObject]]
    
    inline def getForegroundPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getForegroundPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
    
    inline def getLastKnownPositionAsync(): js.Promise[LocationObject | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastKnownPositionAsync")().asInstanceOf[js.Promise[LocationObject | Null]]
    inline def getLastKnownPositionAsync(options: LocationLastKnownOptions): js.Promise[LocationObject | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastKnownPositionAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationObject | Null]]
    
    inline def getPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
    @JSImport("expo-location/build/ExpoLocation.web", "default.getPermissionsAsync")
    @js.native
    def getPermissionsAsync_Fdefault: js.Function0[js.Promise[PermissionResponse]] = js.native
    
    inline def getPermissionsAsync_Fdefault_=(x: js.Function0[js.Promise[PermissionResponse]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPermissionsAsync")(x.asInstanceOf[js.Any])
    
    inline def getProviderStatusAsync(): js.Promise[LocationServicesEnabled] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProviderStatusAsync")().asInstanceOf[js.Promise[LocationServicesEnabled]]
    
    inline def hasServicesEnabledAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasServicesEnabledAsync")().asInstanceOf[js.Promise[Boolean]]
    
    @JSImport("expo-location/build/ExpoLocation.web", "default.name")
    @js.native
    val name: String = js.native
    
    inline def removeWatchAsync(watchId: Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWatchAsync")(watchId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def requestBackgroundPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestBackgroundPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
    
    inline def requestForegroundPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestForegroundPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
    
    inline def requestPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
    
    inline def reverseGeocodeAsync(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocodeAsync")().asInstanceOf[js.Promise[js.Array[Any]]]
    
    inline def startObserving(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startObserving")().asInstanceOf[Unit]
    
    inline def stopObserving(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopObserving")().asInstanceOf[Unit]
    
    inline def watchDeviceHeading(headingId: Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchDeviceHeading")(headingId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def watchPositionImplAsync(watchId: String, options: LocationOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchPositionImplAsync")(watchId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  }
}
