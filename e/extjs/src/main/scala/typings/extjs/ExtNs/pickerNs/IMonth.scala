package typings.extjs.ExtNs.pickerNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonth extends IComponent {
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
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Date/Number[]) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IMonth {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    adjustYear: /* offset */ js.UndefOr[Double] => Unit = null,
    baseCls: java.lang.String = null,
    cancelText: java.lang.String = null,
    getValue: () => Array = null,
    hasSelection: () => Boolean = null,
    okText: java.lang.String = null,
    onDestroy: () => Unit = null,
    renderTpl: js.Any = null,
    selectedCls: java.lang.String = null,
    setValue: /* value */ js.UndefOr[js.Any] => IMonth = null,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IMonth = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (adjustYear != null) __obj.updateDynamic("adjustYear")(js.Any.fromFunction1(adjustYear))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (okText != null) __obj.updateDynamic("okText")(okText)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls)
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IMonth]
  }
}

