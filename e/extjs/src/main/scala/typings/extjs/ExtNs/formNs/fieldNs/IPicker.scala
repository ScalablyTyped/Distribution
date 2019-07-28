package typings.extjs.ExtNs.formNs.fieldNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPicker
  extends typings.extjs.ExtNs.formNs.fieldNs.ITrigger {
  /** [Method] Aligns the picker to the input element */
  var alignPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Collapses this field s picker dropdown  */
  var collapse: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Creates and returns the component to be used as this field s picker  */
  var createPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Expands this field s picker dropdown  */
  var expand: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns a reference to the picker component for this field creating it if necessary by calling createPicker
  		* @returns Ext.Component The picker component
  		*/
  var getPicker: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Property] (Boolean) */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var matchFieldWidth: js.UndefOr[Boolean] = js.undefined
  /** [Method] Handles the trigger click by default toggles between expanding and collapsing the picker component  */
  @JSName("onTriggerClick")
  var onTriggerClick_IPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var openCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pickerAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number[]) */
  var pickerOffset: js.UndefOr[Array] = js.undefined
}

object IPicker {
  @scala.inline
  def apply(
    ITrigger: typings.extjs.ExtNs.formNs.fieldNs.ITrigger = null,
    alignPicker: () => Unit = null,
    collapse: () => Unit = null,
    createPicker: () => Unit = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    expand: () => Unit = null,
    getPicker: () => IComponent = null,
    initComponent: () => Unit = null,
    initEvents: () => Unit = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    matchFieldWidth: js.UndefOr[Boolean] = js.undefined,
    onTriggerClick: () => Unit = null,
    openCls: java.lang.String = null,
    pickerAlign: java.lang.String = null,
    pickerOffset: Array = null
  ): IPicker = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITrigger)
    if (alignPicker != null) __obj.updateDynamic("alignPicker")(js.Any.fromFunction0(alignPicker))
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction0(collapse))
    if (createPicker != null) __obj.updateDynamic("createPicker")(js.Any.fromFunction0(createPicker))
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction0(expand))
    if (getPicker != null) __obj.updateDynamic("getPicker")(js.Any.fromFunction0(getPicker))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (initEvents != null) __obj.updateDynamic("initEvents")(js.Any.fromFunction0(initEvents))
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(matchFieldWidth)) __obj.updateDynamic("matchFieldWidth")(matchFieldWidth)
    if (onTriggerClick != null) __obj.updateDynamic("onTriggerClick")(js.Any.fromFunction0(onTriggerClick))
    if (openCls != null) __obj.updateDynamic("openCls")(openCls)
    if (pickerAlign != null) __obj.updateDynamic("pickerAlign")(pickerAlign)
    if (pickerOffset != null) __obj.updateDynamic("pickerOffset")(pickerOffset)
    __obj.asInstanceOf[IPicker]
  }
}

