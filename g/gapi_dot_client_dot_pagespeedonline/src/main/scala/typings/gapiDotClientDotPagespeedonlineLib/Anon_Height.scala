package typings
package gapiDotClientDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  /** The height of the rect. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The left coordinate of the rect, in page coordinates. */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** The top coordinate of the rect, in page coordinates. */
  var top: js.UndefOr[scala.Double] = js.undefined
  /** The width of the rect. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

