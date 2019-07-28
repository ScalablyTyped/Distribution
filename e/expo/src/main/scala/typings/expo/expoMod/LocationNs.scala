package typings.expo.expoMod

import typings.expo.Anon_Heading
import typings.expo.expoMod.LocationNs.Accuracy
import typings.expo.expoMod.LocationNs.Coords
import typings.expo.expoMod.LocationNs.GeocodeData
import typings.expo.expoMod.LocationNs.HeadingStatus
import typings.expo.expoMod.LocationNs.LocationCallback
import typings.expo.expoMod.LocationNs.LocationData
import typings.expo.expoMod.LocationNs.LocationOptions
import typings.expo.expoMod.LocationNs.LocationProps
import typings.expo.expoMod.LocationNs.LocationTaskOptions
import typings.expo.expoMod.LocationNs.ProviderStatus
import typings.expo.expoMod.LocationNs.Region
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Location")
@js.native
object LocationNs extends js.Object {
  @js.native
  sealed trait Accuracy extends js.Object
  
  trait Coords extends LocationProps {
    var accuracy: Double
    var altitude: Double
  }
  
  trait GeocodeData extends js.Object {
    var city: String
    var country: String
    var name: String
    var postalCode: String
    var region: String
    var street: String
  }
  
  trait HeadingStatus extends js.Object {
    var accuracy: Double
    var magHeading: Double
    var trueHeading: Double
  }
  
  trait LocationData extends js.Object {
    var coords: Anon_Heading with Coords
    var timestamp: Double
  }
  
  trait LocationOptions extends js.Object {
    var accuracy: Double
    var distanceInterval: js.UndefOr[Double] = js.undefined
    var timeInterval: js.UndefOr[Double] = js.undefined
    var timeout: js.UndefOr[Double] = js.undefined
  }
  
  trait LocationProps extends js.Object {
    var latitude: Double
    var longitude: Double
  }
  
  trait LocationTaskOptions extends js.Object {
    var accuracy: js.UndefOr[Double] = js.undefined
    var distanceInterval: Double
    var showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.undefined
    var timeInterval: Double
  }
  
  trait ProviderStatus extends js.Object {
    var gpsAvailable: js.UndefOr[Boolean] = js.undefined
    var locationServicesEnabled: Boolean
    var networkAvailable: js.UndefOr[Boolean] = js.undefined
    var passiveAvailable: js.UndefOr[Boolean] = js.undefined
  }
  
  trait Region extends js.Object {
    var identifier: js.UndefOr[String] = js.undefined
    var latitude: Double
    var longitude: Double
    var notifyOnEnter: js.UndefOr[Boolean] = js.undefined
    var notifyOnExit: js.UndefOr[Boolean] = js.undefined
    var radius: Double
  }
  
  def geocodeAsync(address: String): js.Promise[Coords] = js.native
  def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationData] = js.native
  def getHeadingAsync(): js.Promise[HeadingStatus] = js.native
  def getProviderStatusAsync(): js.Promise[ProviderStatus] = js.native
  def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
  def hasStartedGeofencingAsync(taskName: String): js.Promise[Boolean] = js.native
  def hasStartedLocationUpdatesAsync(taskName: String): js.Promise[Boolean] = js.native
  def requestPermissionsAsync(): js.Promise[Unit] = js.native
  def reverseGeocodeAsync(location: LocationProps): js.Promise[js.Array[GeocodeData]] = js.native
  def setApiKey(key: String): Unit = js.native
  def startGeofencingAsync(taskName: String, regions: js.Array[Region]): js.Promise[Unit] = js.native
  def startLocationUpdatesAsync(taskName: String, options: LocationTaskOptions): js.Promise[Unit] = js.native
  def stopGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  def stopLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  def watchHeadingAsync(callback: js.Function1[/* status */ HeadingStatus, Unit]): EventSubscription = js.native
  def watchPositionAsync(options: LocationOptions, callback: LocationCallback): EventSubscription = js.native
  @js.native
  object Accuracy extends js.Object {
    @js.native
    sealed trait Balanced extends Accuracy
    
    @js.native
    sealed trait BestForNavigation extends Accuracy
    
    @js.native
    sealed trait High extends Accuracy
    
    @js.native
    sealed trait Highest extends Accuracy
    
    @js.native
    sealed trait Low extends Accuracy
    
    @js.native
    sealed trait Lowest extends Accuracy
    
    /* 3 */ val Balanced: typings.expo.expoMod.LocationNs.Accuracy.Balanced with Double = js.native
    /* 6 */ val BestForNavigation: typings.expo.expoMod.LocationNs.Accuracy.BestForNavigation with Double = js.native
    /* 4 */ val High: typings.expo.expoMod.LocationNs.Accuracy.High with Double = js.native
    /* 5 */ val Highest: typings.expo.expoMod.LocationNs.Accuracy.Highest with Double = js.native
    /* 2 */ val Low: typings.expo.expoMod.LocationNs.Accuracy.Low with Double = js.native
    /* 1 */ val Lowest: typings.expo.expoMod.LocationNs.Accuracy.Lowest with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Accuracy with Double] = js.native
  }
  
  type LocationCallback = js.Function1[/* data */ LocationData, Unit]
}

