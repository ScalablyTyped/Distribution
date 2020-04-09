package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonComponentElementModelTarget
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonElement
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

trait BaseGaugeOptions[T] extends BaseWidgetOptions[T] {
  /** @name BaseGauge.Options.animation */
  var animation: js.UndefOr[BaseGaugeAnimation] = js.undefined
  /** @name BaseGauge.Options.containerBackgroundColor */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** @name BaseGauge.Options.loadingIndicator */
  @JSName("loadingIndicator")
  var loadingIndicator_BaseGaugeOptions: js.UndefOr[BaseGaugeLoadingIndicator] = js.undefined
  /** @name BaseGauge.Options.onTooltipHidden */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ AnonComponentElementModelTarget[T], _]] = js.undefined
  /** @name BaseGauge.Options.onTooltipShown */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ AnonComponentElementModelTarget[T], _]] = js.undefined
  /** @name BaseGauge.Options.rangeContainer */
  var rangeContainer: js.UndefOr[BaseGaugeRangeContainer] = js.undefined
  /** @name BaseGauge.Options.scale */
  var scale: js.UndefOr[BaseGaugeScale] = js.undefined
  /** @name BaseGauge.Options.subvalues */
  var subvalues: js.UndefOr[js.Array[Double]] = js.undefined
  /** @name BaseGauge.Options.tooltip */
  @JSName("tooltip")
  var tooltip_BaseGaugeOptions: js.UndefOr[BaseGaugeTooltip] = js.undefined
  /** @name BaseGauge.Options.value */
  var value: js.UndefOr[Double] = js.undefined
}

object BaseGaugeOptions {
  @scala.inline
  def apply[T](
    animation: BaseGaugeAnimation = null,
    bindingOptions: js.Any = null,
    containerBackgroundColor: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    loadingIndicator: BaseGaugeLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[T] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[T] => _ = null,
    onExporting: /* e */ AnonFormatModel[T] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[T] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    onTooltipHidden: /* e */ AnonComponentElementModelTarget[T] => _ = null,
    onTooltipShown: /* e */ AnonComponentElementModelTarget[T] => _ = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    rangeContainer: BaseGaugeRangeContainer = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scale: BaseGaugeScale = null,
    size: BaseWidgetSize = null,
    subvalues: js.Array[Double] = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseGaugeTooltip = null,
    value: Int | Double = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): BaseGaugeOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
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
    if (subvalues != null) __obj.updateDynamic("subvalues")(subvalues.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGaugeOptions[T]]
  }
}

