package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyAnyArray
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit.Tree._TreeNode
import typings.dojo.dojo.data.api.Item
import typings.dojo.dojo.dnd.Source
import typings.dojo.dojoStrings.PathError
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autoExpand
import typings.dojo.dojoStrings.betweenThreshold
import typings.dojo.dojoStrings.checkAcceptance
import typings.dojo.dojoStrings.checkItemAcceptance
import typings.dojo.dojoStrings.childSelector
import typings.dojo.dojoStrings.childrenAttr
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.dndParams
import typings.dojo.dojoStrings.dragThreshold
import typings.dojo.dojoStrings.focusedChild
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.indent
import typings.dojo.dojoStrings.isExpanded
import typings.dojo.dojoStrings.isTreeNode
import typings.dojo.dojoStrings.item
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.labelType
import typings.dojo.dojoStrings.model
import typings.dojo.dojoStrings.multiCharSearchDuration
import typings.dojo.dojoStrings.onDndCancel
import typings.dojo.dojoStrings.onDndDrop
import typings.dojo.dojoStrings.openOnClick
import typings.dojo.dojoStrings.openOnDblClick
import typings.dojo.dojoStrings.path
import typings.dojo.dojoStrings.paths
import typings.dojo.dojoStrings.persist
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.selectedItem
import typings.dojo.dojoStrings.selectedItems
import typings.dojo.dojoStrings.showRoot
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Tree.html
  *
  * This widget displays hierarchical data from a store.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._FocusMixin because Already inherited
- typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate
- typings.dojo.dijit._KeyNavMixin because Inheritance from two classes. Inlined childSelector, focusedChild, multiCharSearchDuration, tabIndex, focus, focusChild, focusFirstChild, focusLastChild, postCreate, onKeyboardSearch */ @JSGlobal("dijit.Tree")
@js.native
class Tree () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * 
    */
  var PathError: js.Object = js.native
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    * 
    */
  var active: Boolean = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    * 
    */
  var attachScope: js.Object = js.native
  /**
    * Fully expand the tree on load.   Overrides persist.
    * 
    */
  var autoExpand: Boolean = js.native
  /**
    * Set to a positive value to allow drag and drop "between" nodes.
    * 
    * If during DnD mouse is over a (target) node but less than betweenThreshold
    * pixels from the bottom edge, dropping the the dragged node will make it
    * the next sibling of the target node, rather than the child.
    * 
    * Similarly, if mouse is over a target node but less that betweenThreshold
    * pixels from the top edge, dropping the dragged node will make it
    * the target node's previous sibling rather than the target node's child.
    * 
    */
  var betweenThreshold: Double = js.native
  /**
    * 
    */
  var checkAcceptance: js.Object = js.native
  /**
    * 
    */
  var checkItemAcceptance: js.Object = js.native
  /**
    * 
    */
  var childSelector: js.Any | String = js.native
  /**
    * Deprecated.   This information should be specified in the model.
    * One ore more attributes that holds children of a tree node
    * 
    */
  var childrenAttr: js.Object = js.native
  /**
    * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
    * need CSS classes applied on mouse hover/press and focus.
    * 
    * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
    * (like "dijitUpArrowButton"). Example:
    * 
    * {
    *     "upArrowButton": "dijitUpArrowButton",
    *     "downArrowButton": "dijitDownArrowButton"
    * }
    * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
    * 
    * is hovered, etc.
    * 
    */
  var cssStateNodes: js.Object = js.native
  /**
    * 
    */
  var dndParams: js.Array[_] = js.native
  /**
    * Number of pixels mouse moves before it's considered the start of a drag operation
    * 
    */
  var dragThreshold: Double = js.native
  /**
    * The currently focused child widget, or null if there isn't one
    * 
    */
  var focusedChild: js.Object = js.native
  /**
    * True if cursor is over this widget
    * 
    */
  var hovering: Boolean = js.native
  /**
    * Deprecated.  Use dijit/tree/ForestStoreModel directly instead.
    * Used in conjunction with query parameter.
    * If a query is specified (rather than a root node id), and a label is also specified,
    * then a fake root node is created and displayed, with this label.
    * 
    */
  var label: String = js.native
  /**
    * Interface to read tree data, get notifications of changes to tree data,
    * and for handling drop operations (i.e drag and drop onto the tree)
    * 
    */
  var model: js.Object = js.native
  /**
    * If multiple characters are typed where each keystroke happens within
    * multiCharSearchDuration of the previous keystroke,
    * search for nodes matching all the keystrokes.
    * 
    * For example, typing "ab" will search for entries starting with
    * "ab" unless the delay between "a" and "b" is greater than multiCharSearchDuration.
    * 
    */
  var multiCharSearchDuration: Double = js.native
  /**
    * Parameter to dndController, see dijit/tree/dndSource.onDndCancel().
    * Generally this doesn't need to be set.
    * 
    */
  var onDndCancel: js.Function = js.native
  /**
    * Parameter to dndController, see dijit/tree/dndSource.onDndDrop().
    * Generally this doesn't need to be set.
    * 
    */
  var onDndDrop: js.Function = js.native
  /**
    * If true, clicking a folder node's label will open it, rather than calling onClick()
    * 
    */
  var openOnClick: Boolean = js.native
  /**
    * If true, double-clicking a folder node's label will open it, rather than calling onDblClick()
    * 
    */
  var openOnDblClick: Boolean = js.native
  /**
    * Backward compatible singular variant of paths.
    * 
    */
  var path: js.Array[_] = js.native
  /**
    * Full paths from rootNode to selected nodes expressed as array of items or array of ids.
    * Since setting the paths may be asynchronous (because of waiting on dojo.data), set("paths", ...)
    * returns a Promise to indicate when the set is complete.
    * 
    */
  var paths: js.Array[_] = js.native
  /**
    * Enables/disables use of cookies for state saving.
    * 
    */
  var persist: Boolean = js.native
  /**
    * Deprecated.  User should specify query to the model directly instead.
    * Specifies datastore query to return the root item or top items for the tree.
    * 
    */
  var query: js.Object = js.native
  /**
    * 
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Backward compatible singular variant of selectedItems.
    * 
    */
  var selectedItem: js.Object = js.native
  /**
    * The currently selected items in this tree.
    * This property can only be set (via set('selectedItems', ...)) when that item is already
    * visible in the tree.   (I.e. the tree has already been expanded to show that node.)
    * Should generally use paths attribute to set the selected items instead.
    * 
    */
  var selectedItems: js.Object = js.native
  /**
    * Should the root node be displayed, or hidden?
    * 
    */
  var showRoot: Boolean = js.native
  /**
    * Deprecated.  Use "model" parameter instead.
    * The store to get data to display in the tree.
    * 
    */
  var store: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_Tree: String = js.native
  /**
    * Tab index of the container; same as HTML tabIndex attribute.
    * Note then when user tabs into the container, focus is immediately
    * moved to the first item in the container.
    * 
    */
  var tabIndex: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    * 
    */
  var templatePath: String = js.native
  /**
    * 
    */
  var templateString: String = js.native
  /**
    * Collapse all nodes in the tree
    * 
    */
  def collapseAll(): js.Any = js.native
  /**
    * Class to use as as the dnd controller.  Specifying this class enables DnD.
    * Generally you should specify this as dijit/tree/dndSource.
    * Setting of dijit/tree/_dndSelector handles selection only (no actual DnD).
    * 
    */
  def dndController(): Unit = js.native
  /**
    * Expand all nodes in the tree
    * 
    */
  def expandAll(): js.Any = js.native
  /**
    * Default focus() implementation: focus the previously focused child, or first child.
    * Some applications may want to change this method to focus the [first] selected child.
    * 
    */
  /**
    * Default focus() implementation: focus the first child.
    * 
    */
  def focus(): Unit = js.native
  /**
    * Focus specified child widget.
    * 
    * @param widget Reference to container's child widget             
    * @param last If true and if widget has multiple focusable nodes, focus thelast one instead of the first one             
    */
  def focusChild(widget: _WidgetBase, last: Boolean): Unit = js.native
  /**
    * Focus the first focusable child in the container.
    * 
    */
  def focusFirstChild(): Unit = js.native
  /**
    * End key pressed; go to last visible node.
    * 
    */
  /**
    * Focus the last focusable child in the container.
    * 
    */
  def focusLastChild(): Unit = js.native
  /**
    * Focus on the specified node (which must be visible)
    * 
    * @param node             
    */
  def focusNode(node: _TreeNode): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
  /**
    * Overridable function to return CSS class name to display icon
    * 
    * @param item             
    * @param opened             
    */
  def getIconClass(item: Item, opened: Boolean): String = js.native
  /**
    * Overridable function to return CSS styles to display icon
    * 
    * @param item             
    * @param opened             
    */
  def getIconStyle(item: Item, opened: Boolean): js.Object = js.native
  /**
    * Deprecated.   This should be specified on the model itself.
    * 
    * Overridable function that return array of child items of given parent item,
    * or if parentItem==null then return top items in tree
    * 
    * @param parentItem             
    * @param onComplete             
    */
  def getItemChildren(parentItem: js.Any, onComplete: js.Any): Unit = js.native
  /**
    * Overridable function to get the label for a tree node (given the item)
    * 
    * @param item             
    */
  def getLabel(item: Item): js.Any = js.native
  /**
    * Overridable function to return CSS class name to display label
    * 
    * @param item             
    * @param opened             
    */
  def getLabelClass(item: Item, opened: Boolean): String = js.native
  /**
    * Overridable function to return CSS styles to display label
    * 
    * @param item             
    * @param opened             
    */
  def getLabelStyle(item: Item, opened: Boolean): js.Any = js.native
  /**
    * Returns all tree nodes that refer to an item
    * 
    * @param item             
    */
  def getNodesByItem(item: js.Any): js.Any = js.native
  /**
    * Returns all tree nodes that refer to an item
    * 
    * @param item             
    */
  def getNodesByItem(item: Double): js.Any = js.native
  /**
    * Overridable function to return CSS class name to display row
    * 
    * @param item             
    * @param opened             
    */
  def getRowClass(item: Item, opened: Boolean): String = js.native
  /**
    * Overridable function to return CSS styles to display row
    * 
    * @param item             
    * @param opened             
    */
  def getRowStyle(item: Item, opened: Boolean): js.Any = js.native
  /**
    * Overridable function to get the tooltip for a tree node (given the item)
    * 
    * @param item             
    */
  def getTooltip(item: Item): String = js.native
  @JSName("get")
  def get_PathError(property: PathError): js.Object = js.native
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_autoExpand(property: autoExpand): Boolean = js.native
  @JSName("get")
  def get_betweenThreshold(property: betweenThreshold): Double = js.native
  @JSName("get")
  def get_checkAcceptance(property: checkAcceptance): js.Object = js.native
  @JSName("get")
  def get_checkItemAcceptance(property: checkItemAcceptance): js.Object = js.native
  @JSName("get")
  def get_childSelector(property: childSelector): String = js.native
  @JSName("get")
  def get_childrenAttr(property: childrenAttr): js.Object = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_dndParams(property: dndParams): js.Array[_] = js.native
  @JSName("get")
  def get_dragThreshold(property: dragThreshold): Double = js.native
  @JSName("get")
  def get_focusedChild(property: focusedChild): js.Object = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_model(property: model): js.Object = js.native
  @JSName("get")
  def get_multiCharSearchDuration(property: multiCharSearchDuration): Double = js.native
  @JSName("get")
  def get_onDndCancel(property: onDndCancel): js.Function = js.native
  @JSName("get")
  def get_onDndDrop(property: onDndDrop): js.Function = js.native
  @JSName("get")
  def get_openOnClick(property: openOnClick): Boolean = js.native
  @JSName("get")
  def get_openOnDblClick(property: openOnDblClick): Boolean = js.native
  @JSName("get")
  def get_path(property: path): js.Array[_] = js.native
  @JSName("get")
  def get_paths(property: paths): js.Array[_] = js.native
  @JSName("get")
  def get_persist(property: persist): Boolean = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_selectedItem(property: selectedItem): js.Object = js.native
  @JSName("get")
  def get_selectedItems(property: selectedItems): js.Object = js.native
  @JSName("get")
  def get_showRoot(property: showRoot): Boolean = js.native
  @JSName("get")
  def get_store(property: store): String = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * check whether a dom node is the expandoNode for a particular TreeNode widget
    * 
    * @param node             
    * @param widget             
    */
  def isExpandoNode(node: js.Any, widget: js.Any): js.Any = js.native
  /**
    * Returns objects passed to Tree.model.newItem() based on DnD nodes
    * dropped onto the tree.   Developer must override this method to enable
    * dropping from external sources onto this Tree, unless the Tree.model's items
    * happen to look like {id: 123, name: "Apple" } with no other attributes.
    * 
    * For each node in nodes[], which came from source, create a hash of name/value
    * pairs to be passed to Tree.model.newItem().  Returns array of those hashes.
    * 
    * @param nodes The DOMNodes dragged from the source container             
    * @param target The target TreeNode.rowNode             
    * @param source The source container the nodes were dragged from, perhaps another Tree or a plain dojo/dnd/Source             
    */
  def itemCreator(nodes: js.Array[HTMLElement], target: HTMLElement, source: Source): js.Any = js.native
  /**
    * Deprecated.   This should be specified on the model itself.
    * 
    * Overridable function to tell if an item has or may have children.
    * Controls whether or not +/- expando icon is shown.
    * (For efficiency reasons we may not want to check if an element actually
    * has children until user clicks the expando node)
    * 
    * @param item             
    */
  def mayHaveChildren(item: Item): Unit = js.native
  def onClick(item: js.Any, node: js.Object): Unit = js.native
  def onClick(item: js.Any, node: js.Object, evt: Event): Unit = js.native
  def onClose(item: js.Object): Boolean = js.native
  def onClose(item: js.Object, node: js.Object): Boolean = js.native
  def onDblClick(item: js.Any, node: js.Object): Unit = js.native
  def onDblClick(item: js.Any, node: js.Object, evt: Event): Unit = js.native
  /**
    * When a key is pressed that matches a child item,
    * this method is called so that a widget can take appropriate action is necessary.
    * 
    * @param item             
    * @param evt             
    * @param searchString             
    * @param numMatches             
    */
  def onKeyboardSearch(item: _WidgetBase, evt: Event, searchString: String, numMatches: Double): Unit = js.native
  /**
    * Called when tree finishes loading and expanding.
    * If persist == true the loading may encompass many levels of fetches
    * from the data store, each asynchronous.   Waits for all to finish.
    * 
    */
  def onLoad(): Unit = js.native
  /**
    * Callback when a node is opened
    * 
    * @param item             
    * @param node An object with the following properties:item (Item): the dojo.data entry this tree representsisTreeNode (Boolean): Indicates that this is a TreeNode.   Used by dijit.Tree only,should not be accessed directly.label (String): Text of this tree node_setLabelAttrlabelType (String): Specifies how to interpret the label.  Can be "html" or "text".isExpandable (Boolean): This node has children, so show the expando node (+ sign)isExpanded (Boolean): This node is currently expanded (ie, opened)state (String): Dynamic loading-related stuff.When an empty folder node appears, it is "NotLoaded" first,then after dojo.data query it becomes "Loading" and, finally "Loaded"templateStringbaseClasscssStateNodes_setTooltipAttrbuildRendering_setIndentAttr: Tell this node how many levels it should be indentedmarkProcessing: Visually denote that tree is loading data, etc.unmarkProcessing: Clear markup from markProcessing() call_updateItemClasses: Set appropriate CSS classes for icon and label dom node(used to allow for item updates to change respective CSS)_applyClassAndStyle: Set the appropriate CSS classes and styles for labels, icons and rows._updateLayout: Set appropriate CSS classes for this.domNode_setExpando: Set the right image for the expando nodeexpand: Show my childrencollapse: Collapse this node (if it's expanded)indent (Integer): Levels from this node to the root nodesetChildItems: Sets the child items of this node, removing/adding nodesfrom current children to match specified items[] array.Also, if this.persist == true, expands any children that were previouslyopened.getTreePathgetIdentityremoveChildmakeExpandable: if this node wasn't already showing the expando node,turn it into one and call _setExpando()setSelected: A Tree has a (single) currently selected node.Mark that this node is/isn't that currently selected node.focusonClick: Connect to this function to receive notifications of mouse click events.onDblClick: Connect to this function to receive notifications of mouse double click events.onKeyDown: Connect to this function to receive notifications of keys being pressed down.onKeyPress: Connect to this function to receive notifications of printable keys being typed.onKeyUp: Connect to this function to receive notifications of keys being released.onMouseDown: Connect to this function to receive notifications of when the mouse button is pressed down.onMouseMove: Connect to this function to receive notifications of when the mouse moves over nodes contained within this widget.onMouseOut: Connect to this function to receive notifications of when the mouse moves off of nodes contained within this widget.onMouseOver: Connect to this function to receive notifications of when the mouse moves onto nodes contained within this widget.onMouseLeave: Connect to this function to receive notifications of when the mouse moves off of this widget.onMouseEnter: Connect to this function to receive notifications of when the mouse moves onto this widget.onMouseUp: Connect to this function to receive notifications of when the mouse button is released.postCreateon_setFocusedAttrsetAttribute: Deprecated.  Use set() instead.attr: This method is deprecated, use get() or set() directly.getDescendants: Returns all the widgets contained by this, i.e., all widgets underneath this.containerNode.This method should generally be avoided as it returns widgets declared in templates, which aresupposed to be internal/hidden, but it's left here for back-compat reasons._onShow: Internal method called when this widget is made visible.See onShow for details.onShow: Called when this widget becomes the selected pane in adijit/layout/TabContainer, dijit/layout/StackContainer,dijit/layout/AccordionContainer, etc.Also called to indicate display of a dijit.Dialog, dijit.TooltipDialog, or dijit.TitlePane.onHide: Called when another widget becomes the selected pane in adijit/layout/TabContainer, dijit/layout/StackContainer,dijit/layout/AccordionContainer, etc.Also called to indicate hide of a dijit.Dialog, dijit.TooltipDialog, or dijit.TitlePane.onClose: Called when this widget is being displayed as a popup (ex: a Calendar poppedup from a DateTextBox), and it is hidden.This is called from the dijit.popup code, and should not be called directly.Also used as a parameter for children of dijit/layout/StackContainer or subclasses.Callback if a user tries to close the child.   Child will be closed if this function returns true.id (String): A unique, opaque ID string that can be assigned by users or by thesystem. If the developer passes an ID which is known not to beunique, the specified ID is ignored and the system-generated ID isused instead._setIdAttrlang (String): Rarely used.  Overrides the default Dojo locale used to render this widget,as defined by the HTML LANG attribute.Value must be among the list of locales specified during by the Dojo bootstrap,formatted according to RFC 3066 (like en-us)._setLangAttrdir (String): Bi-directional support, as defined by the HTML DIRattribute. Either left-to-right "ltr" or right-to-left "rtl".  If undefined, widgets renders in page'sdefault direction._setDirAttrclass_setClassAttrstyle (String||Object): HTML style attributes as cssText string or name/value hashtitle (String): HTML title attribute.For form widgets this specifies a tooltip to display when hovering overthe widget (just like the native HTML title attribute).For TitlePane or for when this widget is a child of a TabContainer, AccordionContainer,etc., it's used to specify the tab label, accordion pane title, etc.  In this case it'sinterpreted as HTML.tooltip (String): When this widget's title attribute is used to for a tab label, accordion pane title, etc.,this specifies the tooltip to appear when the mouse is hovered over that text.srcNodeRef (DomNode): pointer to original DOM nodedomNode (DomNode): This is our visible representation of the widget! Other DOMNodes may by assigned to other properties, usually through thetemplate system's data-dojo-attach-point syntax, but the domNodeproperty is the canonical "top level" node in widget UI.containerNode (DomNode): Designates where children of the source DOM node will be placed."Children" in this case refers to both DOM nodes and widgets.For example, for myWidget:<div data-dojo-type=myWidget>    <b> here's a plain DOM node    <span data-dojo-type=subWidget>and a widget</span>    <i> and another plain DOM node </i></div>containerNode would point to:<b> here's a plain DOM node<span data-dojo-type=subWidget>and a widget</span><i> and another plain DOM node </i>In templated widgets, "containerNode" is set via adata-dojo-attach-point assignment.containerNode must be defined for any widget that accepts innerHTML(like ContentPane or BorderContainer or even Button), and converselyis null for widgets that don't, like TextBox.ownerDocument (Document?, optional): The document this widget belongs to.  If not specified to constructor, will default tosrcNodeRef.ownerDocument, or if no sourceRef specified, then to the document global_setOwnerDocumentAttr_started (Boolean): startup() has completed.attributeMap (Object): Deprecated. Instead of attributeMap, widget should have a _setXXXAttr attributefor each XXX attribute to be mapped to the DOM.attributeMap sets up a "binding" between attributes (aka properties)of the widget and the widget's DOM.Changes to widget attributes listed in attributeMap will bereflected into the DOM.For example, calling set('title', 'hello')on a TitlePane will automatically cause the TitlePane's DOM to updatewith the new title.attributeMap is a hash where the key is an attribute of the widget,and the value reflects a binding to a:DOM node attribute  focus: {node: "focusNode", type: "attribute"}Maps this.focus to this.focusNode.focusDOM node innerHTML  title: { node: "titleNode", type: "innerHTML" }Maps this.title to this.titleNode.innerHTMLDOM node innerText  title: { node: "titleNode", type: "innerText" }Maps this.title to this.titleNode.innerTextDOM node CSS class  myClass: { node: "domNode", type: "class" }Maps this.myClass to this.domNode.classNameIf the value is an array, then each element in the array matches one of theformats of the above list.There are also some shorthands for backwards compatibility:string --> { node: string, type: "attribute" }, for example:"focusNode" ---> { node: "focusNode", type: "attribute" }"" --> { node: "domNode", type: "attribute" }_blankGif (String): Path to a blank 1x1 image.Used by <img> nodes in templates that really get their image via CSS background-image._introspect: Collect metadata about this widget (only once per class, not once per instance):- list of attributes with custom setters, storing in this.constructor._setterAttrs- generate this.constructor._onMap, mapping names like "mousedown" to functions like onMouseDownpostscript: Kicks off widget instantiation.  See create() for details.create: Kick off the life-cycle of a widget_applyAttributes: Step during widget creation to copy  widget attributes to theDOM according to attributeMap and _setXXXAttr objects, and also to callcustom _setXXXAttr() methods.Skips over blank/false attribute values, unless they were explicitly specifiedas parameters to the widget, since those are the default anyway,and setting tabIndex="" is different than not setting tabIndex at all.For backwards-compatibility reasons attributeMap overrides _setXXXAttr when_setXXXAttr is a hash/string/array, but _setXXXAttr as a functions override attributeMap.postMixInProperties: Called after the parameters to the widget have been read-in,but before the widget template is instantiated. Especiallyuseful to set properties that are referenced in the widgettemplate.startup: Processing after the DOM fragment is added to the documentdestroyRecursive: Destroy this widget and its descendantsdestroy: Destroy this widget, but not its descendants.  Descendants means widgets inside ofthis.containerNode.   Will also destroy any resources (including widgets) registered via this.own().This method will also destroy internal widgets such as those created from a template,assuming those widgets exist inside of this.domNode but outside of this.containerNode.For 2.0 it's planned that this method will also destroy descendant widgets, so apps should notdepend on the current ability to destroy a widget without destroying its descendants.   Generallythey should use destroyRecursive() for widgets with children.destroyRendering: Destroys the DOM nodes associated with this widget.destroyDescendants: Recursively destroy the children of this widget and theirdescendants.uninitialize: Deprecated. Override destroy() instead to implement custom widget tear-downbehavior._setStyleAttr: Sets the style attribute of the widget according to value,which is either a hash like {height: "5px", width: "3px"}or a plain string_attrToDom: Reflect a widget attribute (title, tabIndex, duration etc.) tothe widget DOM, as specified by commands parameter.If commands isn't specified then it's looked up from attributeMap.Note some attributes like "type"cannot be processed this way as they are not mutable.get: Get a property from a widget.set: Set a property on a widget_attrPairNames_getAttrNames: Helper function for get() and set().Caches attribute name values so we don't do the string ops every time._set: Helper function to set new value for specified property, and call handlersregistered with watch() if the value has changed._get: Helper function to get value for specified property stored by this._set(),i.e. for properties with custom setters.  Used mainly by custom getters.For example, CheckBox._getValueAttr() calls this._get("value").emit: Used by widgets to signal that a synthetic event occurred, ex:myWidget.emit("attrmodified-selectedChildWidget", {}).Emits an event on this.domNode named type.toLowerCase(), based on eventObj.Also calls onType() method, if present, and returns value from that method.By default passes eventObj to callback, but will pass callbackArgs instead, if specified.Modifies eventObj by adding missing parameters (bubbles, cancelable, widget)._onMap: Maps on() type parameter (ex: "mousemove") to method name (ex: "onMouseMove").If type is a synthetic event like touch.press then returns undefined.toString: Returns a string that represents the widget.getChildren: Returns all direct children of this widget, i.e. all widgets underneath this.containerNode whose parentis this widget.   Note that it does not return all descendants, but rather just direct children.Analogous to Node.childNodes,except containing widgets rather than DOMNodes.The result intentionally excludes internally created widgets (a.k.a. supporting widgets)outside of this.containerNode.Note that the array returned is a simple array.  Application code should not assumeexistence of methods like forEach().getParent: Returns the parent widget of this widget.connect: Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.Connects specified obj/event to specified method of this objectand registers for disconnect() on widget destroy.Provide widget-specific analog to dojo.connect, except with theimplicit use of this widget as the target object.Events connected with this.connect are disconnected upondestruction.disconnect: Deprecated, will be removed in 2.0, use handle.remove() instead.Disconnects handle created by connect.subscribe: Deprecated, will be removed in 2.0, use this.own(topic.subscribe()) instead.Subscribes to the specified topic and calls the specified methodof this object and registers for unsubscribe() on widget destroy.Provide widget-specific analog to dojo.subscribe, except with theimplicit use of this widget as the target object.unsubscribe: Deprecated, will be removed in 2.0, use handle.remove() instead.Unsubscribes handle created by this.subscribe.Also removes handle from this widget's list of subscriptionsisLeftToRight: Return this widget's explicit or implicit orientation (true for LTR, false for RTL)isFocusable: Return true if this widget can currently be focusedand false if notplaceAt: Place this widget somewhere in the DOM basedon standard domConstruct.place() conventions.defer: Wrapper to setTimeout to avoid deferred functions executingafter the originating widget has been destroyed.Returns an object handle with a remove method (that returns null) (replaces clearTimeout)._changeAttrValue: Internal helper for directly changing an attribute value.watch: Watches a property for changesown: Track specified handles and remove/destroy them when this instance is destroyed, unless they werealready removed/destroyed manually.focused (Boolean): This widget or a widget it contains has focus, or is "active" becauseit was recently clicked.onFocus: Called when the widget becomes "active" becauseit or a widget inside of it either has focus, or has recentlybeen clicked.onBlur: Called when the widget stops being "active" becausefocus moved to something outside of it, or the userclicked somewhere outside of it, or the widget washidden._onFocus: This is where widgets do processing for when they are active,such as changing CSS classes.  See onFocus() for more details._onBlur: This is where widgets do processing for when they stop being active,such as changing CSS classes.  See onBlur() for more details._focusManagertemplatePath (String): Path to template (HTML file) for this widget relative to dojo.baseUrl.Deprecated: use templateString with require([... "dojo/text!..."], ...) instead_skipNodeCache_rendered (Boolean): Not normally use, but this flag can be set by the app if the server has already rendered the template,i.e. already inlining the template for the widget into the main page.   Reduces _TemplatedMixin tojust function like _AttachMixin.searchContainerNode_stringRepl: Does substitution of ${foo} type properties in template string_fillContent: Relocate source contents to templated container node.this.containerNode must be able to receive children, or exceptions will be thrown._attachPoints (String[]): List of widget attribute names associated with data-dojo-attach-point=... in thetemplate, ex: ["containerNode", "labelNode"]_attachEvents (Handle[]): List of connections associated with data-dojo-attach-event=... in thetemplateattachScope (Object): Object to which attach points and events will be scoped.  Defaultsto 'this'._beforeFillContent_attachTemplateNodes: Iterate through the dom nodes and attach functions and nodes accordingly._processTemplateNode: Process data-dojo-attach-point and data-dojo-attach-event for given node or widget.Returns true if caller should process baseNode's children too._attach: Roughly corresponding to dojo/on, this is the default function for processing adata-dojo-attach-event.  Meant to attach to DOMNodes, not to widgets._detachTemplateNodes: Detach and clean up the attachments made in _attachtempalteNodes.addChild: Makes the given widget a child of this widget.hasChildren: Returns true if widget has child widgets, i.e. if this.containerNode contains widgets._getSiblingOfChild: Get the next or previous widget sibling of childgetIndexOfChild: Gets the index of the child in this container or -1 if not found_getSibling: Returns next or previous siblinggetPreviousSibling: Returns null if this is the first child of the parent,otherwise returns the next element sibling to the "left".getNextSibling: Returns null if this is the last child of the parent,otherwise returns the next element sibling to the "right".getIndexInParent: Returns the index of this widget within its container parent.It returns -1 if the parent does not exist, or if the parentis not a dijit/_Containerhovering (Boolean): True if cursor is over this widgetactive (Boolean): True if mouse was pressed while over this widget, and hasn't been released yet_cssMouseEvent: Handler for CSS event on this.domNode. Sets hovering and active properties depending on mouse state,which triggers _setStateClass() to set appropriate CSS classes for this.domNode._setStateClass: Update the visual state of the widget by setting the css classes on this.domNode(or this.stateNode if defined) by combining this.baseClass withvarious suffixes that represent the current widget state(s)._subnodeCssMouseEvent: Handler for hover/active mouse event on widget's subnode_trackMouseState: Track mouse/focus events on specified node and set CSS class on that node to indicatecurrent state.   Usually not called directly, but via cssStateNodes attribute.            
    */
  def onOpen(item: Item, node: js.Object): Unit = js.native
  /**
    * 
    * @param changeSize             
    */
  def resize(changeSize: js.Any): Unit = js.native
  @JSName("set")
  def set_PathError(property: PathError, value: js.Object): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_autoExpand(property: autoExpand, value: Boolean): Unit = js.native
  @JSName("set")
  def set_betweenThreshold(property: betweenThreshold, value: Double): Unit = js.native
  @JSName("set")
  def set_checkAcceptance(property: checkAcceptance, value: js.Object): Unit = js.native
  @JSName("set")
  def set_checkItemAcceptance(property: checkItemAcceptance, value: js.Object): Unit = js.native
  @JSName("set")
  def set_childSelector(property: childSelector, value: String): Unit = js.native
  @JSName("set")
  def set_childrenAttr(property: childrenAttr, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_dndParams(property: dndParams, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_dragThreshold(property: dragThreshold, value: Double): Unit = js.native
  @JSName("set")
  def set_focusedChild(property: focusedChild, value: js.Object): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_model(property: model, value: js.Object): Unit = js.native
  @JSName("set")
  def set_multiCharSearchDuration(property: multiCharSearchDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_onDndCancel(property: onDndCancel, value: js.Function): Unit = js.native
  @JSName("set")
  def set_onDndDrop(property: onDndDrop, value: js.Function): Unit = js.native
  @JSName("set")
  def set_openOnClick(property: openOnClick, value: Boolean): Unit = js.native
  @JSName("set")
  def set_openOnDblClick(property: openOnDblClick, value: Boolean): Unit = js.native
  @JSName("set")
  def set_path(property: path, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_paths(property: paths, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_persist(property: persist, value: Boolean): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectedItem(property: selectedItem, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectedItems(property: selectedItems, value: js.Object): Unit = js.native
  @JSName("set")
  def set_showRoot(property: showRoot, value: Boolean): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("watch")
  def watch_PathError(property: PathError, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_active(property: active, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autoExpand(property: autoExpand, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_betweenThreshold(property: betweenThreshold, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_checkAcceptance(property: checkAcceptance, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_checkItemAcceptance(property: checkItemAcceptance, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_childSelector(property: childSelector, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_childrenAttr(property: childrenAttr, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(property: cssStateNodes, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dndParams(property: dndParams, callback: Fn_NewValueOldValuePropertyAnyArray): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dragThreshold(property: dragThreshold, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_focusedChild(property: focusedChild, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hovering(property: hovering, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_label(property: label, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_model(property: model, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_multiCharSearchDuration(property: multiCharSearchDuration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_onDndCancel(property: onDndCancel, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_onDndDrop(property: onDndDrop, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_openOnClick(property: openOnClick, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_openOnDblClick(property: openOnDblClick, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_path(property: path, callback: Fn_NewValueOldValuePropertyAnyArray): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_paths(property: paths, callback: Fn_NewValueOldValuePropertyAnyArray): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_persist(property: persist, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(property: query, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectedItem(property: selectedItem, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectedItems(property: selectedItems, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showRoot(property: showRoot, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(property: store, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(property: tabIndex, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

@JSGlobal("dijit.Tree")
@js.native
object Tree extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/Tree._TreeNode.html
    *
    * Single node within a tree.   This class is used internally
    * by Tree and should not be accessed directly.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
  - typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
  - typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, getIndexOfChild, hasChildren, removeChild, removeChild
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _TreeNode () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * True if mouse was pressed while over this widget, and hasn't been released yet
      * 
      */
    var active: Boolean = js.native
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      * 
      */
    var attachScope: js.Object = js.native
    /**
      * 
      */
    var cssStateNodes: js.Object = js.native
    /**
      * True if cursor is over this widget
      * 
      */
    var hovering: Boolean = js.native
    /**
      * Levels from this node to the root node
      * 
      */
    var indent: Double = js.native
    /**
      * This node is currently expanded (ie, opened)
      * 
      */
    var isExpanded: Boolean = js.native
    /**
      * Indicates that this is a TreeNode.   Used by dijit.Tree only,
      * should not be accessed directly.
      * 
      */
    var isTreeNode: Boolean = js.native
    /**
      * the dojo.data entry this tree represents
      * 
      */
    var item: js.Object = js.native
    /**
      * Text of this tree node
      * 
      */
    var label: String = js.native
    /**
      * Specifies how to interpret the label.  Can be "html" or "text".
      * 
      */
    var labelType: String = js.native
    /**
      * 
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      * 
      */
    @JSName("style")
    var style__TreeNode: String = js.native
    /**
      * Path to template (HTML file) for this widget relative to dojo.baseUrl.
      * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
      * 
      */
    var templatePath: String = js.native
    /**
      * 
      */
    var templateString: String = js.native
    /**
      * Makes the given widget a child of this widget.
      * Inserts specified child widget's dom node as a child of this widget's
      * container node, and possibly does other processing (such as layout).
      * 
      * @param widget             
      * @param insertIndex               Optional            
      */
    /**
      * Makes the given widget a child of this widget.
      * Inserts specified child widget's dom node as a child of this widget's
      * container node, and possibly does other processing (such as layout).
      * 
      * @param widget             
      * @param insertIndex               Optional            
      */
    def addChild(widget: _WidgetBase): Unit = js.native
    def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
    /**
      * Collapse this node (if it's expanded)
      * 
      */
    def collapse(): js.Any = js.native
    /**
      * Show my children
      * 
      */
    def expand(): js.Any = js.native
    /**
      * 
      */
    def focus(): Unit = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    def getCachedTemplate(): js.Any = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      * 
      * @param templateString The template             
      * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
      * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
      */
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
    /**
      * 
      */
    def getIdentity(): js.Any = js.native
    /**
      * Returns the index of this widget within its container parent.
      * It returns -1 if the parent does not exist, or if the parent
      * is not a dijit/_Container
      * 
      */
    /**
      * Returns the index of this widget within its container parent.
      * It returns -1 if the parent does not exist, or if the parent
      * is not a dijit/_Container
      * 
      */
    def getIndexInParent(): js.Any = js.native
    /**
      * Gets the index of the child in this container or -1 if not found
      * 
      * @param child             
      */
    /**
      * Gets the index of the child in this container or -1 if not found
      * 
      * @param child             
      */
    def getIndexOfChild(child: _WidgetBase): js.Any = js.native
    /**
      * Returns null if this is the last child of the parent,
      * otherwise returns the next element sibling to the "right".
      * 
      */
    /**
      * Returns null if this is the last child of the parent,
      * otherwise returns the next element sibling to the "right".
      * 
      */
    def getNextSibling(): js.Any = js.native
    /**
      * Returns null if this is the first child of the parent,
      * otherwise returns the next element sibling to the "left".
      * 
      */
    /**
      * Returns null if this is the first child of the parent,
      * otherwise returns the next element sibling to the "left".
      * 
      */
    def getPreviousSibling(): js.Any = js.native
    /**
      * 
      */
    def getTreePath(): js.Array[_] = js.native
    @JSName("get")
    def get_active(property: active): Boolean = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
    @JSName("get")
    def get_hovering(property: hovering): Boolean = js.native
    @JSName("get")
    def get_indent(property: indent): Double = js.native
    @JSName("get")
    def get_isExpanded(property: isExpanded): Boolean = js.native
    @JSName("get")
    def get_isTreeNode(property: isTreeNode): Boolean = js.native
    @JSName("get")
    def get_item(property: item): js.Object = js.native
    @JSName("get")
    def get_label(property: label): String = js.native
    @JSName("get")
    def get_labelType(property: labelType): String = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    /**
      * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
      * 
      */
    /**
      * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
      * 
      */
    def hasChildren(): Boolean = js.native
    /**
      * if this node wasn't already showing the expando node,
      * turn it into one and call _setExpando()
      * 
      */
    def makeExpandable(): Unit = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(node: _TreeNode): Unit = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(widget: Double): Unit = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(widget: _WidgetBase): Unit = js.native
    /**
      * Sets the child items of this node, removing/adding nodes
      * from current children to match specified items[] array.
      * Also, if this.persist == true, expands any children that were previously
      * opened.
      * 
      * @param items             
      */
    def setChildItems(items: js.Array[js.Object]): js.Any = js.native
    /**
      * A Tree has a (single) currently selected node.
      * Mark that this node is/isn't that currently selected node.
      * In particular, setting a node as selected involves setting tabIndex
      * so that when user tabs to the tree, focus will go to that node (only).
      * 
      * @param selected             
      */
    def setSelected(selected: Boolean): Unit = js.native
    @JSName("set")
    def set_active(property: active, value: Boolean): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
    @JSName("set")
    def set_hovering(property: hovering, value: Boolean): Unit = js.native
    @JSName("set")
    def set_indent(property: indent, value: Double): Unit = js.native
    @JSName("set")
    def set_isExpanded(property: isExpanded, value: Boolean): Unit = js.native
    @JSName("set")
    def set_isTreeNode(property: isTreeNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_item(property: item, value: js.Object): Unit = js.native
    @JSName("set")
    def set_label(property: label, value: String): Unit = js.native
    @JSName("set")
    def set_labelType(property: labelType, value: String): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("watch")
    def watch_active(property: active, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cssStateNodes(property: cssStateNodes, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_hovering(property: hovering, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_indent(property: indent, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_isExpanded(property: isExpanded, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_isTreeNode(property: isTreeNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_item(property: item, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_label(property: label, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_labelType(property: labelType, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
}

