package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metric extends js.Object {
  /** The set of label values that uniquely identify this metric. All labels listed in the MetricDescriptor must be assigned values. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** An existing metric type, see google.api.MetricDescriptor. For example, custom.googleapis.com/invoice/paid/amount. */
  var `type`: js.UndefOr[String] = js.native
}

object Metric {
  @scala.inline
  def apply(): Metric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metric]
  }
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

