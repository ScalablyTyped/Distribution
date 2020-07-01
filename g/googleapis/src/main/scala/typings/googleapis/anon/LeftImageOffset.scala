package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftImageOffset extends js.Object {
  var leftImageOffset: js.UndefOr[Double] = js.native
  var topImageOffset: js.UndefOr[Double] = js.native
}

object LeftImageOffset {
  @scala.inline
  def apply(
    leftImageOffset: js.UndefOr[Double] = js.undefined,
    topImageOffset: js.UndefOr[Double] = js.undefined
  ): LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leftImageOffset)) __obj.updateDynamic("leftImageOffset")(leftImageOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topImageOffset)) __obj.updateDynamic("topImageOffset")(topImageOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftImageOffset]
  }
}

