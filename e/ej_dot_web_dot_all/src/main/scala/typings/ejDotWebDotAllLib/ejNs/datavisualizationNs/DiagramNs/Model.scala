package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers When auto scroll is changed
    */
  var autoScrollChange: js.UndefOr[js.Function1[/* e */ AutoScrollChangeEventArgs, scala.Unit]] = js.undefined
  /** Defines the background color of diagram elements
    * @Default {transparent}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the path of the background image of diagram elements
    */
  var backgroundImage: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the direction of line bridges.
    * @Default {ej.datavisualization.Diagram.BridgeDirection.Top}
    */
  var bridgeDirection: js.UndefOr[BridgeDirection | java.lang.String] = js.undefined
  /** Triggers when a node, connector or diagram is clicked
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Defines a set of custom commands and binds them with a set of desired key gestures.
    */
  var commandManager: js.UndefOr[CommandManager] = js.undefined
  /** Triggers when the connection is changed
    */
  var connectionChange: js.UndefOr[js.Function1[/* e */ ConnectionChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the connector collection is changed
    */
  var connectorCollectionChange: js.UndefOr[js.Function1[/* e */ ConnectorCollectionChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the connectors' source point is changed
    */
  var connectorSourceChange: js.UndefOr[js.Function1[/* e */ ConnectorSourceChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the connectors' target point is changed
    */
  var connectorTargetChange: js.UndefOr[js.Function1[/* e */ ConnectorTargetChangeEventArgs, scala.Unit]] = js.undefined
  /** Binds the custom JSON data with connector properties
    * @Default {null}
    */
  var connectorTemplate: js.UndefOr[js.Any] = js.undefined
  /** A collection of JSON objects where each object represents a connector
    * @Default {[]}
    */
  var connectors: js.UndefOr[js.Array[Connector]] = js.undefined
  /** Enables/Disables the default behaviors of the diagram.
    * @Default {ej.datavisualization.Diagram.DiagramConstraints.All}
    */
  var constraints: js.UndefOr[DiagramConstraints | java.lang.String] = js.undefined
  /** An object to customize the context menu of diagram
    */
  var contextMenu: js.UndefOr[ContextMenu] = js.undefined
  /** Triggers before opening the context menu
    */
  var contextMenuBeforeOpen: js.UndefOr[js.Function1[/* e */ ContextMenuBeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Triggers when a context menu item is clicked
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the diagram is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Configures the data source that is to be bound with diagram
    */
  var dataSourceSettings: js.UndefOr[DataSourceSettings] = js.undefined
  /** Initializes the default values for nodes and connectors
    * @Default {{}}
    */
  var defaultSettings: js.UndefOr[DefaultSettings] = js.undefined
  /** Triggers when a node, connector or diagram model is clicked twice
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers while dragging the elements in diagram
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, scala.Unit]] = js.undefined
  /** Triggers when a symbol is dragged into diagram from symbol palette
    */
  var dragEnter: js.UndefOr[js.Function1[/* e */ DragEnterEventArgs, scala.Unit]] = js.undefined
  /** Triggers when a symbol is dragged outside of the diagram.
    */
  var dragLeave: js.UndefOr[js.Function1[/* e */ DragLeaveEventArgs, scala.Unit]] = js.undefined
  /** Triggers when a symbol is dragged over diagram
    */
  var dragOver: js.UndefOr[js.Function1[/* e */ DragOverEventArgs, scala.Unit]] = js.undefined
  /** Sets the type of JSON object to be drawn through drawing tool
    * @Default {{}}
    */
  var drawType: js.UndefOr[js.Any] = js.undefined
  /** Triggers when a symbol is dragged and dropped from symbol palette to drawing area
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, scala.Unit]] = js.undefined
  /** Triggers when editor got focus at the time of node's label or text node editing.
    */
  var editorFocusChange: js.UndefOr[js.Function1[/* e */ EditorFocusChangeEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables auto scroll in diagram
    * @Default {true}
    */
  var enableAutoScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables diagram context menu
    * @Default {true}
    */
  var enableContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when a child is added to or removed from a group
    */
  var groupChange: js.UndefOr[js.Function1[/* e */ GroupChangeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the height of the diagram
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when a change is reverted or restored(undo/redo)
    */
  var historyChange: js.UndefOr[js.Function1[/* e */ HistoryChangeEventArgs, scala.Unit]] = js.undefined
  /** Customizes the undo redo functionality
    */
  var historyManager: js.UndefOr[HistoryManager] = js.undefined
  /** Triggers when a diagram element is clicked
    */
  var itemClick: js.UndefOr[js.Function1[/* e */ ItemClickEventArgs, scala.Unit]] = js.undefined
  /** Defines the type of the rendering mode of label.
    * @Default {HTML}
    */
  var labelRenderingMode: js.UndefOr[LabelRenderingMode | java.lang.String] = js.undefined
  /** A collection of JSON objects where each object represents a layer. Layer is a named category of diagram shapes.
    * @Default {[]}
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  /** Automatically arranges the nodes and connectors in a predefined manner.
    */
  var layout: js.UndefOr[Layout] = js.undefined
  /** Defines the current culture of diagram
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when mouse enters a node/connector
    */
  var mouseEnter: js.UndefOr[js.Function1[/* e */ MouseEnterEventArgs, scala.Unit]] = js.undefined
  /** Triggers when mouse leaves node/connector
    */
  var mouseLeave: js.UndefOr[js.Function1[/* e */ MouseLeaveEventArgs, scala.Unit]] = js.undefined
  /** Triggers when mouse hovers over a node/connector
    */
  var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, scala.Unit]] = js.undefined
  /** Triggers when node collection is changed
    */
  var nodeCollectionChange: js.UndefOr[js.Function1[/* e */ NodeCollectionChangeEventArgs, scala.Unit]] = js.undefined
  /** Binds the custom JSON data with node properties
    * @Default {null}
    */
  var nodeTemplate: js.UndefOr[js.Any] = js.undefined
  /** Array of JSON objects where each object represents a node
    * @Default {[]}
    */
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
  /** Defines the size and appearance of diagram page
    */
  var pageSettings: js.UndefOr[PageSettings] = js.undefined
  /** Triggers when the node properties(x, y,width and height alone) are changed using nudge commands or updateNode API.
    */
  var propertyChange: js.UndefOr[js.Function1[/* e */ PropertyChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the diagram elements are rotated
    */
  var rotationChange: js.UndefOr[js.Function1[/* e */ RotationChangeEventArgs, scala.Unit]] = js.undefined
  /** Defines the properties of the both the horizontal and vertical gauge to measure the diagram area.
    */
  var rulerSettings: js.UndefOr[RulerSettings] = js.undefined
  /** Triggers when the diagram is zoomed or panned
    */
  var scrollChange: js.UndefOr[js.Function1[/* e */ ScrollChangeEventArgs, scala.Unit]] = js.undefined
  /** Defines the zoom value, zoom factor, scroll status and view port size of the diagram
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
  /** Triggers when a connector segment is edited
    */
  var segmentChange: js.UndefOr[js.Function1[/* e */ SegmentChangeEventArgs, scala.Unit]] = js.undefined
  /** Defines the size and position of selected items and defines the appearance of selector
    */
  var selectedItems: js.UndefOr[SelectedItems] = js.undefined
  /** Triggers when the selection is changed in diagram
    */
  var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, scala.Unit]] = js.undefined
  /** Defines diagram serialization properties that would defines how the serialization content would be.
    */
  var serializationSettings: js.UndefOr[SerializationSettings] = js.undefined
  /** Used to decide on the action on Diagramming elements at runtime.
    */
  var setTool: js.UndefOr[js.Function1[/* e */ SetToolEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables tooltip of diagram
    * @Default {true}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when a node is resized
    */
  var sizeChange: js.UndefOr[js.Function1[/* e */ SizeChangeEventArgs, scala.Unit]] = js.undefined
  /** Defines the gridlines and defines how and when the objects have to be snapped
    */
  var snapSettings: js.UndefOr[SnapSettings] = js.undefined
  /** Triggers when label editing is ended
    */
  var textChange: js.UndefOr[js.Function1[/* e */ TextChangeEventArgs, scala.Unit]] = js.undefined
  /** Enables/Disables the interactive behaviors of diagram.
    * @Default {ej.datavisualization.Diagram.Tool.All}
    */
  var tool: js.UndefOr[Tool | java.lang.String] = js.undefined
  /** An object that defines the description, appearance and alignments of tooltips
    * @Default {null}
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Specifies the width of the diagram
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the factor by which we can zoom in or zoom out
    * @Default {0.2}
    */
  var zoomFactor: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    autoScrollChange: js.Function1[/* e */ AutoScrollChangeEventArgs, scala.Unit] = null,
    backgroundColor: java.lang.String = null,
    backgroundImage: java.lang.String = null,
    bridgeDirection: BridgeDirection | java.lang.String = null,
    click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    commandManager: CommandManager = null,
    connectionChange: js.Function1[/* e */ ConnectionChangeEventArgs, scala.Unit] = null,
    connectorCollectionChange: js.Function1[/* e */ ConnectorCollectionChangeEventArgs, scala.Unit] = null,
    connectorSourceChange: js.Function1[/* e */ ConnectorSourceChangeEventArgs, scala.Unit] = null,
    connectorTargetChange: js.Function1[/* e */ ConnectorTargetChangeEventArgs, scala.Unit] = null,
    connectorTemplate: js.Any = null,
    connectors: js.Array[Connector] = null,
    constraints: DiagramConstraints | java.lang.String = null,
    contextMenu: ContextMenu = null,
    contextMenuBeforeOpen: js.Function1[/* e */ ContextMenuBeforeOpenEventArgs, scala.Unit] = null,
    contextMenuClick: js.Function1[/* e */ ContextMenuClickEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    dataSourceSettings: DataSourceSettings = null,
    defaultSettings: DefaultSettings = null,
    doubleClick: js.Function1[/* e */ DoubleClickEventArgs, scala.Unit] = null,
    drag: js.Function1[/* e */ DragEventArgs, scala.Unit] = null,
    dragEnter: js.Function1[/* e */ DragEnterEventArgs, scala.Unit] = null,
    dragLeave: js.Function1[/* e */ DragLeaveEventArgs, scala.Unit] = null,
    dragOver: js.Function1[/* e */ DragOverEventArgs, scala.Unit] = null,
    drawType: js.Any = null,
    drop: js.Function1[/* e */ DropEventArgs, scala.Unit] = null,
    editorFocusChange: js.Function1[/* e */ EditorFocusChangeEventArgs, scala.Unit] = null,
    enableAutoScroll: js.UndefOr[scala.Boolean] = js.undefined,
    enableContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    groupChange: js.Function1[/* e */ GroupChangeEventArgs, scala.Unit] = null,
    height: java.lang.String = null,
    historyChange: js.Function1[/* e */ HistoryChangeEventArgs, scala.Unit] = null,
    historyManager: HistoryManager = null,
    itemClick: js.Function1[/* e */ ItemClickEventArgs, scala.Unit] = null,
    labelRenderingMode: LabelRenderingMode | java.lang.String = null,
    layers: js.Array[Layer] = null,
    layout: Layout = null,
    locale: java.lang.String = null,
    mouseEnter: js.Function1[/* e */ MouseEnterEventArgs, scala.Unit] = null,
    mouseLeave: js.Function1[/* e */ MouseLeaveEventArgs, scala.Unit] = null,
    mouseOver: js.Function1[/* e */ MouseOverEventArgs, scala.Unit] = null,
    nodeCollectionChange: js.Function1[/* e */ NodeCollectionChangeEventArgs, scala.Unit] = null,
    nodeTemplate: js.Any = null,
    nodes: js.Array[Node] = null,
    pageSettings: PageSettings = null,
    propertyChange: js.Function1[/* e */ PropertyChangeEventArgs, scala.Unit] = null,
    rotationChange: js.Function1[/* e */ RotationChangeEventArgs, scala.Unit] = null,
    rulerSettings: RulerSettings = null,
    scrollChange: js.Function1[/* e */ ScrollChangeEventArgs, scala.Unit] = null,
    scrollSettings: ScrollSettings = null,
    segmentChange: js.Function1[/* e */ SegmentChangeEventArgs, scala.Unit] = null,
    selectedItems: SelectedItems = null,
    selectionChange: js.Function1[/* e */ SelectionChangeEventArgs, scala.Unit] = null,
    serializationSettings: SerializationSettings = null,
    setTool: js.Function1[/* e */ SetToolEventArgs, scala.Unit] = null,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    sizeChange: js.Function1[/* e */ SizeChangeEventArgs, scala.Unit] = null,
    snapSettings: SnapSettings = null,
    textChange: js.Function1[/* e */ TextChangeEventArgs, scala.Unit] = null,
    tool: Tool | java.lang.String = null,
    tooltip: Tooltip = null,
    width: java.lang.String = null,
    zoomFactor: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (autoScrollChange != null) __obj.updateDynamic("autoScrollChange")(autoScrollChange)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage)
    if (bridgeDirection != null) __obj.updateDynamic("bridgeDirection")(bridgeDirection.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click)
    if (commandManager != null) __obj.updateDynamic("commandManager")(commandManager)
    if (connectionChange != null) __obj.updateDynamic("connectionChange")(connectionChange)
    if (connectorCollectionChange != null) __obj.updateDynamic("connectorCollectionChange")(connectorCollectionChange)
    if (connectorSourceChange != null) __obj.updateDynamic("connectorSourceChange")(connectorSourceChange)
    if (connectorTargetChange != null) __obj.updateDynamic("connectorTargetChange")(connectorTargetChange)
    if (connectorTemplate != null) __obj.updateDynamic("connectorTemplate")(connectorTemplate)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (contextMenuBeforeOpen != null) __obj.updateDynamic("contextMenuBeforeOpen")(contextMenuBeforeOpen)
    if (contextMenuClick != null) __obj.updateDynamic("contextMenuClick")(contextMenuClick)
    if (create != null) __obj.updateDynamic("create")(create)
    if (dataSourceSettings != null) __obj.updateDynamic("dataSourceSettings")(dataSourceSettings)
    if (defaultSettings != null) __obj.updateDynamic("defaultSettings")(defaultSettings)
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(doubleClick)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(dragEnter)
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(dragLeave)
    if (dragOver != null) __obj.updateDynamic("dragOver")(dragOver)
    if (drawType != null) __obj.updateDynamic("drawType")(drawType)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (editorFocusChange != null) __obj.updateDynamic("editorFocusChange")(editorFocusChange)
    if (!js.isUndefined(enableAutoScroll)) __obj.updateDynamic("enableAutoScroll")(enableAutoScroll)
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu)
    if (groupChange != null) __obj.updateDynamic("groupChange")(groupChange)
    if (height != null) __obj.updateDynamic("height")(height)
    if (historyChange != null) __obj.updateDynamic("historyChange")(historyChange)
    if (historyManager != null) __obj.updateDynamic("historyManager")(historyManager)
    if (itemClick != null) __obj.updateDynamic("itemClick")(itemClick)
    if (labelRenderingMode != null) __obj.updateDynamic("labelRenderingMode")(labelRenderingMode.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mouseEnter != null) __obj.updateDynamic("mouseEnter")(mouseEnter)
    if (mouseLeave != null) __obj.updateDynamic("mouseLeave")(mouseLeave)
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(mouseOver)
    if (nodeCollectionChange != null) __obj.updateDynamic("nodeCollectionChange")(nodeCollectionChange)
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(nodeTemplate)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings)
    if (propertyChange != null) __obj.updateDynamic("propertyChange")(propertyChange)
    if (rotationChange != null) __obj.updateDynamic("rotationChange")(rotationChange)
    if (rulerSettings != null) __obj.updateDynamic("rulerSettings")(rulerSettings)
    if (scrollChange != null) __obj.updateDynamic("scrollChange")(scrollChange)
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings)
    if (segmentChange != null) __obj.updateDynamic("segmentChange")(segmentChange)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(selectionChange)
    if (serializationSettings != null) __obj.updateDynamic("serializationSettings")(serializationSettings)
    if (setTool != null) __obj.updateDynamic("setTool")(setTool)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (sizeChange != null) __obj.updateDynamic("sizeChange")(sizeChange)
    if (snapSettings != null) __obj.updateDynamic("snapSettings")(snapSettings)
    if (textChange != null) __obj.updateDynamic("textChange")(textChange)
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (width != null) __obj.updateDynamic("width")(width)
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

