package typings.favicons.mod

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
    offset: js.UndefOr[Double] = js.undefined,
    ovelayShadow: js.UndefOr[Boolean] = js.undefined,
    overlayGlow: js.UndefOr[Boolean] = js.undefined
  ): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ovelayShadow)) __obj.updateDynamic("ovelayShadow")(ovelayShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayGlow)) __obj.updateDynamic("overlayGlow")(overlayGlow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
}

