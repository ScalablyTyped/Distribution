package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.data.proxy.IProxy
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.ISorter
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSGlobal("Ext.data.AbstractStore")
  @js.native
  class AbstractStore ()
    extends typings.extjs.Ext.data.AbstractStore
  /* static members */
  object AbstractStore {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.AbstractStore.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.AbstractStore.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.AbstractStore.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.AbstractStore.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Creates a store from config object
      * @param store Object/Ext.data.AbstractStore A config for the store to be created. It may contain a type field which defines the particular type of store to create. Alteratively passing an actual store to this method will just return it, no changes made.
      * @returns Ext.data.AbstractStore The created store.
      */
    @JSGlobal("Ext.data.AbstractStore.create")
    @js.native
    def create(): IAbstractStore = js.native
    @JSGlobal("Ext.data.AbstractStore.create")
    @js.native
    def create(store: js.Any): IAbstractStore = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.AbstractStore.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.AbstractStore.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.AbstractStore.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.AbstractStore.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.AbstractStore.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.data.AbstractStore.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.AbstractStore.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.AbstractStore.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.IdGenerator")
  @js.native
  class IdGenerator ()
    extends typings.extjs.Ext.data.IdGenerator
  /* static members */
  object IdGenerator {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.IdGenerator.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.IdGenerator.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.IdGenerator.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.IdGenerator.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.data.IdGenerator.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.IdGenerator.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.IdGenerator.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.IdGenerator.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.IdGenerator.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Returns the IdGenerator given its config description
      * @param config String/Object If this parameter is an IdGenerator instance, it is simply returned. If this is a string, it is first used as an id for lookup and then, if there is no match, as a type to create a new instance. This parameter can also be a config object that contains a type property (among others) that are used to create and configure the instance.
      */
    @JSGlobal("Ext.data.IdGenerator.get")
    @js.native
    def get(): Unit = js.native
    @JSGlobal("Ext.data.IdGenerator.get")
    @js.native
    def get(config: js.Any): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.IdGenerator.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.data.IdGenerator.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.IdGenerator.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.IdGenerator.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.JsonP")
  @js.native
  class JsonP ()
    extends typings.extjs.Ext.data.JsonP
  /* static members */
  object JsonP {
    
    @JSGlobal("Ext.data.JsonP")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Abort a request
      * @param request Object/String The request to abort
      */
    @JSGlobal("Ext.data.JsonP.abort")
    @js.native
    def abort(): Unit = js.native
    @JSGlobal("Ext.data.JsonP.abort")
    @js.native
    def abort(request: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.JsonP.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.JsonP.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.JsonP.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.JsonP.callbackKey")
    @js.native
    def callbackKey: java.lang.String = js.native
    @scala.inline
    def callbackKey_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.JsonP.disableCaching")
    @js.native
    def disableCaching: Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.JsonP.disableCachingParam")
    @js.native
    def disableCachingParam: java.lang.String = js.native
    @scala.inline
    def disableCachingParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def disableCaching_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.data.JsonP.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.JsonP.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.data.JsonP.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Makes a JSONP request
      * @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.  url : String The URL to request. params : Object (Optional)An object containing a series of key value pairs that will be sent along with the request. timeout : Number (Optional) See timeout callbackKey : String (Optional) See callbackKey callbackName : String (Optional) The function name to use for this request. By default this name will be auto-generated: Ext.data.JsonP.callback1, Ext.data.JsonP.callback2, etc. Setting this option to "my_name" will force the function name to be Ext.data.JsonP.my_name. Use this if you want deterministic behavior, but be careful - the callbackName should be different in each JsonP request that you make. disableCaching : Boolean (Optional) See disableCaching disableCachingParam : String (Optional) See disableCachingParam success : Function (Optional) A function to execute if the request succeeds. failure : Function (Optional) A function to execute if the request fails. callback : Function (Optional) A function to execute when the request completes, whether it is a success or failure. scope : Object (Optional)The scope in which to execute the callbacks: The "this" object for the callback function. Defaults to the browser window.
      * @returns Object request An object containing the request details.
      */
    @JSGlobal("Ext.data.JsonP.request")
    @js.native
    def request(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.request")
    @js.native
    def request(options: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.JsonP.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.JsonP.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.data.JsonP.timeout")
    @js.native
    def timeout: Double = js.native
    @scala.inline
    def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.Model")
  @js.native
  class Model ()
    extends typings.extjs.Ext.data.Model
  /* static members */
  object Model {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.Model.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.Model.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.Model.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.Model.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.data.Model.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.Model.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.Model.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Returns an Array of Field definitions which define this Model s structure Fields are sorted upon Model class definit
      * @returns Ext.data.Field[] The defined Fields for this Model.
      */
    @JSGlobal("Ext.data.Model.getFields")
    @js.native
    def getFields(): typings.extjs.Ext.Array = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.Model.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Returns the configured Proxy for this Model
      * @returns Ext.data.proxy.Proxy The proxy
      */
    @JSGlobal("Ext.data.Model.getProxy")
    @js.native
    def getProxy(): IProxy = js.native
    
    /** [Method] Generates a sequential id
      * @param rec Ext.data.Model The record being created. The record does not exist, it's a phantom.
      * @returns String auto-generated string id, "ext-record-i++";
      */
    @JSGlobal("Ext.data.Model.id")
    @js.native
    def id(): java.lang.String = js.native
    @JSGlobal("Ext.data.Model.id")
    @js.native
    def id(rec: IModel): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.data.Model.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Asynchronously loads a model instance by id
      * @param id Number/String The id of the model to load
      * @param config Object config object containing success, failure and callback functions, plus optional scope
      */
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: js.UndefOr[scala.Nothing], config: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: js.Any, config: js.Any): Unit = js.native
    
    /** [Method] Apply a new set of field and or property definitions to the existing model
      * @param fields Object
      * @param idProperty Object
      * @param clientIdProperty Object
      */
    @JSGlobal("Ext.data.Model.setFields")
    @js.native
    def setFields(): Unit = js.native
    @JSGlobal("Ext.data.Model.setFields")
    @js.native
    def setFields(fields: js.UndefOr[scala.Nothing], idProperty: js.UndefOr[scala.Nothing], clientIdProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.setFields")
    @js.native
    def setFields(fields: js.UndefOr[scala.Nothing], idProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.setFields")
    @js.native
    def setFields(fields: js.UndefOr[scala.Nothing], idProperty: js.Any, clientIdProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.setFields")
    @js.native
    def setFields(fields: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.setFields")
    @js.native
    def setFields(fields: js.Any, idProperty: js.UndefOr[scala.Nothing], clientIdProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.setFields")
    @js.native
    def setFields(fields: js.Any, idProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.setFields")
    @js.native
    def setFields(fields: js.Any, idProperty: js.Any, clientIdProperty: js.Any): Unit = js.native
    
    /** [Method] Sets the Proxy to use for this model
      * @param proxy String/Object/Ext.data.proxy.Proxy The proxy
      * @returns Ext.data.proxy.Proxy
      */
    @JSGlobal("Ext.data.Model.setProxy")
    @js.native
    def setProxy(): IProxy = js.native
    @JSGlobal("Ext.data.Model.setProxy")
    @js.native
    def setProxy(proxy: js.Any): IProxy = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.Model.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.Model.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.NodeInterface")
  @js.native
  class NodeInterface ()
    extends typings.extjs.Ext.data.NodeInterface
  /* static members */
  object NodeInterface {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.NodeInterface.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.NodeInterface.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.NodeInterface.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.data.NodeInterface.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.NodeInterface.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] This method allows you to decorate a Model s class to implement the NodeInterface
      * @param modelClass Ext.Class/Ext.data.Model The Model class or an instance of the Model class you want to decorate the prototype of.
      */
    @JSGlobal("Ext.data.NodeInterface.decorate")
    @js.native
    def decorate(): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.decorate")
    @js.native
    def decorate(modelClass: js.Any): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.NodeInterface.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.data.NodeInterface.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.NodeInterface.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.NodeInterface.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.Record")
  @js.native
  class Record ()
    extends typings.extjs.Ext.data.Record
  /* static members */
  object Record {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.Record.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.Record.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.Record.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.Record.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.data.Record.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.Record.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.Record.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Returns an Array of Field definitions which define this Model s structure Fields are sorted upon Model class definit
      * @returns Ext.data.Field[] The defined Fields for this Model.
      */
    @JSGlobal("Ext.data.Record.getFields")
    @js.native
    def getFields(): typings.extjs.Ext.Array = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.Record.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Returns the configured Proxy for this Model
      * @returns Ext.data.proxy.Proxy The proxy
      */
    @JSGlobal("Ext.data.Record.getProxy")
    @js.native
    def getProxy(): IProxy = js.native
    
    /** [Method] Generates a sequential id
      * @param rec Ext.data.Model The record being created. The record does not exist, it's a phantom.
      * @returns String auto-generated string id, "ext-record-i++";
      */
    @JSGlobal("Ext.data.Record.id")
    @js.native
    def id(): java.lang.String = js.native
    @JSGlobal("Ext.data.Record.id")
    @js.native
    def id(rec: IModel): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.data.Record.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Asynchronously loads a model instance by id
      * @param id Number/String The id of the model to load
      * @param config Object config object containing success, failure and callback functions, plus optional scope
      */
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: js.UndefOr[scala.Nothing], config: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: js.Any, config: js.Any): Unit = js.native
    
    /** [Method] Apply a new set of field and or property definitions to the existing model
      * @param fields Object
      * @param idProperty Object
      * @param clientIdProperty Object
      */
    @JSGlobal("Ext.data.Record.setFields")
    @js.native
    def setFields(): Unit = js.native
    @JSGlobal("Ext.data.Record.setFields")
    @js.native
    def setFields(fields: js.UndefOr[scala.Nothing], idProperty: js.UndefOr[scala.Nothing], clientIdProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.setFields")
    @js.native
    def setFields(fields: js.UndefOr[scala.Nothing], idProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.setFields")
    @js.native
    def setFields(fields: js.UndefOr[scala.Nothing], idProperty: js.Any, clientIdProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.setFields")
    @js.native
    def setFields(fields: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.setFields")
    @js.native
    def setFields(fields: js.Any, idProperty: js.UndefOr[scala.Nothing], clientIdProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.setFields")
    @js.native
    def setFields(fields: js.Any, idProperty: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.setFields")
    @js.native
    def setFields(fields: js.Any, idProperty: js.Any, clientIdProperty: js.Any): Unit = js.native
    
    /** [Method] Sets the Proxy to use for this model
      * @param proxy String/Object/Ext.data.proxy.Proxy The proxy
      * @returns Ext.data.proxy.Proxy
      */
    @JSGlobal("Ext.data.Record.setProxy")
    @js.native
    def setProxy(): IProxy = js.native
    @JSGlobal("Ext.data.Record.setProxy")
    @js.native
    def setProxy(proxy: js.Any): IProxy = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.Record.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.Record.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.SortTypes")
  @js.native
  class SortTypes ()
    extends typings.extjs.Ext.data.SortTypes
  /* static members */
  object SortTypes {
    
    @JSGlobal("Ext.data.SortTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Date sorting
      * @param s Object The value being converted
      * @returns Number The comparison value
      */
    @JSGlobal("Ext.data.SortTypes.asDate")
    @js.native
    def asDate(): Double = js.native
    @JSGlobal("Ext.data.SortTypes.asDate")
    @js.native
    def asDate(s: js.Any): Double = js.native
    
    /** [Method] Float sorting
      * @param s Object The value being converted
      * @returns Number The comparison value
      */
    @JSGlobal("Ext.data.SortTypes.asFloat")
    @js.native
    def asFloat(): Double = js.native
    @JSGlobal("Ext.data.SortTypes.asFloat")
    @js.native
    def asFloat(s: js.Any): Double = js.native
    
    /** [Method] Integer sorting
      * @param s Object The value being converted
      * @returns Number The comparison value
      */
    @JSGlobal("Ext.data.SortTypes.asInt")
    @js.native
    def asInt(): Double = js.native
    @JSGlobal("Ext.data.SortTypes.asInt")
    @js.native
    def asInt(s: js.Any): Double = js.native
    
    /** [Method] Strips all HTML tags to sort on text only
      * @param s Object The value being converted
      * @returns String The comparison value
      */
    @JSGlobal("Ext.data.SortTypes.asText")
    @js.native
    def asText(): java.lang.String = js.native
    @JSGlobal("Ext.data.SortTypes.asText")
    @js.native
    def asText(s: js.Any): java.lang.String = js.native
    
    /** [Method] Case insensitive string
      * @param s Object The value being converted
      * @returns String The comparison value
      */
    @JSGlobal("Ext.data.SortTypes.asUCString")
    @js.native
    def asUCString(): java.lang.String = js.native
    @JSGlobal("Ext.data.SortTypes.asUCString")
    @js.native
    def asUCString(s: js.Any): java.lang.String = js.native
    
    /** [Method] Strips all HTML tags to sort on text only  Case insensitive
      * @param s Object The value being converted
      * @returns String The comparison value
      */
    @JSGlobal("Ext.data.SortTypes.asUCText")
    @js.native
    def asUCText(): java.lang.String = js.native
    @JSGlobal("Ext.data.SortTypes.asUCText")
    @js.native
    def asUCText(s: js.Any): java.lang.String = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.SortTypes.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.SortTypes.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.SortTypes.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.data.SortTypes.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.SortTypes.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.data.SortTypes.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Default sort that does nothing
      * @param s Object The value being converted
      * @returns Object The comparison value
      */
    @JSGlobal("Ext.data.SortTypes.none")
    @js.native
    def none(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.none")
    @js.native
    def none(s: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.SortTypes.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.SortTypes.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.SortTypes.stripTagsRE")
    @js.native
    def stripTagsRE: RegExp = js.native
    @scala.inline
    def stripTagsRE_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripTagsRE")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.StoreManager")
  @js.native
  class StoreManager ()
    extends typings.extjs.Ext.data.StoreManager
  /* static members */
  object StoreManager {
    
    @JSGlobal("Ext.data.StoreManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds an item to the collection
      * @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
      * @param obj Object The item to add.
      * @returns Object The item added.
      */
    @JSGlobal("Ext.data.StoreManager.add")
    @js.native
    def add(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.add")
    @js.native
    def add(key: js.UndefOr[scala.Nothing], obj: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.add")
    @js.native
    def add(key: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.add")
    @js.native
    def add(key: js.Any, obj: js.Any): js.Any = js.native
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
      */
    @JSGlobal("Ext.data.StoreManager.addAll")
    @js.native
    def addAll(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addAll")
    @js.native
    def addAll(objs: js.Any): Unit = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    @JSGlobal("Ext.data.StoreManager.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addListener")
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
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.StoreManager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.StoreManager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.StoreManager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all items from the collection  */
    @JSGlobal("Ext.data.StoreManager.clear")
    @js.native
    def clear(): Unit = js.native
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    @JSGlobal("Ext.data.StoreManager.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method] Removes all managed listeners for this object  */
    @JSGlobal("Ext.data.StoreManager.clearManagedListeners")
    @js.native
    def clearManagedListeners(): Unit = js.native
    
    /** [Method] Collects unique values of a particular property in this MixedCollection
      * @param property String The property to collect on
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
      * @returns Array The unique values
      */
    @JSGlobal("Ext.data.StoreManager.collect")
    @js.native
    def collect(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.collect")
    @js.native
    def collect(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], allowBlank: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.collect")
    @js.native
    def collect(property: js.UndefOr[scala.Nothing], root: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.collect")
    @js.native
    def collect(property: js.UndefOr[scala.Nothing], root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.collect")
    @js.native
    def collect(property: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.collect")
    @js.native
    def collect(property: java.lang.String, root: js.UndefOr[scala.Nothing], allowBlank: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.collect")
    @js.native
    def collect(property: java.lang.String, root: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.collect")
    @js.native
    def collect(property: java.lang.String, root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param o Object The Object to look for in the collection.
      * @returns Boolean True if the collection contains the Object as an item.
      */
    @JSGlobal("Ext.data.StoreManager.contains")
    @js.native
    def contains(): Boolean = js.native
    @JSGlobal("Ext.data.StoreManager.contains")
    @js.native
    def contains(o: js.Any): Boolean = js.native
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean True if the collection contains the Object as a key.
      */
    @JSGlobal("Ext.data.StoreManager.containsKey")
    @js.native
    def containsKey(): Boolean = js.native
    @JSGlobal("Ext.data.StoreManager.containsKey")
    @js.native
    def containsKey(key: java.lang.String): Boolean = js.native
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    @JSGlobal("Ext.data.StoreManager.each")
    @js.native
    def each(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.each")
    @js.native
    def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.each")
    @js.native
    def each(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.each")
    @js.native
    def each(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    @JSGlobal("Ext.data.StoreManager.eachKey")
    @js.native
    def eachKey(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.eachKey")
    @js.native
    def eachKey(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.eachKey")
    @js.native
    def eachKey(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.eachKey")
    @js.native
    def eachKey(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.data.StoreManager.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.enableBubble")
    @js.native
    def enableBubble(eventNames: js.Any): Unit = js.native
    
    /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
      * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
      * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
      * @param anyMatch Boolean True to match any part of the string, not just the beginning
      * @param caseSensitive Boolean True for case sensitive comparison.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], anyMatch: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(
      property: js.Any,
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: js.UndefOr[scala.Nothing], caseSensitive: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    @JSGlobal("Ext.data.StoreManager.filterBy")
    @js.native
    def filterBy(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filterBy")
    @js.native
    def filterBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filterBy")
    @js.native
    def filterBy(fn: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filterBy")
    @js.native
    def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = js.native
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
    @JSGlobal("Ext.data.StoreManager.find")
    @js.native
    def find(): Unit = js.native
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
      */
    @JSGlobal("Ext.data.StoreManager.findBy")
    @js.native
    def findBy(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.findBy")
    @js.native
    def findBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.findBy")
    @js.native
    def findBy(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.findBy")
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
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: Double,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any, start: Double, anyMatch: Boolean): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: Double,
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: java.lang.String): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.UndefOr[scala.Nothing], start: Double, anyMatch: Boolean): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.Any, start: js.UndefOr[scala.Nothing], anyMatch: Boolean): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.Any, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.Any,
      start: Double,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.Any, start: Double, anyMatch: Boolean): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndex")
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
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = js.native
    
    /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
      * @param newItem Object The new object to find the insertion position of.
      * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
      * @returns Number The insertion point to add the new item into this MixedCollection at using insert
      */
    @JSGlobal("Ext.data.StoreManager.findInsertionIndex")
    @js.native
    def findInsertionIndex(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findInsertionIndex")
    @js.native
    def findInsertionIndex(newItem: js.UndefOr[scala.Nothing], sorterFn: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findInsertionIndex")
    @js.native
    def findInsertionIndex(newItem: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findInsertionIndex")
    @js.native
    def findInsertionIndex(newItem: js.Any, sorterFn: js.Any): Double = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @JSGlobal("Ext.data.StoreManager.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @JSGlobal("Ext.data.StoreManager.fireEventArgs")
    @js.native
    def fireEventArgs(): Boolean = js.native
    @JSGlobal("Ext.data.StoreManager.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): Boolean = js.native
    @JSGlobal("Ext.data.StoreManager.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.StoreManager.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = js.native
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection..
      */
    @JSGlobal("Ext.data.StoreManager.first")
    @js.native
    def first(): js.Any = js.native
    
    /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
    @JSGlobal("Ext.data.StoreManager.generateComparator")
    @js.native
    def generateComparator(): Unit = js.native
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    @JSGlobal("Ext.data.StoreManager.get")
    @js.native
    def get(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.get")
    @js.native
    def get(key: js.Any): js.Any = js.native
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    @JSGlobal("Ext.data.StoreManager.getAt")
    @js.native
    def getAt(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.getAt")
    @js.native
    def getAt(index: Double): js.Any = js.native
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    @JSGlobal("Ext.data.StoreManager.getByKey")
    @js.native
    def getByKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.getByKey")
    @js.native
    def getByKey(key: js.Any): js.Any = js.native
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    @JSGlobal("Ext.data.StoreManager.getCount")
    @js.native
    def getCount(): Double = js.native
    
    /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
      * @returns Ext.util.Sorter The sorter, null if none exist
      */
    @JSGlobal("Ext.data.StoreManager.getFirstSorter")
    @js.native
    def getFirstSorter(): ISorter = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.data.StoreManager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] getKey implementation for MixedCollection
      * @param o Object
      * @returns Object The key for the passed item.
      */
    @JSGlobal("Ext.data.StoreManager.getKey")
    @js.native
    def getKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.getKey")
    @js.native
    def getKey(o: js.Any): js.Any = js.native
    
    /** [Method] Returns a range of items in this collection
      * @param startIndex Number The starting index. Defaults to 0.
      * @param endIndex Number The ending index. Defaults to the last item.
      * @returns Array An array of items
      */
    @JSGlobal("Ext.data.StoreManager.getRange")
    @js.native
    def getRange(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.getRange")
    @js.native
    def getRange(startIndex: js.UndefOr[scala.Nothing], endIndex: Double): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.getRange")
    @js.native
    def getRange(startIndex: Double): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.getRange")
    @js.native
    def getRange(startIndex: Double, endIndex: Double): typings.extjs.Ext.Array = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    @JSGlobal("Ext.data.StoreManager.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.data.StoreManager.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreManager.hasListeners")
    @js.native
    def hasListeners: js.Any = js.native
    @scala.inline
    def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns index within the collection of the passed Object
      * @param o Object The item to find the index of.
      * @returns Number index of the item. Returns -1 if not found.
      */
    @JSGlobal("Ext.data.StoreManager.indexOf")
    @js.native
    def indexOf(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.indexOf")
    @js.native
    def indexOf(o: js.Any): Double = js.native
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number index of the key.
      */
    @JSGlobal("Ext.data.StoreManager.indexOfKey")
    @js.native
    def indexOfKey(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.indexOfKey")
    @js.native
    def indexOfKey(key: java.lang.String): Double = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.StoreManager.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.data.StoreManager.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Performs initialization of this mixin  */
    @JSGlobal("Ext.data.StoreManager.initSortable")
    @js.native
    def initSortable(): Unit = js.native
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Number The index to insert the item at.
      * @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
      * @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
      * @returns Object The item inserted or an array of items inserted.
      */
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: js.Any, o: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: Double, key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: Double, key: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: Double, key: js.Any, o: js.Any): js.Any = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.isMixedCollection")
    @js.native
    def isMixedCollection: Boolean = js.native
    @scala.inline
    def isMixedCollection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMixedCollection")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.isObservable")
    @js.native
    def isObservable: Boolean = js.native
    @scala.inline
    def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.isSortable")
    @js.native
    def isSortable: Boolean = js.native
    @scala.inline
    def isSortable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection..
      */
    @JSGlobal("Ext.data.StoreManager.last")
    @js.native
    def last(): js.Any = js.native
    
    /** [Method] Gets a registered Store by id
      * @param store String/Object The id of the Store, or a Store instance, or a store configuration
      * @returns Ext.data.Store
      */
    @JSGlobal("Ext.data.StoreManager.lookup")
    @js.native
    def lookup(): IStore = js.native
    @JSGlobal("Ext.data.StoreManager.lookup")
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
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Registers one or more Stores with the StoreManager
      * @param stores Ext.data.Store... Any number of Store instances
      */
    @JSGlobal("Ext.data.StoreManager.register")
    @js.native
    def register(stores: IStore): Unit = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    @JSGlobal("Ext.data.StoreManager.relayEvents")
    @js.native
    def relayEvents(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.relayEvents")
    @js.native
    def relayEvents(origin: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
    
    /** [Method] Remove an item from the collection
      * @param o Object The item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreManager.remove")
    @js.native
    def remove(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.remove")
    @js.native
    def remove(o: js.Any): js.Any = js.native
    
    /** [Method] Remove all items in the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    @JSGlobal("Ext.data.StoreManager.removeAll")
    @js.native
    def removeAll(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.removeAll")
    @js.native
    def removeAll(items: typings.extjs.Ext.Array): IMixedCollection = js.native
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreManager.removeAt")
    @js.native
    def removeAt(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.removeAt")
    @js.native
    def removeAt(index: Double): js.Any = js.native
    
    /** [Method] Removes an item associated with the passed key fom the collection
      * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
      * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreManager.removeAtKey")
    @js.native
    def removeAtKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.removeAtKey")
    @js.native
    def removeAtKey(key: java.lang.String): js.Any = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @JSGlobal("Ext.data.StoreManager.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Remove a range of items starting at a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @param removeCount Number The nuber of items to remove beginning at the specified index.
      * @returns Object The last item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreManager.removeRange")
    @js.native
    def removeRange(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.removeRange")
    @js.native
    def removeRange(index: js.UndefOr[scala.Nothing], removeCount: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.removeRange")
    @js.native
    def removeRange(index: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.removeRange")
    @js.native
    def removeRange(index: Double, removeCount: Double): js.Any = js.native
    
    /** [Method] Reorders each of the items based on a mapping from old index to new index
      * @param mapping Object Mapping from old item index to new item index
      */
    @JSGlobal("Ext.data.StoreManager.reorder")
    @js.native
    def reorder(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.reorder")
    @js.native
    def reorder(mapping: js.Any): Unit = js.native
    
    /** [Method] Replaces an item in the collection
      * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    @JSGlobal("Ext.data.StoreManager.replace")
    @js.native
    def replace(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.replace")
    @js.native
    def replace(key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.replace")
    @js.native
    def replace(key: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.replace")
    @js.native
    def replace(key: java.lang.String, o: js.Any): js.Any = js.native
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    @JSGlobal("Ext.data.StoreManager.resumeEvent")
    @js.native
    def resumeEvent(eventName: js.Any*): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents */
    @JSGlobal("Ext.data.StoreManager.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.StoreManager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sorts the data in the Store by one or more of its properties
      * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
      * @param direction String The overall direction to sort the data by.
      * @returns Ext.util.Sorter[]
      */
    @JSGlobal("Ext.data.StoreManager.sort")
    @js.native
    def sort(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.sort")
    @js.native
    def sort(sorters: js.UndefOr[scala.Nothing], direction: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.sort")
    @js.native
    def sort(sorters: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.sort")
    @js.native
    def sort(sorters: js.Any, direction: java.lang.String): typings.extjs.Ext.Array = js.native
    
    /** [Method] Sorts the collection by a single sorter function
      * @param sorterFn Function The function to sort by
      */
    @JSGlobal("Ext.data.StoreManager.sortBy")
    @js.native
    def sortBy(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.sortBy")
    @js.native
    def sortBy(sorterFn: js.Any): Unit = js.native
    
    /** [Method] Sorts this collection by keys
      * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
      * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
      */
    @JSGlobal("Ext.data.StoreManager.sortByKey")
    @js.native
    def sortByKey(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.sortByKey")
    @js.native
    def sortByKey(direction: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.sortByKey")
    @js.native
    def sortByKey(direction: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.sortByKey")
    @js.native
    def sortByKey(direction: java.lang.String, fn: js.Any): Unit = js.native
    
    /** [Property] (Ext.util.MixedCollection) */
    @JSGlobal("Ext.data.StoreManager.sorters")
    @js.native
    def sorters: IMixedCollection = js.native
    @scala.inline
    def sorters_=(x: IMixedCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorters")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.StoreManager.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Collects all of the values of the given property and returns their sum
      * @param property String The property to sum by
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param start Number The record index to start at
      * @param end Number The record index to end at
      * @returns Number The total
      */
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(
      property: js.UndefOr[scala.Nothing],
      root: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], start: Double, end: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(
      property: js.UndefOr[scala.Nothing],
      root: java.lang.String,
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String, start: Double, end: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: java.lang.String): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(
      property: java.lang.String,
      root: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: java.lang.String, root: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: java.lang.String, root: js.UndefOr[scala.Nothing], start: Double, end: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: java.lang.String, root: java.lang.String): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: java.lang.String, root: java.lang.String, start: js.UndefOr[scala.Nothing], end: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: java.lang.String, root: java.lang.String, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.sum")
    @js.native
    def sum(property: java.lang.String, root: java.lang.String, start: Double, end: Double): Double = js.native
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    @JSGlobal("Ext.data.StoreManager.suspendEvent")
    @js.native
    def suspendEvent(eventName: js.Any*): Unit = js.native
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    @JSGlobal("Ext.data.StoreManager.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.suspendEvents")
    @js.native
    def suspendEvents(queueSuspended: Boolean): Unit = js.native
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @JSGlobal("Ext.data.StoreManager.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.un")
    @js.native
    def un(eventName: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Unregisters one or more Stores with the StoreManager
      * @param stores String/Object... Any number of Store instances or ID-s
      */
    @JSGlobal("Ext.data.StoreManager.unregister")
    @js.native
    def unregister(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.unregister")
    @js.native
    def unregister(stores: js.Any): Unit = js.native
    
    /** [Method] Change the key for an existing item in the collection
      * @param oldKey Object The old key
      * @param newKey Object The new key
      */
    @JSGlobal("Ext.data.StoreManager.updateKey")
    @js.native
    def updateKey(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.updateKey")
    @js.native
    def updateKey(oldKey: js.UndefOr[scala.Nothing], newKey: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.updateKey")
    @js.native
    def updateKey(oldKey: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.updateKey")
    @js.native
    def updateKey(oldKey: js.Any, newKey: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.data.StoreMgr")
  @js.native
  class StoreMgr ()
    extends typings.extjs.Ext.data.StoreMgr
  /* static members */
  object StoreMgr {
    
    @JSGlobal("Ext.data.StoreMgr")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds an item to the collection
      * @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
      * @param obj Object The item to add.
      * @returns Object The item added.
      */
    @JSGlobal("Ext.data.StoreMgr.add")
    @js.native
    def add(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.add")
    @js.native
    def add(key: js.UndefOr[scala.Nothing], obj: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.add")
    @js.native
    def add(key: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.add")
    @js.native
    def add(key: js.Any, obj: js.Any): js.Any = js.native
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
      */
    @JSGlobal("Ext.data.StoreMgr.addAll")
    @js.native
    def addAll(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addAll")
    @js.native
    def addAll(objs: js.Any): Unit = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    @JSGlobal("Ext.data.StoreMgr.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addListener")
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
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.StoreMgr.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.StoreMgr.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.StoreMgr.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all items from the collection  */
    @JSGlobal("Ext.data.StoreMgr.clear")
    @js.native
    def clear(): Unit = js.native
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    @JSGlobal("Ext.data.StoreMgr.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method] Removes all managed listeners for this object  */
    @JSGlobal("Ext.data.StoreMgr.clearManagedListeners")
    @js.native
    def clearManagedListeners(): Unit = js.native
    
    /** [Method] Collects unique values of a particular property in this MixedCollection
      * @param property String The property to collect on
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
      * @returns Array The unique values
      */
    @JSGlobal("Ext.data.StoreMgr.collect")
    @js.native
    def collect(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.collect")
    @js.native
    def collect(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], allowBlank: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.collect")
    @js.native
    def collect(property: js.UndefOr[scala.Nothing], root: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.collect")
    @js.native
    def collect(property: js.UndefOr[scala.Nothing], root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.collect")
    @js.native
    def collect(property: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.collect")
    @js.native
    def collect(property: java.lang.String, root: js.UndefOr[scala.Nothing], allowBlank: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.collect")
    @js.native
    def collect(property: java.lang.String, root: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.collect")
    @js.native
    def collect(property: java.lang.String, root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param o Object The Object to look for in the collection.
      * @returns Boolean True if the collection contains the Object as an item.
      */
    @JSGlobal("Ext.data.StoreMgr.contains")
    @js.native
    def contains(): Boolean = js.native
    @JSGlobal("Ext.data.StoreMgr.contains")
    @js.native
    def contains(o: js.Any): Boolean = js.native
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean True if the collection contains the Object as a key.
      */
    @JSGlobal("Ext.data.StoreMgr.containsKey")
    @js.native
    def containsKey(): Boolean = js.native
    @JSGlobal("Ext.data.StoreMgr.containsKey")
    @js.native
    def containsKey(key: java.lang.String): Boolean = js.native
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    @JSGlobal("Ext.data.StoreMgr.each")
    @js.native
    def each(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.each")
    @js.native
    def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.each")
    @js.native
    def each(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.each")
    @js.native
    def each(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    @JSGlobal("Ext.data.StoreMgr.eachKey")
    @js.native
    def eachKey(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.eachKey")
    @js.native
    def eachKey(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.eachKey")
    @js.native
    def eachKey(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.eachKey")
    @js.native
    def eachKey(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.data.StoreMgr.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.enableBubble")
    @js.native
    def enableBubble(eventNames: js.Any): Unit = js.native
    
    /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
      * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
      * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
      * @param anyMatch Boolean True to match any part of the string, not just the beginning
      * @param caseSensitive Boolean True for case sensitive comparison.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], anyMatch: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(
      property: js.Any,
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: js.UndefOr[scala.Nothing], caseSensitive: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: Boolean): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = js.native
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    @JSGlobal("Ext.data.StoreMgr.filterBy")
    @js.native
    def filterBy(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filterBy")
    @js.native
    def filterBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filterBy")
    @js.native
    def filterBy(fn: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filterBy")
    @js.native
    def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = js.native
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
    @JSGlobal("Ext.data.StoreMgr.find")
    @js.native
    def find(): Unit = js.native
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
      */
    @JSGlobal("Ext.data.StoreMgr.findBy")
    @js.native
    def findBy(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.findBy")
    @js.native
    def findBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.findBy")
    @js.native
    def findBy(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.findBy")
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
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: Double,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: js.UndefOr[scala.Nothing], value: js.Any, start: Double, anyMatch: Boolean): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      start: Double,
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: java.lang.String): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.UndefOr[scala.Nothing], start: Double, anyMatch: Boolean): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.UndefOr[scala.Nothing],
      start: Double,
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.Any, start: js.UndefOr[scala.Nothing], anyMatch: Boolean): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.Any,
      start: js.UndefOr[scala.Nothing],
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.Any, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(
      property: java.lang.String,
      value: js.Any,
      start: Double,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
    @js.native
    def findIndex(property: java.lang.String, value: js.Any, start: Double, anyMatch: Boolean): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndex")
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
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = js.native
    
    /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
      * @param newItem Object The new object to find the insertion position of.
      * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
      * @returns Number The insertion point to add the new item into this MixedCollection at using insert
      */
    @JSGlobal("Ext.data.StoreMgr.findInsertionIndex")
    @js.native
    def findInsertionIndex(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findInsertionIndex")
    @js.native
    def findInsertionIndex(newItem: js.UndefOr[scala.Nothing], sorterFn: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findInsertionIndex")
    @js.native
    def findInsertionIndex(newItem: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findInsertionIndex")
    @js.native
    def findInsertionIndex(newItem: js.Any, sorterFn: js.Any): Double = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @JSGlobal("Ext.data.StoreMgr.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @JSGlobal("Ext.data.StoreMgr.fireEventArgs")
    @js.native
    def fireEventArgs(): Boolean = js.native
    @JSGlobal("Ext.data.StoreMgr.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): Boolean = js.native
    @JSGlobal("Ext.data.StoreMgr.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.StoreMgr.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = js.native
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection..
      */
    @JSGlobal("Ext.data.StoreMgr.first")
    @js.native
    def first(): js.Any = js.native
    
    /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
    @JSGlobal("Ext.data.StoreMgr.generateComparator")
    @js.native
    def generateComparator(): Unit = js.native
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    @JSGlobal("Ext.data.StoreMgr.get")
    @js.native
    def get(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.get")
    @js.native
    def get(key: js.Any): js.Any = js.native
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    @JSGlobal("Ext.data.StoreMgr.getAt")
    @js.native
    def getAt(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.getAt")
    @js.native
    def getAt(index: Double): js.Any = js.native
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    @JSGlobal("Ext.data.StoreMgr.getByKey")
    @js.native
    def getByKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.getByKey")
    @js.native
    def getByKey(key: js.Any): js.Any = js.native
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    @JSGlobal("Ext.data.StoreMgr.getCount")
    @js.native
    def getCount(): Double = js.native
    
    /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
      * @returns Ext.util.Sorter The sorter, null if none exist
      */
    @JSGlobal("Ext.data.StoreMgr.getFirstSorter")
    @js.native
    def getFirstSorter(): ISorter = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.data.StoreMgr.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] getKey implementation for MixedCollection
      * @param o Object
      * @returns Object The key for the passed item.
      */
    @JSGlobal("Ext.data.StoreMgr.getKey")
    @js.native
    def getKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.getKey")
    @js.native
    def getKey(o: js.Any): js.Any = js.native
    
    /** [Method] Returns a range of items in this collection
      * @param startIndex Number The starting index. Defaults to 0.
      * @param endIndex Number The ending index. Defaults to the last item.
      * @returns Array An array of items
      */
    @JSGlobal("Ext.data.StoreMgr.getRange")
    @js.native
    def getRange(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.getRange")
    @js.native
    def getRange(startIndex: js.UndefOr[scala.Nothing], endIndex: Double): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.getRange")
    @js.native
    def getRange(startIndex: Double): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.getRange")
    @js.native
    def getRange(startIndex: Double, endIndex: Double): typings.extjs.Ext.Array = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    @JSGlobal("Ext.data.StoreMgr.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.data.StoreMgr.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreMgr.hasListeners")
    @js.native
    def hasListeners: js.Any = js.native
    @scala.inline
    def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns index within the collection of the passed Object
      * @param o Object The item to find the index of.
      * @returns Number index of the item. Returns -1 if not found.
      */
    @JSGlobal("Ext.data.StoreMgr.indexOf")
    @js.native
    def indexOf(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.indexOf")
    @js.native
    def indexOf(o: js.Any): Double = js.native
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number index of the key.
      */
    @JSGlobal("Ext.data.StoreMgr.indexOfKey")
    @js.native
    def indexOfKey(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.indexOfKey")
    @js.native
    def indexOfKey(key: java.lang.String): Double = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.StoreMgr.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.data.StoreMgr.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Performs initialization of this mixin  */
    @JSGlobal("Ext.data.StoreMgr.initSortable")
    @js.native
    def initSortable(): Unit = js.native
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Number The index to insert the item at.
      * @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
      * @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
      * @returns Object The item inserted or an array of items inserted.
      */
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: js.Any, o: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: Double, key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: Double, key: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: Double, key: js.Any, o: js.Any): js.Any = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.isMixedCollection")
    @js.native
    def isMixedCollection: Boolean = js.native
    @scala.inline
    def isMixedCollection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMixedCollection")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.isObservable")
    @js.native
    def isObservable: Boolean = js.native
    @scala.inline
    def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.isSortable")
    @js.native
    def isSortable: Boolean = js.native
    @scala.inline
    def isSortable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection..
      */
    @JSGlobal("Ext.data.StoreMgr.last")
    @js.native
    def last(): js.Any = js.native
    
    /** [Method] Gets a registered Store by id
      * @param store String/Object The id of the Store, or a Store instance, or a store configuration
      * @returns Ext.data.Store
      */
    @JSGlobal("Ext.data.StoreMgr.lookup")
    @js.native
    def lookup(): IStore = js.native
    @JSGlobal("Ext.data.StoreMgr.lookup")
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
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Registers one or more Stores with the StoreManager
      * @param stores Ext.data.Store... Any number of Store instances
      */
    @JSGlobal("Ext.data.StoreMgr.register")
    @js.native
    def register(stores: IStore): Unit = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    @JSGlobal("Ext.data.StoreMgr.relayEvents")
    @js.native
    def relayEvents(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.relayEvents")
    @js.native
    def relayEvents(origin: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
    
    /** [Method] Remove an item from the collection
      * @param o Object The item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreMgr.remove")
    @js.native
    def remove(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.remove")
    @js.native
    def remove(o: js.Any): js.Any = js.native
    
    /** [Method] Remove all items in the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    @JSGlobal("Ext.data.StoreMgr.removeAll")
    @js.native
    def removeAll(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.removeAll")
    @js.native
    def removeAll(items: typings.extjs.Ext.Array): IMixedCollection = js.native
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreMgr.removeAt")
    @js.native
    def removeAt(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.removeAt")
    @js.native
    def removeAt(index: Double): js.Any = js.native
    
    /** [Method] Removes an item associated with the passed key fom the collection
      * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
      * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreMgr.removeAtKey")
    @js.native
    def removeAtKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.removeAtKey")
    @js.native
    def removeAtKey(key: java.lang.String): js.Any = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @JSGlobal("Ext.data.StoreMgr.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Remove a range of items starting at a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @param removeCount Number The nuber of items to remove beginning at the specified index.
      * @returns Object The last item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreMgr.removeRange")
    @js.native
    def removeRange(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.removeRange")
    @js.native
    def removeRange(index: js.UndefOr[scala.Nothing], removeCount: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.removeRange")
    @js.native
    def removeRange(index: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.removeRange")
    @js.native
    def removeRange(index: Double, removeCount: Double): js.Any = js.native
    
    /** [Method] Reorders each of the items based on a mapping from old index to new index
      * @param mapping Object Mapping from old item index to new item index
      */
    @JSGlobal("Ext.data.StoreMgr.reorder")
    @js.native
    def reorder(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.reorder")
    @js.native
    def reorder(mapping: js.Any): Unit = js.native
    
    /** [Method] Replaces an item in the collection
      * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    @JSGlobal("Ext.data.StoreMgr.replace")
    @js.native
    def replace(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.replace")
    @js.native
    def replace(key: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.replace")
    @js.native
    def replace(key: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.replace")
    @js.native
    def replace(key: java.lang.String, o: js.Any): js.Any = js.native
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    @JSGlobal("Ext.data.StoreMgr.resumeEvent")
    @js.native
    def resumeEvent(eventName: js.Any*): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents */
    @JSGlobal("Ext.data.StoreMgr.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.StoreMgr.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sorts the data in the Store by one or more of its properties
      * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
      * @param direction String The overall direction to sort the data by.
      * @returns Ext.util.Sorter[]
      */
    @JSGlobal("Ext.data.StoreMgr.sort")
    @js.native
    def sort(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.sort")
    @js.native
    def sort(sorters: js.UndefOr[scala.Nothing], direction: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.sort")
    @js.native
    def sort(sorters: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.sort")
    @js.native
    def sort(sorters: js.Any, direction: java.lang.String): typings.extjs.Ext.Array = js.native
    
    /** [Method] Sorts the collection by a single sorter function
      * @param sorterFn Function The function to sort by
      */
    @JSGlobal("Ext.data.StoreMgr.sortBy")
    @js.native
    def sortBy(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.sortBy")
    @js.native
    def sortBy(sorterFn: js.Any): Unit = js.native
    
    /** [Method] Sorts this collection by keys
      * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
      * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
      */
    @JSGlobal("Ext.data.StoreMgr.sortByKey")
    @js.native
    def sortByKey(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.sortByKey")
    @js.native
    def sortByKey(direction: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.sortByKey")
    @js.native
    def sortByKey(direction: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.sortByKey")
    @js.native
    def sortByKey(direction: java.lang.String, fn: js.Any): Unit = js.native
    
    /** [Property] (Ext.util.MixedCollection) */
    @JSGlobal("Ext.data.StoreMgr.sorters")
    @js.native
    def sorters: IMixedCollection = js.native
    @scala.inline
    def sorters_=(x: IMixedCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorters")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.StoreMgr.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Collects all of the values of the given property and returns their sum
      * @param property String The property to sum by
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param start Number The record index to start at
      * @param end Number The record index to end at
      * @returns Number The total
      */
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(
      property: js.UndefOr[scala.Nothing],
      root: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], start: Double, end: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(
      property: js.UndefOr[scala.Nothing],
      root: java.lang.String,
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: js.UndefOr[scala.Nothing], root: java.lang.String, start: Double, end: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: java.lang.String): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(
      property: java.lang.String,
      root: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: java.lang.String, root: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: java.lang.String, root: js.UndefOr[scala.Nothing], start: Double, end: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: java.lang.String, root: java.lang.String): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: java.lang.String, root: java.lang.String, start: js.UndefOr[scala.Nothing], end: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: java.lang.String, root: java.lang.String, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.sum")
    @js.native
    def sum(property: java.lang.String, root: java.lang.String, start: Double, end: Double): Double = js.native
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    @JSGlobal("Ext.data.StoreMgr.suspendEvent")
    @js.native
    def suspendEvent(eventName: js.Any*): Unit = js.native
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    @JSGlobal("Ext.data.StoreMgr.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.suspendEvents")
    @js.native
    def suspendEvents(queueSuspended: Boolean): Unit = js.native
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @JSGlobal("Ext.data.StoreMgr.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.un")
    @js.native
    def un(eventName: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Unregisters one or more Stores with the StoreManager
      * @param stores String/Object... Any number of Store instances or ID-s
      */
    @JSGlobal("Ext.data.StoreMgr.unregister")
    @js.native
    def unregister(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.unregister")
    @js.native
    def unregister(stores: js.Any): Unit = js.native
    
    /** [Method] Change the key for an existing item in the collection
      * @param oldKey Object The old key
      * @param newKey Object The new key
      */
    @JSGlobal("Ext.data.StoreMgr.updateKey")
    @js.native
    def updateKey(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.updateKey")
    @js.native
    def updateKey(oldKey: js.UndefOr[scala.Nothing], newKey: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.updateKey")
    @js.native
    def updateKey(oldKey: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.updateKey")
    @js.native
    def updateKey(oldKey: js.Any, newKey: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.data.Types")
  @js.native
  class Types ()
    extends typings.extjs.Ext.data.Types
  /* static members */
  object Types {
    
    @JSGlobal("Ext.data.Types")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.AUTO")
    @js.native
    def AUTO: js.Any = js.native
    @scala.inline
    def AUTO_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.BOOL")
    @js.native
    def BOOL: js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.BOOLEAN")
    @js.native
    def BOOLEAN: js.Any = js.native
    @scala.inline
    def BOOLEAN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BOOL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOL")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.DATE")
    @js.native
    def DATE: js.Any = js.native
    @scala.inline
    def DATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.FLOAT")
    @js.native
    def FLOAT: js.Any = js.native
    @scala.inline
    def FLOAT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOAT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.INT")
    @js.native
    def INT: js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.INTEGER")
    @js.native
    def INTEGER: js.Any = js.native
    @scala.inline
    def INTEGER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def INT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.NUMBER")
    @js.native
    def NUMBER: js.Any = js.native
    @scala.inline
    def NUMBER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.STRING")
    @js.native
    def STRING: js.Any = js.native
    @scala.inline
    def STRING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.Types.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.Types.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.Types.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.Types.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.Types.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.Types.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.data.Types.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.Types.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.Types.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.data.Types.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.Types.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.Types.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.Types.stripRe")
    @js.native
    def stripRe: RegExp = js.native
    @scala.inline
    def stripRe_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripRe")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.Validations")
  @js.native
  class Validations ()
    extends typings.extjs.Ext.data.Validations
  /* static members */
  object Validations {
    
    @JSGlobal("Ext.data.Validations")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.Validations.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.Validations.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.Validations.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Validates that an email string is in the correct format
      * @param config Object Config object
      * @param email String The email address
      * @returns Boolean True if the value passes validation
      */
    @JSGlobal("Ext.data.Validations.email")
    @js.native
    def email(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.email")
    @js.native
    def email(config: js.UndefOr[scala.Nothing], email: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.email")
    @js.native
    def email(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.email")
    @js.native
    def email(config: js.Any, email: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.emailMessage")
    @js.native
    def emailMessage: java.lang.String = js.native
    @scala.inline
    def emailMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailMessage")(x.asInstanceOf[js.Any])
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.Validations.emailRe")
    @js.native
    def emailRe: RegExp = js.native
    @scala.inline
    def emailRe_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailRe")(x.asInstanceOf[js.Any])
    
    /** [Method] Validates that the given value is not present in the configured list
      * @param config Object Config object
      * @param value String The value to validate
      * @returns Boolean True if the value is not present in the list
      */
    @JSGlobal("Ext.data.Validations.exclusion")
    @js.native
    def exclusion(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.exclusion")
    @js.native
    def exclusion(config: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.exclusion")
    @js.native
    def exclusion(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.exclusion")
    @js.native
    def exclusion(config: js.Any, value: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.exclusionMessage")
    @js.native
    def exclusionMessage: java.lang.String = js.native
    @scala.inline
    def exclusionMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusionMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns true if the given value passes validation against the configured matcher regex
      * @param config Object Config object
      * @param value String The value to validate
      * @returns Boolean True if the value passes the format validation
      */
    @JSGlobal("Ext.data.Validations.format")
    @js.native
    def format(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.format")
    @js.native
    def format(config: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.format")
    @js.native
    def format(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.format")
    @js.native
    def format(config: js.Any, value: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.formatMessage")
    @js.native
    def formatMessage: java.lang.String = js.native
    @scala.inline
    def formatMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.data.Validations.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Validates that the given value is present in the configured list
      * @param config Object Config object
      * @param value String The value to validate
      * @returns Boolean True if the value is present in the list
      */
    @JSGlobal("Ext.data.Validations.inclusion")
    @js.native
    def inclusion(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.inclusion")
    @js.native
    def inclusion(config: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.inclusion")
    @js.native
    def inclusion(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.inclusion")
    @js.native
    def inclusion(config: js.Any, value: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.inclusionMessage")
    @js.native
    def inclusionMessage: java.lang.String = js.native
    @scala.inline
    def inclusionMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inclusionMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.Validations.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.data.Validations.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Returns true if the given value is between the configured min and max values
      * @param config Object Config object
      * @param value String The value to validate
      * @returns Boolean True if the value passes validation
      */
    @JSGlobal("Ext.data.Validations.length")
    @js.native
    def length(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.length")
    @js.native
    def length(config: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.length")
    @js.native
    def length(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.length")
    @js.native
    def length(config: js.Any, value: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.lengthMessage")
    @js.native
    def lengthMessage: java.lang.String = js.native
    @scala.inline
    def lengthMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lengthMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Validates that the given value is present
      * @param config Object Config object
      * @param value Object The value to validate
      * @returns Boolean True if validation passed
      */
    @JSGlobal("Ext.data.Validations.presence")
    @js.native
    def presence(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.presence")
    @js.native
    def presence(config: js.UndefOr[scala.Nothing], value: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.presence")
    @js.native
    def presence(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.presence")
    @js.native
    def presence(config: js.Any, value: js.Any): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.presenceMessage")
    @js.native
    def presenceMessage: java.lang.String = js.native
    @scala.inline
    def presenceMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("presenceMessage")(x.asInstanceOf[js.Any])
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.Validations.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.Validations.statics")
    @js.native
    def statics(): IClass = js.native
  }
}
