package typings.extjs.Ext

import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IAbstractSelectionModelOps[Self <: IAbstractSelectionModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDeselect(value: Boolean): Self = this.set("allowDeselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDeselect: Self = this.set("allowDeselect", js.undefined)
    @scala.inline
    def setBindStoreFunction2(value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit): Self = this.set("bindStore", js.Any.fromFunction2(value))
    @scala.inline
    def setBindStoreFunction1(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    @scala.inline
    def setBindStore(
      value: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
    ): Self = this.set("bindStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("bindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStoreListeners: Self = this.set("bindStoreListeners", js.undefined)
    @scala.inline
    def setDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = this.set("deselect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeselect: Self = this.set("deselect", js.undefined)
    @scala.inline
    def setDeselectAll(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = this.set("deselectAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeselectAll: Self = this.set("deselectAll", js.undefined)
    @scala.inline
    def setDeselectRange(value: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any]) => Unit): Self = this.set("deselectRange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeselectRange: Self = this.set("deselectRange", js.undefined)
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    @scala.inline
    def setGetLastSelected(value: () => IModel): Self = this.set("getLastSelected", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLastSelected: Self = this.set("getLastSelected", js.undefined)
    @scala.inline
    def setGetSelection(value: () => Array): Self = this.set("getSelection", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSelection: Self = this.set("getSelection", js.undefined)
    @scala.inline
    def setGetSelectionMode(value: () => java.lang.String): Self = this.set("getSelectionMode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSelectionMode: Self = this.set("getSelectionMode", js.undefined)
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => _): Self = this.set("getStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStoreListenersFunction0(value: () => _): Self = this.set("getStoreListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStoreListeners(value: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])): Self = this.set("getStoreListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetStoreListeners: Self = this.set("getStoreListeners", js.undefined)
    @scala.inline
    def setHasSelection(value: () => Boolean): Self = this.set("hasSelection", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasSelection: Self = this.set("hasSelection", js.undefined)
    @scala.inline
    def setIsFocused(value: /* record */ js.UndefOr[IModel] => Unit): Self = this.set("isFocused", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setIsLocked(value: () => Boolean): Self = this.set("isLocked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    @scala.inline
    def setIsRangeSelected(value: (/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any]) => Boolean): Self = this.set("isRangeSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsRangeSelected: Self = this.set("isRangeSelected", js.undefined)
    @scala.inline
    def setIsSelected(value: /* record */ js.UndefOr[js.Any] => Boolean): Self = this.set("isSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setMode(value: js.Any): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = this.set("onBindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBindStore: Self = this.set("onBindStore", js.undefined)
    @scala.inline
    def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUnbindStore: Self = this.set("onUnbindStore", js.undefined)
    @scala.inline
    def setPruneRemoved(value: Boolean): Self = this.set("pruneRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePruneRemoved: Self = this.set("pruneRemoved", js.undefined)
    @scala.inline
    def setSelect(
      value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("select", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectAll(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = this.set("selectAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectAll: Self = this.set("selectAll", js.undefined)
    @scala.inline
    def setSelectRange(
      value: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("selectRange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSelectRange: Self = this.set("selectRange", js.undefined)
    @scala.inline
    def setSelected(value: IMixedCollection): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSetLastFocused(value: /* record */ js.UndefOr[IModel] => Unit): Self = this.set("setLastFocused", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLastFocused: Self = this.set("setLastFocused", js.undefined)
    @scala.inline
    def setSetLocked(value: /* locked */ js.UndefOr[Boolean] => Unit): Self = this.set("setLocked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLocked: Self = this.set("setLocked", js.undefined)
    @scala.inline
    def setSetSelectionMode(value: /* selMode */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setSelectionMode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSelectionMode: Self = this.set("setSelectionMode", js.undefined)
    @scala.inline
    def setToggleOnClick(value: Boolean): Self = this.set("toggleOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleOnClick: Self = this.set("toggleOnClick", js.undefined)
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("unbindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnbindStoreListeners: Self = this.set("unbindStoreListeners", js.undefined)
  }
  
}

