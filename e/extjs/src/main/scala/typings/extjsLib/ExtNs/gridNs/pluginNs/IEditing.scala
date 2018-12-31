package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.utilNs.IObservable because Would inherit conflicting mutable fields List(alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses))*/
trait IEditing
  extends extjsLib.ExtNs.IAbstractPlugin {
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
  		*/
  var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Appends an event handler to this object
  		* @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var addListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
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
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
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
  var enableBubble: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
    js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
  		* @param eventName String The name of the event to check for
  		* @returns Boolean true if the event is being listened for or bubbles, else false
  		*/
  var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
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
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
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
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param origin Object The Observable whose events this object is to relay.
  		* @param events String[] Array of event names to relay.
  		* @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
  		* @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
  		*/
  var relayEvents: js.UndefOr[
    js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ]
  ] = js.undefined
  /** [Method] Removes an event handler
  		* @param eventName String The type of event the handler was associated with.
  		* @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
  		*/
  var removeListener: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Removes listeners that were added by the mon method
  		* @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		*/
  var removeManagedListener: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
  var suspendEvents: js.UndefOr[js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Shorthand for removeListener
  		* @param eventName String The type of event the handler was associated with.
  		* @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
  		*/
  var un: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

