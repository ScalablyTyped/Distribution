package typings.extjs.Ext.form

import typings.extjs.Ext.IXTemplate
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IComboBox
  extends StObject
     with typings.extjs.Ext.form.field.IPicker {
  
  /** [Method] A method called when the filtering caused by the doQuery call is complete and the store has been either filtered loca
    * @param queryPlan Object An object containing details about the query was executed.
    */
  var afterQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var allQuery: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_IComboBox: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] A method which may modify aspects of how the store is to be filtered if queryMode is local  of loaded if queryMod
    * @param queryPlan Object An object containing details about the query to be executed.
    */
  var beforeQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Template method before a field is reset  */
  @JSName("beforeReset")
  var beforeReset_IComboBox: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Binds a store to this instance
    * @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
    */
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Clears any value currently set in the ComboBox  */
  var clearValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultListConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.undefined
  
  /** [Method] Executes a query to filter the dropdown list
    * @param queryString String The string to use to filter available items by matching against the configured valueField.
    * @param forceAll Boolean true to force the query to execute even if there are currently fewer characters in the field than the minimum specified by the minChars config option. It also clears any filter previously saved in the current store.
    * @param rawQuery Boolean Pass as true if the raw typed value is being used as the query string. This causes the resulting store load to leave the raw value undisturbed.
    * @returns Boolean true if the query was permitted to run, false if it was cancelled by a beforequery handler.
    */
  var doQuery: js.UndefOr[
    js.Function3[
      /* queryString */ js.UndefOr[String], 
      /* forceAll */ js.UndefOr[Boolean], 
      /* rawQuery */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableRegEx: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.XTemplate) */
  var fieldSubTpl: js.UndefOr[IXTemplate] = js.undefined
  
  /** [Method] Finds the record by searching for a specific field value combination
    * @param field String The name of the field to test.
    * @param value Object The value to match the field against.
    * @returns Ext.data.Model The matched record or false.
    */
  var findRecord: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* value */ js.UndefOr[Any], IModel]
  ] = js.undefined
  
  /** [Method] Finds the record by searching values in the displayField
    * @param value Object The value to match the field against.
    * @returns Ext.data.Model The matched record or false.
    */
  var findRecordByDisplay: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], IModel]] = js.undefined
  
  /** [Method] Finds the record by searching values in the valueField
    * @param value Object The value to match the field against.
    * @returns Ext.data.Model The matched record or false.
    */
  var findRecordByValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], IModel]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var forceSelection: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the store associated with this ComboBox
    * @returns Ext.data.Store The store
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore | IStore]] = js.undefined
  
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function0[Any] | (js.Function1[/* store */ js.UndefOr[IStore], Any])] = js.undefined
  
  /** [Method] Returns the value that would be included in a standard form submit for this field
    * @returns String The value to be submitted, or null.
    */
  @JSName("getSubmitValue")
  var getSubmitValue_IComboBox: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the current data value of the field
    * @returns Object value The field value
    */
  @JSName("getValue")
  var getValue_IComboBox: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var growToLongestValue: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.undefined
  
  /** [Property] (String) */
  var lastQuery: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var minChars: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Object
    * @param initial Object
    */
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[Any | IAbstractStore], js.UndefOr[Any | Boolean], Unit]] = js.undefined
  
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Object
    */
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
  ] = js.undefined
  
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var queryCaching: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var queryDelay: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var queryMode: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var queryParam: js.UndefOr[String] = js.undefined
  
  /** [Method] Selects an item by a Model or by a key value
    * @param r Object
    */
  var select: js.UndefOr[js.Function1[/* r */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var selectOnTab: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.data.Store/String/Array) */
  var store: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var transform: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var triggerAction: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var typeAhead: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var typeAheadDelay: js.UndefOr[Double] = js.undefined
  
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var valueNotFoundText: js.UndefOr[String] = js.undefined
}
object IComboBox {
  
