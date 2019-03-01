package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var overflow: js.UndefOr[java.lang.String] = js.undefined
  var posx: js.UndefOr[scala.Double] = js.undefined
  var posy: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    overflow: java.lang.String = null,
    posx: scala.Int | scala.Double = null,
    posy: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (posx != null) __obj.updateDynamic("posx")(posx.asInstanceOf[js.Any])
    if (posy != null) __obj.updateDynamic("posy")(posy.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

