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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSGlobal("Ext.data.AbstractStore")
  @js.native
  class AbstractStore ()
    extends StObject
       with typings.extjs.Ext.data.AbstractStore
  /* static members */
  object AbstractStore {
    
    @JSGlobal("Ext.data.AbstractStore")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Creates a store from config object
      * @param store Object/Ext.data.AbstractStore A config for the store to be created. It may contain a type field which defines the particular type of store to create. Alteratively passing an actual store to this method will just return it, no changes made.
      * @returns Ext.data.AbstractStore The created store.
      */
    inline def create(): IAbstractStore = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IAbstractStore]
    inline def create(store: js.Any): IAbstractStore = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any]).asInstanceOf[IAbstractStore]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.data.IdGenerator")
  @js.native
  class IdGenerator ()
    extends StObject
       with typings.extjs.Ext.data.IdGenerator
  /* static members */
  object IdGenerator {
    
    @JSGlobal("Ext.data.IdGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the IdGenerator given its config description
      * @param config String/Object If this parameter is an IdGenerator instance, it is simply returned. If this is a string, it is first used as an id for lookup and then, if there is no match, as a type to create a new instance. This parameter can also be a config object that contains a type property (among others) that are used to create and configure the instance.
      */
    inline def get(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Unit]
    inline def get(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.data.JsonP")
  @js.native
  class JsonP ()
    extends StObject
       with typings.extjs.Ext.data.JsonP
  /* static members */
  object JsonP {
    
    @JSGlobal("Ext.data.JsonP")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Abort a request
      * @param request Object/String The request to abort
      */
    inline def abort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[Unit]
    inline def abort(request: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.JsonP.callbackKey")
    @js.native
    def callbackKey: java.lang.String = js.native
    inline def callbackKey_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.JsonP.disableCaching")
    @js.native
    def disableCaching: Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.JsonP.disableCachingParam")
    @js.native
    def disableCachingParam: java.lang.String = js.native
    inline def disableCachingParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(x.asInstanceOf[js.Any])
    
    inline def disableCaching_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Makes a JSONP request
      * @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.  url : String The URL to request. params : Object (Optional)An object containing a series of key value pairs that will be sent along with the request. timeout : Number (Optional) See timeout callbackKey : String (Optional) See callbackKey callbackName : String (Optional) The function name to use for this request. By default this name will be auto-generated: Ext.data.JsonP.callback1, Ext.data.JsonP.callback2, etc. Setting this option to "my_name" will force the function name to be Ext.data.JsonP.my_name. Use this if you want deterministic behavior, but be careful - the callbackName should be different in each JsonP request that you make. disableCaching : Boolean (Optional) See disableCaching disableCachingParam : String (Optional) See disableCachingParam success : Function (Optional) A function to execute if the request succeeds. failure : Function (Optional) A function to execute if the request fails. callback : Function (Optional) A function to execute when the request completes, whether it is a success or failure. scope : Object (Optional)The scope in which to execute the callbacks: The "this" object for the callback function. Defaults to the browser window.
      * @returns Object request An object containing the request details.
      */
    inline def request(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[js.Any]
    inline def request(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.JsonP.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.data.JsonP.timeout")
    @js.native
    def timeout: Double = js.native
    inline def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.Model")
  @js.native
  class Model ()
    extends StObject
       with typings.extjs.Ext.data.Model
  /* static members */
  object Model {
    
    @JSGlobal("Ext.data.Model")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns an Array of Field definitions which define this Model s structure Fields are sorted upon Model class definit
      * @returns Ext.data.Field[] The defined Fields for this Model.
      */
    inline def getFields(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getFields")().asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the configured Proxy for this Model
      * @returns Ext.data.proxy.Proxy The proxy
      */
    inline def getProxy(): IProxy = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxy")().asInstanceOf[IProxy]
    
    /** [Method] Generates a sequential id
      * @param rec Ext.data.Model The record being created. The record does not exist, it's a phantom.
      * @returns String auto-generated string id, "ext-record-i++";
      */
    inline def id(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[java.lang.String]
    inline def id(rec: IModel): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(rec.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Asynchronously loads a model instance by id
      * @param id Number/String The id of the model to load
      * @param config Object config object containing success, failure and callback functions, plus optional scope
      */
    inline def load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Unit]
    inline def load(id: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load(id: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Unit, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Apply a new set of field and or property definitions to the existing model
      * @param fields Object
      * @param idProperty Object
      * @param clientIdProperty Object
      */
    inline def setFields(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFields")().asInstanceOf[Unit]
    inline def setFields(fields: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setFields(fields: js.Any, idProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: js.Any, idProperty: js.Any, clientIdProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any], clientIdProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: js.Any, idProperty: Unit, clientIdProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any], clientIdProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: Unit, idProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: Unit, idProperty: js.Any, clientIdProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any], clientIdProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: Unit, idProperty: Unit, clientIdProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any], clientIdProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Sets the Proxy to use for this model
      * @param proxy String/Object/Ext.data.proxy.Proxy The proxy
      * @returns Ext.data.proxy.Proxy
      */
    inline def setProxy(): IProxy = ^.asInstanceOf[js.Dynamic].applyDynamic("setProxy")().asInstanceOf[IProxy]
    inline def setProxy(proxy: js.Any): IProxy = ^.asInstanceOf[js.Dynamic].applyDynamic("setProxy")(proxy.asInstanceOf[js.Any]).asInstanceOf[IProxy]
  }
  
  @JSGlobal("Ext.data.NodeInterface")
  @js.native
  class NodeInterface ()
    extends StObject
       with typings.extjs.Ext.data.NodeInterface
  /* static members */
  object NodeInterface {
    
    @JSGlobal("Ext.data.NodeInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method allows you to decorate a Model s class to implement the NodeInterface
      * @param modelClass Ext.Class/Ext.data.Model The Model class or an instance of the Model class you want to decorate the prototype of.
      */
    inline def decorate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")().asInstanceOf[Unit]
    inline def decorate(modelClass: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(modelClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.data.Record")
  @js.native
  class Record ()
    extends StObject
       with typings.extjs.Ext.data.Record
  /* static members */
  object Record {
    
    @JSGlobal("Ext.data.Record")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns an Array of Field definitions which define this Model s structure Fields are sorted upon Model class definit
      * @returns Ext.data.Field[] The defined Fields for this Model.
      */
    inline def getFields(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getFields")().asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the configured Proxy for this Model
      * @returns Ext.data.proxy.Proxy The proxy
      */
    inline def getProxy(): IProxy = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxy")().asInstanceOf[IProxy]
    
    /** [Method] Generates a sequential id
      * @param rec Ext.data.Model The record being created. The record does not exist, it's a phantom.
      * @returns String auto-generated string id, "ext-record-i++";
      */
    inline def id(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[java.lang.String]
    inline def id(rec: IModel): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(rec.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Asynchronously loads a model instance by id
      * @param id Number/String The id of the model to load
      * @param config Object config object containing success, failure and callback functions, plus optional scope
      */
    inline def load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Unit]
    inline def load(id: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load(id: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Unit, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Apply a new set of field and or property definitions to the existing model
      * @param fields Object
      * @param idProperty Object
      * @param clientIdProperty Object
      */
    inline def setFields(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFields")().asInstanceOf[Unit]
    inline def setFields(fields: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setFields(fields: js.Any, idProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: js.Any, idProperty: js.Any, clientIdProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any], clientIdProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: js.Any, idProperty: Unit, clientIdProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any], clientIdProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: Unit, idProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: Unit, idProperty: js.Any, clientIdProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any], clientIdProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFields(fields: Unit, idProperty: Unit, clientIdProperty: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFields")(fields.asInstanceOf[js.Any], idProperty.asInstanceOf[js.Any], clientIdProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Sets the Proxy to use for this model
      * @param proxy String/Object/Ext.data.proxy.Proxy The proxy
      * @returns Ext.data.proxy.Proxy
      */
    inline def setProxy(): IProxy = ^.asInstanceOf[js.Dynamic].applyDynamic("setProxy")().asInstanceOf[IProxy]
    inline def setProxy(proxy: js.Any): IProxy = ^.asInstanceOf[js.Dynamic].applyDynamic("setProxy")(proxy.asInstanceOf[js.Any]).asInstanceOf[IProxy]
  }
  
  @JSGlobal("Ext.data.SortTypes")
  @js.native
  class SortTypes ()
    extends StObject
       with typings.extjs.Ext.data.SortTypes
  /* static members */
  object SortTypes {
    
    @JSGlobal("Ext.data.SortTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Date sorting
      * @param s Object The value being converted
      * @returns Number The comparison value
      */
    inline def asDate(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asDate")().asInstanceOf[Double]
    inline def asDate(s: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asDate")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Float sorting
      * @param s Object The value being converted
      * @returns Number The comparison value
      */
    inline def asFloat(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asFloat")().asInstanceOf[Double]
    inline def asFloat(s: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asFloat")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Integer sorting
      * @param s Object The value being converted
      * @returns Number The comparison value
      */
    inline def asInt(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asInt")().asInstanceOf[Double]
    inline def asInt(s: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asInt")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Strips all HTML tags to sort on text only
      * @param s Object The value being converted
      * @returns String The comparison value
      */
    inline def asText(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asText")().asInstanceOf[java.lang.String]
    inline def asText(s: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asText")(s.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Case insensitive string
      * @param s Object The value being converted
      * @returns String The comparison value
      */
    inline def asUCString(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asUCString")().asInstanceOf[java.lang.String]
    inline def asUCString(s: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asUCString")(s.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Strips all HTML tags to sort on text only  Case insensitive
      * @param s Object The value being converted
      * @returns String The comparison value
      */
    inline def asUCText(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asUCText")().asInstanceOf[java.lang.String]
    inline def asUCText(s: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asUCText")(s.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Default sort that does nothing
      * @param s Object The value being converted
      * @returns Object The comparison value
      */
    inline def none(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[js.Any]
    inline def none(s: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(s.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.SortTypes.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.SortTypes.stripTagsRE")
    @js.native
    def stripTagsRE: RegExp = js.native
    inline def stripTagsRE_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripTagsRE")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.StoreManager")
  @js.native
  class StoreManager ()
    extends StObject
       with typings.extjs.Ext.data.StoreManager
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
    inline def add(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[js.Any]
    inline def add(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def add(key: js.Any, obj: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def add(key: Unit, obj: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
      */
    inline def addAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")().asInstanceOf[Unit]
    inline def addAll(objs: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(objs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
    inline def addEvents(eventNames: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    inline def addListener(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    inline def addManagedListener(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes all items from the collection  */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method] Removes all managed listeners for this object  */
    inline def clearManagedListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearManagedListeners")().asInstanceOf[Unit]
    
    /** [Method] Collects unique values of a particular property in this MixedCollection
      * @param property String The property to collect on
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
      * @returns Array The unique values
      */
    inline def collect(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")().asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: java.lang.String, root: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: java.lang.String, root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], allowBlank.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: java.lang.String, root: Unit, allowBlank: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], allowBlank.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: Unit, root: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: Unit, root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], allowBlank.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: Unit, root: Unit, allowBlank: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], allowBlank.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param o Object The Object to look for in the collection.
      * @returns Boolean True if the collection contains the Object as an item.
      */
    inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
    inline def contains(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean True if the collection contains the Object as a key.
      */
    inline def containsKey(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")().asInstanceOf[Boolean]
    inline def containsKey(key: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
    inline def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    inline def eachKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")().asInstanceOf[Unit]
    inline def eachKey(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def eachKey(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eachKey(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    inline def enableBubble(eventNames: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
      * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
      * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
      * @param anyMatch Boolean True to match any part of the string, not just the beginning
      * @param caseSensitive Boolean True for case sensitive comparison.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    inline def filter(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: js.Any, anyMatch: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: js.Any, anyMatch: Unit, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: Unit, anyMatch: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: Unit, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: Unit, anyMatch: Unit, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: js.Any, anyMatch: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: js.Any, anyMatch: Unit, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: Unit, anyMatch: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: Unit, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: Unit, anyMatch: Unit, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    inline def filterBy(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")().asInstanceOf[IMixedCollection]
    inline def filterBy(fn: js.Any): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    inline def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filterBy(fn: Unit, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
    inline def find(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[Unit]
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
      */
    inline def findBy(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")().asInstanceOf[js.Any]
    inline def findBy(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def findBy(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def findBy(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Finds the index of the first matching object in this collection by a specific property value
      * @param property String The name of a property on your objects.
      * @param value String/RegExp A string that the property values should start with or a RegExp to test against the property.
      * @param start Number The index to start searching at.
      * @param anyMatch Boolean True to match any part of the string, not just the beginning.
      * @param caseSensitive Boolean True for case sensitive comparison.
      * @returns Number The matched index or -1
      */
    inline def findIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")().asInstanceOf[Double]
    inline def findIndex(property: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Double, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(
      property: java.lang.String,
      value: js.Any,
      start: Double,
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Double, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Unit, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Unit, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Unit, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Double, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Double, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Double, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Unit, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Unit, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Unit, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Double, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Double, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Double, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Unit, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Unit, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Unit, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Double, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Double, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Double, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Unit, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Unit, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Unit, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Find the index of the first matching object in this collection by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @param start Number The index to start searching at.
      * @returns Number The matched index or -1
      */
    inline def findIndexBy(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")().asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
      * @param newItem Object The new object to find the insertion position of.
      * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
      * @returns Number The insertion point to add the new item into this MixedCollection at using insert
      */
    inline def findInsertionIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")().asInstanceOf[Double]
    inline def findInsertionIndex(newItem: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(newItem.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findInsertionIndex(newItem: js.Any, sorterFn: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(newItem.asInstanceOf[js.Any], sorterFn.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findInsertionIndex(newItem: Unit, sorterFn: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(newItem.asInstanceOf[js.Any], sorterFn.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    inline def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    inline def fireEventArgs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")().asInstanceOf[Boolean]
    inline def fireEventArgs(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def fireEventArgs(eventName: Unit, args: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection..
      */
    inline def first(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.Any]
    
    /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
    inline def generateComparator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateComparator")().asInstanceOf[Unit]
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    inline def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
    inline def get(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    inline def getAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")().asInstanceOf[js.Any]
    inline def getAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    inline def getByKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")().asInstanceOf[js.Any]
    inline def getByKey(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    inline def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
    
    /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
      * @returns Ext.util.Sorter The sorter, null if none exist
      */
    inline def getFirstSorter(): ISorter = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstSorter")().asInstanceOf[ISorter]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] getKey implementation for MixedCollection
      * @param o Object
      * @returns Object The key for the passed item.
      */
    inline def getKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")().asInstanceOf[js.Any]
    inline def getKey(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a range of items in this collection
      * @param startIndex Number The starting index. Defaults to 0.
      * @param endIndex Number The ending index. Defaults to the last item.
      * @returns Array An array of items
      */
    inline def getRange(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")().asInstanceOf[typings.extjs.Ext.Array]
    inline def getRange(startIndex: Double): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(startIndex.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRange(startIndex: Double, endIndex: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRange(startIndex: Unit, endIndex: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreManager.hasListeners")
    @js.native
    def hasListeners: js.Any = js.native
    inline def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns index within the collection of the passed Object
      * @param o Object The item to find the index of.
      * @returns Number index of the item. Returns -1 if not found.
      */
    inline def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
    inline def indexOf(o: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(o.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number index of the key.
      */
    inline def indexOfKey(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")().asInstanceOf[Double]
    inline def indexOfKey(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Performs initialization of this mixin  */
    inline def initSortable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initSortable")().asInstanceOf[Unit]
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Number The index to insert the item at.
      * @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
      * @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
      * @returns Object The item inserted or an array of items inserted.
      */
    inline def insert(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[js.Any]
    inline def insert(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def insert(index: Double, key: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Double, key: js.Any, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Double, key: Unit, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: js.Any, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: Unit, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.isMixedCollection")
    @js.native
    def isMixedCollection: Boolean = js.native
    inline def isMixedCollection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMixedCollection")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.isObservable")
    @js.native
    def isObservable: Boolean = js.native
    inline def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.isSortable")
    @js.native
    def isSortable: Boolean = js.native
    inline def isSortable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection..
      */
    inline def last(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.Any]
    
    /** [Method] Gets a registered Store by id
      * @param store String/Object The id of the Store, or a Store instance, or a store configuration
      * @returns Ext.data.Store
      */
    inline def lookup(): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")().asInstanceOf[IStore]
    inline def lookup(store: js.Any): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(store.asInstanceOf[js.Any]).asInstanceOf[IStore]
    
    /** [Method] Shorthand for addManagedListener
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    inline def mon(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[js.Any]
    inline def mon(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
    inline def mun(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    inline def on(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[js.Any]
    inline def on(eventName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Registers one or more Stores with the StoreManager
      * @param stores Ext.data.Store... Any number of Store instances
      */
    inline def register(stores: IStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    inline def relayEvents(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[js.Any]
    inline def relayEvents(origin: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def relayEvents(origin: js.Any, events: Unit, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: Unit, events: Unit, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: Unit, events: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: Unit, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Remove an item from the collection
      * @param o Object The item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    inline def remove(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[js.Any]
    inline def remove(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Remove all items in the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    inline def removeAll(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[IMixedCollection]
    inline def removeAll(items: typings.extjs.Ext.Array): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(items.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    inline def removeAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")().asInstanceOf[js.Any]
    inline def removeAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes an item associated with the passed key fom the collection
      * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
      * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
      */
    inline def removeAtKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")().asInstanceOf[js.Any]
    inline def removeAtKey(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
    inline def removeListener(eventName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeListener(eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Remove a range of items starting at a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @param removeCount Number The nuber of items to remove beginning at the specified index.
      * @returns Object The last item removed or false if no item was removed.
      */
    inline def removeRange(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRange")().asInstanceOf[js.Any]
    inline def removeRange(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRange")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def removeRange(index: Double, removeCount: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeRange")(index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def removeRange(index: Unit, removeCount: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeRange")(index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Reorders each of the items based on a mapping from old index to new index
      * @param mapping Object Mapping from old item index to new item index
      */
    inline def reorder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reorder")().asInstanceOf[Unit]
    inline def reorder(mapping: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reorder")(mapping.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Replaces an item in the collection
      * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    inline def replace(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[js.Any]
    inline def replace(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def replace(key: java.lang.String, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def replace(key: Unit, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    inline def resumeEvent(eventName: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents */
    inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.StoreManager.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sorts the data in the Store by one or more of its properties
      * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
      * @param direction String The overall direction to sort the data by.
      * @returns Ext.util.Sorter[]
      */
    inline def sort(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typings.extjs.Ext.Array]
    inline def sort(sorters: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def sort(sorters: js.Any, direction: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def sort(sorters: Unit, direction: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Sorts the collection by a single sorter function
      * @param sorterFn Function The function to sort by
      */
    inline def sortBy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")().asInstanceOf[Unit]
    inline def sortBy(sorterFn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(sorterFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sorts this collection by keys
      * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
      * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
      */
    inline def sortByKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")().asInstanceOf[Unit]
    inline def sortByKey(direction: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")(direction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sortByKey(direction: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")(direction.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sortByKey(direction: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")(direction.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.util.MixedCollection) */
    @JSGlobal("Ext.data.StoreManager.sorters")
    @js.native
    def sorters: IMixedCollection = js.native
    inline def sorters_=(x: IMixedCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorters")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Collects all of the values of the given property and returns their sum
      * @param property String The property to sum by
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param start Number The record index to start at
      * @param end Number The record index to end at
      * @returns Number The total
      */
    inline def sum(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")().asInstanceOf[Double]
    inline def sum(property: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: java.lang.String, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: java.lang.String, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: java.lang.String, start: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: Unit, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: Unit, start: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: java.lang.String, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: java.lang.String, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: java.lang.String, start: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: Unit, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: Unit, start: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    inline def suspendEvent(eventName: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
    inline def suspendEvents(queueSuspended: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")(queueSuspended.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
    inline def un(eventName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def un(eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Unregisters one or more Stores with the StoreManager
      * @param stores String/Object... Any number of Store instances or ID-s
      */
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    inline def unregister(stores: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Change the key for an existing item in the collection
      * @param oldKey Object The old key
      * @param newKey Object The new key
      */
    inline def updateKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")().asInstanceOf[Unit]
    inline def updateKey(oldKey: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")(oldKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def updateKey(oldKey: js.Any, newKey: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")(oldKey.asInstanceOf[js.Any], newKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updateKey(oldKey: Unit, newKey: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")(oldKey.asInstanceOf[js.Any], newKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.data.StoreMgr")
  @js.native
  class StoreMgr ()
    extends StObject
       with typings.extjs.Ext.data.StoreMgr
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
    inline def add(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[js.Any]
    inline def add(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def add(key: js.Any, obj: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def add(key: Unit, obj: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
      */
    inline def addAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")().asInstanceOf[Unit]
    inline def addAll(objs: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(objs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
    inline def addEvents(eventNames: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    inline def addListener(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    inline def addManagedListener(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes all items from the collection  */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method] Removes all managed listeners for this object  */
    inline def clearManagedListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearManagedListeners")().asInstanceOf[Unit]
    
    /** [Method] Collects unique values of a particular property in this MixedCollection
      * @param property String The property to collect on
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
      * @returns Array The unique values
      */
    inline def collect(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")().asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: java.lang.String, root: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: java.lang.String, root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], allowBlank.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: java.lang.String, root: Unit, allowBlank: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], allowBlank.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: Unit, root: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: Unit, root: java.lang.String, allowBlank: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], allowBlank.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def collect(property: Unit, root: Unit, allowBlank: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("collect")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], allowBlank.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param o Object The Object to look for in the collection.
      * @returns Boolean True if the collection contains the Object as an item.
      */
    inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
    inline def contains(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean True if the collection contains the Object as a key.
      */
    inline def containsKey(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")().asInstanceOf[Boolean]
    inline def containsKey(key: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
    inline def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    inline def eachKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")().asInstanceOf[Unit]
    inline def eachKey(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def eachKey(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eachKey(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    inline def enableBubble(eventNames: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
      * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
      * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
      * @param anyMatch Boolean True to match any part of the string, not just the beginning
      * @param caseSensitive Boolean True for case sensitive comparison.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    inline def filter(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: js.Any, anyMatch: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: js.Any, anyMatch: Unit, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: Unit, anyMatch: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: Unit, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: js.Any, value: Unit, anyMatch: Unit, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: js.Any, anyMatch: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: js.Any, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: js.Any, anyMatch: Unit, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: Unit, anyMatch: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: Unit, anyMatch: Boolean, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filter(property: Unit, value: Unit, anyMatch: Unit, caseSensitive: Boolean): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    inline def filterBy(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")().asInstanceOf[IMixedCollection]
    inline def filterBy(fn: js.Any): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    inline def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filterBy(fn: Unit, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
    inline def find(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[Unit]
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
      */
    inline def findBy(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")().asInstanceOf[js.Any]
    inline def findBy(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def findBy(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def findBy(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Finds the index of the first matching object in this collection by a specific property value
      * @param property String The name of a property on your objects.
      * @param value String/RegExp A string that the property values should start with or a RegExp to test against the property.
      * @param start Number The index to start searching at.
      * @param anyMatch Boolean True to match any part of the string, not just the beginning.
      * @param caseSensitive Boolean True for case sensitive comparison.
      * @returns Number The matched index or -1
      */
    inline def findIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")().asInstanceOf[Double]
    inline def findIndex(property: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Double, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(
      property: java.lang.String,
      value: js.Any,
      start: Double,
      anyMatch: Boolean,
      caseSensitive: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Double, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Unit, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Unit, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: js.Any, start: Unit, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Double, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Double, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Double, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Unit, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Unit, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: java.lang.String, value: Unit, start: Unit, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Double, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Double, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Double, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Unit, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Unit, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: js.Any, start: Unit, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Double, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Double, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Double, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Unit, anyMatch: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Unit, anyMatch: Boolean, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex(property: Unit, value: Unit, start: Unit, anyMatch: Unit, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Find the index of the first matching object in this collection by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @param start Number The index to start searching at.
      * @returns Number The matched index or -1
      */
    inline def findIndexBy(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")().asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
      * @param newItem Object The new object to find the insertion position of.
      * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
      * @returns Number The insertion point to add the new item into this MixedCollection at using insert
      */
    inline def findInsertionIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")().asInstanceOf[Double]
    inline def findInsertionIndex(newItem: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(newItem.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findInsertionIndex(newItem: js.Any, sorterFn: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(newItem.asInstanceOf[js.Any], sorterFn.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findInsertionIndex(newItem: Unit, sorterFn: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(newItem.asInstanceOf[js.Any], sorterFn.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    inline def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    inline def fireEventArgs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")().asInstanceOf[Boolean]
    inline def fireEventArgs(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def fireEventArgs(eventName: Unit, args: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection..
      */
    inline def first(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.Any]
    
    /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
    inline def generateComparator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateComparator")().asInstanceOf[Unit]
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    inline def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
    inline def get(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    inline def getAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")().asInstanceOf[js.Any]
    inline def getAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    inline def getByKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")().asInstanceOf[js.Any]
    inline def getByKey(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    inline def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
    
    /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
      * @returns Ext.util.Sorter The sorter, null if none exist
      */
    inline def getFirstSorter(): ISorter = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstSorter")().asInstanceOf[ISorter]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] getKey implementation for MixedCollection
      * @param o Object
      * @returns Object The key for the passed item.
      */
    inline def getKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")().asInstanceOf[js.Any]
    inline def getKey(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a range of items in this collection
      * @param startIndex Number The starting index. Defaults to 0.
      * @param endIndex Number The ending index. Defaults to the last item.
      * @returns Array An array of items
      */
    inline def getRange(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")().asInstanceOf[typings.extjs.Ext.Array]
    inline def getRange(startIndex: Double): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(startIndex.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRange(startIndex: Double, endIndex: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRange(startIndex: Unit, endIndex: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreMgr.hasListeners")
    @js.native
    def hasListeners: js.Any = js.native
    inline def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns index within the collection of the passed Object
      * @param o Object The item to find the index of.
      * @returns Number index of the item. Returns -1 if not found.
      */
    inline def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
    inline def indexOf(o: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(o.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number index of the key.
      */
    inline def indexOfKey(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")().asInstanceOf[Double]
    inline def indexOfKey(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Performs initialization of this mixin  */
    inline def initSortable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initSortable")().asInstanceOf[Unit]
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Number The index to insert the item at.
      * @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
      * @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
      * @returns Object The item inserted or an array of items inserted.
      */
    inline def insert(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[js.Any]
    inline def insert(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def insert(index: Double, key: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Double, key: js.Any, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Double, key: Unit, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: js.Any, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: Unit, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.isMixedCollection")
    @js.native
    def isMixedCollection: Boolean = js.native
    inline def isMixedCollection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMixedCollection")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.isObservable")
    @js.native
    def isObservable: Boolean = js.native
    inline def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.isSortable")
    @js.native
    def isSortable: Boolean = js.native
    inline def isSortable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection..
      */
    inline def last(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.Any]
    
    /** [Method] Gets a registered Store by id
      * @param store String/Object The id of the Store, or a Store instance, or a store configuration
      * @returns Ext.data.Store
      */
    inline def lookup(): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")().asInstanceOf[IStore]
    inline def lookup(store: js.Any): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(store.asInstanceOf[js.Any]).asInstanceOf[IStore]
    
    /** [Method] Shorthand for addManagedListener
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    inline def mon(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[js.Any]
    inline def mon(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: js.Any, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mon(item: Unit, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
    inline def mun(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(item: Unit, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    inline def on(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[js.Any]
    inline def on(eventName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Registers one or more Stores with the StoreManager
      * @param stores Ext.data.Store... Any number of Store instances
      */
    inline def register(stores: IStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    inline def relayEvents(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[js.Any]
    inline def relayEvents(origin: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def relayEvents(origin: js.Any, events: Unit, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: Unit, events: Unit, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: Unit, events: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def relayEvents(origin: Unit, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Remove an item from the collection
      * @param o Object The item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    inline def remove(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[js.Any]
    inline def remove(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Remove all items in the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    inline def removeAll(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[IMixedCollection]
    inline def removeAll(items: typings.extjs.Ext.Array): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(items.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    inline def removeAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")().asInstanceOf[js.Any]
    inline def removeAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes an item associated with the passed key fom the collection
      * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
      * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
      */
    inline def removeAtKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")().asInstanceOf[js.Any]
    inline def removeAtKey(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
    inline def removeListener(eventName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeListener(eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Remove a range of items starting at a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @param removeCount Number The nuber of items to remove beginning at the specified index.
      * @returns Object The last item removed or false if no item was removed.
      */
    inline def removeRange(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRange")().asInstanceOf[js.Any]
    inline def removeRange(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRange")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def removeRange(index: Double, removeCount: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeRange")(index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def removeRange(index: Unit, removeCount: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeRange")(index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Reorders each of the items based on a mapping from old index to new index
      * @param mapping Object Mapping from old item index to new item index
      */
    inline def reorder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reorder")().asInstanceOf[Unit]
    inline def reorder(mapping: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reorder")(mapping.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Replaces an item in the collection
      * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    inline def replace(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[js.Any]
    inline def replace(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def replace(key: java.lang.String, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def replace(key: Unit, o: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(key.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    inline def resumeEvent(eventName: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents */
    inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.StoreMgr.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sorts the data in the Store by one or more of its properties
      * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
      * @param direction String The overall direction to sort the data by.
      * @returns Ext.util.Sorter[]
      */
    inline def sort(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typings.extjs.Ext.Array]
    inline def sort(sorters: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def sort(sorters: js.Any, direction: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def sort(sorters: Unit, direction: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Sorts the collection by a single sorter function
      * @param sorterFn Function The function to sort by
      */
    inline def sortBy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")().asInstanceOf[Unit]
    inline def sortBy(sorterFn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(sorterFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sorts this collection by keys
      * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
      * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
      */
    inline def sortByKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")().asInstanceOf[Unit]
    inline def sortByKey(direction: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")(direction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sortByKey(direction: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")(direction.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sortByKey(direction: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")(direction.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.util.MixedCollection) */
    @JSGlobal("Ext.data.StoreMgr.sorters")
    @js.native
    def sorters: IMixedCollection = js.native
    inline def sorters_=(x: IMixedCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorters")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Collects all of the values of the given property and returns their sum
      * @param property String The property to sum by
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param start Number The record index to start at
      * @param end Number The record index to end at
      * @returns Number The total
      */
    inline def sum(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")().asInstanceOf[Double]
    inline def sum(property: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: java.lang.String, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: java.lang.String, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: java.lang.String, start: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: Unit, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: java.lang.String, root: Unit, start: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: java.lang.String, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: java.lang.String, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: java.lang.String, start: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: Unit, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sum(property: Unit, root: Unit, start: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(property.asInstanceOf[js.Any], root.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    inline def suspendEvent(eventName: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
    inline def suspendEvents(queueSuspended: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")(queueSuspended.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
    inline def un(eventName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def un(eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Unregisters one or more Stores with the StoreManager
      * @param stores String/Object... Any number of Store instances or ID-s
      */
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    inline def unregister(stores: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Change the key for an existing item in the collection
      * @param oldKey Object The old key
      * @param newKey Object The new key
      */
    inline def updateKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")().asInstanceOf[Unit]
    inline def updateKey(oldKey: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")(oldKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def updateKey(oldKey: js.Any, newKey: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")(oldKey.asInstanceOf[js.Any], newKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updateKey(oldKey: Unit, newKey: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")(oldKey.asInstanceOf[js.Any], newKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.data.Types")
  @js.native
  class Types ()
    extends StObject
       with typings.extjs.Ext.data.Types
  /* static members */
  object Types {
    
    @JSGlobal("Ext.data.Types")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.AUTO")
    @js.native
    def AUTO: js.Any = js.native
    inline def AUTO_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.BOOL")
    @js.native
    def BOOL: js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.BOOLEAN")
    @js.native
    def BOOLEAN: js.Any = js.native
    inline def BOOLEAN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
    
    inline def BOOL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOL")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.DATE")
    @js.native
    def DATE: js.Any = js.native
    inline def DATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.FLOAT")
    @js.native
    def FLOAT: js.Any = js.native
    inline def FLOAT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOAT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.INT")
    @js.native
    def INT: js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.INTEGER")
    @js.native
    def INTEGER: js.Any = js.native
    inline def INTEGER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER")(x.asInstanceOf[js.Any])
    
    inline def INT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.NUMBER")
    @js.native
    def NUMBER: js.Any = js.native
    inline def NUMBER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.STRING")
    @js.native
    def STRING: js.Any = js.native
    inline def STRING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.Types.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.Types.stripRe")
    @js.native
    def stripRe: RegExp = js.native
    inline def stripRe_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripRe")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.Validations")
  @js.native
  class Validations ()
    extends StObject
       with typings.extjs.Ext.data.Validations
  /* static members */
  object Validations {
    
    @JSGlobal("Ext.data.Validations")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Validates that an email string is in the correct format
      * @param config Object Config object
      * @param email String The email address
      * @returns Boolean True if the value passes validation
      */
    inline def email(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[Boolean]
    inline def email(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def email(config: js.Any, email: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("email")(config.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def email(config: Unit, email: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("email")(config.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.emailMessage")
    @js.native
    def emailMessage: java.lang.String = js.native
    inline def emailMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailMessage")(x.asInstanceOf[js.Any])
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.Validations.emailRe")
    @js.native
    def emailRe: RegExp = js.native
    inline def emailRe_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailRe")(x.asInstanceOf[js.Any])
    
    /** [Method] Validates that the given value is not present in the configured list
      * @param config Object Config object
      * @param value String The value to validate
      * @returns Boolean True if the value is not present in the list
      */
    inline def exclusion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exclusion")().asInstanceOf[Boolean]
    inline def exclusion(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exclusion")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def exclusion(config: js.Any, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exclusion")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def exclusion(config: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exclusion")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.exclusionMessage")
    @js.native
    def exclusionMessage: java.lang.String = js.native
    inline def exclusionMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusionMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns true if the given value passes validation against the configured matcher regex
      * @param config Object Config object
      * @param value String The value to validate
      * @returns Boolean True if the value passes the format validation
      */
    inline def format(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[Boolean]
    inline def format(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def format(config: js.Any, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def format(config: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.formatMessage")
    @js.native
    def formatMessage: java.lang.String = js.native
    inline def formatMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Validates that the given value is present in the configured list
      * @param config Object Config object
      * @param value String The value to validate
      * @returns Boolean True if the value is present in the list
      */
    inline def inclusion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inclusion")().asInstanceOf[Boolean]
    inline def inclusion(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inclusion")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def inclusion(config: js.Any, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inclusion")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def inclusion(config: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inclusion")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.inclusionMessage")
    @js.native
    def inclusionMessage: java.lang.String = js.native
    inline def inclusionMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inclusionMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Returns true if the given value is between the configured min and max values
      * @param config Object Config object
      * @param value String The value to validate
      * @returns Boolean True if the value passes validation
      */
    inline def length(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("length")().asInstanceOf[Boolean]
    inline def length(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def length(config: js.Any, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def length(config: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.lengthMessage")
    @js.native
    def lengthMessage: java.lang.String = js.native
    inline def lengthMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lengthMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Validates that the given value is present
      * @param config Object Config object
      * @param value Object The value to validate
      * @returns Boolean True if validation passed
      */
    inline def presence(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("presence")().asInstanceOf[Boolean]
    inline def presence(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("presence")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def presence(config: js.Any, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("presence")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def presence(config: Unit, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("presence")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.presenceMessage")
    @js.native
    def presenceMessage: java.lang.String = js.native
    inline def presenceMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("presenceMessage")(x.asInstanceOf[js.Any])
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.Validations.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
}
