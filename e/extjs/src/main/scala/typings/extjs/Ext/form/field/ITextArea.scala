package typings.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea extends IText {
  /** [Config Option] (Number) */
  var cols: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enterIsSpecial: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventScrollbars: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var rows: js.UndefOr[Double] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: IText = null,
    cols: js.UndefOr[Double] = js.undefined,
    enterIsSpecial: js.UndefOr[Boolean] = js.undefined,
    preventScrollbars: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enterIsSpecial)) __obj.updateDynamic("enterIsSpecial")(enterIsSpecial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventScrollbars)) __obj.updateDynamic("preventScrollbars")(preventScrollbars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextArea]
  }
}

