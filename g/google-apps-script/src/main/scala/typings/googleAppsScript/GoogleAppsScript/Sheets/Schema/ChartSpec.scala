package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSpec extends js.Object {
  var altText: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[Color] = js.undefined
  var basicChart: js.UndefOr[BasicChartSpec] = js.undefined
  var bubbleChart: js.UndefOr[BubbleChartSpec] = js.undefined
  var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var hiddenDimensionStrategy: js.UndefOr[String] = js.undefined
  var histogramChart: js.UndefOr[HistogramChartSpec] = js.undefined
  var maximized: js.UndefOr[Boolean] = js.undefined
  var orgChart: js.UndefOr[OrgChartSpec] = js.undefined
  var pieChart: js.UndefOr[PieChartSpec] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var subtitleTextFormat: js.UndefOr[TextFormat] = js.undefined
  var subtitleTextPosition: js.UndefOr[TextPosition] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTextFormat: js.UndefOr[TextFormat] = js.undefined
  var titleTextPosition: js.UndefOr[TextPosition] = js.undefined
  var treemapChart: js.UndefOr[TreemapChartSpec] = js.undefined
  var waterfallChart: js.UndefOr[WaterfallChartSpec] = js.undefined
}

object ChartSpec {
  @scala.inline
  def apply(
    altText: String = null,
    backgroundColor: Color = null,
    basicChart: BasicChartSpec = null,
    bubbleChart: BubbleChartSpec = null,
    candlestickChart: CandlestickChartSpec = null,
    fontName: String = null,
    hiddenDimensionStrategy: String = null,
    histogramChart: HistogramChartSpec = null,
    maximized: js.UndefOr[Boolean] = js.undefined,
    orgChart: OrgChartSpec = null,
    pieChart: PieChartSpec = null,
    subtitle: String = null,
    subtitleTextFormat: TextFormat = null,
    subtitleTextPosition: TextPosition = null,
    title: String = null,
    titleTextFormat: TextFormat = null,
    titleTextPosition: TextPosition = null,
    treemapChart: TreemapChartSpec = null,
    waterfallChart: WaterfallChartSpec = null
  ): ChartSpec = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (basicChart != null) __obj.updateDynamic("basicChart")(basicChart.asInstanceOf[js.Any])
    if (bubbleChart != null) __obj.updateDynamic("bubbleChart")(bubbleChart.asInstanceOf[js.Any])
    if (candlestickChart != null) __obj.updateDynamic("candlestickChart")(candlestickChart.asInstanceOf[js.Any])
    if (fontName != null) __obj.updateDynamic("fontName")(fontName.asInstanceOf[js.Any])
    if (hiddenDimensionStrategy != null) __obj.updateDynamic("hiddenDimensionStrategy")(hiddenDimensionStrategy.asInstanceOf[js.Any])
    if (histogramChart != null) __obj.updateDynamic("histogramChart")(histogramChart.asInstanceOf[js.Any])
    if (!js.isUndefined(maximized)) __obj.updateDynamic("maximized")(maximized.get.asInstanceOf[js.Any])
    if (orgChart != null) __obj.updateDynamic("orgChart")(orgChart.asInstanceOf[js.Any])
    if (pieChart != null) __obj.updateDynamic("pieChart")(pieChart.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleTextFormat != null) __obj.updateDynamic("subtitleTextFormat")(subtitleTextFormat.asInstanceOf[js.Any])
    if (subtitleTextPosition != null) __obj.updateDynamic("subtitleTextPosition")(subtitleTextPosition.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextFormat != null) __obj.updateDynamic("titleTextFormat")(titleTextFormat.asInstanceOf[js.Any])
    if (titleTextPosition != null) __obj.updateDynamic("titleTextPosition")(titleTextPosition.asInstanceOf[js.Any])
    if (treemapChart != null) __obj.updateDynamic("treemapChart")(treemapChart.asInstanceOf[js.Any])
    if (waterfallChart != null) __obj.updateDynamic("waterfallChart")(waterfallChart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSpec]
  }
}

