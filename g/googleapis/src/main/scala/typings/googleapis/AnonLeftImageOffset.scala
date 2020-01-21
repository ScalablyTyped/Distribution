package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLeftImageOffset extends js.Object {
  var leftImageOffset: js.UndefOr[Double] = js.native
  var topImageOffset: js.UndefOr[Double] = js.native
}

object AnonLeftImageOffset {
  @scala.inline
  def apply(leftImageOffset: Int | Double = null, topImageOffset: Int | Double = null): AnonLeftImageOffset = {
    val __obj = js.Dynamic.literal()
    if (leftImageOffset != null) __obj.updateDynamic("leftImageOffset")(leftImageOffset.asInstanceOf[js.Any])
    if (topImageOffset != null) __obj.updateDynamic("topImageOffset")(topImageOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeftImageOffset]
  }
}

