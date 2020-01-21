package typings.gapiClientToolresults.gapi.client.toolresults

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
    if (perfMetricType != null) __obj.updateDynamic("perfMetricType")(perfMetricType.asInstanceOf[js.Any])
    if (perfUnit != null) __obj.updateDynamic("perfUnit")(perfUnit.asInstanceOf[js.Any])
    if (sampleSeriesLabel != null) __obj.updateDynamic("sampleSeriesLabel")(sampleSeriesLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicPerfSampleSeries]
  }
}

