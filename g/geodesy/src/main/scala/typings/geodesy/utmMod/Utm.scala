package typings.geodesy.utmMod

import typings.geodesy.geodesyMod.Datum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utm extends js.Object {
  var convergence: Double | Null = js.native
  var datum: Datum = js.native
  var easting: Double = js.native
  var hemisphere: Hemisphere = js.native
  var northing: Double = js.native
  var scale: Double | Null = js.native
  var zone: Double = js.native
  def toLatLon(): LatLon_Utm = js.native
  def toString(digits: Double): String = js.native
}

