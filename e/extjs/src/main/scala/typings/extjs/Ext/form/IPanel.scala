package typings.extjs.Ext.form

import typings.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ @js.native
trait IPanel
  extends typings.extjs.Ext.panel.IPanel {
  /** [Method] Forces each field within the form panel to check if its value has changed  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.native
  /** [Method] Provides access to the Form which this Panel contains
    * @returns Ext.form.Basic The Form which this Panel contains.
    */
  var getForm: js.UndefOr[js.Function0[IBasic]] = js.native
  /** [Method] Returns the currently loaded Ext data Model instance if one was loaded via loadRecord
    * @returns Ext.data.Model The loaded instance
    */
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.native
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
  ] = js.native
  /** [Method] Convenience function to check if the form has any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Convenience function to check if the form has any dirty fields
    * @returns Boolean
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Convenience function to check if the form has all valid fields
    * @returns Boolean
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic load call
    * @param options Object The options to pass to the action (see Ext.form.Basic.load and Ext.form.Basic.doAction for details)
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
    * @param record Ext.data.Model The record to load
    * @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
    */
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.native
  /** [Method] Fired when the error message of any field within the container changes
    * @param field Ext.form.Labelable The sub-field whose active error changed
    * @param error String The new active error message
    */
  var onFieldErrorChange: js.UndefOr[js.Function2[js.UndefOr[ILabelable], js.UndefOr[String], Unit]] = js.native
  /** [Method] Fired when the validity of any field within the container changes
    * @param field Ext.form.field.Field The sub-field whose validity changed
    * @param valid Boolean The new validity state
    */
  var onFieldValidityChange: js.UndefOr[
    js.Function2[js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var pollForChanges: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var pollInterval: js.UndefOr[Double] = js.native
  /** [Method] Start an interval task to continuously poll all the fields in the form for changes in their values
    * @param interval Number The interval in milliseconds at which the check should run.
    */
  var startPolling: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Stop a running interval task that was started by startPolling  */
  var stopPolling: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic submit call
    * @param options Object The options to pass to the action (see Ext.form.Basic.submit and Ext.form.Basic.doAction for details)
    */
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
    * @param record Ext.data.Model The record to edit
    * @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
    */
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.native
}

object IPanel {
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
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
    def setCheckChange(value: () => Unit): Self = this.set("checkChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheckChange: Self = this.set("checkChange", js.undefined)
    @scala.inline
    def setFieldDefaults(value: js.Any): Self = this.set("fieldDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDefaults: Self = this.set("fieldDefaults", js.undefined)
    @scala.inline
    def setGetForm(value: () => IBasic): Self = this.set("getForm", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetForm: Self = this.set("getForm", js.undefined)
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
    def setInitFieldAncestor(value: () => Unit): Self = this.set("initFieldAncestor", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitFieldAncestor: Self = this.set("initFieldAncestor", js.undefined)
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLoadRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = this.set("loadRecord", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadRecord: Self = this.set("loadRecord", js.undefined)
    @scala.inline
    def setOnFieldErrorChange(value: (js.UndefOr[ILabelable], js.UndefOr[String]) => Unit): Self = this.set("onFieldErrorChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFieldErrorChange: Self = this.set("onFieldErrorChange", js.undefined)
    @scala.inline
    def setOnFieldValidityChange(value: (js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Unit): Self = this.set("onFieldValidityChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFieldValidityChange: Self = this.set("onFieldValidityChange", js.undefined)
    @scala.inline
    def setPollForChanges(value: Boolean): Self = this.set("pollForChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollForChanges: Self = this.set("pollForChanges", js.undefined)
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    @scala.inline
    def setStartPolling(value: /* interval */ js.UndefOr[Double] => Unit): Self = this.set("startPolling", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStartPolling: Self = this.set("startPolling", js.undefined)
    @scala.inline
    def setStopPolling(value: () => Unit): Self = this.set("stopPolling", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopPolling: Self = this.set("stopPolling", js.undefined)
    @scala.inline
    def setSubmit(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("submit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    @scala.inline
    def setUpdateRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = this.set("updateRecord", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateRecord: Self = this.set("updateRecord", js.undefined)
  }
  
}

