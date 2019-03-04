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
    decodePolyline: js.Function1[java.lang.String, js.Array[stdLib.Number]],
    encodePolyline: js.Function1[js.Array[stdLib.Number], java.lang.String],
    newDirectionFinder: js.Function0[DirectionFinder],
    newElevationSampler: js.Function0[ElevationSampler],
    newGeocoder: js.Function0[Geocoder],
    newStaticMap: js.Function0[StaticMap],
    setAuthentication: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder, StaticMap = StaticMap, decodePolyline = decodePolyline, encodePolyline = encodePolyline, newDirectionFinder = newDirectionFinder, newElevationSampler = newElevationSampler, newGeocoder = newGeocoder, newStaticMap = newStaticMap, setAuthentication = setAuthentication)
  
    __obj.asInstanceOf[Maps]
  }
}

