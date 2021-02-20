package typings.expoLocation

import typings.expoLocation.anon.PickLocationGeocodedLocat
import typings.expoLocation.anon.Remove
import typings.expoLocation.locationTypesMod.LocationAccuracy
import typings.expoLocation.locationTypesMod.LocationActivityType
import typings.expoLocation.locationTypesMod.LocationCallback
import typings.expoLocation.locationTypesMod.LocationGeocodedAddress
import typings.expoLocation.locationTypesMod.LocationGeocodedLocation
import typings.expoLocation.locationTypesMod.LocationGeocodingOptions
import typings.expoLocation.locationTypesMod.LocationGeofencingEventType
import typings.expoLocation.locationTypesMod.LocationGeofencingRegionState
import typings.expoLocation.locationTypesMod.LocationHeadingCallback
import typings.expoLocation.locationTypesMod.LocationHeadingObject
import typings.expoLocation.locationTypesMod.LocationLastKnownOptions
import typings.expoLocation.locationTypesMod.LocationObject
import typings.expoLocation.locationTypesMod.LocationOptions
import typings.expoLocation.locationTypesMod.LocationPermissionResponse
import typings.expoLocation.locationTypesMod.LocationProviderStatus
import typings.expoLocation.locationTypesMod.LocationRegion
import typings.expoLocation.locationTypesMod.LocationSubscription
import typings.expoLocation.locationTypesMod.LocationTaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-location", "Accuracy")
  @js.native
  object Accuracy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationAccuracy with Double] = js.native
    
    /* 3 */ val Balanced: typings.expoLocation.locationTypesMod.LocationAccuracy.Balanced with Double = js.native
    
    /* 6 */ val BestForNavigation: typings.expoLocation.locationTypesMod.LocationAccuracy.BestForNavigation with Double = js.native
    
    /* 4 */ val High: typings.expoLocation.locationTypesMod.LocationAccuracy.High with Double = js.native
    
    /* 5 */ val Highest: typings.expoLocation.locationTypesMod.LocationAccuracy.Highest with Double = js.native
    
    /* 2 */ val Low: typings.expoLocation.locationTypesMod.LocationAccuracy.Low with Double = js.native
    
    /* 1 */ val Lowest: typings.expoLocation.locationTypesMod.LocationAccuracy.Lowest with Double = js.native
  }
  
  @JSImport("expo-location", "ActivityType")
  @js.native
  object ActivityType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationActivityType with Double] = js.native
    
    /* 5 */ val Airborne: typings.expoLocation.locationTypesMod.LocationActivityType.Airborne with Double = js.native
    
    /* 2 */ val AutomotiveNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.AutomotiveNavigation with Double = js.native
    
    /* 3 */ val Fitness: typings.expoLocation.locationTypesMod.LocationActivityType.Fitness with Double = js.native
    
    /* 1 */ val Other: typings.expoLocation.locationTypesMod.LocationActivityType.Other with Double = js.native
    
    /* 4 */ val OtherNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.OtherNavigation with Double = js.native
  }
  
  @JSImport("expo-location", "EventEmitter")
  @js.native
  val EventEmitter: typings.unimodulesCore.mod.EventEmitter = js.native
  
  @JSImport("expo-location", "GeofencingEventType")
  @js.native
  object GeofencingEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationGeofencingEventType with Double] = js.native
    
    /* 1 */ val Enter: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Enter with Double = js.native
    
    /* 2 */ val Exit: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Exit with Double = js.native
  }
  
  @JSImport("expo-location", "GeofencingRegionState")
  @js.native
  object GeofencingRegionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationGeofencingRegionState with Double] = js.native
    
    /* 1 */ val Inside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Inside with Double = js.native
    
    /* 2 */ val Outside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Outside with Double = js.native
    
    /* 0 */ val Unknown: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Unknown with Double = js.native
  }
  
  @JSImport("expo-location", "LocationAccuracy")
  @js.native
  object LocationAccuracy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.locationTypesMod.LocationAccuracy with Double] = js.native
    
    /* 3 */ val Balanced: typings.expoLocation.locationTypesMod.LocationAccuracy.Balanced with Double = js.native
    
    /* 6 */ val BestForNavigation: typings.expoLocation.locationTypesMod.LocationAccuracy.BestForNavigation with Double = js.native
    
    /* 4 */ val High: typings.expoLocation.locationTypesMod.LocationAccuracy.High with Double = js.native
    
    /* 5 */ val Highest: typings.expoLocation.locationTypesMod.LocationAccuracy.Highest with Double = js.native
    
    /* 2 */ val Low: typings.expoLocation.locationTypesMod.LocationAccuracy.Low with Double = js.native
    
    /* 1 */ val Lowest: typings.expoLocation.locationTypesMod.LocationAccuracy.Lowest with Double = js.native
  }
  
  @JSImport("expo-location", "LocationActivityType")
  @js.native
  object LocationActivityType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.locationTypesMod.LocationActivityType with Double] = js.native
    
    /* 5 */ val Airborne: typings.expoLocation.locationTypesMod.LocationActivityType.Airborne with Double = js.native
    
    /* 2 */ val AutomotiveNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.AutomotiveNavigation with Double = js.native
    
    /* 3 */ val Fitness: typings.expoLocation.locationTypesMod.LocationActivityType.Fitness with Double = js.native
    
    /* 1 */ val Other: typings.expoLocation.locationTypesMod.LocationActivityType.Other with Double = js.native
    
    /* 4 */ val OtherNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.OtherNavigation with Double = js.native
  }
  
  @JSImport("expo-location", "LocationGeofencingEventType")
  @js.native
  object LocationGeofencingEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.locationTypesMod.LocationGeofencingEventType with Double] = js.native
    
    /* 1 */ val Enter: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Enter with Double = js.native
    
    /* 2 */ val Exit: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Exit with Double = js.native
  }
  
  @JSImport("expo-location", "LocationGeofencingRegionState")
  @js.native
  object LocationGeofencingRegionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.locationTypesMod.LocationGeofencingRegionState with Double] = js.native
    
    /* 1 */ val Inside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Inside with Double = js.native
    
    /* 2 */ val Outside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Outside with Double = js.native
    
    /* 0 */ val Unknown: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Unknown with Double = js.native
  }
  
  @JSImport("expo-location", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.unimodulesPermissionsInterface.mod.PermissionStatus with String] = js.native
    
    /* "denied" */ val DENIED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED with String = js.native
    
    /* "granted" */ val GRANTED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED with String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED with String = js.native
  }
  
  @JSImport("expo-location", "enableNetworkProviderAsync")
  @js.native
  def enableNetworkProviderAsync(): js.Promise[Unit] = js.native
  
  @JSImport("expo-location", "geocodeAsync")
  @js.native
  def geocodeAsync(address: String): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  @JSImport("expo-location", "geocodeAsync")
  @js.native
  def geocodeAsync(address: String, options: LocationGeocodingOptions): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  
  @JSImport("expo-location", "getCurrentPositionAsync")
  @js.native
  def getCurrentPositionAsync(): js.Promise[LocationObject] = js.native
  @JSImport("expo-location", "getCurrentPositionAsync")
  @js.native
  def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationObject] = js.native
  
  @JSImport("expo-location", "_getCurrentWatchId")
  @js.native
  def getCurrentWatchId(): Double = js.native
  
  @JSImport("expo-location", "getHeadingAsync")
  @js.native
  def getHeadingAsync(): js.Promise[LocationHeadingObject] = js.native
  
  @JSImport("expo-location", "getLastKnownPositionAsync")
  @js.native
  def getLastKnownPositionAsync(): js.Promise[LocationObject | Null] = js.native
  @JSImport("expo-location", "getLastKnownPositionAsync")
  @js.native
  def getLastKnownPositionAsync(options: LocationLastKnownOptions): js.Promise[LocationObject | Null] = js.native
  
  @JSImport("expo-location", "getPermissionsAsync")
  @js.native
  def getPermissionsAsync(): js.Promise[LocationPermissionResponse] = js.native
  
  @JSImport("expo-location", "getProviderStatusAsync")
  @js.native
  def getProviderStatusAsync(): js.Promise[LocationProviderStatus] = js.native
  
  @JSImport("expo-location", "hasServicesEnabledAsync")
  @js.native
  def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
  
  @JSImport("expo-location", "hasStartedGeofencingAsync")
  @js.native
  def hasStartedGeofencingAsync(taskName: String): js.Promise[Boolean] = js.native
  
  @JSImport("expo-location", "hasStartedLocationUpdatesAsync")
  @js.native
  def hasStartedLocationUpdatesAsync(taskName: String): js.Promise[Boolean] = js.native
  
  @JSImport("expo-location", "installWebGeolocationPolyfill")
  @js.native
  def installWebGeolocationPolyfill(): Unit = js.native
  
  @JSImport("expo-location", "isBackgroundLocationAvailableAsync")
  @js.native
  def isBackgroundLocationAvailableAsync(): js.Promise[Boolean] = js.native
  
  @JSImport("expo-location", "requestPermissionsAsync")
  @js.native
  def requestPermissionsAsync(): js.Promise[LocationPermissionResponse] = js.native
  
  @JSImport("expo-location", "reverseGeocodeAsync")
  @js.native
  def reverseGeocodeAsync(location: PickLocationGeocodedLocat): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  @JSImport("expo-location", "reverseGeocodeAsync")
  @js.native
  def reverseGeocodeAsync(location: PickLocationGeocodedLocat, options: LocationGeocodingOptions): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  
  @JSImport("expo-location", "setApiKey")
  @js.native
  def setApiKey(apiKey: String): Unit = js.native
  
  @JSImport("expo-location", "setGoogleApiKey")
  @js.native
  def setGoogleApiKey(apiKey: String): Unit = js.native
  
  @JSImport("expo-location", "startGeofencingAsync")
  @js.native
  def startGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  @JSImport("expo-location", "startGeofencingAsync")
  @js.native
  def startGeofencingAsync(taskName: String, regions: js.Array[LocationRegion]): js.Promise[Unit] = js.native
  
  @JSImport("expo-location", "startLocationUpdatesAsync")
  @js.native
  def startLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  @JSImport("expo-location", "startLocationUpdatesAsync")
  @js.native
  def startLocationUpdatesAsync(taskName: String, options: LocationTaskOptions): js.Promise[Unit] = js.native
  
  @JSImport("expo-location", "stopGeofencingAsync")
  @js.native
  def stopGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  
  @JSImport("expo-location", "stopLocationUpdatesAsync")
  @js.native
  def stopLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  
  @JSImport("expo-location", "watchHeadingAsync")
  @js.native
  def watchHeadingAsync(callback: LocationHeadingCallback): js.Promise[LocationSubscription] = js.native
  
  @JSImport("expo-location", "watchPositionAsync")
  @js.native
  def watchPositionAsync(options: LocationOptions, callback: LocationCallback): js.Promise[Remove] = js.native
}
