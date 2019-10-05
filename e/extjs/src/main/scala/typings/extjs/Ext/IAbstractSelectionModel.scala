package typings.extjs.Ext

import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IAbstractSelectionModel extends IObservable {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /** [Method] binds the store to the selModel
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
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param suppressEvent Boolean True to not fire a deselect event
  		*/
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Deselects all records in the view
  		* @param suppressEvent Boolean True to suppress any deselect events
  		*/
  var deselectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Deselects a range of rows if the selection model is not locked
  		* @param startRow Ext.data.Model/Number The record or index of the first row in the range
  		* @param endRow Ext.data.Model/Number The record or index of the last row in the range
  		*/
  var deselectRange: js.UndefOr[
    js.Function2[/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Returns the count of selected records
  		* @returns Number The number of selected records
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method]
  		* @returns Ext.data.Model Returns the last selected record.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Ext.data.Model[] The selected records
  		*/
  var getSelection: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the current selectionMode
  		* @returns String The selectionMode: 'SINGLE', 'MULTI' or 'SIMPLE'.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.undefined
  /** [Method] Returns true if there are any a selected records
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Determines if this record is currently focused
  		* @param record Ext.data.Model
  		*/
  var isFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Unit]] = js.undefined
  /** [Method] Returns true if the selections are locked
  		* @returns Boolean
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param from Ext.data.Model/Number The start of the range to check.
  		* @param to Ext.data.Model/Number The end of the range to check.
  		* @returns Boolean
  		*/
  var isRangeSelected: js.UndefOr[
    js.Function2[/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] ("SINGLE"/"SIMPLE"/"MULTI") */
  var mode: js.UndefOr[js.Any] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Ext.data.AbstractStore The store being bound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var pruneRemoved: js.UndefOr[Boolean] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param keepExisting Boolean True to retain existing selections
  		* @param suppressEvent Boolean True to not fire a select event
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Selects all records in the view
  		* @param suppressEvent Boolean True to suppress any select events
  		*/
  var selectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Selects a range of rows if the selection model is not locked
  		* @param startRow Ext.data.Model/Number The record or index of the first row in the range
  		* @param endRow Ext.data.Model/Number The record or index of the last row in the range
  		* @param keepExisting Boolean True to retain existing selections
  		*/
  var selectRange: js.UndefOr[
    js.Function3[
      /* startRow */ js.UndefOr[js.Any], 
      /* endRow */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.util.MixedCollection) */
  var selected: js.UndefOr[IMixedCollection] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param record Ext.data.Model
  		*/
  var setLastFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Unit]] = js.undefined
  /** [Method] Locks the current selection and disables any changes from happening to the selection
  		* @param locked Boolean True to lock, false to unlock.
  		*/
  var setLocked: js.UndefOr[js.Function1[/* locked */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the current selectionMode
  		* @param selMode String 'SINGLE', 'MULTI' or 'SIMPLE'.
  		*/
  var setSelectionMode: js.UndefOr[js.Function1[/* selMode */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var toggleOnClick: js.UndefOr[Boolean] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
}

object IAbstractSelectionModel {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bindStore: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit = null,
    bindStoreListeners: /* store */ js.UndefOr[IAbstractStore] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    deselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    deselectAll: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    deselectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getCount: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLastSelected: () => IModel = null,
    getSelection: () => Array = null,
    getSelectionMode: () => java.lang.String = null,
    getStore: () => IAbstractStore = null,
    getStoreListeners: () => _ = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    hasSelection: () => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IAbstractSelectionModel = null,
    isFocused: /* record */ js.UndefOr[IModel] => Unit = null,
    isLocked: () => Boolean = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isRangeSelected: (/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any]) => Boolean = null,
    isSelected: /* record */ js.UndefOr[js.Any] => Boolean = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mode: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    onBindStore: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit = null,
    onUnbindStore: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit = null,
    pruneRemoved: js.UndefOr[Boolean] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    select: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    selectAll: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    selectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean]) => Unit = null,
    selected: IMixedCollection = null,
    self: IClass = null,
    setLastFocused: /* record */ js.UndefOr[IModel] => Unit = null,
    setLocked: /* locked */ js.UndefOr[Boolean] => Unit = null,
    setSelectionMode: /* selMode */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    toggleOnClick: js.UndefOr[Boolean] = js.undefined,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    unbindStoreListeners: /* store */ js.UndefOr[IAbstractStore] => Unit = null,
    uses: Array = null
  ): IAbstractSelectionModel = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction2(bindStore))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2(deselect))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1(deselectAll))
    if (deselectRange != null) __obj.updateDynamic("deselectRange")(js.Any.fromFunction2(deselectRange))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(js.Any.fromFunction0(getLastSelected))
    if (getSelection != null) __obj.updateDynamic("getSelection")(js.Any.fromFunction0(getSelection))
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(js.Any.fromFunction0(getSelectionMode))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(js.Any.fromFunction0(getStoreListeners))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isFocused != null) __obj.updateDynamic("isFocused")(js.Any.fromFunction1(isFocused))
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (isRangeSelected != null) __obj.updateDynamic("isRangeSelected")(js.Any.fromFunction2(isRangeSelected))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2(onBindStore))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2(onUnbindStore))
    if (!js.isUndefined(pruneRemoved)) __obj.updateDynamic("pruneRemoved")(pruneRemoved)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1(selectAll))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3(selectRange))
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(js.Any.fromFunction1(setLastFocused))
    if (setLocked != null) __obj.updateDynamic("setLocked")(js.Any.fromFunction1(setLocked))
    if (setSelectionMode != null) __obj.updateDynamic("setSelectionMode")(js.Any.fromFunction1(setSelectionMode))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (!js.isUndefined(toggleOnClick)) __obj.updateDynamic("toggleOnClick")(toggleOnClick)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstractSelectionModel]
  }
}

