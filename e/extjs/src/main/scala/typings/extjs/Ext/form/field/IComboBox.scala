package typings.extjs.Ext.form.field

import typings.extjs.Ext.IXTemplate
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait IComboBox extends IPicker {
  
  /** [Method] A method called when the filtering caused by the doQuery call is complete and the store has been either filtered loca
    * @param queryPlan Object An object containing details about the query was executed.
    */
  var afterQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var allQuery: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.native
  
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_IComboBox: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] A method which may modify aspects of how the store is to be filtered if queryMode is local  of loaded if queryMod
    * @param queryPlan Object An object containing details about the query to be executed.
    */
  var beforeQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method before a field is reset  */
  @JSName("beforeReset")
  var beforeReset_IComboBox: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Binds a store to this instance
    * @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
    */
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** [Method] Clears any value currently set in the ComboBox  */
  var clearValue: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Object) */
  var defaultListConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var delimiter: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var enableRegEx: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.XTemplate) */
  var fieldSubTpl: js.UndefOr[IXTemplate] = js.native
  
  /** [Method] Finds the record by searching for a specific field value combination
    * @param field String The name of the field to test.
    * @param value Object The value to match the field against.
    * @returns Ext.data.Model The matched record or false.
    */
  var findRecord: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], IModel]
  ] = js.native
  
  /** [Method] Finds the record by searching values in the displayField
    * @param value Object The value to match the field against.
    * @returns Ext.data.Model The matched record or false.
    */
  var findRecordByDisplay: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IModel]] = js.native
  
  /** [Method] Finds the record by searching values in the valueField
    * @param value Object The value to match the field against.
    * @returns Ext.data.Model The matched record or false.
    */
  var findRecordByValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IModel]] = js.native
  
  /** [Config Option] (Boolean) */
  var forceSelection: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the store associated with this ComboBox
    * @returns Ext.data.Store The store
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore | IStore]] = js.native
  
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  
  /** [Method] Returns the value that would be included in a standard form submit for this field
    * @returns String The value to be submitted, or null.
    */
  @JSName("getSubmitValue")
  var getSubmitValue_IComboBox: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the current data value of the field
    * @returns Object value The field value
    */
  @JSName("getValue")
  var getValue_IComboBox: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var growToLongestValue: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var lastQuery: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var minChars: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.native
  
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Object
    * @param initial Object
    */
  var onBindStore: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | IAbstractStore], js.UndefOr[js.Any | Boolean], Unit]
  ] = js.native
  
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Object
    */
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
  ] = js.native
  
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var queryCaching: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var queryDelay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var queryMode: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var queryParam: js.UndefOr[String] = js.native
  
  /** [Method] Selects an item by a Model or by a key value
    * @param r Object
    */
  var select: js.UndefOr[js.Function1[/* r */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var selectOnTab: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.data.Store/String/Array) */
  var store: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var transform: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var triggerAction: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var typeAhead: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var typeAheadDelay: js.UndefOr[Double] = js.native
  
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var valueNotFoundText: js.UndefOr[String] = js.native
}
object IComboBox {
  
