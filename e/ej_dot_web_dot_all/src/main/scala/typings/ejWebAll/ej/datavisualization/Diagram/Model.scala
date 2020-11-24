package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Triggers When auto scroll is changed
    */
  var autoScrollChange: js.UndefOr[js.Function1[/* e */ AutoScrollChangeEventArgs, Unit]] = js.native
  
  /** Defines the background color of diagram elements
    * @Default {transparent}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Defines the path of the background image of diagram elements
    */
  var backgroundImage: js.UndefOr[String] = js.native
  
  /** Sets the direction of line bridges.
    * @Default {ej.datavisualization.Diagram.BridgeDirection.Top}
    */
  var bridgeDirection: js.UndefOr[BridgeDirection | String] = js.native
  
  /** Triggers when a node, connector or diagram is clicked
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** Defines a set of custom commands and binds them with a set of desired key gestures.
    */
  var commandManager: js.UndefOr[CommandManager] = js.native
  
  /** Triggers when the connection is changed
    */
  var connectionChange: js.UndefOr[js.Function1[/* e */ ConnectionChangeEventArgs, Unit]] = js.native
  
  /** Triggers when the connector collection is changed
    */
  var connectorCollectionChange: js.UndefOr[js.Function1[/* e */ ConnectorCollectionChangeEventArgs, Unit]] = js.native
  
  /** Triggers when the connectors' source point is changed
    */
  var connectorSourceChange: js.UndefOr[js.Function1[/* e */ ConnectorSourceChangeEventArgs, Unit]] = js.native
  
  /** Triggers when the connectors' target point is changed
    */
  var connectorTargetChange: js.UndefOr[js.Function1[/* e */ ConnectorTargetChangeEventArgs, Unit]] = js.native
  
  /** Binds the custom JSON data with connector properties
    * @Default {null}
    */
  var connectorTemplate: js.UndefOr[js.Any] = js.native
  
  /** A collection of JSON objects where each object represents a connector
    * @Default {[]}
    */
  var connectors: js.UndefOr[js.Array[Connector]] = js.native
  
  /** Enables/Disables the default behaviors of the diagram.
    * @Default {ej.datavisualization.Diagram.DiagramConstraints.All}
    */
  var constraints: js.UndefOr[DiagramConstraints | String] = js.native
  
  /** An object to customize the context menu of diagram
    */
  var contextMenu: js.UndefOr[ContextMenu] = js.native
  
  /** Triggers before opening the context menu
    */
  var contextMenuBeforeOpen: js.UndefOr[js.Function1[/* e */ ContextMenuBeforeOpenEventArgs, Unit]] = js.native
  
  /** Triggers when a context menu item is clicked
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.native
  
  /** Triggered when the diagram is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Configures the data source that is to be bound with diagram
    */
  var dataSourceSettings: js.UndefOr[DataSourceSettings] = js.native
  
  /** Initializes the default values for nodes and connectors
    * @Default {{}}
    */
  var defaultSettings: js.UndefOr[DefaultSettings] = js.native
  
  /** Triggers when a node, connector or diagram model is clicked twice
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  
  /** Triggers while dragging the elements in diagram
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  
  /** Triggers when a symbol is dragged into diagram from symbol palette
    */
  var dragEnter: js.UndefOr[js.Function1[/* e */ DragEnterEventArgs, Unit]] = js.native
  
  /** Triggers when a symbol is dragged outside of the diagram.
    */
  var dragLeave: js.UndefOr[js.Function1[/* e */ DragLeaveEventArgs, Unit]] = js.native
  
  /** Triggers when a symbol is dragged over diagram
    */
  var dragOver: js.UndefOr[js.Function1[/* e */ DragOverEventArgs, Unit]] = js.native
  
  /** Sets the type of JSON object to be drawn through drawing tool
    * @Default {{}}
    */
  var drawType: js.UndefOr[js.Any] = js.native
  
  /** Triggers when a symbol is dragged and dropped from symbol palette to drawing area
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.native
  
  /** Triggers when editor got focus at the time of node's label or text node editing.
    */
  var editorFocusChange: js.UndefOr[js.Function1[/* e */ EditorFocusChangeEventArgs, Unit]] = js.native
  
  /** Enables or disables auto scroll in diagram
    * @Default {true}
    */
  var enableAutoScroll: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables diagram context menu
    * @Default {true}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  
  /** Triggers when a child is added to or removed from a group
    */
  var groupChange: js.UndefOr[js.Function1[/* e */ GroupChangeEventArgs, Unit]] = js.native
  
  /** Specifies the height of the diagram
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.native
  
  /** Triggers when a change is reverted or restored(undo/redo)
    */
  var historyChange: js.UndefOr[js.Function1[/* e */ HistoryChangeEventArgs, Unit]] = js.native
  
  /** Customizes the undo redo functionality
    */
  var historyManager: js.UndefOr[HistoryManager] = js.native
  
  /** Triggers when a diagram element is clicked
    */
  var itemClick: js.UndefOr[js.Function1[/* e */ ItemClickEventArgs, Unit]] = js.native
  
  /** Defines the type of the rendering mode of label.
    * @Default {HTML}
    */
  var labelRenderingMode: js.UndefOr[LabelRenderingMode | String] = js.native
  
  /** A collection of JSON objects where each object represents a layer. Layer is a named category of diagram shapes.
    * @Default {[]}
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  
  /** Automatically arranges the nodes and connectors in a predefined manner.
    */
  var layout: js.UndefOr[Layout] = js.native
  
  /** Defines the current culture of diagram
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Triggers when mouse enters a node/connector
    */
  var mouseEnter: js.UndefOr[js.Function1[/* e */ MouseEnterEventArgs, Unit]] = js.native
  
  /** Triggers when mouse leaves node/connector
    */
  var mouseLeave: js.UndefOr[js.Function1[/* e */ MouseLeaveEventArgs, Unit]] = js.native
  
  /** Triggers when mouse hovers over a node/connector
    */
  var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, Unit]] = js.native
  
  /** Triggers when node collection is changed
    */
  var nodeCollectionChange: js.UndefOr[js.Function1[/* e */ NodeCollectionChangeEventArgs, Unit]] = js.native
  
  /** Binds the custom JSON data with node properties
    * @Default {null}
    */
  var nodeTemplate: js.UndefOr[js.Any] = js.native
  
  /** Array of JSON objects where each object represents a node
    * @Default {[]}
    */
  var nodes: js.UndefOr[js.Array[Node]] = js.native
  
  /** Defines the size and appearance of diagram page
    */
  var pageSettings: js.UndefOr[PageSettings] = js.native
  
  /** Triggers when the node properties(x, y,width and height alone) are changed using nudge commands or updateNode API.
    */
  var propertyChange: js.UndefOr[js.Function1[/* e */ PropertyChangeEventArgs, Unit]] = js.native
  
  /** Triggers when the diagram elements are rotated
    */
  var rotationChange: js.UndefOr[js.Function1[/* e */ RotationChangeEventArgs, Unit]] = js.native
  
  /** Defines the properties of the both the horizontal and vertical gauge to measure the diagram area.
    */
  var rulerSettings: js.UndefOr[RulerSettings] = js.native
  
  /** Triggers when the diagram is zoomed or panned
    */
  var scrollChange: js.UndefOr[js.Function1[/* e */ ScrollChangeEventArgs, Unit]] = js.native
  
  /** Defines the zoom value, zoom factor, scroll status and view port size of the diagram
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.native
  
  /** Triggers when a connector segment is edited
    */
  var segmentChange: js.UndefOr[js.Function1[/* e */ SegmentChangeEventArgs, Unit]] = js.native
  
  /** Defines the size and position of selected items and defines the appearance of selector
    */
  var selectedItems: js.UndefOr[SelectedItems] = js.native
  
  /** Triggers when the selection is changed in diagram
    */
  var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.native
  
  /** Defines diagram serialization properties that would defines how the serialization content would be.
    */
  var serializationSettings: js.UndefOr[SerializationSettings] = js.native
  
  /** Used to decide on the action on Diagramming elements at runtime.
    */
  var setTool: js.UndefOr[js.Function1[/* e */ SetToolEventArgs, Unit]] = js.native
  
  /** Enables or disables tooltip of diagram
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  
  /** Triggers when a node is resized
    */
  var sizeChange: js.UndefOr[js.Function1[/* e */ SizeChangeEventArgs, Unit]] = js.native
  
  /** Defines the gridlines and defines how and when the objects have to be snapped
    */
  var snapSettings: js.UndefOr[SnapSettings] = js.native
  
  /** Triggers when label editing is ended
    */
  var textChange: js.UndefOr[js.Function1[/* e */ TextChangeEventArgs, Unit]] = js.native
  
  /** Enables/Disables the interactive behaviors of diagram.
    * @Default {ej.datavisualization.Diagram.Tool.All}
    */
  var tool: js.UndefOr[Tool | String] = js.native
  
  /** An object that defines the description, appearance and alignments of tooltips
    * @Default {null}
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  
  /** Specifies the width of the diagram
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.native
  
  /** Sets the factor by which we can zoom in or zoom out
    * @Default {0.2}
    */
  var zoomFactor: js.UndefOr[Double] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAutoScrollChange(value: /* e */ AutoScrollChangeEventArgs => Unit): Self = this.set("autoScrollChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAutoScrollChange: Self = this.set("autoScrollChange", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundImage(value: String): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    
    @scala.inline
    def setBridgeDirection(value: BridgeDirection | String): Self = this.set("bridgeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBridgeDirection: Self = this.set("bridgeDirection", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setCommandManager(value: CommandManager): Self = this.set("commandManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandManager: Self = this.set("commandManager", js.undefined)
    
    @scala.inline
    def setConnectionChange(value: /* e */ ConnectionChangeEventArgs => Unit): Self = this.set("connectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConnectionChange: Self = this.set("connectionChange", js.undefined)
    
    @scala.inline
    def setConnectorCollectionChange(value: /* e */ ConnectorCollectionChangeEventArgs => Unit): Self = this.set("connectorCollectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConnectorCollectionChange: Self = this.set("connectorCollectionChange", js.undefined)
    
    @scala.inline
    def setConnectorSourceChange(value: /* e */ ConnectorSourceChangeEventArgs => Unit): Self = this.set("connectorSourceChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConnectorSourceChange: Self = this.set("connectorSourceChange", js.undefined)
    
    @scala.inline
    def setConnectorTargetChange(value: /* e */ ConnectorTargetChangeEventArgs => Unit): Self = this.set("connectorTargetChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConnectorTargetChange: Self = this.set("connectorTargetChange", js.undefined)
    
    @scala.inline
    def setConnectorTemplate(value: js.Any): Self = this.set("connectorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorTemplate: Self = this.set("connectorTemplate", js.undefined)
    
    @scala.inline
    def setConnectorsVarargs(value: Connector*): Self = this.set("connectors", js.Array(value :_*))
    
    @scala.inline
    def setConnectors(value: js.Array[Connector]): Self = this.set("connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectors: Self = this.set("connectors", js.undefined)
    
    @scala.inline
    def setConstraints(value: DiagramConstraints | String): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setContextMenu(value: ContextMenu): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setContextMenuBeforeOpen(value: /* e */ ContextMenuBeforeOpenEventArgs => Unit): Self = this.set("contextMenuBeforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContextMenuBeforeOpen: Self = this.set("contextMenuBeforeOpen", js.undefined)
    
    @scala.inline
    def setContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = this.set("contextMenuClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContextMenuClick: Self = this.set("contextMenuClick", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDataSourceSettings(value: DataSourceSettings): Self = this.set("dataSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceSettings: Self = this.set("dataSourceSettings", js.undefined)
    
    @scala.inline
    def setDefaultSettings(value: DefaultSettings): Self = this.set("defaultSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSettings: Self = this.set("defaultSettings", js.undefined)
    
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ DragEventArgs => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragEnter(value: /* e */ DragEnterEventArgs => Unit): Self = this.set("dragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragEnter: Self = this.set("dragEnter", js.undefined)
    
    @scala.inline
    def setDragLeave(value: /* e */ DragLeaveEventArgs => Unit): Self = this.set("dragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragLeave: Self = this.set("dragLeave", js.undefined)
    
    @scala.inline
    def setDragOver(value: /* e */ DragOverEventArgs => Unit): Self = this.set("dragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragOver: Self = this.set("dragOver", js.undefined)
    
    @scala.inline
    def setDrawType(value: js.Any): Self = this.set("drawType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawType: Self = this.set("drawType", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ DropEventArgs => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setEditorFocusChange(value: /* e */ EditorFocusChangeEventArgs => Unit): Self = this.set("editorFocusChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEditorFocusChange: Self = this.set("editorFocusChange", js.undefined)
    
    @scala.inline
    def setEnableAutoScroll(value: Boolean): Self = this.set("enableAutoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoScroll: Self = this.set("enableAutoScroll", js.undefined)
    
    @scala.inline
    def setEnableContextMenu(value: Boolean): Self = this.set("enableContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableContextMenu: Self = this.set("enableContextMenu", js.undefined)
    
    @scala.inline
    def setGroupChange(value: /* e */ GroupChangeEventArgs => Unit): Self = this.set("groupChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGroupChange: Self = this.set("groupChange", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHistoryChange(value: /* e */ HistoryChangeEventArgs => Unit): Self = this.set("historyChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHistoryChange: Self = this.set("historyChange", js.undefined)
    
    @scala.inline
    def setHistoryManager(value: HistoryManager): Self = this.set("historyManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryManager: Self = this.set("historyManager", js.undefined)
    
    @scala.inline
    def setItemClick(value: /* e */ ItemClickEventArgs => Unit): Self = this.set("itemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemClick: Self = this.set("itemClick", js.undefined)
    
    @scala.inline
    def setLabelRenderingMode(value: LabelRenderingMode | String): Self = this.set("labelRenderingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelRenderingMode: Self = this.set("labelRenderingMode", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMouseEnter(value: /* e */ MouseEnterEventArgs => Unit): Self = this.set("mouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseEnter: Self = this.set("mouseEnter", js.undefined)
    
    @scala.inline
    def setMouseLeave(value: /* e */ MouseLeaveEventArgs => Unit): Self = this.set("mouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseLeave: Self = this.set("mouseLeave", js.undefined)
    
    @scala.inline
    def setMouseOver(value: /* e */ MouseOverEventArgs => Unit): Self = this.set("mouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseOver: Self = this.set("mouseOver", js.undefined)
    
    @scala.inline
    def setNodeCollectionChange(value: /* e */ NodeCollectionChangeEventArgs => Unit): Self = this.set("nodeCollectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNodeCollectionChange: Self = this.set("nodeCollectionChange", js.undefined)
    
    @scala.inline
    def setNodeTemplate(value: js.Any): Self = this.set("nodeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTemplate: Self = this.set("nodeTemplate", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setPageSettings(value: PageSettings): Self = this.set("pageSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSettings: Self = this.set("pageSettings", js.undefined)
    
    @scala.inline
    def setPropertyChange(value: /* e */ PropertyChangeEventArgs => Unit): Self = this.set("propertyChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePropertyChange: Self = this.set("propertyChange", js.undefined)
    
    @scala.inline
    def setRotationChange(value: /* e */ RotationChangeEventArgs => Unit): Self = this.set("rotationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRotationChange: Self = this.set("rotationChange", js.undefined)
    
    @scala.inline
    def setRulerSettings(value: RulerSettings): Self = this.set("rulerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulerSettings: Self = this.set("rulerSettings", js.undefined)
    
    @scala.inline
    def setScrollChange(value: /* e */ ScrollChangeEventArgs => Unit): Self = this.set("scrollChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollChange: Self = this.set("scrollChange", js.undefined)
    
    @scala.inline
    def setScrollSettings(value: ScrollSettings): Self = this.set("scrollSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSettings: Self = this.set("scrollSettings", js.undefined)
    
    @scala.inline
    def setSegmentChange(value: /* e */ SegmentChangeEventArgs => Unit): Self = this.set("segmentChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSegmentChange: Self = this.set("segmentChange", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: SelectedItems): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setSelectionChange(value: /* e */ SelectionChangeEventArgs => Unit): Self = this.set("selectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectionChange: Self = this.set("selectionChange", js.undefined)
    
    @scala.inline
    def setSerializationSettings(value: SerializationSettings): Self = this.set("serializationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializationSettings: Self = this.set("serializationSettings", js.undefined)
    
    @scala.inline
    def setSetTool(value: /* e */ SetToolEventArgs => Unit): Self = this.set("setTool", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTool: Self = this.set("setTool", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    
    @scala.inline
    def setSizeChange(value: /* e */ SizeChangeEventArgs => Unit): Self = this.set("sizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSizeChange: Self = this.set("sizeChange", js.undefined)
    
    @scala.inline
    def setSnapSettings(value: SnapSettings): Self = this.set("snapSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapSettings: Self = this.set("snapSettings", js.undefined)
    
    @scala.inline
    def setTextChange(value: /* e */ TextChangeEventArgs => Unit): Self = this.set("textChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTextChange: Self = this.set("textChange", js.undefined)
    
    @scala.inline
    def setTool(value: Tool | String): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTool: Self = this.set("tool", js.undefined)
    
    @scala.inline
    def setTooltip(value: Tooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
  }
}
