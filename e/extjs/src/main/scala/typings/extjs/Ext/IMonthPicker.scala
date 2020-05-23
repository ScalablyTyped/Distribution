package typings.extjs.Ext

import typings.extjs.Ext.picker.IMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonthPicker extends IComponent {
  /** [Method] Modify the year display by passing an offset
    * @param offset Number The offset to move by.
    */
  var adjustYear: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (String) */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets the selected value
    * @returns Number[] The selected value
    */
  var getValue: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Checks whether the picker has a selection
    * @returns Boolean Returns true if both a month and year have been selected
    */
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (String) */
  var okText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Set the value for the picker
    * @param value Date/Number[] The value to set. It can be a Date object, where the month/year will be extracted, or it can be an array, with the month as the first index and the year as the second.
    * @returns Ext.picker.Month this
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IMonth]] = js.undefined
  /** [Config Option] (Boolean) */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Date/Number[]) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IMonthPicker {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    adjustYear: /* offset */ js.UndefOr[Double] => Unit = null,
    cancelText: java.lang.String = null,
    getValue: () => Array = null,
    hasSelection: () => Boolean = null,
    okText: java.lang.String = null,
    selectedCls: java.lang.String = null,
    setValue: /* value */ js.UndefOr[js.Any] => IMonth = null,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IMonthPicker = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (adjustYear != null) __obj.updateDynamic("adjustYear")(js.Any.fromFunction1(adjustYear))
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonthPicker]
  }
}

