package typings.extjs.Ext.form

import typings.extjs.Ext.IComponent
import typings.extjs.Ext.container.IContainer
import typings.extjs.Ext.panel.ITool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IFieldSetOps[Self <: IFieldSet] (val x: Self) extends AnyVal {
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
    def setCheckboxCmp(value: typings.extjs.Ext.form.field.ICheckbox): Self = this.set("checkboxCmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxCmp: Self = this.set("checkboxCmp", js.undefined)
    @scala.inline
    def setCheckboxName(value: String): Self = this.set("checkboxName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxName: Self = this.set("checkboxName", js.undefined)
    @scala.inline
    def setCheckboxToggle(value: Boolean): Self = this.set("checkboxToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxToggle: Self = this.set("checkboxToggle", js.undefined)
    @scala.inline
    def setCollapse(value: () => IFieldSet): Self = this.set("collapse", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setCreateCheckboxCmp(value: () => IComponent): Self = this.set("createCheckboxCmp", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreateCheckboxCmp: Self = this.set("createCheckboxCmp", js.undefined)
    @scala.inline
    def setCreateTitleCmp(value: () => IComponent): Self = this.set("createTitleCmp", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreateTitleCmp: Self = this.set("createTitleCmp", js.undefined)
    @scala.inline
    def setCreateToggleCmp(value: () => IComponent): Self = this.set("createToggleCmp", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreateToggleCmp: Self = this.set("createToggleCmp", js.undefined)
    @scala.inline
    def setExpand(value: () => IFieldSet): Self = this.set("expand", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setFieldDefaults(value: js.Any): Self = this.set("fieldDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDefaults: Self = this.set("fieldDefaults", js.undefined)
    @scala.inline
    def setInitFieldAncestor(value: () => Unit): Self = this.set("initFieldAncestor", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitFieldAncestor: Self = this.set("initFieldAncestor", js.undefined)
    @scala.inline
    def setLegend(value: IComponent): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setOnFieldErrorChange(value: (js.UndefOr[ILabelable], js.UndefOr[String]) => Unit): Self = this.set("onFieldErrorChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFieldErrorChange: Self = this.set("onFieldErrorChange", js.undefined)
    @scala.inline
    def setOnFieldValidityChange(value: (js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Unit): Self = this.set("onFieldValidityChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFieldValidityChange: Self = this.set("onFieldValidityChange", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => IFieldSet): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setToggleCmp(value: ITool): Self = this.set("toggleCmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleCmp: Self = this.set("toggleCmp", js.undefined)
    @scala.inline
    def setToggleOnTitleClick(value: Boolean): Self = this.set("toggleOnTitleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleOnTitleClick: Self = this.set("toggleOnTitleClick", js.undefined)
  }
  
}

