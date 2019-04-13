package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuItem extends js.Object {
  var handler: js.UndefOr[js.Function0[scala.Unit] | java.lang.String] = js.undefined
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var submenu: js.UndefOr[js.Array[ContextMenuItem]] = js.undefined
}

object ContextMenuItem {
  @scala.inline
  def apply(
    handler: js.Function0[scala.Unit] | java.lang.String = null,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    submenu: js.Array[ContextMenuItem] = null
  ): ContextMenuItem = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (label != null) __obj.updateDynamic("label")(label)
    if (submenu != null) __obj.updateDynamic("submenu")(submenu)
    __obj.asInstanceOf[ContextMenuItem]
  }
}

