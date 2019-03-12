package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maps extends js.Object {
  var DirectionFinder: DirectionFinderEnums
  var StaticMap: StaticMapEnums
  def decodePolyline(polyline: java.lang.String): js.Array[stdLib.Number]
  def encodePolyline(points: js.Array[stdLib.Number]): java.lang.String
  def newDirectionFinder(): DirectionFinder
  def newElevationSampler(): ElevationSampler
  def newGeocoder(): Geocoder
  def newStaticMap(): StaticMap
  def setAuthentication(clientId: java.lang.String, signingKey: java.lang.String): scala.Unit
}

object Maps {
  @scala.inline
  def apply(
    DirectionFinder: DirectionFinderEnums,
    StaticMap: StaticMapEnums,
    decodePolyline: java.lang.String => js.Array[stdLib.Number],
    encodePolyline: js.Array[stdLib.Number] => java.lang.String,
    newDirectionFinder: () => DirectionFinder,
    newElevationSampler: () => ElevationSampler,
    newGeocoder: () => Geocoder,
    newStaticMap: () => StaticMap,
    setAuthentication: (java.lang.String, java.lang.String) => scala.Unit
  ): Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder, StaticMap = StaticMap, decodePolyline = js.Any.fromFunction1(decodePolyline), encodePolyline = js.Any.fromFunction1(encodePolyline), newDirectionFinder = js.Any.fromFunction0(newDirectionFinder), newElevationSampler = js.Any.fromFunction0(newElevationSampler), newGeocoder = js.Any.fromFunction0(newGeocoder), newStaticMap = js.Any.fromFunction0(newStaticMap), setAuthentication = js.Any.fromFunction2(setAuthentication))
  
    __obj.asInstanceOf[Maps]
  }
}

