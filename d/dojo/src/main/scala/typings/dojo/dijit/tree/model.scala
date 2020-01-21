package typings.dojo.dijit.tree

import typings.dojo.dojo.data.api.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/model.html
  *
  * Contract for any data provider object for the tree.
  * Tree passes in values to the constructor to specify the callbacks.
  * "item" is typically a dojo/data/Item but it's just a black box so
  * it could be anything.
  * 
  * This (like dojo/data/api/Read) is just documentation, and not meant to be used.
  * 
  */
@JSGlobal("dijit.tree.model")
@js.native
class model () extends js.Object {
  /**
    * Destroys this object, releasing connections to the store
    * 
    */
  def destroy(): Unit = js.native
  /**
    * Calls onComplete() with array of child items of given parent item, all loaded.
    * Throws exception on error.
    * 
    * @param parentItem             
    * @param onComplete             
    */
  def getChildren(parentItem: Item, onComplete: js.Any): Unit = js.native
  /**
    * Returns identity for an item
    * 
    * @param item             
    */
  def getIdentity(item: js.Any): Unit = js.native
  /**
    * Get the label for an item
    * 
    * @param item             
    */
  def getLabel(item: js.Any): Unit = js.native
  /**
    * Calls onItem with the root item for the tree, possibly a fabricated item.
    * Throws exception on error.
    * 
    * @param onItem             
    */
  def getRoot(onItem: js.Any): Unit = js.native
  /**
    * Returns true if something is an item and came from this model instance.
    * Returns false if something is a literal, an item from another model instance,
    * or is any object other than an item.
    * 
    * @param something             
    */
  def isItem(something: js.Any): Unit = js.native
  /**
    * Tells if an item has or may have children.  Implementing logic here
    * avoids showing +/- expando icon for nodes that we know don't have children.
    * (For efficiency reasons we may not want to check if an element actually
    * has children until user clicks the expando node)
    * 
    * @param item             
    */
  def mayHaveChildren(item: Item): Unit = js.native
  /**
    * Creates a new item.   See dojo/data/api/Write for details on args.
    * 
    * @param args             
    * @param parent             
    * @param insertIndex               OptionalAllows to insert the new item as the n'th child of parent.             
    * @param before               OptionalInsert the new item as the previous sibling of this item.  before must be a child of parent.             
    */
  def newItem(args: typings.dojo.dijit.tree.dndSource.Item, parent: js.Any, insertIndex: Double, before: js.Any): Unit = js.native
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
    * Move or copy an item from one parent item to another.
    * Used in drag & drop.
    * If oldParentItem is specified and bCopy is false, childItem is removed from oldParentItem.
    * If newParentItem is specified, childItem is attached to newParentItem.
    * 
    * @param childItem             
    * @param oldParentItem             
    * @param newParentItem             
    * @param bCopy             
    * @param insertIndex               OptionalAllows to insert the new item as the n'th child of parent.             
    * @param before               OptionalInsert the new item as the previous sibling of this item.  before must be a child of parent.             
    */
  def pasteItem(
    childItem: js.Any,
    oldParentItem: js.Any,
    newParentItem: js.Any,
    bCopy: Boolean,
    insertIndex: Double,
    before: js.Any
  ): Unit = js.native
}

