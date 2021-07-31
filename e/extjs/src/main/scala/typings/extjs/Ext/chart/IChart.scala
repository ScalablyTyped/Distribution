package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.chart.theme.ITheme
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.draw.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners
- typings.extjs.Ext.chart.INavigation because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined restoreZoom, setZoom
- typings.extjs.Ext.chart.IMask because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined mask */ trait IChart
  extends StObject
     with IComponent
     with ITheme {
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  @JSName("addEvents")
  var addEvents_IChart: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSName("addListener")
  var addListener_IChart: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Any
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
  @JSName("addManagedListener")
  var addManagedListener_IChart: js.UndefOr[
    js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  @JSName("animate")
  var animate_IChart: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Ext.chart.axis.Axis[]) */
  var axes: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Object/Boolean) */
  var background: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Binds a store to this instance
    * @param store Object
    * @param initial Object
    */
  var bindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
  ] = js.undefined
  
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  
  /** [Method] Removes all listeners for this object including the managed listeners */
  @JSName("clearListeners")
  var clearListeners_IChart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Removes all managed listeners for this object  */
  @JSName("clearManagedListeners")
  var clearManagedListeners_IChart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  @JSName("enableBubble")
  var enableBubble_IChart: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  @JSName("fireEventArgs")
  var fireEventArgs_IChart: js.UndefOr[
    js.Function2[/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], Boolean]
  ] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  @JSName("fireEvent")
  var fireEvent_IChart: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ js.Any, Boolean]] = js.undefined
  
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.undefined
  
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function0[js.Any] | (js.Function1[/* store */ js.UndefOr[IStore], js.Any])] = js.undefined
  
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  @JSName("hasListener")
  var hasListener_IChart: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Config Option] (Number) */
  var insetPadding: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  var legend: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean/String) */
  var mask: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSName("mon")
  var mon_IChart: js.UndefOr[
    js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  @JSName("mun")
  var mun_IChart: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IChart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  @JSName("on")
  var on_IChart: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Redraws the chart
    * @param resize Boolean flag which changes the default origin points of the chart for animations.
    */
  var redraw: js.UndefOr[js.Function1[/* resize */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  @JSName("relayEvents")
  var relayEvents_IChart: js.UndefOr[
    js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[Array], 
      /* prefix */ js.UndefOr[String], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  @JSName("removeListener")
  var removeListener_IChart: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  @JSName("removeManagedListener")
  var removeManagedListener_IChart: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Restores the zoom to the original value  */
  var restoreZoom: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  @JSName("resumeEvent")
  var resumeEvent_IChart: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  
  /** [Method] Resumes firing events see suspendEvents */
  @JSName("resumeEvents")
  var resumeEvents_IChart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Saves the chart by either triggering a download or returning a string containing the chart data as SVG
    * @param config Object The configuration to be passed to the exporter. See the export method for the appropriate exporter for the relevant configuration options
    * @returns Object See the return types for the appropriate exporter
    */
  var save: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Config Option] (Ext.chart.series.Series[]) */
  var series: js.UndefOr[Array] = js.undefined
  
  /** [Method] Zooms the chart to the specified selection range
    * @param zoomConfig Object
    */
  var setZoom: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  @JSName("suspendEvent")
  var suspendEvent_IChart: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  @JSName("suspendEvents")
  var suspendEvents_IChart: js.UndefOr[js.Function1[/* queueSuspended */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var theme: js.UndefOr[String] = js.undefined
  
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  @JSName("un")
  var un_IChart: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
}
object IChart {
  
  @scala.inline
  def apply(): IChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChart]
  }
  
  @scala.inline
  implicit class IChartMutableBuilder[Self <: IChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEvents(value: /* eventNames */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
    
    @scala.inline
    def setAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    @scala.inline
    def setAddManagedListener(
      value: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAxes(value: Array): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setBackground(value: js.Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBindStore(
      value: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
    ): Self = StObject.set(x, "bindStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindStoreFunction1(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStoreFunction2(value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "bindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStoreListenersUndefined: Self = StObject.set(x, "bindStoreListeners", js.undefined)
    
    @scala.inline
    def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    @scala.inline
    def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
    
    @scala.inline
    def setClearManagedListeners(value: () => Unit): Self = StObject.set(x, "clearManagedListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearManagedListenersUndefined: Self = StObject.set(x, "clearManagedListeners", js.undefined)
    
    @scala.inline
    def setEnableBubble(value: /* eventNames */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
    
    @scala.inline
    def setFireEvent(value: (/* eventName */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFireEventArgs(value: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean): Self = StObject.set(x, "fireEventArgs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFireEventArgsUndefined: Self = StObject.set(x, "fireEventArgs", js.undefined)
    
    @scala.inline
    def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreListeners(value: js.Function0[js.Any] | (js.Function1[/* store */ js.UndefOr[IStore], js.Any])): Self = StObject.set(x, "getStoreListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStoreListenersFunction0(value: () => js.Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => js.Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setHasListener(value: /* eventName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
    
    @scala.inline
    def setInsetPadding(value: Double): Self = StObject.set(x, "insetPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetPaddingUndefined: Self = StObject.set(x, "insetPadding", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setMask(value: js.Any): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setMon(
      value: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
    
    @scala.inline
    def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
    
    @scala.inline
    def setMun(
      value: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "mun", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
    
    @scala.inline
    def setOn(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setRedraw(value: /* resize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
    
    @scala.inline
    def setRelayEvents(
      value: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => js.Any
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    @scala.inline
    def setRemoveListener(
      value: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    
    @scala.inline
    def setRemoveManagedListener(
      value: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
    
    @scala.inline
    def setRestoreZoom(value: () => Unit): Self = StObject.set(x, "restoreZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestoreZoomUndefined: Self = StObject.set(x, "restoreZoom", js.undefined)
    
    @scala.inline
    def setResumeEvent(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "resumeEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResumeEventUndefined: Self = StObject.set(x, "resumeEvent", js.undefined)
    
    @scala.inline
    def setResumeEvents(value: () => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
    
    @scala.inline
    def setSave(value: /* config */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setSeries(value: Array): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSetZoom(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetZoomUndefined: Self = StObject.set(x, "setZoom", js.undefined)
    
    @scala.inline
    def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setSuspendEvent(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "suspendEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspendEventUndefined: Self = StObject.set(x, "suspendEvent", js.undefined)
    
    @scala.inline
    def setSuspendEvents(value: /* queueSuspended */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setUn(
      value: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
    
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
  }
}
