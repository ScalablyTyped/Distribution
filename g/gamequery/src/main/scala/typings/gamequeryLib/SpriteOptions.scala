package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteOptions extends js.Object {
  var animation: js.UndefOr[js.Any] = js.undefined
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var posx: js.UndefOr[scala.Double] = js.undefined
  var posy: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SpriteOptions {
  @scala.inline
  def apply(
    animation: js.Any = null,
    callback: js.Function0[_] = null,
    height: scala.Int | scala.Double = null,
    posx: scala.Int | scala.Double = null,
    posy: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (posx != null) __obj.updateDynamic("posx")(posx.asInstanceOf[js.Any])
    if (posy != null) __obj.updateDynamic("posy")(posy.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteOptions]
  }
}

