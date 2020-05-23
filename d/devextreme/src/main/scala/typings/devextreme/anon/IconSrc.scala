package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSrc extends js.Object {
  var iconSrc: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[js.Any | String | js.Array[Double]] = js.undefined
  var onClick: js.UndefOr[js.Function] = js.undefined
  var tooltip: js.UndefOr[String | IsShown] = js.undefined
}

object IconSrc {
  @scala.inline
  def apply(
    iconSrc: String = null,
    location: js.Any | String | js.Array[Double] = null,
    onClick: js.Function = null,
    tooltip: String | IsShown = null
  ): IconSrc = {
    val __obj = js.Dynamic.literal()
    if (iconSrc != null) __obj.updateDynamic("iconSrc")(iconSrc.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSrc]
  }
}

