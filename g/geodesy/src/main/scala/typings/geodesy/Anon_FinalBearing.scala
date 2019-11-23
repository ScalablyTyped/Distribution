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
    val __obj = js.Dynamic.literal(finalBearing = finalBearing, iterations = iterations, point = point)
  
    __obj.asInstanceOf[Anon_FinalBearing]
  }
}

