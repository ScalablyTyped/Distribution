package typings.extjs.Ext.form

import typings.extjs.Ext.container.IContainer
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBasicForm
  extends StObject
     with IObservable {
  
  /** [Config Option] (Object) */
  var api: js.UndefOr[Any] = js.undefined
  
  /** [Method] Calls Ext applyIf for all field in this form with the passed object
    * @param obj Object The object to be applied
    * @returns Ext.form.Basic this
    */
  var applyIfToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[Any], IBasic]] = js.undefined
  
  /** [Method] Calls Ext apply for all fields in this form with the passed object
    * @param obj Object The object to be applied
    * @returns Ext.form.Basic this
    */
  var applyToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[Any], IBasic]] = js.undefined
  
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[Any] = js.undefined
  
  /** [Method] Check whether the dirty state of the entire form has changed since it was last checked and if so fire the dirtychang  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Check whether the validity of the entire form has changed since it was last checked and if so fire the validitychang  */
  var checkValidity: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Clears all invalid field messages in this form
    * @returns Ext.form.Basic this
    */
  var clearInvalid: js.UndefOr[js.Function0[IBasic]] = js.undefined
  
  /** [Method] Destroys this object  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Performs a predefined action an implementation of Ext form action Action to perform application specific processing
    * @param action String/Ext.form.action.Action The name of the predefined action type, or instance of Ext.form.action.Action to perform.
    * @param options Object The options to pass to the Ext.form.action.Action that will get created, if the action argument is a String. All of the config options listed below are supported by both the submit and load actions unless otherwise noted (custom actions could also accept other config options):
    * @returns Ext.form.Basic this
    */
  var doAction: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[Any], /* options */ js.UndefOr[Any], IBasic]
  ] = js.undefined
  
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var errorReader: js.UndefOr[Any] = js.undefined
  
  /** [Method] Find a specific Ext form field Field in this form by id or name
    * @param id String The value to search for (specify either a id or name or hiddenName).
    * @returns any The first matching field, or null if none was found.
    */
  var findField: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Any]] = js.undefined
  
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getModelData  method to collect the values
    * @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
    * @returns Object
    */
  var getFieldValues: js.UndefOr[js.Function1[/* dirtyOnly */ js.UndefOr[Boolean], Any]] = js.undefined
  
  /** [Method] Return all the Ext form field Field components in the owner container
    * @returns Ext.util.MixedCollection Collection of the Field objects
    */
  var getFields: js.UndefOr[js.Function0[IMixedCollection]] = js.undefined
  
  /** [Method] Returns the last Ext data Model instance that was loaded via loadRecord
    * @returns Ext.data.Model The record
    */
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.undefined
  
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getSubmitData  method to collect the values
    * @param asString Boolean If true, will return the key/value collection as a single URL-encoded param string.
    * @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
    * @param includeEmptyText Boolean If true, the configured emptyText of empty fields will be used.
    * @param useDataValues Boolean If true, the getModelData method is used to retrieve values from fields, otherwise the getSubmitData method is used.
    * @returns String/Object
    */
  var getValues: js.UndefOr[
    js.Function4[
      /* asString */ js.UndefOr[Boolean], 
      /* dirtyOnly */ js.UndefOr[Boolean], 
      /* includeEmptyText */ js.UndefOr[Boolean], 
      /* useDataValues */ js.UndefOr[Boolean], 
      Any
    ]
  ] = js.undefined
  
  /** [Method] Returns true if the form contains any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns true if the form contains a file upload field
    * @returns Boolean
    */
  var hasUpload: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if any fields in this form have changed from their original values
    * @returns Boolean
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if client side validation on the form is successful
    * @returns Boolean
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var jsonSubmit: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Shortcut to do a load action
    * @param options Object The options to pass to the action (see doAction for details)
    * @returns Ext.form.Basic this
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], IBasic]] = js.undefined
  
  /** [Method] Loads an Ext data Model into this form by calling setValues with the record data
    * @param record Ext.data.Model The record to load
    * @returns Ext.form.Basic this
    */
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
  
  /** [Method] Mark fields in this form invalid in bulk
    * @param errors Object/Object[]/Ext.data.Errors Either an array in the form [{id:'fieldId', msg:'The message'}, ...], an object hash of {id: msg, id2: msg2}, or a Ext.data.Errors object.
    * @returns Ext.form.Basic this
    */
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[Any], IBasic]] = js.undefined
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.container.Container) */
  var owner: js.UndefOr[IContainer] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var reader: js.UndefOr[Any] = js.undefined
  
  /** [Method] Resets all fields in this form
    * @param resetRecord Boolean True to unbind any record set by loadRecord
    * @returns Ext.form.Basic this
    */
  var reset: js.UndefOr[js.Function1[/* resetRecord */ js.UndefOr[Boolean], IBasic]] = js.undefined
  
  /** [Method] Set values for fields in this form in bulk
    * @param values Object/Object[] Either an array in the form: [{id:'clientName', value:'Fred. Olsen Lines'}, {id:'portOfLoading', value:'FXT'}, {id:'portOfDischarge', value:'OSL'} ]  or an object hash of the form: {  clientName: 'Fred. Olsen Lines',  portOfLoading: 'FXT',  portOfDischarge: 'OSL' }
    * @returns Ext.form.Basic this
    */
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[Any], IBasic]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Shortcut to do a submit action
    * @param options Object The options to pass to the action (see doAction for details).
    * @returns Ext.form.Basic this
    */
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], IBasic]] = js.undefined
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
    * @param record Ext.data.Model The record to edit
    * @returns Ext.form.Basic this
    */
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var waitMsgTarget: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var waitTitle: js.UndefOr[String] = js.undefined
}
object IBasicForm {
  
