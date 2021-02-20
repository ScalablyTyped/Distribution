package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IAbstractPlugin
import typings.extjs.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugin {
  
  @js.native
  trait IBufferedRenderer extends IAbstractPlugin {
    
    /** [Method] Initialize this as a plugin
      * @param grid Object
      */
    @JSName("init")
    var init_IBufferedRenderer: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Number) */
    var leadingBufferZone: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var numFromEdge: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var percentageFromEdge: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var position: js.UndefOr[Double] = js.native
    
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
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Config Option] (Number) */
    var scrollToLoadBuffer: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var synchronousRender: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var trailingBufferZone: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var variableRowHeight: js.UndefOr[Boolean] = js.native
  }
  object IBufferedRenderer {
    
    @scala.inline
    def apply(): IBufferedRenderer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBufferedRenderer]
    }
    
    @scala.inline
    implicit class IBufferedRendererMutableBuilder[Self <: IBufferedRenderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setLeadingBufferZone(value: Double): Self = StObject.set(x, "leadingBufferZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingBufferZoneUndefined: Self = StObject.set(x, "leadingBufferZone", js.undefined)
      
      @scala.inline
      def setNumFromEdge(value: Double): Self = StObject.set(x, "numFromEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumFromEdgeUndefined: Self = StObject.set(x, "numFromEdge", js.undefined)
      
      @scala.inline
      def setPercentageFromEdge(value: Double): Self = StObject.set(x, "percentageFromEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageFromEdgeUndefined: Self = StObject.set(x, "percentageFromEdge", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScrollTo(
        value: (/* recordIdx */ js.UndefOr[Double], /* doSelect */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "scrollTo", js.Any.fromFunction4(value))
      
      @scala.inline
      def setScrollToLoadBuffer(value: Double): Self = StObject.set(x, "scrollToLoadBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToLoadBufferUndefined: Self = StObject.set(x, "scrollToLoadBuffer", js.undefined)
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      @scala.inline
      def setSynchronousRender(value: Boolean): Self = StObject.set(x, "synchronousRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronousRenderUndefined: Self = StObject.set(x, "synchronousRender", js.undefined)
      
      @scala.inline
      def setTrailingBufferZone(value: Double): Self = StObject.set(x, "trailingBufferZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingBufferZoneUndefined: Self = StObject.set(x, "trailingBufferZone", js.undefined)
      
      @scala.inline
      def setVariableRowHeight(value: Boolean): Self = StObject.set(x, "variableRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableRowHeightUndefined: Self = StObject.set(x, "variableRowHeight", js.undefined)
    }
  }
  
  @js.native
  trait ICellEditing extends IEditing {
    
    /** [Method] Starts editing by position row column
      * @param position Object A position with keys of row and column.
      */
    var startEditByPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
      * @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record.
      * @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
      * @returns Boolean true if editing was started, false otherwise.
      */
    @JSName("startEdit")
    var startEdit_ICellEditing: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any], Boolean]
      ] = js.native
  }
  object ICellEditing {
    
    @scala.inline
    def apply(): ICellEditing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICellEditing]
    }
    
    @scala.inline
    implicit class ICellEditingMutableBuilder[Self <: ICellEditing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStartEdit(value: (/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartEditByPosition(value: /* position */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "startEditByPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartEditByPositionUndefined: Self = StObject.set(x, "startEditByPosition", js.undefined)
      
      @scala.inline
      def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
    }
  }
  
  @js.native
  trait IDragDrop extends IAbstractPlugin {
    
    /** [Config Option] (Object/Boolean) */
    var containerScroll: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var ddGroup: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var dragGroup: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var dragText: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var dropGroup: js.UndefOr[String] = js.native
    
    /** [Config Option] (Boolean) */
    var enableDrag: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var enableDrop: js.UndefOr[Boolean] = js.native
    
    /** [Method] The init method is invoked after initComponent method has been run for the client Component
      * @param view Object
      */
    @JSName("init")
    var init_IDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IDragDrop {
    
    @scala.inline
    def apply(): IDragDrop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragDrop]
    }
    
    @scala.inline
    implicit class IDragDropMutableBuilder[Self <: IDragDrop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerScroll(value: js.Any): Self = StObject.set(x, "containerScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerScrollUndefined: Self = StObject.set(x, "containerScroll", js.undefined)
      
      @scala.inline
      def setDdGroup(value: String): Self = StObject.set(x, "ddGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdGroupUndefined: Self = StObject.set(x, "ddGroup", js.undefined)
      
      @scala.inline
      def setDragGroup(value: String): Self = StObject.set(x, "dragGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragGroupUndefined: Self = StObject.set(x, "dragGroup", js.undefined)
      
      @scala.inline
      def setDragText(value: String): Self = StObject.set(x, "dragText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragTextUndefined: Self = StObject.set(x, "dragText", js.undefined)
      
      @scala.inline
      def setDropGroup(value: String): Self = StObject.set(x, "dropGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropGroupUndefined: Self = StObject.set(x, "dropGroup", js.undefined)
      
      @scala.inline
      def setEnableDrag(value: Boolean): Self = StObject.set(x, "enableDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDragUndefined: Self = StObject.set(x, "enableDrag", js.undefined)
      
      @scala.inline
      def setEnableDrop(value: Boolean): Self = StObject.set(x, "enableDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDropUndefined: Self = StObject.set(x, "enableDrop", js.undefined)
      
      @scala.inline
      def setInit(value: /* view */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.util.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined listeners, hasListeners, isObservable, addEvents, addListener, addManagedListener, clearListeners, clearManagedListeners, enableBubble, fireEvent, fireEventArgs, hasListener, mon, mun, on, relayEvents, removeListener, removeManagedListener, resumeEvent, resumeEvents, suspendEvent, suspendEvents, un */ @js.native
  trait IEditing extends IAbstractPlugin {
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    var addEvents: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var addListener: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], _]
      ] = js.native
    
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
      ] = js.native
    
    /** [Method] Cancels any active edit that is in progress  */
    var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    var clearListeners: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Removes all managed listeners for this object  */
    var clearManagedListeners: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Number) */
    var clicksToEdit: js.UndefOr[Double] = js.native
    
    /** [Method] Completes the edit if there is an active edit in progress  */
    var completeEdit: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Property] (Boolean) */
    var editing: js.UndefOr[Boolean] = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    var enableBubble: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ js.Any, Boolean]] = js.native
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    var fireEventArgs: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[Array], Boolean]] = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    var hasListener: js.UndefOr[js.Function1[js.UndefOr[String], Boolean]] = js.native
    
    /** [Property] (Object) */
    var hasListeners: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Boolean) */
    var isObservable: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Object) */
    var listeners: js.UndefOr[js.Any] = js.native
    
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
      ] = js.native
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    var mun: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var on: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], _]
      ] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    var relayEvents: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[String], _]] = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    var removeListener: js.UndefOr[js.Function3[js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    var removeManagedListener: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    var resumeEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    /** [Method] Resumes firing events see suspendEvents */
    var resumeEvents: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
      * @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record in Store.
      * @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
      */
    var startEdit: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    var suspendEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    var suspendEvents: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Config Option] (String) */
    var triggerEvent: js.UndefOr[String] = js.native
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    var un: js.UndefOr[js.Function3[js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.native
  }
  object IEditing {
    
    @scala.inline
    def apply(): IEditing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditing]
    }
    
    @scala.inline
    implicit class IEditingMutableBuilder[Self <: IEditing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEvents(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
      
      @scala.inline
      def setAddListener(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => _): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
      
      @scala.inline
      def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      @scala.inline
      def setAddManagedListener(
        value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => _
      ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
      
      @scala.inline
      def setCancelEdit(value: () => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancelEditUndefined: Self = StObject.set(x, "cancelEdit", js.undefined)
      
      @scala.inline
      def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
      
      @scala.inline
      def setClearManagedListeners(value: () => Unit): Self = StObject.set(x, "clearManagedListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearManagedListenersUndefined: Self = StObject.set(x, "clearManagedListeners", js.undefined)
      
      @scala.inline
      def setClicksToEdit(value: Double): Self = StObject.set(x, "clicksToEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClicksToEditUndefined: Self = StObject.set(x, "clicksToEdit", js.undefined)
      
      @scala.inline
      def setCompleteEdit(value: () => Unit): Self = StObject.set(x, "completeEdit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteEditUndefined: Self = StObject.set(x, "completeEdit", js.undefined)
      
      @scala.inline
      def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      @scala.inline
      def setEnableBubble(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
      
      @scala.inline
      def setFireEvent(value: (/* eventName */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFireEventArgs(value: (js.UndefOr[String], js.UndefOr[Array]) => Boolean): Self = StObject.set(x, "fireEventArgs", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFireEventArgsUndefined: Self = StObject.set(x, "fireEventArgs", js.undefined)
      
      @scala.inline
      def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
      
      @scala.inline
      def setHasListener(value: js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
      
      @scala.inline
      def setHasListeners(value: js.Any): Self = StObject.set(x, "hasListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasListenersUndefined: Self = StObject.set(x, "hasListeners", js.undefined)
      
      @scala.inline
      def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
      
      @scala.inline
      def setListeners(value: js.Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setMon(
        value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => _
      ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
      
      @scala.inline
      def setMun(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "mun", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
      
      @scala.inline
      def setOn(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => _): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setRelayEvents(value: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[String]) => _): Self = StObject.set(x, "relayEvents", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      @scala.inline
      def setRemoveListener(value: (js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      @scala.inline
      def setRemoveManagedListener(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
      
      @scala.inline
      def setResumeEvent(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "resumeEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResumeEventUndefined: Self = StObject.set(x, "resumeEvent", js.undefined)
      
      @scala.inline
      def setResumeEvents(value: () => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
      
      @scala.inline
      def setStartEdit(value: (/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
      
      @scala.inline
      def setSuspendEvent(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "suspendEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuspendEventUndefined: Self = StObject.set(x, "suspendEvent", js.undefined)
      
      @scala.inline
      def setSuspendEvents(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
      
      @scala.inline
      def setTriggerEvent(value: String): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
      
      @scala.inline
      def setUn(value: (js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
    }
  }
  
  @js.native
  trait IHeaderReorderer extends IAbstractPlugin {
    
    /** [Method] The init method is invoked after initComponent method has been run for the client Component
      * @param headerCt Object
      */
    @JSName("init")
    var init_IHeaderReorderer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IHeaderReorderer {
    
    @scala.inline
    def apply(): IHeaderReorderer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeaderReorderer]
    }
    
    @scala.inline
    implicit class IHeaderReordererMutableBuilder[Self <: IHeaderReorderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: /* headerCt */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
  
  @js.native
  trait IHeaderResizer extends IAbstractPlugin {
    
    /** [Config Option] (Boolean) */
    var dynamic: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the value of dynamic
      * @returns Boolean
      */
    var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] not using w and e resize bc we are only ever resizing one column wResizeCursor Ext isWebKit w resize  col resi
      * @param headerCt Object
      */
    @JSName("init")
    var init_IHeaderResizer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of dynamic
      * @param dynamic Boolean
      */
    var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.native
  }
  object IHeaderResizer {
    
    @scala.inline
    def apply(): IHeaderResizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeaderResizer]
    }
    
    @scala.inline
    implicit class IHeaderResizerMutableBuilder[Self <: IHeaderResizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      @scala.inline
      def setGetDynamic(value: () => Boolean): Self = StObject.set(x, "getDynamic", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDynamicUndefined: Self = StObject.set(x, "getDynamic", js.undefined)
      
      @scala.inline
      def setInit(value: /* headerCt */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setSetDynamic(value: /* dynamic */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDynamic", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDynamicUndefined: Self = StObject.set(x, "setDynamic", js.undefined)
    }
  }
  
  @js.native
  trait IRowEditing extends IEditing {
    
    /** [Config Option] (Boolean) */
    var autoCancel: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var clicksToMoveEditor: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var errorSummary: js.UndefOr[Boolean] = js.native
    
    /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
      * @param record Ext.data.Model The Store data record which backs the row to be edited.
      * @param columnHeader Ext.data.Model The Column object defining the column to be edited.
      * @returns Boolean true if editing was started, false otherwise.
      */
    @JSName("startEdit")
    var startEdit_IRowEditing: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Boolean]
      ] = js.native
  }
  object IRowEditing {
    
    @scala.inline
    def apply(): IRowEditing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowEditing]
    }
    
    @scala.inline
    implicit class IRowEditingMutableBuilder[Self <: IRowEditing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCancel(value: Boolean): Self = StObject.set(x, "autoCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCancelUndefined: Self = StObject.set(x, "autoCancel", js.undefined)
      
      @scala.inline
      def setClicksToMoveEditor(value: Double): Self = StObject.set(x, "clicksToMoveEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClicksToMoveEditorUndefined: Self = StObject.set(x, "clicksToMoveEditor", js.undefined)
      
      @scala.inline
      def setErrorSummary(value: Boolean): Self = StObject.set(x, "errorSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorSummaryUndefined: Self = StObject.set(x, "errorSummary", js.undefined)
      
      @scala.inline
      def setStartEdit(value: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Boolean): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
    }
  }
  
  @js.native
  trait IRowExpander extends IAbstractPlugin {
    
    /** [Config Option] (Boolean) */
    var expandOnDblClick: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var expandOnEnter: js.UndefOr[Boolean] = js.native
    
    /** [Method] The init method is invoked after initComponent method has been run for the client Component
      * @param grid Object
      */
    @JSName("init")
    var init_IRowExpander: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var selectRowOnExpand: js.UndefOr[Boolean] = js.native
  }
  object IRowExpander {
    
    @scala.inline
    def apply(): IRowExpander = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowExpander]
    }
    
    @scala.inline
    implicit class IRowExpanderMutableBuilder[Self <: IRowExpander] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandOnDblClick(value: Boolean): Self = StObject.set(x, "expandOnDblClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnDblClickUndefined: Self = StObject.set(x, "expandOnDblClick", js.undefined)
      
      @scala.inline
      def setExpandOnEnter(value: Boolean): Self = StObject.set(x, "expandOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnEnterUndefined: Self = StObject.set(x, "expandOnEnter", js.undefined)
      
      @scala.inline
      def setInit(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setSelectRowOnExpand(value: Boolean): Self = StObject.set(x, "selectRowOnExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectRowOnExpandUndefined: Self = StObject.set(x, "selectRowOnExpand", js.undefined)
    }
  }
}
