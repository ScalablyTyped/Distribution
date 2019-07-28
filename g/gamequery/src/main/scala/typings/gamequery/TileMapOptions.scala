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
    buffer: Int | Double = null,
    height: Int | Double = null,
    posx: Int | Double = null,
    posy: Int | Double = null,
    sizex: Int | Double = null,
    sizey: Int | Double = null,
    width: Int | Double = null
  ): TileMapOptions = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (posx != null) __obj.updateDynamic("posx")(posx.asInstanceOf[js.Any])
    if (posy != null) __obj.updateDynamic("posy")(posy.asInstanceOf[js.Any])
    if (sizex != null) __obj.updateDynamic("sizex")(sizex.asInstanceOf[js.Any])
    if (sizey != null) __obj.updateDynamic("sizey")(sizey.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileMapOptions]
  }
}

