package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea
  extends extjsLib.ExtNs.formNs.fieldNs.IText {
  /** [Config Option] (Number) */
  var cols: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enterIsSpecial: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventScrollbars: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var rows: js.UndefOr[scala.Double] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: extjsLib.ExtNs.formNs.fieldNs.IText = null,
    afterRender: js.Function0[scala.Unit] = null,
    autoSize: js.Function0[scala.Unit] = null,
    beforeDestroy: js.Function0[scala.Unit] = null,
    cols: scala.Int | scala.Double = null,
    componentLayout: js.Any = null,
    enterIsSpecial: js.UndefOr[scala.Boolean] = js.undefined,
    getSubTplData: js.Function0[_] = null,
    getValue: js.Function0[_] = null,
    growAppend: java.lang.String = null,
    growMax: scala.Int | scala.Double = null,
    growMin: scala.Int | scala.Double = null,
    preventScrollbars: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    transformOriginalValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    transformRawValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    valueToRaw: js.Function1[/* value */ js.UndefOr[js.Any], _] = null
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (autoSize != null) __obj.updateDynamic("autoSize")(autoSize)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (!js.isUndefined(enterIsSpecial)) __obj.updateDynamic("enterIsSpecial")(enterIsSpecial)
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(getSubTplData)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (growAppend != null) __obj.updateDynamic("growAppend")(growAppend)
    if (growMax != null) __obj.updateDynamic("growMax")(growMax.asInstanceOf[js.Any])
    if (growMin != null) __obj.updateDynamic("growMin")(growMin.asInstanceOf[js.Any])
    if (!js.isUndefined(preventScrollbars)) __obj.updateDynamic("preventScrollbars")(preventScrollbars)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(transformOriginalValue)
    if (transformRawValue != null) __obj.updateDynamic("transformRawValue")(transformRawValue)
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(valueToRaw)
    __obj.asInstanceOf[ITextArea]
  }
}

