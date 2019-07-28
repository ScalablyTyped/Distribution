package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuItem extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var handler: js.UndefOr[js.Function0[Unit] | String] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var submenu: js.UndefOr[js.Array[ContextMenuItem]] = js.undefined
}

object ContextMenuItem {
  @scala.inline
  def apply(
    `class`: String = null,
    handler: js.Function0[Unit] | String = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    submenu: js.Array[ContextMenuItem] = null
  ): ContextMenuItem = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (label != null) __obj.updateDynamic("label")(label)
    if (submenu != null) __obj.updateDynamic("submenu")(submenu)
    __obj.asInstanceOf[ContextMenuItem]
  }
}

