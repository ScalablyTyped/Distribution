package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.CancelComponentData
import typings.devextreme.anon.ComponentTElementDxElementModelAny
import typings.devextreme.anon.Element
import typings.devextreme.anon.FormatModel
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.TargetAny
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
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWidgetOptions[T] extends DOMComponentOptions[T] {
  /** @name BaseWidget.Options.disabled */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** @name BaseWidget.Options.export */
  var export: js.UndefOr[BaseWidgetExport] = js.undefined
  /** @name BaseWidget.Options.loadingIndicator */
  var loadingIndicator: js.UndefOr[BaseWidgetLoadingIndicator] = js.undefined
  /** @name BaseWidget.Options.margin */
  var margin: js.UndefOr[BaseWidgetMargin] = js.undefined
  /** @name BaseWidget.Options.onDrawn */
  var onDrawn: js.UndefOr[js.Function1[/* e */ ComponentTElementDxElementModelAny[T], _]] = js.undefined
  /** @name BaseWidget.Options.onExported */
  var onExported: js.UndefOr[js.Function1[/* e */ ComponentTElementDxElementModelAny[T], _]] = js.undefined
  /** @name BaseWidget.Options.onExporting */
  var onExporting: js.UndefOr[js.Function1[/* e */ FormatModel[T], _]] = js.undefined
  /** @name BaseWidget.Options.onFileSaving */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ CancelComponentData[T], _]] = js.undefined
  /** @name BaseWidget.Options.onIncidentOccurred */
  var onIncidentOccurred: js.UndefOr[js.Function1[/* e */ TargetAny[T], _]] = js.undefined
  /** @name BaseWidget.Options.pathModified */
  var pathModified: js.UndefOr[Boolean] = js.undefined
  /** @name BaseWidget.Options.redrawOnResize */
  var redrawOnResize: js.UndefOr[Boolean] = js.undefined
  /** @name BaseWidget.Options.size */
  var size: js.UndefOr[BaseWidgetSize] = js.undefined
  /** @name BaseWidget.Options.theme */
  var theme: js.UndefOr[
    genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight
  ] = js.undefined
  /** @name BaseWidget.Options.title */
  var title: js.UndefOr[BaseWidgetTitle | String] = js.undefined
  /** @name BaseWidget.Options.tooltip */
  var tooltip: js.UndefOr[BaseWidgetTooltip] = js.undefined
}

object BaseWidgetOptions {
  @scala.inline
  def apply[T](
    bindingOptions: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ Model[T] => _ = null,
    onDrawn: /* e */ ComponentTElementDxElementModelAny[T] => _ = null,
    onExported: /* e */ ComponentTElementDxElementModelAny[T] => _ = null,
    onExporting: /* e */ FormatModel[T] => _ = null,
    onFileSaving: /* e */ CancelComponentData[T] => _ = null,
    onIncidentOccurred: /* e */ TargetAny[T] => _ = null,
    onInitialized: /* e */ Element[T] => _ = null,
    onOptionChanged: /* e */ Name[T] => _ = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseWidgetTooltip = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): BaseWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetOptions[T]]
  }
}

