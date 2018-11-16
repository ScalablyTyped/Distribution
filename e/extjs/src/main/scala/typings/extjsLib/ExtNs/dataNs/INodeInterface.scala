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

