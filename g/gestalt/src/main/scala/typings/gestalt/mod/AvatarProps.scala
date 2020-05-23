package typings.gestalt.mod

import typings.gestalt.gestaltStrings.`check-circle`
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.pintrest
import typings.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var icon: js.UndefOr[`check-circle` | pintrest] = js.undefined
  var name: String
  var outline: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[sm | md | lg] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var verified: js.UndefOr[Boolean] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    name: String,
    icon: `check-circle` | pintrest = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    size: sm | md | lg = null,
    src: String = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): AvatarProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
}

