package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/JsonRestStore.html
  *
  *
  * @param options Keyword argumentsThe schema parameterThis is a schema object for this store. This should be JSON Schema format.The service parameterThis is the service object that is used to retrieve lazy data and save resultsThe function should be directly callable with a single parameter of an object id to be loadedThe function should also have the following methods:put(id,value) - puts the value at the given idpost(id,value) - posts (appends) the value at the given iddelete(id) - deletes the value corresponding to the given idNote that it is critical that the service parses responses as JSON.If you are using dojox.rpc.Service, the easiest way to make sure thishappens is to make the responses have a content type ofapplication/json. If you are creating your own service, make sure youuse handleAs: "json" with your XHR requests.The target parameterThis is the target URL for this Service store. This may be used in placeof a service parameter to connect directly to RESTful URL withoutusing a dojox.rpc.Service object.The idAttribute parameterDefaults to 'id'. The name of the attribute that holds an objects id.This can be a preexisting id provided by the server.If an ID isn't already provided when an objectis fetched or added to the store, the autoIdentity systemwill generate an id for it and add it to the index.The syncMode parameterSetting this to true will set the store to using synchronous calls by default.Sync calls return their data immediately from the calling function, socallbacks are unnecessary
  */
@JSGlobal("dojox.data.JsonRestStore")
@js.native
class JsonRestStore () extends ServiceStore {
  def this(options: js.Any) = this()
  /**
    * Allow no trailing slash on target paths. This is generally discouraged since
    * it creates prevents simple scalar values from being used a relative URLs.
    * Disabled by default.
    *
    */
  var allowNoTrailingSlash: Boolean = js.native
  /**
    * Treat objects in queries as partially loaded objects
    *
    */
  var idAsRef: Boolean = js.native
  /**
    * Will load any schemas referenced content-type header or in Link headers
    *
    */
  var loadReferencedSchema: Boolean = js.native
  /**
    *
    */
  var referenceIntegrity: Boolean = js.native
  /**
    *
    */
  var target: String = js.native
  /**
    * Removes an object from the list of dirty objects
    * This will prevent that object from being saved to the server on the next save
    *
    * @param object The item to cancel changes on
    */
  def cancelChanging(`object`: js.Any): Unit = js.native
  /**
    * adds an item to the list of dirty items.    This item
    * contains a reference to the item itself as well as a
    * cloned and trimmed version of old item for use with
    * revert.
    *
    * @param item
    * @param _deleting
    */
  def changing(item: js.Any, _deleting: js.Any): Unit = js.native
  /**
    * deletes item and any references to that item from the store.
    *
    * @param item item to delete
    */
  def deleteItem(item: js.Any): Unit = js.native
  /**
    * Gets the constructor for objects from this store
    *
    */
  def getConstructor(): js.Any = js.native
  /**
    * Returns the parent item (or query) for the given item
    *
    * @param item The item to find the parent of
    */
  def getParent(item: js.Any): js.Any = js.native
  /**
    * Will retrieve or create a store using the given options (the same options
    * that are passed to JsonRestStore constructor. Returns a JsonRestStore instance
    *
    * @param options See the JsonRestStore constructor
    * @param Class Constructor to use (for creating stores from JsonRestStore subclasses).This is optional and defaults to JsonRestStore.
    */
  def getStore(options: js.Any, Class: js.Any): Unit = js.native
  /**
    * returns true if the item is marked as dirty.
    *
    * @param item
    */
  def isDirty(item: js.Any): js.Any = js.native
  def isItem(item: js.Object, anyStore: Boolean): js.Any = js.native
  /**
    * adds a new item to the store at the specified point.
    * Takes two parameters, data, and options.
    *
    * @param data The data to be added in as an item.
    * @param parentInfo
    */
  def newItem(data: js.Object, parentInfo: js.Any): js.Any = js.native
  /**
    *
    */
  def onDelete(): Unit = js.native
  /**
    *
    */
  def onNew(): Unit = js.native
  /**
    *
    */
  def onSet(): Unit = js.native
  /**
    * returns any modified data to its original state prior to a save();
    *
    * @param kwArgs global:  This will cause the revert to undo all the changes for all  JsonRestStores in a single operation.
    */
  def revert(kwArgs: js.Any): Unit = js.native
  /**
    * Saves the dirty data using REST Ajax methods. See dojo/data/api/Write for API.
    *
    * @param kwArgs global:  This will cause the save to commit the dirty data for all  JsonRestStores as a single transaction.revertOnError:  This will cause the changes to be reverted if there is an  error on the save. By default a revert is executed unless  a value of false is provide for this parameter.incrementalUpdates:  For items that have been updated, if this is enabled, the server will be sent a POST request  with a JSON object containing the changed properties. By default this is  not enabled, and a PUT is used to deliver an update, and will include a full  serialization of all the properties of the item/object.  If this is true, the POST request body will consist of a JSON object with  only the changed properties. The incrementalUpdates parameter may also  be a function, in which case it will be called with the updated and previous objects  and an object update representation can be returned.alwaysPostNewItems:  If this is true, new items will always be sent with a POST request. By default  this is not enabled, and the JsonRestStore will send a POST request if  the item does not include its identifier (expecting server assigned location/  identifier), and will send a PUT request if the item does include its identifier  (the PUT will be sent to the URI corresponding to the provided identifier).
    */
  def save(kwArgs: js.Any): js.Any = js.native
  /**
    * sets 'attribute' on 'item' to 'value'
    *
    * @param item
    * @param attribute
    * @param value
    */
  def setValue(item: js.Any, attribute: js.Any, value: js.Any): Unit = js.native
  /**
    * sets 'attribute' on 'item' to 'value' value
    * must be an array.
    *
    * @param item
    * @param attribute
    * @param values
    */
  def setValues(item: js.Any, attribute: js.Any, values: js.Any): Unit = js.native
  /**
    * unsets 'attribute' on 'item'
    *
    * @param item
    * @param attribute
    */
  def unsetAttribute(item: js.Any, attribute: js.Any): Unit = js.native
}

