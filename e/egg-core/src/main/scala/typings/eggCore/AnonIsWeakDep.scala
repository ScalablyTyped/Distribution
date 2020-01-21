package typings.eggCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsWeakDep extends js.Object {
  var isWeakDep: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonIsWeakDep {
  @scala.inline
  def apply(isWeakDep: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): AnonIsWeakDep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isWeakDep)) __obj.updateDynamic("isWeakDep")(isWeakDep.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsWeakDep]
  }
}

