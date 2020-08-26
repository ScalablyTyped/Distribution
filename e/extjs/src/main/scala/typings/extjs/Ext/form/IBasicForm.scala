package typings.extjs.Ext.form

import typings.extjs.Ext.container.IContainer
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasicForm extends IObservable {
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.native
  /** [Method] Calls Ext applyIf for all field in this form with the passed object
    * @param obj Object The object to be applied
    * @returns Ext.form.Basic this
    */
  var applyIfToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Method] Calls Ext apply for all fields in this form with the passed object
    * @param obj Object The object to be applied
    * @returns Ext.form.Basic this
    */
  var applyToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  /** [Method] Check whether the dirty state of the entire form has changed since it was last checked and if so fire the dirtychang  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Check whether the validity of the entire form has changed since it was last checked and if so fire the validitychang  */
  var checkValidity: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Clears all invalid field messages in this form
    * @returns Ext.form.Basic this
    */
  var clearInvalid: js.UndefOr[js.Function0[IBasic]] = js.native
  /** [Method] Destroys this object  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Performs a predefined action an implementation of Ext form action Action to perform application specific processing
    * @param action String/Ext.form.action.Action The name of the predefined action type, or instance of Ext.form.action.Action to perform.
    * @param options Object The options to pass to the Ext.form.action.Action that will get created, if the action argument is a String. All of the config options listed below are supported by both the submit and load actions unless otherwise noted (custom actions could also accept other config options):
    * @returns Ext.form.Basic this
    */
  var doAction: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], IBasic]
  ] = js.native
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var errorReader: js.UndefOr[js.Any] = js.native
  /** [Method] Find a specific Ext form field Field in this form by id or name
    * @param id String The value to search for (specify either a id or name or hiddenName).
    * @returns any The first matching field, or null if none was found.
    */
  var findField: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], _]] = js.native
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getModelData  method to collect the values
    * @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
    * @returns Object
    */
  var getFieldValues: js.UndefOr[js.Function1[/* dirtyOnly */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Return all the Ext form field Field components in the owner container
    * @returns Ext.util.MixedCollection Collection of the Field objects
    */
  var getFields: js.UndefOr[js.Function0[IMixedCollection]] = js.native
  /** [Method] Returns the last Ext data Model instance that was loaded via loadRecord
    * @returns Ext.data.Model The record
    */
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.native
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
      _
    ]
  ] = js.native
  /** [Method] Returns true if the form contains any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if the form contains a file upload field
    * @returns Boolean
    */
  var hasUpload: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if any fields in this form have changed from their original values
    * @returns Boolean
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if client side validation on the form is successful
    * @returns Boolean
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var jsonSubmit: js.UndefOr[Boolean] = js.native
  /** [Method] Shortcut to do a load action
    * @param options Object The options to pass to the action (see doAction for details)
    * @returns Ext.form.Basic this
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Method] Loads an Ext data Model into this form by calling setValues with the record data
    * @param record Ext.data.Model The record to load
    * @returns Ext.form.Basic this
    */
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.native
  /** [Method] Mark fields in this form invalid in bulk
    * @param errors Object/Object[]/Ext.data.Errors Either an array in the form [{id:'fieldId', msg:'The message'}, ...], an object hash of {id: msg, id2: msg2}, or a Ext.data.Errors object.
    * @returns Ext.form.Basic this
    */
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  /** [Property] (Ext.container.Container) */
  var owner: js.UndefOr[IContainer] = js.native
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.native
  /** [Method] Resets all fields in this form
    * @param resetRecord Boolean True to unbind any record set by loadRecord
    * @returns Ext.form.Basic this
    */
  var reset: js.UndefOr[js.Function1[/* resetRecord */ js.UndefOr[Boolean], IBasic]] = js.native
  /** [Method] Set values for fields in this form in bulk
    * @param values Object/Object[] Either an array in the form: [{id:'clientName', value:'Fred. Olsen Lines'}, {id:'portOfLoading', value:'FXT'}, {id:'portOfDischarge', value:'OSL'} ]  or an object hash of the form: {  clientName: 'Fred. Olsen Lines',  portOfLoading: 'FXT',  portOfDischarge: 'OSL' }
    * @returns Ext.form.Basic this
    */
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[Boolean] = js.native
  /** [Method] Shortcut to do a submit action
    * @param options Object The options to pass to the action (see doAction for details).
    * @returns Ext.form.Basic this
    */
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[Boolean] = js.native
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
    * @param record Ext.data.Model The record to edit
    * @returns Ext.form.Basic this
    */
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var waitMsgTarget: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var waitTitle: js.UndefOr[String] = js.native
}

