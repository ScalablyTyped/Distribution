package typings.geodesy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distance extends js.Object {
  var distance: Double = js.native
  var finalBearing: Double = js.native
  var initialBearing: Double = js.native
  var iterations: Double = js.native
}

object Distance {
  @scala.inline
  def apply(distance: Double, finalBearing: Double, initialBearing: Double, iterations: Double): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], finalBearing = finalBearing.asInstanceOf[js.Any], initialBearing = initialBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  @scala.inline
  implicit class DistanceOps[Self <: Distance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalBearing(value: Double): Self = this.set("finalBearing", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialBearing(value: Double): Self = this.set("initialBearing", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
  }
  
}

