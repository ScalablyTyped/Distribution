package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LeftImageOffset extends js.Object {
  var leftImageOffset: js.UndefOr[Double] = js.native
  var topImageOffset: js.UndefOr[Double] = js.native
}

object Anon_LeftImageOffset {
  @scala.inline
  def apply(leftImageOffset: Int | Double = null, topImageOffset: Int | Double = null): Anon_LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    if (leftImageOffset != null) __obj.updateDynamic("leftImageOffset")(leftImageOffset.asInstanceOf[js.Any])
    if (topImageOffset != null) __obj.updateDynamic("topImageOffset")(topImageOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LeftImageOffset]
  }
}

