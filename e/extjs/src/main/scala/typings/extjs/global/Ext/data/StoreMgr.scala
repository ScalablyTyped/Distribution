package typings.extjs.global.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.StoreMgr")
@js.native
class StoreMgr ()
  extends typings.extjs.Ext.data.StoreMgr

/* static members */
@JSGlobal("Ext.data.StoreMgr")
@js.native
object StoreMgr extends js.Object {
  /** [Property] (Object) */
  var hasListeners: js.Any = js.native
  /** [Property] (Boolean) */
  var isMixedCollection: Boolean = js.native
  /** [Property] (Boolean) */
  var isObservable: Boolean = js.native
  /** [Property] (Boolean) */
  var isSortable: Boolean = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (Ext.util.MixedCollection) */
  var sorters: IMixedCollection = js.native
  /** [Method] Adds an item to the collection
    * @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param obj Object The item to add.
    * @returns Object The item added.
    */
  def add(): js.Any = js.native
  def add(key: js.Any): js.Any = js.native
  def add(key: js.Any, obj: js.Any): js.Any = js.native
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
    */
  def addAll(): Unit = js.native
  def addAll(objs: js.Any): Unit = js.native
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  def addEvents(): Unit = js.native
  def addEvents(eventNames: js.Any): Unit = js.native
  /** [Method] Appends an event handler to this object
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  def addListener(): js.Any = js.native
  def addListener(eventName: js.Any): js.Any = js.native
  def addListener(eventName: js.Any, fn: js.Any): js.Any = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  def addManagedListener(): js.Any = js.native
  def addManagedListener(item: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Removes all items from the collection  */
  def clear(): Unit = js.native
  /** [Method] Removes all listeners for this object including the managed listeners */
  def clearListeners(): Unit = js.native
  /** [Method] Removes all managed listeners for this object  */
  def clearManagedListeners(): Unit = js.native
  /** [Method] Collects unique values of a particular property in this MixedCollection
    * @param property String The property to collect on
    * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
    * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
    * @returns Array The unique values
    */
  def collect(): Array = js.native
  def collect(property: String): Array = js.native
  def collect(property: String, root: String): Array = js.native
  def collect(property: String, root: String, allowBlank: Boolean): Array = js.native
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param o Object The Object to look for in the collection.
    * @returns Boolean True if the collection contains the Object as an item.
    */
  def contains(): Boolean = js.native
  def contains(o: js.Any): Boolean = js.native
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean True if the collection contains the Object as a key.
    */
  def containsKey(): Boolean = js.native
  def containsKey(key: String): Boolean = js.native
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  def each(): Unit = js.native
  def each(fn: js.Any): Unit = js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  def eachKey(): Unit = js.native
  def eachKey(fn: js.Any): Unit = js.native
  def eachKey(fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  def enableBubble(): Unit = js.native
  def enableBubble(eventNames: js.Any): Unit = js.native
  /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
    * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
    * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
    * @param anyMatch Boolean True to match any part of the string, not just the beginning
    * @param caseSensitive Boolean True for case sensitive comparison.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  def filter(): IMixedCollection = js.native
  def filter(property: js.Any): IMixedCollection = js.native
  def filter(property: js.Any, value: js.Any): IMixedCollection = js.native
  def filter(property: js.Any, value: js.Any, anyMatch: Boolean): IMixedCollection = js.native
  def filter(property: js.Any, value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  def filterBy(): IMixedCollection = js.native
  def filterBy(fn: js.Any): IMixedCollection = js.native
  def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = js.native
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
  def find(): Unit = js.native
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
    */
  def findBy(): js.Any = js.native
  def findBy(fn: js.Any): js.Any = js.native
  def findBy(fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Finds the index of the first matching object in this collection by a specific property value
    * @param property String The name of a property on your objects.
    * @param value String/RegExp A string that the property values should start with or a RegExp to test against the property.
    * @param start Number The index to start searching at.
    * @param anyMatch Boolean True to match any part of the string, not just the beginning.
    * @param caseSensitive Boolean True for case sensitive comparison.
    * @returns Number The matched index or -1
    */
  def findIndex(): Double = js.native
  def findIndex(property: String): Double = js.native
  def findIndex(property: String, value: js.Any): Double = js.native
  def findIndex(property: String, value: js.Any, start: Double): Double = js.native
  def findIndex(property: String, value: js.Any, start: Double, anyMatch: Boolean): Double = js.native
  def findIndex(property: String, value: js.Any, start: Double, anyMatch: Boolean, caseSensitive: Boolean): Double = js.native
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index or -1
    */
  def findIndexBy(): Double = js.native
  def findIndexBy(fn: js.Any): Double = js.native
  def findIndexBy(fn: js.Any, scope: js.Any): Double = js.native
  def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = js.native
  /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
    * @param newItem Object The new object to find the insertion position of.
    * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
    * @returns Number The insertion point to add the new item into this MixedCollection at using insert
    */
  def findInsertionIndex(): Double = js.native
  def findInsertionIndex(newItem: js.Any): Double = js.native
  def findInsertionIndex(newItem: js.Any, sorterFn: js.Any): Double = js.native
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  def fireEvent(eventName: String, args: js.Any*): Boolean = js.native
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  def fireEventArgs(): Boolean = js.native
  def fireEventArgs(eventName: String): Boolean = js.native
  def fireEventArgs(eventName: String, args: Array): Boolean = js.native
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection..
    */
  def first(): js.Any = js.native
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  def generateComparator(): Unit = js.native
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  def get(): js.Any = js.native
  def get(key: js.Any): js.Any = js.native
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  def getAt(): js.Any = js.native
  def getAt(index: Double): js.Any = js.native
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  def getByKey(): js.Any = js.native
  def getByKey(key: js.Any): js.Any = js.native
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  def getCount(): Double = js.native
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
    * @returns Ext.util.Sorter The sorter, null if none exist
    */
  def getFirstSorter(): ISorter = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] getKey implementation for MixedCollection
    * @param o Object
    * @returns Object The key for the passed item.
    */
  def getKey(): js.Any = js.native
  def getKey(o: js.Any): js.Any = js.native
  /** [Method] Returns a range of items in this collection
    * @param startIndex Number The starting index. Defaults to 0.
    * @param endIndex Number The ending index. Defaults to the last item.
    * @returns Array An array of items
    */
  def getRange(): Array = js.native
  def getRange(startIndex: Double): Array = js.native
  def getRange(startIndex: Double, endIndex: Double): Array = js.native
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  def hasListener(): Boolean = js.native
  def hasListener(eventName: String): Boolean = js.native
  /** [Method] Returns index within the collection of the passed Object
    * @param o Object The item to find the index of.
    * @returns Number index of the item. Returns -1 if not found.
    */
  def indexOf(): Double = js.native
  def indexOf(o: js.Any): Double = js.native
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number index of the key.
    */
  def indexOfKey(): Double = js.native
  def indexOfKey(key: String): Double = js.native
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Performs initialization of this mixin  */
  def initSortable(): Unit = js.native
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
    * @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
    * @returns Object The item inserted or an array of items inserted.
    */
  def insert(): js.Any = js.native
  def insert(index: Double): js.Any = js.native
  def insert(index: Double, key: js.Any): js.Any = js.native
  def insert(index: Double, key: js.Any, o: js.Any): js.Any = js.native
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection..
    */
  def last(): js.Any = js.native
  /** [Method] Gets a registered Store by id
    * @param store String/Object The id of the Store, or a Store instance, or a store configuration
    * @returns Ext.data.Store
    */
  def lookup(): IStore = js.native
  def lookup(store: js.Any): IStore = js.native
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  def mon(): js.Any = js.native
  def mon(item: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  def mun(): Unit = js.native
  def mun(item: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  def on(): js.Any = js.native
  def on(eventName: js.Any): js.Any = js.native
  def on(eventName: js.Any, fn: js.Any): js.Any = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  /** [Method] Registers one or more Stores with the StoreManager
    * @param stores Ext.data.Store... Any number of Store instances
    */
  def register(stores: IStore): Unit = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  def relayEvents(): js.Any = js.native
  def relayEvents(origin: js.Any): js.Any = js.native
  def relayEvents(origin: js.Any, events: Array): js.Any = js.native
  def relayEvents(origin: js.Any, events: Array, prefix: String): js.Any = js.native
  /** [Method] Remove an item from the collection
    * @param o Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  def remove(): js.Any = js.native
  def remove(o: js.Any): js.Any = js.native
  /** [Method] Remove all items in the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  def removeAll(): IMixedCollection = js.native
  def removeAll(items: Array): IMixedCollection = js.native
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  def removeAt(): js.Any = js.native
  def removeAt(index: Double): js.Any = js.native
  /** [Method] Removes an item associated with the passed key fom the collection
    * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
    * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
    */
  def removeAtKey(): js.Any = js.native
  def removeAtKey(key: String): js.Any = js.native
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  def removeListener(): Unit = js.native
  def removeListener(eventName: String): Unit = js.native
  def removeListener(eventName: String, fn: js.Any): Unit = js.native
  def removeListener(eventName: String, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  def removeManagedListener(): Unit = js.native
  def removeManagedListener(item: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Remove a range of items starting at a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @param removeCount Number The nuber of items to remove beginning at the specified index.
    * @returns Object The last item removed or false if no item was removed.
    */
  def removeRange(): js.Any = js.native
  def removeRange(index: Double): js.Any = js.native
  def removeRange(index: Double, removeCount: Double): js.Any = js.native
  /** [Method] Reorders each of the items based on a mapping from old index to new index
    * @param mapping Object Mapping from old item index to new item index
    */
  def reorder(): Unit = js.native
  def reorder(mapping: js.Any): Unit = js.native
  /** [Method] Replaces an item in the collection
    * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  def replace(): js.Any = js.native
  def replace(key: String): js.Any = js.native
  def replace(key: String, o: js.Any): js.Any = js.native
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  def resumeEvent(eventName: js.Any*): Unit = js.native
  /** [Method] Resumes firing events see suspendEvents */
  def resumeEvents(): Unit = js.native
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  def sort(): Array = js.native
  def sort(sorters: js.Any): Array = js.native
  def sort(sorters: js.Any, direction: String): Array = js.native
  /** [Method] Sorts the collection by a single sorter function
    * @param sorterFn Function The function to sort by
    */
  def sortBy(): Unit = js.native
  def sortBy(sorterFn: js.Any): Unit = js.native
  /** [Method] Sorts this collection by keys
    * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
    * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
    */
  def sortByKey(): Unit = js.native
  def sortByKey(direction: String): Unit = js.native
  def sortByKey(direction: String, fn: js.Any): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
  /** [Method] Collects all of the values of the given property and returns their sum
    * @param property String The property to sum by
    * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
    * @param start Number The record index to start at
    * @param end Number The record index to end at
    * @returns Number The total
    */
  def sum(): Double = js.native
  def sum(property: String): Double = js.native
  def sum(property: String, root: String): Double = js.native
  def sum(property: String, root: String, start: Double): Double = js.native
  def sum(property: String, root: String, start: Double, end: Double): Double = js.native
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  def suspendEvent(eventName: js.Any*): Unit = js.native
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  def suspendEvents(): Unit = js.native
  def suspendEvents(queueSuspended: Boolean): Unit = js.native
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  def un(): Unit = js.native
  def un(eventName: String): Unit = js.native
  def un(eventName: String, fn: js.Any): Unit = js.native
  def un(eventName: String, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Unregisters one or more Stores with the StoreManager
    * @param stores String/Object... Any number of Store instances or ID-s
    */
  def unregister(): Unit = js.native
  def unregister(stores: js.Any): Unit = js.native
  /** [Method] Change the key for an existing item in the collection
    * @param oldKey Object The old key
    * @param newKey Object The new key
    */
  def updateKey(): Unit = js.native
  def updateKey(oldKey: js.Any): Unit = js.native
  def updateKey(oldKey: js.Any, newKey: js.Any): Unit = js.native
}

