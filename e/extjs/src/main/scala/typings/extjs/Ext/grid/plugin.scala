package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IAbstractPlugin
import typings.extjs.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugin {
  
  trait IBufferedRenderer
    extends StObject
       with IAbstractPlugin {
    
    /** [Method] Initialize this as a plugin
      * @param grid Object
      */
    @JSName("init")
    var init_IBufferedRenderer: js.UndefOr[js.Function1[/* grid */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var leadingBufferZone: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var numFromEdge: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var percentageFromEdge: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var position: js.UndefOr[Double] = js.undefined
    
    /** [Method] Scrolls to and optionlly selects the specified row index in the total dataset
      * @param recordIdx Number The zero-based position in the dataset to scroll to.
      * @param doSelect Boolean Pass as true to select the specified row.
      * @param callback Function A function to call when the row has been scrolled to.
      * @param scope Object The scope (this reference) in which to execute the callback. Defaults to this BufferedRenderer.
      */
    var scrollTo: js.UndefOr[
        js.Function4[
          /* recordIdx */ js.UndefOr[Double], 
          /* doSelect */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Number) */
    var scrollToLoadBuffer: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var synchronousRender: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var trailingBufferZone: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var variableRowHeight: js.UndefOr[Boolean] = js.undefined
  }
  object IBufferedRenderer {
    
    inline def apply(): IBufferedRenderer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBufferedRenderer]
    }
    
    extension [Self <: IBufferedRenderer](x: Self) {
      
      inline def setInit(value: /* grid */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setLeadingBufferZone(value: Double): Self = StObject.set(x, "leadingBufferZone", value.asInstanceOf[js.Any])
      
      inline def setLeadingBufferZoneUndefined: Self = StObject.set(x, "leadingBufferZone", js.undefined)
      
      inline def setNumFromEdge(value: Double): Self = StObject.set(x, "numFromEdge", value.asInstanceOf[js.Any])
      
      inline def setNumFromEdgeUndefined: Self = StObject.set(x, "numFromEdge", js.undefined)
      
      inline def setPercentageFromEdge(value: Double): Self = StObject.set(x, "percentageFromEdge", value.asInstanceOf[js.Any])
      
      inline def setPercentageFromEdgeUndefined: Self = StObject.set(x, "percentageFromEdge", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScrollTo(
        value: (/* recordIdx */ js.UndefOr[Double], /* doSelect */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "scrollTo", js.Any.fromFunction4(value))
      
      inline def setScrollToLoadBuffer(value: Double): Self = StObject.set(x, "scrollToLoadBuffer", value.asInstanceOf[js.Any])
      
      inline def setScrollToLoadBufferUndefined: Self = StObject.set(x, "scrollToLoadBuffer", js.undefined)
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setSynchronousRender(value: Boolean): Self = StObject.set(x, "synchronousRender", value.asInstanceOf[js.Any])
      
      inline def setSynchronousRenderUndefined: Self = StObject.set(x, "synchronousRender", js.undefined)
      
      inline def setTrailingBufferZone(value: Double): Self = StObject.set(x, "trailingBufferZone", value.asInstanceOf[js.Any])
      
      inline def setTrailingBufferZoneUndefined: Self = StObject.set(x, "trailingBufferZone", js.undefined)
      
      inline def setVariableRowHeight(value: Boolean): Self = StObject.set(x, "variableRowHeight", value.asInstanceOf[js.Any])
      
      inline def setVariableRowHeightUndefined: Self = StObject.set(x, "variableRowHeight", js.undefined)
    }
  }
  
  trait ICellEditing
    extends StObject
       with IEditing {
    
    /** [Method] Starts editing by position row column
      * @param position Object A position with keys of row and column.
      */
    var startEditByPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
      * @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record.
      * @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
      * @returns Boolean true if editing was started, false otherwise.
      */
    @JSName("startEdit")
    var startEdit_ICellEditing: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[Any], /* columnHeader */ js.UndefOr[Any], Boolean]
      ] = js.undefined
  }
  object ICellEditing {
    
    inline def apply(): ICellEditing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICellEditing]
    }
    
    extension [Self <: ICellEditing](x: Self) {
      
      inline def setStartEdit(value: (/* record */ js.UndefOr[Any], /* columnHeader */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
      
      inline def setStartEditByPosition(value: /* position */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "startEditByPosition", js.Any.fromFunction1(value))
      
      inline def setStartEditByPositionUndefined: Self = StObject.set(x, "startEditByPosition", js.undefined)
      
      inline def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
    }
  }
  
  trait IDragDrop
    extends StObject
       with IAbstractPlugin {
    
    /** [Config Option] (Object/Boolean) */
    var containerScroll: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var ddGroup: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var dragGroup: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var dragText: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var dropGroup: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enableDrag: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enableDrop: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] The init method is invoked after initComponent method has been run for the client Component
      * @param view Object
      */
    @JSName("init")
    var init_IDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IDragDrop {
    
    inline def apply(): IDragDrop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragDrop]
    }
    
    extension [Self <: IDragDrop](x: Self) {
      
      inline def setContainerScroll(value: Any): Self = StObject.set(x, "containerScroll", value.asInstanceOf[js.Any])
      
      inline def setContainerScrollUndefined: Self = StObject.set(x, "containerScroll", js.undefined)
      
      inline def setDdGroup(value: String): Self = StObject.set(x, "ddGroup", value.asInstanceOf[js.Any])
      
      inline def setDdGroupUndefined: Self = StObject.set(x, "ddGroup", js.undefined)
      
      inline def setDragGroup(value: String): Self = StObject.set(x, "dragGroup", value.asInstanceOf[js.Any])
      
      inline def setDragGroupUndefined: Self = StObject.set(x, "dragGroup", js.undefined)
      
      inline def setDragText(value: String): Self = StObject.set(x, "dragText", value.asInstanceOf[js.Any])
      
      inline def setDragTextUndefined: Self = StObject.set(x, "dragText", js.undefined)
      
      inline def setDropGroup(value: String): Self = StObject.set(x, "dropGroup", value.asInstanceOf[js.Any])
      
      inline def setDropGroupUndefined: Self = StObject.set(x, "dropGroup", js.undefined)
      
      inline def setEnableDrag(value: Boolean): Self = StObject.set(x, "enableDrag", value.asInstanceOf[js.Any])
      
      inline def setEnableDragUndefined: Self = StObject.set(x, "enableDrag", js.undefined)
      
      inline def setEnableDrop(value: Boolean): Self = StObject.set(x, "enableDrop", value.asInstanceOf[js.Any])
      
      inline def setEnableDropUndefined: Self = StObject.set(x, "enableDrop", js.undefined)
      
      inline def setInit(value: /* view */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.util.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined listeners, hasListeners, isObservable, addEvents, addListener, addManagedListener, clearListeners, clearManagedListeners, enableBubble, fireEvent, fireEventArgs, hasListener, mon, mun, on, relayEvents, removeListener, removeManagedListener, resumeEvent, resumeEvents, suspendEvent, suspendEvents, un */ trait IEditing
    extends StObject
       with IAbstractPlugin {
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    var addEvents: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var addListener: js.UndefOr[
        js.Function4[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Any]
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
        js.Function5[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Any]
      ] = js.undefined
    
    /** [Method] Cancels any active edit that is in progress  */
    var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Removes all managed listeners for this object  */
    var clearManagedListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var clicksToEdit: js.UndefOr[Double] = js.undefined
    
    /** [Method] Completes the edit if there is an active edit in progress  */
    var completeEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (Boolean) */
    var editing: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    var enableBubble: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ Any, Boolean]] = js.undefined
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    var fireEventArgs: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[Array], Boolean]] = js.undefined
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    var hasListener: js.UndefOr[js.Function1[js.UndefOr[String], Boolean]] = js.undefined
    
    /** [Property] (Object) */
    var hasListeners: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Boolean) */
    var isObservable: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var listeners: js.UndefOr[Any] = js.undefined
    
    /** [Method] Shorthand for addManagedListener
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var mon: js.UndefOr[
        js.Function5[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Any]
      ] = js.undefined
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    var mun: js.UndefOr[
        js.Function4[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var on: js.UndefOr[
        js.Function4[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Any]
      ] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    var relayEvents: js.UndefOr[js.Function3[js.UndefOr[Any], js.UndefOr[Array], js.UndefOr[String], Any]] = js.undefined
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    var removeListener: js.UndefOr[js.Function3[js.UndefOr[String], js.UndefOr[Any], js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    var removeManagedListener: js.UndefOr[
        js.Function4[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    var resumeEvent: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    /** [Method] Resumes firing events see suspendEvents */
    var resumeEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
      * @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record in Store.
      * @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
      */
    var startEdit: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[Any], /* columnHeader */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    var suspendEvent: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    var suspendEvents: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var triggerEvent: js.UndefOr[String] = js.undefined
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    var un: js.UndefOr[js.Function3[js.UndefOr[String], js.UndefOr[Any], js.UndefOr[Any], Unit]] = js.undefined
  }
  object IEditing {
    
    inline def apply(): IEditing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditing]
    }
    
    extension [Self <: IEditing](x: Self) {
      
      inline def setAddEvents(value: js.UndefOr[Any] => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction1(value))
      
      inline def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
      
      inline def setAddListener(value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Any): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
      
      inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      inline def setAddManagedListener(
        value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
      
      inline def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
      
      inline def setCancelEdit(value: () => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction0(value))
      
      inline def setCancelEditUndefined: Self = StObject.set(x, "cancelEdit", js.undefined)
      
      inline def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
      
      inline def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
      
      inline def setClearManagedListeners(value: () => Unit): Self = StObject.set(x, "clearManagedListeners", js.Any.fromFunction0(value))
      
      inline def setClearManagedListenersUndefined: Self = StObject.set(x, "clearManagedListeners", js.undefined)
      
      inline def setClicksToEdit(value: Double): Self = StObject.set(x, "clicksToEdit", value.asInstanceOf[js.Any])
      
      inline def setClicksToEditUndefined: Self = StObject.set(x, "clicksToEdit", js.undefined)
      
      inline def setCompleteEdit(value: () => Unit): Self = StObject.set(x, "completeEdit", js.Any.fromFunction0(value))
      
      inline def setCompleteEditUndefined: Self = StObject.set(x, "completeEdit", js.undefined)
      
      inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      inline def setEnableBubble(value: js.UndefOr[Any] => Unit): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1(value))
      
      inline def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
      
      inline def setFireEvent(value: (/* eventName */ String, /* repeated */ Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      inline def setFireEventArgs(value: (js.UndefOr[String], js.UndefOr[Array]) => Boolean): Self = StObject.set(x, "fireEventArgs", js.Any.fromFunction2(value))
      
      inline def setFireEventArgsUndefined: Self = StObject.set(x, "fireEventArgs", js.undefined)
      
      inline def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
      
      inline def setHasListener(value: js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
      
      inline def setHasListeners(value: Any): Self = StObject.set(x, "hasListeners", value.asInstanceOf[js.Any])
      
      inline def setHasListenersUndefined: Self = StObject.set(x, "hasListeners", js.undefined)
      
      inline def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
      
      inline def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
      
      inline def setListeners(value: Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setMon(
        value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
      
      inline def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
      
      inline def setMun(value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Unit): Self = StObject.set(x, "mun", js.Any.fromFunction4(value))
      
      inline def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
      
      inline def setOn(value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Any): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setRelayEvents(value: (js.UndefOr[Any], js.UndefOr[Array], js.UndefOr[String]) => Any): Self = StObject.set(x, "relayEvents", js.Any.fromFunction3(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setRemoveListener(value: (js.UndefOr[String], js.UndefOr[Any], js.UndefOr[Any]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      inline def setRemoveManagedListener(value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Unit): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4(value))
      
      inline def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
      
      inline def setResumeEvent(value: /* repeated */ Any => Unit): Self = StObject.set(x, "resumeEvent", js.Any.fromFunction1(value))
      
      inline def setResumeEventUndefined: Self = StObject.set(x, "resumeEvent", js.undefined)
      
      inline def setResumeEvents(value: () => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction0(value))
      
      inline def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
      
      inline def setStartEdit(value: (/* record */ js.UndefOr[Any], /* columnHeader */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
      
      inline def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
      
      inline def setSuspendEvent(value: /* repeated */ Any => Unit): Self = StObject.set(x, "suspendEvent", js.Any.fromFunction1(value))
      
      inline def setSuspendEventUndefined: Self = StObject.set(x, "suspendEvent", js.undefined)
      
      inline def setSuspendEvents(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction1(value))
      
      inline def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
      
      inline def setTriggerEvent(value: String): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
      
      inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
      
      inline def setUn(value: (js.UndefOr[String], js.UndefOr[Any], js.UndefOr[Any]) => Unit): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
      
      inline def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
    }
  }
  
  trait IHeaderReorderer
    extends StObject
       with IAbstractPlugin {
    
    /** [Method] The init method is invoked after initComponent method has been run for the client Component
      * @param headerCt Object
      */
    @JSName("init")
    var init_IHeaderReorderer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IHeaderReorderer {
    
    inline def apply(): IHeaderReorderer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeaderReorderer]
    }
    
    extension [Self <: IHeaderReorderer](x: Self) {
      
      inline def setInit(value: /* headerCt */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
  
  trait IHeaderResizer
    extends StObject
       with IAbstractPlugin {
    
    /** [Config Option] (Boolean) */
    var dynamic: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns the value of dynamic
      * @returns Boolean
      */
    var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] not using w and e resize bc we are only ever resizing one column wResizeCursor Ext isWebKit w resize  col resi
      * @param headerCt Object
      */
    @JSName("init")
    var init_IHeaderResizer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of dynamic
      * @param dynamic Boolean
      */
    var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IHeaderResizer {
    
    inline def apply(): IHeaderResizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeaderResizer]
    }
    
    extension [Self <: IHeaderResizer](x: Self) {
      
      inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      inline def setGetDynamic(value: () => Boolean): Self = StObject.set(x, "getDynamic", js.Any.fromFunction0(value))
      
      inline def setGetDynamicUndefined: Self = StObject.set(x, "getDynamic", js.undefined)
      
      inline def setInit(value: /* headerCt */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setSetDynamic(value: /* dynamic */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDynamic", js.Any.fromFunction1(value))
      
      inline def setSetDynamicUndefined: Self = StObject.set(x, "setDynamic", js.undefined)
    }
  }
  
  trait IRowEditing
    extends StObject
       with IEditing {
    
    /** [Config Option] (Boolean) */
    var autoCancel: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var clicksToMoveEditor: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var errorSummary: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
      * @param record Ext.data.Model The Store data record which backs the row to be edited.
      * @param columnHeader Ext.data.Model The Column object defining the column to be edited.
      * @returns Boolean true if editing was started, false otherwise.
      */
    @JSName("startEdit")
    var startEdit_IRowEditing: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Boolean]
      ] = js.undefined
  }
  object IRowEditing {
    
    inline def apply(): IRowEditing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowEditing]
    }
    
    extension [Self <: IRowEditing](x: Self) {
      
      inline def setAutoCancel(value: Boolean): Self = StObject.set(x, "autoCancel", value.asInstanceOf[js.Any])
      
      inline def setAutoCancelUndefined: Self = StObject.set(x, "autoCancel", js.undefined)
      
      inline def setClicksToMoveEditor(value: Double): Self = StObject.set(x, "clicksToMoveEditor", value.asInstanceOf[js.Any])
      
      inline def setClicksToMoveEditorUndefined: Self = StObject.set(x, "clicksToMoveEditor", js.undefined)
      
      inline def setErrorSummary(value: Boolean): Self = StObject.set(x, "errorSummary", value.asInstanceOf[js.Any])
      
      inline def setErrorSummaryUndefined: Self = StObject.set(x, "errorSummary", js.undefined)
      
      inline def setStartEdit(value: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Boolean): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
      
      inline def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
    }
  }
  
  trait IRowExpander
    extends StObject
       with IAbstractPlugin {
    
    /** [Config Option] (Boolean) */
    var expandOnDblClick: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var expandOnEnter: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] The init method is invoked after initComponent method has been run for the client Component
      * @param grid Object
      */
    @JSName("init")
    var init_IRowExpander: js.UndefOr[js.Function1[/* grid */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var selectRowOnExpand: js.UndefOr[Boolean] = js.undefined
  }
  object IRowExpander {
    
    inline def apply(): IRowExpander = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowExpander]
    }
    
    extension [Self <: IRowExpander](x: Self) {
      
      inline def setExpandOnDblClick(value: Boolean): Self = StObject.set(x, "expandOnDblClick", value.asInstanceOf[js.Any])
      
      inline def setExpandOnDblClickUndefined: Self = StObject.set(x, "expandOnDblClick", js.undefined)
      
      inline def setExpandOnEnter(value: Boolean): Self = StObject.set(x, "expandOnEnter", value.asInstanceOf[js.Any])
      
      inline def setExpandOnEnterUndefined: Self = StObject.set(x, "expandOnEnter", js.undefined)
      
      inline def setInit(value: /* grid */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setSelectRowOnExpand(value: Boolean): Self = StObject.set(x, "selectRowOnExpand", value.asInstanceOf[js.Any])
      
      inline def setSelectRowOnExpandUndefined: Self = StObject.set(x, "selectRowOnExpand", js.undefined)
    }
  }
}
