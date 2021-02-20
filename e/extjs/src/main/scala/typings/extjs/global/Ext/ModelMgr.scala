package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ModelMgr")
@js.native
class ModelMgr ()
  extends typings.extjs.Ext.ModelMgr
/* static members */
object ModelMgr {
  
  @JSGlobal("Ext.ModelMgr")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Ext.util.HashMap) */
  @JSGlobal("Ext.ModelMgr.all")
  @js.native
  def all: IHashMap = js.native
  @scala.inline
  def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.data.association.Association[]) */
  @JSGlobal("Ext.ModelMgr.associationStack")
  @js.native
  def associationStack: typings.extjs.Ext.Array = js.native
  @scala.inline
  def associationStack_=(x: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("associationStack")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.ModelMgr.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.ModelMgr.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.ModelMgr.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Creates a new instance of a Model using the given data
    * @param data Object Data to initialize the Model's fields with
    * @param name String The name of the model to create
    * @param id Number unique id of the Model instance (see Ext.data.Model)
    */
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], id: Double): Unit = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.UndefOr[scala.Nothing], name: java.lang.String): Unit = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.UndefOr[scala.Nothing], name: java.lang.String, id: Double): Unit = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.Any, name: js.UndefOr[scala.Nothing], id: Double): Unit = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.Any, name: java.lang.String): Unit = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.Any, name: java.lang.String, id: Double): Unit = js.native
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    */
  @JSGlobal("Ext.ModelMgr.each")
  @js.native
  def each(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.each")
  @js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.each")
  @js.native
  def each(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.each")
  @js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Returns an item by id
    * @param id String The id of the item
    * @returns Object The item, undefined if not found.
    */
  @JSGlobal("Ext.ModelMgr.get")
  @js.native
  def get(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.get")
  @js.native
  def get(id: java.lang.String): js.Any = js.native
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  @JSGlobal("Ext.ModelMgr.getCount")
  @js.native
  def getCount(): Double = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @JSGlobal("Ext.ModelMgr.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Returns the Ext data Model class for a given model name
    * @param id String/Object The classname of the model or the model class itself.
    * @returns Ext.data.Model a model class.
    */
  @JSGlobal("Ext.ModelMgr.getModel")
  @js.native
  def getModel(): IModel = js.native
  @JSGlobal("Ext.ModelMgr.getModel")
  @js.native
  def getModel(id: js.Any): IModel = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.ModelMgr.initConfig")
  @js.native
  def initConfig(): IBase = js.native
  @JSGlobal("Ext.ModelMgr.initConfig")
  @js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up
    * @returns Boolean Whether the type is registered.
    */
  @JSGlobal("Ext.ModelMgr.isRegistered")
  @js.native
  def isRegistered(): Boolean = js.native
  @JSGlobal("Ext.ModelMgr.isRegistered")
  @js.native
  def isRegistered(`type`: java.lang.String): Boolean = js.native
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register
    */
  @JSGlobal("Ext.ModelMgr.register")
  @js.native
  def register(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.register")
  @js.native
  def register(item: js.Any): Unit = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ModelMgr.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.ModelMgr.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister
    */
  @JSGlobal("Ext.ModelMgr.unregister")
  @js.native
  def unregister(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.unregister")
  @js.native
  def unregister(item: js.Any): Unit = js.native
}
