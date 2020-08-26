package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeseries extends js.Object {
  /** The data points of this time series. The points are listed in order of their end timestamp, from younger to older. */
  var points: js.UndefOr[js.Array[Point]] = js.native
  /** The descriptor of this time series. */
  var timeseriesDesc: js.UndefOr[TimeseriesDescriptor] = js.native
}

object Timeseries {
  @scala.inline
  def apply(): Timeseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeseries]
  }
  @scala.inline
  implicit class TimeseriesOps[Self <: Timeseries] (val x: Self) extends AnyVal {
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
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setTimeseriesDesc(value: TimeseriesDescriptor): Self = this.set("timeseriesDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeseriesDesc: Self = this.set("timeseriesDesc", js.undefined)
  }
  
}

