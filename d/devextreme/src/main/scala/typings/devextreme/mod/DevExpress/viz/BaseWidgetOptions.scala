package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonCancelComponentData
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
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWidgetOptions[T] extends DOMComponentOptions[T] {
  /** Specifies whether the widget responds to the user interaction. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Configures the exporting and printing features. */
  var export: js.UndefOr[BaseWidgetExport] = js.undefined
  /** Configures the loading indicator. */
  var loadingIndicator: js.UndefOr[BaseWidgetLoadingIndicator] = js.undefined
  /** Generates space around the widget. */
  var margin: js.UndefOr[BaseWidgetMargin] = js.undefined
  /** A function that is executed when the widget's rendering has finished. */
  var onDrawn: js.UndefOr[js.Function1[/* e */ AnonComponentTElementDxElementModelAny[T], _]] = js.undefined
  /** A function that is executed after the widget is exported. */
  var onExported: js.UndefOr[js.Function1[/* e */ AnonComponentTElementDxElementModelAny[T], _]] = js.undefined
  /** A function that is executed before the widget is exported. */
  var onExporting: js.UndefOr[js.Function1[/* e */ AnonFormatModel[T], _]] = js.undefined
  /** A function that is executed before a file with exported widget is saved to the user's local storage. */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ AnonCancelComponentData[T], _]] = js.undefined
  /** A function that is executed when an error or warning occurs. */
  var onIncidentOccurred: js.UndefOr[js.Function1[/* e */ AnonTargetAny[T], _]] = js.undefined
  /** Notifies the widget that it is embedded into an HTML page that uses a tag modifying the path. */
  var pathModified: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to redraw the widget when the size of the parent browser window changes or a mobile device rotates. */
  var redrawOnResize: js.UndefOr[Boolean] = js.undefined
  /** Specifies the widget's size in pixels. */
  var size: js.UndefOr[BaseWidgetSize] = js.undefined
  /** Sets the name of the theme the widget uses. */
  var theme: js.UndefOr[
    genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight
  ] = js.undefined
  /** Configures the widget's title. */
  var title: js.UndefOr[BaseWidgetTitle | String] = js.undefined
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
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
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[T] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[T] => _ = null,
    onExporting: /* e */ AnonFormatModel[T] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[T] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
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
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetOptions[T]]
  }
}

