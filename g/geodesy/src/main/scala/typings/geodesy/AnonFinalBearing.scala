package typings.geodesy

import typings.geodesy.latlonEllipsoidalVincentyMod.LatLonEllipsoidalVincenty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFinalBearing extends js.Object {
  var finalBearing: Double
  var iterations: Double
  var point: LatLonEllipsoidalVincenty
}

object AnonFinalBearing {
  @scala.inline
  def apply(finalBearing: Double, iterations: Double, point: LatLonEllipsoidalVincenty): AnonFinalBearing = {
    val __obj = js.Dynamic.literal(finalBearing = finalBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFinalBearing]
  }
}