  @scala.inline
  def apply(): IComboBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComboBox]
  }
  
  @scala.inline
  implicit class IComboBoxOps[Self <: IComboBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterQuery(value: /* queryPlan */ js.UndefOr[js.Any] => Unit): Self = this.set("afterQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterQuery: Self = this.set("afterQuery", js.undefined)
    
    @scala.inline
    def setAllQuery(value: String): Self = this.set("allQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllQuery: Self = this.set("allQuery", js.undefined)
    
    @scala.inline
    def setAnyMatch(value: Boolean): Self = this.set("anyMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyMatch: Self = this.set("anyMatch", js.undefined)
    
    @scala.inline
    def setAutoSelect(value: Boolean): Self = this.set("autoSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSelect: Self = this.set("autoSelect", js.undefined)
    
    @scala.inline
    def setBeforeBlur(value: () => Unit): Self = this.set("beforeBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeBlur: Self = this.set("beforeBlur", js.undefined)
    
    @scala.inline
    def setBeforeQuery(value: /* queryPlan */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeQuery: Self = this.set("beforeQuery", js.undefined)
    
    @scala.inline
    def setBeforeReset(value: () => Unit): Self = this.set("beforeReset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeReset: Self = this.set("beforeReset", js.undefined)
    
    @scala.inline
    def setBindStore(value: js.UndefOr[js.Any] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("bindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBindStoreListeners: Self = this.set("bindStoreListeners", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setClearValue(value: () => Unit): Self = this.set("clearValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearValue: Self = this.set("clearValue", js.undefined)
    
    @scala.inline
    def setDefaultListConfig(value: js.Any): Self = this.set("defaultListConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultListConfig: Self = this.set("defaultListConfig", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDisplayField(value: String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    
    @scala.inline
    def setDoQuery(
      value: (/* queryString */ js.UndefOr[String], /* forceAll */ js.UndefOr[Boolean], /* rawQuery */ js.UndefOr[Boolean]) => Boolean
    ): Self = this.set("doQuery", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDoQuery: Self = this.set("doQuery", js.undefined)
    
    @scala.inline
    def setEnableRegEx(value: Boolean): Self = this.set("enableRegEx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRegEx: Self = this.set("enableRegEx", js.undefined)
    
    @scala.inline
    def setFieldSubTpl(value: IXTemplate): Self = this.set("fieldSubTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldSubTpl: Self = this.set("fieldSubTpl", js.undefined)
    
    @scala.inline
    def setFindRecord(value: (/* field */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => IModel): Self = this.set("findRecord", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFindRecord: Self = this.set("findRecord", js.undefined)
    
    @scala.inline
    def setFindRecordByDisplay(value: /* value */ js.UndefOr[js.Any] => IModel): Self = this.set("findRecordByDisplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFindRecordByDisplay: Self = this.set("findRecordByDisplay", js.undefined)
    
    @scala.inline
    def setFindRecordByValue(value: /* value */ js.UndefOr[js.Any] => IModel): Self = this.set("findRecordByValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFindRecordByValue: Self = this.set("findRecordByValue", js.undefined)
    
    @scala.inline
    def setForceSelection(value: Boolean): Self = this.set("forceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSelection: Self = this.set("forceSelection", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => IAbstractStore | IStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    
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
    def setGetSubmitValue(value: () => String): Self = this.set("getSubmitValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSubmitValue: Self = this.set("getSubmitValue", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setGrowToLongestValue(value: Boolean): Self = this.set("growToLongestValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowToLongestValue: Self = this.set("growToLongestValue", js.undefined)
    
    @scala.inline
    def setHiddenName(value: String): Self = this.set("hiddenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenName: Self = this.set("hiddenName", js.undefined)
    
    @scala.inline
    def setLastQuery(value: String): Self = this.set("lastQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastQuery: Self = this.set("lastQuery", js.undefined)
    
    @scala.inline
    def setListConfig(value: js.Any): Self = this.set("listConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListConfig: Self = this.set("listConfig", js.undefined)
    
    @scala.inline
    def setMinChars(value: Double): Self = this.set("minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChars: Self = this.set("minChars", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[js.Any | IAbstractStore], js.UndefOr[js.Any | Boolean]) => Unit): Self = this.set("onBindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBindStore: Self = this.set("onBindStore", js.undefined)
    
    @scala.inline
    def setOnUnbindStoreFunction2(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnbindStoreFunction1(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUnbindStore(
      value: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
    ): Self = this.set("onUnbindStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUnbindStore: Self = this.set("onUnbindStore", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setQueryCaching(value: Boolean): Self = this.set("queryCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryCaching: Self = this.set("queryCaching", js.undefined)
    
    @scala.inline
    def setQueryDelay(value: Double): Self = this.set("queryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryDelay: Self = this.set("queryDelay", js.undefined)
    
    @scala.inline
    def setQueryMode(value: String): Self = this.set("queryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryMode: Self = this.set("queryMode", js.undefined)
    
    @scala.inline
    def setQueryParam(value: String): Self = this.set("queryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParam: Self = this.set("queryParam", js.undefined)
    
    @scala.inline
    def setSelect(value: /* r */ js.UndefOr[js.Any] => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectOnTab(value: Boolean): Self = this.set("selectOnTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOnTab: Self = this.set("selectOnTab", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Any): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTriggerAction(value: String): Self = this.set("triggerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerAction: Self = this.set("triggerAction", js.undefined)
    
    @scala.inline
    def setTypeAhead(value: Boolean): Self = this.set("typeAhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeAhead: Self = this.set("typeAhead", js.undefined)
    
    @scala.inline
    def setTypeAheadDelay(value: Double): Self = this.set("typeAheadDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeAheadDelay: Self = this.set("typeAheadDelay", js.undefined)
    
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("unbindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnbindStoreListeners: Self = this.set("unbindStoreListeners", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
    
    @scala.inline
    def setValueNotFoundText(value: String): Self = this.set("valueNotFoundText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueNotFoundText: Self = this.set("valueNotFoundText", js.undefined)
  }
}
