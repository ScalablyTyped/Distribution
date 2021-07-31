package typings.extjs.Ext.form

import typings.extjs.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ trait IFormPanel
  extends StObject
     with typings.extjs.Ext.panel.IPanel {
  
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
      js.Any
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
  def apply(): IFormPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormPanel]
  }
  
  @scala.inline
  implicit class IFormPanelMutableBuilder[Self <: IFormPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckChange(value: () => Unit): Self = StObject.set(x, "checkChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
    
    @scala.inline
    def setFieldDefaults(value: js.Any): Self = StObject.set(x, "fieldDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDefaultsUndefined: Self = StObject.set(x, "fieldDefaults", js.undefined)
    
    @scala.inline
    def setGetForm(value: () => IBasic): Self = StObject.set(x, "getForm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormUndefined: Self = StObject.set(x, "getForm", js.undefined)
    
    @scala.inline
    def setGetRecord(value: () => IModel): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    @scala.inline
    def setGetValues(
      value: (/* asString */ js.UndefOr[Boolean], /* dirtyOnly */ js.UndefOr[Boolean], /* includeEmptyText */ js.UndefOr[Boolean], /* useDataValues */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "getValues", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    @scala.inline
    def setHasInvalidField(value: () => Unit): Self = StObject.set(x, "hasInvalidField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasInvalidFieldUndefined: Self = StObject.set(x, "hasInvalidField", js.undefined)
    
    @scala.inline
    def setInitFieldAncestor(value: () => Unit): Self = StObject.set(x, "initFieldAncestor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitFieldAncestorUndefined: Self = StObject.set(x, "initFieldAncestor", js.undefined)
    
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = StObject.set(x, "loadRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadRecordUndefined: Self = StObject.set(x, "loadRecord", js.undefined)
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setOnFieldErrorChange(value: (js.UndefOr[ILabelable], js.UndefOr[String]) => Unit): Self = StObject.set(x, "onFieldErrorChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFieldErrorChangeUndefined: Self = StObject.set(x, "onFieldErrorChange", js.undefined)
    
    @scala.inline
    def setOnFieldValidityChange(value: (js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onFieldValidityChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFieldValidityChangeUndefined: Self = StObject.set(x, "onFieldValidityChange", js.undefined)
    
    @scala.inline
    def setPollForChanges(value: Boolean): Self = StObject.set(x, "pollForChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollForChangesUndefined: Self = StObject.set(x, "pollForChanges", js.undefined)
    
    @scala.inline
    def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
    
    @scala.inline
    def setStartPolling(value: /* interval */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "startPolling", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartPollingUndefined: Self = StObject.set(x, "startPolling", js.undefined)
    
    @scala.inline
    def setStopPolling(value: () => Unit): Self = StObject.set(x, "stopPolling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPollingUndefined: Self = StObject.set(x, "stopPolling", js.undefined)
    
    @scala.inline
    def setSubmit(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    @scala.inline
    def setUpdateRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = StObject.set(x, "updateRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRecordUndefined: Self = StObject.set(x, "updateRecord", js.undefined)
  }
}
