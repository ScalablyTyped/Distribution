package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapOptions extends js.Object {
  var fontColor: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  var headerColor: js.UndefOr[String] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var headerHighlightColor: js.UndefOr[String] = js.undefined
  var hintOpacity: js.UndefOr[Double] = js.undefined
  var maxColor: js.UndefOr[String] = js.undefined
  var maxColorValue: js.UndefOr[Double] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var maxHighlightColor: js.UndefOr[String] = js.undefined
  var maxPostDepth: js.UndefOr[Double] = js.undefined
  var midColor: js.UndefOr[String] = js.undefined
  var midHighlightColor: js.UndefOr[String] = js.undefined
  var minColor: js.UndefOr[String] = js.undefined
  var minColorValue: js.UndefOr[Double] = js.undefined
  var minHighlightColor: js.UndefOr[String] = js.undefined
  var showScale: js.UndefOr[Boolean] = js.undefined
  var showTooltips: js.UndefOr[Boolean] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var useWeightedAverageForAggregation: js.UndefOr[Boolean] = js.undefined
}

object TreeMapOptions {
  @scala.inline
  def apply(
    fontColor: String = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    forceIFrame: js.UndefOr[Boolean] = js.undefined,
    headerColor: String = null,
    headerHeight: js.UndefOr[Double] = js.undefined,
    headerHighlightColor: String = null,
    hintOpacity: js.UndefOr[Double] = js.undefined,
    maxColor: String = null,
    maxColorValue: js.UndefOr[Double] = js.undefined,
    maxDepth: js.UndefOr[Double] = js.undefined,
    maxHighlightColor: String = null,
    maxPostDepth: js.UndefOr[Double] = js.undefined,
    midColor: String = null,
    midHighlightColor: String = null,
    minColor: String = null,
    minColorValue: js.UndefOr[Double] = js.undefined,
    minHighlightColor: String = null,
    showScale: js.UndefOr[Boolean] = js.undefined,
    showTooltips: js.UndefOr[Boolean] = js.undefined,
    textStyle: ChartTextStyle = null,
    title: String = null,
    titleTextStyle: ChartTextStyle = null,
    useWeightedAverageForAggregation: js.UndefOr[Boolean] = js.undefined
  ): TreeMapOptions = {
    val __obj = js.Dynamic.literal()
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame.get.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(headerHeight)) __obj.updateDynamic("headerHeight")(headerHeight.get.asInstanceOf[js.Any])
    if (headerHighlightColor != null) __obj.updateDynamic("headerHighlightColor")(headerHighlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hintOpacity)) __obj.updateDynamic("hintOpacity")(hintOpacity.get.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (!js.isUndefined(maxColorValue)) __obj.updateDynamic("maxColorValue")(maxColorValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (maxHighlightColor != null) __obj.updateDynamic("maxHighlightColor")(maxHighlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPostDepth)) __obj.updateDynamic("maxPostDepth")(maxPostDepth.get.asInstanceOf[js.Any])
    if (midColor != null) __obj.updateDynamic("midColor")(midColor.asInstanceOf[js.Any])
    if (midHighlightColor != null) __obj.updateDynamic("midHighlightColor")(midHighlightColor.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (!js.isUndefined(minColorValue)) __obj.updateDynamic("minColorValue")(minColorValue.get.asInstanceOf[js.Any])
    if (minHighlightColor != null) __obj.updateDynamic("minHighlightColor")(minHighlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showScale)) __obj.updateDynamic("showScale")(showScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltips)) __obj.updateDynamic("showTooltips")(showTooltips.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(useWeightedAverageForAggregation)) __obj.updateDynamic("useWeightedAverageForAggregation")(useWeightedAverageForAggregation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMapOptions]
  }
}

