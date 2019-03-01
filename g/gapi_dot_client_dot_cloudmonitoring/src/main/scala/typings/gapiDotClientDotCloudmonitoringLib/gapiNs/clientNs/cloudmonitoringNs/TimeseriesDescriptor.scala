package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesDescriptor extends js.Object {
  /** The label's name. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The name of the metric. */
  var metric: js.UndefOr[java.lang.String] = js.undefined
  /** The Developers Console project number to which this time series belongs. */
  var project: js.UndefOr[java.lang.String] = js.undefined
}

object TimeseriesDescriptor {
  @scala.inline
  def apply(
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    metric: java.lang.String = null,
    project: java.lang.String = null
  ): TimeseriesDescriptor = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[TimeseriesDescriptor]
  }
}

