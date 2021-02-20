package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.direct.IProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object direct {
  
  @JSGlobal("Ext.direct.Manager")
  @js.native
  class Manager ()
    extends typings.extjs.Ext.direct.Manager
  /* static members */
  object Manager {
    
    @JSGlobal("Ext.direct.Manager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    @JSGlobal("Ext.direct.Manager.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addListener")
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
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Adds an Ext Direct Provider and creates the proxy or stub methods to execute server side methods
      * @param provider Ext.direct.Provider/Object... Accepts any number of Provider descriptions (an instance or config object for a Provider). Each Provider description instructs Ext.Direct how to create client-side stub methods.
      */
    @JSGlobal("Ext.direct.Manager.addProvider")
    @js.native
    def addProvider(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.addProvider")
    @js.native
    def addProvider(provider: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.direct.Manager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.direct.Manager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.direct.Manager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    @JSGlobal("Ext.direct.Manager.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method] Removes all managed listeners for this object  */
    @JSGlobal("Ext.direct.Manager.clearManagedListeners")
    @js.native
    def clearManagedListeners(): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.direct.Manager.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.enableBubble")
    @js.native
    def enableBubble(eventNames: js.Any): Unit = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.direct.Manager.exceptions")
    @js.native
    def exceptions: js.Any = js.native
    @scala.inline
    def exceptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(x.asInstanceOf[js.Any])
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @JSGlobal("Ext.direct.Manager.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @JSGlobal("Ext.direct.Manager.fireEventArgs")
    @js.native
    def fireEventArgs(): Boolean = js.native
    @JSGlobal("Ext.direct.Manager.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): Boolean = js.native
    @JSGlobal("Ext.direct.Manager.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.direct.Manager.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.direct.Manager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Retrieves a provider by the id specified when the provider is added
      * @param id String/Ext.direct.Provider The id of the provider, or the provider instance.
      */
    @JSGlobal("Ext.direct.Manager.getProvider")
    @js.native
    def getProvider(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.getProvider")
    @js.native
    def getProvider(id: js.Any): Unit = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    @JSGlobal("Ext.direct.Manager.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.direct.Manager.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.direct.Manager.hasListeners")
    @js.native
    def hasListeners: js.Any = js.native
    @scala.inline
    def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.direct.Manager.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.direct.Manager.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.direct.Manager.isObservable")
    @js.native
    def isObservable: Boolean = js.native
    @scala.inline
    def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
    
    /** [Method] Shorthand for addManagedListener
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Parses a direct function
      * @param fn String/Function The direct function
      * @returns Function The function to use in the direct call. Null if not found
      */
    @JSGlobal("Ext.direct.Manager.parseMethod")
    @js.native
    def parseMethod(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.parseMethod")
    @js.native
    def parseMethod(fn: js.Any): js.Any = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    @JSGlobal("Ext.direct.Manager.relayEvents")
    @js.native
    def relayEvents(): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.relayEvents")
    @js.native
    def relayEvents(origin: js.Any): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.direct.Manager.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @JSGlobal("Ext.direct.Manager.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Removes the provider
      * @param provider String/Ext.direct.Provider The provider instance or the id of the provider.
      * @returns Ext.direct.Provider The provider, null if not found.
      */
    @JSGlobal("Ext.direct.Manager.removeProvider")
    @js.native
    def removeProvider(): IProvider = js.native
    @JSGlobal("Ext.direct.Manager.removeProvider")
    @js.native
    def removeProvider(provider: js.Any): IProvider = js.native
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    @JSGlobal("Ext.direct.Manager.resumeEvent")
    @js.native
    def resumeEvent(eventName: js.Any*): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents */
    @JSGlobal("Ext.direct.Manager.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.direct.Manager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.direct.Manager.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    @JSGlobal("Ext.direct.Manager.suspendEvent")
    @js.native
    def suspendEvent(eventName: js.Any*): Unit = js.native
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    @JSGlobal("Ext.direct.Manager.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.suspendEvents")
    @js.native
    def suspendEvents(queueSuspended: Boolean): Unit = js.native
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @JSGlobal("Ext.direct.Manager.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.direct.Manager.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.un")
    @js.native
    def un(eventName: java.lang.String): Unit = js.native
    @JSGlobal("Ext.direct.Manager.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.direct.Manager.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  }
}