  inline def apply(): IComboBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComboBox]
  }
  
  extension [Self <: IComboBox](x: Self) {
    
    inline def setAfterQuery(value: /* queryPlan */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "afterQuery", js.Any.fromFunction1(value))
    
    inline def setAfterQueryUndefined: Self = StObject.set(x, "afterQuery", js.undefined)
    
    inline def setAllQuery(value: String): Self = StObject.set(x, "allQuery", value.asInstanceOf[js.Any])
    
    inline def setAllQueryUndefined: Self = StObject.set(x, "allQuery", js.undefined)
    
    inline def setAnyMatch(value: Boolean): Self = StObject.set(x, "anyMatch", value.asInstanceOf[js.Any])
    
    inline def setAnyMatchUndefined: Self = StObject.set(x, "anyMatch", js.undefined)
    
    inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
    
    inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
    
    inline def setBeforeBlur(value: () => Unit): Self = StObject.set(x, "beforeBlur", js.Any.fromFunction0(value))
    
    inline def setBeforeBlurUndefined: Self = StObject.set(x, "beforeBlur", js.undefined)
    
    inline def setBeforeQuery(value: /* queryPlan */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beforeQuery", js.Any.fromFunction1(value))
    
    inline def setBeforeQueryUndefined: Self = StObject.set(x, "beforeQuery", js.undefined)
    
    inline def setBeforeReset(value: () => Unit): Self = StObject.set(x, "beforeReset", js.Any.fromFunction0(value))
    
    inline def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
    
    inline def setBindStore(value: js.UndefOr[Any] => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction1(value))
    
    inline def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "bindStoreListeners", js.Any.fromFunction1(value))
    
    inline def setBindStoreListenersUndefined: Self = StObject.set(x, "bindStoreListeners", js.undefined)
    
    inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setClearValue(value: () => Unit): Self = StObject.set(x, "clearValue", js.Any.fromFunction0(value))
    
    inline def setClearValueUndefined: Self = StObject.set(x, "clearValue", js.undefined)
    
    inline def setDefaultListConfig(value: Any): Self = StObject.set(x, "defaultListConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultListConfigUndefined: Self = StObject.set(x, "defaultListConfig", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    inline def setDoQuery(
      value: (/* queryString */ js.UndefOr[String], /* forceAll */ js.UndefOr[Boolean], /* rawQuery */ js.UndefOr[Boolean]) => Boolean
    ): Self = StObject.set(x, "doQuery", js.Any.fromFunction3(value))
    
    inline def setDoQueryUndefined: Self = StObject.set(x, "doQuery", js.undefined)
    
    inline def setEnableRegEx(value: Boolean): Self = StObject.set(x, "enableRegEx", value.asInstanceOf[js.Any])
    
    inline def setEnableRegExUndefined: Self = StObject.set(x, "enableRegEx", js.undefined)
    
    inline def setFieldSubTpl(value: IXTemplate): Self = StObject.set(x, "fieldSubTpl", value.asInstanceOf[js.Any])
    
    inline def setFieldSubTplUndefined: Self = StObject.set(x, "fieldSubTpl", js.undefined)
    
    inline def setFindRecord(value: (/* field */ js.UndefOr[String], /* value */ js.UndefOr[Any]) => IModel): Self = StObject.set(x, "findRecord", js.Any.fromFunction2(value))
    
    inline def setFindRecordByDisplay(value: /* value */ js.UndefOr[Any] => IModel): Self = StObject.set(x, "findRecordByDisplay", js.Any.fromFunction1(value))
    
    inline def setFindRecordByDisplayUndefined: Self = StObject.set(x, "findRecordByDisplay", js.undefined)
    
    inline def setFindRecordByValue(value: /* value */ js.UndefOr[Any] => IModel): Self = StObject.set(x, "findRecordByValue", js.Any.fromFunction1(value))
    
    inline def setFindRecordByValueUndefined: Self = StObject.set(x, "findRecordByValue", js.undefined)
    
    inline def setFindRecordUndefined: Self = StObject.set(x, "findRecord", js.undefined)
    
    inline def setForceSelection(value: Boolean): Self = StObject.set(x, "forceSelection", value.asInstanceOf[js.Any])
    
    inline def setForceSelectionUndefined: Self = StObject.set(x, "forceSelection", js.undefined)
    
    inline def setGetStore(value: () => IAbstractStore | IStore): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    inline def setGetStoreListeners(value: js.Function0[Any] | (js.Function1[/* store */ js.UndefOr[IStore], Any])): Self = StObject.set(x, "getStoreListeners", value.asInstanceOf[js.Any])
    
    inline def setGetStoreListenersFunction0(value: () => Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction0(value))
    
    inline def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
    
    inline def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
    
    inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    inline def setGetSubmitValue(value: () => String): Self = StObject.set(x, "getSubmitValue", js.Any.fromFunction0(value))
    
    inline def setGetSubmitValueUndefined: Self = StObject.set(x, "getSubmitValue", js.undefined)
    
    inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setGrowToLongestValue(value: Boolean): Self = StObject.set(x, "growToLongestValue", value.asInstanceOf[js.Any])
    
    inline def setGrowToLongestValueUndefined: Self = StObject.set(x, "growToLongestValue", js.undefined)
    
    inline def setHiddenName(value: String): Self = StObject.set(x, "hiddenName", value.asInstanceOf[js.Any])
    
    inline def setHiddenNameUndefined: Self = StObject.set(x, "hiddenName", js.undefined)
    
    inline def setLastQuery(value: String): Self = StObject.set(x, "lastQuery", value.asInstanceOf[js.Any])
    
    inline def setLastQueryUndefined: Self = StObject.set(x, "lastQuery", js.undefined)
    
    inline def setListConfig(value: Any): Self = StObject.set(x, "listConfig", value.asInstanceOf[js.Any])
    
    inline def setListConfigUndefined: Self = StObject.set(x, "listConfig", js.undefined)
    
    inline def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
    
    inline def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
    
    inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    
    inline def setOnBindStore(value: (js.UndefOr[Any | IAbstractStore], js.UndefOr[Any | Boolean]) => Unit): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2(value))
    
    inline def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
    
    inline def setOnUnbindStore(
      value: (js.Function1[/* store */ js.UndefOr[Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
    ): Self = StObject.set(x, "onUnbindStore", value.asInstanceOf[js.Any])
    
    inline def setOnUnbindStoreFunction1(value: /* store */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction1(value))
    
    inline def setOnUnbindStoreFunction2(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2(value))
    
    inline def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setQueryCaching(value: Boolean): Self = StObject.set(x, "queryCaching", value.asInstanceOf[js.Any])
    
    inline def setQueryCachingUndefined: Self = StObject.set(x, "queryCaching", js.undefined)
    
    inline def setQueryDelay(value: Double): Self = StObject.set(x, "queryDelay", value.asInstanceOf[js.Any])
    
    inline def setQueryDelayUndefined: Self = StObject.set(x, "queryDelay", js.undefined)
    
    inline def setQueryMode(value: String): Self = StObject.set(x, "queryMode", value.asInstanceOf[js.Any])
    
    inline def setQueryModeUndefined: Self = StObject.set(x, "queryMode", js.undefined)
    
    inline def setQueryParam(value: String): Self = StObject.set(x, "queryParam", value.asInstanceOf[js.Any])
    
    inline def setQueryParamUndefined: Self = StObject.set(x, "queryParam", js.undefined)
    
    inline def setSelect(value: /* r */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectOnTab(value: Boolean): Self = StObject.set(x, "selectOnTab", value.asInstanceOf[js.Any])
    
    inline def setSelectOnTabUndefined: Self = StObject.set(x, "selectOnTab", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTransform(value: Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTriggerAction(value: String): Self = StObject.set(x, "triggerAction", value.asInstanceOf[js.Any])
    
    inline def setTriggerActionUndefined: Self = StObject.set(x, "triggerAction", js.undefined)
    
    inline def setTypeAhead(value: Boolean): Self = StObject.set(x, "typeAhead", value.asInstanceOf[js.Any])
    
    inline def setTypeAheadDelay(value: Double): Self = StObject.set(x, "typeAheadDelay", value.asInstanceOf[js.Any])
    
    inline def setTypeAheadDelayUndefined: Self = StObject.set(x, "typeAheadDelay", js.undefined)
    
    inline def setTypeAheadUndefined: Self = StObject.set(x, "typeAhead", js.undefined)
    
    inline def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1(value))
    
    inline def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
    
    inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    
    inline def setValueNotFoundText(value: String): Self = StObject.set(x, "valueNotFoundText", value.asInstanceOf[js.Any])
    
    inline def setValueNotFoundTextUndefined: Self = StObject.set(x, "valueNotFoundText", js.undefined)
  }
}
