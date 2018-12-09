package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Location")
@js.native
object LocationNs extends js.Object {
  
  trait Coords extends LocationProps {
    var accuracy: scala.Double
    var altitude: scala.Double
  }
  
  
  trait GeocodeData extends js.Object {
    var city: java.lang.String
    var country: java.lang.String
    var name: java.lang.String
    var postalCode: java.lang.String
    var region: java.lang.String
    var street: java.lang.String
  }
  
  
  trait HeadingStatus extends js.Object {
    var accuracy: scala.Double
    var magHeading: scala.Double
    var trueHeading: scala.Double
  }
  
  
  trait LocationData extends js.Object {
    var coords: expoLib.Anon_Speed with Coords
    var timestamp: scala.Double
  }
  
  
  trait LocationOptions extends js.Object {
    var distanceInterval: js.UndefOr[scala.Double] = js.undefined
    var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
    var timeInterval: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait LocationProps extends js.Object {
    var latitude: scala.Double
    var longitude: scala.Double
  }
  
  
  trait ProviderStatus extends js.Object {
    var gpsAvailable: js.UndefOr[scala.Boolean] = js.undefined
    var locationServicesEnabled: scala.Boolean
    var networkAvailable: js.UndefOr[scala.Boolean] = js.undefined
    var passiveAvailable: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  def geocodeAsync(address: java.lang.String): js.Promise[Coords] = js.native
  def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationData] = js.native
  def getHeadingAsync(): js.Promise[HeadingStatus] = js.native
  def getProviderStatusAsync(): js.Promise[ProviderStatus] = js.native
  def reverseGeocodeAsync(location: LocationProps): js.Promise[js.Array[GeocodeData]] = js.native
  def setApiKey(key: java.lang.String): scala.Unit = js.native
  def watchHeadingAsync(callback: js.Function1[/* status */ HeadingStatus, scala.Unit]): fbemitterLib.fbemitterMod.EventSubscription = js.native
  def watchPositionAsync(options: LocationOptions, callback: LocationCallback): fbemitterLib.fbemitterMod.EventSubscription = js.native
  type LocationCallback = js.Function1[/* data */ LocationData, scala.Unit]
}

