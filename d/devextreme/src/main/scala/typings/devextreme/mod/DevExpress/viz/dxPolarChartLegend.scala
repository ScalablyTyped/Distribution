package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Bottom
import typings.devextreme.anon.CornerRadius
import typings.devextreme.anon.HorizontalAlignment
import typings.devextreme.anon.SeriesColor
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartLegend extends BaseChartLegend {
  /** @name dxPolarChart.Options.legend.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* seriesInfo */ SeriesColor, String]] = js.undefined
  /** @name dxPolarChart.Options.legend.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* seriesInfo */ SeriesColor, String]] = js.undefined
  /** @name dxPolarChart.Options.legend.hoverMode */
  var hoverMode: js.UndefOr[excludePoints | includePoints | none] = js.undefined
}

object dxPolarChartLegend {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: CornerRadius = null,
    columnCount: js.UndefOr[Double] = js.undefined,
    columnItemSpacing: js.UndefOr[Double] = js.undefined,
    customizeHint: /* seriesInfo */ SeriesColor => String = null,
    customizeItems: /* items */ js.Array[BaseChartLegendItem] => js.Array[BaseChartLegendItem] = null,
    customizeText: /* seriesInfo */ SeriesColor => String = null,
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    hoverMode: excludePoints | includePoints | none = null,
    itemTextPosition: bottom | left | right | top = null,
    itemsAlignment: center | left | right = null,
    margin: Double | Bottom = null,
    markerSize: js.UndefOr[Double] = js.undefined,
    markerTemplate: template | (js.Function2[
      /* legendItem */ BaseChartLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ]) = null,
    orientation: horizontal | vertical = null,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    rowCount: js.UndefOr[Double] = js.undefined,
    rowItemSpacing: js.UndefOr[Double] = js.undefined,
    title: HorizontalAlignment | String = null,
    verticalAlignment: bottom | top = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartLegend = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnItemSpacing)) __obj.updateDynamic("columnItemSpacing")(columnItemSpacing.get.asInstanceOf[js.Any])
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1(customizeHint))
    if (customizeItems != null) __obj.updateDynamic("customizeItems")(js.Any.fromFunction1(customizeItems))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (itemTextPosition != null) __obj.updateDynamic("itemTextPosition")(itemTextPosition.asInstanceOf[js.Any])
    if (itemsAlignment != null) __obj.updateDynamic("itemsAlignment")(itemsAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize.get.asInstanceOf[js.Any])
    if (markerTemplate != null) __obj.updateDynamic("markerTemplate")(markerTemplate.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowItemSpacing)) __obj.updateDynamic("rowItemSpacing")(rowItemSpacing.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartLegend]
  }
}

