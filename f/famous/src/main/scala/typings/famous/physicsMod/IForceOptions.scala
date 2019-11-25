package typings.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IForceOptions extends js.Object {
  var targets: js.UndefOr[js.Array[_]] = js.undefined
}

object IForceOptions {
  @scala.inline
  def apply(targets: js.Array[_] = null): IForceOptions = {
    val __obj = js.Dynamic.literal()
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[IForceOptions]
  }
}

