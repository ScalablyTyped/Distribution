package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITwinTriggerField
  extends extjsLib.ExtNs.formNs.fieldNs.IText {
  /** [Config Option] (Boolean) */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Get the total width of the trigger button area
  		* @returns Number The total trigger width
  		*/
  var getTriggerWidth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideTrigger: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.Element) */
  var inputCell: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Method] The function that should handle the trigger s click event
  		* @param e Ext.EventObject
  		*/
  var onTriggerClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var repeatTriggerClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the editable state of this field
  		* @param editable Boolean True to allow the user to directly edit the field text. If false is passed, the user will only be able to modify the field using the trigger. Will also add a click event to the text field which will call the trigger.
  		*/
  var setEditable: js.UndefOr[js.Function1[/* editable */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var triggerBaseCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var triggerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.CompositeElement) */
  var triggerEl: js.UndefOr[extjsLib.ExtNs.ICompositeElement] = js.undefined
  /** [Config Option] (String) */
  var triggerNoEditCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var triggerWrap: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (String) */
  var triggerWrapCls: js.UndefOr[java.lang.String] = js.undefined
}

object ITwinTriggerField {
  @scala.inline
  def apply(
    IText: extjsLib.ExtNs.formNs.fieldNs.IText = null,
    componentLayout: js.Any = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    getLabelableRenderData: () => _ = null,
    getSubTplData: () => _ = null,
    getTriggerWidth: () => scala.Double = null,
    hideTrigger: js.UndefOr[scala.Boolean] = js.undefined,
    initComponent: () => scala.Unit = null,
    inputCell: extjsLib.ExtNs.IElement = null,
    onRender: () => scala.Unit = null,
    onTriggerClick: /* e */ js.UndefOr[extjsLib.ExtNs.IEventObject] => scala.Unit = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    repeatTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    selectOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    setEditable: /* editable */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setReadOnly: /* readOnly */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    triggerBaseCls: java.lang.String = null,
    triggerCls: java.lang.String = null,
    triggerEl: extjsLib.ExtNs.ICompositeElement = null,
    triggerNoEditCls: java.lang.String = null,
    triggerWrap: extjsLib.ExtNs.IElement = null,
    triggerWrapCls: java.lang.String = null
  ): ITwinTriggerField = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (getLabelableRenderData != null) __obj.updateDynamic("getLabelableRenderData")(js.Any.fromFunction0(getLabelableRenderData))
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(js.Any.fromFunction0(getSubTplData))
    if (getTriggerWidth != null) __obj.updateDynamic("getTriggerWidth")(js.Any.fromFunction0(getTriggerWidth))
    if (!js.isUndefined(hideTrigger)) __obj.updateDynamic("hideTrigger")(hideTrigger)
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (inputCell != null) __obj.updateDynamic("inputCell")(inputCell)
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (onTriggerClick != null) __obj.updateDynamic("onTriggerClick")(js.Any.fromFunction1(onTriggerClick))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(repeatTriggerClick)) __obj.updateDynamic("repeatTriggerClick")(repeatTriggerClick)
    if (!js.isUndefined(selectOnFocus)) __obj.updateDynamic("selectOnFocus")(selectOnFocus)
    if (setEditable != null) __obj.updateDynamic("setEditable")(js.Any.fromFunction1(setEditable))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (triggerBaseCls != null) __obj.updateDynamic("triggerBaseCls")(triggerBaseCls)
    if (triggerCls != null) __obj.updateDynamic("triggerCls")(triggerCls)
    if (triggerEl != null) __obj.updateDynamic("triggerEl")(triggerEl)
    if (triggerNoEditCls != null) __obj.updateDynamic("triggerNoEditCls")(triggerNoEditCls)
    if (triggerWrap != null) __obj.updateDynamic("triggerWrap")(triggerWrap)
    if (triggerWrapCls != null) __obj.updateDynamic("triggerWrapCls")(triggerWrapCls)
    __obj.asInstanceOf[ITwinTriggerField]
  }
}

