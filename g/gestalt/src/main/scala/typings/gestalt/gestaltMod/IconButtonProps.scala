package typings.gestalt.gestaltMod

import typings.gestalt.Anon_Event
import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.lightGray
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.transparent
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: String
  var bgColor: js.UndefOr[transparent | lightGray | white] = js.undefined
  var icon: Icons
  var iconColor: js.UndefOr[blue | darkGray | gray | red | white] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ Anon_Event, Unit]] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    icon: Icons,
    accessibilityExpanded: js.UndefOr[Boolean] = js.undefined,
    accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined,
    bgColor: transparent | lightGray | white = null,
    iconColor: blue | darkGray | gray | red | white = null,
    onClick: /* args */ Anon_Event => Unit = null,
    size: xs | sm | md | lg | xl = null
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel, icon = icon)
    if (!js.isUndefined(accessibilityExpanded)) __obj.updateDynamic("accessibilityExpanded")(accessibilityExpanded)
    if (!js.isUndefined(accessibilityHaspopup)) __obj.updateDynamic("accessibilityHaspopup")(accessibilityHaspopup)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
}

