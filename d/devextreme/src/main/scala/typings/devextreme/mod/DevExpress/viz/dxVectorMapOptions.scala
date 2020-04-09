package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBorderColorColor
import typings.devextreme.AnonBorderWidth
import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonCenter
import typings.devextreme.AnonComponentDxVectorMap
import typings.devextreme.AnonComponentElementEventJQueryEvent
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonElement
import typings.devextreme.AnonFormatModel
import typings.devextreme.AnonMargin
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonTargetAny
import typings.devextreme.AnonZoomFactor
import typings.devextreme.devextremeStrings.equirectangular
import typings.devextreme.devextremeStrings.genericDotcarmine
import typings.devextreme.devextremeStrings.genericDotcontrast
import typings.devextreme.devextremeStrings.genericDotdark
import typings.devextreme.devextremeStrings.genericDotdarkmoon
import typings.devextreme.devextremeStrings.genericDotdarkviolet
import typings.devextreme.devextremeStrings.genericDotgreenmist
import typings.devextreme.devextremeStrings.genericDotlight
import typings.devextreme.devextremeStrings.genericDotsoftblue
import typings.devextreme.devextremeStrings.ios7Dotdefault
import typings.devextreme.devextremeStrings.lambert
import typings.devextreme.devextremeStrings.materialDotblueDotlight
import typings.devextreme.devextremeStrings.materialDotlimeDotlight
import typings.devextreme.devextremeStrings.materialDotorangeDotlight
import typings.devextreme.devextremeStrings.materialDotpurpleDotlight
import typings.devextreme.devextremeStrings.materialDottealDotlight
import typings.devextreme.devextremeStrings.mercator
import typings.devextreme.devextremeStrings.miller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxVectorMapOptions extends BaseWidgetOptions[dxVectorMap] {
  /** @name dxVectorMap.Options.background */
  var background: js.UndefOr[AnonBorderColorColor] = js.undefined
  /** @name dxVectorMap.Options.bounds */
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  /** @name dxVectorMap.Options.center */
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  /** @name dxVectorMap.Options.controlBar */
  var controlBar: js.UndefOr[AnonMargin] = js.undefined
  /** @name dxVectorMap.Options.layers */
  var layers: js.UndefOr[js.Array[AnonBorderWidth] | AnonBorderWidth] = js.undefined
  /** @name dxVectorMap.Options.legends */
  var legends: js.UndefOr[js.Array[dxVectorMapLegends]] = js.undefined
  /** @name dxVectorMap.Options.maxZoomFactor */
  var maxZoomFactor: js.UndefOr[Double] = js.undefined
  /** @name dxVectorMap.Options.onCenterChanged */
  var onCenterChanged: js.UndefOr[js.Function1[/* e */ AnonCenter, _]] = js.undefined
  /** @name dxVectorMap.Options.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonComponentElementEventJQueryEvent, _]) | String] = js.undefined
  /** @name dxVectorMap.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.undefined
  /** @name dxVectorMap.Options.onTooltipHidden */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.undefined
  /** @name dxVectorMap.Options.onTooltipShown */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.undefined
  /** @name dxVectorMap.Options.onZoomFactorChanged */
  var onZoomFactorChanged: js.UndefOr[js.Function1[/* e */ AnonZoomFactor, _]] = js.undefined
  /** @name dxVectorMap.Options.panningEnabled */
  var panningEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxVectorMap.Options.projection */
  var projection: js.UndefOr[
    equirectangular | lambert | mercator | miller | VectorMapProjectionConfig | String | js.Any
  ] = js.undefined
  /** @name dxVectorMap.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxVectorMapOptions: js.UndefOr[dxVectorMapTooltip] = js.undefined
  /** @name dxVectorMap.Options.touchEnabled */
  var touchEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxVectorMap.Options.wheelEnabled */
  var wheelEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxVectorMap.Options.zoomFactor */
  var zoomFactor: js.UndefOr[Double] = js.undefined
  /** @name dxVectorMap.Options.zoomingEnabled */
  var zoomingEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxVectorMapOptions {
  @scala.inline
  def apply(
    background: AnonBorderColorColor = null,
    bindingOptions: js.Any = null,
    bounds: js.Array[Double] = null,
    center: js.Array[Double] = null,
    controlBar: AnonMargin = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    layers: js.Array[AnonBorderWidth] | AnonBorderWidth = null,
    legends: js.Array[dxVectorMapLegends] = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    maxZoomFactor: Int | Double = null,
    onCenterChanged: /* e */ AnonCenter => _ = null,
    onClick: (js.Function1[/* e */ AnonComponentElementEventJQueryEvent, _]) | String = null,
    onDisposing: /* e */ AnonModel[dxVectorMap] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxVectorMap] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxVectorMap] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxVectorMap] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxVectorMap] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxVectorMap] => _ = null,
    onInitialized: /* e */ AnonElement[dxVectorMap] => _ = null,
    onOptionChanged: /* e */ AnonName[dxVectorMap] => _ = null,
    onSelectionChanged: /* e */ AnonComponentDxVectorMap => _ = null,
    onTooltipHidden: /* e */ AnonComponentDxVectorMap => _ = null,
    onTooltipShown: /* e */ AnonComponentDxVectorMap => _ = null,
    onZoomFactorChanged: /* e */ AnonZoomFactor => _ = null,
    panningEnabled: js.UndefOr[Boolean] = js.undefined,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    projection: equirectangular | lambert | mercator | miller | VectorMapProjectionConfig | String | js.Any = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxVectorMapTooltip = null,
    touchEnabled: js.UndefOr[Boolean] = js.undefined,
    wheelEnabled: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoomFactor: Int | Double = null,
    zoomingEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxVectorMapOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (controlBar != null) __obj.updateDynamic("controlBar")(controlBar.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxZoomFactor != null) __obj.updateDynamic("maxZoomFactor")(maxZoomFactor.asInstanceOf[js.Any])
    if (onCenterChanged != null) __obj.updateDynamic("onCenterChanged")(js.Any.fromFunction1(onCenterChanged))
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1(onTooltipHidden))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1(onTooltipShown))
    if (onZoomFactorChanged != null) __obj.updateDynamic("onZoomFactorChanged")(js.Any.fromFunction1(onZoomFactorChanged))
    if (!js.isUndefined(panningEnabled)) __obj.updateDynamic("panningEnabled")(panningEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelEnabled)) __obj.updateDynamic("wheelEnabled")(wheelEnabled.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomingEnabled)) __obj.updateDynamic("zoomingEnabled")(zoomingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxVectorMapOptions]
  }
}

