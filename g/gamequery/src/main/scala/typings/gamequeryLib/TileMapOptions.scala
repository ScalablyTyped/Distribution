package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileMapOptions extends js.Object {
  var buffer: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var posx: js.UndefOr[scala.Double] = js.undefined
  var posy: js.UndefOr[scala.Double] = js.undefined
  var sizex: js.UndefOr[scala.Double] = js.undefined
  var sizey: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TileMapOptions {
  @scala.inline
  def apply(
    buffer: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    posx: scala.Int | scala.Double = null,
    posy: scala.Int | scala.Double = null,
    sizex: scala.Int | scala.Double = null,
    sizey: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

