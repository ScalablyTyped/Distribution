package typings.gapiClientPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  /** The height of the rect. */
  var height: js.UndefOr[Double] = js.undefined
  /** The left coordinate of the rect, in page coordinates. */
  var left: js.UndefOr[Double] = js.undefined
  /** The top coordinate of the rect, in page coordinates. */
  var top: js.UndefOr[Double] = js.undefined
  /** The width of the rect. */
  var width: js.UndefOr[Double] = js.undefined
}

object Height {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

