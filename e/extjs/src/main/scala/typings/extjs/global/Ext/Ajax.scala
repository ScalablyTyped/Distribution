package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Ajax")
@js.native
class Ajax ()
  extends typings.extjs.Ext.Ajax
/* static members */
object Ajax {
  
  @JSGlobal("Ext.Ajax")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Aborts an active request
    * @param request Object Defaults to the last request
    */
  @JSGlobal("Ext.Ajax.abort")
  @js.native
  def abort(): Unit = js.native
  @JSGlobal("Ext.Ajax.abort")
  @js.native
  def abort(request: js.Any): Unit = js.native
  
  /** [Method] Aborts all active requests */
  @JSGlobal("Ext.Ajax.abortAll")
  @js.native
  def abortAll(): Unit = js.native
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  @JSGlobal("Ext.Ajax.addEvents")
  @js.native
  def addEvents(): Unit = js.native
  @JSGlobal("Ext.Ajax.addEvents")
  @js.native
  def addEvents(eventNames: js.Any): Unit = js.native
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(
    eventName: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
  @js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addListener")
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
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(
    item: js.Any,
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.addManagedListener")
  @js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Ajax.autoAbort")
  @js.native
  def autoAbort: Boolean = js.native
  @scala.inline
  def autoAbort_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoAbort")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.Ajax.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.Ajax.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.Ajax.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.Ajax.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.Ajax.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.Ajax.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Removes all listeners for this object including the managed listeners */
  @JSGlobal("Ext.Ajax.clearListeners")
  @js.native
  def clearListeners(): Unit = js.native
  
  /** [Method] Removes all managed listeners for this object  */
  @JSGlobal("Ext.Ajax.clearManagedListeners")
  @js.native
  def clearManagedListeners(): Unit = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Ajax.defaultHeaders")
  @js.native
  def defaultHeaders: js.Any = js.native
  @scala.inline
  def defaultHeaders_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaders")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Ajax.disableCaching")
  @js.native
  def disableCaching: Boolean = js.native
  @scala.inline
  def disableCaching_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(x.asInstanceOf[js.Any])
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  @JSGlobal("Ext.Ajax.enableBubble")
  @js.native
  def enableBubble(): Unit = js.native
  @JSGlobal("Ext.Ajax.enableBubble")
  @js.native
  def enableBubble(eventNames: js.Any): Unit = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Ajax.extraParams")
  @js.native
  def extraParams: js.Any = js.native
  @scala.inline
  def extraParams_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(x.asInstanceOf[js.Any])
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  @JSGlobal("Ext.Ajax.fireEvent")
  @js.native
  def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
  
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  @JSGlobal("Ext.Ajax.fireEventArgs")
  @js.native
  def fireEventArgs(): Boolean = js.native
  @JSGlobal("Ext.Ajax.fireEventArgs")
  @js.native
  def fireEventArgs(eventName: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): Boolean = js.native
  @JSGlobal("Ext.Ajax.fireEventArgs")
  @js.native
  def fireEventArgs(eventName: java.lang.String): Boolean = js.native
  @JSGlobal("Ext.Ajax.fireEventArgs")
  @js.native
  def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @JSGlobal("Ext.Ajax.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.Ajax.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  @JSGlobal("Ext.Ajax.hasListener")
  @js.native
  def hasListener(): Boolean = js.native
  @JSGlobal("Ext.Ajax.hasListener")
  @js.native
  def hasListener(eventName: java.lang.String): Boolean = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Ajax.hasListeners")
  @js.native
  def hasListeners: js.Any = js.native
  @scala.inline
  def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.Ajax.initConfig")
  @js.native
  def initConfig(): IBase = js.native
  @JSGlobal("Ext.Ajax.initConfig")
  @js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Determines whether this object has a request outstanding
    * @param request Object Defaults to the last transaction
    * @returns Boolean True if there is an outstanding request.
    */
  @JSGlobal("Ext.Ajax.isLoading")
  @js.native
  def isLoading(): Boolean = js.native
  @JSGlobal("Ext.Ajax.isLoading")
  @js.native
  def isLoading(request: js.Any): Boolean = js.native
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Ajax.isObservable")
  @js.native
  def isObservable: Boolean = js.native
  @scala.inline
  def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Ajax.method")
  @js.native
  def method: java.lang.String = js.native
  @scala.inline
  def method_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("method")(x.asInstanceOf[js.Any])
  
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(
    item: js.Any,
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.mon")
  @js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.Any, ename: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.mun")
  @js.native
  def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(
    eventName: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.Any, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.on")
  @js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Checks if the response status was successful
    * @param status Number The status code
    * @returns Object An object containing success/status state
    */
  @JSGlobal("Ext.Ajax.parseStatus")
  @js.native
  def parseStatus(): js.Any = js.native
  @JSGlobal("Ext.Ajax.parseStatus")
  @js.native
  def parseStatus(status: Double): js.Any = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  @JSGlobal("Ext.Ajax.relayEvents")
  @js.native
  def relayEvents(): js.Any = js.native
  @JSGlobal("Ext.Ajax.relayEvents")
  @js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Ajax.relayEvents")
  @js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array): js.Any = js.native
  @JSGlobal("Ext.Ajax.relayEvents")
  @js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Ajax.relayEvents")
  @js.native
  def relayEvents(origin: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.relayEvents")
  @js.native
  def relayEvents(origin: js.Any, events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Ajax.relayEvents")
  @js.native
  def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = js.native
  @JSGlobal("Ext.Ajax.relayEvents")
  @js.native
  def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
  
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  @JSGlobal("Ext.Ajax.removeListener")
  @js.native
  def removeListener(): Unit = js.native
  @JSGlobal("Ext.Ajax.removeListener")
  @js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeListener")
  @js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeListener")
  @js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeListener")
  @js.native
  def removeListener(eventName: java.lang.String): Unit = js.native
  @JSGlobal("Ext.Ajax.removeListener")
  @js.native
  def removeListener(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeListener")
  @js.native
  def removeListener(eventName: java.lang.String, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeListener")
  @js.native
  def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.removeManagedListener")
  @js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Sends an HTTP request to a remote server
    * @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform postprocessing in a callback because it is passed to callback functions.)
    * @returns Object The request object. This may be used to cancel the request.
    */
  @JSGlobal("Ext.Ajax.request")
  @js.native
  def request(): js.Any = js.native
  @JSGlobal("Ext.Ajax.request")
  @js.native
  def request(options: js.Any): js.Any = js.native
  
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  @JSGlobal("Ext.Ajax.resumeEvent")
  @js.native
  def resumeEvent(eventName: js.Any*): Unit = js.native
  
  /** [Method] Resumes firing events see suspendEvents */
  @JSGlobal("Ext.Ajax.resumeEvents")
  @js.native
  def resumeEvents(): Unit = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Ajax.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sets various options such as the url params for the request
    * @param options Object The initial options
    * @param scope Object The scope to execute in
    * @returns Object The params for the request
    */
  @JSGlobal("Ext.Ajax.setOptions")
  @js.native
  def setOptions(): js.Any = js.native
  @JSGlobal("Ext.Ajax.setOptions")
  @js.native
  def setOptions(options: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.setOptions")
  @js.native
  def setOptions(options: js.Any): js.Any = js.native
  @JSGlobal("Ext.Ajax.setOptions")
  @js.native
  def setOptions(options: js.Any, scope: js.Any): js.Any = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.Ajax.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  @JSGlobal("Ext.Ajax.suspendEvent")
  @js.native
  def suspendEvent(eventName: js.Any*): Unit = js.native
  
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  @JSGlobal("Ext.Ajax.suspendEvents")
  @js.native
  def suspendEvents(): Unit = js.native
  @JSGlobal("Ext.Ajax.suspendEvents")
  @js.native
  def suspendEvents(queueSuspended: Boolean): Unit = js.native
  
  /** [Property] (Number) */
  @JSGlobal("Ext.Ajax.timeout")
  @js.native
  def timeout: Double = js.native
  @scala.inline
  def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  @JSGlobal("Ext.Ajax.un")
  @js.native
  def un(): Unit = js.native
  @JSGlobal("Ext.Ajax.un")
  @js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.un")
  @js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.un")
  @js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.un")
  @js.native
  def un(eventName: java.lang.String): Unit = js.native
  @JSGlobal("Ext.Ajax.un")
  @js.native
  def un(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.un")
  @js.native
  def un(eventName: java.lang.String, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.un")
  @js.native
  def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Uploads a form using a hidden iframe
    * @param form String/HTMLElement/Ext.Element The form to upload
    * @param url String The url to post to
    * @param params String Any extra parameters to pass
    * @param options Object The initial options
    */
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(
    form: js.UndefOr[scala.Nothing],
    url: js.UndefOr[scala.Nothing],
    params: js.UndefOr[scala.Nothing],
    options: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.UndefOr[scala.Nothing], url: js.UndefOr[scala.Nothing], params: java.lang.String): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(
    form: js.UndefOr[scala.Nothing],
    url: js.UndefOr[scala.Nothing],
    params: java.lang.String,
    options: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.UndefOr[scala.Nothing], url: java.lang.String): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(
    form: js.UndefOr[scala.Nothing],
    url: java.lang.String,
    params: js.UndefOr[scala.Nothing],
    options: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.UndefOr[scala.Nothing], url: java.lang.String, params: java.lang.String): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.UndefOr[scala.Nothing], url: java.lang.String, params: java.lang.String, options: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.Any, url: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.Any, url: js.UndefOr[scala.Nothing], params: java.lang.String): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.Any, url: js.UndefOr[scala.Nothing], params: java.lang.String, options: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.Any, url: java.lang.String): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.Any, url: java.lang.String, params: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.Any, url: java.lang.String, params: java.lang.String): Unit = js.native
  @JSGlobal("Ext.Ajax.upload")
  @js.native
  def upload(form: js.Any, url: java.lang.String, params: java.lang.String, options: js.Any): Unit = js.native
  
  /** [Property] (String) */
  @JSGlobal("Ext.Ajax.url")
  @js.native
  def url: java.lang.String = js.native
  @scala.inline
  def url_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
}
