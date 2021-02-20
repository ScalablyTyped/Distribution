package typings.extjs.Ext

import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selection {
  
  @js.native
  trait ICellModel extends IModel {
    
    /** [Method] Deselects a record instance by record instance or index
      * @param record Object
      * @param suppressEvent Object
      */
    @JSName("deselect")
    var deselect_ICellModel: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Config Option] (Boolean) */
    var enableKeyNav: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the current position in the format row row column column  */
    var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] ("SINGLE") */
    @JSName("mode")
    var mode_ICellModel: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var preventWrap: js.UndefOr[Boolean] = js.native
    
    /** [Method] Selects a record instance by record instance or index
      * @param pos Object
      * @param keepExisting Object
      * @param suppressEvent Object
      */
    @JSName("select")
    var select_ICellModel: js.UndefOr[
        js.Function3[
          /* pos */ js.UndefOr[js.Any], 
          /* keepExisting */ js.UndefOr[js.Any], 
          /* suppressEvent */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Sets the current position
      * @param position Object The position to set.
      * @param suppressEvent Boolean True to suppress selection events
      */
    var setCurrentPosition: js.UndefOr[
        js.Function2[/* position */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
      ] = js.native
  }
  object ICellModel {
    
    @scala.inline
    def apply(): ICellModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICellModel]
    }
    
    @scala.inline
    implicit class ICellModelMutableBuilder[Self <: ICellModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeselect(value: (/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeselectUndefined: Self = StObject.set(x, "deselect", js.undefined)
      
      @scala.inline
      def setEnableKeyNav(value: Boolean): Self = StObject.set(x, "enableKeyNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyNavUndefined: Self = StObject.set(x, "enableKeyNav", js.undefined)
      
      @scala.inline
      def setGetCurrentPosition(value: () => Unit): Self = StObject.set(x, "getCurrentPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentPositionUndefined: Self = StObject.set(x, "getCurrentPosition", js.undefined)
      
      @scala.inline
      def setMode(value: java.lang.String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPreventWrap(value: Boolean): Self = StObject.set(x, "preventWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventWrapUndefined: Self = StObject.set(x, "preventWrap", js.undefined)
      
      @scala.inline
      def setSelect(
        value: (/* pos */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSetCurrentPosition(value: (/* position */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setCurrentPosition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetCurrentPositionUndefined: Self = StObject.set(x, "setCurrentPosition", js.undefined)
    }
  }
  
  @js.native
  trait ICheckboxModel extends IRowModel {
    
    /** [Config Option] (Boolean) */
    var checkOnly: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var checkSelector: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Retrieve a configuration to be used in a HeaderContainer  */
    var getHeaderConfig: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Number/String) */
    var injectCheckbox: js.UndefOr[js.Any] = js.native
    
    /** [Method] Toggle between selecting all and deselecting all when clicking on a checkbox header
      * @param headerCt Object
      * @param header Object
      * @param e Object
      */
    var onHeaderClick: js.UndefOr[
        js.Function3[
          /* headerCt */ js.UndefOr[js.Any], 
          /* header */ js.UndefOr[js.Any], 
          /* e */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Generates the HTML to be rendered in the injected checkbox column for each row
      * @param value Object
      * @param metaData Object
      * @param record Object
      * @param rowIndex Object
      * @param colIndex Object
      * @param store Object
      * @param view Object
      */
    var renderer: js.UndefOr[
        js.Function7[
          /* value */ js.UndefOr[js.Any], 
          /* metaData */ js.UndefOr[js.Any], 
          /* record */ js.UndefOr[js.Any], 
          /* rowIndex */ js.UndefOr[js.Any], 
          /* colIndex */ js.UndefOr[js.Any], 
          /* store */ js.UndefOr[js.Any], 
          /* view */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Config Option] (Boolean) */
    var showHeaderCheckbox: js.UndefOr[Boolean] = js.native
  }
  object ICheckboxModel {
    
    @scala.inline
    def apply(): ICheckboxModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxModel]
    }
    
    @scala.inline
    implicit class ICheckboxModelMutableBuilder[Self <: ICheckboxModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckOnly(value: Boolean): Self = StObject.set(x, "checkOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckOnlyUndefined: Self = StObject.set(x, "checkOnly", js.undefined)
      
      @scala.inline
      def setCheckSelector(value: java.lang.String): Self = StObject.set(x, "checkSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckSelectorUndefined: Self = StObject.set(x, "checkSelector", js.undefined)
      
      @scala.inline
      def setGetHeaderConfig(value: () => Unit): Self = StObject.set(x, "getHeaderConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeaderConfigUndefined: Self = StObject.set(x, "getHeaderConfig", js.undefined)
      
      @scala.inline
      def setInjectCheckbox(value: js.Any): Self = StObject.set(x, "injectCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectCheckboxUndefined: Self = StObject.set(x, "injectCheckbox", js.undefined)
      
      @scala.inline
      def setOnHeaderClick(
        value: (/* headerCt */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onHeaderClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnHeaderClickUndefined: Self = StObject.set(x, "onHeaderClick", js.undefined)
      
      @scala.inline
      def setRenderer(
        value: (/* value */ js.UndefOr[js.Any], /* metaData */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIndex */ js.UndefOr[js.Any], /* colIndex */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7(value))
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setShowHeaderCheckbox(value: Boolean): Self = StObject.set(x, "showHeaderCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderCheckboxUndefined: Self = StObject.set(x, "showHeaderCheckbox", js.undefined)
    }
  }
  
  @js.native
  trait IDataViewModel extends IModel {
    
    /** [Config Option] (Boolean) */
    var enableKeyNav: js.UndefOr[Boolean] = js.native
  }
  object IDataViewModel {
    
    @scala.inline
    def apply(): IDataViewModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDataViewModel]
    }
    
    @scala.inline
    implicit class IDataViewModelMutableBuilder[Self <: IDataViewModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableKeyNav(value: Boolean): Self = StObject.set(x, "enableKeyNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyNavUndefined: Self = StObject.set(x, "enableKeyNav", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
  trait IModel extends IObservable {
    
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
    var getLastSelected: js.UndefOr[js.Function0[this.type]] = js.native
    
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
    var isFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], Unit]] = js.native
    
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
    var setLastFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], Unit]] = js.native
    
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
  object IModel {
    
    @scala.inline
    def apply(): IModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModel]
    }
    
    @scala.inline
    implicit class IModelMutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait IRowModel extends IModel {
    
    /** [Config Option] (Boolean) */
    var enableKeyNav: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns position of the first selected cell in the selection in the format row row column column  */
    var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var ignoreRightMouseSelection: js.UndefOr[Boolean] = js.native
    
    /** [Method] Selects the record immediately following the currently selected record
      * @param keepExisting Boolean True to retain existing selections
      * @param suppressEvent Boolean Set to false to not fire a select event
      * @returns Boolean true if there is a next record, else false
      */
    var selectNext: js.UndefOr[
        js.Function2[
          /* keepExisting */ js.UndefOr[Boolean], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.native
    
    /** [Method] Selects the record that precedes the currently selected record
      * @param keepExisting Boolean True to retain existing selections
      * @param suppressEvent Boolean Set to false to not fire a select event
      * @returns Boolean true if there is a previous record, else false
      */
    var selectPrevious: js.UndefOr[
        js.Function2[
          /* keepExisting */ js.UndefOr[Boolean], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.native
  }
  object IRowModel {
    
    @scala.inline
    def apply(): IRowModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowModel]
    }
    
    @scala.inline
    implicit class IRowModelMutableBuilder[Self <: IRowModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableKeyNav(value: Boolean): Self = StObject.set(x, "enableKeyNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyNavUndefined: Self = StObject.set(x, "enableKeyNav", js.undefined)
      
      @scala.inline
      def setGetCurrentPosition(value: () => Unit): Self = StObject.set(x, "getCurrentPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentPositionUndefined: Self = StObject.set(x, "getCurrentPosition", js.undefined)
      
      @scala.inline
      def setIgnoreRightMouseSelection(value: Boolean): Self = StObject.set(x, "ignoreRightMouseSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRightMouseSelectionUndefined: Self = StObject.set(x, "ignoreRightMouseSelection", js.undefined)
      
      @scala.inline
      def setSelectNext(
        value: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "selectNext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectNextUndefined: Self = StObject.set(x, "selectNext", js.undefined)
      
      @scala.inline
      def setSelectPrevious(
        value: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "selectPrevious", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectPreviousUndefined: Self = StObject.set(x, "selectPrevious", js.undefined)
    }
  }
  
  @js.native
  trait ITreeModel extends IRowModel {
    
    /** [Method] binds the store to the selModel
      * @param store Object
      * @param initial Object
      */
    @JSName("bindStore")
    var bindStore_ITreeModel: js.UndefOr[
        js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit]
      ] = js.native
  }
  object ITreeModel {
    
    @scala.inline
    def apply(): ITreeModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITreeModel]
    }
    
    @scala.inline
    implicit class ITreeModelMutableBuilder[Self <: ITreeModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindStore(value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    }
  }
}
