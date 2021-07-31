package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ModelManager")
@js.native
class ModelManager ()
  extends StObject
     with typings.extjs.Ext.ModelManager
/* static members */
object ModelManager {
  
  @JSGlobal("Ext.ModelManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Ext.util.HashMap) */
  @JSGlobal("Ext.ModelManager.all")
  @js.native
  def all: IHashMap = js.native
  @scala.inline
  def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.data.association.Association[]) */
  @JSGlobal("Ext.ModelManager.associationStack")
  @js.native
  def associationStack: typings.extjs.Ext.Array = js.native
  @scala.inline
  def associationStack_=(x: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("associationStack")(x.asInstanceOf[js.Any])
  
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
  
  /** [Method] Creates a new instance of a Model using the given data
    * @param data Object Data to initialize the Model's fields with
    * @param name String The name of the model to create
    * @param id Number unique id of the Model instance (see Ext.data.Model)
    */
  @scala.inline
  def create(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Unit]
  @scala.inline
  def create(data: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def create(data: js.Any, name: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def create(data: js.Any, name: java.lang.String, id: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def create(data: js.Any, name: Unit, id: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def create(data: Unit, name: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def create(data: Unit, name: java.lang.String, id: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def create(data: Unit, name: Unit, id: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  /** [Method] Returns the Ext data Model class for a given model name
    * @param id String/Object The classname of the model or the model class itself.
    * @returns Ext.data.Model a model class.
    */
  @scala.inline
  def getModel(): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")().asInstanceOf[IModel]
  @scala.inline
  def getModel(id: js.Any): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(id.asInstanceOf[js.Any]).asInstanceOf[IModel]
  
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
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ModelManager.self")
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
