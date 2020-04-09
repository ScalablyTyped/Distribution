package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementDxElementModelAny
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

trait dxBulletOptions extends BaseSparklineOptions[dxBullet] {
  /** @name dxBullet.Options.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxBullet.Options.endScaleValue */
  var endScaleValue: js.UndefOr[Double] = js.undefined
  /** @name dxBullet.Options.showTarget */
  var showTarget: js.UndefOr[Boolean] = js.undefined
  /** @name dxBullet.Options.showZeroLevel */
  var showZeroLevel: js.UndefOr[Boolean] = js.undefined
  /** @name dxBullet.Options.startScaleValue */
  var startScaleValue: js.UndefOr[Double] = js.undefined
  /** @name dxBullet.Options.target */
  var target: js.UndefOr[Double] = js.undefined
  /** @name dxBullet.Options.targetColor */
  var targetColor: js.UndefOr[String] = js.undefined
  /** @name dxBullet.Options.targetWidth */
  var targetWidth: js.UndefOr[Double] = js.undefined
  /** @name dxBullet.Options.value */
  var value: js.UndefOr[Double] = js.undefined
}

object dxBulletOptions {
  @scala.inline
  def apply(
    bindingOptions: js.Any = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    endScaleValue: Int | Double = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ AnonModel[dxBullet] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxBullet] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxBullet] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxBullet] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxBullet] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxBullet] => _ = null,
    onInitialized: /* e */ AnonElement[dxBullet] => _ = null,
    onOptionChanged: /* e */ AnonName[dxBullet] => _ = null,
    onTooltipHidden: /* e */ AnonElementDxElementModelAny[dxBullet] => _ = null,
    onTooltipShown: /* e */ AnonElementDxElementModelAny[dxBullet] => _ = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showTarget: js.UndefOr[Boolean] = js.undefined,
    showZeroLevel: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    startScaleValue: Int | Double = null,
    target: Int | Double = null,
    targetColor: String = null,
    targetWidth: Int | Double = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseSparklineTooltip = null,
    value: Int | Double = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxBulletOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (endScaleValue != null) __obj.updateDynamic("endScaleValue")(endScaleValue.asInstanceOf[js.Any])
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
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showTarget)) __obj.updateDynamic("showTarget")(showTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(showZeroLevel)) __obj.updateDynamic("showZeroLevel")(showZeroLevel.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startScaleValue != null) __obj.updateDynamic("startScaleValue")(startScaleValue.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetColor != null) __obj.updateDynamic("targetColor")(targetColor.asInstanceOf[js.Any])
    if (targetWidth != null) __obj.updateDynamic("targetWidth")(targetWidth.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxBulletOptions]
  }
}

