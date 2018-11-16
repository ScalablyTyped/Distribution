package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.formNs.IFieldAncestor because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig))*/

trait IPanel
  extends extjsLib.ExtNs.panelNs.IPanel {
  /** [Method] Forces each field within the form panel to check if its value has changed  */
  var checkChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Provides access to the Form which this Panel contains
  		* @returns Ext.form.Basic The Form which this Panel contains.
  		*/
  var getForm: js.UndefOr[js.Function0[IBasic]] = js.undefined
  /** [Method] Returns the currently loaded Ext data Model instance if one was loaded via loadRecord
  		* @returns Ext.data.Model The loaded instance
  		*/
  var getRecord: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.IModel]] = js.undefined
  /** [Method] Convenience function for fetching the current value of each field in the form
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
  /** [Method] Convenience function to check if the form has any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Convenience function to check if the form has any dirty fields
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Convenience function to check if the form has all valid fields
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic load call
  		* @param options Object The options to pass to the action (see Ext.form.Basic.load and Ext.form.Basic.doAction for details)
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
  		* @param record Ext.data.Model The record to load
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], IBasic]] = js.undefined
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[ILabelable], 
      /* error */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[extjsLib.ExtNs.formNs.fieldNs.IField], 
      /* valid */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var pollForChanges: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Start an interval task to continuously poll all the fields in the form for changes in their values
  		* @param interval Number The interval in milliseconds at which the check should run.
  		*/
  var startPolling: js.UndefOr[js.Function1[/* interval */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Stop a running interval task that was started by startPolling  */
  var stopPolling: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic submit call
  		* @param options Object The options to pass to the action (see Ext.form.Basic.submit and Ext.form.Basic.doAction for details)
  		*/
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
  		* @param record Ext.data.Model The record to edit
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], IBasic]] = js.undefined
}

