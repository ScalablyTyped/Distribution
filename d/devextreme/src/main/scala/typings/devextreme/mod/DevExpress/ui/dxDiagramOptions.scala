package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowEditImage
import typings.devextreme.anon.AutoLayout
import typings.devextreme.anon.Category
import typings.devextreme.anon.Commands
import typings.devextreme.anon.ConnectorLineEnd
import typings.devextreme.anon.ElementItem
import typings.devextreme.anon.ElementItems
import typings.devextreme.anon.ElementName
import typings.devextreme.anon.FromExpr
import typings.devextreme.anon.Item
import typings.devextreme.anon.ItemsValue
import typings.devextreme.anon.ProxyUrl
import typings.devextreme.anon.Tabs
import typings.devextreme.anon.Visibility
import typings.devextreme.anon.Visible
import typings.devextreme.anon.Width
import typings.devextreme.devextremeStrings.cm
import typings.devextreme.devextremeStrings.disabled
import typings.devextreme.devextremeStrings.fitContent
import typings.devextreme.devextremeStrings.fitWidth
import typings.devextreme.devextremeStrings.in
import typings.devextreme.devextremeStrings.landscape
import typings.devextreme.devextremeStrings.portrait
import typings.devextreme.devextremeStrings.px
import typings.devextreme.mod.DevExpress.core.dxSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDiagramOptions extends WidgetOptions[dxDiagram] {
  /** @name dxDiagram.Options.autoZoomMode */
  var autoZoomMode: js.UndefOr[fitContent | fitWidth | disabled] = js.native
  /** @name dxDiagram.Options.contextMenu */
  var contextMenu: js.UndefOr[Commands] = js.native
  /** @name dxDiagram.Options.contextToolbox */
  var contextToolbox: js.UndefOr[Category] = js.native
  /** @name dxDiagram.Options.customShapeTemplate */
  var customShapeTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, _])
  ] = js.native
  /** @name dxDiagram.Options.customShapes */
  var customShapes: js.UndefOr[js.Array[AllowEditImage]] = js.native
  /** @name dxDiagram.Options.defaultItemProperties */
  var defaultItemProperties: js.UndefOr[ConnectorLineEnd] = js.native
  /** @name dxDiagram.Options.edges */
  var edges: js.UndefOr[FromExpr] = js.native
  /** @name dxDiagram.Options.export */
  var export: js.UndefOr[ProxyUrl] = js.native
  /** @name dxDiagram.Options.fullScreen */
  var fullScreen: js.UndefOr[Boolean] = js.native
  /** @name dxDiagram.Options.gridSize */
  var gridSize: js.UndefOr[Double | ItemsValue] = js.native
  /** @name dxDiagram.Options.hasChanges */
  var hasChanges: js.UndefOr[Boolean] = js.native
  /** @name dxDiagram.Options.historyToolbar */
  var historyToolbar: js.UndefOr[Visible] = js.native
  /** @name dxDiagram.Options.mainToolbar */
  var mainToolbar: js.UndefOr[Visible] = js.native
  /** @name dxDiagram.Options.nodes */
  var nodes: js.UndefOr[AutoLayout] = js.native
  /** @name dxDiagram.Options.onCustomCommand */
  var onCustomCommand: js.UndefOr[js.Function1[/* e */ ElementName, _]] = js.native
  /** @name dxDiagram.Options.onItemClick */
  var onItemClick: js.UndefOr[js.Function1[/* e */ ElementItem, _]] = js.native
  /** @name dxDiagram.Options.onItemDblClick */
  var onItemDblClick: js.UndefOr[js.Function1[/* e */ ElementItem, _]] = js.native
  /** @name dxDiagram.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ ElementItems, _]] = js.native
  /** @name dxDiagram.Options.pageColor */
  var pageColor: js.UndefOr[String] = js.native
  /** @name dxDiagram.Options.pageOrientation */
  var pageOrientation: js.UndefOr[portrait | landscape] = js.native
  /** @name dxDiagram.Options.pageSize */
  var pageSize: js.UndefOr[Width] = js.native
  /** @name dxDiagram.Options.propertiesPanel */
  var propertiesPanel: js.UndefOr[Tabs] = js.native
  /** @name dxDiagram.Options.readOnly */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** @name dxDiagram.Options.showGrid */
  var showGrid: js.UndefOr[Boolean] = js.native
  /** @name dxDiagram.Options.simpleView */
  var simpleView: js.UndefOr[Boolean] = js.native
  /** @name dxDiagram.Options.snapToGrid */
  var snapToGrid: js.UndefOr[Boolean] = js.native
  /** @name dxDiagram.Options.toolbox */
  var toolbox: js.UndefOr[Visibility] = js.native
  /** @name dxDiagram.Options.units */
  var units: js.UndefOr[in | cm | px] = js.native
  /** @name dxDiagram.Options.viewToolbar */
  var viewToolbar: js.UndefOr[Visible] = js.native
  /** @name dxDiagram.Options.viewUnits */
  var viewUnits: js.UndefOr[in | cm | px] = js.native
  /** @name dxDiagram.Options.zoomLevel */
  var zoomLevel: js.UndefOr[Double | ItemsValue] = js.native
}

