package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScorecardChartSpec extends js.Object {
  /**
    * The aggregation type for key and baseline chart data in scorecard chart.
    * This field is optional.
    */
  var aggregateType: js.UndefOr[String] = js.undefined
  /**
    * The data for scorecard baseline value.
    * This field is optional.
    */
  var baselineValueData: js.UndefOr[ChartData] = js.undefined
  /**
    * Formatting options for baseline value.
    * This field is needed only if baseline_value_data is specified.
    */
  var baselineValueFormat: js.UndefOr[BaselineValueFormat] = js.undefined
  /**
    * Custom formatting options for numeric key/baseline values in scorecard
    * chart. This field is used only when number_format_source is set to
    * CUSTOM. This field is optional.
    */
  var customFormatOptions: js.UndefOr[ChartCustomNumberFormatOptions] = js.undefined
  /** The data for scorecard key value. */
  var keyValueData: js.UndefOr[ChartData] = js.undefined
  /** Formatting options for key value. */
  var keyValueFormat: js.UndefOr[KeyValueFormat] = js.undefined
  /**
    * The number format source used in the scorecard chart.
    * This field is optional.
    */
  var numberFormatSource: js.UndefOr[String] = js.undefined
  /**
    * Value to scale scorecard key and baseline value. For example, a factor of
    * 10 can be used to divide all values in the chart by 10.
    * This field is optional.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}

object ScorecardChartSpec {
  @scala.inline
  def apply(
    aggregateType: String = null,
    baselineValueData: ChartData = null,
    baselineValueFormat: BaselineValueFormat = null,
    customFormatOptions: ChartCustomNumberFormatOptions = null,
    keyValueData: ChartData = null,
    keyValueFormat: KeyValueFormat = null,
    numberFormatSource: String = null,
    scaleFactor: Int | Double = null
  ): ScorecardChartSpec = {
    val __obj = js.Dynamic.literal()
    if (aggregateType != null) __obj.updateDynamic("aggregateType")(aggregateType.asInstanceOf[js.Any])
    if (baselineValueData != null) __obj.updateDynamic("baselineValueData")(baselineValueData.asInstanceOf[js.Any])
    if (baselineValueFormat != null) __obj.updateDynamic("baselineValueFormat")(baselineValueFormat.asInstanceOf[js.Any])
    if (customFormatOptions != null) __obj.updateDynamic("customFormatOptions")(customFormatOptions.asInstanceOf[js.Any])
    if (keyValueData != null) __obj.updateDynamic("keyValueData")(keyValueData.asInstanceOf[js.Any])
    if (keyValueFormat != null) __obj.updateDynamic("keyValueFormat")(keyValueFormat.asInstanceOf[js.Any])
    if (numberFormatSource != null) __obj.updateDynamic("numberFormatSource")(numberFormatSource.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScorecardChartSpec]
  }
}