  inline def apply(): IBasicForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasicForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBasicForm] (val x: Self) extends AnyVal {
    
    inline def setApi(value: Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setApplyIfToFields(value: /* obj */ js.UndefOr[Any] => IBasic): Self = StObject.set(x, "applyIfToFields", js.Any.fromFunction1(value))
    
    inline def setApplyIfToFieldsUndefined: Self = StObject.set(x, "applyIfToFields", js.undefined)
    
    inline def setApplyToFields(value: /* obj */ js.UndefOr[Any] => IBasic): Self = StObject.set(x, "applyToFields", js.Any.fromFunction1(value))
    
    inline def setApplyToFieldsUndefined: Self = StObject.set(x, "applyToFields", js.undefined)
    
    inline def setBaseParams(value: Any): Self = StObject.set(x, "baseParams", value.asInstanceOf[js.Any])
    
    inline def setBaseParamsUndefined: Self = StObject.set(x, "baseParams", js.undefined)
    
    inline def setCheckDirty(value: () => Unit): Self = StObject.set(x, "checkDirty", js.Any.fromFunction0(value))
    
    inline def setCheckDirtyUndefined: Self = StObject.set(x, "checkDirty", js.undefined)
    
    inline def setCheckValidity(value: () => Unit): Self = StObject.set(x, "checkValidity", js.Any.fromFunction0(value))
    
    inline def setCheckValidityUndefined: Self = StObject.set(x, "checkValidity", js.undefined)
    
    inline def setClearInvalid(value: () => IBasic): Self = StObject.set(x, "clearInvalid", js.Any.fromFunction0(value))
    
    inline def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDoAction(value: (/* action */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => IBasic): Self = StObject.set(x, "doAction", js.Any.fromFunction2(value))
    
    inline def setDoActionUndefined: Self = StObject.set(x, "doAction", js.undefined)
    
    inline def setErrorReader(value: Any): Self = StObject.set(x, "errorReader", value.asInstanceOf[js.Any])
    
    inline def setErrorReaderUndefined: Self = StObject.set(x, "errorReader", js.undefined)
    
    inline def setFindField(value: /* id */ js.UndefOr[String] => Any): Self = StObject.set(x, "findField", js.Any.fromFunction1(value))
    
    inline def setFindFieldUndefined: Self = StObject.set(x, "findField", js.undefined)
    
    inline def setGetFieldValues(value: /* dirtyOnly */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "getFieldValues", js.Any.fromFunction1(value))
    
    inline def setGetFieldValuesUndefined: Self = StObject.set(x, "getFieldValues", js.undefined)
    
    inline def setGetFields(value: () => IMixedCollection): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
    
    inline def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
    
    inline def setGetRecord(value: () => IModel): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
    
    inline def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    inline def setGetValues(
      value: (/* asString */ js.UndefOr[Boolean], /* dirtyOnly */ js.UndefOr[Boolean], /* includeEmptyText */ js.UndefOr[Boolean], /* useDataValues */ js.UndefOr[Boolean]) => Any
    ): Self = StObject.set(x, "getValues", js.Any.fromFunction4(value))
    
    inline def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    inline def setHasInvalidField(value: () => Unit): Self = StObject.set(x, "hasInvalidField", js.Any.fromFunction0(value))
    
    inline def setHasInvalidFieldUndefined: Self = StObject.set(x, "hasInvalidField", js.undefined)
    
    inline def setHasUpload(value: () => Boolean): Self = StObject.set(x, "hasUpload", js.Any.fromFunction0(value))
    
    inline def setHasUploadUndefined: Self = StObject.set(x, "hasUpload", js.undefined)
    
    inline def setIsDirty(value: () => Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setJsonSubmit(value: Boolean): Self = StObject.set(x, "jsonSubmit", value.asInstanceOf[js.Any])
    
    inline def setJsonSubmitUndefined: Self = StObject.set(x, "jsonSubmit", js.undefined)
    
    inline def setLoad(value: /* options */ js.UndefOr[Any] => IBasic): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLoadRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = StObject.set(x, "loadRecord", js.Any.fromFunction1(value))
    
    inline def setLoadRecordUndefined: Self = StObject.set(x, "loadRecord", js.undefined)
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setMarkInvalid(value: /* errors */ js.UndefOr[Any] => IBasic): Self = StObject.set(x, "markInvalid", js.Any.fromFunction1(value))
    
    inline def setMarkInvalidUndefined: Self = StObject.set(x, "markInvalid", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOwner(value: IContainer): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParamOrder(value: Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
    
    inline def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
    
    inline def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
    
    inline def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
    
    inline def setReader(value: Any): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    inline def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
    
    inline def setReset(value: /* resetRecord */ js.UndefOr[Boolean] => IBasic): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetValues(value: /* values */ js.UndefOr[Any] => IBasic): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
    
    inline def setSetValuesUndefined: Self = StObject.set(x, "setValues", js.undefined)
    
    inline def setStandardSubmit(value: Boolean): Self = StObject.set(x, "standardSubmit", value.asInstanceOf[js.Any])
    
    inline def setStandardSubmitUndefined: Self = StObject.set(x, "standardSubmit", js.undefined)
    
    inline def setSubmit(value: /* options */ js.UndefOr[Any] => IBasic): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrackResetOnLoad(value: Boolean): Self = StObject.set(x, "trackResetOnLoad", value.asInstanceOf[js.Any])
    
    inline def setTrackResetOnLoadUndefined: Self = StObject.set(x, "trackResetOnLoad", js.undefined)
    
    inline def setUpdateRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = StObject.set(x, "updateRecord", js.Any.fromFunction1(value))
    
    inline def setUpdateRecordUndefined: Self = StObject.set(x, "updateRecord", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWaitMsgTarget(value: Any): Self = StObject.set(x, "waitMsgTarget", value.asInstanceOf[js.Any])
    
    inline def setWaitMsgTargetUndefined: Self = StObject.set(x, "waitMsgTarget", js.undefined)
    
    inline def setWaitTitle(value: String): Self = StObject.set(x, "waitTitle", value.asInstanceOf[js.Any])
    
    inline def setWaitTitleUndefined: Self = StObject.set(x, "waitTitle", js.undefined)
  }
}
