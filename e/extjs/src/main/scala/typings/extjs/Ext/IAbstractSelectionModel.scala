package typings.extjs.Ext

import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait IAbstractSelectionModel extends IObservable {
  
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  
  /** [Method] binds the store to the selModel
    * @param store Object
    * @param initial Object
    */
  var bindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
  ] = js.native
  
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  
  /** [Method] Deselects a record instance by record instance or index
    * @param records Ext.data.Model[]/Number An array of records or an index
    * @param suppressEvent Boolean True to not fire a deselect event
    */
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Deselects all records in the view
    * @param suppressEvent Boolean True to suppress any deselect events
    */
  var deselectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Deselects a range of rows if the selection model is not locked
    * @param startRow Ext.data.Model/Number The record or index of the first row in the range
    * @param endRow Ext.data.Model/Number The record or index of the last row in the range
    */
  var deselectRange: js.UndefOr[
    js.Function2[/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Returns the count of selected records
    * @returns Number The number of selected records
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method]
    * @returns Ext.data.Model Returns the last selected record.
    */
  var getLastSelected: js.UndefOr[js.Function0[IModel]] = js.native
  
  /** [Method] Returns an array of the currently selected records
    * @returns Ext.data.Model[] The selected records
    */
  var getSelection: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the current selectionMode
    * @returns String The selectionMode: 'SINGLE', 'MULTI' or 'SIMPLE'.
    */
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.native
  
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  
  /** [Method] Returns true if there are any a selected records
    * @returns Boolean
    */
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Determines if this record is currently focused
    * @param record Ext.data.Model
    */
  var isFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Unit]] = js.native
  
  /** [Method] Returns true if the selections are locked
    * @returns Boolean
    */
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if the specified row is selected
    * @param from Ext.data.Model/Number The start of the range to check.
    * @param to Ext.data.Model/Number The end of the range to check.
    * @returns Boolean
    */
  var isRangeSelected: js.UndefOr[
    js.Function2[/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  
  /** [Method] Returns true if the specified row is selected
    * @param record Ext.data.Model/Number The record or index of the record to check
    * @returns Boolean
    */
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Config Option] ("SINGLE"/"SIMPLE"/"MULTI") */
  var mode: js.UndefOr[js.Any] = js.native
  
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var pruneRemoved: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
  /** [Method] Selects all records in the view
    * @param suppressEvent Boolean True to suppress any select events
    */
  var selectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.native
  
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
  ] = js.native
  
  /** [Property] (Ext.util.MixedCollection) */
  var selected: js.UndefOr[IMixedCollection] = js.native
  
  /** [Method] Sets a record as the last focused record
    * @param record Ext.data.Model
    */
  var setLastFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Unit]] = js.native
  
  /** [Method] Locks the current selection and disables any changes from happening to the selection
    * @param locked Boolean True to lock, false to unlock.
    */
  var setLocked: js.UndefOr[js.Function1[/* locked */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the current selectionMode
    * @param selMode String 'SINGLE', 'MULTI' or 'SIMPLE'.
    */
  var setSelectionMode: js.UndefOr[js.Function1[/* selMode */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var toggleOnClick: js.UndefOr[Boolean] = js.native
  
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
}
object IAbstractSelectionModel {
  
  @scala.inline
  def apply(): IAbstractSelectionModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractSelectionModel]
  }
  
  @scala.inline
  implicit class IAbstractSelectionModelMutableBuilder[Self <: IAbstractSelectionModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
    
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
    def setDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeselectAll(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeselectAllUndefined: Self = StObject.set(x, "deselectAll", js.undefined)
    
    @scala.inline
    def setDeselectRange(value: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "deselectRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeselectRangeUndefined: Self = StObject.set(x, "deselectRange", js.undefined)
    
    @scala.inline
    def setDeselectUndefined: Self = StObject.set(x, "deselect", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    @scala.inline
    def setGetLastSelected(value: () => IModel): Self = StObject.set(x, "getLastSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastSelectedUndefined: Self = StObject.set(x, "getLastSelected", js.undefined)
    
    @scala.inline
    def setGetSelection(value: () => Array): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionMode(value: () => java.lang.String): Self = StObject.set(x, "getSelectionMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionModeUndefined: Self = StObject.set(x, "getSelectionMode", js.undefined)
    
    @scala.inline
    def setGetSelectionUndefined: Self = StObject.set(x, "getSelection", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreListeners(value: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])): Self = StObject.set(x, "getStoreListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStoreListenersFunction0(value: () => _): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => _): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setHasSelection(value: () => Boolean): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
    
    @scala.inline
    def setIsFocused(value: /* record */ js.UndefOr[IModel] => Unit): Self = StObject.set(x, "isFocused", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    @scala.inline
    def setIsRangeSelected(value: (/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "isRangeSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsRangeSelectedUndefined: Self = StObject.set(x, "isRangeSelected", js.undefined)
    
    @scala.inline
    def setIsSelected(value: /* record */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    @scala.inline
    def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
    
    @scala.inline
    def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
    
    @scala.inline
    def setPruneRemoved(value: Boolean): Self = StObject.set(x, "pruneRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPruneRemovedUndefined: Self = StObject.set(x, "pruneRemoved", js.undefined)
    
    @scala.inline
    def setSelect(
      value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "select", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSelectAll(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "selectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    @scala.inline
    def setSelectRange(
      value: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "selectRange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelected(value: IMixedCollection): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSetLastFocused(value: /* record */ js.UndefOr[IModel] => Unit): Self = StObject.set(x, "setLastFocused", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLastFocusedUndefined: Self = StObject.set(x, "setLastFocused", js.undefined)
    
    @scala.inline
    def setSetLocked(value: /* locked */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setLocked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLockedUndefined: Self = StObject.set(x, "setLocked", js.undefined)
    
    @scala.inline
    def setSetSelectionMode(value: /* selMode */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setSelectionMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectionModeUndefined: Self = StObject.set(x, "setSelectionMode", js.undefined)
    
    @scala.inline
    def setToggleOnClick(value: Boolean): Self = StObject.set(x, "toggleOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleOnClickUndefined: Self = StObject.set(x, "toggleOnClick", js.undefined)
    
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
  }
}
