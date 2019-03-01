package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeInterface
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (Boolean) */
  var allowDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Inserts node s as the last child node of this node
  		* @param node Ext.data.NodeInterface/Ext.data.NodeInterface[]/Object The node or Array of nodes to append
  		* @param suppressEvents Boolean True to suppress firering of events.
  		* @param commit Boolean
  		* @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed
  		*/
  var appendChild: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[js.Any], 
      /* suppressEvents */ js.UndefOr[scala.Boolean], 
      /* commit */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Bubbles up the tree from this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with. Defaults to passing the current Node.
  		*/
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Cascades down the tree from this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with. Defaults to passing the current Node.
  		*/
  var cascadeBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.data.NodeInterface[]) */
  var childNodes: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.data.NodeInterface[]) */
  var children: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  var cls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Collapse this node
  		* @param recursive Boolean True to recursively collapse all the children
  		* @param callback Function The function to execute once the collapse completes
  		* @param scope Object The scope to run the callback in
  		*/
  var collapse: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Collapse all the children of this node
  		* @param recursive Function True to recursively collapse all the children
  		* @param callback Function The function to execute once all the children are collapsed
  		* @param scope Object The scope to run the callback in
  		*/
  var collapseChildren: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns true if this node is an ancestor at any point of the passed node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], scala.Boolean]] = js.undefined
  /** [Method] Creates a copy clone of this Node
  		* @param id String A new id, defaults to this Node's id.
  		* @param deep Boolean True to recursively copy all child Nodes into the new Node. False to copy without child Nodes.
  		* @returns Ext.data.NodeInterface A copy of this Node.
  		*/
  var copy: js.UndefOr[
    js.Function2[
      /* id */ js.UndefOr[java.lang.String], 
      /* deep */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Ensures that the passed object is an instance of a Record with the NodeInterface applied
  		* @param node Object
  		* @returns Ext.data.NodeInterface
  		*/
  var createNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Number) */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Destroys the node
  		* @param silent Object
  		*/
  var destroy: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Interates the child nodes of this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in iteration.
  		* @param args Array The args to call the function with. Defaults to passing the current Node.
  		*/
  var eachChild: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expand this node
  		* @param recursive Boolean True to recursively expand all the children
  		* @param callback Function The function to execute once the expand completes
  		* @param scope Object The scope to run the callback in
  		*/
  var expand: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expand all the children of this node
  		* @param recursive Boolean True to recursively expand all the children
  		* @param callback Function The function to execute once all the children are expanded
  		* @param scope Object The scope to run the callback in
  		*/
  var expandChildren: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Finds the first child that has the attribute with the specified value
  		* @param attribute String The attribute name
  		* @param value Object The value to search for
  		* @param deep Boolean True to search through nodes deeper than the immediate children
  		* @returns Ext.data.NodeInterface The found child or null if none was found
  		*/
  var findChild: js.UndefOr[
    js.Function3[
      /* attribute */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Finds the first child by a custom function
  		* @param fn Function A function which must return true if the passed Node is the required Node.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Node being tested.
  		* @param deep Boolean True to search through nodes deeper than the immediate children
  		* @returns Ext.data.NodeInterface The found child or null if none was found
  		*/
  var findChildBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Property] (Ext.data.NodeInterface) */
  var firstChild: js.UndefOr[INodeInterface] = js.undefined
  /** [Method] Returns the child node at the specified index
  		* @param index Number
  		* @returns Ext.data.NodeInterface
  		*/
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Returns depth of this node the root node has a depth of 0
  		* @returns Number
  		*/
  var getDepth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the tree this node is in
  		* @returns Ext.tree.Panel The tree panel which owns this node.
  		*/
  var getOwnerTree: js.UndefOr[js.Function0[extjsLib.ExtNs.treeNs.IPanel]] = js.undefined
  /** [Method] Gets the hierarchical path from the root of the current node
  		* @param field String The field to construct the path from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @returns String The node path
  		*/
  var getPath: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Method] Returns true if this node has one or more child nodes else false
  		* @returns Boolean
  		*/
  var hasChildNodes: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the index of a child node
  		* @param node Ext.data.NodeInterface
  		* @returns Number The index of the node or -1 if it was not found
  		*/
  var indexOf: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], scala.Double]] = js.undefined
  /** [Method] Returns the index of a child node that matches the id
  		* @param id String The id of the node to find
  		* @returns Number The index of the node or -1 if it was not found
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Inserts the first node before the second node in this nodes childNodes collection
  		* @param node Ext.data.NodeInterface The node to insert
  		* @param refNode Ext.data.NodeInterface The node to insert before (if null the node is appended)
  		* @returns Ext.data.NodeInterface The inserted node
  		*/
  var insertBefore: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* refNode */ js.UndefOr[this.type], this.type]
  ] = js.undefined
  /** [Method] Inserts a node into this node
  		* @param index Number The zero-based index to insert the node at
  		* @param node Ext.data.NodeInterface The node to insert
  		* @returns Ext.data.NodeInterface The node you just inserted
  		*/
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[scala.Double], /* node */ js.UndefOr[this.type], this.type]
  ] = js.undefined
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
  		* @returns Boolean
  		*/
  var isExpandable: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is expaned
  		* @returns Boolean
  		*/
  var isExpanded: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var isFirst: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var isLast: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if this node is a leaf
  		* @returns Boolean
  		*/
  var isLeaf: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is loaded
  		* @returns Boolean
  		*/
  var isLoaded: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is loading
  		* @returns Boolean
  		*/
  var isLoading: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isNode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if this node is the root node
  		* @returns Boolean
  		*/
  var isRoot: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is visible
  		* @returns Boolean
  		*/
  var isVisible: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Ext.data.NodeInterface) */
  var lastChild: js.UndefOr[INodeInterface] = js.undefined
  /** [Config Option] (Boolean) */
  var leaf: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.data.NodeInterface) */
  var nextSibling: js.UndefOr[INodeInterface] = js.undefined
  /** [Config Option] (String) */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.data.NodeInterface) */
  var parentNode: js.UndefOr[INodeInterface] = js.undefined
  /** [Property] (Ext.data.NodeInterface) */
  var previousSibling: js.UndefOr[INodeInterface] = js.undefined
  /** [Config Option] (Number) */
  var qshowDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var qtip: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var qtitle: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Removes this node from its parent
  		* @param destroy Boolean True to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Method] Removes all child nodes from this node
  		* @param destroy Boolean True to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Method] Removes a child node from this node
  		* @param node Ext.data.NodeInterface The node to remove
  		* @param destroy Boolean True to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface The removed node
  		*/
  var removeChild: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* destroy */ js.UndefOr[scala.Boolean], this.type]
  ] = js.undefined
  /** [Method] Replaces one child node in this node with another
  		* @param newChild Ext.data.NodeInterface The replacement node
  		* @param oldChild Ext.data.NodeInterface The node to replace
  		* @returns Ext.data.NodeInterface The replaced node
  		*/
  var replaceChild: js.UndefOr[
    js.Function2[
      /* newChild */ js.UndefOr[this.type], 
      /* oldChild */ js.UndefOr[this.type], 
      this.type
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var root: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Creates an object representation of this node including its children  */
  var serialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sorts this nodes children using the supplied sort function
  		* @param fn Function A function which, when passed two Nodes, returns -1, 0 or 1 depending upon required sort order.
  		* @param recursive Boolean True to apply this sort recursively
  		* @param suppressEvent Boolean True to not fire a sort event.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates general data of this node like isFirst isLast depth
  		* @param commit Boolean
  		* @param info Object The info to update. May contain any of the following
  		*/
  var updateInfo: js.UndefOr[
    js.Function2[/* commit */ js.UndefOr[scala.Boolean], /* info */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

object INodeInterface {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    allowDrag: js.UndefOr[scala.Boolean] = js.undefined,
    allowDrop: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    appendChild: js.Function3[
      /* node */ js.UndefOr[js.Any], 
      /* suppressEvents */ js.UndefOr[scala.Boolean], 
      /* commit */ js.UndefOr[scala.Boolean], 
      INodeInterface
    ] = null,
    bubble: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    cascadeBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    childNodes: extjsLib.ExtNs.Array = null,
    children: extjsLib.ExtNs.Array = null,
    cls: java.lang.String = null,
    collapse: js.Function3[
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    collapseChildren: js.Function3[
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    config: js.Any = null,
    contains: js.Function1[/* node */ js.UndefOr[INodeInterface], scala.Boolean] = null,
    copy: js.Function2[
      /* id */ js.UndefOr[java.lang.String], 
      /* deep */ js.UndefOr[scala.Boolean], 
      INodeInterface
    ] = null,
    createNode: js.Function1[/* node */ js.UndefOr[js.Any], INodeInterface] = null,
    depth: scala.Int | scala.Double = null,
    destroy: js.Function1[/* silent */ js.UndefOr[js.Any], scala.Unit] = null,
    eachChild: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    expand: js.Function3[
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    expandChildren: js.Function3[
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    expandable: js.UndefOr[scala.Boolean] = js.undefined,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    findChild: js.Function3[
      /* attribute */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[scala.Boolean], 
      INodeInterface
    ] = null,
    findChildBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[scala.Boolean], 
      INodeInterface
    ] = null,
    firstChild: INodeInterface = null,
    getChildAt: js.Function1[/* index */ js.UndefOr[scala.Double], INodeInterface] = null,
    getDepth: js.Function0[scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getOwnerTree: js.Function0[extjsLib.ExtNs.treeNs.IPanel] = null,
    getPath: js.Function2[
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      java.lang.String
    ] = null,
    hasChildNodes: js.Function0[scala.Boolean] = null,
    href: java.lang.String = null,
    hrefTarget: java.lang.String = null,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    indexOf: js.Function1[/* node */ js.UndefOr[INodeInterface], scala.Double] = null,
    indexOfId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], INodeInterface] = null,
    insertBefore: js.Function2[
      /* node */ js.UndefOr[INodeInterface], 
      /* refNode */ js.UndefOr[INodeInterface], 
      INodeInterface
    ] = null,
    insertChild: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* node */ js.UndefOr[INodeInterface], 
      INodeInterface
    ] = null,
    isAncestor: js.Function1[/* node */ js.UndefOr[INodeInterface], scala.Boolean] = null,
    isExpandable: js.Function0[scala.Boolean] = null,
    isExpanded: js.Function0[scala.Boolean] = null,
    isFirst: js.UndefOr[scala.Boolean] = js.undefined,
    isLast: js.UndefOr[scala.Boolean] = js.undefined,
    isLeaf: js.Function0[scala.Boolean] = null,
    isLoaded: js.Function0[scala.Boolean] = null,
    isLoading: js.Function0[scala.Boolean] = null,
    isNode: js.UndefOr[scala.Boolean] = js.undefined,
    isRoot: js.Function0[scala.Boolean] = null,
    isVisible: js.Function0[scala.Boolean] = null,
    lastChild: INodeInterface = null,
    leaf: js.UndefOr[scala.Boolean] = js.undefined,
    loaded: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    nextSibling: INodeInterface = null,
    parentId: java.lang.String = null,
    parentNode: INodeInterface = null,
    previousSibling: INodeInterface = null,
    qshowDelay: scala.Int | scala.Double = null,
    qtip: java.lang.String = null,
    qtitle: java.lang.String = null,
    remove: js.Function1[/* destroy */ js.UndefOr[scala.Boolean], INodeInterface] = null,
    removeAll: js.Function1[/* destroy */ js.UndefOr[scala.Boolean], INodeInterface] = null,
    removeChild: js.Function2[
      /* node */ js.UndefOr[INodeInterface], 
      /* destroy */ js.UndefOr[scala.Boolean], 
      INodeInterface
    ] = null,
    replaceChild: js.Function2[
      /* newChild */ js.UndefOr[INodeInterface], 
      /* oldChild */ js.UndefOr[INodeInterface], 
      INodeInterface
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    root: js.UndefOr[scala.Boolean] = js.undefined,
    self: extjsLib.ExtNs.IClass = null,
    serialize: js.Function0[scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    statics: js.Any = null,
    text: java.lang.String = null,
    updateInfo: js.Function2[/* commit */ js.UndefOr[scala.Boolean], /* info */ js.UndefOr[js.Any], scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null
  ): INodeInterface = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag)
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (appendChild != null) __obj.updateDynamic("appendChild")(appendChild)
    if (bubble != null) __obj.updateDynamic("bubble")(bubble)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (cascadeBy != null) __obj.updateDynamic("cascadeBy")(cascadeBy)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes)
    if (children != null) __obj.updateDynamic("children")(children)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (collapseChildren != null) __obj.updateDynamic("collapseChildren")(collapseChildren)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (createNode != null) __obj.updateDynamic("createNode")(createNode)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (eachChild != null) __obj.updateDynamic("eachChild")(eachChild)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (expandChildren != null) __obj.updateDynamic("expandChildren")(expandChildren)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (findChild != null) __obj.updateDynamic("findChild")(findChild)
    if (findChildBy != null) __obj.updateDynamic("findChildBy")(findChildBy)
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild)
    if (getChildAt != null) __obj.updateDynamic("getChildAt")(getChildAt)
    if (getDepth != null) __obj.updateDynamic("getDepth")(getDepth)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getOwnerTree != null) __obj.updateDynamic("getOwnerTree")(getOwnerTree)
    if (getPath != null) __obj.updateDynamic("getPath")(getPath)
    if (hasChildNodes != null) __obj.updateDynamic("hasChildNodes")(hasChildNodes)
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefTarget != null) __obj.updateDynamic("hrefTarget")(hrefTarget)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(indexOfId)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore)
    if (insertChild != null) __obj.updateDynamic("insertChild")(insertChild)
    if (isAncestor != null) __obj.updateDynamic("isAncestor")(isAncestor)
    if (isExpandable != null) __obj.updateDynamic("isExpandable")(isExpandable)
    if (isExpanded != null) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isFirst)) __obj.updateDynamic("isFirst")(isFirst)
    if (!js.isUndefined(isLast)) __obj.updateDynamic("isLast")(isLast)
    if (isLeaf != null) __obj.updateDynamic("isLeaf")(isLeaf)
    if (isLoaded != null) __obj.updateDynamic("isLoaded")(isLoaded)
    if (isLoading != null) __obj.updateDynamic("isLoading")(isLoading)
    if (!js.isUndefined(isNode)) __obj.updateDynamic("isNode")(isNode)
    if (isRoot != null) __obj.updateDynamic("isRoot")(isRoot)
    if (isVisible != null) __obj.updateDynamic("isVisible")(isVisible)
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild)
    if (!js.isUndefined(leaf)) __obj.updateDynamic("leaf")(leaf)
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling)
    if (qshowDelay != null) __obj.updateDynamic("qshowDelay")(qshowDelay.asInstanceOf[js.Any])
    if (qtip != null) __obj.updateDynamic("qtip")(qtip)
    if (qtitle != null) __obj.updateDynamic("qtitle")(qtitle)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeChild != null) __obj.updateDynamic("removeChild")(removeChild)
    if (replaceChild != null) __obj.updateDynamic("replaceChild")(replaceChild)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root)
    if (self != null) __obj.updateDynamic("self")(self)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (text != null) __obj.updateDynamic("text")(text)
    if (updateInfo != null) __obj.updateDynamic("updateInfo")(updateInfo)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[INodeInterface]
  }
}

