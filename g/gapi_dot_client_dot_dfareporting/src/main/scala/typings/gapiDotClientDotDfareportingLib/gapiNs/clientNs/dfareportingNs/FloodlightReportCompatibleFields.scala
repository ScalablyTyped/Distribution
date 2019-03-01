package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightReportCompatibleFields extends js.Object {
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** Dimensions which are compatible to be selected in the "dimensions" section of the report. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** The kind of resource this is, in this case dfareporting#floodlightReportCompatibleFields. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
}

object FloodlightReportCompatibleFields {
  @scala.inline
  def apply(
    dimensionFilters: js.Array[Dimension] = null,
    dimensions: js.Array[Dimension] = null,
    kind: java.lang.String = null,
    metrics: js.Array[Metric] = null
  ): FloodlightReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    __obj.asInstanceOf[FloodlightReportCompatibleFields]
  }
}