object IBasicForm {
  @scala.inline
  def apply(): IBasicForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasicForm]
  }
  @scala.inline
  implicit class IBasicFormOps[Self <: IBasicForm] (val x: Self) extends AnyVal {
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
    def setApi(value: js.Any): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setApplyIfToFields(value: /* obj */ js.UndefOr[js.Any] => IBasic): Self = this.set("applyIfToFields", js.Any.fromFunction1(value))
    @scala.inline
    def deleteApplyIfToFields: Self = this.set("applyIfToFields", js.undefined)
    @scala.inline
    def setApplyToFields(value: /* obj */ js.UndefOr[js.Any] => IBasic): Self = this.set("applyToFields", js.Any.fromFunction1(value))
    @scala.inline
    def deleteApplyToFields: Self = this.set("applyToFields", js.undefined)
    @scala.inline
    def setBaseParams(value: js.Any): Self = this.set("baseParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseParams: Self = this.set("baseParams", js.undefined)
    @scala.inline
    def setCheckDirty(value: () => Unit): Self = this.set("checkDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheckDirty: Self = this.set("checkDirty", js.undefined)
    @scala.inline
    def setCheckValidity(value: () => Unit): Self = this.set("checkValidity", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheckValidity: Self = this.set("checkValidity", js.undefined)
    @scala.inline
    def setClearInvalid(value: () => IBasic): Self = this.set("clearInvalid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearInvalid: Self = this.set("clearInvalid", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDoAction(value: (/* action */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => IBasic): Self = this.set("doAction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDoAction: Self = this.set("doAction", js.undefined)
    @scala.inline
    def setErrorReader(value: js.Any): Self = this.set("errorReader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorReader: Self = this.set("errorReader", js.undefined)
    @scala.inline
    def setFindField(value: /* id */ js.UndefOr[String] => _): Self = this.set("findField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFindField: Self = this.set("findField", js.undefined)
    @scala.inline
    def setGetFieldValues(value: /* dirtyOnly */ js.UndefOr[Boolean] => _): Self = this.set("getFieldValues", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFieldValues: Self = this.set("getFieldValues", js.undefined)
    @scala.inline
    def setGetFields(value: () => IMixedCollection): Self = this.set("getFields", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFields: Self = this.set("getFields", js.undefined)
    @scala.inline
    def setGetRecord(value: () => IModel): Self = this.set("getRecord", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecord: Self = this.set("getRecord", js.undefined)
    @scala.inline
    def setGetValues(
      value: (/* asString */ js.UndefOr[Boolean], /* dirtyOnly */ js.UndefOr[Boolean], /* includeEmptyText */ js.UndefOr[Boolean], /* useDataValues */ js.UndefOr[Boolean]) => _
    ): Self = this.set("getValues", js.Any.fromFunction4(value))
    @scala.inline
    def deleteGetValues: Self = this.set("getValues", js.undefined)
    @scala.inline
    def setHasInvalidField(value: () => Unit): Self = this.set("hasInvalidField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasInvalidField: Self = this.set("hasInvalidField", js.undefined)
    @scala.inline
    def setHasUpload(value: () => Boolean): Self = this.set("hasUpload", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasUpload: Self = this.set("hasUpload", js.undefined)
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setJsonSubmit(value: Boolean): Self = this.set("jsonSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonSubmit: Self = this.set("jsonSubmit", js.undefined)
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => IBasic): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLoadRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = this.set("loadRecord", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadRecord: Self = this.set("loadRecord", js.undefined)
    @scala.inline
    def setMarkInvalid(value: /* errors */ js.UndefOr[js.Any] => IBasic): Self = this.set("markInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarkInvalid: Self = this.set("markInvalid", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOwner(value: IContainer): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setParamOrder(value: js.Any): Self = this.set("paramOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamOrder: Self = this.set("paramOrder", js.undefined)
    @scala.inline
    def setParamsAsHash(value: Boolean): Self = this.set("paramsAsHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamsAsHash: Self = this.set("paramsAsHash", js.undefined)
    @scala.inline
    def setReader(value: js.Any): Self = this.set("reader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReader: Self = this.set("reader", js.undefined)
    @scala.inline
    def setReset(value: /* resetRecord */ js.UndefOr[Boolean] => IBasic): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setSetValues(value: /* values */ js.UndefOr[js.Any] => IBasic): Self = this.set("setValues", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValues: Self = this.set("setValues", js.undefined)
    @scala.inline
    def setStandardSubmit(value: Boolean): Self = this.set("standardSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardSubmit: Self = this.set("standardSubmit", js.undefined)
    @scala.inline
    def setSubmit(value: /* options */ js.UndefOr[js.Any] => IBasic): Self = this.set("submit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTrackResetOnLoad(value: Boolean): Self = this.set("trackResetOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResetOnLoad: Self = this.set("trackResetOnLoad", js.undefined)
    @scala.inline
    def setUpdateRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = this.set("updateRecord", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateRecord: Self = this.set("updateRecord", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWaitMsgTarget(value: js.Any): Self = this.set("waitMsgTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitMsgTarget: Self = this.set("waitMsgTarget", js.undefined)
    @scala.inline
    def setWaitTitle(value: String): Self = this.set("waitTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitTitle: Self = this.set("waitTitle", js.undefined)
  }
  
}

