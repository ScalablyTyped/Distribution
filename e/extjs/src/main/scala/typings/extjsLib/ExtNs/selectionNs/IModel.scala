package typings
package extjsLib.ExtNs.selectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IModel
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] binds the store to the selModel
  		* @param store Object
  		* @param initial Object
  		*/
  var bindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], scala.Unit])
  ] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param suppressEvent Boolean True to not fire a deselect event
  		*/
  var deselect: js.UndefOr[
    js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Deselects all records in the view
  		* @param suppressEvent Boolean True to suppress any deselect events
  		*/
  var deselectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Deselects a range of rows if the selection model is not locked
  		* @param startRow Ext.data.Model/Number The record or index of the first row in the range
  		* @param endRow Ext.data.Model/Number The record or index of the last row in the range
  		*/
  var deselectRange: js.UndefOr[
    js.Function2[/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Returns the count of selected records
  		* @returns Number The number of selected records
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method]
  		* @returns Ext.data.Model Returns the last selected record.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Ext.data.Model[] The selected records
  		*/
  var getSelection: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the current selectionMode
  		* @returns String The selectionMode: 'SINGLE', 'MULTI' or 'SIMPLE'.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[
    js.Function0[_] | (js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], _])
  ] = js.undefined
  /** [Method] Returns true if there are any a selected records
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Determines if this record is currently focused
  		* @param record Ext.data.Model
  		*/
  var isFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Returns true if the selections are locked
  		* @returns Boolean
  		*/
  var isLocked: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param from Ext.data.Model/Number The start of the range to check.
  		* @param to Ext.data.Model/Number The end of the range to check.
  		* @returns Boolean
  		*/
  var isRangeSelected: js.UndefOr[
    js.Function2[/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] ("SINGLE"/"SIMPLE"/"MULTI") */
  var mode: js.UndefOr[js.Any] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Ext.data.AbstractStore The store being bound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onBindStore: js.UndefOr[
    js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[
    js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var pruneRemoved: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param keepExisting Boolean True to retain existing selections
  		* @param suppressEvent Boolean True to not fire a select event
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Selects all records in the view
  		* @param suppressEvent Boolean True to suppress any select events
  		*/
  var selectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Selects a range of rows if the selection model is not locked
  		* @param startRow Ext.data.Model/Number The record or index of the first row in the range
  		* @param endRow Ext.data.Model/Number The record or index of the last row in the range
  		* @param keepExisting Boolean True to retain existing selections
  		*/
  var selectRange: js.UndefOr[
    js.Function3[
      /* startRow */ js.UndefOr[js.Any], 
      /* endRow */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.util.MixedCollection) */
  var selected: js.UndefOr[extjsLib.ExtNs.utilNs.IMixedCollection] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param record Ext.data.Model
  		*/
  var setLastFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Locks the current selection and disables any changes from happening to the selection
  		* @param locked Boolean True to lock, false to unlock.
  		*/
  var setLocked: js.UndefOr[js.Function1[/* locked */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the current selectionMode
  		* @param selMode String 'SINGLE', 'MULTI' or 'SIMPLE'.
  		*/
  var setSelectionMode: js.UndefOr[js.Function1[/* selMode */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var toggleOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
}

object IModel {
  @scala.inline
  def apply(
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addManagedListener: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    allowDeselect: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bindStore: js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], scala.Unit] = null,
    bindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    deselect: js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    deselectAll: js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    deselectRange: js.Function2[/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getCount: js.Function0[scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLastSelected: js.Function0[IModel] = null,
    getSelection: js.Function0[extjsLib.ExtNs.Array] = null,
    getSelectionMode: js.Function0[java.lang.String] = null,
    getStore: js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore] = null,
    getStoreListeners: js.Function0[_] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    hasSelection: js.Function0[scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IModel] = null,
    isFocused: js.Function1[/* record */ js.UndefOr[IModel], scala.Unit] = null,
    isLocked: js.Function0[scala.Boolean] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isRangeSelected: js.Function2[/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any], scala.Boolean] = null,
    isSelected: js.Function1[/* record */ js.UndefOr[js.Any], scala.Boolean] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mode: js.Any = null,
    mon: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    mun: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    onBindStore: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    onUnbindStore: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    pruneRemoved: js.UndefOr[scala.Boolean] = js.undefined,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    removeListener: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    select: js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    selectAll: js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    selectRange: js.Function3[
      /* startRow */ js.UndefOr[js.Any], 
      /* endRow */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    selected: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    self: extjsLib.ExtNs.IClass = null,
    setLastFocused: js.Function1[/* record */ js.UndefOr[IModel], scala.Unit] = null,
    setLocked: js.Function1[/* locked */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setSelectionMode: js.Function1[/* selMode */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    toggleOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unbindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IModel = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore)
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(bindStoreListeners)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (deselect != null) __obj.updateDynamic("deselect")(deselect)
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(deselectAll)
    if (deselectRange != null) __obj.updateDynamic("deselectRange")(deselectRange)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(getLastSelected)
    if (getSelection != null) __obj.updateDynamic("getSelection")(getSelection)
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(getSelectionMode)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(hasSelection)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isFocused != null) __obj.updateDynamic("isFocused")(isFocused)
    if (isLocked != null) __obj.updateDynamic("isLocked")(isLocked)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (isRangeSelected != null) __obj.updateDynamic("isRangeSelected")(isRangeSelected)
    if (isSelected != null) __obj.updateDynamic("isSelected")(isSelected)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(onBindStore)
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(onUnbindStore)
    if (!js.isUndefined(pruneRemoved)) __obj.updateDynamic("pruneRemoved")(pruneRemoved)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll)
    if (selectRange != null) __obj.updateDynamic("selectRange")(selectRange)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(setLastFocused)
    if (setLocked != null) __obj.updateDynamic("setLocked")(setLocked)
    if (setSelectionMode != null) __obj.updateDynamic("setSelectionMode")(setSelectionMode)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (!js.isUndefined(toggleOnClick)) __obj.updateDynamic("toggleOnClick")(toggleOnClick)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(unbindStoreListeners)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IModel]
  }
}

