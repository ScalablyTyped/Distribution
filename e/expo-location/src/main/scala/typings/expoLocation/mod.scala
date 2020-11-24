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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val EventEmitter: typings.unimodulesCore.mod.EventEmitter = js.native
  
  def enableNetworkProviderAsync(): js.Promise[Unit] = js.native
  
  def geocodeAsync(address: String): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  def geocodeAsync(address: String, options: LocationGeocodingOptions): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  
  def getCurrentPositionAsync(): js.Promise[LocationObject] = js.native
  def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationObject] = js.native
  
  @JSName("_getCurrentWatchId")
  def getCurrentWatchId(): Double = js.native
  
  def getHeadingAsync(): js.Promise[LocationHeadingObject] = js.native
  
  def getLastKnownPositionAsync(): js.Promise[LocationObject | Null] = js.native
  def getLastKnownPositionAsync(options: LocationLastKnownOptions): js.Promise[LocationObject | Null] = js.native
  
  def getPermissionsAsync(): js.Promise[LocationPermissionResponse] = js.native
  
  def getProviderStatusAsync(): js.Promise[LocationProviderStatus] = js.native
  
  def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
  
  def hasStartedGeofencingAsync(taskName: String): js.Promise[Boolean] = js.native
  
  def hasStartedLocationUpdatesAsync(taskName: String): js.Promise[Boolean] = js.native
  
  def installWebGeolocationPolyfill(): Unit = js.native
  
  def isBackgroundLocationAvailableAsync(): js.Promise[Boolean] = js.native
  
  def requestPermissionsAsync(): js.Promise[LocationPermissionResponse] = js.native
  
  def reverseGeocodeAsync(location: PickLocationGeocodedLocat): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  def reverseGeocodeAsync(location: PickLocationGeocodedLocat, options: LocationGeocodingOptions): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  
  def setApiKey(apiKey: String): Unit = js.native
  
  def setGoogleApiKey(apiKey: String): Unit = js.native
  
  def startGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  def startGeofencingAsync(taskName: String, regions: js.Array[LocationRegion]): js.Promise[Unit] = js.native
  
  def startLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  def startLocationUpdatesAsync(taskName: String, options: LocationTaskOptions): js.Promise[Unit] = js.native
  
  def stopGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  
  def stopLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  
  def watchHeadingAsync(callback: LocationHeadingCallback): js.Promise[LocationSubscription] = js.native
  
  def watchPositionAsync(options: LocationOptions, callback: LocationCallback): js.Promise[Remove] = js.native
  
  @js.native
  object Accuracy extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationAccuracy with Double] = js.native
    
    /* 3 */ val Balanced: typings.expoLocation.locationTypesMod.LocationAccuracy.Balanced with Double = js.native
    
    /* 6 */ val BestForNavigation: typings.expoLocation.locationTypesMod.LocationAccuracy.BestForNavigation with Double = js.native
    
    /* 4 */ val High: typings.expoLocation.locationTypesMod.LocationAccuracy.High with Double = js.native
    
    /* 5 */ val Highest: typings.expoLocation.locationTypesMod.LocationAccuracy.Highest with Double = js.native
    
    /* 2 */ val Low: typings.expoLocation.locationTypesMod.LocationAccuracy.Low with Double = js.native
    
    /* 1 */ val Lowest: typings.expoLocation.locationTypesMod.LocationAccuracy.Lowest with Double = js.native
  }
  
  @js.native
  object ActivityType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationActivityType with Double] = js.native
    
    /* 5 */ val Airborne: typings.expoLocation.locationTypesMod.LocationActivityType.Airborne with Double = js.native
    
    /* 2 */ val AutomotiveNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.AutomotiveNavigation with Double = js.native
    
    /* 3 */ val Fitness: typings.expoLocation.locationTypesMod.LocationActivityType.Fitness with Double = js.native
    
    /* 1 */ val Other: typings.expoLocation.locationTypesMod.LocationActivityType.Other with Double = js.native
    
    /* 4 */ val OtherNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.OtherNavigation with Double = js.native
  }
  
  @js.native
  object GeofencingEventType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationGeofencingEventType with Double] = js.native
    
    /* 1 */ val Enter: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Enter with Double = js.native
    
    /* 2 */ val Exit: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Exit with Double = js.native
  }
  
  @js.native
  object GeofencingRegionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationGeofencingRegionState with Double] = js.native
    
    /* 1 */ val Inside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Inside with Double = js.native
    
    /* 2 */ val Outside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Outside with Double = js.native
    
    /* 0 */ val Unknown: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Unknown with Double = js.native
  }
  
  @js.native
  object LocationAccuracy extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.locationTypesMod.LocationAccuracy with Double] = js.native
    
    /* 3 */ val Balanced: typings.expoLocation.locationTypesMod.LocationAccuracy.Balanced with Double = js.native
    
    /* 6 */ val BestForNavigation: typings.expoLocation.locationTypesMod.LocationAccuracy.BestForNavigation with Double = js.native
    
    /* 4 */ val High: typings.expoLocation.locationTypesMod.LocationAccuracy.High with Double = js.native
    
    /* 5 */ val Highest: typings.expoLocation.locationTypesMod.LocationAccuracy.Highest with Double = js.native
    
    /* 2 */ val Low: typings.expoLocation.locationTypesMod.LocationAccuracy.Low with Double = js.native
    
    /* 1 */ val Lowest: typings.expoLocation.locationTypesMod.LocationAccuracy.Lowest with Double = js.native
  }
  
  @js.native
  object LocationActivityType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.locationTypesMod.LocationActivityType with Double] = js.native
    
    /* 5 */ val Airborne: typings.expoLocation.locationTypesMod.LocationActivityType.Airborne with Double = js.native
    
    /* 2 */ val AutomotiveNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.AutomotiveNavigation with Double = js.native
    
    /* 3 */ val Fitness: typings.expoLocation.locationTypesMod.LocationActivityType.Fitness with Double = js.native
    
    /* 1 */ val Other: typings.expoLocation.locationTypesMod.LocationActivityType.Other with Double = js.native
    
    /* 4 */ val OtherNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.OtherNavigation with Double = js.native
  }
  
  @js.native
  object LocationGeofencingEventType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.locationTypesMod.LocationGeofencingEventType with Double] = js.native
    
    /* 1 */ val Enter: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Enter with Double = js.native
    
    /* 2 */ val Exit: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Exit with Double = js.native
  }
  
  @js.native
  object LocationGeofencingRegionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocation.locationTypesMod.LocationGeofencingRegionState with Double] = js.native
    
    /* 1 */ val Inside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Inside with Double = js.native
    
    /* 2 */ val Outside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Outside with Double = js.native
    
    /* 0 */ val Unknown: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Unknown with Double = js.native
  }
  
  @js.native
  object PermissionStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.unimodulesPermissionsInterface.mod.PermissionStatus with String] = js.native
    
    /* "denied" */ val DENIED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED with String = js.native
    
    /* "granted" */ val GRANTED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED with String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED with String = js.native
  }
}
