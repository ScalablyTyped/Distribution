package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.formNs.IFieldAncestor because Would inherit conflicting mutable fields List(alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses))*/
trait IFieldSet
  extends extjsLib.ExtNs.containerNs.IContainer {
  /** [Property] (Ext.form.field.Checkbox) */
  var checkboxCmp: js.UndefOr[extjsLib.ExtNs.formNs.fieldNs.ICheckbox] = js.undefined
  /** [Config Option] (String) */
  var checkboxName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var checkboxToggle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Collapses the fieldset
  		* @returns Ext.form.FieldSet this
  		*/
  var collapse: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Creates the checkbox component
  		* @returns Ext.Component
  		*/
  var createCheckboxCmp: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Creates the legend title component
  		* @returns Ext.Component
  		*/
  var createTitleCmp: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Creates the toggle button component
  		* @returns Ext.Component
  		*/
  var createToggleCmp: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Expands the fieldset
  		* @returns Ext.form.FieldSet this
  		*/
  var expand: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Ext.Component) */
  var legend: js.UndefOr[extjsLib.ExtNs.IComponent] = js.undefined
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
  /** [Method] Sets the title of this fieldset
  		* @param title String The new title.
  		* @returns Ext.form.FieldSet this
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Toggle the fieldset s collapsed state to the opposite of what it is currently  */
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Ext.panel.Tool) */
  var toggleCmp: js.UndefOr[extjsLib.ExtNs.panelNs.ITool] = js.undefined
  /** [Config Option] (Boolean) */
  var toggleOnTitleClick: js.UndefOr[scala.Boolean] = js.undefined
}

