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

