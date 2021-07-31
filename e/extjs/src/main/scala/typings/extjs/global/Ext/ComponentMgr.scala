package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ComponentMgr")
@js.native
class ComponentMgr ()
  extends StObject
     with typings.extjs.Ext.ComponentMgr
/* static members */
object ComponentMgr {
  
  @JSGlobal("Ext.ComponentMgr")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Ext.util.HashMap) */
  @JSGlobal("Ext.ComponentMgr.all")
  @js.native
  def all: IHashMap = js.native
  @scala.inline
  def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @scala.inline
  def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
  @scala.inline
  def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @scala.inline
  def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
  @scala.inline
  def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @scala.inline
  def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
  @scala.inline
  def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Creates a new Component from the specified config object using the config object s xtype to determine the class to in
    * @param config Object A configuration object for the Component you wish to create.
    * @param defaultType String The xtype to use if the config object does not contain a xtype. (Optional if the config contains a xtype).
    * @returns Ext.Component The newly instantiated Component.
    */
  @scala.inline
  def create(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IComponent]
  @scala.inline
  def create(config: js.Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  @scala.inline
  def create(config: js.Any, defaultType: java.lang.String): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  @scala.inline
  def create(config: Unit, defaultType: java.lang.String): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    */
  @scala.inline
  def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
  @scala.inline
  def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Returns an item by id
    * @param id String The id of the item
    * @returns Object The item, undefined if not found.
    */
  @scala.inline
  def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
  @scala.inline
  def get(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  @scala.inline
  def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @scala.inline
  def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  @scala.inline
  def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @scala.inline
  def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
  @scala.inline
  def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up
    * @returns Boolean Whether the type is registered.
    */
  @scala.inline
  def isRegistered(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")().asInstanceOf[Boolean]
  @scala.inline
  def isRegistered(`type`: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  @scala.inline
  def onAvailable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")().asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register
    */
  @scala.inline
  def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  @scala.inline
  def register(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Registers a new item constructor keyed by a type key
    * @param type Object
    * @param cls Object
    */
  @scala.inline
  def registerType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerType")().asInstanceOf[Unit]
  @scala.inline
  def registerType(`type`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def registerType(`type`: js.Any, cls: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(`type`.asInstanceOf[js.Any], cls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def registerType(`type`: Unit, cls: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(`type`.asInstanceOf[js.Any], cls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ComponentMgr.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @scala.inline
  def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister
    */
  @scala.inline
  def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
  @scala.inline
  def unregister(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
