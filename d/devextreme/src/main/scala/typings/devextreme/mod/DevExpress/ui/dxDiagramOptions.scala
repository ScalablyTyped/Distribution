package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAllowEditImage
import typings.devextreme.AnonAutoLayout
import typings.devextreme.AnonCollapsible
import typings.devextreme.AnonCommands
import typings.devextreme.AnonComponentDxDiagram
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementItems
import typings.devextreme.AnonFromExpr
import typings.devextreme.AnonGroups
import typings.devextreme.AnonItem
import typings.devextreme.AnonItemsValue
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonProxyUrl
import typings.devextreme.AnonVisible
import typings.devextreme.AnonWidth
import typings.devextreme.devextremeStrings.cm
import typings.devextreme.devextremeStrings.disabled
import typings.devextreme.devextremeStrings.fitContent
import typings.devextreme.devextremeStrings.fitWidth
import typings.devextreme.devextremeStrings.in
import typings.devextreme.devextremeStrings.landscape
import typings.devextreme.devextremeStrings.portrait
import typings.devextreme.devextremeStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDiagramOptions extends WidgetOptions[dxDiagram] {
  /** @name dxDiagram.Options.autoZoom */
  var autoZoom: js.UndefOr[fitContent | fitWidth | disabled] = js.undefined
  /** @name dxDiagram.Options.contextMenu */
  var contextMenu: js.UndefOr[AnonCommands] = js.undefined
  /** @name dxDiagram.Options.customShapes */
  var customShapes: js.UndefOr[js.Array[AnonAllowEditImage]] = js.undefined
  /** @name dxDiagram.Options.edges */
  var edges: js.UndefOr[AnonFromExpr] = js.undefined
  /** @name dxDiagram.Options.export */
  var export: js.UndefOr[AnonProxyUrl] = js.undefined
  /** @name dxDiagram.Options.fullScreen */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  /** @name dxDiagram.Options.gridSize */
  var gridSize: js.UndefOr[Double | AnonItemsValue] = js.undefined
  /** @name dxDiagram.Options.nodes */
  var nodes: js.UndefOr[AnonAutoLayout] = js.undefined
  /** @name dxDiagram.Options.onDataChanged */
  var onDataChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxDiagram, _]] = js.undefined
  /** @name dxDiagram.Options.onItemClick */
  var onItemClick: js.UndefOr[js.Function1[/* e */ AnonItem, _]] = js.undefined
  /** @name dxDiagram.Options.onItemDblClick */
  var onItemDblClick: js.UndefOr[js.Function1[/* e */ AnonItem, _]] = js.undefined
  /** @name dxDiagram.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementItems, _]] = js.undefined
  /** @name dxDiagram.Options.pageColor */
  var pageColor: js.UndefOr[String] = js.undefined
  /** @name dxDiagram.Options.pageOrientation */
  var pageOrientation: js.UndefOr[portrait | landscape] = js.undefined
  /** @name dxDiagram.Options.pageSize */
  var pageSize: js.UndefOr[AnonWidth] = js.undefined
  /** @name dxDiagram.Options.propertiesPanel */
  var propertiesPanel: js.UndefOr[AnonCollapsible] = js.undefined
  /** @name dxDiagram.Options.readOnly */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** @name dxDiagram.Options.showGrid */
  var showGrid: js.UndefOr[Boolean] = js.undefined
  /** @name dxDiagram.Options.simpleView */
  var simpleView: js.UndefOr[Boolean] = js.undefined
  /** @name dxDiagram.Options.snapToGrid */
  var snapToGrid: js.UndefOr[Boolean] = js.undefined
  /** @name dxDiagram.Options.toolbar */
  var toolbar: js.UndefOr[AnonVisible] = js.undefined
  /** @name dxDiagram.Options.toolbox */
  var toolbox: js.UndefOr[AnonGroups] = js.undefined
  /** @name dxDiagram.Options.units */
  var units: js.UndefOr[in | cm | px] = js.undefined
  /** @name dxDiagram.Options.viewUnits */
  var viewUnits: js.UndefOr[in | cm | px] = js.undefined
  /** @name dxDiagram.Options.zoomLevel */
  var zoomLevel: js.UndefOr[Double | AnonItemsValue] = js.undefined
}

object dxDiagramOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    autoZoom: fitContent | fitWidth | disabled = null,
    bindingOptions: js.Any = null,
    contextMenu: AnonCommands = null,
    customShapes: js.Array[AnonAllowEditImage] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    edges: AnonFromExpr = null,
    elementAttr: js.Any = null,
    export: AnonProxyUrl = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    gridSize: Double | AnonItemsValue = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    nodes: AnonAutoLayout = null,
    onContentReady: /* e */ AnonComponentElement[dxDiagram] => _ = null,
    onDataChanged: /* e */ AnonComponentDxDiagram => _ = null,
    onDisposing: /* e */ AnonModel[dxDiagram] => _ = null,
    onInitialized: /* e */ AnonElement[dxDiagram] => _ = null,
    onItemClick: /* e */ AnonItem => _ = null,
    onItemDblClick: /* e */ AnonItem => _ = null,
    onOptionChanged: /* e */ AnonName[dxDiagram] => _ = null,
    onSelectionChanged: /* e */ AnonElementItems => _ = null,
    pageColor: String = null,
    pageOrientation: portrait | landscape = null,
    pageSize: AnonWidth = null,
    propertiesPanel: AnonCollapsible = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    simpleView: js.UndefOr[Boolean] = js.undefined,
    snapToGrid: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    toolbar: AnonVisible = null,
    toolbox: AnonGroups = null,
    units: in | cm | px = null,
    viewUnits: in | cm | px = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoomLevel: Double | AnonItemsValue = null
  ): dxDiagramOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (autoZoom != null) __obj.updateDynamic("autoZoom")(autoZoom.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (customShapes != null) __obj.updateDynamic("customShapes")(customShapes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDataChanged != null) __obj.updateDynamic("onDataChanged")(js.Any.fromFunction1(onDataChanged))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onItemDblClick != null) __obj.updateDynamic("onItemDblClick")(js.Any.fromFunction1(onItemDblClick))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (pageColor != null) __obj.updateDynamic("pageColor")(pageColor.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (propertiesPanel != null) __obj.updateDynamic("propertiesPanel")(propertiesPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleView)) __obj.updateDynamic("simpleView")(simpleView.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToGrid)) __obj.updateDynamic("snapToGrid")(snapToGrid.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (toolbox != null) __obj.updateDynamic("toolbox")(toolbox.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (viewUnits != null) __obj.updateDynamic("viewUnits")(viewUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDiagramOptions]
  }
}

