package typings.dojo.dijit.tree

import typings.dojo.dojo.data.api.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/ObjectStoreModel.html
  *
  * Implements dijit/tree/model connecting dijit/Tree to a dojo/store/api/Store that implements
  * getChildren().
  * 
  * If getChildren() returns an array with an observe() method, then it will be leveraged to reflect
  * store updates to the tree.   So, this class will work best when:
  * 
  * 1. the store implements dojo/store/Observable
  * 2. getChildren() is implemented as a query to the server (i.e. it calls store.query())
  * Drag and Drop: To support drag and drop, besides implementing getChildren()
  * and dojo/store/Observable, the store must support the parent option to put().
  * And in order to have child elements ordered according to how the user dropped them,
  * put() must support the before option.
  * 
  * @param args     
  */
@JSGlobal("dijit.tree.ObjectStoreModel")
@js.native
class ObjectStoreModel protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    * Get label for tree node from this attribute
    * 
    */
  var labelAttr: String = js.native
  /**
    * Specifies how to interpret the labelAttr in the data store items.
    * Can be "html" or "text".
    * 
    */
  var labelType: String = js.native
  /**
    * Specifies datastore query to return the root item for the tree.
    * Must only return a single item.   Alternately can just pass in pointer
    * to root item.
    * 
    */
  var query: js.Object = js.native
  /**
    * Pointer to the root item from the dojo/store/api/Store (read only, not a parameter)
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
    * Calls onComplete() with array of child items of given parent item.
    * 
    * @param parentItem Item from the dojo/store             
    * @param onComplete             
    * @param onError             
    */
  def getChildren(parentItem: js.Object, onComplete: js.Function1[/* items */ js.Array[_], _], onError: js.Function): Unit = js.native
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
  def isItem(something: js.Any): Boolean = js.native
  /**
    * Tells if an item has or might have children.  Implementing logic here
    * avoids showing +/- expando icon for nodes that we know won't have children.
    * (For efficiency reasons we may not want to check if an element actually
    * has children until user clicks the expando node).
    * 
    * Application code should override this method based on the data, for example
    * it could be return item.leaf == true;.
    * 
    * Note that mayHaveChildren() must return true for an item if it could possibly
    * have children in the future, due to drag-an-drop or some other data store update.
    * Also note that it may return true if it's just too expensive to check during tree
    * creation whether or not the item has children.
    * 
    * @param item Item from the dojo/store             
    */
  def mayHaveChildren(item: js.Object): Boolean = js.native
  /**
    * Creates a new item.   See dojo/data/api/Write for details on args.
    * Used in drag & drop when item from external source dropped onto tree.
    * 
    * @param args             
    * @param parent             
    * @param insertIndex               Optional            
    * @param before             
    */
  def newItem(args: typings.dojo.dijit.tree.dndSource.Item, parent: js.Any, insertIndex: Double, before: js.Any): js.Any = js.native
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
    * @param newChildrenList Items from the store             
    */
  def onChildrenChange(parent: Item, newChildrenList: js.Array[js.Object]): Unit = js.native
  /**
    * Callback when an item has been deleted.
    * Actually we have no way of knowing this with the new dojo.store API,
    * so this method is never called (but it's left here since Tree connects
    * to it).
    * 
    * @param item             
    */
  def onDelete(item: Item): Unit = js.native
  /**
    * Move or copy an item from one parent item to another.
    * Used in drag & drop
    * 
    * @param childItem             
    * @param oldParentItem             
    * @param newParentItem             
    * @param bCopy             
    * @param insertIndex               Optional            
    * @param before             
    */
  def pasteItem(
    childItem: js.Any,
    oldParentItem: js.Any,
    newParentItem: js.Any,
    bCopy: Boolean,
    insertIndex: Double,
    before: js.Any
  ): js.Any = js.native
}

