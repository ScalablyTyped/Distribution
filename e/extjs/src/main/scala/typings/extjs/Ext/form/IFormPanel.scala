package typings.extjs.Ext.form

import typings.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ trait IFormPanel
  extends typings.extjs.Ext.panel.IPanel {
  /** [Method] Forces each field within the form panel to check if its value has changed  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Provides access to the Form which this Panel contains
    * @returns Ext.form.Basic The Form which this Panel contains.
    */
  var getForm: js.UndefOr[js.Function0[IBasic]] = js.undefined
  /** [Method] Returns the currently loaded Ext data Model instance if one was loaded via loadRecord
    * @returns Ext.data.Model The loaded instance
    */
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Convenience function for fetching the current value of each field in the form
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
  ] = js.undefined
  /** [Method] Convenience function to check if the form has any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Convenience function to check if the form has any dirty fields
    * @returns Boolean
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Convenience function to check if the form has all valid fields
    * @returns Boolean
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic load call
    * @param options Object The options to pass to the action (see Ext.form.Basic.load and Ext.form.Basic.doAction for details)
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
    * @param record Ext.data.Model The record to load
    * @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
    */
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
  /** [Method] Fired when the error message of any field within the container changes
    * @param field Ext.form.Labelable The sub-field whose active error changed
    * @param error String The new active error message
    */
  var onFieldErrorChange: js.UndefOr[js.Function2[js.UndefOr[ILabelable], js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Fired when the validity of any field within the container changes
    * @param field Ext.form.field.Field The sub-field whose validity changed
    * @param valid Boolean The new validity state
    */
  var onFieldValidityChange: js.UndefOr[
    js.Function2[js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var pollForChanges: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var pollInterval: js.UndefOr[Double] = js.undefined
  /** [Method] Start an interval task to continuously poll all the fields in the form for changes in their values
    * @param interval Number The interval in milliseconds at which the check should run.
    */
  var startPolling: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Stop a running interval task that was started by startPolling  */
  var stopPolling: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic submit call
    * @param options Object The options to pass to the action (see Ext.form.Basic.submit and Ext.form.Basic.doAction for details)
    */
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
    * @param record Ext.data.Model The record to edit
    * @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
    */
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
}

object IFormPanel {
  @scala.inline
  def apply(
    IPanel: typings.extjs.Ext.panel.IPanel = null,
    checkChange: () => Unit = null,
    fieldDefaults: js.Any = null,
    getForm: () => IBasic = null,
    getRecord: () => IModel = null,
    getValues: (/* asString */ js.UndefOr[Boolean], /* dirtyOnly */ js.UndefOr[Boolean], /* includeEmptyText */ js.UndefOr[Boolean], /* useDataValues */ js.UndefOr[Boolean]) => _ = null,
    hasInvalidField: () => Unit = null,
    initFieldAncestor: () => Unit = null,
    isDirty: () => Boolean = null,
    isValid: () => Boolean = null,
    load: /* options */ js.UndefOr[js.Any] => Unit = null,
    loadRecord: /* record */ js.UndefOr[IModel] => IBasic = null,
    onFieldErrorChange: (js.UndefOr[ILabelable], js.UndefOr[String]) => Unit = null,
    onFieldValidityChange: (js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Unit = null,
    pollForChanges: js.UndefOr[Boolean] = js.undefined,
    pollInterval: js.UndefOr[Double] = js.undefined,
    startPolling: /* interval */ js.UndefOr[Double] => Unit = null,
    stopPolling: () => Unit = null,
    submit: /* options */ js.UndefOr[js.Any] => Unit = null,
    updateRecord: /* record */ js.UndefOr[IModel] => IBasic = null
  ): IFormPanel = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (checkChange != null) __obj.updateDynamic("checkChange")(js.Any.fromFunction0(checkChange))
    if (fieldDefaults != null) __obj.updateDynamic("fieldDefaults")(fieldDefaults.asInstanceOf[js.Any])
    if (getForm != null) __obj.updateDynamic("getForm")(js.Any.fromFunction0(getForm))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction4(getValues))
    if (hasInvalidField != null) __obj.updateDynamic("hasInvalidField")(js.Any.fromFunction0(hasInvalidField))
    if (initFieldAncestor != null) __obj.updateDynamic("initFieldAncestor")(js.Any.fromFunction0(initFieldAncestor))
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(js.Any.fromFunction1(loadRecord))
    if (onFieldErrorChange != null) __obj.updateDynamic("onFieldErrorChange")(js.Any.fromFunction2(onFieldErrorChange))
    if (onFieldValidityChange != null) __obj.updateDynamic("onFieldValidityChange")(js.Any.fromFunction2(onFieldValidityChange))
    if (!js.isUndefined(pollForChanges)) __obj.updateDynamic("pollForChanges")(pollForChanges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pollInterval)) __obj.updateDynamic("pollInterval")(pollInterval.get.asInstanceOf[js.Any])
    if (startPolling != null) __obj.updateDynamic("startPolling")(js.Any.fromFunction1(startPolling))
    if (stopPolling != null) __obj.updateDynamic("stopPolling")(js.Any.fromFunction0(stopPolling))
    if (submit != null) __obj.updateDynamic("submit")(js.Any.fromFunction1(submit))
    if (updateRecord != null) __obj.updateDynamic("updateRecord")(js.Any.fromFunction1(updateRecord))
    __obj.asInstanceOf[IFormPanel]
  }
}

