package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maps extends js.Object {
  var DirectionFinder: DirectionFinderEnums
  var StaticMap: StaticMapEnums
  def decodePolyline(polyline: String): js.Array[Double]
  def encodePolyline(points: js.Array[Double]): String
  def newDirectionFinder(): DirectionFinder
  def newElevationSampler(): ElevationSampler
  def newGeocoder(): Geocoder
  def newStaticMap(): StaticMap
  def setAuthentication(clientId: String, signingKey: String): Unit
}

object Maps {
  @scala.inline
  def apply(
    DirectionFinder: DirectionFinderEnums,
    StaticMap: StaticMapEnums,
    decodePolyline: String => js.Array[Double],
    encodePolyline: js.Array[Double] => String,
    newDirectionFinder: () => DirectionFinder,
    newElevationSampler: () => ElevationSampler,
    newGeocoder: () => Geocoder,
    newStaticMap: () => StaticMap,
    setAuthentication: (String, String) => Unit
  ): Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder, StaticMap = StaticMap, decodePolyline = js.Any.fromFunction1(decodePolyline), encodePolyline = js.Any.fromFunction1(encodePolyline), newDirectionFinder = js.Any.fromFunction0(newDirectionFinder), newElevationSampler = js.Any.fromFunction0(newElevationSampler), newGeocoder = js.Any.fromFunction0(newGeocoder), newStaticMap = js.Any.fromFunction0(newStaticMap), setAuthentication = js.Any.fromFunction2(setAuthentication))
  
    __obj.asInstanceOf[Maps]
  }
}

