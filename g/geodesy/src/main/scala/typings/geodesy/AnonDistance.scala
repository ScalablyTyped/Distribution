package typings.geodesy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDistance extends js.Object {
  var distance: Double
  var finalBearing: Double
  var initialBearing: Double
  var iterations: Double
}

object AnonDistance {
  @scala.inline
  def apply(distance: Double, finalBearing: Double, initialBearing: Double, iterations: Double): AnonDistance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], finalBearing = finalBearing.asInstanceOf[js.Any], initialBearing = initialBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDistance]
  }
}

