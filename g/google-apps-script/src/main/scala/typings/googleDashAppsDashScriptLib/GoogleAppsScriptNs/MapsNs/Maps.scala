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

