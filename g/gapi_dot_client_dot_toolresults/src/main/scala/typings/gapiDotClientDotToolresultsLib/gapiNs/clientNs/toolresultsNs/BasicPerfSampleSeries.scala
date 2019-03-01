package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicPerfSampleSeries extends js.Object {
  var perfMetricType: js.UndefOr[java.lang.String] = js.undefined
  var perfUnit: js.UndefOr[java.lang.String] = js.undefined
  var sampleSeriesLabel: js.UndefOr[java.lang.String] = js.undefined
}

object BasicPerfSampleSeries {
  @scala.inline
  def apply(
    perfMetricType: java.lang.String = null,
    perfUnit: java.lang.String = null,
    sampleSeriesLabel: java.lang.String = null
  ): BasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    if (perfMetricType != null) __obj.updateDynamic("perfMetricType")(perfMetricType)
    if (perfUnit != null) __obj.updateDynamic("perfUnit")(perfUnit)
    if (sampleSeriesLabel != null) __obj.updateDynamic("sampleSeriesLabel")(sampleSeriesLabel)
    __obj.asInstanceOf[BasicPerfSampleSeries]
  }
}

