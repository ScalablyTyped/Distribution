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
    height: Int | Double = null,
    posx: Int | Double = null,
    posy: Int | Double = null,
    width: Int | Double = null
  ): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (posx != null) __obj.updateDynamic("posx")(posx.asInstanceOf[js.Any])
    if (posy != null) __obj.updateDynamic("posy")(posy.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteOptions]
  }
}

