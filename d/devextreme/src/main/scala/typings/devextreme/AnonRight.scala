package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRight extends js.Object {
  var left: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
}

object AnonRight {
  @scala.inline
  def apply(left: Int | Double = null, right: Int | Double = null): AnonRight = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRight]
  }
}

