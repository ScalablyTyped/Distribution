package typings.geodesy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geodesyMod {
  type LatLon = LatLonEllipsoidal
  type transform = js.Tuple7[Double, Double, Double, Double, Double, Double, Double]
}
