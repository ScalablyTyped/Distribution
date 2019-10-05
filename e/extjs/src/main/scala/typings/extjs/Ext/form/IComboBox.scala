package typings.extjs.Ext.form

import typings.extjs.Ext.IXTemplate
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IComboBox
  extends typings.extjs.Ext.form.field.IPicker {
  /** [Method] A method called when the filtering caused by the doQuery call is complete and the store has been either filtered loca
  		* @param queryPlan Object An object containing details about the query was executed.
  		*/
  var afterQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var allQuery: js.UndefOr[java.lang.String] = js.undefined
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
  var beforeQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Template method before a field is reset  */
  @JSName("beforeReset")
  var beforeReset_IComboBox: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Binds a store to this instance
  		* @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** [Method] Clears any value currently set in the ComboBox  */
  var clearValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var defaultListConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Executes a query to filter the dropdown list
  		* @param queryString String The string to use to filter available items by matching against the configured valueField.
  		* @param forceAll Boolean true to force the query to execute even if there are currently fewer characters in the field than the minimum specified by the minChars config option. It also clears any filter previously saved in the current store.
  		* @param rawQuery Boolean Pass as true if the raw typed value is being used as the query string. This causes the resulting store load to leave the raw value undisturbed.
  		* @returns Boolean true if the query was permitted to run, false if it was cancelled by a beforequery handler.
  		*/
  var doQuery: js.UndefOr[
    js.Function3[
      /* queryString */ js.UndefOr[java.lang.String], 
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
    js.Function2[/* field */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], IModel]
  ] = js.undefined
  /** [Method] Finds the record by searching values in the displayField
  		* @param value Object The value to match the field against.
  		* @returns Ext.data.Model The matched record or false.
  		*/
  var findRecordByDisplay: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Method] Finds the record by searching values in the valueField
  		* @param value Object The value to match the field against.
  		* @returns Ext.data.Model The matched record or false.
  		*/
  var findRecordByValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Config Option] (Boolean) */
  var forceSelection: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the store associated with this ComboBox
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore | IStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.undefined
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns String The value to be submitted, or null.
  		*/
  @JSName("getSubmitValue")
  var getSubmitValue_IComboBox: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  @JSName("getValue")
  var getValue_IComboBox: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var growToLongestValue: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var lastQuery: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var minChars: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Object
  		* @param initial Object
  		*/
  var onBindStore: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | IAbstractStore], js.UndefOr[js.Any | Boolean], Unit]
  ] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Object
  		*/
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
  ] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var queryCaching: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var queryDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var queryMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var queryParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Selects an item by a Model or by a key value
  		* @param r Object
  		*/
  var select: js.UndefOr[js.Function1[/* r */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var selectOnTab: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store/String/Array) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var transform: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var triggerAction: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var typeAhead: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var typeAheadDelay: js.UndefOr[Double] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Config Option] (String) */
  var valueField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var valueNotFoundText: js.UndefOr[java.lang.String] = js.undefined
}

