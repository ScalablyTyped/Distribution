package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnHeader extends js.Object {
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  var metricHeader: js.UndefOr[MetricHeader] = js.undefined
}

object ColumnHeader {
  @scala.inline
  def apply(dimensions: js.Array[String] = null, metricHeader: MetricHeader = null): ColumnHeader = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (metricHeader != null) __obj.updateDynamic("metricHeader")(metricHeader)
    __obj.asInstanceOf[ColumnHeader]
  }
}

