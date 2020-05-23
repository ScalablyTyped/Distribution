package typings.geodesy.anon

import typings.geodesy.latlonEllipsoidalVincentyMod.LatLonEllipsoidalVincenty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalBearing extends js.Object {
  var finalBearing: Double
  var iterations: Double
  var point: LatLonEllipsoidalVincenty
}

object FinalBearing {
  @scala.inline
  def apply(finalBearing: Double, iterations: Double, point: LatLonEllipsoidalVincenty): FinalBearing = {
    val __obj = js.Dynamic.literal(finalBearing = finalBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalBearing]
  }
}

