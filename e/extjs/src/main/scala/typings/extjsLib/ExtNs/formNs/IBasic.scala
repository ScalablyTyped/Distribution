package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasic
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  /** [Method] Calls Ext applyIf for all field in this form with the passed object
  		* @param obj Object The object to be applied
  		* @returns Ext.form.Basic this
  		*/
  var applyIfToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Calls Ext apply for all fields in this form with the passed object
  		* @param obj Object The object to be applied
  		* @returns Ext.form.Basic this
  		*/
  var applyToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Check whether the dirty state of the entire form has changed since it was last checked and if so fire the dirtychang  */
  var checkDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Check whether the validity of the entire form has changed since it was last checked and if so fire the validitychang  */
  var checkValidity: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Clears all invalid field messages in this form
  		* @returns Ext.form.Basic this
  		*/
  var clearInvalid: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Destroys this object  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Performs a predefined action an implementation of Ext form action Action to perform application specific processing
  		* @param action String/Ext.form.action.Action The name of the predefined action type, or instance of Ext.form.action.Action to perform.
  		* @param options Object The options to pass to the Ext.form.action.Action that will get created, if the action argument is a String. All of the config options listed below are supported by both the submit and load actions unless otherwise noted (custom actions could also accept other config options):
  		* @returns Ext.form.Basic this
  		*/
  var doAction: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var errorReader: js.UndefOr[js.Any] = js.undefined
  /** [Method] Find a specific Ext form field Field in this form by id or name
  		* @param id String The value to search for (specify either a id or name or hiddenName).
  		* @returns any The first matching field, or null if none was found.
  		*/
  var findField: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getModelData  method to collect the values
  		* @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
  		* @returns Object
  		*/
  var getFieldValues: js.UndefOr[js.Function1[/* dirtyOnly */ js.UndefOr[scala.Boolean], _]] = js.undefined
  /** [Method] Return all the Ext form field Field components in the owner container
  		* @returns Ext.util.MixedCollection Collection of the Field objects
  		*/
  var getFields: js.UndefOr[js.Function0[extjsLib.ExtNs.utilNs.IMixedCollection]] = js.undefined
  /** [Method] Returns the last Ext data Model instance that was loaded via loadRecord
  		* @returns Ext.data.Model The record
  		*/
  var getRecord: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.IModel]] = js.undefined
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getSubmitData  method to collect the values
  		* @param asString Boolean If true, will return the key/value collection as a single URL-encoded param string.
  		* @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
  		* @param includeEmptyText Boolean If true, the configured emptyText of empty fields will be used.
  		* @param useDataValues Boolean If true, the getModelData method is used to retrieve values from fields, otherwise the getSubmitData method is used.
  		* @returns String/Object
  		*/
  var getValues: js.UndefOr[
    js.Function4[
      /* asString */ js.UndefOr[scala.Boolean], 
      /* dirtyOnly */ js.UndefOr[scala.Boolean], 
      /* includeEmptyText */ js.UndefOr[scala.Boolean], 
      /* useDataValues */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns true if the form contains any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns true if the form contains a file upload field
  		* @returns Boolean
  		*/
  var hasUpload: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if any fields in this form have changed from their original values
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if client side validation on the form is successful
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var jsonSubmit: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Shortcut to do a load action
  		* @param options Object The options to pass to the action (see doAction for details)
  		* @returns Ext.form.Basic this
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Loads an Ext data Model into this form by calling setValues with the record data
  		* @param record Ext.data.Model The record to load
  		* @returns Ext.form.Basic this
  		*/
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], this.type]] = js.undefined
  /** [Method] Mark fields in this form invalid in bulk
  		* @param errors Object/Object[]/Ext.data.Errors Either an array in the form [{id:'fieldId', msg:'The message'}, ...], an object hash of {id: msg, id2: msg2}, or a Ext.data.Errors object.
  		* @returns Ext.form.Basic this
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.container.Container) */
  var owner: js.UndefOr[extjsLib.ExtNs.containerNs.IContainer] = js.undefined
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets all fields in this form
  		* @param resetRecord Boolean True to unbind any record set by loadRecord
  		* @returns Ext.form.Basic this
  		*/
  var reset: js.UndefOr[js.Function1[/* resetRecord */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Method] Set values for fields in this form in bulk
  		* @param values Object/Object[] Either an array in the form: [{id:'clientName', value:'Fred. Olsen Lines'}, {id:'portOfLoading', value:'FXT'}, {id:'portOfDischarge', value:'OSL'} ]  or an object hash of the form: {  clientName: 'Fred. Olsen Lines',  portOfLoading: 'FXT',  portOfDischarge: 'OSL' }
  		* @returns Ext.form.Basic this
  		*/
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Shortcut to do a submit action
  		* @param options Object The options to pass to the action (see doAction for details).
  		* @returns Ext.form.Basic this
  		*/
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
  		* @param record Ext.data.Model The record to edit
  		* @returns Ext.form.Basic this
  		*/
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], this.type]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var waitMsgTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var waitTitle: js.UndefOr[java.lang.String] = js.undefined
}

