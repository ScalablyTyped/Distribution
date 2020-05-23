package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.CancelComponentData
import typings.devextreme.anon.ColorCodeField
import typings.devextreme.anon.ComponentTElementDxElementModelAny
import typings.devextreme.anon.Element
import typings.devextreme.anon.ElementModelNode
import typings.devextreme.anon.FormatModel
import typings.devextreme.anon.HeaderHeight
import typings.devextreme.anon.JQueryEventModelNode
import typings.devextreme.anon.Model
import typings.devextreme.anon.ModelRoot
import typings.devextreme.anon.Name
import typings.devextreme.anon.Rect
import typings.devextreme.anon.SelectionStyle
import typings.devextreme.anon.TargetAny
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.genericDotcarmine
import typings.devextreme.devextremeStrings.genericDotcontrast
import typings.devextreme.devextremeStrings.genericDotdark
import typings.devextreme.devextremeStrings.genericDotdarkmoon
import typings.devextreme.devextremeStrings.genericDotdarkviolet
import typings.devextreme.devextremeStrings.genericDotgreenmist
import typings.devextreme.devextremeStrings.genericDotlight
import typings.devextreme.devextremeStrings.genericDotsoftblue
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.ios7Dotdefault
import typings.devextreme.devextremeStrings.leftBottomRightTop
import typings.devextreme.devextremeStrings.leftTopRightBottom
import typings.devextreme.devextremeStrings.materialDotblueDotlight
import typings.devextreme.devextremeStrings.materialDotlimeDotlight
import typings.devextreme.devextremeStrings.materialDotorangeDotlight
import typings.devextreme.devextremeStrings.materialDotpurpleDotlight
import typings.devextreme.devextremeStrings.materialDottealDotlight
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.rightBottomLeftTop
import typings.devextreme.devextremeStrings.rightTopLeftBottom
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.sliceanddice
import typings.devextreme.devextremeStrings.squarified
import typings.devextreme.devextremeStrings.strip
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeMapOptions extends BaseWidgetOptions[dxTreeMap] {
  /** @name dxTreeMap.Options.childrenField */
  var childrenField: js.UndefOr[String] = js.undefined
  /** @name dxTreeMap.Options.colorField */
  var colorField: js.UndefOr[String] = js.undefined
  /** @name dxTreeMap.Options.colorizer */
  var colorizer: js.UndefOr[ColorCodeField] = js.undefined
  /** @name dxTreeMap.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** @name dxTreeMap.Options.group */
  var group: js.UndefOr[HeaderHeight] = js.undefined
  /** @name dxTreeMap.Options.hoverEnabled */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeMap.Options.idField */
  var idField: js.UndefOr[String] = js.undefined
  /** @name dxTreeMap.Options.interactWithGroup */
  var interactWithGroup: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeMap.Options.labelField */
  var labelField: js.UndefOr[String] = js.undefined
  /** @name dxTreeMap.Options.layoutAlgorithm */
  var layoutAlgorithm: js.UndefOr[sliceanddice | squarified | strip | (js.Function1[/* e */ Rect, _])] = js.undefined
  /** @name dxTreeMap.Options.layoutDirection */
  var layoutDirection: js.UndefOr[
    leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom
  ] = js.undefined
  /** @name dxTreeMap.Options.maxDepth */
  var maxDepth: js.UndefOr[Double] = js.undefined
  /** @name dxTreeMap.Options.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ JQueryEventModelNode, _]) | String] = js.undefined
  /** @name dxTreeMap.Options.onDrill */
  var onDrill: js.UndefOr[js.Function1[/* e */ ElementModelNode, _]] = js.undefined
  /** @name dxTreeMap.Options.onHoverChanged */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ ElementModelNode, _]] = js.undefined
  /** @name dxTreeMap.Options.onNodesInitialized */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ ModelRoot, _]] = js.undefined
  /** @name dxTreeMap.Options.onNodesRendering */
  var onNodesRendering: js.UndefOr[js.Function1[/* e */ ElementModelNode, _]] = js.undefined
  /** @name dxTreeMap.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ ElementModelNode, _]] = js.undefined
  /** @name dxTreeMap.Options.parentField */
  var parentField: js.UndefOr[String] = js.undefined
  /** @deprecated */
  /** @name dxTreeMap.Options.resolveLabelOverflow */
  var resolveLabelOverflow: js.UndefOr[ellipsis | hide] = js.undefined
  /** @name dxTreeMap.Options.selectionMode */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.undefined
  /** @name dxTreeMap.Options.tile */
  var tile: js.UndefOr[SelectionStyle] = js.undefined
  /** @name dxTreeMap.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxTreeMapOptions: js.UndefOr[dxTreeMapTooltip] = js.undefined
  /** @name dxTreeMap.Options.valueField */
  var valueField: js.UndefOr[String] = js.undefined
}

