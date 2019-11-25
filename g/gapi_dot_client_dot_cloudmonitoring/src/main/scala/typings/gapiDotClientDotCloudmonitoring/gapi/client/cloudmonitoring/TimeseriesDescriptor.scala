package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesDescriptor extends js.Object {
  /** The label's name. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** The name of the metric. */
  var metric: js.UndefOr[String] = js.undefined
  /** The Developers Console project number to which this time series belongs. */
  var project: js.UndefOr[String] = js.undefined
}

object TimeseriesDescriptor {
  @scala.inline
  def apply(labels: Record[String, String] = null, metric: String = null, project: String = null): TimeseriesDescriptor = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeseriesDescriptor]
  }
}

