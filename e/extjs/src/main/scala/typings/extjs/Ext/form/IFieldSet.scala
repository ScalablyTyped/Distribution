package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.panel.ITool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ trait IFieldSet
  extends typings.extjs.Ext.container.IContainer {
  /** [Property] (Ext.form.field.Checkbox) */
  var checkboxCmp: js.UndefOr[typings.extjs.Ext.form.field.ICheckbox] = js.undefined
  /** [Config Option] (String) */
  var checkboxName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var checkboxToggle: js.UndefOr[Boolean] = js.undefined
  /** [Method] Collapses the fieldset
  		* @returns Ext.form.FieldSet this
  		*/
  var collapse: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /** [Method] Creates the checkbox component
  		* @returns Ext.Component
  		*/
  var createCheckboxCmp: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Creates the legend title component
  		* @returns Ext.Component
  		*/
  var createTitleCmp: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Creates the toggle button component
  		* @returns Ext.Component
  		*/
  var createToggleCmp: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Expands the fieldset
  		* @returns Ext.form.FieldSet this
  		*/
  var expand: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Ext.Component) */
  var legend: js.UndefOr[IComponent] = js.undefined
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[js.Function2[js.UndefOr[ILabelable], js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Sets the title of this fieldset
  		* @param title String The new title.
  		* @returns Ext.form.FieldSet this
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Toggle the fieldset s collapsed state to the opposite of what it is currently  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Ext.panel.Tool) */
  var toggleCmp: js.UndefOr[ITool] = js.undefined
  /** [Config Option] (Boolean) */
  var toggleOnTitleClick: js.UndefOr[Boolean] = js.undefined
}

object IFieldSet {
  @scala.inline
  def apply(
    IContainer: typings.extjs.Ext.container.IContainer = null,
    autoEl: js.Any = null,
    baseCls: java.lang.String = null,
    checkboxCmp: typings.extjs.Ext.form.field.ICheckbox = null,
    checkboxName: java.lang.String = null,
    checkboxToggle: js.UndefOr[Boolean] = js.undefined,
    collapse: () => IFieldSet = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    componentLayout: js.Any = null,
    createCheckboxCmp: () => IComponent = null,
    createTitleCmp: () => IComponent = null,
    createToggleCmp: () => IComponent = null,
    expand: () => IFieldSet = null,
    fieldDefaults: js.Any = null,
    getRefItems: /* deep */ js.UndefOr[js.Any] => Unit = null,
    getState: () => _ = null,
    initFieldAncestor: () => Unit = null,
    layout: js.Any = null,
    legend: IComponent = null,
    maskOnDisable: js.UndefOr[Boolean] = js.undefined,
    onFieldErrorChange: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[java.lang.String]) => Unit = null,
    onFieldValidityChange: (/* field */ js.UndefOr[typings.extjs.Ext.form.field.IField], /* valid */ js.UndefOr[Boolean]) => Unit = null,
    renderTpl: js.Any = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => IFieldSet = null,
    stateEvents: Array = null,
    title: java.lang.String = null,
    toggle: () => Unit = null,
    toggleCmp: ITool = null,
    toggleOnTitleClick: js.UndefOr[Boolean] = js.undefined
  ): IFieldSet = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (autoEl != null) __obj.updateDynamic("autoEl")(autoEl)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (checkboxCmp != null) __obj.updateDynamic("checkboxCmp")(checkboxCmp)
    if (checkboxName != null) __obj.updateDynamic("checkboxName")(checkboxName)
    if (!js.isUndefined(checkboxToggle)) __obj.updateDynamic("checkboxToggle")(checkboxToggle)
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction0(collapse))
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (createCheckboxCmp != null) __obj.updateDynamic("createCheckboxCmp")(js.Any.fromFunction0(createCheckboxCmp))
    if (createTitleCmp != null) __obj.updateDynamic("createTitleCmp")(js.Any.fromFunction0(createTitleCmp))
    if (createToggleCmp != null) __obj.updateDynamic("createToggleCmp")(js.Any.fromFunction0(createToggleCmp))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction0(expand))
    if (fieldDefaults != null) __obj.updateDynamic("fieldDefaults")(fieldDefaults)
    if (getRefItems != null) __obj.updateDynamic("getRefItems")(js.Any.fromFunction1(getRefItems))
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (initFieldAncestor != null) __obj.updateDynamic("initFieldAncestor")(js.Any.fromFunction0(initFieldAncestor))
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (!js.isUndefined(maskOnDisable)) __obj.updateDynamic("maskOnDisable")(maskOnDisable)
    if (onFieldErrorChange != null) __obj.updateDynamic("onFieldErrorChange")(js.Any.fromFunction2(onFieldErrorChange))
    if (onFieldValidityChange != null) __obj.updateDynamic("onFieldValidityChange")(js.Any.fromFunction2(onFieldValidityChange))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (stateEvents != null) __obj.updateDynamic("stateEvents")(stateEvents)
    if (title != null) __obj.updateDynamic("title")(title)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    if (toggleCmp != null) __obj.updateDynamic("toggleCmp")(toggleCmp)
    if (!js.isUndefined(toggleOnTitleClick)) __obj.updateDynamic("toggleOnTitleClick")(toggleOnTitleClick)
    __obj.asInstanceOf[IFieldSet]
  }
}

