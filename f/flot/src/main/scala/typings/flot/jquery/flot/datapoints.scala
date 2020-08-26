package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait datapoints extends js.Object {
  var format: js.Array[datapointFormat] = js.native
  var points: js.Array[Double] = js.native
  var pointsize: Double = js.native
}

object datapoints {
  @scala.inline
  def apply(format: js.Array[datapointFormat], points: js.Array[Double], pointsize: Double): datapoints = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pointsize = pointsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[datapoints]
  }
  @scala.inline
  implicit class datapointsOps[Self <: datapoints] (val x: Self) extends AnyVal {
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
    def setFormatVarargs(value: datapointFormat*): Self = this.set("format", js.Array(value :_*))
    @scala.inline
    def setFormat(value: js.Array[datapointFormat]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: Double*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Double]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsize(value: Double): Self = this.set("pointsize", value.asInstanceOf[js.Any])
  }
  
}

