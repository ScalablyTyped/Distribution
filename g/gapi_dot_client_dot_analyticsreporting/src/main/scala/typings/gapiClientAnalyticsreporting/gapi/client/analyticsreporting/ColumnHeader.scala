package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnHeader extends js.Object {
  /** The dimension names in the response. */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  /** Metric headers for the metrics in the response. */
  var metricHeader: js.UndefOr[MetricHeader] = js.native
}

object ColumnHeader {
  @scala.inline
  def apply(): ColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeader]
  }
  @scala.inline
  implicit class ColumnHeaderOps[Self <: ColumnHeader] (val x: Self) extends AnyVal {
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
    def setDimensionsVarargs(value: String*): Self = this.set("dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[String]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setMetricHeader(value: MetricHeader): Self = this.set("metricHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricHeader: Self = this.set("metricHeader", js.undefined)
  }
  
}

