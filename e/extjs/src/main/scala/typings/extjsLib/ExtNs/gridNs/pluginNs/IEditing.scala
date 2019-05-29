package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined listeners, hasListeners, isObservable, addEvents, addListener, addManagedListener, clearListeners, clearManagedListeners, enableBubble, fireEvent, fireEventArgs, hasListener, mon, mun, on, relayEvents, removeListener, removeManagedListener, resumeEvent, resumeEvents, suspendEvent, suspendEvents, un */ trait IEditing
  extends extjsLib.ExtNs.IAbstractPlugin {
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
  		*/
  var addEvents: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Appends an event handler to this object
  		* @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var addListener: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
  		* @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		* @param options Object If the ename parameter was an event name, this is the addListener options.
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var addManagedListener: js.UndefOr[
    js.Function5[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Cancels any active edit that is in progress  */
  var cancelEdit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Removes all listeners for this object including the managed listeners */
  var clearListeners: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Removes all managed listeners for this object  */
  var clearManagedListeners: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var clicksToEdit: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Completes the edit if there is an active edit in progress  */
  var completeEdit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var editing: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
  		* @param eventNames String/String[] The event name to bubble, or an Array of event names.
  		*/
  var enableBubble: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
  		* @param eventName String The name of the event to fire.
  		* @param args Object... Variable number of parameters are passed to handlers.
  		* @returns Boolean returns false if any of the handlers return false otherwise it returns true.
  		*/
  var fireEvent: js.UndefOr[
    js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean]
  ] = js.undefined
  /** [Method] Fires the specified event with the passed parameter list
  		* @param eventName String The name of the event to fire.
  		* @param args Object[] An array of parameters which are passed to handlers.
  		* @returns Boolean returns false if any of the handlers return false otherwise it returns true.
  		*/
  var fireEventArgs: js.UndefOr[
    js.Function2[js.UndefOr[java.lang.String], js.UndefOr[extjsLib.ExtNs.Array], scala.Boolean]
  ] = js.undefined
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
  		* @param eventName String The name of the event to check for
  		* @returns Boolean true if the event is being listened for or bubbles, else false
  		*/
  var hasListener: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Property] (Object) */
  var hasListeners: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var isObservable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[js.Any] = js.undefined
  /** [Method] Shorthand for addManagedListener
  		* @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		* @param options Object If the ename parameter was an event name, this is the addListener options.
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var mon: js.UndefOr[
    js.Function5[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Shorthand for removeManagedListener
  		* @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		*/
  var mun: js.UndefOr[
    js.Function4[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Shorthand for addListener
  		* @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var on: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param origin Object The Observable whose events this object is to relay.
  		* @param events String[] Array of event names to relay.
  		* @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
  		* @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
  		*/
  var relayEvents: js.UndefOr[
    js.Function3[js.UndefOr[js.Any], js.UndefOr[extjsLib.ExtNs.Array], js.UndefOr[java.lang.String], _]
  ] = js.undefined
  /** [Method] Removes an event handler
  		* @param eventName String The type of event the handler was associated with.
  		* @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
  		*/
  var removeListener: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[js.Any], js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Removes listeners that were added by the mon method
  		* @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		*/
  var removeManagedListener: js.UndefOr[
    js.Function4[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Resumes firing of the named event s
  		* @param eventName String... Multiple event names to resume.
  		*/
  var resumeEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /** [Method] Resumes firing events see suspendEvents */
  var resumeEvents: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
  		* @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record in Store.
  		* @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Suspends firing of the named event s
  		* @param eventName String... Multiple event names to suspend.
  		*/
  var suspendEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /** [Method] Suspends the firing of all events
  		* @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
  		*/
  var suspendEvents: js.UndefOr[js.Function1[js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Shorthand for removeListener
  		* @param eventName String The type of event the handler was associated with.
  		* @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
  		*/
  var un: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[js.Any], js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

object IEditing {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    cancelEdit: () => scala.Unit = null,
    clearListeners: () => scala.Unit = null,
    clearManagedListeners: () => scala.Unit = null,
    clicksToEdit: scala.Int | scala.Double = null,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => scala.Unit = null,
    completeEdit: () => scala.Unit = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    disable: () => scala.Unit = null,
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    enable: () => scala.Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[extjsLib.ExtNs.Array]) => scala.Boolean = null,
    getCmp: () => extjsLib.ExtNs.IComponent = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    init: /* client */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IEditing = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isPlugin: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    pluginId: java.lang.String = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[extjsLib.ExtNs.Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: /* repeated */ js.Any => scala.Unit = null,
    resumeEvents: () => scala.Unit = null,
    self: extjsLib.ExtNs.IClass = null,
    setCmp: /* cmp */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    startEdit: (/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any]) => scala.Unit = null,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => scala.Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    triggerEvent: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: extjsLib.ExtNs.Array = null
  ): IEditing = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(js.Any.fromFunction0(cancelEdit))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (clicksToEdit != null) __obj.updateDynamic("clicksToEdit")(clicksToEdit.asInstanceOf[js.Any])
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(js.Any.fromFunction1(clonePlugin))
    if (completeEdit != null) __obj.updateDynamic("completeEdit")(js.Any.fromFunction0(completeEdit))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getCmp != null) __obj.updateDynamic("getCmp")(js.Any.fromFunction0(getCmp))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCmp != null) __obj.updateDynamic("setCmp")(js.Any.fromFunction1(setCmp))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2(startEdit))
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IEditing]
  }
}

