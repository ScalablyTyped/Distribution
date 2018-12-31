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

