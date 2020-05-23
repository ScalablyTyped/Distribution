package typings.extjs.Ext

import typings.extjs.Ext.form.field.IField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditor
  extends typings.extjs.Ext.container.IContainer {
  /** [Method] private
    * @param ct Object
    * @param position Object
    */
  @JSName("afterRender")
  var afterRender_IEditor: js.UndefOr[
    js.Function2[/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var allowBlur: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var autoSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Cancels the editing process and hides the editor without persisting any changes
    * @param remainVisible Boolean Override the default behavior and keep the editor visible after cancel
    */
  var cancelEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var cancelOnEsc: js.UndefOr[Boolean] = js.undefined
  /** [Method] Ends the editing process persists the changed value to the underlying field and hides the editor
    * @param remainVisible Boolean Override the default behavior and keep the editor visible after edit
    */
  var completeEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var completeOnEnter: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.form.field.Field) */
  var field: js.UndefOr[IField] = js.undefined
  /** [Method] Gets the data value of the editor
    * @returns Object The data value
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideEl: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreNoChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number[]) */
  var offsets: js.UndefOr[Array] = js.undefined
  /** [Method] private */
  @JSName("onHide")
  var onHide_IEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] private */
  @JSName("onShow")
  var onShow_IEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var parentEl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Realigns the editor to the bound field based on the current alignment config value
    * @param autoSize Boolean True to size the field to the dimensions of the bound element.
    */
  var realign: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var revertInvalid: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the data value of the editor
    * @param value Object Any valid value supported by the underlying field
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Starts the editing process and shows the editor
    * @param el String/HTMLElement/Ext.Element The element to edit
    * @param value String A value to initialize the editor with. If a value is not provided, it defaults to the innerHTML of el.
    */
  var startEdit: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var swallowKeys: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var updateEl: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IEditor {
  @scala.inline
  def apply(
    IContainer: typings.extjs.Ext.container.IContainer = null,
    afterRender: (/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit = null,
    alignment: java.lang.String = null,
    allowBlur: js.UndefOr[Boolean] = js.undefined,
    autoSize: js.Any = null,
    cancelEdit: /* remainVisible */ js.UndefOr[Boolean] => Unit = null,
    cancelOnEsc: js.UndefOr[Boolean] = js.undefined,
    completeEdit: /* remainVisible */ js.UndefOr[Boolean] => Unit = null,
    completeOnEnter: js.UndefOr[Boolean] = js.undefined,
    field: IField = null,
    getValue: () => _ = null,
    hideEl: js.UndefOr[Boolean] = js.undefined,
    ignoreNoChange: js.UndefOr[Boolean] = js.undefined,
    offsets: Array = null,
    onHide: () => Unit = null,
    onShow: () => Unit = null,
    parentEl: js.Any = null,
    realign: /* autoSize */ js.UndefOr[Boolean] => Unit = null,
    revertInvalid: js.UndefOr[Boolean] = js.undefined,
    setValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    startEdit: (/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => Unit = null,
    swallowKeys: js.UndefOr[Boolean] = js.undefined,
    updateEl: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IEditor = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction2(afterRender))
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBlur)) __obj.updateDynamic("allowBlur")(allowBlur.get.asInstanceOf[js.Any])
    if (autoSize != null) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(js.Any.fromFunction1(cancelEdit))
    if (!js.isUndefined(cancelOnEsc)) __obj.updateDynamic("cancelOnEsc")(cancelOnEsc.get.asInstanceOf[js.Any])
    if (completeEdit != null) __obj.updateDynamic("completeEdit")(js.Any.fromFunction1(completeEdit))
    if (!js.isUndefined(completeOnEnter)) __obj.updateDynamic("completeOnEnter")(completeOnEnter.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (!js.isUndefined(hideEl)) __obj.updateDynamic("hideEl")(hideEl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNoChange)) __obj.updateDynamic("ignoreNoChange")(ignoreNoChange.get.asInstanceOf[js.Any])
    if (offsets != null) __obj.updateDynamic("offsets")(offsets.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl.asInstanceOf[js.Any])
    if (realign != null) __obj.updateDynamic("realign")(js.Any.fromFunction1(realign))
    if (!js.isUndefined(revertInvalid)) __obj.updateDynamic("revertInvalid")(revertInvalid.get.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2(startEdit))
    if (!js.isUndefined(swallowKeys)) __obj.updateDynamic("swallowKeys")(swallowKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateEl)) __obj.updateDynamic("updateEl")(updateEl.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditor]
  }
}

