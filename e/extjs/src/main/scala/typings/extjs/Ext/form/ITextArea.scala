package typings.extjs.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea
  extends typings.extjs.Ext.form.field.IText {
  /** [Config Option] (Number) */
  var cols: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enterIsSpecial: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  @JSName("getValue")
  var getValue_ITextArea: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var preventScrollbars: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var rows: js.UndefOr[Double] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object
  		* @returns Object The modified initial value
  		*/
  @JSName("transformOriginalValue")
  var transformOriginalValue_ITextArea: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: typings.extjs.Ext.form.field.IText = null,
    afterRender: () => Unit = null,
    autoSize: () => Unit = null,
    beforeDestroy: () => Unit = null,
    cols: Int | Double = null,
    componentLayout: js.Any = null,
    enterIsSpecial: js.UndefOr[Boolean] = js.undefined,
    getSubTplData: () => _ = null,
    getValue: () => _ = null,
    growAppend: java.lang.String = null,
    growMax: Int | Double = null,
    growMin: Int | Double = null,
    preventScrollbars: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    transformOriginalValue: /* value */ js.UndefOr[js.Any] => _ = null,
    transformRawValue: /* value */ js.UndefOr[js.Any] => _ = null,
    valueToRaw: /* value */ js.UndefOr[js.Any] => _ = null
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (autoSize != null) __obj.updateDynamic("autoSize")(js.Any.fromFunction0(autoSize))
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction0(beforeDestroy))
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (!js.isUndefined(enterIsSpecial)) __obj.updateDynamic("enterIsSpecial")(enterIsSpecial)
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(js.Any.fromFunction0(getSubTplData))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (growAppend != null) __obj.updateDynamic("growAppend")(growAppend)
    if (growMax != null) __obj.updateDynamic("growMax")(growMax.asInstanceOf[js.Any])
    if (growMin != null) __obj.updateDynamic("growMin")(growMin.asInstanceOf[js.Any])
    if (!js.isUndefined(preventScrollbars)) __obj.updateDynamic("preventScrollbars")(preventScrollbars)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1(transformOriginalValue))
    if (transformRawValue != null) __obj.updateDynamic("transformRawValue")(js.Any.fromFunction1(transformRawValue))
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(js.Any.fromFunction1(valueToRaw))
    __obj.asInstanceOf[ITextArea]
  }
}

