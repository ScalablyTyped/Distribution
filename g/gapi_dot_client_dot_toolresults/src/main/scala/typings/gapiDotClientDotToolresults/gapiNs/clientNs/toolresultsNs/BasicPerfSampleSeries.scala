package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicPerfSampleSeries extends js.Object {
  var perfMetricType: js.UndefOr[String] = js.undefined
  var perfUnit: js.UndefOr[String] = js.undefined
  var sampleSeriesLabel: js.UndefOr[String] = js.undefined
}

object BasicPerfSampleSeries {
  @scala.inline
  def apply(perfMetricType: String = null, perfUnit: String = null, sampleSeriesLabel: String = null): BasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    if (perfMetricType != null) __obj.updateDynamic("perfMetricType")(perfMetricType)
    if (perfUnit != null) __obj.updateDynamic("perfUnit")(perfUnit)
    if (sampleSeriesLabel != null) __obj.updateDynamic("sampleSeriesLabel")(sampleSeriesLabel)
    __obj.asInstanceOf[BasicPerfSampleSeries]
  }
}