object IComboBox {
  @scala.inline
  def apply(
    IPicker: typings.extjs.Ext.form.field.IPicker = null,
    afterQuery: /* queryPlan */ js.UndefOr[js.Any] => Unit = null,
    afterRender: () => Unit = null,
    alignPicker: () => Unit = null,
    allQuery: java.lang.String = null,
    anyMatch: js.UndefOr[Boolean] = js.undefined,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    beforeBlur: () => Unit = null,
    beforeQuery: /* queryPlan */ js.UndefOr[js.Any] => Unit = null,
    beforeReset: () => Unit = null,
    bindStore: /* store */ js.UndefOr[js.Any] => Unit = null,
    bindStoreListeners: /* store */ js.UndefOr[IAbstractStore] => Unit = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    clearValue: () => Unit = null,
    componentLayout: js.Any = null,
    createPicker: () => Unit = null,
    defaultListConfig: js.Any = null,
    delimiter: java.lang.String = null,
    displayField: java.lang.String = null,
    doQuery: (/* queryString */ js.UndefOr[java.lang.String], /* forceAll */ js.UndefOr[Boolean], /* rawQuery */ js.UndefOr[Boolean]) => Boolean = null,
    enableRegEx: js.UndefOr[Boolean] = js.undefined,
    fieldSubTpl: IXTemplate = null,
    findRecord: (/* field */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any]) => IModel = null,
    findRecordByDisplay: /* value */ js.UndefOr[js.Any] => IModel = null,
    findRecordByValue: /* value */ js.UndefOr[js.Any] => IModel = null,
    forceSelection: js.UndefOr[Boolean] = js.undefined,
    getStore: () => IStore = null,
    getStoreListeners: () => _ = null,
    getSubTplData: () => _ = null,
    getSubmitValue: () => java.lang.String = null,
    getValue: () => _ = null,
    growToLongestValue: js.UndefOr[Boolean] = js.undefined,
    hiddenName: java.lang.String = null,
    initComponent: () => Unit = null,
    initEvents: () => Unit = null,
    lastQuery: java.lang.String = null,
    listConfig: js.Any = null,
    minChars: Int | Double = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    onAdded: () => Unit = null,
    onBindStore: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit = null,
    onTriggerClick: () => Unit = null,
    onUnbindStore: /* store */ js.UndefOr[js.Any] => Unit = null,
    pageSize: Int | Double = null,
    queryCaching: js.UndefOr[Boolean] = js.undefined,
    queryDelay: Int | Double = null,
    queryMode: java.lang.String = null,
    queryParam: java.lang.String = null,
    select: /* r */ js.UndefOr[js.Any] => Unit = null,
    selectOnTab: js.UndefOr[Boolean] = js.undefined,
    setValue: /* value */ js.UndefOr[js.Any] => _ = null,
    store: js.Any = null,
    transform: js.Any = null,
    triggerAction: java.lang.String = null,
    triggerCls: java.lang.String = null,
    typeAhead: js.UndefOr[Boolean] = js.undefined,
    typeAheadDelay: Int | Double = null,
    unbindStoreListeners: /* store */ js.UndefOr[IAbstractStore] => Unit = null,
    valueField: java.lang.String = null,
    valueNotFoundText: java.lang.String = null
  ): IComboBox = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPicker)
    if (afterQuery != null) __obj.updateDynamic("afterQuery")(js.Any.fromFunction1(afterQuery))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (alignPicker != null) __obj.updateDynamic("alignPicker")(js.Any.fromFunction0(alignPicker))
    if (allQuery != null) __obj.updateDynamic("allQuery")(allQuery)
    if (!js.isUndefined(anyMatch)) __obj.updateDynamic("anyMatch")(anyMatch)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect)
    if (beforeBlur != null) __obj.updateDynamic("beforeBlur")(js.Any.fromFunction0(beforeBlur))
    if (beforeQuery != null) __obj.updateDynamic("beforeQuery")(js.Any.fromFunction1(beforeQuery))
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(js.Any.fromFunction0(beforeReset))
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction1(bindStore))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (clearValue != null) __obj.updateDynamic("clearValue")(js.Any.fromFunction0(clearValue))
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (createPicker != null) __obj.updateDynamic("createPicker")(js.Any.fromFunction0(createPicker))
    if (defaultListConfig != null) __obj.updateDynamic("defaultListConfig")(defaultListConfig)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (doQuery != null) __obj.updateDynamic("doQuery")(js.Any.fromFunction3(doQuery))
    if (!js.isUndefined(enableRegEx)) __obj.updateDynamic("enableRegEx")(enableRegEx)
    if (fieldSubTpl != null) __obj.updateDynamic("fieldSubTpl")(fieldSubTpl)
    if (findRecord != null) __obj.updateDynamic("findRecord")(js.Any.fromFunction2(findRecord))
    if (findRecordByDisplay != null) __obj.updateDynamic("findRecordByDisplay")(js.Any.fromFunction1(findRecordByDisplay))
    if (findRecordByValue != null) __obj.updateDynamic("findRecordByValue")(js.Any.fromFunction1(findRecordByValue))
    if (!js.isUndefined(forceSelection)) __obj.updateDynamic("forceSelection")(forceSelection)
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(js.Any.fromFunction0(getStoreListeners))
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(js.Any.fromFunction0(getSubTplData))
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(js.Any.fromFunction0(getSubmitValue))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (!js.isUndefined(growToLongestValue)) __obj.updateDynamic("growToLongestValue")(growToLongestValue)
    if (hiddenName != null) __obj.updateDynamic("hiddenName")(hiddenName)
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (initEvents != null) __obj.updateDynamic("initEvents")(js.Any.fromFunction0(initEvents))
    if (lastQuery != null) __obj.updateDynamic("lastQuery")(lastQuery)
    if (listConfig != null) __obj.updateDynamic("listConfig")(listConfig)
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (onAdded != null) __obj.updateDynamic("onAdded")(js.Any.fromFunction0(onAdded))
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2(onBindStore))
    if (onTriggerClick != null) __obj.updateDynamic("onTriggerClick")(js.Any.fromFunction0(onTriggerClick))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction1(onUnbindStore))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(queryCaching)) __obj.updateDynamic("queryCaching")(queryCaching)
    if (queryDelay != null) __obj.updateDynamic("queryDelay")(queryDelay.asInstanceOf[js.Any])
    if (queryMode != null) __obj.updateDynamic("queryMode")(queryMode)
    if (queryParam != null) __obj.updateDynamic("queryParam")(queryParam)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(selectOnTab)) __obj.updateDynamic("selectOnTab")(selectOnTab)
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (store != null) __obj.updateDynamic("store")(store)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (triggerAction != null) __obj.updateDynamic("triggerAction")(triggerAction)
    if (triggerCls != null) __obj.updateDynamic("triggerCls")(triggerCls)
    if (!js.isUndefined(typeAhead)) __obj.updateDynamic("typeAhead")(typeAhead)
    if (typeAheadDelay != null) __obj.updateDynamic("typeAheadDelay")(typeAheadDelay.asInstanceOf[js.Any])
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    if (valueNotFoundText != null) __obj.updateDynamic("valueNotFoundText")(valueNotFoundText)
    __obj.asInstanceOf[IComboBox]
  }
}

