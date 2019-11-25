package typings.geodesy

import typings.geodesy.latlonDashEllipsoidalDashVincentyMod.LatLonEllipsoidal_Vincenty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FinalBearing extends js.Object {
  var finalBearing: Double
  var iterations: Double
  var point: LatLonEllipsoidal_Vincenty
}

object Anon_FinalBearing {
  @scala.inline
  def apply(finalBearing: Double, iterations: Double, point: LatLonEllipsoidal_Vincenty): Anon_FinalBearing = {
    val __obj = js.Dynamic.literal(finalBearing = finalBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FinalBearing]
  }
}

