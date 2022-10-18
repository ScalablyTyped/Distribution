package typings.expoLocation

import typings.expoLocation.anon.PickLocationGeocodedLocat
import typings.expoLocation.buildLocationDottypesMod.LocationAccuracy
import typings.expoLocation.buildLocationDottypesMod.LocationActivityType
import typings.expoLocation.buildLocationDottypesMod.LocationCallback
import typings.expoLocation.buildLocationDottypesMod.LocationGeocodedAddress
import typings.expoLocation.buildLocationDottypesMod.LocationGeocodedLocation
import typings.expoLocation.buildLocationDottypesMod.LocationGeocodingOptions
import typings.expoLocation.buildLocationDottypesMod.LocationGeofencingEventType
import typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState
import typings.expoLocation.buildLocationDottypesMod.LocationHeadingCallback
import typings.expoLocation.buildLocationDottypesMod.LocationHeadingObject
import typings.expoLocation.buildLocationDottypesMod.LocationLastKnownOptions
import typings.expoLocation.buildLocationDottypesMod.LocationObject
import typings.expoLocation.buildLocationDottypesMod.LocationOptions
import typings.expoLocation.buildLocationDottypesMod.LocationPermissionResponse
import typings.expoLocation.buildLocationDottypesMod.LocationProviderStatus
import typings.expoLocation.buildLocationDottypesMod.LocationRegion
import typings.expoLocation.buildLocationDottypesMod.LocationSubscription
import typings.expoLocation.buildLocationDottypesMod.LocationTaskOptions
import typings.expoModulesCore.buildPermissionsHookMod.PermissionHookOptions
import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-location", "Accuracy")
  @js.native
  object Accuracy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationAccuracy & Double] = js.native
    
    /* 3 */ val Balanced: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Balanced & Double = js.native
    
    /* 6 */ val BestForNavigation: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.BestForNavigation & Double = js.native
    
    /* 4 */ val High: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.High & Double = js.native
    
    /* 5 */ val Highest: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Highest & Double = js.native
    
    /* 2 */ val Low: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Low & Double = js.native
    
    /* 1 */ val Lowest: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Lowest & Double = js.native
  }
  
  @JSImport("expo-location", "ActivityType")
  @js.native
  object ActivityType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationActivityType & Double] = js.native
    
    /* 5 */ val Airborne: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Airborne & Double = js.native
    
    /* 2 */ val AutomotiveNavigation: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.AutomotiveNavigation & Double = js.native
    
    /* 3 */ val Fitness: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Fitness & Double = js.native
    
    /* 1 */ val Other: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Other & Double = js.native
    
    /* 4 */ val OtherNavigation: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.OtherNavigation & Double = js.native
  }
  
  @JSImport("expo-location", "EventEmitter")
  @js.native
  val EventEmitter: typings.expoModulesCore.mod.EventEmitter = js.native
  
  @JSImport("expo-location", "GeofencingEventType")
  @js.native
  object GeofencingEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationGeofencingEventType & Double] = js.native
    
    /* 1 */ val Enter: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingEventType.Enter & Double = js.native
    
    /* 2 */ val Exit: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingEventType.Exit & Double = js.native
  }
  
  @JSImport("expo-location", "GeofencingRegionState")
  @js.native
  object GeofencingRegionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationGeofencingRegionState & Double] = js.native
    
    /* 1 */ val Inside: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Inside & Double = js.native
    
    /* 2 */ val Outside: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Outside & Double = js.native
    
    /* 0 */ val Unknown: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Unknown & Double = js.native
  }
  
  @JSImport("expo-location", "LocationAccuracy")
  @js.native
  object LocationAccuracy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.buildLocationDottypesMod.LocationAccuracy & Double] = js.native
    
    /* 3 */ val Balanced: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Balanced & Double = js.native
    
    /* 6 */ val BestForNavigation: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.BestForNavigation & Double = js.native
    
    /* 4 */ val High: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.High & Double = js.native
    
    /* 5 */ val Highest: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Highest & Double = js.native
    
    /* 2 */ val Low: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Low & Double = js.native
    
    /* 1 */ val Lowest: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Lowest & Double = js.native
  }
  
  @JSImport("expo-location", "LocationActivityType")
  @js.native
  object LocationActivityType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.buildLocationDottypesMod.LocationActivityType & Double] = js.native
    
    /* 5 */ val Airborne: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Airborne & Double = js.native
    
    /* 2 */ val AutomotiveNavigation: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.AutomotiveNavigation & Double = js.native
    
    /* 3 */ val Fitness: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Fitness & Double = js.native
    
    /* 1 */ val Other: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Other & Double = js.native
    
    /* 4 */ val OtherNavigation: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.OtherNavigation & Double = js.native
  }
  
  @JSImport("expo-location", "LocationGeofencingEventType")
  @js.native
  object LocationGeofencingEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.expoLocation.buildLocationDottypesMod.LocationGeofencingEventType & Double
      ] = js.native
    
    /* 1 */ val Enter: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingEventType.Enter & Double = js.native
    
    /* 2 */ val Exit: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingEventType.Exit & Double = js.native
  }
  
  @JSImport("expo-location", "LocationGeofencingRegionState")
  @js.native
  object LocationGeofencingRegionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState & Double
      ] = js.native
    
    /* 1 */ val Inside: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Inside & Double = js.native
    
    /* 2 */ val Outside: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Outside & Double = js.native
    
    /* 0 */ val Unknown: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Unknown & Double = js.native
  }
  
  @JSImport("expo-location", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus & String] = js.native
    
    /* "denied" */ val DENIED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.DENIED & String = js.native
    
    /* "granted" */ val GRANTED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.GRANTED & String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.UNDETERMINED & String = js.native
  }
  
  inline def enableNetworkProviderAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetworkProviderAsync")().asInstanceOf[js.Promise[Unit]]
  
  inline def geocodeAsync(address: String): js.Promise[js.Array[LocationGeocodedLocation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeAsync")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LocationGeocodedLocation]]]
  inline def geocodeAsync(address: String, options: LocationGeocodingOptions): js.Promise[js.Array[LocationGeocodedLocation]] = (^.asInstanceOf[js.Dynamic].applyDynamic("geocodeAsync")(address.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[LocationGeocodedLocation]]]
  
  inline def getBackgroundPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
  
  inline def getCurrentPositionAsync(): js.Promise[LocationObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPositionAsync")().asInstanceOf[js.Promise[LocationObject]]
  inline def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPositionAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationObject]]
  
  inline def getCurrentWatchId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_getCurrentWatchId")().asInstanceOf[Double]
  
  inline def getForegroundPermissionsAsync(): js.Promise[LocationPermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getForegroundPermissionsAsync")().asInstanceOf[js.Promise[LocationPermissionResponse]]
  
  inline def getHeadingAsync(): js.Promise[LocationHeadingObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadingAsync")().asInstanceOf[js.Promise[LocationHeadingObject]]
  
  inline def getLastKnownPositionAsync(): js.Promise[LocationObject | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastKnownPositionAsync")().asInstanceOf[js.Promise[LocationObject | Null]]
  inline def getLastKnownPositionAsync(options: LocationLastKnownOptions): js.Promise[LocationObject | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastKnownPositionAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationObject | Null]]
  
  inline def getPermissionsAsync(): js.Promise[LocationPermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionsAsync")().asInstanceOf[js.Promise[LocationPermissionResponse]]
  
  inline def getProviderStatusAsync(): js.Promise[LocationProviderStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProviderStatusAsync")().asInstanceOf[js.Promise[LocationProviderStatus]]
  
  inline def hasServicesEnabledAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasServicesEnabledAsync")().asInstanceOf[js.Promise[Boolean]]
  
  inline def hasStartedGeofencingAsync(taskName: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasStartedGeofencingAsync")(taskName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def hasStartedLocationUpdatesAsync(taskName: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasStartedLocationUpdatesAsync")(taskName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def installWebGeolocationPolyfill(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installWebGeolocationPolyfill")().asInstanceOf[Unit]
  
  inline def isBackgroundLocationAvailableAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isBackgroundLocationAvailableAsync")().asInstanceOf[js.Promise[Boolean]]
  
  inline def requestBackgroundPermissionsAsync(): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestBackgroundPermissionsAsync")().asInstanceOf[js.Promise[PermissionResponse]]
  
  inline def requestForegroundPermissionsAsync(): js.Promise[LocationPermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestForegroundPermissionsAsync")().asInstanceOf[js.Promise[LocationPermissionResponse]]
  
  inline def requestPermissionsAsync(): js.Promise[LocationPermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermissionsAsync")().asInstanceOf[js.Promise[LocationPermissionResponse]]
  
  inline def reverseGeocodeAsync(location: PickLocationGeocodedLocat): js.Promise[js.Array[LocationGeocodedAddress]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocodeAsync")(location.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LocationGeocodedAddress]]]
  inline def reverseGeocodeAsync(location: PickLocationGeocodedLocat, options: LocationGeocodingOptions): js.Promise[js.Array[LocationGeocodedAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocodeAsync")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[LocationGeocodedAddress]]]
  
  inline def setGoogleApiKey(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startGeofencingAsync(taskName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("startGeofencingAsync")(taskName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def startGeofencingAsync(taskName: String, regions: js.Array[LocationRegion]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startGeofencingAsync")(taskName.asInstanceOf[js.Any], regions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startLocationUpdatesAsync(taskName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("startLocationUpdatesAsync")(taskName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def startLocationUpdatesAsync(taskName: String, options: LocationTaskOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startLocationUpdatesAsync")(taskName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def stopGeofencingAsync(taskName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopGeofencingAsync")(taskName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def stopLocationUpdatesAsync(taskName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopLocationUpdatesAsync")(taskName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def useBackgroundPermissions(): js.Tuple3[
    PermissionResponse | Null, 
    js.Function0[js.Promise[PermissionResponse]], 
    js.Function0[js.Promise[PermissionResponse]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBackgroundPermissions")().asInstanceOf[js.Tuple3[
    PermissionResponse | Null, 
    js.Function0[js.Promise[PermissionResponse]], 
    js.Function0[js.Promise[PermissionResponse]]
  ]]
  inline def useBackgroundPermissions(options: PermissionHookOptions[js.Object]): js.Tuple3[
    PermissionResponse | Null, 
    js.Function0[js.Promise[PermissionResponse]], 
    js.Function0[js.Promise[PermissionResponse]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBackgroundPermissions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    PermissionResponse | Null, 
    js.Function0[js.Promise[PermissionResponse]], 
    js.Function0[js.Promise[PermissionResponse]]
  ]]
  
  inline def useForegroundPermissions(): js.Tuple3[
    LocationPermissionResponse | Null, 
    js.Function0[js.Promise[LocationPermissionResponse]], 
    js.Function0[js.Promise[LocationPermissionResponse]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForegroundPermissions")().asInstanceOf[js.Tuple3[
    LocationPermissionResponse | Null, 
    js.Function0[js.Promise[LocationPermissionResponse]], 
    js.Function0[js.Promise[LocationPermissionResponse]]
  ]]
  inline def useForegroundPermissions(options: PermissionHookOptions[js.Object]): js.Tuple3[
    LocationPermissionResponse | Null, 
    js.Function0[js.Promise[LocationPermissionResponse]], 
    js.Function0[js.Promise[LocationPermissionResponse]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForegroundPermissions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    LocationPermissionResponse | Null, 
    js.Function0[js.Promise[LocationPermissionResponse]], 
    js.Function0[js.Promise[LocationPermissionResponse]]
  ]]
  
  inline def watchHeadingAsync(callback: LocationHeadingCallback): js.Promise[LocationSubscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchHeadingAsync")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationSubscription]]
  
  inline def watchPositionAsync(options: LocationOptions, callback: LocationCallback): js.Promise[LocationSubscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchPositionAsync")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LocationSubscription]]
}
