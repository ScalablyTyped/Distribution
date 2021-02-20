package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.PluginMgr")
@js.native
class PluginMgr ()
  extends typings.extjs.Ext.PluginMgr
/* static members */
object PluginMgr {
  
  @JSGlobal("Ext.PluginMgr")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Ext.util.HashMap) */
  @JSGlobal("Ext.PluginMgr.all")
  @js.native
  def all: IHashMap = js.native
  @scala.inline
  def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.PluginMgr.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.PluginMgr.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.PluginMgr.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.PluginMgr.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.PluginMgr.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.PluginMgr.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Creates a new Plugin from the specified config object using the config object s ptype to determine the class to insta
    * @param config Object A configuration object for the Plugin you wish to create.
    * @param defaultType Function The constructor to provide the default Plugin type if the config object does not contain a ptype. (Optional if the config contains a ptype).
    * @returns Ext.Component The newly instantiated Plugin.
    */
  @JSGlobal("Ext.PluginMgr.create")
  @js.native
  def create(): IComponent = js.native
  @JSGlobal("Ext.PluginMgr.create")
  @js.native
  def create(config: js.UndefOr[scala.Nothing], defaultType: js.Any): IComponent = js.native
  @JSGlobal("Ext.PluginMgr.create")
  @js.native
  def create(config: js.Any): IComponent = js.native
  @JSGlobal("Ext.PluginMgr.create")
  @js.native
  def create(config: js.Any, defaultType: js.Any): IComponent = js.native
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    */
  @JSGlobal("Ext.PluginMgr.each")
  @js.native
  def each(): Unit = js.native
  @JSGlobal("Ext.PluginMgr.each")
  @js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.PluginMgr.each")
  @js.native
  def each(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.PluginMgr.each")
  @js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Returns all plugins registered with the given type
    * @param type String The type to search for
    * @param defaultsOnly Boolean True to only return plugins of this type where the plugin's isDefault property is truthy
    * @returns Ext.AbstractPlugin[] All matching plugins
    */
  @JSGlobal("Ext.PluginMgr.findByType")
  @js.native
  def findByType(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.PluginMgr.findByType")
  @js.native
  def findByType(`type`: js.UndefOr[scala.Nothing], defaultsOnly: Boolean): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.PluginMgr.findByType")
  @js.native
  def findByType(`type`: java.lang.String): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.PluginMgr.findByType")
  @js.native
  def findByType(`type`: java.lang.String, defaultsOnly: Boolean): typings.extjs.Ext.Array = js.native
  
  /** [Method] Returns an item by id
    * @param id String The id of the item
    * @returns Object The item, undefined if not found.
    */
  @JSGlobal("Ext.PluginMgr.get")
  @js.native
  def get(): js.Any = js.native
  @JSGlobal("Ext.PluginMgr.get")
  @js.native
  def get(id: java.lang.String): js.Any = js.native
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  @JSGlobal("Ext.PluginMgr.getCount")
  @js.native
  def getCount(): Double = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @JSGlobal("Ext.PluginMgr.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.PluginMgr.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.PluginMgr.initConfig")
  @js.native
  def initConfig(): IBase = js.native
  @JSGlobal("Ext.PluginMgr.initConfig")
  @js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up
    * @returns Boolean Whether the type is registered.
    */
  @JSGlobal("Ext.PluginMgr.isRegistered")
  @js.native
  def isRegistered(): Boolean = js.native
  @JSGlobal("Ext.PluginMgr.isRegistered")
  @js.native
  def isRegistered(`type`: java.lang.String): Boolean = js.native
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  @JSGlobal("Ext.PluginMgr.onAvailable")
  @js.native
  def onAvailable(): Unit = js.native
  @JSGlobal("Ext.PluginMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.PluginMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.PluginMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.PluginMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String): Unit = js.native
  @JSGlobal("Ext.PluginMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.PluginMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.PluginMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register
    */
  @JSGlobal("Ext.PluginMgr.register")
  @js.native
  def register(): Unit = js.native
  @JSGlobal("Ext.PluginMgr.register")
  @js.native
  def register(item: js.Any): Unit = js.native
  
  /** [Method] Registers a new item constructor keyed by a type key
    * @param type String The mnemonic string by which the class may be looked up.
    * @param cls Function The new instance class.
    */
  @JSGlobal("Ext.PluginMgr.registerType")
  @js.native
  def registerType(): Unit = js.native
  @JSGlobal("Ext.PluginMgr.registerType")
  @js.native
  def registerType(`type`: js.UndefOr[scala.Nothing], cls: js.Any): Unit = js.native
  @JSGlobal("Ext.PluginMgr.registerType")
  @js.native
  def registerType(`type`: java.lang.String): Unit = js.native
  @JSGlobal("Ext.PluginMgr.registerType")
  @js.native
  def registerType(`type`: java.lang.String, cls: js.Any): Unit = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.PluginMgr.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.PluginMgr.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister
    */
  @JSGlobal("Ext.PluginMgr.unregister")
  @js.native
  def unregister(): Unit = js.native
  @JSGlobal("Ext.PluginMgr.unregister")
  @js.native
  def unregister(item: js.Any): Unit = js.native
}
