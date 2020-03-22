package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonAggregateByCategory
import typings.devextreme.AnonAllowSlidersSwap
import typings.devextreme.AnonBarGroupPadding
import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementEventModel
import typings.devextreme.AnonFormatModel
import typings.devextreme.AnonImage
import typings.devextreme.AnonInvalidRangeColor
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonOpacity
import typings.devextreme.AnonOpacityWidth
import typings.devextreme.AnonRight
import typings.devextreme.AnonTargetAny
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.genericDotcarmine
import typings.devextreme.devextremeStrings.genericDotcontrast
import typings.devextreme.devextremeStrings.genericDotdark
import typings.devextreme.devextremeStrings.genericDotdarkmoon
import typings.devextreme.devextremeStrings.genericDotdarkviolet
import typings.devextreme.devextremeStrings.genericDotgreenmist
import typings.devextreme.devextremeStrings.genericDotlight
import typings.devextreme.devextremeStrings.genericDotsoftblue
import typings.devextreme.devextremeStrings.ios7Dotdefault
import typings.devextreme.devextremeStrings.keep
import typings.devextreme.devextremeStrings.materialDotblueDotlight
import typings.devextreme.devextremeStrings.materialDotlimeDotlight
import typings.devextreme.devextremeStrings.materialDotorangeDotlight
import typings.devextreme.devextremeStrings.materialDotpurpleDotlight
import typings.devextreme.devextremeStrings.materialDottealDotlight
import typings.devextreme.devextremeStrings.reset
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxRangeSelectorOptions extends BaseWidgetOptions[dxRangeSelector] {
  /** Specifies the options for the range selector's background. */
  var background: js.UndefOr[AnonImage] = js.undefined
  /** Specifies the RangeSelector's behavior options. */
  var behavior: js.UndefOr[AnonAllowSlidersSwap] = js.undefined
  /** Specifies the options required to display a chart as the range selector's background. */
  var chart: js.UndefOr[AnonBarGroupPadding] = js.undefined
  /** Specifies the color of the parent page element. */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies a data source for the scale values and for the chart at the background. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** Specifies the data source field that provides data for the scale. */
  var dataSourceField: js.UndefOr[String] = js.undefined
  /** Range selector's indent options. */
  var indent: js.UndefOr[AnonRight] = js.undefined
  /** A function that is executed after the widget's value is changed. */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ AnonElementEventModel, _]] = js.undefined
  /** Specifies options of the range selector's scale. */
  var scale: js.UndefOr[AnonAggregateByCategory] = js.undefined
  /** Specifies the color of the selected range. */
  var selectedRangeColor: js.UndefOr[String] = js.undefined
  /** Specifies how the selected range should behave when data is updated. Applies only when the RangeSelector is bound to a data source. */
  var selectedRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.undefined
  /** Specifies range selector shutter options. */
  var shutter: js.UndefOr[AnonOpacity] = js.undefined
  /** Specifies the appearance of the range selector's slider handles. */
  var sliderHandle: js.UndefOr[AnonOpacityWidth] = js.undefined
  /** Defines the options of the range selector slider markers. */
  var sliderMarker: js.UndefOr[AnonInvalidRangeColor] = js.undefined
  /** The selected range (initial or current). Equals the entire scale when not set. */
  var value: js.UndefOr[(js.Array[Double | String | Date]) | VizRange] = js.undefined
}

object dxRangeSelectorOptions {
  @scala.inline
  def apply(
    background: AnonImage = null,
    behavior: AnonAllowSlidersSwap = null,
    bindingOptions: js.Any = null,
    chart: AnonBarGroupPadding = null,
    containerBackgroundColor: String = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    dataSourceField: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    indent: AnonRight = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ AnonModel[dxRangeSelector] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxRangeSelector] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxRangeSelector] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxRangeSelector] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxRangeSelector] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxRangeSelector] => _ = null,
    onInitialized: /* e */ AnonElement[dxRangeSelector] => _ = null,
    onOptionChanged: /* e */ AnonName[dxRangeSelector] => _ = null,
    onValueChanged: /* e */ AnonElementEventModel => _ = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scale: AnonAggregateByCategory = null,
    selectedRangeColor: String = null,
    selectedRangeUpdateMode: auto | keep | reset | shift = null,
    shutter: AnonOpacity = null,
    size: BaseWidgetSize = null,
    sliderHandle: AnonOpacityWidth = null,
    sliderMarker: AnonInvalidRangeColor = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseWidgetTooltip = null,
    value: (js.Array[Double | String | Date]) | VizRange = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceField != null) __obj.updateDynamic("dataSourceField")(dataSourceField.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
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
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (selectedRangeColor != null) __obj.updateDynamic("selectedRangeColor")(selectedRangeColor.asInstanceOf[js.Any])
    if (selectedRangeUpdateMode != null) __obj.updateDynamic("selectedRangeUpdateMode")(selectedRangeUpdateMode.asInstanceOf[js.Any])
    if (shutter != null) __obj.updateDynamic("shutter")(shutter.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sliderHandle != null) __obj.updateDynamic("sliderHandle")(sliderHandle.asInstanceOf[js.Any])
    if (sliderMarker != null) __obj.updateDynamic("sliderMarker")(sliderMarker.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxRangeSelectorOptions]
  }
}

