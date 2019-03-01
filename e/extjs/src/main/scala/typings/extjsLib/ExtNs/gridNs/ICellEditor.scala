package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditor
  extends extjsLib.ExtNs.IEditor

object ICellEditor {
  @scala.inline
  def apply(
    IEditor: extjsLib.ExtNs.IEditor = null,
    alignment: java.lang.String = null,
    cls: java.lang.String = null,
    hideEl: js.UndefOr[scala.Boolean] = js.undefined,
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

