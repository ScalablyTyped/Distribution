package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var accessibilityHaspopup: js.UndefOr[scala.Boolean] = js.undefined
  var accessibilityLabel: java.lang.String
  var bgColor: js.UndefOr[
    gestaltLib.gestaltLibStrings.transparent | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var icon: Icons
  var iconColor: js.UndefOr[
    gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_Event, scala.Unit]] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl
  ] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    accessibilityLabel: java.lang.String,
    icon: Icons,
    accessibilityExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHaspopup: js.UndefOr[scala.Boolean] = js.undefined,
    bgColor: gestaltLib.gestaltLibStrings.transparent | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.white = null,
    iconColor: gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.white = null,
    onClick: js.Function1[/* args */ gestaltLib.Anon_Event, scala.Unit] = null,
    size: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(accessibilityExpanded)) __obj.updateDynamic("accessibilityExpanded")(accessibilityExpanded)
    if (!js.isUndefined(accessibilityHaspopup)) __obj.updateDynamic("accessibilityHaspopup")(accessibilityHaspopup)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
}

