package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.tree.IPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INodeInterface extends IBase {
  
  /** [Config Option] (Boolean) */
  var allowDrag: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var allowDrop: js.UndefOr[Boolean] = js.native
  
  /** [Method] Inserts node s as the last child node of this node
    * @param node Ext.data.NodeInterface/Ext.data.NodeInterface[]/Object The node or Array of nodes to append
    * @param suppressEvents Boolean True to suppress firering of events.
    * @param commit Boolean
    * @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed
    */
  var appendChild: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[js.Any], 
      /* suppressEvents */ js.UndefOr[Boolean], 
      /* commit */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Bubbles up the tree from this node calling the specified function with each node
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
    * @param args Array The args to call the function with. Defaults to passing the current Node.
    */
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Cascades down the tree from this node calling the specified function with each node
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
    * @param args Array The args to call the function with. Defaults to passing the current Node.
    */
  var cascadeBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Ext.data.NodeInterface[]) */
  var childNodes: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Ext.data.NodeInterface[]) */
  var children: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String) */
  var cls: js.UndefOr[String] = js.native
  
  /** [Method] Collapse this node
    * @param recursive Boolean True to recursively collapse all the children
    * @param callback Function The function to execute once the collapse completes
    * @param scope Object The scope to run the callback in
    */
  var collapse: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
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
      Unit
    ]
  ] = js.native
  
  /** [Method] Returns true if this node is an ancestor at any point of the passed node
    * @param node Ext.data.NodeInterface
    * @returns Boolean
    */
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.native
  
  /** [Method] Creates a copy clone of this Node
    * @param id String A new id, defaults to this Node's id.
    * @param deep Boolean True to recursively copy all child Nodes into the new Node. False to copy without child Nodes.
    * @returns Ext.data.NodeInterface A copy of this Node.
    */
  var copy: js.UndefOr[
    js.Function2[/* id */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean], this.type]
  ] = js.native
  
  /** [Method] Ensures that the passed object is an instance of a Record with the NodeInterface applied
    * @param node Object
    * @returns Ext.data.NodeInterface
    */
  var createNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (Number) */
  var depth: js.UndefOr[Double] = js.native
  
  /** [Method] Destroys the node
    * @param silent Object
    */
  var destroy: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Interates the child nodes of this node calling the specified function with each node
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in iteration.
    * @param args Array The args to call the function with. Defaults to passing the current Node.
    */
  var eachChild: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Expand this node
    * @param recursive Boolean True to recursively expand all the children
    * @param callback Function The function to execute once the expand completes
    * @param scope Object The scope to run the callback in
    */
  var expand: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Expand all the children of this node
    * @param recursive Boolean True to recursively expand all the children
    * @param callback Function The function to execute once all the children are expanded
    * @param scope Object The scope to run the callback in
    */
  var expandChildren: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var expandable: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /** [Method] Finds the first child that has the attribute with the specified value
    * @param attribute String The attribute name
    * @param value Object The value to search for
    * @param deep Boolean True to search through nodes deeper than the immediate children
    * @returns Ext.data.NodeInterface The found child or null if none was found
    */
  var findChild: js.UndefOr[
    js.Function3[
      /* attribute */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  
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
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  
  /** [Property] (Ext.data.NodeInterface) */
  var firstChild: js.UndefOr[INodeInterface] = js.native
  
  /** [Method] Returns the child node at the specified index
    * @param index Number
    * @returns Ext.data.NodeInterface
    */
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  
  /** [Method] Returns depth of this node the root node has a depth of 0
    * @returns Number
    */
  var getDepth: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the tree this node is in
    * @returns Ext.tree.Panel The tree panel which owns this node.
    */
  var getOwnerTree: js.UndefOr[js.Function0[IPanel]] = js.native
  
  /** [Method] Gets the hierarchical path from the root of the current node
    * @param field String The field to construct the path from. Defaults to the model idProperty.
    * @param separator String A separator to use.
    * @returns String The node path
    */
  var getPath: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], String]
  ] = js.native
  
  /** [Method] Returns true if this node has one or more child nodes else false
    * @returns Boolean
    */
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (String) */
  var href: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var index: js.UndefOr[Double] = js.native
  
  /** [Method] Returns the index of a child node
    * @param node Ext.data.NodeInterface
    * @returns Number The index of the node or -1 if it was not found
    */
  var indexOf: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Double]] = js.native
  
  /** [Method] Returns the index of a child node that matches the id
    * @param id String The id of the node to find
    * @returns Number The index of the node or -1 if it was not found
    */
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.native
  
  /** [Method] Inserts the first node before the second node in this nodes childNodes collection
    * @param node Ext.data.NodeInterface The node to insert
    * @param refNode Ext.data.NodeInterface The node to insert before (if null the node is appended)
    * @returns Ext.data.NodeInterface The inserted node
    */
  var insertBefore: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* refNode */ js.UndefOr[this.type], this.type]
  ] = js.native
  
  /** [Method] Inserts a node into this node
    * @param index Number The zero-based index to insert the node at
    * @param node Ext.data.NodeInterface The node to insert
    * @returns Ext.data.NodeInterface The node you just inserted
    */
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* node */ js.UndefOr[this.type], this.type]
  ] = js.native
  
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
    * @param node Ext.data.NodeInterface
    * @returns Boolean
    */
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.native
  
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
    * @returns Boolean
    */
  var isExpandable: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is expaned
    * @returns Boolean
    */
  var isExpanded: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Boolean) */
  var isFirst: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var isLast: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns true if this node is a leaf
    * @returns Boolean
    */
  var isLeaf: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is loaded
    * @returns Boolean
    */
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is loading
    * @returns Boolean
    */
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Property] (Boolean) */
  var isNode: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns true if this node is the root node
    * @returns Boolean
    */
  var isRoot: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is visible
    * @returns Boolean
    */
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Property] (Ext.data.NodeInterface) */
  var lastChild: js.UndefOr[INodeInterface] = js.native
  
  /** [Config Option] (Boolean) */
  var leaf: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var loading: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Ext.data.NodeInterface) */
  var nextSibling: js.UndefOr[INodeInterface] = js.native
  
  /** [Config Option] (String) */
  var parentId: js.UndefOr[String] = js.native
  
  /** [Property] (Ext.data.NodeInterface) */
  var parentNode: js.UndefOr[INodeInterface] = js.native
  
  /** [Property] (Ext.data.NodeInterface) */
  var previousSibling: js.UndefOr[INodeInterface] = js.native
  
  /** [Config Option] (Number) */
  var qshowDelay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var qtip: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var qtitle: js.UndefOr[String] = js.native
  
  /** [Method] Removes this node from its parent
    * @param destroy Boolean True to destroy the node upon removal.
    * @returns Ext.data.NodeInterface this
    */
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.native
  
  /** [Method] Removes all child nodes from this node
    * @param destroy Boolean True to destroy the node upon removal.
    * @returns Ext.data.NodeInterface this
    */
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.native
  
  /** [Method] Removes a child node from this node
    * @param node Ext.data.NodeInterface The node to remove
    * @param destroy Boolean True to destroy the node upon removal.
    * @returns Ext.data.NodeInterface The removed node
    */
  var removeChild: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* destroy */ js.UndefOr[Boolean], this.type]
  ] = js.native
  
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
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var root: js.UndefOr[Boolean] = js.native
  
  /** [Method] Creates an object representation of this node including its children  */
  var serialize: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sorts this nodes children using the supplied sort function
    * @param fn Function A function which, when passed two Nodes, returns -1, 0 or 1 depending upon required sort order.
    * @param recursive Boolean True to apply this sort recursively
    * @param suppressEvent Boolean True to not fire a sort event.
    */
  var sort: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* recursive */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  
  /** [Method] Updates general data of this node like isFirst isLast depth
    * @param commit Boolean
    * @param info Object The info to update. May contain any of the following
    */
  var updateInfo: js.UndefOr[
    js.Function2[/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object INodeInterface {
  
  @scala.inline
  def apply(): INodeInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeInterface]
  }
  
  @scala.inline
  implicit class INodeInterfaceMutableBuilder[Self <: INodeInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
    
    @scala.inline
    def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
    
    @scala.inline
    def setAppendChild(
      value: (/* node */ js.UndefOr[js.Any], /* suppressEvents */ js.UndefOr[Boolean], /* commit */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "appendChild", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
    
    @scala.inline
    def setBubble(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = StObject.set(x, "bubble", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
    
    @scala.inline
    def setCascadeBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = StObject.set(x, "cascadeBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCascadeByUndefined: Self = StObject.set(x, "cascadeBy", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setChildNodes(value: Array): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
    
    @scala.inline
    def setChildren(value: Array): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    @scala.inline
    def setCollapse(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "collapse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCollapseChildren(
      value: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "collapseChildren", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCollapseChildrenUndefined: Self = StObject.set(x, "collapseChildren", js.undefined)
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setContains(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setCopy(value: (/* id */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean]) => INodeInterface): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setCreateNode(value: /* node */ js.UndefOr[js.Any] => INodeInterface): Self = StObject.set(x, "createNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setEachChild(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = StObject.set(x, "eachChild", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEachChildUndefined: Self = StObject.set(x, "eachChild", js.undefined)
    
    @scala.inline
    def setExpand(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "expand", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExpandChildren(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "expandChildren", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExpandChildrenUndefined: Self = StObject.set(x, "expandChildren", js.undefined)
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setFindChild(
      value: (/* attribute */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "findChild", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindChildBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "findChildBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindChildByUndefined: Self = StObject.set(x, "findChildBy", js.undefined)
    
    @scala.inline
    def setFindChildUndefined: Self = StObject.set(x, "findChild", js.undefined)
    
    @scala.inline
    def setFirstChild(value: INodeInterface): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
    
    @scala.inline
    def setGetChildAt(value: /* index */ js.UndefOr[Double] => INodeInterface): Self = StObject.set(x, "getChildAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildAtUndefined: Self = StObject.set(x, "getChildAt", js.undefined)
    
    @scala.inline
    def setGetDepth(value: () => Double): Self = StObject.set(x, "getDepth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDepthUndefined: Self = StObject.set(x, "getDepth", js.undefined)
    
    @scala.inline
    def setGetOwnerTree(value: () => IPanel): Self = StObject.set(x, "getOwnerTree", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnerTreeUndefined: Self = StObject.set(x, "getOwnerTree", js.undefined)
    
    @scala.inline
    def setGetPath(value: (/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String]) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
    
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChildNodesUndefined: Self = StObject.set(x, "hasChildNodes", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefTarget(value: String): Self = StObject.set(x, "hrefTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefTargetUndefined: Self = StObject.set(x, "hrefTarget", js.undefined)
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconCls(value: String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexOf(value: /* node */ js.UndefOr[INodeInterface] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = StObject.set(x, "indexOfId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfIdUndefined: Self = StObject.set(x, "indexOfId", js.undefined)
    
    @scala.inline
    def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setInsertBefore(
      value: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    @scala.inline
    def setInsertChild(value: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[INodeInterface]) => INodeInterface): Self = StObject.set(x, "insertChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertChildUndefined: Self = StObject.set(x, "insertChild", js.undefined)
    
    @scala.inline
    def setIsAncestor(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = StObject.set(x, "isAncestor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAncestorUndefined: Self = StObject.set(x, "isAncestor", js.undefined)
    
    @scala.inline
    def setIsExpandable(value: () => Boolean): Self = StObject.set(x, "isExpandable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpandableUndefined: Self = StObject.set(x, "isExpandable", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    @scala.inline
    def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirstUndefined: Self = StObject.set(x, "isFirst", js.undefined)
    
    @scala.inline
    def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastUndefined: Self = StObject.set(x, "isLast", js.undefined)
    
    @scala.inline
    def setIsLeaf(value: () => Boolean): Self = StObject.set(x, "isLeaf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
    
    @scala.inline
    def setIsLoaded(value: () => Boolean): Self = StObject.set(x, "isLoaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoadedUndefined: Self = StObject.set(x, "isLoaded", js.undefined)
    
    @scala.inline
    def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    @scala.inline
    def setIsNode(value: Boolean): Self = StObject.set(x, "isNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNodeUndefined: Self = StObject.set(x, "isNode", js.undefined)
    
    @scala.inline
    def setIsRoot(value: () => Boolean): Self = StObject.set(x, "isRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setLastChild(value: INodeInterface): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
    
    @scala.inline
    def setLeaf(value: Boolean): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafUndefined: Self = StObject.set(x, "leaf", js.undefined)
    
    @scala.inline
    def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setNextSibling(value: INodeInterface): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setParentNode(value: INodeInterface): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    @scala.inline
    def setPreviousSibling(value: INodeInterface): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
    
    @scala.inline
    def setQshowDelay(value: Double): Self = StObject.set(x, "qshowDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQshowDelayUndefined: Self = StObject.set(x, "qshowDelay", js.undefined)
    
    @scala.inline
    def setQtip(value: String): Self = StObject.set(x, "qtip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQtipUndefined: Self = StObject.set(x, "qtip", js.undefined)
    
    @scala.inline
    def setQtitle(value: String): Self = StObject.set(x, "qtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQtitleUndefined: Self = StObject.set(x, "qtitle", js.undefined)
    
    @scala.inline
    def setRemove(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    @scala.inline
    def setRemoveChild(
      value: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "removeChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveChildUndefined: Self = StObject.set(x, "removeChild", js.undefined)
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReplaceChild(
      value: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceChildUndefined: Self = StObject.set(x, "replaceChild", js.undefined)
    
    @scala.inline
    def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSerialize(value: () => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    
    @scala.inline
    def setSort(
      value: (/* fn */ js.UndefOr[js.Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "sort", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUpdateInfo(value: (/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateInfoUndefined: Self = StObject.set(x, "updateInfo", js.undefined)
  }
}
