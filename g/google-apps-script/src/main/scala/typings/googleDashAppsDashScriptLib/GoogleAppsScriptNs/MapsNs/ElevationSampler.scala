package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationSampler extends js.Object {
  def sampleLocation(latitude: stdLib.Number, longitude: stdLib.Number): js.Object = js.native
  def sampleLocations(encodedPolyline: java.lang.String): js.Object = js.native
  def sampleLocations(points: js.Array[stdLib.Number]): js.Object = js.native
  def samplePath(
    encodedPolyline: java.lang.String,
    numSamples: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Object = js.native
  def samplePath(
    points: js.Array[stdLib.Number],
    numSamples: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Object = js.native
}

