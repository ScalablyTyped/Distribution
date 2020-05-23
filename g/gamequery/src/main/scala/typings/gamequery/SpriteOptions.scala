package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteOptions extends js.Object {
  var animation: js.UndefOr[js.Any] = js.undefined
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var posx: js.UndefOr[Double] = js.undefined
  var posy: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SpriteOptions {
  @scala.inline
  def apply(
    animation: js.Any = null,
    callback: () => _ = null,
    height: js.UndefOr[Double] = js.undefined,
    posx: js.UndefOr[Double] = js.undefined,
    posy: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(posx)) __obj.updateDynamic("posx")(posx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(posy)) __obj.updateDynamic("posy")(posy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteOptions]
  }
}

