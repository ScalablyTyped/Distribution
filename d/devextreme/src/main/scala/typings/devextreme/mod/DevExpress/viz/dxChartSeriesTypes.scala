package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This section lists objects that define options used to configure series of specific types. */
trait dxChartSeriesTypes extends js.Object {
  /** Describes settings supported by a series of the area type. */
  var AreaSeries: js.UndefOr[dxChartSeriesTypesAreaSeries] = js.undefined
  /** Describes settings supported by a series of the bar type. */
  var BarSeries: js.UndefOr[dxChartSeriesTypesBarSeries] = js.undefined
  /** Describes settings supported by a series of the bubble type. */
  var BubbleSeries: js.UndefOr[dxChartSeriesTypesBubbleSeries] = js.undefined
  /** Describes settings supported by a series of the candlestick type. */
  var CandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeries] = js.undefined
  /** An object that defines configuration options for chart series. */
  var CommonSeries: js.UndefOr[dxChartSeriesTypesCommonSeries] = js.undefined
  /** Describes settings supported by a series of the full-stacked area type. */
  var FullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeries] = js.undefined
  /** Describes settings supported by a series of the full-stacked bar type. */
  var FullStackedBarSeries: js.UndefOr[dxChartSeriesTypesFullStackedBarSeries] = js.undefined
  /** Describes settings supported by a series of the full-stacked line type. */
  var FullStackedLineSeries: js.UndefOr[dxChartSeriesTypesFullStackedLineSeries] = js.undefined
  /** Describes settings supported by a series of the full-stacked spline area type. */
  var FullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeries] = js.undefined
  /** Describes settings supported by a series of the full-stacked spline area type. An object defining a series of the fullStackedSpline type. */
  var FullStackedSplineSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineSeries] = js.undefined
  /** Describes settings supported by a series of the line type. */
  var LineSeries: js.UndefOr[dxChartSeriesTypesLineSeries] = js.undefined
  /** Describes settings supported by a series of the range area type. */
  var RangeAreaSeries: js.UndefOr[dxChartSeriesTypesRangeAreaSeries] = js.undefined
  /** Describes settings supported by a series of the range bar type. */
  var RangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeries] = js.undefined
  /** Describes settings supported by a series of the scatter type. */
  var ScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeries] = js.undefined
  /** Describes settings supported by a series of the spline area type. */
  var SplineAreaSeries: js.UndefOr[dxChartSeriesTypesSplineAreaSeries] = js.undefined
  /** Describes settings supported by a series of the spline type. */
  var SplineSeries: js.UndefOr[dxChartSeriesTypesSplineSeries] = js.undefined
  /** Describes settings supported by a series of the stacked area type. */
  var StackedAreaSeries: js.UndefOr[dxChartSeriesTypesStackedAreaSeries] = js.undefined
  /** Describes settings supported by a series of the stacked bar type. */
  var StackedBarSeries: js.UndefOr[dxChartSeriesTypesStackedBarSeries] = js.undefined
  /** Describes settings supported by a series of the stacked line type. */
  var StackedLineSeries: js.UndefOr[dxChartSeriesTypesStackedLineSeries] = js.undefined
  /** Describes settings supported by a series of the stacked spline area type. */
  var StackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesStackedSplineAreaSeries] = js.undefined
  /** Describes settings supported by a series of the stacked spline type. */
  var StackedSplineSeries: js.UndefOr[dxChartSeriesTypesStackedSplineSeries] = js.undefined
  /** Describes settings supported by a series of the step rea type. */
  var StepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeries] = js.undefined
  /** Describes settings supported by a series of the step line type. */
  var StepLineSeries: js.UndefOr[dxChartSeriesTypesStepLineSeries] = js.undefined
  /** Describes settings supported by a series of the stock type. */
  var StockSeries: js.UndefOr[dxChartSeriesTypesStockSeries] = js.undefined
}

