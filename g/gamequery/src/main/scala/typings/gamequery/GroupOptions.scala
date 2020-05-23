package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var overflow: js.UndefOr[String] = js.undefined
  var posx: js.UndefOr[Double] = js.undefined
  var posy: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    overflow: String = null,
    posx: js.UndefOr[Double] = js.undefined,
    posy: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(posx)) __obj.updateDynamic("posx")(posx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(posy)) __obj.updateDynamic("posy")(posy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

