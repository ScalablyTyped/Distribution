package typings.dojo.dojo.data

import typings.dojo.dojo.data.api.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/ItemFileWriteStore.html
  *
  * TODOC
  *
  * @param keywordParameters The structure of the typeMap object is as follows:{    type0: function || object,    type1: function || object,    ...    typeN: function || object}Where if it is a function, it is assumed to be an object constructor that takes thevalue of _value as the initialization parameters.  It is serialized assuming object.toString()serialization.  If it is an object, then it is assumedto be an object of general form:{    type: function, //constructor.    deserialize:    function(value) //The function that parses the value and constructs the object defined by type appropriately.    serialize:  function(object) //The function that converts the object back into the proper file format form.}
  */
@JSGlobal("dojo.data.ItemFileWriteStore")
@js.native
class ItemFileWriteStore protected () extends ItemFileReadStore {
  def this(keywordParameters: js.Object) = this()
  /**
    *
    */
  var referenceIntegrity: Boolean = js.native
  /**
    * See dojo/data/api/Write.deleteItem()
    *
    * @param item
    */
  def deleteItem(item: Item): Boolean = js.native
  /**
    * See dojo/data/api/Write.isDirty()
    *
    * @param item               Optional
    */
  def isDirty(): js.Any = js.native
  def isDirty(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Write.newItem()
    *
    * @param keywordArgs               Optional
    * @param parentInfo               Optional
    */
  def newItem(): js.Object = js.native
  def newItem(keywordArgs: js.Object): js.Object = js.native
  def newItem(keywordArgs: js.Object, parentInfo: js.Object): js.Object = js.native
  /**
    * See dojo/data/api/Notification.onDelete()
    *
    * @param deletedItem
    */
  def onDelete(deletedItem: Item): Unit = js.native
  /**
    * See dojo/data/api/Notification.onNew()
    *
    * @param newItem
    * @param parentInfo               Optional
    */
  def onNew(newItem: Item): Unit = js.native
  def onNew(newItem: Item, parentInfo: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet()
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: Item, attribute: String, oldValue: js.Array[_], newValue: js.Array[_]): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet()
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: Item, attribute: String, oldValue: js.Array[_], newValue: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet()
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: Item, attribute: String, oldValue: js.Object, newValue: js.Array[_]): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet()
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: Item, attribute: String, oldValue: js.Object, newValue: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Write.revert()
    *
    */
  def revert(): Boolean = js.native
  /**
    * See dojo/data/api/Write.save()
    *
    * @param keywordArgs
    */
  def save(keywordArgs: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Write.set()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def setValue(item: Item, attribute: String, value: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Write.setValues()
    *
    * @param item
    * @param attribute
    * @param values
    */
  def setValues(item: Item, attribute: String, values: js.Array[_]): js.Any = js.native
  /**
    * See dojo/data/api/Write.unsetAttribute()
    *
    * @param item
    * @param attribute
    */
  def unsetAttribute(item: Item, attribute: String): js.Any = js.native
}

