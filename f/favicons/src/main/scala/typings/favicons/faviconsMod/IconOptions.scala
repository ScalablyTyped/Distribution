package typings.favicons.faviconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOptions extends js.Object {
  var background: js.UndefOr[Boolean | String] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var ovelayShadow: js.UndefOr[Boolean] = js.undefined
  var overlayGlow: js.UndefOr[Boolean] = js.undefined
}

object IconOptions {
  @scala.inline
  def apply(
    background: Boolean | String = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    ovelayShadow: js.UndefOr[Boolean] = js.undefined,
    overlayGlow: js.UndefOr[Boolean] = js.undefined
  ): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(ovelayShadow)) __obj.updateDynamic("ovelayShadow")(ovelayShadow.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayGlow)) __obj.updateDynamic("overlayGlow")(overlayGlow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
}

