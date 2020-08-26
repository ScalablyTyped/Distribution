package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeseriesPoint extends js.Object {
  /** The data point in this time series snapshot. */
  var point: js.UndefOr[Point] = js.native
  /** The descriptor of this time series. */
  var timeseriesDesc: js.UndefOr[TimeseriesDescriptor] = js.native
}

object TimeseriesPoint {
  @scala.inline
  def apply(): TimeseriesPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeseriesPoint]
  }
  @scala.inline
  implicit class TimeseriesPointOps[Self <: TimeseriesPoint] (val x: Self) extends AnyVal {
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
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setTimeseriesDesc(value: TimeseriesDescriptor): Self = this.set("timeseriesDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeseriesDesc: Self = this.set("timeseriesDesc", js.undefined)
  }
  
}

