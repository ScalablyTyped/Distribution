package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.tree.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class INodeInterfaceOps[Self <: INodeInterface] (val x: Self) extends AnyVal {
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
    def setAllowDrag(value: Boolean): Self = this.set("allowDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDrag: Self = this.set("allowDrag", js.undefined)
    @scala.inline
    def setAllowDrop(value: Boolean): Self = this.set("allowDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDrop: Self = this.set("allowDrop", js.undefined)
    @scala.inline
    def setAppendChild(
      value: (/* node */ js.UndefOr[js.Any], /* suppressEvents */ js.UndefOr[Boolean], /* commit */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = this.set("appendChild", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAppendChild: Self = this.set("appendChild", js.undefined)
    @scala.inline
    def setBubble(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = this.set("bubble", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    @scala.inline
    def setCascadeBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = this.set("cascadeBy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCascadeBy: Self = this.set("cascadeBy", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setChildNodes(value: Array): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildNodes: Self = this.set("childNodes", js.undefined)
    @scala.inline
    def setChildren(value: Array): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    @scala.inline
    def setCollapse(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("collapse", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setCollapseChildren(
      value: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("collapseChildren", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCollapseChildren: Self = this.set("collapseChildren", js.undefined)
    @scala.inline
    def setContains(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setCopy(value: (/* id */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean]) => INodeInterface): Self = this.set("copy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setCreateNode(value: /* node */ js.UndefOr[js.Any] => INodeInterface): Self = this.set("createNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateNode: Self = this.set("createNode", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setDestroy(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEachChild(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = this.set("eachChild", js.Any.fromFunction3(value))
    @scala.inline
    def deleteEachChild: Self = this.set("eachChild", js.undefined)
    @scala.inline
    def setExpand(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("expand", js.Any.fromFunction3(value))
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setExpandChildren(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("expandChildren", js.Any.fromFunction3(value))
    @scala.inline
    def deleteExpandChildren: Self = this.set("expandChildren", js.undefined)
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setFindChild(
      value: (/* attribute */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = this.set("findChild", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFindChild: Self = this.set("findChild", js.undefined)
    @scala.inline
    def setFindChildBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = this.set("findChildBy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFindChildBy: Self = this.set("findChildBy", js.undefined)
    @scala.inline
    def setFirstChild(value: INodeInterface): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstChild: Self = this.set("firstChild", js.undefined)
    @scala.inline
    def setGetChildAt(value: /* index */ js.UndefOr[Double] => INodeInterface): Self = this.set("getChildAt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetChildAt: Self = this.set("getChildAt", js.undefined)
    @scala.inline
    def setGetDepth(value: () => Double): Self = this.set("getDepth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDepth: Self = this.set("getDepth", js.undefined)
    @scala.inline
    def setGetOwnerTree(value: () => IPanel): Self = this.set("getOwnerTree", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOwnerTree: Self = this.set("getOwnerTree", js.undefined)
    @scala.inline
    def setGetPath(value: (/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String]) => String): Self = this.set("getPath", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetPath: Self = this.set("getPath", js.undefined)
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = this.set("hasChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasChildNodes: Self = this.set("hasChildNodes", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setHrefTarget(value: String): Self = this.set("hrefTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrefTarget: Self = this.set("hrefTarget", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconCls(value: String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setIndexOf(value: /* node */ js.UndefOr[INodeInterface] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    @scala.inline
    def setIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = this.set("indexOfId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndexOfId: Self = this.set("indexOfId", js.undefined)
    @scala.inline
    def setInsertBefore(
      value: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    @scala.inline
    def setInsertChild(value: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[INodeInterface]) => INodeInterface): Self = this.set("insertChild", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertChild: Self = this.set("insertChild", js.undefined)
    @scala.inline
    def setIsAncestor(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = this.set("isAncestor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsAncestor: Self = this.set("isAncestor", js.undefined)
    @scala.inline
    def setIsExpandable(value: () => Boolean): Self = this.set("isExpandable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsExpandable: Self = this.set("isExpandable", js.undefined)
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = this.set("isExpanded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    @scala.inline
    def setIsFirst(value: Boolean): Self = this.set("isFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFirst: Self = this.set("isFirst", js.undefined)
    @scala.inline
    def setIsLast(value: Boolean): Self = this.set("isLast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLast: Self = this.set("isLast", js.undefined)
    @scala.inline
    def setIsLeaf(value: () => Boolean): Self = this.set("isLeaf", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLeaf: Self = this.set("isLeaf", js.undefined)
    @scala.inline
    def setIsLoaded(value: () => Boolean): Self = this.set("isLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLoaded: Self = this.set("isLoaded", js.undefined)
    @scala.inline
    def setIsLoading(value: () => Boolean): Self = this.set("isLoading", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    @scala.inline
    def setIsNode(value: Boolean): Self = this.set("isNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNode: Self = this.set("isNode", js.undefined)
    @scala.inline
    def setIsRoot(value: () => Boolean): Self = this.set("isRoot", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsRoot: Self = this.set("isRoot", js.undefined)
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setLastChild(value: INodeInterface): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastChild: Self = this.set("lastChild", js.undefined)
    @scala.inline
    def setLeaf(value: Boolean): Self = this.set("leaf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaf: Self = this.set("leaf", js.undefined)
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setNextSibling(value: INodeInterface): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSibling: Self = this.set("nextSibling", js.undefined)
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setParentNode(value: INodeInterface): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    @scala.inline
    def setPreviousSibling(value: INodeInterface): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousSibling: Self = this.set("previousSibling", js.undefined)
    @scala.inline
    def setQshowDelay(value: Double): Self = this.set("qshowDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQshowDelay: Self = this.set("qshowDelay", js.undefined)
    @scala.inline
    def setQtip(value: String): Self = this.set("qtip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQtip: Self = this.set("qtip", js.undefined)
    @scala.inline
    def setQtitle(value: String): Self = this.set("qtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQtitle: Self = this.set("qtitle", js.undefined)
    @scala.inline
    def setRemove(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveAll(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = this.set("removeAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    @scala.inline
    def setRemoveChild(
      value: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = this.set("removeChild", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveChild: Self = this.set("removeChild", js.undefined)
    @scala.inline
    def setReplaceChild(
      value: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = this.set("replaceChild", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplaceChild: Self = this.set("replaceChild", js.undefined)
    @scala.inline
    def setRoot(value: Boolean): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSerialize(value: () => Unit): Self = this.set("serialize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setSort(
      value: (/* fn */ js.UndefOr[js.Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("sort", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUpdateInfo(value: (/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateInfo", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateInfo: Self = this.set("updateInfo", js.undefined)
  }
  
}

