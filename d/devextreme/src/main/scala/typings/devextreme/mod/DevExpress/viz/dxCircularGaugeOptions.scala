package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonComponentElementModelTarget
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonElement
import typings.devextreme.AnonEndAngle
import typings.devextreme.AnonFormatModel
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonTargetAny
import typings.devextreme.devextremeStrings.genericDotcarmine
import typings.devextreme.devextremeStrings.genericDotcontrast
import typings.devextreme.devextremeStrings.genericDotdark
import typings.devextreme.devextremeStrings.genericDotdarkmoon
import typings.devextreme.devextremeStrings.genericDotdarkviolet
import typings.devextreme.devextremeStrings.genericDotgreenmist
import typings.devextreme.devextremeStrings.genericDotlight
import typings.devextreme.devextremeStrings.genericDotsoftblue
import typings.devextreme.devextremeStrings.ios7Dotdefault
import typings.devextreme.devextremeStrings.materialDotblueDotlight
import typings.devextreme.devextremeStrings.materialDotlimeDotlight
import typings.devextreme.devextremeStrings.materialDotorangeDotlight
import typings.devextreme.devextremeStrings.materialDotpurpleDotlight
import typings.devextreme.devextremeStrings.materialDottealDotlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxCircularGaugeOptions extends BaseGaugeOptions[dxCircularGauge] {
  /** Specifies the options required to set the geometry of the CircularGauge widget. */
  var geometry: js.UndefOr[AnonEndAngle] = js.undefined
  /** Specifies gauge range container options. */
  @JSName("rangeContainer")
  var rangeContainer_dxCircularGaugeOptions: js.UndefOr[dxCircularGaugeRangeContainer] = js.undefined
  /** Specifies a gauge's scale options. */
  @JSName("scale")
  var scale_dxCircularGaugeOptions: js.UndefOr[dxCircularGaugeScale] = js.undefined
  /** Specifies the appearance options of subvalue indicators. */
  var subvalueIndicator: js.UndefOr[GaugeIndicator] = js.undefined
  /** Specifies the appearance options of the value indicator. */
  var valueIndicator: js.UndefOr[GaugeIndicator] = js.undefined
}

object dxCircularGaugeOptions {
  @scala.inline
  def apply(
    animation: BaseGaugeAnimation = null,
    bindingOptions: js.Any = null,
    containerBackgroundColor: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    geometry: AnonEndAngle = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    loadingIndicator: BaseGaugeLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ AnonModel[dxCircularGauge] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxCircularGauge] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxCircularGauge] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxCircularGauge] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxCircularGauge] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxCircularGauge] => _ = null,
    onInitialized: /* e */ AnonElement[dxCircularGauge] => _ = null,
    onOptionChanged: /* e */ AnonName[dxCircularGauge] => _ = null,
    onTooltipHidden: /* e */ AnonComponentElementModelTarget[dxCircularGauge] => _ = null,
    onTooltipShown: /* e */ AnonComponentElementModelTarget[dxCircularGauge] => _ = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    rangeContainer: dxCircularGaugeRangeContainer = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scale: dxCircularGaugeScale = null,
    size: BaseWidgetSize = null,
    subvalueIndicator: GaugeIndicator = null,
    subvalues: js.Array[Double] = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseGaugeTooltip = null,
    value: Int | Double = null,
    valueIndicator: GaugeIndicator = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxCircularGaugeOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
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
    if (rangeContainer != null) __obj.updateDynamic("rangeContainer")(rangeContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (subvalueIndicator != null) __obj.updateDynamic("subvalueIndicator")(subvalueIndicator.asInstanceOf[js.Any])
    if (subvalues != null) __obj.updateDynamic("subvalues")(subvalues.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueIndicator != null) __obj.updateDynamic("valueIndicator")(valueIndicator.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxCircularGaugeOptions]
  }
}

