package typings.gestalt.mod

import typings.gestalt.gestaltStrings.down
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.up
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var children: ReactNode
  var idealDirection: js.UndefOr[up | right | down | left] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var link: js.UndefOr[ReactNode] = js.undefined
  var text: String
}

object TooltipProps {
  @scala.inline
  def apply(
    text: String,
    children: ReactNode = null,
    idealDirection: up | right | down | left = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    link: ReactNode = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (idealDirection != null) __obj.updateDynamic("idealDirection")(idealDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

