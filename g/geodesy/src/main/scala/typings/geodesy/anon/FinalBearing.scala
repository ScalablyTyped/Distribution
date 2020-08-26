package typings.geodesy.anon

import typings.geodesy.latlonEllipsoidalVincentyMod.LatLonEllipsoidalVincenty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalBearing extends js.Object {
  var finalBearing: Double = js.native
  var iterations: Double = js.native
  var point: LatLonEllipsoidalVincenty = js.native
}

object FinalBearing {
  @scala.inline
  def apply(finalBearing: Double, iterations: Double, point: LatLonEllipsoidalVincenty): FinalBearing = {
    val __obj = js.Dynamic.literal(finalBearing = finalBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalBearing]
  }
  @scala.inline
  implicit class FinalBearingOps[Self <: FinalBearing] (val x: Self) extends AnyVal {
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
    def setFinalBearing(value: Double): Self = this.set("finalBearing", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: LatLonEllipsoidalVincenty): Self = this.set("point", value.asInstanceOf[js.Any])
  }
  
}

