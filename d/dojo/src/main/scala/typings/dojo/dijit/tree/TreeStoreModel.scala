package typings.dojo.dijit.tree

import typings.dojo.dijit.tree.dndSource.__Item
import typings.dojo.dojo.data.api.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/TreeStoreModel.html
  *
  * Implements dijit/Tree/model connecting to a dojo.data store with a single
  * root item.  Any methods passed into the constructor will override
  * the ones defined here.
  * 
  * @param args     
  */
@JSGlobal("dijit.tree.TreeStoreModel")
@js.native
class TreeStoreModel protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    * One or more attribute names (attributes in the dojo.data item) that specify that item's children
    * 
    */
  var childrenAttrs: js.Object = js.native
  /**
    * Setting this to true will cause the TreeStoreModel to defer calling loadItem on nodes
    * until they are expanded. This allows for lazying loading where only one
    * loadItem (and generally one network call, consequently) per expansion
    * (rather than one for each child).
    * This relies on partial loading of the children items; each children item of a
    * fully loaded item should contain the label and info about having children.
    * 
    */
  var deferItemLoadingUntilExpand: Boolean = js.native
  /**
    * If specified, get label for tree node from this attribute, rather
    * than by calling store.getLabel()
    * 
    */
  var labelAttr: String = js.native
  /**
    * Name of attribute in the Object passed to newItem() that specifies the id.
    * 
    * If newItemIdAttr is set then it's used when newItem() is called to see if an
    * item with the same id already exists, and if so just links to the old item
    * (so that the old item ends up with two parents).
    * 
    * Setting this to null or "" will make every drop create a new item.
    * 
    */
  var newItemIdAttr: String = js.native
  /**
    * Specifies datastore query to return the root item for the tree.
    * Must only return a single item.   Alternately can just pass in pointer
    * to root item.
    * 
    */
  var query: js.Object = js.native
  /**
    * Pointer to the root item (read only, not a parameter)
    * 
    */
  var root: js.Object = js.native
  /**
    * Underlying store
    * 
    */
  var store: js.Object = js.native
  /**
    * 
    */
  def destroy(): Unit = js.native
  /**
    * Given the identity of an item, this method returns the item that has
    * that identity through the onItem callback.  Conforming implementations
    * should return null if there is no item with the given identity.
    * Implementations of fetchItemByIdentity() may sometimes return an item
    * from a local cache and may sometimes fetch an item from a remote server.
    * 
    * @param keywordArgs             
    */
  def fetchItemByIdentity(keywordArgs: js.Object): Unit = js.native
  /**
    * Calls onComplete() with array of child items of given parent item, all loaded.
    * 
    * @param parentItem             
    * @param onComplete             
    * @param onError             
    */
  def getChildren(parentItem: Item, onComplete: js.Function1[/* items */ js.Array[_], _], onError: js.Function): Unit = js.native
  /**
    * 
    * @param item             
    */
  def getIdentity(item: js.Any): js.Any = js.native
  /**
    * Get the label for an item
    * 
    * @param item             
    */
  def getLabel(item: Item): js.Any = js.native
  /**
    * Calls onItem with the root item for the tree, possibly a fabricated item.
    * Calls onError on error.
    * 
    * @param onItem             
    * @param onError             
    */
  def getRoot(onItem: js.Any, onError: js.Any): Unit = js.native
  /**
    * 
    * @param something             
    */
  def isItem(something: js.Any): js.Any = js.native
  /**
    * Tells if an item has or may have children.  Implementing logic here
    * avoids showing +/- expando icon for nodes that we know don't have children.
    * (For efficiency reasons we may not want to check if an element actually
    * has children until user clicks the expando node)
    * 
    * @param item             
    */
  def mayHaveChildren(item: Item): js.Any = js.native
  /**
    * Creates a new item.   See dojo/data/api/Write for details on args.
    * Used in drag & drop when item from external source dropped onto tree.
    * Developers will need to override this method if new items get added
    * to parents with multiple children attributes, in order to define which
    * children attribute points to the new item.
    * 
    * @param args             
    * @param parent             
    * @param insertIndex               Optional            
    */
  def newItem(args: __Item, parent: Item, insertIndex: Double): Unit = js.native
  /**
    * Callback whenever an item has changed, so that Tree
    * can update the label, icon, etc.   Note that changes
    * to an item's children or parent(s) will trigger an
    * onChildrenChange() so you can ignore those changes here.
    * 
    * @param item             
    */
  def onChange(item: Item): Unit = js.native
  /**
    * Callback to do notifications about new, updated, or deleted items.
    * 
    * @param parent             
    * @param newChildrenList             
    */
  def onChildrenChange(parent: Item, newChildrenList: js.Array[Item]): Unit = js.native
  /**
    * Callback when an item has been deleted.
    * Note that there will also be an onChildrenChange() callback for the parent
    * of this item.
    * 
    * @param item             
    */
  def onDelete(item: Item): Unit = js.native
  /**
    * Handler for delete notifications from underlying store
    * 
    * @param item             
    */
  def onDeleteItem(item: js.Object): Unit = js.native
  /**
    * Handler for when new items appear in the store, either from a drop operation
    * or some other way.   Updates the tree view (if necessary).
    * If the new item is a child of an existing item,
    * calls onChildrenChange() with the new list of children
    * for that existing item.
    * 
    * @param item             
    * @param parentInfo             
    */
  def onNewItem(item: Item, parentInfo: js.Object): Unit = js.native
  /**
    * Updates the tree view according to changes in the data store.
    * Handles updates to an item's children by calling onChildrenChange(), and
    * other updates to an item by calling onChange().
    * 
    * See onNewItem for more details on handling updates to an item's children.
    * 
    * @param item             
    * @param attribute             
    * @param oldValue             
    * @param newValue             
    */
  def onSetItem(item: js.Any, attribute: js.Any, oldValue: js.Array[_], newValue: js.Array[_]): Unit = js.native
  /**
    * Updates the tree view according to changes in the data store.
    * Handles updates to an item's children by calling onChildrenChange(), and
    * other updates to an item by calling onChange().
    * 
    * See onNewItem for more details on handling updates to an item's children.
    * 
    * @param item             
    * @param attribute             
    * @param oldValue             
    * @param newValue             
    */
  def onSetItem(item: js.Any, attribute: js.Any, oldValue: js.Array[_], newValue: js.Object): Unit = js.native
  /**
    * Updates the tree view according to changes in the data store.
    * Handles updates to an item's children by calling onChildrenChange(), and
    * other updates to an item by calling onChange().
    * 
    * See onNewItem for more details on handling updates to an item's children.
    * 
    * @param item             
    * @param attribute             
    * @param oldValue             
    * @param newValue             
    */
  def onSetItem(item: js.Any, attribute: js.Any, oldValue: js.Object, newValue: js.Array[_]): Unit = js.native
  /**
    * Updates the tree view according to changes in the data store.
    * Handles updates to an item's children by calling onChildrenChange(), and
    * other updates to an item by calling onChange().
    * 
    * See onNewItem for more details on handling updates to an item's children.
    * 
    * @param item             
    * @param attribute             
    * @param oldValue             
    * @param newValue             
    */
  def onSetItem(item: js.Any, attribute: js.Any, oldValue: js.Object, newValue: js.Object): Unit = js.native
  /**
    * Move or copy an item from one parent item to another.
    * Used in drag & drop
    * 
    * @param childItem             
    * @param oldParentItem             
    * @param newParentItem             
    * @param bCopy             
    * @param insertIndex               Optional            
    */
  def pasteItem(
    childItem: js.Any,
    oldParentItem: js.Any,
    newParentItem: js.Any,
    bCopy: Boolean,
    insertIndex: Double
  ): Unit = js.native
}

