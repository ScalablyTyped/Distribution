package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrigger extends IText {
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

object ITrigger {
  @scala.inline
  def apply(
    IText: IText = null,
    componentLayout: js.Any = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    getLabelableRenderData: js.Function0[_] = null,
    getSubTplData: js.Function0[_] = null,
    getTriggerWidth: js.Function0[scala.Double] = null,
    hideTrigger: js.UndefOr[scala.Boolean] = js.undefined,
    initComponent: js.Function0[scala.Unit] = null,
    inputCell: extjsLib.ExtNs.IElement = null,
    onRender: js.Function0[scala.Unit] = null,
    onTriggerClick: js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    repeatTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    selectOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    setEditable: js.Function1[/* editable */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setReadOnly: js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    triggerBaseCls: java.lang.String = null,
    triggerCls: java.lang.String = null,
    triggerEl: extjsLib.ExtNs.ICompositeElement = null,
    triggerNoEditCls: java.lang.String = null,
    triggerWrap: extjsLib.ExtNs.IElement = null,
    triggerWrapCls: java.lang.String = null
  ): ITrigger = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (getLabelableRenderData != null) __obj.updateDynamic("getLabelableRenderData")(getLabelableRenderData)
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(getSubTplData)
    if (getTriggerWidth != null) __obj.updateDynamic("getTriggerWidth")(getTriggerWidth)
    if (!js.isUndefined(hideTrigger)) __obj.updateDynamic("hideTrigger")(hideTrigger)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (inputCell != null) __obj.updateDynamic("inputCell")(inputCell)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (onTriggerClick != null) __obj.updateDynamic("onTriggerClick")(onTriggerClick)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(repeatTriggerClick)) __obj.updateDynamic("repeatTriggerClick")(repeatTriggerClick)
    if (!js.isUndefined(selectOnFocus)) __obj.updateDynamic("selectOnFocus")(selectOnFocus)
    if (setEditable != null) __obj.updateDynamic("setEditable")(setEditable)
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(setReadOnly)
    if (triggerBaseCls != null) __obj.updateDynamic("triggerBaseCls")(triggerBaseCls)
    if (triggerCls != null) __obj.updateDynamic("triggerCls")(triggerCls)
    if (triggerEl != null) __obj.updateDynamic("triggerEl")(triggerEl)
    if (triggerNoEditCls != null) __obj.updateDynamic("triggerNoEditCls")(triggerNoEditCls)
    if (triggerWrap != null) __obj.updateDynamic("triggerWrap")(triggerWrap)
    if (triggerWrapCls != null) __obj.updateDynamic("triggerWrapCls")(triggerWrapCls)
    __obj.asInstanceOf[ITrigger]
  }
}

