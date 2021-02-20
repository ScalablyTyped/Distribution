package typings.extjs.Ext.form

import typings.extjs.Ext.IComponent
import typings.extjs.Ext.container.IContainer
import typings.extjs.Ext.panel.ITool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ @js.native
trait IFieldSet extends IContainer {
  
  /** [Property] (Ext.form.field.Checkbox) */
  var checkboxCmp: js.UndefOr[typings.extjs.Ext.form.field.ICheckbox] = js.native
  
  /** [Config Option] (String) */
  var checkboxName: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var checkboxToggle: js.UndefOr[Boolean] = js.native
  
  /** [Method] Collapses the fieldset
    * @returns Ext.form.FieldSet this
    */
  var collapse: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.native
  
  /** [Method] Creates the checkbox component
    * @returns Ext.Component
    */
  var createCheckboxCmp: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Creates the legend title component
    * @returns Ext.Component
    */
  var createTitleCmp: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Creates the toggle button component
    * @returns Ext.Component
    */
  var createToggleCmp: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Expands the fieldset
    * @returns Ext.form.FieldSet this
    */
  var expand: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.native
  
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Ext.Component) */
  var legend: js.UndefOr[IComponent] = js.native
  
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
  
  /** [Method] Sets the title of this fieldset
    * @param title String The new title.
    * @returns Ext.form.FieldSet this
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], this.type]] = js.native
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  
  /** [Method] Toggle the fieldset s collapsed state to the opposite of what it is currently  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Ext.panel.Tool) */
  var toggleCmp: js.UndefOr[ITool] = js.native
  
  /** [Config Option] (Boolean) */
  var toggleOnTitleClick: js.UndefOr[Boolean] = js.native
}
object IFieldSet {
  
  @scala.inline
  def apply(): IFieldSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldSet]
  }
  
  @scala.inline
  implicit class IFieldSetMutableBuilder[Self <: IFieldSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckboxCmp(value: typings.extjs.Ext.form.field.ICheckbox): Self = StObject.set(x, "checkboxCmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxCmpUndefined: Self = StObject.set(x, "checkboxCmp", js.undefined)
    
    @scala.inline
    def setCheckboxName(value: String): Self = StObject.set(x, "checkboxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxNameUndefined: Self = StObject.set(x, "checkboxName", js.undefined)
    
    @scala.inline
    def setCheckboxToggle(value: Boolean): Self = StObject.set(x, "checkboxToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxToggleUndefined: Self = StObject.set(x, "checkboxToggle", js.undefined)
    
    @scala.inline
    def setCollapse(value: () => IFieldSet): Self = StObject.set(x, "collapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setCreateCheckboxCmp(value: () => IComponent): Self = StObject.set(x, "createCheckboxCmp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateCheckboxCmpUndefined: Self = StObject.set(x, "createCheckboxCmp", js.undefined)
    
    @scala.inline
    def setCreateTitleCmp(value: () => IComponent): Self = StObject.set(x, "createTitleCmp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateTitleCmpUndefined: Self = StObject.set(x, "createTitleCmp", js.undefined)
    
    @scala.inline
    def setCreateToggleCmp(value: () => IComponent): Self = StObject.set(x, "createToggleCmp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateToggleCmpUndefined: Self = StObject.set(x, "createToggleCmp", js.undefined)
    
    @scala.inline
    def setExpand(value: () => IFieldSet): Self = StObject.set(x, "expand", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFieldDefaults(value: js.Any): Self = StObject.set(x, "fieldDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDefaultsUndefined: Self = StObject.set(x, "fieldDefaults", js.undefined)
    
    @scala.inline
    def setInitFieldAncestor(value: () => Unit): Self = StObject.set(x, "initFieldAncestor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitFieldAncestorUndefined: Self = StObject.set(x, "initFieldAncestor", js.undefined)
    
    @scala.inline
    def setLegend(value: IComponent): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setOnFieldErrorChange(value: (js.UndefOr[ILabelable], js.UndefOr[String]) => Unit): Self = StObject.set(x, "onFieldErrorChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFieldErrorChangeUndefined: Self = StObject.set(x, "onFieldErrorChange", js.undefined)
    
    @scala.inline
    def setOnFieldValidityChange(value: (js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onFieldValidityChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFieldValidityChangeUndefined: Self = StObject.set(x, "onFieldValidityChange", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => IFieldSet): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleCmp(value: ITool): Self = StObject.set(x, "toggleCmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleCmpUndefined: Self = StObject.set(x, "toggleCmp", js.undefined)
    
    @scala.inline
    def setToggleOnTitleClick(value: Boolean): Self = StObject.set(x, "toggleOnTitleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleOnTitleClickUndefined: Self = StObject.set(x, "toggleOnTitleClick", js.undefined)
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
