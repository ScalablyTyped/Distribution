package typings.geopoint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geopoint", JSImport.Namespace)
@js.native
class ^ protected () extends GeoPoint {
  def this(lat: Double, lon: Double) = this()
  def this(lat: Double, lon: Double, inRadians: Boolean) = this()
}

@JSImport("geopoint", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def degreesToRadians(value: Double): Double = js.native
  def kilometersToMiles(value: Double): Double = js.native
  def milesToKilometers(value: Double): Double = js.native
  def radiansToDegrees(value: Double): Double = js.native
}

