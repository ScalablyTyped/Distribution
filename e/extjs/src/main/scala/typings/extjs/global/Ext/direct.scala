package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.direct.IProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object direct {
  
  @JSGlobal("Ext.direct.Manager")
  @js.native
  class Manager ()
    extends StObject
       with typings.extjs.Ext.direct.Manager
  /* static members */
  object Manager {
    
    @JSGlobal("Ext.direct.Manager")
    @js.native
    val ^ : js.Any = js.native
    
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
    
    /** [Method] Adds an Ext Direct Provider and creates the proxy or stub methods to execute server side methods
      * @param provider Ext.direct.Provider/Object... Accepts any number of Provider descriptions (an instance or config object for a Provider). Each Provider description instructs Ext.Direct how to create client-side stub methods.
      */
    inline def addProvider(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addProvider")().asInstanceOf[Unit]
    inline def addProvider(provider: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method] Removes all managed listeners for this object  */
    inline def clearManagedListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearManagedListeners")().asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    inline def enableBubble(eventNames: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.direct.Manager.exceptions")
    @js.native
    def exceptions: js.Any = js.native
    inline def exceptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(x.asInstanceOf[js.Any])
    
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
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Retrieves a provider by the id specified when the provider is added
      * @param id String/Ext.direct.Provider The id of the provider, or the provider instance.
      */
    inline def getProvider(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvider")().asInstanceOf[Unit]
    inline def getProvider(id: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvider")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.direct.Manager.hasListeners")
    @js.native
    def hasListeners: js.Any = js.native
    inline def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.direct.Manager.isObservable")
    @js.native
    def isObservable: Boolean = js.native
    inline def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
    
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
    
    /** [Method] Parses a direct function
      * @param fn String/Function The direct function
      * @returns Function The function to use in the direct call. Null if not found
      */
    inline def parseMethod(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMethod")().asInstanceOf[js.Any]
    inline def parseMethod(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMethod")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
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
    
    /** [Method] Removes the provider
      * @param provider String/Ext.direct.Provider The provider instance or the id of the provider.
      * @returns Ext.direct.Provider The provider, null if not found.
      */
    inline def removeProvider(): IProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProvider")().asInstanceOf[IProvider]
    inline def removeProvider(provider: js.Any): IProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[IProvider]
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    inline def resumeEvent(eventName: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents */
    inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.direct.Manager.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
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
  }
}
