package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.ISorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.StoreMgr")
@js.native
class StoreMgr ()
  extends typings.extjs.Ext.StoreMgr
/* static members */
object StoreMgr {
  
  @JSGlobal("Ext.StoreMgr")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Adds an item to the collection
    * @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param obj Object The item to add.
    * @returns Object The item added.
    */
  @JSGlobal("Ext.StoreMgr.add")
  @js.native
  def add(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.add")
  @js.native
  def add(key: js.UndefOr[scala.Nothing], obj: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.add")
  @js.native
  def add(key: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.add")
  @js.native
  def add(key: js.Any, obj: js.Any): js.Any = js.native
  
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
    */
  @JSGlobal("Ext.StoreMgr.addAll")
  @js.native
  def addAll(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addAll")
  @js.native
  def addAll(objs: js.Any): Unit = js.native
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  @JSGlobal("Ext.StoreMgr.addEvents")
  @js.native
  def addEvents(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addEvents")
  @js.native
  def addEvents(eventNames: js.Any): Unit = js.native
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(
    eventName: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.Any,
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.StoreMgr.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.StoreMgr.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.StoreMgr.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Removes all items from the collection  */
  @JSGlobal("Ext.StoreMgr.clear")
  @js.native
  def clear(): Unit = js.native
  
  /** [Method] Removes all listeners for this object including the managed listeners */
  @JSGlobal("Ext.StoreMgr.clearListeners")
  @js.native
  def clearListeners(): Unit = js.native
  
  /** [Method] Removes all managed listeners for this object  */
  @JSGlobal("Ext.StoreMgr.clearManagedListeners")
  @js.native
  def clearManagedListeners(): Unit = js.native
  
  /** [Method] Collects unique values of a particular property in this MixedCollection
    * @param property String The property to collect on
    * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
    * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
    * @returns Array The unique values
    */
  @JSGlobal("Ext.StoreMgr.collect")
  @js.native
  def collect(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.collect")
  @js.native
  def collect(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], allowBlank: Boolean): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.collect")
  @js.native
  def collect(property: js.UndefOr[scala.Nothing], root: java.lang.String): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.collect")
  @js.native
  def collect(property: js.UndefOr[scala.Nothing], root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.collect")
  @js.native
  def collect(property: java.lang.String): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.collect")
  @js.native
  def collect(property: java.lang.String, root: js.UndefOr[scala.Nothing], allowBlank: Boolean): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.collect")
  @js.native
  def collect(property: java.lang.String, root: java.lang.String): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.collect")
  @js.native
  def collect(property: java.lang.String, root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = js.native
  
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param o Object The Object to look for in the collection.
    * @returns Boolean True if the collection contains the Object as an item.
    */
  @JSGlobal("Ext.StoreMgr.contains")
  @js.native
  def contains(): Boolean = js.native
  @JSGlobal("Ext.StoreMgr.contains")
  @js.native
  def contains(o: js.Any): Boolean = js.native
  
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean True if the collection contains the Object as a key.
    */
  @JSGlobal("Ext.StoreMgr.containsKey")
  @js.native
  def containsKey(): Boolean = js.native
  @JSGlobal("Ext.StoreMgr.containsKey")
  @js.native
  def containsKey(key: java.lang.String): Boolean = js.native
  
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  @JSGlobal("Ext.StoreMgr.each")
  @js.native
  def each(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.each")
  @js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.each")
  @js.native
  def each(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.each")
  @js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  @JSGlobal("Ext.StoreMgr.eachKey")
  @js.native
  def eachKey(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.eachKey")
  @js.native
  def eachKey(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.eachKey")
  @js.native
  def eachKey(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.eachKey")
  @js.native
  def eachKey(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  @JSGlobal("Ext.StoreMgr.enableBubble")
  @js.native
  def enableBubble(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.enableBubble")
  @js.native
  def enableBubble(eventNames: js.Any): Unit = js.native
  
  /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
    * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
    * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
    * @param anyMatch Boolean True to match any part of the string, not just the beginning
    * @param caseSensitive Boolean True for case sensitive comparison.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], anyMatch: Boolean): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.UndefOr[scala.Nothing], value: js.Any): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(
    property: js.UndefOr[scala.Nothing],
    value: js.Any,
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: Boolean): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(
    property: js.Any,
    value: js.UndefOr[scala.Nothing],
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: Boolean): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.Any): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.Any, anyMatch: js.UndefOr[scala.Nothing], caseSensitive: Boolean): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.Any, anyMatch: Boolean): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
  
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  @JSGlobal("Ext.StoreMgr.filterBy")
  @js.native
  def filterBy(): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filterBy")
  @js.native
  def filterBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filterBy")
  @js.native
  def filterBy(fn: js.Any): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filterBy")
  @js.native
  def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = js.native
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
  @JSGlobal("Ext.StoreMgr.find")
  @js.native
  def find(): Unit = js.native
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
    */
  @JSGlobal("Ext.StoreMgr.findBy")
  @js.native
  def findBy(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.findBy")
  @js.native
  def findBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.findBy")
  @js.native
  def findBy(fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.findBy")
  @js.native
  def findBy(fn: js.Any, scope: js.Any): js.Any = js.native
  
  /** [Method] Finds the index of the first matching object in this collection by a specific property value
    * @param property String The name of a property on your objects.
    * @param value String/RegExp A string that the property values should start with or a RegExp to test against the property.
    * @param start Number The index to start searching at.
    * @param anyMatch Boolean True to match any part of the string, not just the beginning.
    * @param caseSensitive Boolean True for case sensitive comparison.
    * @returns Number The matched index or -1
    */
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    anyMatch: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    start: Double,
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    start: Double,
    anyMatch: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    start: Double,
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.Any,
    start: js.UndefOr[scala.Nothing],
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.Any,
    start: js.UndefOr[scala.Nothing],
    anyMatch: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.Any,
    start: js.UndefOr[scala.Nothing],
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any, start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.Any,
    start: Double,
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any, start: Double, anyMatch: Boolean): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: js.UndefOr[scala.Nothing],
    value: js.Any,
    start: Double,
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: java.lang.String): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    anyMatch: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: java.lang.String, value: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.UndefOr[scala.Nothing],
    start: Double,
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: java.lang.String, value: js.UndefOr[scala.Nothing], start: Double, anyMatch: Boolean): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.UndefOr[scala.Nothing],
    start: Double,
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: java.lang.String, value: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.Any,
    start: js.UndefOr[scala.Nothing],
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: java.lang.String, value: js.Any, start: js.UndefOr[scala.Nothing], anyMatch: Boolean): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.Any,
    start: js.UndefOr[scala.Nothing],
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: java.lang.String, value: js.Any, start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.Any,
    start: Double,
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(property: java.lang.String, value: js.Any, start: Double, anyMatch: Boolean): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndex")
  @js.native
  def findIndex(
    property: java.lang.String,
    value: js.Any,
    start: Double,
    anyMatch: Boolean,
    caseSensitive: Boolean
  ): Double = js.native
  
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index or -1
    */
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any, start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.Any, scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.Any, scope: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = js.native
  
  /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
    * @param newItem Object The new object to find the insertion position of.
    * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
    * @returns Number The insertion point to add the new item into this MixedCollection at using insert
    */
  @JSGlobal("Ext.StoreMgr.findInsertionIndex")
  @js.native
  def findInsertionIndex(): Double = js.native
  @JSGlobal("Ext.StoreMgr.findInsertionIndex")
  @js.native
  def findInsertionIndex(newItem: js.UndefOr[scala.Nothing], sorterFn: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findInsertionIndex")
  @js.native
  def findInsertionIndex(newItem: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findInsertionIndex")
  @js.native
  def findInsertionIndex(newItem: js.Any, sorterFn: js.Any): Double = js.native
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  @JSGlobal("Ext.StoreMgr.fireEvent")
  @js.native
  def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
  
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  @JSGlobal("Ext.StoreMgr.fireEventArgs")
  @js.native
  def fireEventArgs(): Boolean = js.native
  @JSGlobal("Ext.StoreMgr.fireEventArgs")
  @js.native
  def fireEventArgs(eventName: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): Boolean = js.native
  @JSGlobal("Ext.StoreMgr.fireEventArgs")
  @js.native
  def fireEventArgs(eventName: java.lang.String): Boolean = js.native
  @JSGlobal("Ext.StoreMgr.fireEventArgs")
  @js.native
  def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = js.native
  
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection..
    */
  @JSGlobal("Ext.StoreMgr.first")
  @js.native
  def first(): js.Any = js.native
  
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  @JSGlobal("Ext.StoreMgr.generateComparator")
  @js.native
  def generateComparator(): Unit = js.native
  
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  @JSGlobal("Ext.StoreMgr.get")
  @js.native
  def get(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.get")
  @js.native
  def get(key: js.Any): js.Any = js.native
  
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  @JSGlobal("Ext.StoreMgr.getAt")
  @js.native
  def getAt(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.getAt")
  @js.native
  def getAt(index: Double): js.Any = js.native
  
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  @JSGlobal("Ext.StoreMgr.getByKey")
  @js.native
  def getByKey(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.getByKey")
  @js.native
  def getByKey(key: js.Any): js.Any = js.native
  
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  @JSGlobal("Ext.StoreMgr.getCount")
  @js.native
  def getCount(): Double = js.native
  
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
    * @returns Ext.util.Sorter The sorter, null if none exist
    */
  @JSGlobal("Ext.StoreMgr.getFirstSorter")
  @js.native
  def getFirstSorter(): ISorter = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @JSGlobal("Ext.StoreMgr.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] getKey implementation for MixedCollection
    * @param o Object
    * @returns Object The key for the passed item.
    */
  @JSGlobal("Ext.StoreMgr.getKey")
  @js.native
  def getKey(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.getKey")
  @js.native
  def getKey(o: js.Any): js.Any = js.native
  
  /** [Method] Returns a range of items in this collection
    * @param startIndex Number The starting index. Defaults to 0.
    * @param endIndex Number The ending index. Defaults to the last item.
    * @returns Array An array of items
    */
  @JSGlobal("Ext.StoreMgr.getRange")
  @js.native
  def getRange(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.getRange")
  @js.native
  def getRange(startIndex: js.UndefOr[scala.Nothing], endIndex: Double): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.getRange")
  @js.native
  def getRange(startIndex: Double): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.getRange")
  @js.native
  def getRange(startIndex: Double, endIndex: Double): typings.extjs.Ext.Array = js.native
  
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  @JSGlobal("Ext.StoreMgr.hasListener")
  @js.native
  def hasListener(): Boolean = js.native
  @JSGlobal("Ext.StoreMgr.hasListener")
  @js.native
  def hasListener(eventName: java.lang.String): Boolean = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreMgr.hasListeners")
  @js.native
  def hasListeners: js.Any = js.native
  @scala.inline
  def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns index within the collection of the passed Object
    * @param o Object The item to find the index of.
    * @returns Number index of the item. Returns -1 if not found.
    */
  @JSGlobal("Ext.StoreMgr.indexOf")
  @js.native
  def indexOf(): Double = js.native
  @JSGlobal("Ext.StoreMgr.indexOf")
  @js.native
  def indexOf(o: js.Any): Double = js.native
  
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number index of the key.
    */
  @JSGlobal("Ext.StoreMgr.indexOfKey")
  @js.native
  def indexOfKey(): Double = js.native
  @JSGlobal("Ext.StoreMgr.indexOfKey")
  @js.native
  def indexOfKey(key: java.lang.String): Double = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.StoreMgr.initConfig")
  @js.native
  def initConfig(): IBase = js.native
  @JSGlobal("Ext.StoreMgr.initConfig")
  @js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Performs initialization of this mixin  */
  @JSGlobal("Ext.StoreMgr.initSortable")
  @js.native
  def initSortable(): Unit = js.native
  
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
    * @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
    * @returns Object The item inserted or an array of items inserted.
    */
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: js.UndefOr[scala.Nothing], key: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: js.UndefOr[scala.Nothing], key: js.Any, o: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: Double): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: Double, key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: Double, key: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: Double, key: js.Any, o: js.Any): js.Any = js.native
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.isMixedCollection")
  @js.native
  def isMixedCollection: Boolean = js.native
  @scala.inline
  def isMixedCollection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMixedCollection")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.isObservable")
  @js.native
  def isObservable: Boolean = js.native
  @scala.inline
  def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.isSortable")
  @js.native
  def isSortable: Boolean = js.native
  @scala.inline
  def isSortable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection..
    */
  @JSGlobal("Ext.StoreMgr.last")
  @js.native
  def last(): js.Any = js.native
  
  /** [Method] Gets a registered Store by id
    * @param store String/Object The id of the Store, or a Store instance, or a store configuration
    * @returns Ext.data.Store
    */
  @JSGlobal("Ext.StoreMgr.lookup")
  @js.native
  def lookup(): IStore = js.native
  @JSGlobal("Ext.StoreMgr.lookup")
  @js.native
  def lookup(store: js.Any): IStore = js.native
  
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(
    item: js.Any,
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.Any, ename: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.mun")
  @js.native
  def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(
    eventName: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.on")
  @js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Registers one or more Stores with the StoreManager
    * @param stores Ext.data.Store... Any number of Store instances
    */
  @JSGlobal("Ext.StoreMgr.register")
  @js.native
  def register(stores: IStore): Unit = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  @JSGlobal("Ext.StoreMgr.relayEvents")
  @js.native
  def relayEvents(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.relayEvents")
  @js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.relayEvents")
  @js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.relayEvents")
  @js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.relayEvents")
  @js.native
  def relayEvents(origin: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.relayEvents")
  @js.native
  def relayEvents(origin: js.Any, events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.relayEvents")
  @js.native
  def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.relayEvents")
  @js.native
  def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
  
  /** [Method] Remove an item from the collection
    * @param o Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  @JSGlobal("Ext.StoreMgr.remove")
  @js.native
  def remove(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.remove")
  @js.native
  def remove(o: js.Any): js.Any = js.native
  
  /** [Method] Remove all items in the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  @JSGlobal("Ext.StoreMgr.removeAll")
  @js.native
  def removeAll(): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.removeAll")
  @js.native
  def removeAll(items: typings.extjs.Ext.Array): IMixedCollection = js.native
  
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  @JSGlobal("Ext.StoreMgr.removeAt")
  @js.native
  def removeAt(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.removeAt")
  @js.native
  def removeAt(index: Double): js.Any = js.native
  
  /** [Method] Removes an item associated with the passed key fom the collection
    * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
    * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
    */
  @JSGlobal("Ext.StoreMgr.removeAtKey")
  @js.native
  def removeAtKey(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.removeAtKey")
  @js.native
  def removeAtKey(key: java.lang.String): js.Any = js.native
  
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  @JSGlobal("Ext.StoreMgr.removeListener")
  @js.native
  def removeListener(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeListener")
  @js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeListener")
  @js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeListener")
  @js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeListener")
  @js.native
  def removeListener(eventName: java.lang.String): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeListener")
  @js.native
  def removeListener(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeListener")
  @js.native
  def removeListener(eventName: java.lang.String, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeListener")
  @js.native
  def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Remove a range of items starting at a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @param removeCount Number The nuber of items to remove beginning at the specified index.
    * @returns Object The last item removed or false if no item was removed.
    */
  @JSGlobal("Ext.StoreMgr.removeRange")
  @js.native
  def removeRange(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.removeRange")
  @js.native
  def removeRange(index: js.UndefOr[scala.Nothing], removeCount: Double): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.removeRange")
  @js.native
  def removeRange(index: Double): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.removeRange")
  @js.native
  def removeRange(index: Double, removeCount: Double): js.Any = js.native
  
  /** [Method] Reorders each of the items based on a mapping from old index to new index
    * @param mapping Object Mapping from old item index to new item index
    */
  @JSGlobal("Ext.StoreMgr.reorder")
  @js.native
  def reorder(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.reorder")
  @js.native
  def reorder(mapping: js.Any): Unit = js.native
  
  /** [Method] Replaces an item in the collection
    * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  @JSGlobal("Ext.StoreMgr.replace")
  @js.native
  def replace(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.replace")
  @js.native
  def replace(key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.replace")
  @js.native
  def replace(key: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.replace")
  @js.native
  def replace(key: java.lang.String, o: js.Any): js.Any = js.native
  
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  @JSGlobal("Ext.StoreMgr.resumeEvent")
  @js.native
  def resumeEvent(eventName: js.Any*): Unit = js.native
  
  /** [Method] Resumes firing events see suspendEvents */
  @JSGlobal("Ext.StoreMgr.resumeEvents")
  @js.native
  def resumeEvents(): Unit = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.StoreMgr.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  @JSGlobal("Ext.StoreMgr.sort")
  @js.native
  def sort(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.sort")
  @js.native
  def sort(sorters: js.UndefOr[scala.Nothing], direction: java.lang.String): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.sort")
  @js.native
  def sort(sorters: js.Any): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.sort")
  @js.native
  def sort(sorters: js.Any, direction: java.lang.String): typings.extjs.Ext.Array = js.native
  
  /** [Method] Sorts the collection by a single sorter function
    * @param sorterFn Function The function to sort by
    */
  @JSGlobal("Ext.StoreMgr.sortBy")
  @js.native
  def sortBy(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.sortBy")
  @js.native
  def sortBy(sorterFn: js.Any): Unit = js.native
  
  /** [Method] Sorts this collection by keys
    * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
    * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
    */
  @JSGlobal("Ext.StoreMgr.sortByKey")
  @js.native
  def sortByKey(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.sortByKey")
  @js.native
  def sortByKey(direction: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.sortByKey")
  @js.native
  def sortByKey(direction: java.lang.String): Unit = js.native
  @JSGlobal("Ext.StoreMgr.sortByKey")
  @js.native
  def sortByKey(direction: java.lang.String, fn: js.Any): Unit = js.native
  
  /** [Property] (Ext.util.MixedCollection) */
  @JSGlobal("Ext.StoreMgr.sorters")
  @js.native
  def sorters: IMixedCollection = js.native
  @scala.inline
  def sorters_=(x: IMixedCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorters")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.StoreMgr.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Collects all of the values of the given property and returns their sum
    * @param property String The property to sum by
    * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
    * @param start Number The record index to start at
    * @param end Number The record index to end at
    * @returns Number The total
    */
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(
    property: js.UndefOr[scala.Nothing],
    root: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    end: Double
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], start: Double, end: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(
    property: js.UndefOr[scala.Nothing],
    root: java.lang.String,
    start: js.UndefOr[scala.Nothing],
    end: Double
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String, start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String, start: Double, end: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: java.lang.String): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(
    property: java.lang.String,
    root: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    end: Double
  ): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: java.lang.String, root: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: java.lang.String, root: js.UndefOr[scala.Nothing], start: Double, end: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: java.lang.String, root: java.lang.String): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: java.lang.String, root: java.lang.String, start: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: java.lang.String, root: java.lang.String, start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.sum")
  @js.native
  def sum(property: java.lang.String, root: java.lang.String, start: Double, end: Double): Double = js.native
  
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  @JSGlobal("Ext.StoreMgr.suspendEvent")
  @js.native
  def suspendEvent(eventName: js.Any*): Unit = js.native
  
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  @JSGlobal("Ext.StoreMgr.suspendEvents")
  @js.native
  def suspendEvents(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.suspendEvents")
  @js.native
  def suspendEvents(queueSuspended: Boolean): Unit = js.native
  
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  @JSGlobal("Ext.StoreMgr.un")
  @js.native
  def un(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.un")
  @js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.un")
  @js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.un")
  @js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.un")
  @js.native
  def un(eventName: java.lang.String): Unit = js.native
  @JSGlobal("Ext.StoreMgr.un")
  @js.native
  def un(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.un")
  @js.native
  def un(eventName: java.lang.String, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.un")
  @js.native
  def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Unregisters one or more Stores with the StoreManager
    * @param stores String/Object... Any number of Store instances or ID-s
    */
  @JSGlobal("Ext.StoreMgr.unregister")
  @js.native
  def unregister(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.unregister")
  @js.native
  def unregister(stores: js.Any): Unit = js.native
  
  /** [Method] Change the key for an existing item in the collection
    * @param oldKey Object The old key
    * @param newKey Object The new key
    */
  @JSGlobal("Ext.StoreMgr.updateKey")
  @js.native
  def updateKey(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.updateKey")
  @js.native
  def updateKey(oldKey: js.UndefOr[scala.Nothing], newKey: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.updateKey")
  @js.native
  def updateKey(oldKey: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.updateKey")
  @js.native
  def updateKey(oldKey: js.Any, newKey: js.Any): Unit = js.native
}
