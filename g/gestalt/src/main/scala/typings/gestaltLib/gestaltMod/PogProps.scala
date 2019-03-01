package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PogProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var bgColor: js.UndefOr[
    gestaltLib.gestaltLibStrings.transparent | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var hovered: js.UndefOr[scala.Boolean] = js.undefined
  var icon: Icons
  var iconColor: js.UndefOr[
    gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl
  ] = js.undefined
}

object PogProps {
  @scala.inline
  def apply(
    icon: Icons,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    bgColor: gestaltLib.gestaltLibStrings.transparent | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.white = null,
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    hovered: js.UndefOr[scala.Boolean] = js.undefined,
    iconColor: gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.white = null,
    size: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null
  ): PogProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (!js.isUndefined(hovered)) __obj.updateDynamic("hovered")(hovered)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PogProps]
  }
}

