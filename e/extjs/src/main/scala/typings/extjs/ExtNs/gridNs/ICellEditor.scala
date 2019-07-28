package typings.extjs.ExtNs.gridNs

import typings.extjs.ExtNs.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditor extends IEditor

object ICellEditor {
  @scala.inline
  def apply(
    IEditor: IEditor = null,
    alignment: java.lang.String = null,
    cls: java.lang.String = null,
    hideEl: js.UndefOr[Boolean] = js.undefined,
    shadow: js.Any = null
  ): ICellEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IEditor)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (!js.isUndefined(hideEl)) __obj.updateDynamic("hideEl")(hideEl)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    __obj.asInstanceOf[ICellEditor]
  }
}

