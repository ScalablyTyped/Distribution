package typings.gapiDotClientDotMonitoring.gapiNs.clientNs.monitoringNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  /** The set of label values that uniquely identify this metric. All labels listed in the MetricDescriptor must be assigned values. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** An existing metric type, see google.api.MetricDescriptor. For example, custom.googleapis.com/invoice/paid/amount. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Metric {
  @scala.inline
  def apply(labels: Record[String, String] = null, `type`: String = null): Metric = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Metric]
  }
}

