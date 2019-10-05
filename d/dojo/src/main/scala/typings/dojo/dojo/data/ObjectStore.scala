package typings.dojo.dojo.data

import typings.dojo.dojo.Evented
import typings.dojo.dojo.data.api.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/ObjectStore.html
  *
  * A Dojo Data implementation that wraps Dojo object stores for backwards
  * compatibility.
  *
  * @param options The configuration information to pass into the data store.options.objectStore:The object store to use as the source provider for this data store
  */
@JSGlobal("dojo.data.ObjectStore")
@js.native
class ObjectStore protected () extends Evented {
  def this(options: js.Any) = this()
  /**
    *
    */
  var labelProperty: String = js.native
  /**
    *
    */
  var objectStore: js.Object = js.native
  /**
    * adds an object to the list of dirty objects.  This object
    * contains a reference to the object itself as well as a
    * cloned and trimmed version of old object for use with
    * revert.
    *
    * @param object Indicates that the given object is changing and should be marked as dirty for the next save
    * @param _deleting
    */
  def changing(`object`: js.Object, _deleting: Boolean): Unit = js.native
  /**
    * See dojo/data/api/Read.close()
    *
    * @param request
    */
  def close(request: js.Any): js.Any = js.native
  /**
    * Checks to see if 'item' has 'value' at 'attribute'
    *
    * @param item The item to check
    * @param attribute The attribute to check
    * @param value The value to look for
    */
  def containsValue(item: js.Object, attribute: String, value: js.Any): Boolean = js.native
  /**
    * deletes item and any references to that item from the store.
    *
    * @param item item to delete
    */
  def deleteItem(item: js.Any): Unit = js.native
  /**
    *
    * @param type
    * @param event
    */
  def emit(`type`: js.Any, event: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.fetch()
    *
    * @param args
    */
  def fetch(args: js.Any): js.Any = js.native
  /**
    * fetch an item by its identity, by looking in our index of what we have loaded
    *
    * @param args
    */
  def fetchItemByIdentity(args: js.Any): js.Any = js.native
  /**
    * Gets the available attributes of an item's 'property' and returns
    * it as an array.
    *
    * @param item
    */
  def getAttributes(item: js.Object): js.Array[_] = js.native
  /**
    * return the store feature set
    *
    */
  def getFeatures(): js.Object = js.native
  /**
    * returns the identity of the given item
    * See dojo/data/api/Read.getIdentity()
    *
    * @param item
    */
  def getIdentity(item: js.Any): js.Any = js.native
  /**
    * returns the attributes which are used to make up the
    * identity of an item.    Basically returns this.objectStore.idProperty
    * See dojo/data/api/Read.getIdentityAttributes()
    *
    * @param item
    */
  def getIdentityAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.getLabel()
    *
    * @param item
    */
  def getLabel(item: Item): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabelAttributes()
    *
    * @param item
    */
  def getLabelAttributes(item: Item): js.Array[_] = js.native
  /**
    * Gets the value of an item's 'property'
    *
    * @param item The item to get the value from
    * @param property property to look up value for
    * @param defaultValue               Optionalthe default value
    */
  def getValue(item: js.Object, property: String): js.Any = js.native
  def getValue(item: js.Object, property: String, defaultValue: js.Any): js.Any = js.native
  /**
    * Gets the value of an item's 'property' and returns
    * it. If this value is an array it is just returned,
    * if not, the value is added to an array and that is returned.
    *
    * @param item
    * @param property property to look up value for
    */
  def getValues(item: js.Object, property: String): js.Array[_] = js.native
  /**
    * Checks to see if item has attribute
    *
    * @param item The item to check
    * @param attribute The attribute to check
    */
  def hasAttribute(item: js.Object, attribute: String): Boolean = js.native
  /**
    * returns true if the item is marked as dirty or true if there are any dirty items
    *
    * @param item The item to check
    */
  def isDirty(item: js.Object): js.Any = js.native
  /**
    * Checks to see if the argument is an item
    *
    * @param item The item to check
    */
  def isItem(item: js.Object): Boolean = js.native
  /**
    * Checks to see if the item is loaded.
    *
    * @param item The item to check
    */
  def isItemLoaded(item: js.Object): js.Any = js.native
  /**
    * Loads an item and calls the callback handler. Note, that this will call the callback
    * handler even if the item is loaded. Consequently, you can use loadItem to ensure
    * that an item is loaded is situations when the item may or may not be loaded yet.
    * If you access a value directly through property access, you can use this to load
    * a lazy value as well (doesn't need to be an item).
    *
    * @param args See dojo/data/api/Read.fetch()
    */
  def loadItem(args: js.Object): js.Any = js.native
  /**
    * adds a new item to the store at the specified point.
    * Takes two parameters, data, and options.
    *
    * @param data See dojo/data/api/Write.newItem()
    * @param parentInfo
    */
  def newItem(data: js.Object, parentInfo: js.Any): js.Object = js.native
  /**
    *
    * @param type
    * @param listener
    */
  def on(`type`: js.Any, listener: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Notification.onDelete()
    *
    */
  def onDelete(): Unit = js.native
  /**
    * Called when a fetch occurs
    *
    * @param results
    */
  def onFetch(results: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Notification.onNew()
    *
    */
  def onNew(): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet()
    *
    */
  def onSet(): Unit = js.native
  /**
    * returns any modified data to its original state prior to a save();
    *
    */
  def revert(): Unit = js.native
  /**
    * Saves the dirty data using object store provider. See dojo/data/api/Write for API.
    *
    * @param kwArgs kwArgs.global:This will cause the save to commit the dirty data for allObjectStores as a single transaction.kwArgs.revertOnError:This will cause the changes to be reverted if there is anerror on the save. By default a revert is executed unlessa value of false is provide for this parameter.kwArgs.onError:Called when an error occurs in the commitkwArgs.onComplete:Called when an the save/commit is completed
    */
  def save(kwArgs: js.Any): Unit = js.native
  /**
    * sets 'attribute' on 'item' to 'value'
    * See dojo/data/api/Write.setValue()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def setValue(item: js.Any, attribute: js.Any, value: js.Any): Unit = js.native
  /**
    * sets 'attribute' on 'item' to 'value' value
    * must be an array.
    * See dojo/data/api/Write.setValues()
    *
    * @param item
    * @param attribute
    * @param values
    */
  def setValues(item: js.Any, attribute: js.Any, values: js.Any): Unit = js.native
  /**
    * unsets 'attribute' on 'item'
    * See dojo/data/api/Write.unsetAttribute()
    *
    * @param item
    * @param attribute
    */
  def unsetAttribute(item: js.Any, attribute: js.Any): Unit = js.native
}

