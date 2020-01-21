package typings.ejWebAll.ej.datavisualization.Barcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuietZone extends js.Object {
  /** Specifies the quiet zone around the Barcode.
    */
  var all: js.UndefOr[Double] = js.undefined
  /** Specifies the bottom quiet zone of the Barcode.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /** Specifies the left quiet zone of the Barcode.
    */
  var left: js.UndefOr[Double] = js.undefined
  /** Specifies the right quiet zone of the Barcode.
    */
  var right: js.UndefOr[Double] = js.undefined
  /** Specifies the top quiet zone of the Barcode.
    */
  var top: js.UndefOr[Double] = js.undefined
}

object QuietZone {
  @scala.inline
  def apply(
    all: Int | Double = null,
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): QuietZone = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuietZone]
  }
}

