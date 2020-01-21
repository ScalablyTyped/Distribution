package typings.dojo.dijit.tree

import typings.dojo.dijit.tree.dndSource.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/ForestStoreModel.html
  *
  * Interface between a dijit.Tree and a dojo.data store that doesn't have a root item,
  * a.k.a. a store that has multiple "top level" items.
  * Use this class to wrap a dojo.data store, making all the items matching the specified query
  * appear as children of a fabricated "root item".  If no query is specified then all the
  * items returned by fetch() on the underlying store become children of the root item.
  * This class allows dijit.Tree to assume a single root item, even if the store doesn't have one.
  * 
  * When using this class the developer must override a number of methods according to their app and
  * data, including:
  * 
  * onNewRootItem
  * onAddToRoot
  * onLeaveRoot
  * onNewItem
  * onSetItem
  * 
  * @param params     
  */
@JSGlobal("dijit.tree.ForestStoreModel")
@js.native
class ForestStoreModel protected () extends TreeStoreModel {
  def this(params: js.Any) = this()
  /**
    * Specifies the set of children of the root item.
    * 
    */
  @JSName("query")
  var query_ForestStoreModel: String = js.native
  /**
    * ID of fabricated root item
    * 
    */
  var rootId: String = js.native
  /**
    * Label of fabricated root item
    * 
    */
  var rootLabel: String = js.native
  /**
    * 
    * @param item             
    */
  def getLabel(item: js.Any): js.Any = js.native
  /**
    * Creates a new item.   See dojo/data/api/Write for details on args.
    * Used in drag & drop when item from external source dropped onto tree.
    * 
    * @param args             
    * @param parent             
    * @param insertIndex               Optional            
    */
  def newItem(args: Item, parent: js.Any, insertIndex: Double): js.Any = js.native
  /**
    * Called when item added to root of tree; user must override this method
    * to modify the item so that it matches the query for top level items
    * 
    * @param item             
    */
  def onAddToRoot(item: js.Any): Unit = js.native
  /**
    * Called when item removed from root of tree; user must override this method
    * to modify the item so it doesn't match the query for top level items
    * 
    * @param item             
    */
  def onLeaveRoot(item: js.Any): Unit = js.native
  /**
    * User can override this method to modify a new element that's being
    * added to the root of the tree, for example to add a flag like root=true
    * 
    * @param args             
    */
  def onNewRootItem(args: Item): Unit = js.native
  /**
    * Updates the tree view according to changes to an item in the data store.
    * Developers should override this method to be more efficient based on their app/data.
    * Handles updates to an item's children by calling onChildrenChange(), and
    * other updates to an item by calling onChange().
    * 
    * Also, any change to any item re-executes the query for the tree's top-level items,
    * since this modified item may have started/stopped matching the query for top level items.
    * 
    * If possible, developers should override this function to only call _requeryTop() when
    * the change to the item has caused it to stop/start being a top level item in the tree.
    * 
    * @param item             
    * @param attribute             
    * @param oldValue             
    * @param newValue             
    */
  def onSetItem(item: js.Any, attribute: String, oldValue: js.Array[_], newValue: js.Array[_]): Unit = js.native
  /**
    * Updates the tree view according to changes to an item in the data store.
    * Developers should override this method to be more efficient based on their app/data.
    * Handles updates to an item's children by calling onChildrenChange(), and
    * other updates to an item by calling onChange().
    * 
    * Also, any change to any item re-executes the query for the tree's top-level items,
    * since this modified item may have started/stopped matching the query for top level items.
    * 
    * If possible, developers should override this function to only call _requeryTop() when
    * the change to the item has caused it to stop/start being a top level item in the tree.
    * 
    * @param item             
    * @param attribute             
    * @param oldValue             
    * @param newValue             
    */
  def onSetItem(item: js.Any, attribute: String, oldValue: js.Array[_], newValue: js.Object): Unit = js.native
  /**
    * Updates the tree view according to changes to an item in the data store.
    * Developers should override this method to be more efficient based on their app/data.
    * Handles updates to an item's children by calling onChildrenChange(), and
    * other updates to an item by calling onChange().
    * 
    * Also, any change to any item re-executes the query for the tree's top-level items,
    * since this modified item may have started/stopped matching the query for top level items.
    * 
    * If possible, developers should override this function to only call _requeryTop() when
    * the change to the item has caused it to stop/start being a top level item in the tree.
    * 
    * @param item             
    * @param attribute             
    * @param oldValue             
    * @param newValue             
    */
  def onSetItem(item: js.Any, attribute: String, oldValue: js.Object, newValue: js.Array[_]): Unit = js.native
  /**
    * Updates the tree view according to changes to an item in the data store.
    * Developers should override this method to be more efficient based on their app/data.
    * Handles updates to an item's children by calling onChildrenChange(), and
    * other updates to an item by calling onChange().
    * 
    * Also, any change to any item re-executes the query for the tree's top-level items,
    * since this modified item may have started/stopped matching the query for top level items.
    * 
    * If possible, developers should override this function to only call _requeryTop() when
    * the change to the item has caused it to stop/start being a top level item in the tree.
    * 
    * @param item             
    * @param attribute             
    * @param oldValue             
    * @param newValue             
    */
  def onSetItem(item: js.Any, attribute: String, oldValue: js.Object, newValue: js.Object): Unit = js.native
}

