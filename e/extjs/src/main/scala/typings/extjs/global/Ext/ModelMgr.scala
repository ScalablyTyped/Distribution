package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IHashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.ModelMgr")
@js.native
class ModelMgr ()
  extends typings.extjs.Ext.ModelMgr

/* static members */
@JSGlobal("Ext.ModelMgr")
@js.native
object ModelMgr extends js.Object {
  /** [Property] (Ext.util.HashMap) */
  var all: IHashMap = js.native
  /** [Property] (Ext.data.association.Association[]) */
  var associationStack: typings.extjs.Ext.Array = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
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
  /** [Method] Creates a new instance of a Model using the given data
    * @param data Object Data to initialize the Model's fields with
    * @param name String The name of the model to create
    * @param id Number unique id of the Model instance (see Ext.data.Model)
    */
  def create(): Unit = js.native
  def create(data: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], id: Double): Unit = js.native
  def create(data: js.UndefOr[scala.Nothing], name: java.lang.String): Unit = js.native
  def create(data: js.UndefOr[scala.Nothing], name: java.lang.String, id: Double): Unit = js.native
  def create(data: js.Any): Unit = js.native
  def create(data: js.Any, name: js.UndefOr[scala.Nothing], id: Double): Unit = js.native
  def create(data: js.Any, name: java.lang.String): Unit = js.native
  def create(data: js.Any, name: java.lang.String, id: Double): Unit = js.native
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    */
  def each(): Unit = js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def each(fn: js.Any): Unit = js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Returns an item by id
    * @param id String The id of the item
    * @returns Object The item, undefined if not found.
    */
  def get(): js.Any = js.native
  def get(id: java.lang.String): js.Any = js.native
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  def getCount(): Double = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Returns the Ext data Model class for a given model name
    * @param id String/Object The classname of the model or the model class itself.
    * @returns Ext.data.Model a model class.
    */
  def getModel(): IModel = js.native
  def getModel(id: js.Any): IModel = js.native
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up
    * @returns Boolean Whether the type is registered.
    */
  def isRegistered(): Boolean = js.native
  def isRegistered(`type`: java.lang.String): Boolean = js.native
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  def onAvailable(): Unit = js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def onAvailable(id: java.lang.String): Unit = js.native
  def onAvailable(id: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def onAvailable(id: java.lang.String, fn: js.Any): Unit = js.native
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Registers an item to be managed
    * @param item Object The item to register
    */
  def register(): Unit = js.native
  def register(item: js.Any): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister
    */
  def unregister(): Unit = js.native
  def unregister(item: js.Any): Unit = js.native
}

