package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ComponentManager")
@js.native
class ComponentManager ()
  extends typings.extjs.Ext.ComponentManager
/* static members */
object ComponentManager {
  
  @JSGlobal("Ext.ComponentManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Ext.util.HashMap) */
  @JSGlobal("Ext.ComponentManager.all")
  @js.native
  def all: IHashMap = js.native
  @scala.inline
  def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.ComponentManager.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.ComponentManager.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.ComponentManager.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.ComponentManager.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.ComponentManager.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.ComponentManager.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Creates a new Component from the specified config object using the config object s xtype to determine the class to in
    * @param config Object A configuration object for the Component you wish to create.
    * @param defaultType String The xtype to use if the config object does not contain a xtype. (Optional if the config contains a xtype).
    * @returns Ext.Component The newly instantiated Component.
    */
  @JSGlobal("Ext.ComponentManager.create")
  @js.native
  def create(): IComponent = js.native
  @JSGlobal("Ext.ComponentManager.create")
  @js.native
  def create(config: js.UndefOr[scala.Nothing], defaultType: java.lang.String): IComponent = js.native
  @JSGlobal("Ext.ComponentManager.create")
  @js.native
  def create(config: js.Any): IComponent = js.native
  @JSGlobal("Ext.ComponentManager.create")
  @js.native
  def create(config: js.Any, defaultType: java.lang.String): IComponent = js.native
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    */
  @JSGlobal("Ext.ComponentManager.each")
  @js.native
  def each(): Unit = js.native
  @JSGlobal("Ext.ComponentManager.each")
  @js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.each")
  @js.native
  def each(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.each")
  @js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Returns an item by id
    * @param id String The id of the item
    * @returns Object The item, undefined if not found.
    */
  @JSGlobal("Ext.ComponentManager.get")
  @js.native
  def get(): js.Any = js.native
  @JSGlobal("Ext.ComponentManager.get")
  @js.native
  def get(id: java.lang.String): js.Any = js.native
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  @JSGlobal("Ext.ComponentManager.getCount")
  @js.native
  def getCount(): Double = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @JSGlobal("Ext.ComponentManager.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.ComponentManager.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.ComponentManager.initConfig")
  @js.native
  def initConfig(): IBase = js.native
  @JSGlobal("Ext.ComponentManager.initConfig")
  @js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up
    * @returns Boolean Whether the type is registered.
    */
  @JSGlobal("Ext.ComponentManager.isRegistered")
  @js.native
  def isRegistered(): Boolean = js.native
  @JSGlobal("Ext.ComponentManager.isRegistered")
  @js.native
  def isRegistered(`type`: java.lang.String): Boolean = js.native
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  @JSGlobal("Ext.ComponentManager.onAvailable")
  @js.native
  def onAvailable(): Unit = js.native
  @JSGlobal("Ext.ComponentManager.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String): Unit = js.native
  @JSGlobal("Ext.ComponentManager.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register
    */
  @JSGlobal("Ext.ComponentManager.register")
  @js.native
  def register(): Unit = js.native
  @JSGlobal("Ext.ComponentManager.register")
  @js.native
  def register(item: js.Any): Unit = js.native
  
  /** [Method] Registers a new item constructor keyed by a type key
    * @param type Object
    * @param cls Object
    */
  @JSGlobal("Ext.ComponentManager.registerType")
  @js.native
  def registerType(): Unit = js.native
  @JSGlobal("Ext.ComponentManager.registerType")
  @js.native
  def registerType(`type`: js.UndefOr[scala.Nothing], cls: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.registerType")
  @js.native
  def registerType(`type`: js.Any): Unit = js.native
  @JSGlobal("Ext.ComponentManager.registerType")
  @js.native
  def registerType(`type`: js.Any, cls: js.Any): Unit = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ComponentManager.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.ComponentManager.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister
    */
  @JSGlobal("Ext.ComponentManager.unregister")
  @js.native
  def unregister(): Unit = js.native
  @JSGlobal("Ext.ComponentManager.unregister")
  @js.native
  def unregister(item: js.Any): Unit = js.native
}
