package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Gets or sets a value that indicates whether to enable drag and drop a node within the same tree.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable drag and drop a node in inter ej.TreeView.
    * @Default {true}
    */
  var allowDragAndDropAcrossControl: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to drop a node to a child of particular node.
    * @Default {true}
    */
  var allowDropChild: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to drop a node to a sibling of particular node.
    * @Default {true}
    */
  var allowDropSibling: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable node editing support for TreeView.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable keyboard support for TreeView actions like nodeSelection, nodeEditing, nodeExpand, nodeCollapse, nodeCut and Paste.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable multi selection support for TreeView.
    * @Default {false}
    */
  var allowMultiSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow us to specify the parent and child nodes to get auto check while we check or uncheck a node.
    * @Default {true}
    */
  var autoCheck: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow us to specify the parent node to be retain in checked or unchecked state instead of going for indeterminate state.
    * @Default {false}
    */
  var autoCheckParentNode: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires before adding node to TreeView.
    */
  var beforeAdd: js.UndefOr[js.Function1[/* e */ BeforeAddEventArgs, scala.Unit]] = js.undefined
  /** Fires before collapse a node.
    */
  var beforeCollapse: js.UndefOr[js.Function1[/* e */ BeforeCollapseEventArgs, scala.Unit]] = js.undefined
  /** Fires before cut node in TreeView.
    */
  var beforeCut: js.UndefOr[js.Function1[/* e */ BeforeCutEventArgs, scala.Unit]] = js.undefined
  /** Fires before deleting node in TreeView.
    */
  var beforeDelete: js.UndefOr[js.Function1[/* e */ BeforeDeleteEventArgs, scala.Unit]] = js.undefined
  /** Fires before editing the node in TreeView.
    */
  var beforeEdit: js.UndefOr[js.Function1[/* e */ BeforeEditEventArgs, scala.Unit]] = js.undefined
  /** Fires before expanding the node.
    */
  var beforeExpand: js.UndefOr[js.Function1[/* e */ BeforeExpandEventArgs, scala.Unit]] = js.undefined
  /** Fires before loading nodes to TreeView.
    */
  var beforeLoad: js.UndefOr[js.Function1[/* e */ BeforeLoadEventArgs, scala.Unit]] = js.undefined
  /** Fires before paste node in TreeView.
    */
  var beforePaste: js.UndefOr[js.Function1[/* e */ BeforePasteEventArgs, scala.Unit]] = js.undefined
  /** Fires before selecting node in TreeView.
    */
  var beforeSelect: js.UndefOr[js.Function1[/* e */ BeforeSelectEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates the checkedNodes index collection as an array. The given array index position denotes the nodes, that are checked while rendering TreeView.
    * @Default {[]}
    */
  var checkedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** Fires when TreeView created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for TreeView which allow us to customize the appearance.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when TreeView destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the animation effect while expanding or collapsing a node.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow us to prevent multiple nodes to be in expanded state. If it set to false, previously expanded node will be collapsed automatically, while we expand a node.
    * @Default {true}
    */
  var enableMultipleExpand: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets a value that indicates whether to persist the TreeView model state in page using applicable medium i.e., HTML5 localStorage or cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to align content in the TreeView control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether a TreeView can be enabled or disabled. No actions can be performed while this property is set as false
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates the TreeView node can be expand or collapse by using the specified action.
    * @Default {dblclick}
    */
  var expandOn: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a array of value that indicates the expandedNodes index collection as an array. The given array index position denotes the nodes, that are expanded while rendering
    * TreeView.
    * @Default {[]}
    */
  var expandedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a fields object that allow us to map the data members with field properties in order to make the data binding easier.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Gets or sets a value that indicates whether to enable full row selection support for TreeView.
    * @Default {false}
    */
  var fullRowSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the height of the TreeView.
    * @Default {Null}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the HTML Attributes for the TreeView. Using this API we can add custom attributes in TreeView control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Fires before nodeEdit Successful.
    */
  var inlineEditValidation: js.UndefOr[js.Function1[/* e */ InlineEditValidationEventArgs, scala.Unit]] = js.undefined
  /** Fires when key pressed successfully.
    */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, scala.Unit]] = js.undefined
  /** Fires when data load fails.
    */
  var loadError: js.UndefOr[js.Function1[/* e */ LoadErrorEventArgs, scala.Unit]] = js.undefined
  /** Specifies the child nodes to be loaded on demand
    * @Default {false}
    */
  var loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when data loaded successfully.
    */
  var loadSuccess: js.UndefOr[js.Function1[/* e */ LoadSuccessEventArgs, scala.Unit]] = js.undefined
  /** Fires once node added successfully.
    */
  var nodeAdd: js.UndefOr[js.Function1[/* e */ NodeAddEventArgs, scala.Unit]] = js.undefined
  /** Fires once node checked successfully.
    */
  var nodeCheck: js.UndefOr[js.Function1[/* e */ NodeCheckEventArgs, scala.Unit]] = js.undefined
  /** Fires when node clicked successfully.
    */
  var nodeClick: js.UndefOr[js.Function1[/* e */ NodeClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when node collapsed successfully.
    */
  var nodeCollapse: js.UndefOr[js.Function1[/* e */ NodeCollapseEventArgs, scala.Unit]] = js.undefined
  /** Fires when node cut successfully.
    */
  var nodeCut: js.UndefOr[js.Function1[/* e */ NodeCutEventArgs, scala.Unit]] = js.undefined
  /** Fires when node deleted successfully.
    */
  var nodeDelete: js.UndefOr[js.Function1[/* e */ NodeDeleteEventArgs, scala.Unit]] = js.undefined
  /** Fires when node dragging.
    */
  var nodeDrag: js.UndefOr[js.Function1[/* e */ NodeDragEventArgs, scala.Unit]] = js.undefined
  /** Fires once node drag start successfully.
    */
  var nodeDragStart: js.UndefOr[js.Function1[/* e */ NodeDragStartEventArgs, scala.Unit]] = js.undefined
  /** Fires before the dragged node to be dropped.
    */
  var nodeDragStop: js.UndefOr[js.Function1[/* e */ NodeDragStopEventArgs, scala.Unit]] = js.undefined
  /** Fires once node dropped successfully.
    */
  var nodeDropped: js.UndefOr[js.Function1[/* e */ NodeDroppedEventArgs, scala.Unit]] = js.undefined
  /** Fires once node edited successfully.
    */
  var nodeEdit: js.UndefOr[js.Function1[/* e */ NodeEditEventArgs, scala.Unit]] = js.undefined
  /** Fires once node expanded successfully.
    */
  var nodeExpand: js.UndefOr[js.Function1[/* e */ NodeExpandEventArgs, scala.Unit]] = js.undefined
  /** Fires once node pasted successfully.
    */
  var nodePaste: js.UndefOr[js.Function1[/* e */ NodePasteEventArgs, scala.Unit]] = js.undefined
  /** Fires when node selected successfully.
    */
  var nodeSelect: js.UndefOr[js.Function1[/* e */ NodeSelectEventArgs, scala.Unit]] = js.undefined
  /** Fires once node unchecked successfully.
    */
  var nodeUncheck: js.UndefOr[js.Function1[/* e */ NodeUncheckEventArgs, scala.Unit]] = js.undefined
  /** Fires once node unselected successfully.
    */
  var nodeUnselect: js.UndefOr[js.Function1[/* e */ NodeUnselectEventArgs, scala.Unit]] = js.undefined
  /** Fires when TreeView nodes are loaded successfully
    */
  var ready: js.UndefOr[js.Function1[/* e */ ReadyEventArgs, scala.Unit]] = js.undefined
  /** Gets or Sets a value that indicates the index position of a tree node. The particular index tree node will be selected while rendering the TreeView.
    * @Default {-1}
    */
  var selectedNode: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates the selectedNodes index collection as an array. The given array index position denotes the nodes, that are selected while rendering TreeView.
    * @Default {[]}
    */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to display or hide checkbox for all TreeView nodes.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** By using sortSettings property, you can customize the sorting option in TreeView control.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.undefined
  /** Allow us to use custom template in order to create TreeView.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of the TreeView.
    * @Default {Null}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowDragAndDropAcrossControl: js.UndefOr[scala.Boolean] = js.undefined,
    allowDropChild: js.UndefOr[scala.Boolean] = js.undefined,
    allowDropSibling: js.UndefOr[scala.Boolean] = js.undefined,
    allowEditing: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiSelection: js.UndefOr[scala.Boolean] = js.undefined,
    autoCheck: js.UndefOr[scala.Boolean] = js.undefined,
    autoCheckParentNode: js.UndefOr[scala.Boolean] = js.undefined,
    beforeAdd: js.Function1[/* e */ BeforeAddEventArgs, scala.Unit] = null,
    beforeCollapse: js.Function1[/* e */ BeforeCollapseEventArgs, scala.Unit] = null,
    beforeCut: js.Function1[/* e */ BeforeCutEventArgs, scala.Unit] = null,
    beforeDelete: js.Function1[/* e */ BeforeDeleteEventArgs, scala.Unit] = null,
    beforeEdit: js.Function1[/* e */ BeforeEditEventArgs, scala.Unit] = null,
    beforeExpand: js.Function1[/* e */ BeforeExpandEventArgs, scala.Unit] = null,
    beforeLoad: js.Function1[/* e */ BeforeLoadEventArgs, scala.Unit] = null,
    beforePaste: js.Function1[/* e */ BeforePasteEventArgs, scala.Unit] = null,
    beforeSelect: js.Function1[/* e */ BeforeSelectEventArgs, scala.Unit] = null,
    checkedNodes: js.Array[_] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableMultipleExpand: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expandOn: java.lang.String = null,
    expandedNodes: js.Array[_] = null,
    fields: Fields = null,
    fullRowSelect: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String | scala.Double = null,
    htmlAttributes: js.Any = null,
    inlineEditValidation: js.Function1[/* e */ InlineEditValidationEventArgs, scala.Unit] = null,
    keyPress: js.Function1[/* e */ KeyPressEventArgs, scala.Unit] = null,
    loadError: js.Function1[/* e */ LoadErrorEventArgs, scala.Unit] = null,
    loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined,
    loadSuccess: js.Function1[/* e */ LoadSuccessEventArgs, scala.Unit] = null,
    nodeAdd: js.Function1[/* e */ NodeAddEventArgs, scala.Unit] = null,
    nodeCheck: js.Function1[/* e */ NodeCheckEventArgs, scala.Unit] = null,
    nodeClick: js.Function1[/* e */ NodeClickEventArgs, scala.Unit] = null,
    nodeCollapse: js.Function1[/* e */ NodeCollapseEventArgs, scala.Unit] = null,
    nodeCut: js.Function1[/* e */ NodeCutEventArgs, scala.Unit] = null,
    nodeDelete: js.Function1[/* e */ NodeDeleteEventArgs, scala.Unit] = null,
    nodeDrag: js.Function1[/* e */ NodeDragEventArgs, scala.Unit] = null,
    nodeDragStart: js.Function1[/* e */ NodeDragStartEventArgs, scala.Unit] = null,
    nodeDragStop: js.Function1[/* e */ NodeDragStopEventArgs, scala.Unit] = null,
    nodeDropped: js.Function1[/* e */ NodeDroppedEventArgs, scala.Unit] = null,
    nodeEdit: js.Function1[/* e */ NodeEditEventArgs, scala.Unit] = null,
    nodeExpand: js.Function1[/* e */ NodeExpandEventArgs, scala.Unit] = null,
    nodePaste: js.Function1[/* e */ NodePasteEventArgs, scala.Unit] = null,
    nodeSelect: js.Function1[/* e */ NodeSelectEventArgs, scala.Unit] = null,
    nodeUncheck: js.Function1[/* e */ NodeUncheckEventArgs, scala.Unit] = null,
    nodeUnselect: js.Function1[/* e */ NodeUnselectEventArgs, scala.Unit] = null,
    ready: js.Function1[/* e */ ReadyEventArgs, scala.Unit] = null,
    selectedNode: scala.Int | scala.Double = null,
    selectedNodes: js.Array[_] = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    sortSettings: SortSettings = null,
    template: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop)
    if (!js.isUndefined(allowDragAndDropAcrossControl)) __obj.updateDynamic("allowDragAndDropAcrossControl")(allowDragAndDropAcrossControl)
    if (!js.isUndefined(allowDropChild)) __obj.updateDynamic("allowDropChild")(allowDropChild)
    if (!js.isUndefined(allowDropSibling)) __obj.updateDynamic("allowDropSibling")(allowDropSibling)
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (!js.isUndefined(allowMultiSelection)) __obj.updateDynamic("allowMultiSelection")(allowMultiSelection)
    if (!js.isUndefined(autoCheck)) __obj.updateDynamic("autoCheck")(autoCheck)
    if (!js.isUndefined(autoCheckParentNode)) __obj.updateDynamic("autoCheckParentNode")(autoCheckParentNode)
    if (beforeAdd != null) __obj.updateDynamic("beforeAdd")(beforeAdd)
    if (beforeCollapse != null) __obj.updateDynamic("beforeCollapse")(beforeCollapse)
    if (beforeCut != null) __obj.updateDynamic("beforeCut")(beforeCut)
    if (beforeDelete != null) __obj.updateDynamic("beforeDelete")(beforeDelete)
    if (beforeEdit != null) __obj.updateDynamic("beforeEdit")(beforeEdit)
    if (beforeExpand != null) __obj.updateDynamic("beforeExpand")(beforeExpand)
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(beforeLoad)
    if (beforePaste != null) __obj.updateDynamic("beforePaste")(beforePaste)
    if (beforeSelect != null) __obj.updateDynamic("beforeSelect")(beforeSelect)
    if (checkedNodes != null) __obj.updateDynamic("checkedNodes")(checkedNodes)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableMultipleExpand)) __obj.updateDynamic("enableMultipleExpand")(enableMultipleExpand)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expandOn != null) __obj.updateDynamic("expandOn")(expandOn)
    if (expandedNodes != null) __obj.updateDynamic("expandedNodes")(expandedNodes)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(fullRowSelect)) __obj.updateDynamic("fullRowSelect")(fullRowSelect)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (inlineEditValidation != null) __obj.updateDynamic("inlineEditValidation")(inlineEditValidation)
    if (keyPress != null) __obj.updateDynamic("keyPress")(keyPress)
    if (loadError != null) __obj.updateDynamic("loadError")(loadError)
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand)
    if (loadSuccess != null) __obj.updateDynamic("loadSuccess")(loadSuccess)
    if (nodeAdd != null) __obj.updateDynamic("nodeAdd")(nodeAdd)
    if (nodeCheck != null) __obj.updateDynamic("nodeCheck")(nodeCheck)
    if (nodeClick != null) __obj.updateDynamic("nodeClick")(nodeClick)
    if (nodeCollapse != null) __obj.updateDynamic("nodeCollapse")(nodeCollapse)
    if (nodeCut != null) __obj.updateDynamic("nodeCut")(nodeCut)
    if (nodeDelete != null) __obj.updateDynamic("nodeDelete")(nodeDelete)
    if (nodeDrag != null) __obj.updateDynamic("nodeDrag")(nodeDrag)
    if (nodeDragStart != null) __obj.updateDynamic("nodeDragStart")(nodeDragStart)
    if (nodeDragStop != null) __obj.updateDynamic("nodeDragStop")(nodeDragStop)
    if (nodeDropped != null) __obj.updateDynamic("nodeDropped")(nodeDropped)
    if (nodeEdit != null) __obj.updateDynamic("nodeEdit")(nodeEdit)
    if (nodeExpand != null) __obj.updateDynamic("nodeExpand")(nodeExpand)
    if (nodePaste != null) __obj.updateDynamic("nodePaste")(nodePaste)
    if (nodeSelect != null) __obj.updateDynamic("nodeSelect")(nodeSelect)
    if (nodeUncheck != null) __obj.updateDynamic("nodeUncheck")(nodeUncheck)
    if (nodeUnselect != null) __obj.updateDynamic("nodeUnselect")(nodeUnselect)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (selectedNode != null) __obj.updateDynamic("selectedNode")(selectedNode.asInstanceOf[js.Any])
    if (selectedNodes != null) __obj.updateDynamic("selectedNodes")(selectedNodes)
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (sortSettings != null) __obj.updateDynamic("sortSettings")(sortSettings)
    if (template != null) __obj.updateDynamic("template")(template)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

