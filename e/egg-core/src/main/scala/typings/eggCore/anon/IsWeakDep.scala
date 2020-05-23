package typings.eggCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsWeakDep extends js.Object {
  var isWeakDep: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object IsWeakDep {
  @scala.inline
  def apply(isWeakDep: js.UndefOr[Boolean] = js.undefined, timeout: js.UndefOr[Double] = js.undefined): IsWeakDep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isWeakDep)) __obj.updateDynamic("isWeakDep")(isWeakDep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsWeakDep]
  }
}

