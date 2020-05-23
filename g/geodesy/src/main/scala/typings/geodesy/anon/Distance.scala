package typings.geodesy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  var distance: Double
  var finalBearing: Double
  var initialBearing: Double
  var iterations: Double
}

object Distance {
  @scala.inline
  def apply(distance: Double, finalBearing: Double, initialBearing: Double, iterations: Double): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], finalBearing = finalBearing.asInstanceOf[js.Any], initialBearing = initialBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
}