object dxChartSeriesTypes {
  @scala.inline
  def apply(
    AreaSeries: dxChartSeriesTypesAreaSeries = null,
    BarSeries: dxChartSeriesTypesBarSeries = null,
    BubbleSeries: dxChartSeriesTypesBubbleSeries = null,
    CandleStickSeries: dxChartSeriesTypesCandleStickSeries = null,
    CommonSeries: dxChartSeriesTypesCommonSeries = null,
    FullStackedAreaSeries: dxChartSeriesTypesFullStackedAreaSeries = null,
    FullStackedBarSeries: dxChartSeriesTypesFullStackedBarSeries = null,
    FullStackedLineSeries: dxChartSeriesTypesFullStackedLineSeries = null,
    FullStackedSplineAreaSeries: dxChartSeriesTypesFullStackedSplineAreaSeries = null,
    FullStackedSplineSeries: dxChartSeriesTypesFullStackedSplineSeries = null,
    LineSeries: dxChartSeriesTypesLineSeries = null,
    RangeAreaSeries: dxChartSeriesTypesRangeAreaSeries = null,
    RangeBarSeries: dxChartSeriesTypesRangeBarSeries = null,
    ScatterSeries: dxChartSeriesTypesScatterSeries = null,
    SplineAreaSeries: dxChartSeriesTypesSplineAreaSeries = null,
    SplineSeries: dxChartSeriesTypesSplineSeries = null,
    StackedAreaSeries: dxChartSeriesTypesStackedAreaSeries = null,
    StackedBarSeries: dxChartSeriesTypesStackedBarSeries = null,
    StackedLineSeries: dxChartSeriesTypesStackedLineSeries = null,
    StackedSplineAreaSeries: dxChartSeriesTypesStackedSplineAreaSeries = null,
    StackedSplineSeries: dxChartSeriesTypesStackedSplineSeries = null,
    StepAreaSeries: dxChartSeriesTypesStepAreaSeries = null,
    StepLineSeries: dxChartSeriesTypesStepLineSeries = null,
    StockSeries: dxChartSeriesTypesStockSeries = null
  ): dxChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    if (AreaSeries != null) __obj.updateDynamic("AreaSeries")(AreaSeries.asInstanceOf[js.Any])
    if (BarSeries != null) __obj.updateDynamic("BarSeries")(BarSeries.asInstanceOf[js.Any])
    if (BubbleSeries != null) __obj.updateDynamic("BubbleSeries")(BubbleSeries.asInstanceOf[js.Any])
    if (CandleStickSeries != null) __obj.updateDynamic("CandleStickSeries")(CandleStickSeries.asInstanceOf[js.Any])
    if (CommonSeries != null) __obj.updateDynamic("CommonSeries")(CommonSeries.asInstanceOf[js.Any])
    if (FullStackedAreaSeries != null) __obj.updateDynamic("FullStackedAreaSeries")(FullStackedAreaSeries.asInstanceOf[js.Any])
    if (FullStackedBarSeries != null) __obj.updateDynamic("FullStackedBarSeries")(FullStackedBarSeries.asInstanceOf[js.Any])
    if (FullStackedLineSeries != null) __obj.updateDynamic("FullStackedLineSeries")(FullStackedLineSeries.asInstanceOf[js.Any])
    if (FullStackedSplineAreaSeries != null) __obj.updateDynamic("FullStackedSplineAreaSeries")(FullStackedSplineAreaSeries.asInstanceOf[js.Any])
    if (FullStackedSplineSeries != null) __obj.updateDynamic("FullStackedSplineSeries")(FullStackedSplineSeries.asInstanceOf[js.Any])
    if (LineSeries != null) __obj.updateDynamic("LineSeries")(LineSeries.asInstanceOf[js.Any])
    if (RangeAreaSeries != null) __obj.updateDynamic("RangeAreaSeries")(RangeAreaSeries.asInstanceOf[js.Any])
    if (RangeBarSeries != null) __obj.updateDynamic("RangeBarSeries")(RangeBarSeries.asInstanceOf[js.Any])
    if (ScatterSeries != null) __obj.updateDynamic("ScatterSeries")(ScatterSeries.asInstanceOf[js.Any])
    if (SplineAreaSeries != null) __obj.updateDynamic("SplineAreaSeries")(SplineAreaSeries.asInstanceOf[js.Any])
    if (SplineSeries != null) __obj.updateDynamic("SplineSeries")(SplineSeries.asInstanceOf[js.Any])
    if (StackedAreaSeries != null) __obj.updateDynamic("StackedAreaSeries")(StackedAreaSeries.asInstanceOf[js.Any])
    if (StackedBarSeries != null) __obj.updateDynamic("StackedBarSeries")(StackedBarSeries.asInstanceOf[js.Any])
    if (StackedLineSeries != null) __obj.updateDynamic("StackedLineSeries")(StackedLineSeries.asInstanceOf[js.Any])
    if (StackedSplineAreaSeries != null) __obj.updateDynamic("StackedSplineAreaSeries")(StackedSplineAreaSeries.asInstanceOf[js.Any])
    if (StackedSplineSeries != null) __obj.updateDynamic("StackedSplineSeries")(StackedSplineSeries.asInstanceOf[js.Any])
    if (StepAreaSeries != null) __obj.updateDynamic("StepAreaSeries")(StepAreaSeries.asInstanceOf[js.Any])
    if (StepLineSeries != null) __obj.updateDynamic("StepLineSeries")(StepLineSeries.asInstanceOf[js.Any])
    if (StockSeries != null) __obj.updateDynamic("StockSeries")(StockSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypes]
  }
}

