package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationSampler extends js.Object {
  def sampleLocation(latitude: scala.Double, longitude: scala.Double): js.Any = js.native
  def sampleLocations(encodedPolyline: java.lang.String): js.Any = js.native
  def sampleLocations(points: js.Array[scala.Double]): js.Any = js.native
  def samplePath(
    encodedPolyline: java.lang.String,
    numSamples: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Any = js.native
  def samplePath(points: js.Array[scala.Double], numSamples: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): js.Any = js.native
}