object dxTreeMapOptions {
  @scala.inline
  def apply(
    bindingOptions: js.Any = null,
    childrenField: String = null,
    colorField: String = null,
    colorizer: ColorCodeField = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    group: HeaderHeight = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    idField: String = null,
    interactWithGroup: js.UndefOr[Boolean] = js.undefined,
    labelField: String = null,
    layoutAlgorithm: sliceanddice | squarified | strip | (js.Function1[/* e */ Rect, _]) = null,
    layoutDirection: leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    maxDepth: js.UndefOr[Double] = js.undefined,
    onClick: (js.Function1[/* e */ JQueryEventModelNode, _]) | String = null,
    onDisposing: /* e */ Model[dxTreeMap] => _ = null,
    onDrawn: /* e */ ComponentTElementDxElementModelAny[dxTreeMap] => _ = null,
    onDrill: /* e */ ElementModelNode => _ = null,
    onExported: /* e */ ComponentTElementDxElementModelAny[dxTreeMap] => _ = null,
    onExporting: /* e */ FormatModel[dxTreeMap] => _ = null,
    onFileSaving: /* e */ CancelComponentData[dxTreeMap] => _ = null,
    onHoverChanged: /* e */ ElementModelNode => _ = null,
    onIncidentOccurred: /* e */ TargetAny[dxTreeMap] => _ = null,
    onInitialized: /* e */ Element[dxTreeMap] => _ = null,
    onNodesInitialized: /* e */ ModelRoot => _ = null,
    onNodesRendering: /* e */ ElementModelNode => _ = null,
    onOptionChanged: /* e */ Name[dxTreeMap] => _ = null,
    onSelectionChanged: /* e */ ElementModelNode => _ = null,
    parentField: String = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverflow: ellipsis | hide = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionMode: multiple | none | single_ = null,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    tile: SelectionStyle = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxTreeMapTooltip = null,
    valueField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxTreeMapOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (childrenField != null) __obj.updateDynamic("childrenField")(childrenField.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField.asInstanceOf[js.Any])
    if (colorizer != null) __obj.updateDynamic("colorizer")(colorizer.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.get.asInstanceOf[js.Any])
    if (idField != null) __obj.updateDynamic("idField")(idField.asInstanceOf[js.Any])
    if (!js.isUndefined(interactWithGroup)) __obj.updateDynamic("interactWithGroup")(interactWithGroup.get.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (layoutAlgorithm != null) __obj.updateDynamic("layoutAlgorithm")(layoutAlgorithm.asInstanceOf[js.Any])
    if (layoutDirection != null) __obj.updateDynamic("layoutDirection")(layoutDirection.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onDrill != null) __obj.updateDynamic("onDrill")(js.Any.fromFunction1(onDrill))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onHoverChanged != null) __obj.updateDynamic("onHoverChanged")(js.Any.fromFunction1(onHoverChanged))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onNodesInitialized != null) __obj.updateDynamic("onNodesInitialized")(js.Any.fromFunction1(onNodesInitialized))
    if (onNodesRendering != null) __obj.updateDynamic("onNodesRendering")(js.Any.fromFunction1(onNodesRendering))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (parentField != null) __obj.updateDynamic("parentField")(parentField.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.get.asInstanceOf[js.Any])
    if (resolveLabelOverflow != null) __obj.updateDynamic("resolveLabelOverflow")(resolveLabelOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeMapOptions]
  }
}

