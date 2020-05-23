package typings.gestalt.mod

import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.down
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.up
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyoutProps extends js.Object {
  var anchor: js.Any
  var children: js.UndefOr[ReactNode] = js.undefined
  var color: js.UndefOr[blue | orange | red | white | darkGray] = js.undefined
  var idealDirection: js.UndefOr[up | right | down | left] = js.undefined
  var positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined
  var shouldFocus: js.UndefOr[Boolean] = js.undefined
  var showCaret: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl | Double] = js.undefined
   // ideally a HTMLAnchorElement
  def onDismiss(): Unit
}

object FlyoutProps {
  @scala.inline
  def apply(
    anchor: js.Any,
    onDismiss: () => Unit,
    children: ReactNode = null,
    color: blue | orange | red | white | darkGray = null,
    idealDirection: up | right | down | left = null,
    positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined,
    shouldFocus: js.UndefOr[Boolean] = js.undefined,
    showCaret: js.UndefOr[Boolean] = js.undefined,
    size: xs | sm | md | lg | xl | Double = null
  ): FlyoutProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (idealDirection != null) __obj.updateDynamic("idealDirection")(idealDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(positionRelativeToAnchor)) __obj.updateDynamic("positionRelativeToAnchor")(positionRelativeToAnchor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocus)) __obj.updateDynamic("shouldFocus")(shouldFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCaret)) __obj.updateDynamic("showCaret")(showCaret.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyoutProps]
  }
}