object dxDiagramOptions {
  @scala.inline
  def apply(): dxDiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramOptions]
  }
  @scala.inline
  implicit class dxDiagramOptionsOps[Self <: dxDiagramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoZoomMode(value: fitContent | fitWidth | disabled): Self = this.set("autoZoomMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoZoomMode: Self = this.set("autoZoomMode", js.undefined)
    @scala.inline
    def setContextMenu(value: Commands): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setContextToolbox(value: Category): Self = this.set("contextToolbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextToolbox: Self = this.set("contextToolbox", js.undefined)
    @scala.inline
    def setCustomShapeTemplateFunction2(value: (/* container */ dxSVGElement, /* data */ Item) => _): Self = this.set("customShapeTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setCustomShapeTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, _])
    ): Self = this.set("customShapeTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomShapeTemplate: Self = this.set("customShapeTemplate", js.undefined)
    @scala.inline
    def setCustomShapesVarargs(value: AllowEditImage*): Self = this.set("customShapes", js.Array(value :_*))
    @scala.inline
    def setCustomShapes(value: js.Array[AllowEditImage]): Self = this.set("customShapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomShapes: Self = this.set("customShapes", js.undefined)
    @scala.inline
    def setDefaultItemProperties(value: ConnectorLineEnd): Self = this.set("defaultItemProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultItemProperties: Self = this.set("defaultItemProperties", js.undefined)
    @scala.inline
    def setEdges(value: FromExpr): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    @scala.inline
    def setExport(value: ProxyUrl): Self = this.set("export", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setGridSize(value: Double | ItemsValue): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    @scala.inline
    def setHasChanges(value: Boolean): Self = this.set("hasChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasChanges: Self = this.set("hasChanges", js.undefined)
    @scala.inline
    def setHistoryToolbar(value: Visible): Self = this.set("historyToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryToolbar: Self = this.set("historyToolbar", js.undefined)
    @scala.inline
    def setMainToolbar(value: Visible): Self = this.set("mainToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainToolbar: Self = this.set("mainToolbar", js.undefined)
    @scala.inline
    def setNodes(value: AutoLayout): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    @scala.inline
    def setOnCustomCommand(value: /* e */ ElementName => _): Self = this.set("onCustomCommand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCustomCommand: Self = this.set("onCustomCommand", js.undefined)
    @scala.inline
    def setOnItemClick(value: /* e */ ElementItem => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnItemDblClick(value: /* e */ ElementItem => _): Self = this.set("onItemDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemDblClick: Self = this.set("onItemDblClick", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* e */ ElementItems => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    @scala.inline
    def setPageColor(value: String): Self = this.set("pageColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageColor: Self = this.set("pageColor", js.undefined)
    @scala.inline
    def setPageOrientation(value: portrait | landscape): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    @scala.inline
    def setPageSize(value: Width): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPropertiesPanel(value: Tabs): Self = this.set("propertiesPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertiesPanel: Self = this.set("propertiesPanel", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setShowGrid(value: Boolean): Self = this.set("showGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGrid: Self = this.set("showGrid", js.undefined)
    @scala.inline
    def setSimpleView(value: Boolean): Self = this.set("simpleView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleView: Self = this.set("simpleView", js.undefined)
    @scala.inline
    def setSnapToGrid(value: Boolean): Self = this.set("snapToGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapToGrid: Self = this.set("snapToGrid", js.undefined)
    @scala.inline
    def setToolbox(value: Visibility): Self = this.set("toolbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbox: Self = this.set("toolbox", js.undefined)
    @scala.inline
    def setUnits(value: in | cm | px): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    @scala.inline
    def setViewToolbar(value: Visible): Self = this.set("viewToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewToolbar: Self = this.set("viewToolbar", js.undefined)
    @scala.inline
    def setViewUnits(value: in | cm | px): Self = this.set("viewUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewUnits: Self = this.set("viewUnits", js.undefined)
    @scala.inline
    def setZoomLevel(value: Double | ItemsValue): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLevel: Self = this.set("zoomLevel", js.undefined)
  }
  
}

