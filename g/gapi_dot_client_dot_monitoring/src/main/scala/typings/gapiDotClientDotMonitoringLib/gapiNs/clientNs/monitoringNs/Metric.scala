package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  /** The set of label values that uniquely identify this metric. All labels listed in the MetricDescriptor must be assigned values. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** An existing metric type, see google.api.MetricDescriptor. For example, custom.googleapis.com/invoice/paid/amount. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Metric {
  @scala.inline
  def apply(labels: stdLib.Record[java.lang.String, java.lang.String] = null, `type`: java.lang.String = null): Metric = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Metric]
  }
}

