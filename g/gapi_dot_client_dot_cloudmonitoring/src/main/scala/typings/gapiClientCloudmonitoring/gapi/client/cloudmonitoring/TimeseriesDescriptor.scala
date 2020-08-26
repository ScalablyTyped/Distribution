package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeseriesDescriptor extends js.Object {
  /** The label's name. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** The name of the metric. */
  var metric: js.UndefOr[String] = js.native
  /** The Developers Console project number to which this time series belongs. */
  var project: js.UndefOr[String] = js.native
}

object TimeseriesDescriptor {
  @scala.inline
  def apply(): TimeseriesDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeseriesDescriptor]
  }
  @scala.inline
  implicit class TimeseriesDescriptorOps[Self <: TimeseriesDescriptor] (val x: Self) extends AnyVal {
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
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
  
}

