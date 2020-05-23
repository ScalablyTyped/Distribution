package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileMapOptions extends js.Object {
  var buffer: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var posx: js.UndefOr[Double] = js.undefined
  var posy: js.UndefOr[Double] = js.undefined
  var sizex: js.UndefOr[Double] = js.undefined
  var sizey: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TileMapOptions {
  @scala.inline
  def apply(
    buffer: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    posx: js.UndefOr[Double] = js.undefined,
    posy: js.UndefOr[Double] = js.undefined,
    sizex: js.UndefOr[Double] = js.undefined,
    sizey: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): TileMapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(posx)) __obj.updateDynamic("posx")(posx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(posy)) __obj.updateDynamic("posy")(posy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizex)) __obj.updateDynamic("sizex")(sizex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizey)) __obj.updateDynamic("sizey")(sizey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileMapOptions]
  }
}

