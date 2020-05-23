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
    all: js.UndefOr[Double] = js.undefined,
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): QuietZone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuietZone]
  }
}

