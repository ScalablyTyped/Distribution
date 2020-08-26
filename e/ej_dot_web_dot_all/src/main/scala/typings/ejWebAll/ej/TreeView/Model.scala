package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Gets or sets a value that indicates whether to enable drag and drop a node within the same tree.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable drag and drop a node in inter ej.TreeView.
    * @Default {true}
    */
  var allowDragAndDropAcrossControl: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to drop a node to a child of particular node.
    * @Default {true}
    */
  var allowDropChild: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to drop a node to a sibling of particular node.
    * @Default {true}
    */
  var allowDropSibling: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable node editing support for TreeView.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable keyboard support for TreeView actions like nodeSelection, nodeEditing, nodeExpand, nodeCollapse, nodeCut and Paste.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable multi selection support for TreeView.
    * @Default {false}
    */
  var allowMultiSelection: js.UndefOr[Boolean] = js.native
  /** Allow us to specify the parent and child nodes to get auto check while we check or uncheck a node.
    * @Default {true}
    */
  var autoCheck: js.UndefOr[Boolean] = js.native
  /** Allow us to specify the parent node to be retain in checked or unchecked state instead of going for indeterminate state.
    * @Default {false}
    */
  var autoCheckParentNode: js.UndefOr[Boolean] = js.native
  /** Fires before adding node to TreeView.
    */
  var beforeAdd: js.UndefOr[js.Function1[/* e */ BeforeAddEventArgs, Unit]] = js.native
  /** Fires before collapse a node.
    */
  var beforeCollapse: js.UndefOr[js.Function1[/* e */ BeforeCollapseEventArgs, Unit]] = js.native
  /** Fires before cut node in TreeView.
    */
  var beforeCut: js.UndefOr[js.Function1[/* e */ BeforeCutEventArgs, Unit]] = js.native
  /** Fires before deleting node in TreeView.
    */
  var beforeDelete: js.UndefOr[js.Function1[/* e */ BeforeDeleteEventArgs, Unit]] = js.native
  /** Fires before editing the node in TreeView.
    */
  var beforeEdit: js.UndefOr[js.Function1[/* e */ BeforeEditEventArgs, Unit]] = js.native
  /** Fires before expanding the node.
    */
  var beforeExpand: js.UndefOr[js.Function1[/* e */ BeforeExpandEventArgs, Unit]] = js.native
  /** Fires before loading nodes to TreeView.
    */
  var beforeLoad: js.UndefOr[js.Function1[/* e */ BeforeLoadEventArgs, Unit]] = js.native
  /** Fires before paste node in TreeView.
    */
  var beforePaste: js.UndefOr[js.Function1[/* e */ BeforePasteEventArgs, Unit]] = js.native
  /** Fires before selecting node in TreeView.
    */
  var beforeSelect: js.UndefOr[js.Function1[/* e */ BeforeSelectEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates the checkedNodes index collection as an array. The given array index position denotes the nodes, that are checked while rendering TreeView.
    * @Default {[]}
    */
  var checkedNodes: js.UndefOr[js.Array[_]] = js.native
  /** Fires when TreeView created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for TreeView which allow us to customize the appearance.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires when TreeView destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to enable or disable the animation effect while expanding or collapsing a node.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Allow us to prevent multiple nodes to be in expanded state. If it set to false, previously expanded node will be collapsed automatically, while we expand a node.
    * @Default {true}
    */
  var enableMultipleExpand: js.UndefOr[Boolean] = js.native
  /** Sets a value that indicates whether to persist the TreeView model state in page using applicable medium i.e., HTML5 localStorage or cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to align content in the TreeView control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether a TreeView can be enabled or disabled. No actions can be performed while this property is set as false
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the TreeView node can be expand or collapse by using the specified action.
    * @Default {dblclick}
    */
  var expandOn: js.UndefOr[String] = js.native
  /** Gets or sets a array of value that indicates the expandedNodes index collection as an array. The given array index position denotes the nodes, that are expanded while rendering
    * TreeView.
    * @Default {[]}
    */
  var expandedNodes: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a fields object that allow us to map the data members with field properties in order to make the data binding easier.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Gets or sets a value that indicates whether to enable full row selection support for TreeView.
    * @Default {false}
    */
  var fullRowSelect: js.UndefOr[Boolean] = js.native
  /** Defines the height of the TreeView.
    * @Default {Null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the HTML Attributes for the TreeView. Using this API we can add custom attributes in TreeView control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Fires before nodeEdit Successful.
    */
  var inlineEditValidation: js.UndefOr[js.Function1[/* e */ InlineEditValidationEventArgs, Unit]] = js.native
  /** Fires when key pressed successfully.
    */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.native
  /** Fires when data load fails.
    */
  var loadError: js.UndefOr[js.Function1[/* e */ LoadErrorEventArgs, Unit]] = js.native
  /** Specifies the child nodes to be loaded on demand
    * @Default {false}
    */
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  /** Fires when data loaded successfully.
    */
  var loadSuccess: js.UndefOr[js.Function1[/* e */ LoadSuccessEventArgs, Unit]] = js.native
  /** Fires once node added successfully.
    */
  var nodeAdd: js.UndefOr[js.Function1[/* e */ NodeAddEventArgs, Unit]] = js.native
  /** Fires once node checked successfully.
    */
  var nodeCheck: js.UndefOr[js.Function1[/* e */ NodeCheckEventArgs, Unit]] = js.native
  /** Fires when node clicked successfully.
    */
  var nodeClick: js.UndefOr[js.Function1[/* e */ NodeClickEventArgs, Unit]] = js.native
  /** Fires when node collapsed successfully.
    */
  var nodeCollapse: js.UndefOr[js.Function1[/* e */ NodeCollapseEventArgs, Unit]] = js.native
  /** Fires when node cut successfully.
    */
  var nodeCut: js.UndefOr[js.Function1[/* e */ NodeCutEventArgs, Unit]] = js.native
  /** Fires when node deleted successfully.
    */
  var nodeDelete: js.UndefOr[js.Function1[/* e */ NodeDeleteEventArgs, Unit]] = js.native
  /** Fires when node dragging.
    */
  var nodeDrag: js.UndefOr[js.Function1[/* e */ NodeDragEventArgs, Unit]] = js.native
  /** Fires once node drag start successfully.
    */
  var nodeDragStart: js.UndefOr[js.Function1[/* e */ NodeDragStartEventArgs, Unit]] = js.native
  /** Fires before the dragged node to be dropped.
    */
  var nodeDragStop: js.UndefOr[js.Function1[/* e */ NodeDragStopEventArgs, Unit]] = js.native
  /** Fires once node dropped successfully.
    */
  var nodeDropped: js.UndefOr[js.Function1[/* e */ NodeDroppedEventArgs, Unit]] = js.native
  /** Fires once node edited successfully.
    */
  var nodeEdit: js.UndefOr[js.Function1[/* e */ NodeEditEventArgs, Unit]] = js.native
  /** Fires once node expanded successfully.
    */
  var nodeExpand: js.UndefOr[js.Function1[/* e */ NodeExpandEventArgs, Unit]] = js.native
  /** Fires once node pasted successfully.
    */
  var nodePaste: js.UndefOr[js.Function1[/* e */ NodePasteEventArgs, Unit]] = js.native
  /** Fires when node selected successfully.
    */
  var nodeSelect: js.UndefOr[js.Function1[/* e */ NodeSelectEventArgs, Unit]] = js.native
  /** Fires once node unchecked successfully.
    */
  var nodeUncheck: js.UndefOr[js.Function1[/* e */ NodeUncheckEventArgs, Unit]] = js.native
  /** Fires once node unselected successfully.
    */
  var nodeUnselect: js.UndefOr[js.Function1[/* e */ NodeUnselectEventArgs, Unit]] = js.native
  /** Fires when TreeView nodes are loaded successfully
    */
  var ready: js.UndefOr[js.Function1[/* e */ ReadyEventArgs, Unit]] = js.native
  /** Gets or Sets a value that indicates the index position of a tree node. The particular index tree node will be selected while rendering the TreeView.
    * @Default {-1}
    */
  var selectedNode: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates the selectedNodes index collection as an array. The given array index position denotes the nodes, that are selected while rendering TreeView.
    * @Default {[]}
    */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to display or hide checkbox for all TreeView nodes.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /** By using sortSettings property, you can customize the sorting option in TreeView control.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.native
  /** Allow us to use custom template in order to create TreeView.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Defines the width of the TreeView.
    * @Default {Null}
    */
  var width: js.UndefOr[String | Double] = js.native
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
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    @scala.inline
    def setAllowDragAndDropAcrossControl(value: Boolean): Self = this.set("allowDragAndDropAcrossControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragAndDropAcrossControl: Self = this.set("allowDragAndDropAcrossControl", js.undefined)
    @scala.inline
    def setAllowDropChild(value: Boolean): Self = this.set("allowDropChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDropChild: Self = this.set("allowDropChild", js.undefined)
    @scala.inline
    def setAllowDropSibling(value: Boolean): Self = this.set("allowDropSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDropSibling: Self = this.set("allowDropSibling", js.undefined)
    @scala.inline
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    @scala.inline
    def setAllowMultiSelection(value: Boolean): Self = this.set("allowMultiSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiSelection: Self = this.set("allowMultiSelection", js.undefined)
    @scala.inline
    def setAutoCheck(value: Boolean): Self = this.set("autoCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCheck: Self = this.set("autoCheck", js.undefined)
    @scala.inline
    def setAutoCheckParentNode(value: Boolean): Self = this.set("autoCheckParentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCheckParentNode: Self = this.set("autoCheckParentNode", js.undefined)
    @scala.inline
    def setBeforeAdd(value: /* e */ BeforeAddEventArgs => Unit): Self = this.set("beforeAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeAdd: Self = this.set("beforeAdd", js.undefined)
    @scala.inline
    def setBeforeCollapse(value: /* e */ BeforeCollapseEventArgs => Unit): Self = this.set("beforeCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeCollapse: Self = this.set("beforeCollapse", js.undefined)
    @scala.inline
    def setBeforeCut(value: /* e */ BeforeCutEventArgs => Unit): Self = this.set("beforeCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeCut: Self = this.set("beforeCut", js.undefined)
    @scala.inline
    def setBeforeDelete(value: /* e */ BeforeDeleteEventArgs => Unit): Self = this.set("beforeDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeDelete: Self = this.set("beforeDelete", js.undefined)
    @scala.inline
    def setBeforeEdit(value: /* e */ BeforeEditEventArgs => Unit): Self = this.set("beforeEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeEdit: Self = this.set("beforeEdit", js.undefined)
    @scala.inline
    def setBeforeExpand(value: /* e */ BeforeExpandEventArgs => Unit): Self = this.set("beforeExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeExpand: Self = this.set("beforeExpand", js.undefined)
    @scala.inline
    def setBeforeLoad(value: /* e */ BeforeLoadEventArgs => Unit): Self = this.set("beforeLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeLoad: Self = this.set("beforeLoad", js.undefined)
    @scala.inline
    def setBeforePaste(value: /* e */ BeforePasteEventArgs => Unit): Self = this.set("beforePaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforePaste: Self = this.set("beforePaste", js.undefined)
    @scala.inline
    def setBeforeSelect(value: /* e */ BeforeSelectEventArgs => Unit): Self = this.set("beforeSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSelect: Self = this.set("beforeSelect", js.undefined)
    @scala.inline
    def setCheckedNodesVarargs(value: js.Any*): Self = this.set("checkedNodes", js.Array(value :_*))
    @scala.inline
    def setCheckedNodes(value: js.Array[_]): Self = this.set("checkedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedNodes: Self = this.set("checkedNodes", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setEnableMultipleExpand(value: Boolean): Self = this.set("enableMultipleExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMultipleExpand: Self = this.set("enableMultipleExpand", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExpandOn(value: String): Self = this.set("expandOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandOn: Self = this.set("expandOn", js.undefined)
    @scala.inline
    def setExpandedNodesVarargs(value: js.Any*): Self = this.set("expandedNodes", js.Array(value :_*))
    @scala.inline
    def setExpandedNodes(value: js.Array[_]): Self = this.set("expandedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedNodes: Self = this.set("expandedNodes", js.undefined)
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFullRowSelect(value: Boolean): Self = this.set("fullRowSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullRowSelect: Self = this.set("fullRowSelect", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setInlineEditValidation(value: /* e */ InlineEditValidationEventArgs => Unit): Self = this.set("inlineEditValidation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInlineEditValidation: Self = this.set("inlineEditValidation", js.undefined)
    @scala.inline
    def setKeyPress(value: /* e */ KeyPressEventArgs => Unit): Self = this.set("keyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyPress: Self = this.set("keyPress", js.undefined)
    @scala.inline
    def setLoadError(value: /* e */ LoadErrorEventArgs => Unit): Self = this.set("loadError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadError: Self = this.set("loadError", js.undefined)
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = this.set("loadOnDemand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnDemand: Self = this.set("loadOnDemand", js.undefined)
    @scala.inline
    def setLoadSuccess(value: /* e */ LoadSuccessEventArgs => Unit): Self = this.set("loadSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadSuccess: Self = this.set("loadSuccess", js.undefined)
    @scala.inline
    def setNodeAdd(value: /* e */ NodeAddEventArgs => Unit): Self = this.set("nodeAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeAdd: Self = this.set("nodeAdd", js.undefined)
    @scala.inline
    def setNodeCheck(value: /* e */ NodeCheckEventArgs => Unit): Self = this.set("nodeCheck", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeCheck: Self = this.set("nodeCheck", js.undefined)
    @scala.inline
    def setNodeClick(value: /* e */ NodeClickEventArgs => Unit): Self = this.set("nodeClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeClick: Self = this.set("nodeClick", js.undefined)
    @scala.inline
    def setNodeCollapse(value: /* e */ NodeCollapseEventArgs => Unit): Self = this.set("nodeCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeCollapse: Self = this.set("nodeCollapse", js.undefined)
    @scala.inline
    def setNodeCut(value: /* e */ NodeCutEventArgs => Unit): Self = this.set("nodeCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeCut: Self = this.set("nodeCut", js.undefined)
    @scala.inline
    def setNodeDelete(value: /* e */ NodeDeleteEventArgs => Unit): Self = this.set("nodeDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeDelete: Self = this.set("nodeDelete", js.undefined)
    @scala.inline
    def setNodeDrag(value: /* e */ NodeDragEventArgs => Unit): Self = this.set("nodeDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeDrag: Self = this.set("nodeDrag", js.undefined)
    @scala.inline
    def setNodeDragStart(value: /* e */ NodeDragStartEventArgs => Unit): Self = this.set("nodeDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeDragStart: Self = this.set("nodeDragStart", js.undefined)
    @scala.inline
    def setNodeDragStop(value: /* e */ NodeDragStopEventArgs => Unit): Self = this.set("nodeDragStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeDragStop: Self = this.set("nodeDragStop", js.undefined)
    @scala.inline
    def setNodeDropped(value: /* e */ NodeDroppedEventArgs => Unit): Self = this.set("nodeDropped", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeDropped: Self = this.set("nodeDropped", js.undefined)
    @scala.inline
    def setNodeEdit(value: /* e */ NodeEditEventArgs => Unit): Self = this.set("nodeEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeEdit: Self = this.set("nodeEdit", js.undefined)
    @scala.inline
    def setNodeExpand(value: /* e */ NodeExpandEventArgs => Unit): Self = this.set("nodeExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeExpand: Self = this.set("nodeExpand", js.undefined)
    @scala.inline
    def setNodePaste(value: /* e */ NodePasteEventArgs => Unit): Self = this.set("nodePaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodePaste: Self = this.set("nodePaste", js.undefined)
    @scala.inline
    def setNodeSelect(value: /* e */ NodeSelectEventArgs => Unit): Self = this.set("nodeSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeSelect: Self = this.set("nodeSelect", js.undefined)
    @scala.inline
    def setNodeUncheck(value: /* e */ NodeUncheckEventArgs => Unit): Self = this.set("nodeUncheck", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeUncheck: Self = this.set("nodeUncheck", js.undefined)
    @scala.inline
    def setNodeUnselect(value: /* e */ NodeUnselectEventArgs => Unit): Self = this.set("nodeUnselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeUnselect: Self = this.set("nodeUnselect", js.undefined)
    @scala.inline
    def setReady(value: /* e */ ReadyEventArgs => Unit): Self = this.set("ready", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setSelectedNode(value: Double): Self = this.set("selectedNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedNode: Self = this.set("selectedNode", js.undefined)
    @scala.inline
    def setSelectedNodesVarargs(value: js.Any*): Self = this.set("selectedNodes", js.Array(value :_*))
    @scala.inline
    def setSelectedNodes(value: js.Array[_]): Self = this.set("selectedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedNodes: Self = this.set("selectedNodes", js.undefined)
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = this.set("showCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCheckbox: Self = this.set("showCheckbox", js.undefined)
    @scala.inline
    def setSortSettings(value: SortSettings): Self = this.set("sortSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortSettings: Self = this.set("sortSettings", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

