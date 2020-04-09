package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementDxElementModelAny
import typings.devextreme.AnonFormatModel
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonTargetAny
import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bar
import typings.devextreme.devextremeStrings.circle
import typings.devextreme.devextremeStrings.cross
import typings.devextreme.devextremeStrings.genericDotcarmine
import typings.devextreme.devextremeStrings.genericDotcontrast
import typings.devextreme.devextremeStrings.genericDotdark
import typings.devextreme.devextremeStrings.genericDotdarkmoon
import typings.devextreme.devextremeStrings.genericDotdarkviolet
import typings.devextreme.devextremeStrings.genericDotgreenmist
import typings.devextreme.devextremeStrings.genericDotlight
import typings.devextreme.devextremeStrings.genericDotsoftblue
import typings.devextreme.devextremeStrings.ios7Dotdefault
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.materialDotblueDotlight
import typings.devextreme.devextremeStrings.materialDotlimeDotlight
import typings.devextreme.devextremeStrings.materialDotorangeDotlight
import typings.devextreme.devextremeStrings.materialDotpurpleDotlight
import typings.devextreme.devextremeStrings.materialDottealDotlight
import typings.devextreme.devextremeStrings.polygon
import typings.devextreme.devextremeStrings.spline
import typings.devextreme.devextremeStrings.splinearea
import typings.devextreme.devextremeStrings.square
import typings.devextreme.devextremeStrings.steparea
import typings.devextreme.devextremeStrings.stepline
import typings.devextreme.devextremeStrings.triangle
import typings.devextreme.devextremeStrings.winloss
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSparklineOptions extends BaseSparklineOptions[dxSparkline] {
  /** @name dxSparkline.Options.argumentField */
  var argumentField: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.barNegativeColor */
  var barNegativeColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.barPositiveColor */
  var barPositiveColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** @name dxSparkline.Options.firstLastColor */
  var firstLastColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.ignoreEmptyPoints */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  /** @name dxSparkline.Options.lineColor */
  var lineColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.lineWidth */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** @name dxSparkline.Options.lossColor */
  var lossColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.maxColor */
  var maxColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.maxValue */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** @name dxSparkline.Options.minColor */
  var minColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.minValue */
  var minValue: js.UndefOr[Double] = js.undefined
  /** @name dxSparkline.Options.pointColor */
  var pointColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.pointSize */
  var pointSize: js.UndefOr[Double] = js.undefined
  /** @name dxSparkline.Options.pointSymbol */
  var pointSymbol: js.UndefOr[circle | cross | polygon | square | triangle] = js.undefined
  /** @name dxSparkline.Options.showFirstLast */
  var showFirstLast: js.UndefOr[Boolean] = js.undefined
  /** @name dxSparkline.Options.showMinMax */
  var showMinMax: js.UndefOr[Boolean] = js.undefined
  /** @name dxSparkline.Options.type */
  var `type`: js.UndefOr[area | bar | line | spline | splinearea | steparea | stepline | winloss] = js.undefined
  /** @name dxSparkline.Options.valueField */
  var valueField: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.winColor */
  var winColor: js.UndefOr[String] = js.undefined
  /** @name dxSparkline.Options.winlossThreshold */
  var winlossThreshold: js.UndefOr[Double] = js.undefined
}

object dxSparklineOptions {
  @scala.inline
  def apply(
    argumentField: String = null,
    barNegativeColor: String = null,
    barPositiveColor: String = null,
    bindingOptions: js.Any = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    firstLastColor: String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    lineColor: String = null,
    lineWidth: Int | Double = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    lossColor: String = null,
    margin: BaseWidgetMargin = null,
    maxColor: String = null,
    maxValue: Int | Double = null,
    minColor: String = null,
    minValue: Int | Double = null,
    onDisposing: /* e */ AnonModel[dxSparkline] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxSparkline] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxSparkline] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxSparkline] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxSparkline] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxSparkline] => _ = null,
    onInitialized: /* e */ AnonElement[dxSparkline] => _ = null,
    onOptionChanged: /* e */ AnonName[dxSparkline] => _ = null,
    onTooltipHidden: /* e */ AnonElementDxElementModelAny[dxSparkline] => _ = null,
    onTooltipShown: /* e */ AnonElementDxElementModelAny[dxSparkline] => _ = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointColor: String = null,
    pointSize: Int | Double = null,
    pointSymbol: circle | cross | polygon | square | triangle = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showFirstLast: js.UndefOr[Boolean] = js.undefined,
    showMinMax: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseSparklineTooltip = null,
    `type`: area | bar | line | spline | splinearea | steparea | stepline | winloss = null,
    valueField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null,
    winColor: String = null,
    winlossThreshold: Int | Double = null
  ): dxSparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (barNegativeColor != null) __obj.updateDynamic("barNegativeColor")(barNegativeColor.asInstanceOf[js.Any])
    if (barPositiveColor != null) __obj.updateDynamic("barPositiveColor")(barPositiveColor.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (firstLastColor != null) __obj.updateDynamic("firstLastColor")(firstLastColor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (lossColor != null) __obj.updateDynamic("lossColor")(lossColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1(onTooltipHidden))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1(onTooltipShown))
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (pointSymbol != null) __obj.updateDynamic("pointSymbol")(pointSymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLast)) __obj.updateDynamic("showFirstLast")(showFirstLast.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinMax)) __obj.updateDynamic("showMinMax")(showMinMax.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (winColor != null) __obj.updateDynamic("winColor")(winColor.asInstanceOf[js.Any])
    if (winlossThreshold != null) __obj.updateDynamic("winlossThreshold")(winlossThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSparklineOptions]
  }
}

