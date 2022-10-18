package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowAddShape
import typings.devextreme.anon.AllowEditImage
import typings.devextreme.anon.AutoLayout
import typings.devextreme.anon.Category
import typings.devextreme.anon.Commands
import typings.devextreme.anon.ConnectorLineEnd
import typings.devextreme.anon.CustomDataExpr
import typings.devextreme.anon.FileName
import typings.devextreme.anon.Items
import typings.devextreme.anon.ShapeIconsPerRow
import typings.devextreme.anon.Tabs
import typings.devextreme.anon.Visible
import typings.devextreme.anon.Width
import typings.devextreme.mod.DevExpress.common.PageOrientation
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxDiagram.CustomCommandEvent
import typings.devextreme.mod.DevExpress.ui.dxDiagram.CustomShapeTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDiagram.CustomShapeToolboxTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramAutoZoomMode
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramUnits
import typings.devextreme.mod.DevExpress.ui.dxDiagram.ItemClickEvent
import typings.devextreme.mod.DevExpress.ui.dxDiagram.ItemDblClickEvent
import typings.devextreme.mod.DevExpress.ui.dxDiagram.RequestEditOperationEvent
import typings.devextreme.mod.DevExpress.ui.dxDiagram.RequestLayoutUpdateEvent
import typings.devextreme.mod.DevExpress.ui.dxDiagram.SelectionChangedEvent
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramOptions
  extends StObject
     with WidgetOptions[dxDiagram] {
  
  /**
    * Specifies how the Diagram UI component automatically zooms the work area.
    */
  var autoZoomMode: js.UndefOr[DiagramAutoZoomMode] = js.undefined
  
  /**
    * Configures the context menu&apos;s settings.
    */
  var contextMenu: js.UndefOr[Commands] = js.undefined
  
  /**
    * Configures the context toolbox&apos;s settings.
    */
  var contextToolbox: js.UndefOr[Category] = js.undefined
  
  /**
    * Specifies a custom template for shapes.
    */
  var customShapeTemplate: js.UndefOr[
    template | (js.Function2[/* container */ DxElement_[SVGElement], /* data */ CustomShapeTemplateData, Any])
  ] = js.undefined
  
  /**
    * Specifies a custom template for shapes in the toolbox.
    */
  var customShapeToolboxTemplate: js.UndefOr[
    template | (js.Function2[
      /* container */ DxElement_[SVGElement], 
      /* data */ CustomShapeToolboxTemplateData, 
      Any
    ])
  ] = js.undefined
  
  /**
    * Provide access to an array of custom shapes.
    */
  var customShapes: js.UndefOr[js.Array[AllowEditImage]] = js.undefined
  
  /**
    * Configures default item properties.
    */
  var defaultItemProperties: js.UndefOr[ConnectorLineEnd] = js.undefined
  
  /**
    * Allows you to bind the collection of diagram edges to a data source. For more information, see the Data Binding section.
    */
  var edges: js.UndefOr[CustomDataExpr] = js.undefined
  
  /**
    * Specifies which editing operations a user can perform.
    */
  var editing: js.UndefOr[AllowAddShape] = js.undefined
  
  /**
    * Configures export settings.
    */
  var `export`: js.UndefOr[FileName] = js.undefined
  
  /**
    * Specifies whether or not to display the UI component in full-screen mode.
    */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the grid pitch.
    */
  var gridSize: js.UndefOr[Double | Items] = js.undefined
  
  /**
    * Indicates whether diagram content has been changed.
    */
  var hasChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the history toolbar&apos;s settings.
    */
  var historyToolbar: js.UndefOr[Visible] = js.undefined
  
  /**
    * Configures the main toolbar settings.
    */
  var mainToolbar: js.UndefOr[Visible] = js.undefined
  
  /**
    * Allows you to bind the collection of diagram nodes to a data source. For more information, see the Data Binding section.
    */
  var nodes: js.UndefOr[AutoLayout] = js.undefined
  
  /**
    * A function that is executed after a custom command item was clicked and allows you to implement the custom command&apos;s logic.
    */
  var onCustomCommand: js.UndefOr[js.Function1[/* e */ CustomCommandEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after a shape or connector is clicked.
    */
  var onItemClick: js.UndefOr[js.Function1[/* e */ ItemClickEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after a shape or connector is double-clicked.
    */
  var onItemDblClick: js.UndefOr[js.Function1[/* e */ ItemDblClickEvent, Unit]] = js.undefined
  
  /**
    * A function that allows you to prohibit an edit operation at run time.
    */
  var onRequestEditOperation: js.UndefOr[js.Function1[/* e */ RequestEditOperationEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after diagram data is reloaded and allows you to specify whether or not the UI component should update the diagram layout.
    */
  var onRequestLayoutUpdate: js.UndefOr[js.Function1[/* e */ RequestLayoutUpdateEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after the selection is changed in the Diagram.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * Specifies the color of a diagram page.
    */
  var pageColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the page orientation.
    */
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  
  /**
    * Specifies a size of pages.
    */
  var pageSize: js.UndefOr[Width] = js.undefined
  
  /**
    * Configures the Properties panel settings.
    */
  var propertiesPanel: js.UndefOr[Tabs] = js.undefined
  
  /**
    * Specifies whether the diagram is read-only.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether grid lines are visible.
    */
  var showGrid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Switch the Diagram UI component to simple view mode.
    */
  var simpleView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether diagram elements should snap to grid lines.
    */
  var snapToGrid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the toolbox settings.
    */
  var toolbox: js.UndefOr[ShapeIconsPerRow] = js.undefined
  
  /**
    * Specifies the measurement unit for size properties.
    */
  var units: js.UndefOr[DiagramUnits] = js.undefined
  
  /**
    * Specifies whether or not the UI component uses native scrolling.
    */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the view toolbar settings.
    */
  var viewToolbar: js.UndefOr[Visible] = js.undefined
  
  /**
    * Specifies the measurement unit that is displayed in user interface elements.
    */
  var viewUnits: js.UndefOr[DiagramUnits] = js.undefined
  
  /**
    * Specifies the zoom level.
    */
  var zoomLevel: js.UndefOr[Double | Items] = js.undefined
}
object dxDiagramOptions {
  
  inline def apply(): dxDiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramOptions]
  }
  
  extension [Self <: dxDiagramOptions](x: Self) {
    
    inline def setAutoZoomMode(value: DiagramAutoZoomMode): Self = StObject.set(x, "autoZoomMode", value.asInstanceOf[js.Any])
    
    inline def setAutoZoomModeUndefined: Self = StObject.set(x, "autoZoomMode", js.undefined)
    
    inline def setContextMenu(value: Commands): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setContextToolbox(value: Category): Self = StObject.set(x, "contextToolbox", value.asInstanceOf[js.Any])
    
    inline def setContextToolboxUndefined: Self = StObject.set(x, "contextToolbox", js.undefined)
    
    inline def setCustomShapeTemplate(
      value: template | (js.Function2[/* container */ DxElement_[SVGElement], /* data */ CustomShapeTemplateData, Any])
    ): Self = StObject.set(x, "customShapeTemplate", value.asInstanceOf[js.Any])
    
    inline def setCustomShapeTemplateFunction2(value: (/* container */ DxElement_[SVGElement], /* data */ CustomShapeTemplateData) => Any): Self = StObject.set(x, "customShapeTemplate", js.Any.fromFunction2(value))
    
    inline def setCustomShapeTemplateUndefined: Self = StObject.set(x, "customShapeTemplate", js.undefined)
    
    inline def setCustomShapeToolboxTemplate(
      value: template | (js.Function2[
          /* container */ DxElement_[SVGElement], 
          /* data */ CustomShapeToolboxTemplateData, 
          Any
        ])
    ): Self = StObject.set(x, "customShapeToolboxTemplate", value.asInstanceOf[js.Any])
    
    inline def setCustomShapeToolboxTemplateFunction2(value: (/* container */ DxElement_[SVGElement], /* data */ CustomShapeToolboxTemplateData) => Any): Self = StObject.set(x, "customShapeToolboxTemplate", js.Any.fromFunction2(value))
    
    inline def setCustomShapeToolboxTemplateUndefined: Self = StObject.set(x, "customShapeToolboxTemplate", js.undefined)
    
    inline def setCustomShapes(value: js.Array[AllowEditImage]): Self = StObject.set(x, "customShapes", value.asInstanceOf[js.Any])
    
    inline def setCustomShapesUndefined: Self = StObject.set(x, "customShapes", js.undefined)
    
    inline def setCustomShapesVarargs(value: AllowEditImage*): Self = StObject.set(x, "customShapes", js.Array(value*))
    
    inline def setDefaultItemProperties(value: ConnectorLineEnd): Self = StObject.set(x, "defaultItemProperties", value.asInstanceOf[js.Any])
    
    inline def setDefaultItemPropertiesUndefined: Self = StObject.set(x, "defaultItemProperties", js.undefined)
    
    inline def setEdges(value: CustomDataExpr): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setEditing(value: AllowAddShape): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setExport(value: FileName): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    inline def setGridSize(value: Double | Items): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    inline def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
    
    inline def setHasChanges(value: Boolean): Self = StObject.set(x, "hasChanges", value.asInstanceOf[js.Any])
    
    inline def setHasChangesUndefined: Self = StObject.set(x, "hasChanges", js.undefined)
    
    inline def setHistoryToolbar(value: Visible): Self = StObject.set(x, "historyToolbar", value.asInstanceOf[js.Any])
    
    inline def setHistoryToolbarUndefined: Self = StObject.set(x, "historyToolbar", js.undefined)
    
    inline def setMainToolbar(value: Visible): Self = StObject.set(x, "mainToolbar", value.asInstanceOf[js.Any])
    
    inline def setMainToolbarUndefined: Self = StObject.set(x, "mainToolbar", js.undefined)
    
    inline def setNodes(value: AutoLayout): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setOnCustomCommand(value: /* e */ CustomCommandEvent => Unit): Self = StObject.set(x, "onCustomCommand", js.Any.fromFunction1(value))
    
    inline def setOnCustomCommandUndefined: Self = StObject.set(x, "onCustomCommand", js.undefined)
    
    inline def setOnItemClick(value: /* e */ ItemClickEvent => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnItemDblClick(value: /* e */ ItemDblClickEvent => Unit): Self = StObject.set(x, "onItemDblClick", js.Any.fromFunction1(value))
    
    inline def setOnItemDblClickUndefined: Self = StObject.set(x, "onItemDblClick", js.undefined)
    
    inline def setOnRequestEditOperation(value: /* e */ RequestEditOperationEvent => Unit): Self = StObject.set(x, "onRequestEditOperation", js.Any.fromFunction1(value))
    
    inline def setOnRequestEditOperationUndefined: Self = StObject.set(x, "onRequestEditOperation", js.undefined)
    
    inline def setOnRequestLayoutUpdate(value: /* e */ RequestLayoutUpdateEvent => Unit): Self = StObject.set(x, "onRequestLayoutUpdate", js.Any.fromFunction1(value))
    
    inline def setOnRequestLayoutUpdateUndefined: Self = StObject.set(x, "onRequestLayoutUpdate", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setPageColor(value: String): Self = StObject.set(x, "pageColor", value.asInstanceOf[js.Any])
    
    inline def setPageColorUndefined: Self = StObject.set(x, "pageColor", js.undefined)
    
    inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    inline def setPageSize(value: Width): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPropertiesPanel(value: Tabs): Self = StObject.set(x, "propertiesPanel", value.asInstanceOf[js.Any])
    
    inline def setPropertiesPanelUndefined: Self = StObject.set(x, "propertiesPanel", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
    
    inline def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
    
    inline def setSimpleView(value: Boolean): Self = StObject.set(x, "simpleView", value.asInstanceOf[js.Any])
    
    inline def setSimpleViewUndefined: Self = StObject.set(x, "simpleView", js.undefined)
    
    inline def setSnapToGrid(value: Boolean): Self = StObject.set(x, "snapToGrid", value.asInstanceOf[js.Any])
    
    inline def setSnapToGridUndefined: Self = StObject.set(x, "snapToGrid", js.undefined)
    
    inline def setToolbox(value: ShapeIconsPerRow): Self = StObject.set(x, "toolbox", value.asInstanceOf[js.Any])
    
    inline def setToolboxUndefined: Self = StObject.set(x, "toolbox", js.undefined)
    
    inline def setUnits(value: DiagramUnits): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    inline def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
    
    inline def setViewToolbar(value: Visible): Self = StObject.set(x, "viewToolbar", value.asInstanceOf[js.Any])
    
    inline def setViewToolbarUndefined: Self = StObject.set(x, "viewToolbar", js.undefined)
    
    inline def setViewUnits(value: DiagramUnits): Self = StObject.set(x, "viewUnits", value.asInstanceOf[js.Any])
    
    inline def setViewUnitsUndefined: Self = StObject.set(x, "viewUnits", js.undefined)
    
    inline def setZoomLevel(value: Double | Items): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    
    inline def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
  }
}