object IBasic {
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
    alternateClassName: js.Any = null,
    api: js.Any = null,
    applyIfToFields: js.Function1[/* obj */ js.UndefOr[js.Any], IBasic] = null,
    applyToFields: js.Function1[/* obj */ js.UndefOr[js.Any], IBasic] = null,
    baseParams: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    checkDirty: js.Function0[scala.Unit] = null,
    checkValidity: js.Function0[scala.Unit] = null,
    clearInvalid: js.Function0[IBasic] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    doAction: js.Function2[/* action */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], IBasic] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    errorReader: js.Any = null,
    extend: java.lang.String = null,
    findField: js.Function1[/* id */ js.UndefOr[java.lang.String], _] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getFieldValues: js.Function1[/* dirtyOnly */ js.UndefOr[scala.Boolean], _] = null,
    getFields: js.Function0[extjsLib.ExtNs.utilNs.IMixedCollection] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getRecord: js.Function0[extjsLib.ExtNs.dataNs.IModel] = null,
    getValues: js.Function4[
      /* asString */ js.UndefOr[scala.Boolean], 
      /* dirtyOnly */ js.UndefOr[scala.Boolean], 
      /* includeEmptyText */ js.UndefOr[scala.Boolean], 
      /* useDataValues */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    hasInvalidField: js.Function0[scala.Unit] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    hasUpload: js.Function0[scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IBasic] = null,
    isDirty: js.Function0[scala.Boolean] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isValid: js.Function0[scala.Boolean] = null,
    jsonSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    load: js.Function1[/* options */ js.UndefOr[js.Any], IBasic] = null,
    loadRecord: js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], IBasic] = null,
    markInvalid: js.Function1[/* errors */ js.UndefOr[js.Any], IBasic] = null,
    method: java.lang.String = null,
    mixins: js.Any = null,
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
    owner: extjsLib.ExtNs.containerNs.IContainer = null,
    paramOrder: js.Any = null,
    paramsAsHash: js.UndefOr[scala.Boolean] = js.undefined,
    reader: js.Any = null,
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
    reset: js.Function1[/* resetRecord */ js.UndefOr[scala.Boolean], IBasic] = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    setValues: js.Function1[/* values */ js.UndefOr[js.Any], IBasic] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    standardSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    submit: js.Function1[/* options */ js.UndefOr[js.Any], IBasic] = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    timeout: scala.Int | scala.Double = null,
    trackResetOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    updateRecord: js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], IBasic] = null,
    url: java.lang.String = null,
    uses: extjsLib.ExtNs.Array = null,
    waitMsgTarget: js.Any = null,
    waitTitle: java.lang.String = null
  ): IBasic = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (api != null) __obj.updateDynamic("api")(api)
    if (applyIfToFields != null) __obj.updateDynamic("applyIfToFields")(applyIfToFields)
    if (applyToFields != null) __obj.updateDynamic("applyToFields")(applyToFields)
    if (baseParams != null) __obj.updateDynamic("baseParams")(baseParams)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (checkDirty != null) __obj.updateDynamic("checkDirty")(checkDirty)
    if (checkValidity != null) __obj.updateDynamic("checkValidity")(checkValidity)
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(clearInvalid)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (doAction != null) __obj.updateDynamic("doAction")(doAction)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (errorReader != null) __obj.updateDynamic("errorReader")(errorReader)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (findField != null) __obj.updateDynamic("findField")(findField)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getFieldValues != null) __obj.updateDynamic("getFieldValues")(getFieldValues)
    if (getFields != null) __obj.updateDynamic("getFields")(getFields)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getRecord != null) __obj.updateDynamic("getRecord")(getRecord)
    if (getValues != null) __obj.updateDynamic("getValues")(getValues)
    if (hasInvalidField != null) __obj.updateDynamic("hasInvalidField")(hasInvalidField)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasUpload != null) __obj.updateDynamic("hasUpload")(hasUpload)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isDirty != null) __obj.updateDynamic("isDirty")(isDirty)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    if (!js.isUndefined(jsonSubmit)) __obj.updateDynamic("jsonSubmit")(jsonSubmit)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (load != null) __obj.updateDynamic("load")(load)
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(loadRecord)
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(markInvalid)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (paramOrder != null) __obj.updateDynamic("paramOrder")(paramOrder)
    if (!js.isUndefined(paramsAsHash)) __obj.updateDynamic("paramsAsHash")(paramsAsHash)
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setValues != null) __obj.updateDynamic("setValues")(setValues)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (!js.isUndefined(standardSubmit)) __obj.updateDynamic("standardSubmit")(standardSubmit)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResetOnLoad)) __obj.updateDynamic("trackResetOnLoad")(trackResetOnLoad)
    if (un != null) __obj.updateDynamic("un")(un)
    if (updateRecord != null) __obj.updateDynamic("updateRecord")(updateRecord)
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (waitMsgTarget != null) __obj.updateDynamic("waitMsgTarget")(waitMsgTarget)
    if (waitTitle != null) __obj.updateDynamic("waitTitle")(waitTitle)
    __obj.asInstanceOf[IBasic]
  }
}

