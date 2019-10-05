package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationSampler extends js.Object {
  def sampleLocation(latitude: Double, longitude: Double): js.Any = js.native
  def sampleLocations(encodedPolyline: String): js.Any = js.native
  def sampleLocations(points: js.Array[Double]): js.Any = js.native
  def samplePath(encodedPolyline: String, numSamples: Integer): js.Any = js.native
  def samplePath(points: js.Array[Double], numSamples: Integer): js.Any = js.native
}

